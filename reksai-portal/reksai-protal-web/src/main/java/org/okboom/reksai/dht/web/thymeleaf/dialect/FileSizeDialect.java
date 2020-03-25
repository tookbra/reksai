package org.okboom.reksai.dht.web.thymeleaf.dialect;

import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;


/**
 * @author tookbra
 */
public class FileSizeDialect implements IExpressionObjectDialect {


    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return new FileSizeExpressionFactory();
    }

    @Override
    public String getName() {
        return "FileSize";
    }
}
