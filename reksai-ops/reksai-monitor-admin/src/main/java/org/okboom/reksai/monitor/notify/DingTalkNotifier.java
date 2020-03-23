package org.okboom.reksai.monitor.notify;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.notify.AbstractStatusChangeNotifier;
import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.Expression;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * 钉钉webhook通知
 * @author tookbra
 */
public class DingTalkNotifier extends AbstractStatusChangeNotifier {

    private static final String DEFAULT_MESSAGE = "<strong>#{instance.registration.name}</strong>/#{instance.id} is <strong>#{event.statusInfo.status}</strong>";

    private final SpelExpressionParser parser = new SpelExpressionParser();
    private RestTemplate restTemplate = new RestTemplate();;
    private Expression message;

    private String authToken;
    private String [] atMobiles;
    private boolean isAtAll;

    private static final String MSG_TYPE = "markdown";

    public DingTalkNotifier(InstanceRepository repository) {
        super(repository);
        this.message = parser.parseExpression(DEFAULT_MESSAGE, ParserContext.TEMPLATE_EXPRESSION);
    }

    @Override
    protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
        return Mono
                .fromRunnable(() -> restTemplate.postForEntity(getAuthToken(), createMessage(event, instance), Void.class));
    }

    private Map<String, Object> createMessage(InstanceEvent event, Instance instance) {
        Map<String, Object> parameters = new HashMap<>(3);
        parameters.put("msgtype", MSG_TYPE);
        parameters.put("markdown", createMarkdown(event, instance));
        parameters.put("at", createAt());
        return parameters;
    }

    private Map<String, Object> createMarkdown(InstanceEvent event, Instance instance) {
        Map<String, Object> parameters = new HashMap<>(2);
        parameters.put("title", "服务告警");
        parameters.put("text", getText(event, instance));
        return parameters;
    }

    private Map<String, Object> createAt() {
        Map<String, Object> parameters = new HashMap<>(2);
        parameters.put("isAtAll", getIsAtAll());
        parameters.put("atMobiles", atMobiles);
        return parameters;
    }

    protected String getText(InstanceEvent event, Instance instance) {
        Map<String, Object> root = new HashMap<>();
        root.put("event", event);
        root.put("instance", instance);
        root.put("lastStatus", getLastStatus(event.getInstance()));
        StandardEvaluationContext context = new StandardEvaluationContext(root);
        context.addPropertyAccessor(new MapAccessor());
        return message.getValue(context, String.class);
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String [] getAtMobiles() {
        return atMobiles;
    }

    public void setAtMobiles(String [] atMobiles) {
        this.atMobiles = atMobiles;
    }

    public boolean getIsAtAll() {
        return isAtAll;
    }

    public void setIsAtAll(boolean atAll) {
        isAtAll = atAll;
    }
}
