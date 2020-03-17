// $ANTLR 2.7.4: "htmlentitydecoder.g" -> "HtmlEntityDecoder.java"$

package info.monitorenter.unicode.decoder.html;

import antlr.*;
import antlr.collections.impl.BitSet;

import java.io.IOException;

public class HtmlEntityDecoder extends LLkParser implements HtmlEntityDecoderTokenTypes {

    /**
     * Flag to remember if a character entity reference
     * may be contained in the decoded result so far.<p>
     */
    private boolean m_potentialRemainingEntity = false;

    /**
     * Decodes the given html input by replacing the character
     * entity references (named and numeric) by the unicode character
     * codes.
     * <p>
     * The result is written to the output stream.
     * If &amp;amp; was found true is returned because the decoded
     * output then could contain a new character entity reference.
     *
     * @return true if &amp;amp; was found thus the result could
     * contain a new character entity reference.
     */
    public boolean isPotentialRemainingEntity() {
        return this.m_potentialRemainingEntity;
    }

    protected HtmlEntityDecoder(TokenBuffer tokenBuf, int k) {
        super(tokenBuf, k);
        tokenNames = _tokenNames;
    }

    public HtmlEntityDecoder(TokenBuffer tokenBuf) {
        this(tokenBuf, 1);
    }

    protected HtmlEntityDecoder(TokenStream lexer, int k) {
        super(lexer, k);
        tokenNames = _tokenNames;
    }

    public HtmlEntityDecoder(TokenStream lexer) {
        this(lexer, 1);
    }

    public HtmlEntityDecoder(ParserSharedInputState state) {
        super(state, 1);
        tokenNames = _tokenNames;
    }

    /**
     * Decodes the next <code>{@link Token}</code>
     * with the decoded text.
     * <p>
     *
     * @return the next <code>{@link Token}</code>
     * with the decoded text.
     */
    public final Token decodeNext(

    ) throws RecognitionException, TokenStreamException, IOException {
        Token token;

        Token token000 = null;
        Token token001 = null;
        Token token002 = null;
        Token token003 = null;
        Token token004 = null;
        Token token005 = null;
        Token token006 = null;
        Token token007 = null;
        Token token008 = null;
        Token token009 = null;
        Token token010 = null;
        Token token011 = null;
        Token token012 = null;
        Token token013 = null;
        Token token014 = null;
        Token token015 = null;
        Token token016 = null;
        Token token017 = null;
        Token token018 = null;
        Token token019 = null;
        Token token020 = null;
        Token token021 = null;
        Token token022 = null;
        Token token023 = null;
        Token token024 = null;
        Token token025 = null;
        Token token026 = null;
        Token token027 = null;
        Token token028 = null;
        Token token029 = null;
        Token token030 = null;
        Token token031 = null;
        Token token032 = null;
        Token token033 = null;
        Token token034 = null;
        Token token035 = null;
        Token token036 = null;
        Token token037 = null;
        Token token038 = null;
        Token token039 = null;
        Token token040 = null;
        Token token041 = null;
        Token tokenEcirc = null;
        Token token042 = null;
        Token token043 = null;
        Token token044 = null;
        Token token045 = null;
        Token token046 = null;
        Token token047 = null;
        Token token048 = null;
        Token token049 = null;
        Token token050 = null;
        Token token051 = null;
        Token token052 = null;
        Token token053 = null;
        Token token054 = null;
        Token token055 = null;
        Token token056 = null;
        Token token057 = null;
        Token token058 = null;
        Token token059 = null;
        Token token060 = null;
        Token token061 = null;
        Token token062 = null;
        Token token063 = null;
        Token token064 = null;
        Token token065 = null;
        Token token066 = null;
        Token token067 = null;
        Token token068 = null;
        Token token069 = null;
        Token token070 = null;
        Token token071 = null;
        Token token072 = null;
        Token token073 = null;
        Token token074 = null;
        Token token075 = null;
        Token token076 = null;
        Token token077 = null;
        Token token078 = null;
        Token token079 = null;
        Token token080 = null;
        Token token081 = null;
        Token token082 = null;
        Token token083 = null;
        Token token084 = null;
        Token token085 = null;
        Token token086 = null;
        Token token087 = null;
        Token token088 = null;
        Token token089 = null;
        Token token090 = null;
        Token token091 = null;
        Token token092 = null;
        Token token093 = null;
        Token token094 = null;
        Token token095 = null;
        Token token096 = null;
        Token token097 = null;
        Token token098 = null;
        Token token099 = null;
        Token token100 = null;
        Token token101 = null;
        Token token102 = null;
        Token token103 = null;
        Token token104 = null;
        Token token105 = null;
        Token token106 = null;
        Token token107 = null;
        Token token108 = null;
        Token token109 = null;
        Token token110 = null;
        Token token111 = null;
        Token token112 = null;
        Token token113 = null;
        Token token114 = null;
        Token token115 = null;
        Token token116 = null;
        Token token117 = null;
        Token token118 = null;
        Token token119 = null;
        Token token120 = null;
        Token token121 = null;
        Token token122 = null;
        Token token123 = null;
        Token token124 = null;
        Token token125 = null;
        Token token126 = null;
        Token token127 = null;
        Token token128 = null;
        Token token129 = null;
        Token token130 = null;
        Token token131 = null;
        Token token132 = null;
        Token token133 = null;
        Token token134 = null;
        Token token135 = null;
        Token token136 = null;
        Token token137 = null;
        Token token138 = null;
        Token token139 = null;
        Token token140 = null;
        Token token141 = null;
        Token token142 = null;
        Token token143 = null;
        Token token144 = null;
        Token token145 = null;
        Token token146 = null;
        Token token147 = null;
        Token token148 = null;
        Token token149 = null;
        Token token150 = null;
        Token token151 = null;
        Token token152 = null;
        Token token153 = null;
        Token token154 = null;
        Token token155 = null;
        Token token156 = null;
        Token token157 = null;
        Token token158 = null;
        Token token159 = null;
        Token token160 = null;
        Token token161 = null;
        Token token162 = null;
        Token token163 = null;
        Token token164 = null;
        Token token165 = null;
        Token token166 = null;
        Token token167 = null;
        Token token168 = null;
        Token token169 = null;
        Token token170 = null;
        Token token171 = null;
        Token token172 = null;
        Token token173 = null;
        Token token174 = null;
        Token token175 = null;
        Token token176 = null;
        Token token177 = null;
        Token token178 = null;
        Token token179 = null;
        Token token180 = null;
        Token token181 = null;
        Token token182 = null;
        Token token183 = null;
        Token token184 = null;
        Token token185 = null;
        Token token186 = null;
        Token token187 = null;
        Token token188 = null;
        Token token189 = null;
        Token token190 = null;
        Token token191 = null;
        Token token192 = null;
        Token token193 = null;
        Token token194 = null;
        Token token195 = null;
        Token token196 = null;
        Token token197 = null;
        Token token198 = null;
        Token token199 = null;
        Token token200 = null;
        Token token201 = null;
        Token token202 = null;
        Token token203 = null;
        Token token204 = null;
        Token token205 = null;
        Token token206 = null;
        Token token207 = null;
        Token token208 = null;
        Token token209 = null;
        Token token210 = null;
        Token token211 = null;
        Token token212 = null;
        Token token213 = null;
        Token token214 = null;
        Token token215 = null;
        Token token216 = null;
        Token token217 = null;
        Token token218 = null;
        Token token219 = null;
        Token token220 = null;
        Token token221 = null;
        Token token222 = null;
        Token token223 = null;
        Token token224 = null;
        Token token225 = null;
        Token token226 = null;
        Token token227 = null;
        Token token228 = null;
        Token token229 = null;
        Token token230 = null;
        Token token231 = null;
        Token token232 = null;
        Token token233 = null;
        Token token234 = null;
        Token token235 = null;
        Token token236 = null;
        Token token237 = null;
        Token token238 = null;
        Token token239 = null;
        Token token240 = null;
        Token token241 = null;
        Token token242 = null;
        Token token243 = null;
        Token token244 = null;
        Token token245 = null;
        Token token246 = null;
        Token token247 = null;
        Token token248 = null;
        Token token249 = null;
        Token token250 = null;
        Token token251 = null;
        Token token252 = null;
        Token token253 = null;

        token = null;


        try {      // for error handling
            switch (LA(1)) {
                case NBSP: {
                    token000 = LT(1);
                    match(NBSP);

                    // \u00A0 could be an alternative?
                    token000.setText(" ");
                    token = token000;

                    break;
                }
                case IEXCL: {
                    token001 = LT(1);
                    match(IEXCL);

                    token001.setText(String.valueOf('\u00A1'));
                    token = token001;

                    break;
                }
                case CENT: {
                    token002 = LT(1);
                    match(CENT);

                    token002.setText(String.valueOf('\u00A2'));
                    token = token002;

                    break;
                }
                case POUND: {
                    token003 = LT(1);
                    match(POUND);

                    token003.setText(String.valueOf('\u00A3'));
                    token = token003;

                    break;
                }
                case CURREN: {
                    token004 = LT(1);
                    match(CURREN);

                    token004.setText(String.valueOf('\u00A4'));
                    token = token004;

                    break;
                }
                case YEN: {
                    token005 = LT(1);
                    match(YEN);

                    token005.setText(String.valueOf('\u00A5'));
                    token = token005;

                    break;
                }
                case BRVBAR: {
                    token006 = LT(1);
                    match(BRVBAR);

                    token006.setText(String.valueOf('\u00A6'));
                    token = token006;

                    break;
                }
                case SECT: {
                    token007 = LT(1);
                    match(SECT);

                    token007.setText(String.valueOf('\u00A7'));
                    token = token007;

                    break;
                }
                case UML: {
                    token008 = LT(1);
                    match(UML);

                    token008.setText(String.valueOf('\u00A8'));
                    token = token008;

                    break;
                }
                case COPY: {
                    token009 = LT(1);
                    match(COPY);

                    token009.setText(String.valueOf('\u00A9'));
                    token = token009;

                    break;
                }
                case ORDF: {
                    token010 = LT(1);
                    match(ORDF);

                    token010.setText(String.valueOf('\u00AA'));
                    token = token010;

                    break;
                }
                case LAQUO: {
                    token011 = LT(1);
                    match(LAQUO);

                    token011.setText(String.valueOf('\u00AB'));
                    token = token011;

                    break;
                }
                case NOT: {
                    token012 = LT(1);
                    match(NOT);

                    token012.setText(String.valueOf('\u00AC'));
                    token = token012;

                    break;
                }
                case SHY: {
                    token013 = LT(1);
                    match(SHY);

                    token013.setText(String.valueOf('\u00AD'));
                    token = token013;

                    break;
                }
                case REG: {
                    token014 = LT(1);
                    match(REG);

                    token014.setText(String.valueOf('\u00AE'));
                    token = token014;

                    break;
                }
                case MACR: {
                    token015 = LT(1);
                    match(MACR);

                    token015.setText(String.valueOf('\u00AF'));
                    token = token015;

                    break;
                }
                case DEG: {
                    token016 = LT(1);
                    match(DEG);

                    token016.setText(String.valueOf('\u00B0'));
                    token = token016;

                    break;
                }
                case PLUSMN: {
                    token017 = LT(1);
                    match(PLUSMN);

                    token017.setText(String.valueOf('\u00B1'));
                    token = token017;

                    break;
                }
                case SUP2: {
                    token018 = LT(1);
                    match(SUP2);

                    token018.setText(String.valueOf('\u00B2'));
                    token = token018;

                    break;
                }
                case SUP3: {
                    token019 = LT(1);
                    match(SUP3);

                    token019.setText(String.valueOf('\u00B3'));
                    token = token019;

                    break;
                }
                case ACUTE: {
                    token020 = LT(1);
                    match(ACUTE);

                    token020.setText(String.valueOf('\u00B4'));
                    token = token020;

                    break;
                }
                case MICRO: {
                    token021 = LT(1);
                    match(MICRO);

                    token021.setText(String.valueOf('\u00B5'));
                    token = token021;

                    break;
                }
                case PARA: {
                    token022 = LT(1);
                    match(PARA);

                    token022.setText(String.valueOf('\u00B6'));
                    token = token022;

                    break;
                }
                case MIDDOT: {
                    token023 = LT(1);
                    match(MIDDOT);

                    token023.setText(String.valueOf('\u00B7'));
                    token = token023;

                    break;
                }
                case CEDIL: {
                    token024 = LT(1);
                    match(CEDIL);

                    token024.setText(String.valueOf('\u00B8'));
                    token = token024;

                    break;
                }
                case SUP1: {
                    token025 = LT(1);
                    match(SUP1);

                    token025.setText(String.valueOf('\u00B9'));
                    token = token025;

                    break;
                }
                case ORDM: {
                    token026 = LT(1);
                    match(ORDM);

                    token026.setText(String.valueOf('\u00BA'));
                    token = token026;

                    break;
                }
                case RAQUO: {
                    token027 = LT(1);
                    match(RAQUO);

                    token027.setText(String.valueOf('\u00BB'));
                    token = token027;

                    break;
                }
                case FRAC14: {
                    token028 = LT(1);
                    match(FRAC14);

                    token028.setText(String.valueOf('\u00BC'));
                    token = token028;

                    break;
                }
                case FRAC12: {
                    token029 = LT(1);
                    match(FRAC12);

                    token029.setText(String.valueOf('\u00BD'));
                    token = token029;

                    break;
                }
                case FRAC34: {
                    token030 = LT(1);
                    match(FRAC34);

                    token030.setText(String.valueOf('\u00BE'));
                    token = token030;

                    break;
                }
                case IQUEST: {
                    token031 = LT(1);
                    match(IQUEST);

                    token031.setText(String.valueOf('\u00BF'));
                    token = token031;

                    break;
                }
                case AGRAVE: {
                    token032 = LT(1);
                    match(AGRAVE);

                    token032.setText(String.valueOf('\u00C0'));
                    token = token032;

                    break;
                }
                case AACUTE: {
                    token033 = LT(1);
                    match(AACUTE);

                    token033.setText(String.valueOf('\u00C1'));
                    token = token033;

                    break;
                }
                case ACIRC: {
                    token034 = LT(1);
                    match(ACIRC);

                    token034.setText(String.valueOf('\u00C2'));
                    token = token034;

                    break;
                }
                case ATILDE: {
                    token035 = LT(1);
                    match(ATILDE);

                    token035.setText(String.valueOf('\u00C3'));
                    token = token035;

                    break;
                }
                case AUML: {
                    token036 = LT(1);
                    match(AUML);

                    token036.setText(String.valueOf('\u00C4'));
                    token = token036;

                    break;
                }
                case ARING: {
                    token037 = LT(1);
                    match(ARING);

                    token037.setText(String.valueOf('\u00C5'));
                    token = token037;

                    break;
                }
                case AELIG: {
                    token038 = LT(1);
                    match(AELIG);

                    token038.setText(String.valueOf('\u00C6'));
                    token = token038;

                    break;
                }
                case CCEDIL: {
                    token039 = LT(1);
                    match(CCEDIL);

                    token039.setText(String.valueOf('\u00C7'));
                    token = token039;

                    break;
                }
                case EGRAVE: {
                    token040 = LT(1);
                    match(EGRAVE);

                    token040.setText(String.valueOf('\u00C8'));
                    token = token040;

                    break;
                }
                case EACUTE: {
                    token041 = LT(1);
                    match(EACUTE);

                    token041.setText(String.valueOf('\u00C9'));
                    token = token041;

                    break;
                }
                case ECIRC: {
                    tokenEcirc = LT(1);
                    match(ECIRC);

                    tokenEcirc.setText(String.valueOf('\u00CA'));
                    token = tokenEcirc;

                    break;
                }
                case EUML: {
                    token042 = LT(1);
                    match(EUML);

                    token042.setText(String.valueOf('\u00CB'));
                    token = token042;

                    break;
                }
                case IGRAVE: {
                    token043 = LT(1);
                    match(IGRAVE);

                    token043.setText(String.valueOf('\u00CC'));
                    token = token043;

                    break;
                }
                case IACUTE: {
                    token044 = LT(1);
                    match(IACUTE);

                    token044.setText(String.valueOf('\u00CD'));
                    token = token044;

                    break;
                }
                case ICIRC: {
                    token045 = LT(1);
                    match(ICIRC);

                    token045.setText(String.valueOf('\u00CE'));
                    token = token045;

                    break;
                }
                case IUML: {
                    token046 = LT(1);
                    match(IUML);

                    token046.setText(String.valueOf('\u00CF'));
                    token = token046;

                    break;
                }
                case ETH: {
                    token047 = LT(1);
                    match(ETH);

                    token047.setText(String.valueOf('\u00D0'));
                    token = token047;

                    break;
                }
                case NTILDE: {
                    token048 = LT(1);
                    match(NTILDE);

                    token048.setText(String.valueOf('\u00D1'));
                    token = token048;

                    break;
                }
                case OGRAVE: {
                    token049 = LT(1);
                    match(OGRAVE);

                    token049.setText(String.valueOf('\u00D2'));
                    token = token049;

                    break;
                }
                case OACUTE: {
                    token050 = LT(1);
                    match(OACUTE);

                    token050.setText(String.valueOf('\u00D3'));
                    token = token050;

                    break;
                }
                case OCIRC: {
                    token051 = LT(1);
                    match(OCIRC);

                    token051.setText(String.valueOf('\u00D4'));
                    token = token051;

                    break;
                }
                case OTILDE: {
                    token052 = LT(1);
                    match(OTILDE);

                    token052.setText(String.valueOf('\u00D5'));
                    token = token052;

                    break;
                }
                case OUML: {
                    token053 = LT(1);
                    match(OUML);

                    token053.setText(String.valueOf('\u00D6'));
                    token = token053;

                    break;
                }
                case TIMES: {
                    token054 = LT(1);
                    match(TIMES);

                    token054.setText(String.valueOf('\u00D7'));
                    token = token054;

                    break;
                }
                case OSLASH: {
                    token055 = LT(1);
                    match(OSLASH);

                    token055.setText(String.valueOf('\u00D8'));
                    token = token055;

                    break;
                }
                case UGRAVE: {
                    token056 = LT(1);
                    match(UGRAVE);

                    token056.setText(String.valueOf('\u00D9'));
                    token = token056;

                    break;
                }
                case UACUTE: {
                    token057 = LT(1);
                    match(UACUTE);

                    token057.setText(String.valueOf('\u00DA'));
                    token = token057;

                    break;
                }
                case UCIRC: {
                    token058 = LT(1);
                    match(UCIRC);

                    token058.setText(String.valueOf('\u00DB'));
                    token = token058;

                    break;
                }
                case UUML: {
                    token059 = LT(1);
                    match(UUML);

                    token059.setText(String.valueOf('\u00DC'));
                    token = token059;

                    break;
                }
                case YACUTE: {
                    token060 = LT(1);
                    match(YACUTE);

                    token060.setText(String.valueOf('\u00DD'));
                    token = token060;

                    break;
                }
                case THORN: {
                    token061 = LT(1);
                    match(THORN);

                    token061.setText(String.valueOf('\u00DE'));
                    token = token061;

                    break;
                }
                case SZLIG: {
                    token062 = LT(1);
                    match(SZLIG);

                    token062.setText(String.valueOf('\u00DF'));
                    token = token062;

                    break;
                }
                case AGRAVE_LC: {
                    token063 = LT(1);
                    match(AGRAVE_LC);

                    token063.setText(String.valueOf('\u00E0'));
                    token = token063;

                    break;
                }
                case AACUTE_LC: {
                    token064 = LT(1);
                    match(AACUTE_LC);

                    token064.setText(String.valueOf('\u00E1'));
                    token = token064;

                    break;
                }
                case ACIRC_LC: {
                    token065 = LT(1);
                    match(ACIRC_LC);

                    token065.setText(String.valueOf('\u00E2'));
                    token = token065;

                    break;
                }
                case ATILDE_LC: {
                    token066 = LT(1);
                    match(ATILDE_LC);

                    token066.setText(String.valueOf('\u00E3'));
                    token = token066;

                    break;
                }
                case AUML_LC: {
                    token067 = LT(1);
                    match(AUML_LC);

                    token067.setText(String.valueOf('\u00E4'));
                    token = token067;

                    break;
                }
                case ARING_LC: {
                    token068 = LT(1);
                    match(ARING_LC);

                    token068.setText(String.valueOf('\u00E5'));
                    token = token068;

                    break;
                }
                case AELIG_LC: {
                    token069 = LT(1);
                    match(AELIG_LC);

                    token069.setText(String.valueOf('\u00E6'));
                    token = token069;

                    break;
                }
                case CCEDIL_LC: {
                    token070 = LT(1);
                    match(CCEDIL_LC);

                    token070.setText(String.valueOf('\u00E7'));
                    token = token070;

                    break;
                }
                case EGRAVE_LC: {
                    token071 = LT(1);
                    match(EGRAVE_LC);

                    token071.setText(String.valueOf('\u00E8'));
                    token = token071;

                    break;
                }
                case EACUTE_LC: {
                    token072 = LT(1);
                    match(EACUTE_LC);

                    token072.setText(String.valueOf('\u00E9'));
                    token = token072;

                    break;
                }
                case ECIRC_LC: {
                    token073 = LT(1);
                    match(ECIRC_LC);

                    token073.setText(String.valueOf('\u00EA'));
                    token = token073;

                    break;
                }
                case EUML_LC: {
                    token074 = LT(1);
                    match(EUML_LC);

                    token074.setText(String.valueOf('\u00EB'));
                    token = token074;

                    break;
                }
                case IGRAVE_LC: {
                    token075 = LT(1);
                    match(IGRAVE_LC);

                    token075.setText(String.valueOf('\u00EC'));
                    token = token075;

                    break;
                }
                case IACUTE_LC: {
                    token076 = LT(1);
                    match(IACUTE_LC);

                    token076.setText(String.valueOf('\u00ED'));
                    token = token076;

                    break;
                }
                case ICIRC_LC: {
                    token077 = LT(1);
                    match(ICIRC_LC);

                    token077.setText(String.valueOf('\u00EE'));
                    token = token077;

                    break;
                }
                case IUML_LC: {
                    token078 = LT(1);
                    match(IUML_LC);

                    token078.setText(String.valueOf('\u00EF'));
                    token = token078;

                    break;
                }
                case ETH_LC: {
                    token079 = LT(1);
                    match(ETH_LC);

                    token079.setText(String.valueOf('\u00F0'));
                    token = token079;

                    break;
                }
                case NTILDE_LC: {
                    token080 = LT(1);
                    match(NTILDE_LC);

                    token080.setText(String.valueOf('\u00F1'));
                    token = token080;

                    break;
                }
                case OGRAVE_LC: {
                    token081 = LT(1);
                    match(OGRAVE_LC);

                    token081.setText(String.valueOf('\u00F2'));
                    token = token081;

                    break;
                }
                case OACUTE_LC: {
                    token082 = LT(1);
                    match(OACUTE_LC);

                    token082.setText(String.valueOf('\u00F3'));
                    token = token082;

                    break;
                }
                case OCIRC_LC: {
                    token083 = LT(1);
                    match(OCIRC_LC);

                    token083.setText(String.valueOf('\u00F4'));
                    token = token083;

                    break;
                }
                case OTILDE_LC: {
                    token084 = LT(1);
                    match(OTILDE_LC);

                    token084.setText(String.valueOf('\u00F5'));
                    token = token084;

                    break;
                }
                case OUML_LC: {
                    token085 = LT(1);
                    match(OUML_LC);

                    token085.setText(String.valueOf('\u00F6'));
                    token = token085;

                    break;
                }
                case DIVIDE: {
                    token086 = LT(1);
                    match(DIVIDE);

                    token086.setText(String.valueOf('\u00F7'));
                    token = token086;

                    break;
                }
                case OSLASH_LC: {
                    token087 = LT(1);
                    match(OSLASH_LC);

                    token087.setText(String.valueOf('\u00F8'));
                    token = token087;

                    break;
                }
                case UGRAVE_LC: {
                    token088 = LT(1);
                    match(UGRAVE_LC);

                    token088.setText(String.valueOf('\u00F9'));
                    token = token088;

                    break;
                }
                case UACUTE_LC: {
                    token089 = LT(1);
                    match(UACUTE_LC);

                    token089.setText(String.valueOf('\u00FA'));
                    token = token089;

                    break;
                }
                case UCIRC_LC: {
                    token090 = LT(1);
                    match(UCIRC_LC);

                    token090.setText(String.valueOf('\u00FB'));
                    token = token090;

                    break;
                }
                case UUML_LC: {
                    token091 = LT(1);
                    match(UUML_LC);

                    token091.setText(String.valueOf('\u00FC'));
                    token = token091;

                    break;
                }
                case YACUTE_LC: {
                    token092 = LT(1);
                    match(YACUTE_LC);

                    token092.setText(String.valueOf('\u00FD'));
                    token = token092;

                    break;
                }
                case THORN_LC: {
                    token093 = LT(1);
                    match(THORN_LC);

                    token093.setText(String.valueOf('\u00FE'));
                    token = token093;

                    break;
                }
                case YUML_LC: {
                    token094 = LT(1);
                    match(YUML_LC);

                    token094.setText(String.valueOf('\u00FF'));
                    token = token094;

                    break;
                }
                case ALPHA: {
                    token095 = LT(1);
                    match(ALPHA);

                    token095.setText(String.valueOf('\u0391'));
                    token = token095;

                    break;
                }
                case BETA: {
                    token096 = LT(1);
                    match(BETA);

                    token096.setText(String.valueOf('\u0392'));
                    token = token096;

                    break;
                }
                case GAMMA: {
                    token097 = LT(1);
                    match(GAMMA);

                    token097.setText(String.valueOf('\u0393'));
                    token = token097;

                    break;
                }
                case DELTA: {
                    token098 = LT(1);
                    match(DELTA);

                    token098.setText(String.valueOf('\u0394'));
                    token = token098;

                    break;
                }
                case EPSILON: {
                    token099 = LT(1);
                    match(EPSILON);

                    token099.setText(String.valueOf('\u0395'));
                    token = token099;

                    break;
                }
                case ZETA: {
                    token100 = LT(1);
                    match(ZETA);

                    token100.setText(String.valueOf('\u0396'));
                    token = token100;

                    break;
                }
                case ETA: {
                    token101 = LT(1);
                    match(ETA);

                    token101.setText(String.valueOf('\u0397'));
                    token = token101;

                    break;
                }
                case THETA: {
                    token102 = LT(1);
                    match(THETA);

                    token102.setText(String.valueOf('\u0398'));
                    token = token102;

                    break;
                }
                case IOTA: {
                    token103 = LT(1);
                    match(IOTA);

                    token103.setText(String.valueOf('\u0399'));
                    token = token103;

                    break;
                }
                case KAPPA: {
                    token104 = LT(1);
                    match(KAPPA);

                    token104.setText(String.valueOf('\u039A'));
                    token = token104;

                    break;
                }
                case LAMBDA: {
                    token105 = LT(1);
                    match(LAMBDA);

                    token105.setText(String.valueOf('\u039B'));
                    token = token105;

                    break;
                }
                case MU: {
                    token106 = LT(1);
                    match(MU);

                    token106.setText(String.valueOf('\u039C'));
                    token = token106;

                    break;
                }
                case NU: {
                    token107 = LT(1);
                    match(NU);

                    token107.setText(String.valueOf('\u039D'));
                    token = token107;

                    break;
                }
                case XI: {
                    token108 = LT(1);
                    match(XI);

                    token108.setText(String.valueOf('\u039E'));
                    token = token108;

                    break;
                }
                case OMICRON: {
                    token109 = LT(1);
                    match(OMICRON);

                    token109.setText(String.valueOf('\u039F'));
                    token = token109;

                    break;
                }
                case PI: {
                    token110 = LT(1);
                    match(PI);

                    token110.setText(String.valueOf('\u03A0'));
                    token = token110;

                    break;
                }
                case RHO: {
                    token111 = LT(1);
                    match(RHO);

                    token111.setText(String.valueOf('\u03A1'));
                    token = token111;

                    break;
                }
                case SIGMA: {
                    token112 = LT(1);
                    match(SIGMA);

                    token112.setText(String.valueOf('\u03A3'));
                    token = token112;

                    break;
                }
                case TAU: {
                    token113 = LT(1);
                    match(TAU);

                    token113.setText(String.valueOf('\u03A4'));
                    token = token113;

                    break;
                }
                case UPSILON: {
                    token114 = LT(1);
                    match(UPSILON);

                    token114.setText(String.valueOf('\u03A5'));
                    token = token114;

                    break;
                }
                case PHI: {
                    token115 = LT(1);
                    match(PHI);

                    token115.setText(String.valueOf('\u03A6'));
                    token = token115;

                    break;
                }
                case CHI: {
                    token116 = LT(1);
                    match(CHI);

                    token116.setText(String.valueOf('\u03A7'));
                    token = token116;

                    break;
                }
                case PSI: {
                    token117 = LT(1);
                    match(PSI);

                    token117.setText(String.valueOf('\u03A8'));
                    token = token117;

                    break;
                }
                case OMEGA: {
                    token118 = LT(1);
                    match(OMEGA);

                    token118.setText(String.valueOf('\u03A9'));
                    token = token118;

                    break;
                }
                case ALPHA_LC: {
                    token119 = LT(1);
                    match(ALPHA_LC);

                    token119.setText(String.valueOf('\u03B1'));
                    token = token119;

                    break;
                }
                case BETA_LC: {
                    token120 = LT(1);
                    match(BETA_LC);

                    token120.setText(String.valueOf('\u03B2'));
                    token = token120;

                    break;
                }
                case GAMMA_LC: {
                    token121 = LT(1);
                    match(GAMMA_LC);

                    token121.setText(String.valueOf('\u03B3'));
                    token = token121;

                    break;
                }
                case DELTA_LC: {
                    token122 = LT(1);
                    match(DELTA_LC);

                    token122.setText(String.valueOf('\u03B4'));
                    token = token122;

                    break;
                }
                case EPSILON_LC: {
                    token123 = LT(1);
                    match(EPSILON_LC);

                    token123.setText(String.valueOf('\u03B5'));
                    token = token123;

                    break;
                }
                case ZETA_LC: {
                    token124 = LT(1);
                    match(ZETA_LC);

                    token124.setText(String.valueOf('\u03B6'));
                    token = token124;

                    break;
                }
                case ETA_LC: {
                    token125 = LT(1);
                    match(ETA_LC);

                    token125.setText(String.valueOf('\u03B7'));
                    token = token125;

                    break;
                }
                case THETA_LC: {
                    token126 = LT(1);
                    match(THETA_LC);

                    token126.setText(String.valueOf('\u03B8'));
                    token = token126;

                    break;
                }
                case IOTA_LC: {
                    token127 = LT(1);
                    match(IOTA_LC);

                    token127.setText(String.valueOf('\u03B9'));
                    token = token127;

                    break;
                }
                case KAPPA_LC: {
                    token128 = LT(1);
                    match(KAPPA_LC);

                    token128.setText(String.valueOf('\u03BA'));
                    token = token128;

                    break;
                }
                case LAMBDA_LC: {
                    token129 = LT(1);
                    match(LAMBDA_LC);

                    token129.setText(String.valueOf('\u03BB'));
                    token = token129;

                    break;
                }
                case MU_LC: {
                    token130 = LT(1);
                    match(MU_LC);

                    token130.setText(String.valueOf('\u03BC'));
                    token = token130;

                    break;
                }
                case NU_LC: {
                    token131 = LT(1);
                    match(NU_LC);

                    token131.setText(String.valueOf('\u03BD'));
                    token = token131;

                    break;
                }
                case XI_LC: {
                    token132 = LT(1);
                    match(XI_LC);

                    token132.setText(String.valueOf('\u03BE'));
                    token = token132;

                    break;
                }
                case OMICRON_LC: {
                    token133 = LT(1);
                    match(OMICRON_LC);

                    token133.setText(String.valueOf('\u03BF'));
                    token = token133;

                    break;
                }
                case PI_LC: {
                    token134 = LT(1);
                    match(PI_LC);

                    token134.setText(String.valueOf('\u03C0'));
                    token = token134;

                    break;
                }
                case RHO_LC: {
                    token135 = LT(1);
                    match(RHO_LC);

                    token135.setText(String.valueOf('\u03C1'));
                    token = token135;

                    break;
                }
                case SIGMAF_LC: {
                    token136 = LT(1);
                    match(SIGMAF_LC);

                    token136.setText(String.valueOf('\u03C2'));
                    token = token136;

                    break;
                }
                case SIGMA_LC: {
                    token137 = LT(1);
                    match(SIGMA_LC);

                    token137.setText(String.valueOf('\u03C3'));
                    token = token137;

                    break;
                }
                case TAU_LC: {
                    token138 = LT(1);
                    match(TAU_LC);

                    token138.setText(String.valueOf('\u03C4'));
                    token = token138;

                    break;
                }
                case UPSILON_LC: {
                    token139 = LT(1);
                    match(UPSILON_LC);

                    token139.setText(String.valueOf('\u03C5'));
                    token = token139;

                    break;
                }
                case PHI_LC: {
                    token140 = LT(1);
                    match(PHI_LC);

                    token140.setText(String.valueOf('\u03C6'));
                    token = token140;

                    break;
                }
                case CHI_LC: {
                    token141 = LT(1);
                    match(CHI_LC);

                    token141.setText(String.valueOf('\u03C7'));
                    token = token141;

                    break;
                }
                case PSI_LC: {
                    token142 = LT(1);
                    match(PSI_LC);

                    token142.setText(String.valueOf('\u03C8'));
                    token = token142;

                    break;
                }
                case OMEGA_LC: {
                    token143 = LT(1);
                    match(OMEGA_LC);

                    token143.setText(String.valueOf('\u03C9'));
                    token = token143;

                    break;
                }
                case THETASYM: {
                    token144 = LT(1);
                    match(THETASYM);

                    token144.setText(String.valueOf('\u03D1'));
                    token = token144;

                    break;
                }
                case UPSIH: {
                    token145 = LT(1);
                    match(UPSIH);

                    token145.setText(String.valueOf('\u03D2'));
                    token = token145;

                    break;
                }
                case PIV: {
                    token146 = LT(1);
                    match(PIV);

                    token146.setText(String.valueOf('\u03D6'));
                    token = token146;

                    break;
                }
                case BULL: {
                    token147 = LT(1);
                    match(BULL);

                    token147.setText(String.valueOf('\u2022'));
                    token = token147;

                    break;
                }
                case HELLIP: {
                    token148 = LT(1);
                    match(HELLIP);

                    token148.setText(String.valueOf('\u2026'));
                    token = token148;

                    break;
                }
                case PRIME_LC: {
                    token149 = LT(1);
                    match(PRIME_LC);

                    token149.setText(String.valueOf('\u2032'));
                    token = token149;

                    break;
                }
                case PRIME: {
                    token150 = LT(1);
                    match(PRIME);

                    token150.setText(String.valueOf('\u2033'));
                    token = token150;

                    break;
                }
                case OLINE: {
                    token151 = LT(1);
                    match(OLINE);

                    token151.setText(String.valueOf('\u203E'));
                    token = token151;

                    break;
                }
                case FRASL: {
                    token152 = LT(1);
                    match(FRASL);

                    token152.setText(String.valueOf('\u2044'));
                    token = token152;

                    break;
                }
                case WEIERP: {
                    token153 = LT(1);
                    match(WEIERP);

                    token153.setText(String.valueOf('\u2118'));
                    token = token153;

                    break;
                }
                case IMAGE: {
                    token154 = LT(1);
                    match(IMAGE);

                    token154.setText(String.valueOf('\u2111'));
                    token = token154;

                    break;
                }
                case REAL: {
                    token155 = LT(1);
                    match(REAL);

                    token155.setText(String.valueOf('\u211C'));
                    token = token155;

                    break;
                }
                case TRADE: {
                    token156 = LT(1);
                    match(TRADE);

                    token156.setText(String.valueOf('\u2122'));
                    token = token156;

                    break;
                }
                case ALEFSYM: {
                    token157 = LT(1);
                    match(ALEFSYM);

                    token157.setText(String.valueOf('\u2135'));
                    token = token157;

                    break;
                }
                case LARR: {
                    token158 = LT(1);
                    match(LARR);

                    token158.setText(String.valueOf('\u2190'));
                    token = token158;

                    break;
                }
                case UARR: {
                    token159 = LT(1);
                    match(UARR);

                    token159.setText(String.valueOf('\u2191'));
                    token = token159;

                    break;
                }
                case RARR: {
                    token160 = LT(1);
                    match(RARR);

                    token160.setText(String.valueOf('\u2192'));
                    token = token160;

                    break;
                }
                case DARR: {
                    token161 = LT(1);
                    match(DARR);

                    token161.setText(String.valueOf('\u2193'));
                    token = token161;

                    break;
                }
                case HARR: {
                    token162 = LT(1);
                    match(HARR);

                    token162.setText(String.valueOf('\u2194'));
                    token = token162;

                    break;
                }
                case CRARR: {
                    token163 = LT(1);
                    match(CRARR);

                    token163.setText(String.valueOf('\u21B5'));
                    token = token163;

                    break;
                }
                case LARR_D: {
                    token164 = LT(1);
                    match(LARR_D);

                    token164.setText(String.valueOf('\u21D0'));
                    token = token164;

                    break;
                }
                case UARR_D: {
                    token165 = LT(1);
                    match(UARR_D);

                    token165.setText(String.valueOf('\u21D1'));
                    token = token165;

                    break;
                }
                case RARR_D: {
                    token166 = LT(1);
                    match(RARR_D);

                    token166.setText(String.valueOf('\u21D2'));
                    token = token166;

                    break;
                }
                case DARR_D: {
                    token167 = LT(1);
                    match(DARR_D);

                    token167.setText(String.valueOf('\u21D3'));
                    token = token167;

                    break;
                }
                case HARR_D: {
                    token168 = LT(1);
                    match(HARR_D);

                    token168.setText(String.valueOf('\u21D4'));
                    token = token168;

                    break;
                }
                case FORALL: {
                    token169 = LT(1);
                    match(FORALL);

                    token169.setText(String.valueOf('\u2200'));
                    token = token169;

                    break;
                }
                case PART: {
                    token170 = LT(1);
                    match(PART);

                    token170.setText(String.valueOf('\u2202'));
                    token = token170;

                    break;
                }
                case EXIST: {
                    token171 = LT(1);
                    match(EXIST);

                    token171.setText(String.valueOf('\u2203'));
                    token = token171;

                    break;
                }
                case EMPTY: {
                    token172 = LT(1);
                    match(EMPTY);

                    token172.setText(String.valueOf('\u2205'));
                    token = token172;

                    break;
                }
                case NABLA: {
                    token173 = LT(1);
                    match(NABLA);

                    token173.setText(String.valueOf('\u2207'));
                    token = token173;

                    break;
                }
                case ISIN: {
                    token174 = LT(1);
                    match(ISIN);

                    token174.setText(String.valueOf('\u2208'));
                    token = token174;

                    break;
                }
                case NOTIN: {
                    token175 = LT(1);
                    match(NOTIN);

                    token175.setText(String.valueOf('\u2209'));
                    token = token175;

                    break;
                }
                case NI: {
                    token176 = LT(1);
                    match(NI);

                    token176.setText(String.valueOf('\u220B'));
                    token = token176;

                    break;
                }
                case PROD: {
                    token177 = LT(1);
                    match(PROD);

                    token177.setText(String.valueOf('\u220F'));
                    token = token177;

                    break;
                }
                case SUM: {
                    token178 = LT(1);
                    match(SUM);

                    token178.setText(String.valueOf('\u2211'));
                    token = token178;

                    break;
                }
                case MINUS: {
                    token179 = LT(1);
                    match(MINUS);

                    token179.setText(String.valueOf('\u2212'));
                    token = token179;

                    break;
                }
                case LOWAST: {
                    token180 = LT(1);
                    match(LOWAST);

                    token180.setText(String.valueOf('\u2217'));
                    token = token180;

                    break;
                }
                case RADIC: {
                    token181 = LT(1);
                    match(RADIC);

                    token181.setText(String.valueOf('\u221A'));
                    token = token181;

                    break;
                }
                case PROP: {
                    token182 = LT(1);
                    match(PROP);

                    token182.setText(String.valueOf('\u221D'));
                    token = token182;

                    break;
                }
                case INFIN: {
                    token183 = LT(1);
                    match(INFIN);

                    token183.setText(String.valueOf('\u221E'));
                    token = token183;

                    break;
                }
                case ANG: {
                    token184 = LT(1);
                    match(ANG);

                    token184.setText(String.valueOf('\u2220'));
                    token = token184;

                    break;
                }
                case AND: {
                    token185 = LT(1);
                    match(AND);

                    token185.setText(String.valueOf('\u2227'));
                    token = token185;

                    break;
                }
                case OR: {
                    token186 = LT(1);
                    match(OR);

                    token186.setText(String.valueOf('\u2228'));
                    token = token186;

                    break;
                }
                case CAP: {
                    token187 = LT(1);
                    match(CAP);

                    token187.setText(String.valueOf('\u2229'));
                    token = token187;

                    break;
                }
                case CUP: {
                    token188 = LT(1);
                    match(CUP);

                    token188.setText(String.valueOf('\u222A'));
                    token = token188;

                    break;
                }
                case INT: {
                    token189 = LT(1);
                    match(INT);

                    token189.setText(String.valueOf('\u222B'));
                    token = token189;

                    break;
                }
                case THERE4: {
                    token190 = LT(1);
                    match(THERE4);

                    token190.setText(String.valueOf('\u2234'));
                    token = token190;

                    break;
                }
                case SIM: {
                    token191 = LT(1);
                    match(SIM);

                    token191.setText(String.valueOf('\u223C'));
                    token = token191;

                    break;
                }
                case CONG: {
                    token192 = LT(1);
                    match(CONG);

                    token192.setText(String.valueOf('\u2245'));
                    token = token192;

                    break;
                }
                case ASYMP: {
                    token193 = LT(1);
                    match(ASYMP);

                    token193.setText(String.valueOf('\u2248'));
                    token = token193;

                    break;
                }
                case NE: {
                    token194 = LT(1);
                    match(NE);

                    token194.setText(String.valueOf('\u2260'));
                    token = token194;

                    break;
                }
                case EQUIV: {
                    token195 = LT(1);
                    match(EQUIV);

                    token195.setText(String.valueOf('\u2261'));
                    token = token195;

                    break;
                }
                case LE: {
                    token196 = LT(1);
                    match(LE);

                    token196.setText(String.valueOf('\u2264'));
                    token = token196;

                    break;
                }
                case GE: {
                    token197 = LT(1);
                    match(GE);

                    token197.setText(String.valueOf('\u2265'));
                    token = token197;

                    break;
                }
                case SUB: {
                    token198 = LT(1);
                    match(SUB);

                    token198.setText(String.valueOf('\u2282'));
                    token = token198;

                    break;
                }
                case SUP: {
                    token199 = LT(1);
                    match(SUP);

                    token199.setText(String.valueOf('\u2283'));
                    token = token199;

                    break;
                }
                case NSUB: {
                    token200 = LT(1);
                    match(NSUB);

                    token200.setText(String.valueOf('\u2284'));
                    token = token200;

                    break;
                }
                case SUBE: {
                    token201 = LT(1);
                    match(SUBE);

                    token201.setText(String.valueOf('\u2286'));
                    token = token201;

                    break;
                }
                case SUPE: {
                    token202 = LT(1);
                    match(SUPE);

                    token202.setText(String.valueOf('\u2287'));
                    token = token202;

                    break;
                }
                case OPLUS: {
                    token203 = LT(1);
                    match(OPLUS);

                    token203.setText(String.valueOf('\u2295'));
                    token = token203;

                    break;
                }
                case OTIMES: {
                    token204 = LT(1);
                    match(OTIMES);

                    token204.setText(String.valueOf('\u2297'));
                    token = token204;

                    break;
                }
                case PERP: {
                    token205 = LT(1);
                    match(PERP);

                    token205.setText(String.valueOf('\u22A5'));
                    token = token205;

                    break;
                }
                case SDOT: {
                    token206 = LT(1);
                    match(SDOT);

                    token206.setText(String.valueOf('\u22C5'));
                    token = token206;

                    break;
                }
                case LCEIL: {
                    token207 = LT(1);
                    match(LCEIL);

                    token207.setText(String.valueOf('\u2308'));
                    token = token207;

                    break;
                }
                case RCEIL: {
                    token208 = LT(1);
                    match(RCEIL);

                    token208.setText(String.valueOf('\u2309'));
                    token = token208;

                    break;
                }
                case LFLOOR: {
                    token209 = LT(1);
                    match(LFLOOR);

                    token209.setText(String.valueOf('\u230A'));
                    token = token209;

                    break;
                }
                case RFLOOR: {
                    token210 = LT(1);
                    match(RFLOOR);

                    token210.setText(String.valueOf('\u230B'));
                    token = token210;

                    break;
                }
                case LANG: {
                    token211 = LT(1);
                    match(LANG);

                    token211.setText(String.valueOf('\u2329'));
                    token = token211;

                    break;
                }
                case RANG: {
                    token212 = LT(1);
                    match(RANG);

                    token212.setText(String.valueOf('\u232A'));
                    token = token212;

                    break;
                }
                case LOZ: {
                    token213 = LT(1);
                    match(LOZ);

                    token213.setText(String.valueOf('\u25CA'));
                    token = token213;

                    break;
                }
                case SPADES: {
                    token214 = LT(1);
                    match(SPADES);

                    token214.setText(String.valueOf('\u2660'));
                    token = token214;

                    break;
                }
                case CLUBS: {
                    token215 = LT(1);
                    match(CLUBS);

                    token215.setText(String.valueOf('\u2663'));
                    token = token215;

                    break;
                }
                case HEARTS: {
                    token216 = LT(1);
                    match(HEARTS);

                    token216.setText(String.valueOf('\u2665'));
                    token = token216;

                    break;
                }
                case DIAMS: {
                    token217 = LT(1);
                    match(DIAMS);

                    token217.setText(String.valueOf('\u2666'));
                    token = token217;

                    break;
                }
                case QUOT: {
                    token218 = LT(1);
                    match(QUOT);

                    token218.setText(String.valueOf('\u0022'));
                    token = token218;

                    break;
                }
                case AMP: {
                    token219 = LT(1);
                    match(AMP);

                    token219.setText(String.valueOf('\u0026'));
                    token = token219;
                    this.m_potentialRemainingEntity = true;

                    break;
                }
                case LT: {
                    token220 = LT(1);
                    match(LT);

                    token220.setText(String.valueOf('\u003C'));
                    token = token220;

                    break;
                }
                case GT: {
                    token221 = LT(1);
                    match(GT);

                    token221.setText(String.valueOf('\u003E'));
                    token = token221;

                    break;
                }
                case OELIG: {
                    token222 = LT(1);
                    match(OELIG);

                    token222.setText(String.valueOf('\u0152'));
                    token = token222;

                    break;
                }
                case OELIG_LC: {
                    token223 = LT(1);
                    match(OELIG_LC);

                    token223.setText(String.valueOf('\u0153'));
                    token = token223;

                    break;
                }
                case SCARON: {
                    token224 = LT(1);
                    match(SCARON);

                    token224.setText(String.valueOf('\u0160'));
                    token = token224;

                    break;
                }
                case SCARON_LC: {
                    token225 = LT(1);
                    match(SCARON_LC);

                    token225.setText(String.valueOf('\u0161'));
                    token = token225;

                    break;
                }
                case YUML: {
                    token226 = LT(1);
                    match(YUML);

                    token226.setText(String.valueOf('\u0178'));
                    token = token226;

                    break;
                }
                case CIRC: {
                    token227 = LT(1);
                    match(CIRC);

                    token227.setText(String.valueOf('\u02C6'));
                    token = token227;

                    break;
                }
                case TILDE: {
                    token228 = LT(1);
                    match(TILDE);

                    token228.setText(String.valueOf('\u02DC'));
                    token = token228;

                    break;
                }
                case ENSP: {
                    token229 = LT(1);
                    match(ENSP);

                    token229.setText(String.valueOf('\u2002'));
                    token = token229;

                    break;
                }
                case EMSP: {
                    token230 = LT(1);
                    match(EMSP);

                    token230.setText(String.valueOf('\u2003'));
                    token = token230;

                    break;
                }
                case THINSP: {
                    token231 = LT(1);
                    match(THINSP);

                    token231.setText(String.valueOf('\u2009'));
                    token = token231;

                    break;
                }
                case ZWNJ: {
                    token232 = LT(1);
                    match(ZWNJ);

                    token232.setText(String.valueOf('\u200C'));
                    token = token232;

                    break;
                }
                case ZWJ: {
                    token233 = LT(1);
                    match(ZWJ);

                    token233.setText(String.valueOf('\u200D'));
                    token = token233;

                    break;
                }
                case LRM: {
                    token234 = LT(1);
                    match(LRM);

                    token234.setText(String.valueOf('\u200E'));
                    token = token234;

                    break;
                }
                case RLM: {
                    token235 = LT(1);
                    match(RLM);

                    token235.setText(String.valueOf('\u200F'));
                    token = token235;

                    break;
                }
                case NDASH: {
                    token236 = LT(1);
                    match(NDASH);

                    token236.setText(String.valueOf('\u2013'));
                    token = token236;

                    break;
                }
                case MDASH: {
                    token237 = LT(1);
                    match(MDASH);

                    token237.setText(String.valueOf('\u2014'));
                    token = token237;

                    break;
                }
                case LSQUO: {
                    token238 = LT(1);
                    match(LSQUO);

                    token238.setText(String.valueOf('\u2018'));
                    token = token238;

                    break;
                }
                case RSQUO: {
                    token239 = LT(1);
                    match(RSQUO);

                    token239.setText(String.valueOf('\u2019'));
                    token = token239;

                    break;
                }
                case SBQUO: {
                    token240 = LT(1);
                    match(SBQUO);

                    token240.setText(String.valueOf('\u201A'));
                    token = token240;

                    break;
                }
                case LDQUO: {
                    token241 = LT(1);
                    match(LDQUO);

                    token241.setText(String.valueOf('\u201C'));
                    token = token241;

                    break;
                }
                case RDQUO: {
                    token242 = LT(1);
                    match(RDQUO);

                    token242.setText(String.valueOf('\u201D'));
                    token = token242;

                    break;
                }
                case BDQUO: {
                    token243 = LT(1);
                    match(BDQUO);

                    token243.setText(String.valueOf('\u201E'));
                    token = token243;

                    break;
                }
                case DAGGER_LC: {
                    token244 = LT(1);
                    match(DAGGER_LC);

                    token244.setText(String.valueOf('\u2020'));
                    token = token244;

                    break;
                }
                case DAGGER: {
                    token245 = LT(1);
                    match(DAGGER);

                    token245.setText(String.valueOf('\u2021'));
                    token = token245;

                    break;
                }
                case PERMIL: {
                    token246 = LT(1);
                    match(PERMIL);

                    token246.setText(String.valueOf('\u2030'));
                    token = token246;

                    break;
                }
                case LSAQUO: {
                    token247 = LT(1);
                    match(LSAQUO);

                    token247.setText(String.valueOf('\u2039'));
                    token = token247;

                    break;
                }
                case RSAQUO: {
                    token248 = LT(1);
                    match(RSAQUO);

                    token248.setText(String.valueOf('\u203A'));
                    token = token248;

                    break;
                }
                case EURO: {
                    token249 = LT(1);
                    match(EURO);

                    token249.setText(String.valueOf('\u20AC'));
                    token = token249;

                    break;
                }
                case WORD: {
                    token250 = LT(1);
                    match(WORD);

                    token = token250;

                    break;
                }
                case NCR_H: {
                    token251 = LT(1);
                    match(NCR_H);

                    token251.setText(new String(new char[]{(char) Integer.parseInt(token251.getText(), 16)}));
                    token = token251;

                    break;
                }
                case NCR_D: {
                    token252 = LT(1);
                    match(NCR_D);

                    token252.setText(new String(new char[]{(char) Integer.parseInt(token252.getText(), 10)}));
                    token = token252;

                    break;
                }
                case EOF: {
                    token253 = LT(1);
                    match(Token.EOF_TYPE);

                    token = token253;

                    break;
                }
                default: {
                    throw new NoViableAltException(LT(1), getFilename());
                }
            }
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_0);
        }
        return token;
    }


    public static final String[] _tokenNames = {
            "<0>",
            "EOF",
            "<2>",
            "NULL_TREE_LOOKAHEAD",
            "NBSP",
            "IEXCL",
            "CENT",
            "POUND",
            "CURREN",
            "YEN",
            "BRVBAR",
            "SECT",
            "UML",
            "COPY",
            "ORDF",
            "LAQUO",
            "NOT",
            "SHY",
            "REG",
            "MACR",
            "DEG",
            "PLUSMN",
            "SUP2",
            "SUP3",
            "ACUTE",
            "MICRO",
            "PARA",
            "MIDDOT",
            "CEDIL",
            "SUP1",
            "ORDM",
            "RAQUO",
            "FRAC14",
            "FRAC12",
            "FRAC34",
            "IQUEST",
            "AGRAVE",
            "AACUTE",
            "ACIRC",
            "ATILDE",
            "AUML",
            "ARING",
            "AELIG",
            "CCEDIL",
            "EGRAVE",
            "EACUTE",
            "ECIRC",
            "EUML",
            "IGRAVE",
            "IACUTE",
            "ICIRC",
            "IUML",
            "ETH",
            "NTILDE",
            "OGRAVE",
            "OACUTE",
            "OCIRC",
            "OTILDE",
            "OUML",
            "TIMES",
            "OSLASH",
            "UGRAVE",
            "UACUTE",
            "UCIRC",
            "UUML",
            "YACUTE",
            "THORN",
            "SZLIG",
            "AGRAVE_LC",
            "AACUTE_LC",
            "ACIRC_LC",
            "ATILDE_LC",
            "AUML_LC",
            "ARING_LC",
            "AELIG_LC",
            "CCEDIL_LC",
            "EGRAVE_LC",
            "EACUTE_LC",
            "ECIRC_LC",
            "EUML_LC",
            "IGRAVE_LC",
            "IACUTE_LC",
            "ICIRC_LC",
            "IUML_LC",
            "ETH_LC",
            "NTILDE_LC",
            "OGRAVE_LC",
            "OACUTE_LC",
            "OCIRC_LC",
            "OTILDE_LC",
            "OUML_LC",
            "DIVIDE",
            "OSLASH_LC",
            "UGRAVE_LC",
            "UACUTE_LC",
            "UCIRC_LC",
            "UUML_LC",
            "YACUTE_LC",
            "THORN_LC",
            "YUML_LC",
            "ALPHA",
            "BETA",
            "GAMMA",
            "DELTA",
            "EPSILON",
            "ZETA",
            "ETA",
            "THETA",
            "IOTA",
            "KAPPA",
            "LAMBDA",
            "MU",
            "NU",
            "XI",
            "OMICRON",
            "PI",
            "RHO",
            "SIGMA",
            "TAU",
            "UPSILON",
            "PHI",
            "CHI",
            "PSI",
            "OMEGA",
            "ALPHA_LC",
            "BETA_LC",
            "GAMMA_LC",
            "DELTA_LC",
            "EPSILON_LC",
            "ZETA_LC",
            "ETA_LC",
            "THETA_LC",
            "IOTA_LC",
            "KAPPA_LC",
            "LAMBDA_LC",
            "MU_LC",
            "NU_LC",
            "XI_LC",
            "OMICRON_LC",
            "PI_LC",
            "RHO_LC",
            "SIGMAF_LC",
            "SIGMA_LC",
            "TAU_LC",
            "UPSILON_LC",
            "PHI_LC",
            "CHI_LC",
            "PSI_LC",
            "OMEGA_LC",
            "THETASYM",
            "UPSIH",
            "PIV",
            "BULL",
            "HELLIP",
            "PRIME_LC",
            "PRIME",
            "OLINE",
            "FRASL",
            "WEIERP",
            "IMAGE",
            "REAL",
            "TRADE",
            "ALEFSYM",
            "LARR",
            "UARR",
            "RARR",
            "DARR",
            "HARR",
            "CRARR",
            "LARR_D",
            "UARR_D",
            "RARR_D",
            "DARR_D",
            "HARR_D",
            "FORALL",
            "PART",
            "EXIST",
            "EMPTY",
            "NABLA",
            "ISIN",
            "NOTIN",
            "NI",
            "PROD",
            "SUM",
            "MINUS",
            "LOWAST",
            "RADIC",
            "PROP",
            "INFIN",
            "ANG",
            "AND",
            "OR",
            "CAP",
            "CUP",
            "INT",
            "THERE4",
            "SIM",
            "CONG",
            "ASYMP",
            "NE",
            "EQUIV",
            "LE",
            "GE",
            "SUB",
            "SUP",
            "NSUB",
            "SUBE",
            "SUPE",
            "OPLUS",
            "OTIMES",
            "PERP",
            "SDOT",
            "LCEIL",
            "RCEIL",
            "LFLOOR",
            "RFLOOR",
            "LANG",
            "RANG",
            "LOZ",
            "SPADES",
            "CLUBS",
            "HEARTS",
            "DIAMS",
            "QUOT",
            "AMP",
            "LT",
            "GT",
            "OELIG",
            "OELIG_LC",
            "SCARON",
            "SCARON_LC",
            "YUML",
            "CIRC",
            "TILDE",
            "ENSP",
            "EMSP",
            "THINSP",
            "ZWNJ",
            "ZWJ",
            "LRM",
            "RLM",
            "NDASH",
            "MDASH",
            "LSQUO",
            "RSQUO",
            "SBQUO",
            "LDQUO",
            "RDQUO",
            "BDQUO",
            "DAGGER_LC",
            "DAGGER",
            "PERMIL",
            "LSAQUO",
            "RSAQUO",
            "EURO",
            "WORD",
            "NCR_H",
            "NCR_D",
            "DIGIT",
            "HEXDIGIT"
    };

    private static final long[] mk_tokenSet_0() {
        long[] data = {2L, 0L, 0L, 0L, 0L};
        return data;
    }

    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());

}
