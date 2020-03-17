// $ANTLR 2.7.4: "latexencoder.g" -> "LatexEncoder.java"$

package info.monitorenter.unicode.encoder.latex;

import antlr.*;

public class LatexEncoder extends LLkParser implements LatexEncoderTokenTypes {

    protected LatexEncoder(TokenBuffer tokenBuf, int k) {
        super(tokenBuf, k);
        tokenNames = _tokenNames;
    }

    public LatexEncoder(TokenBuffer tokenBuf) {
        this(tokenBuf, 1);
    }

    protected LatexEncoder(TokenStream lexer, int k) {
        super(lexer, k);
        tokenNames = _tokenNames;
    }

    public LatexEncoder(TokenStream lexer) {
        this(lexer, 1);
    }

    public LatexEncoder(ParserSharedInputState state) {
        super(state, 1);
        tokenNames = _tokenNames;
    }

    public final Token encodeNext(

    ) throws RecognitionException, TokenStreamException {
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
        Token token023 = null;
        Token token024 = null;
        Token token025 = null;
        Token token026 = null;
        Token token027 = null;
        Token token028 = null;
        Token token030 = null;
        Token token031 = null;
        Token token032 = null;
        Token token034 = null;
        Token token035 = null;
        Token token036 = null;
        Token token037 = null;
        Token token038 = null;
        Token token039 = null;
        Token token041 = null;
        Token token042 = null;
        Token token043 = null;
        Token token044 = null;
        Token token045 = null;
        Token token047 = null;
        Token token048 = null;
        Token token049 = null;
        Token token050 = null;
        Token token051 = null;
        Token token052 = null;
        Token token053 = null;
        Token token055 = null;
        Token token056 = null;
        Token token057 = null;
        Token token058 = null;
        Token token059 = null;
        Token token060 = null;
        Token token062 = null;
        Token token063 = null;
        Token token064 = null;
        Token token066 = null;
        Token token067 = null;
        Token token068 = null;
        Token token069 = null;
        Token token070 = null;
        Token token071 = null;
        Token token073 = null;
        Token token074 = null;
        Token token075 = null;
        Token token076 = null;
        Token token077 = null;
        Token token079 = null;
        Token token080 = null;
        Token token082 = null;
        Token token083 = null;
        Token tokenAnyChar = null;
        Token tokenEOF = null;
        token = null;

        {
            switch (LA(1)) {
                case QUOTATION_MARK: {
                    token000 = LT(1);
                    match(QUOTATION_MARK);

                    token000.setText("\\'\\'");
                    token = token000;

                    break;
                }
                case NUMBER_SIGN: {
                    token001 = LT(1);
                    match(NUMBER_SIGN);

                    token001.setText("\\#");
                    token = token001;

                    break;
                }
                case DOLLAR_SIGN: {
                    token002 = LT(1);
                    match(DOLLAR_SIGN);

                    token002.setText("\\$");
                    token = token002;

                    break;
                }
                case PERCENT_SIGN: {
                    token003 = LT(1);
                    match(PERCENT_SIGN);

                    token003.setText("\\%");
                    token = token003;

                    break;
                }
                case AMPERSAND: {
                    token004 = LT(1);
                    match(AMPERSAND);

                    token004.setText("\\&");
                    token = token004;

                    break;
                }
                case APOSTROPHE: {
                    token005 = LT(1);
                    match(APOSTROPHE);

                    token005.setText("\\'");
                    token = token005;

                    break;
                }
                case ASTERISK: {
                    token006 = LT(1);
                    match(ASTERISK);

                    token006.setText("$\\star$");
                    token = token006;

                    break;
                }
                case CIRCUMFLEX: {
                    token007 = LT(1);
                    match(CIRCUMFLEX);

                    token007.setText("\\^{}");
                    token = token007;

                    break;
                }
                case LEFT_SQUARE_BRACKET: {
                    token008 = LT(1);
                    match(LEFT_SQUARE_BRACKET);

                    token008.setText("\\[");
                    token = token008;

                    break;
                }
                case RIGHT_SQUARE_BRACKET: {
                    token009 = LT(1);
                    match(RIGHT_SQUARE_BRACKET);

                    token009.setText("\\]");
                    token = token009;

                    break;
                }
                case LOW_LINE: {
                    token010 = LT(1);
                    match(LOW_LINE);

                    token010.setText("\\_");
                    token = token010;

                    break;
                }
                case LEFT_CURLY_BRACKET: {
                    token011 = LT(1);
                    match(LEFT_CURLY_BRACKET);

                    token011.setText("\\{");
                    token = token011;

                    break;
                }
                case RIGHT_CURLY_BRACKET: {
                    token012 = LT(1);
                    match(RIGHT_CURLY_BRACKET);

                    token012.setText("\\}");
                    token = token012;

                    break;
                }
                case CENT_SIGN: {
                    token013 = LT(1);
                    match(CENT_SIGN);

                    token002.setText("$\\varnothing$");
                    token = token013;

                    break;
                }
                case POUND_SIGN: {
                    token014 = LT(1);
                    match(POUND_SIGN);

                    token014.setText("\\pounds");
                    token = token014;

                    break;
                }
                case COPYRIGHT_SIGN: {
                    token015 = LT(1);
                    match(COPYRIGHT_SIGN);

                    token015.setText("\\copyright");
                    token = token015;

                    break;
                }
                case REGISTERED_SIGN: {
                    token016 = LT(1);
                    match(REGISTERED_SIGN);

                    token016.setText("\\textregistered");
                    token = token016;

                    break;
                }
                case DEGREE_SIGN: {
                    token017 = LT(1);
                    match(DEGREE_SIGN);

                    token017.setText("$\\,^{\\circ}\\mathrm{C}$");
                    token = token017;

                    break;
                }
                case LATIN_CAPITAL_LETTER_A_WITH_GRAVE: {
                    token018 = LT(1);
                    match(LATIN_CAPITAL_LETTER_A_WITH_GRAVE);

                    token018.setText("\\`A");
                    token = token018;

                    break;
                }
                case LATIN_CAPITAL_LETTER_A_WITH_ACUTE: {
                    token019 = LT(1);
                    match(LATIN_CAPITAL_LETTER_A_WITH_ACUTE);

                    token019.setText("\\'A");
                    token = token019;

                    break;
                }
                case LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX: {
                    token020 = LT(1);
                    match(LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX);

                    token020.setText("\\^A");
                    token = token020;

                    break;
                }
                case LATIN_CAPITAL_LETTER_A_WITH_TILDE: {
                    token021 = LT(1);
                    match(LATIN_CAPITAL_LETTER_A_WITH_TILDE);

                    token021.setText("\\~A");
                    token = token021;

                    break;
                }
                case LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE: {
                    token023 = LT(1);
                    match(LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE);

                    token023.setText("\\AA ");
                    token = token023;

                    break;
                }
                case LATIN_CAPITAL_LETTER_AE: {
                    token024 = LT(1);
                    match(LATIN_CAPITAL_LETTER_AE);

                    token024.setText("\\AE ");
                    token = token024;

                    break;
                }
                case LATIN_CAPITAL_LETTER_C_WITH_CEDILLA: {
                    token025 = LT(1);
                    match(LATIN_CAPITAL_LETTER_C_WITH_CEDILLA);

                    token025.setText("\\c C");
                    token = token025;

                    break;
                }
                case LATIN_CAPITAL_LETTER_E_WITH_GRAVE: {
                    token026 = LT(1);
                    match(LATIN_CAPITAL_LETTER_E_WITH_GRAVE);

                    token026.setText("\\`E");
                    token = token026;

                    break;
                }
                case LATIN_CAPITAL_LETTER_E_WITH_ACUTE: {
                    token027 = LT(1);
                    match(LATIN_CAPITAL_LETTER_E_WITH_ACUTE);

                    token027.setText("\\'E");
                    token = token027;

                    break;
                }
                case LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX: {
                    token028 = LT(1);
                    match(LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX);

                    token028.setText("\\^E");
                    token = token028;

                    break;
                }
                case LATIN_CAPITAL_LETTER_I_WITH_GRAVE: {
                    token030 = LT(1);
                    match(LATIN_CAPITAL_LETTER_I_WITH_GRAVE);

                    token030.setText("\\`I");
                    token = token030;

                    break;
                }
                case LATIN_CAPITAL_LETTER_I_WITH_ACUTE: {
                    token031 = LT(1);
                    match(LATIN_CAPITAL_LETTER_I_WITH_ACUTE);

                    token031.setText("\\'I");
                    token = token031;

                    break;
                }
                case LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX: {
                    token032 = LT(1);
                    match(LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX);

                    token032.setText("\\^I");
                    token = token032;

                    break;
                }
                case LATIN_CAPITAL_LETTER_ETH: {
                    token034 = LT(1);
                    match(LATIN_CAPITAL_LETTER_ETH);

                    token034.setText("$\\eth$");
                    token = token034;

                    break;
                }
                case LATIN_CAPITAL_LETTER_N_WITH_TILDE: {
                    token035 = LT(1);
                    match(LATIN_CAPITAL_LETTER_N_WITH_TILDE);

                    token035.setText("\\~N");
                    token = token035;

                    break;
                }
                case LATIN_CAPITAL_LETTER_O_WITH_GRAVE: {
                    token036 = LT(1);
                    match(LATIN_CAPITAL_LETTER_O_WITH_GRAVE);

                    token036.setText("\\`O");
                    token = token036;

                    break;
                }
                case LATIN_CAPITAL_LETTER_O_WITH_ACUTE: {
                    token037 = LT(1);
                    match(LATIN_CAPITAL_LETTER_O_WITH_ACUTE);

                    token037.setText("\\'O");
                    token = token037;

                    break;
                }
                case LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX: {
                    token038 = LT(1);
                    match(LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX);

                    token038.setText("\\^O");
                    token = token038;

                    break;
                }
                case LATIN_CAPITAL_LETTER_O_WITH_TILDE: {
                    token039 = LT(1);
                    match(LATIN_CAPITAL_LETTER_O_WITH_TILDE);

                    token039.setText("\\~O");
                    token = token039;

                    break;
                }
                case MULTIPLICATION_SIGN: {
                    token041 = LT(1);
                    match(MULTIPLICATION_SIGN);

                    token041.setText("$*$");
                    token = token041;

                    break;
                }
                case LATIN_CAPITAL_LETTER_O_WITH_STROKE: {
                    token042 = LT(1);
                    match(LATIN_CAPITAL_LETTER_O_WITH_STROKE);

                    token042.setText("\\O ");
                    token = token042;

                    break;
                }
                case LATIN_CAPITAL_LETTER_U_WITH_GRAVE: {
                    token043 = LT(1);
                    match(LATIN_CAPITAL_LETTER_U_WITH_GRAVE);

                    token043.setText("\\`U");
                    token = token043;

                    break;
                }
                case LATIN_CAPITAL_LETTER_U_WITH_ACUTE: {
                    token044 = LT(1);
                    match(LATIN_CAPITAL_LETTER_U_WITH_ACUTE);

                    token044.setText("\\'U");
                    token = token044;

                    break;
                }
                case LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX: {
                    token045 = LT(1);
                    match(LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX);

                    token045.setText("\\^U");
                    token = token045;

                    break;
                }
                case LATIN_CAPITAL_LETTER_Y_WITH_ACUTE: {
                    token047 = LT(1);
                    match(LATIN_CAPITAL_LETTER_Y_WITH_ACUTE);

                    token047.setText("\\'Y");
                    token = token047;

                    break;
                }
                case LATIN_CAPITAL_LETTER_THORN: {
                    token048 = LT(1);
                    match(LATIN_CAPITAL_LETTER_THORN);

                    // token048.setText("\\#");
                    token = token048;

                    break;
                }
                case LATIN_SMALL_LETTER_SHARP_S: {
                    token049 = LT(1);
                    match(LATIN_SMALL_LETTER_SHARP_S);

                    token049.setText("\\ss ");
                    token = token049;

                    break;
                }
                case LATIN_SMALL_LETTER_A_WITH_GRAVE: {
                    token050 = LT(1);
                    match(LATIN_SMALL_LETTER_A_WITH_GRAVE);

                    token050.setText("\\`a");
                    token = token050;

                    break;
                }
                case LATIN_SMALL_LETTER_A_WITH_ACUTE: {
                    token051 = LT(1);
                    match(LATIN_SMALL_LETTER_A_WITH_ACUTE);

                    token051.setText("\\'a");
                    token = token051;

                    break;
                }
                case LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX: {
                    token052 = LT(1);
                    match(LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX);

                    token052.setText("\\^a");
                    token = token052;

                    break;
                }
                case LATIN_SMALL_LETTER_A_WITH_TILDE: {
                    token053 = LT(1);
                    match(LATIN_SMALL_LETTER_A_WITH_TILDE);

                    token053.setText("\\~a");
                    token = token053;

                    break;
                }
                case LATIN_SMALL_LETTER_A_WITH_RING_ABOVE: {
                    token055 = LT(1);
                    match(LATIN_SMALL_LETTER_A_WITH_RING_ABOVE);

                    token055.setText("\\aa ");
                    token = token055;

                    break;
                }
                case LATIN_SMALL_LETTER_AE: {
                    token056 = LT(1);
                    match(LATIN_SMALL_LETTER_AE);

                    token056.setText("\\ae ");
                    token = token056;

                    break;
                }
                case LATIN_SMALL_LETTER_C_WITH_CEDILLA: {
                    token057 = LT(1);
                    match(LATIN_SMALL_LETTER_C_WITH_CEDILLA);

                    token057.setText("\\c c");
                    token = token057;

                    break;
                }
                case LATIN_SMALL_LETTER_E_WITH_GRAVE: {
                    token058 = LT(1);
                    match(LATIN_SMALL_LETTER_E_WITH_GRAVE);

                    token058.setText("\\`e");
                    token = token058;

                    break;
                }
                case LATIN_SMALL_LETTER_E_WITH_ACUTE: {
                    token059 = LT(1);
                    match(LATIN_SMALL_LETTER_E_WITH_ACUTE);

                    token059.setText("\\'e");
                    token = token059;

                    break;
                }
                case LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX: {
                    token060 = LT(1);
                    match(LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX);

                    token060.setText("\\^e");
                    token = token060;

                    break;
                }
                case LATIN_SMALL_LETTER_I_WITH_GRAVE: {
                    token062 = LT(1);
                    match(LATIN_SMALL_LETTER_I_WITH_GRAVE);

                    token062.setText("\\`i");
                    token = token062;

                    break;
                }
                case LATIN_SMALL_LETTER_I_WITH_ACUTE: {
                    token063 = LT(1);
                    match(LATIN_SMALL_LETTER_I_WITH_ACUTE);

                    token063.setText("\\'i");
                    token = token063;

                    break;
                }
                case LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX: {
                    token064 = LT(1);
                    match(LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX);

                    token064.setText("\\^i");
                    token = token064;

                    break;
                }
                case LATIN_SMALL_LETTER_ETH: {
                    token066 = LT(1);
                    match(LATIN_SMALL_LETTER_ETH);

                    token066.setText("$\\eth$");
                    token = token066;

                    break;
                }
                case LATIN_SMALL_LETTER_N_WITH_TILDE: {
                    token067 = LT(1);
                    match(LATIN_SMALL_LETTER_N_WITH_TILDE);

                    token067.setText("\\~n");
                    token = token067;

                    break;
                }
                case LATIN_SMALL_LETTER_O_WITH_GRAVE: {
                    token068 = LT(1);
                    match(LATIN_SMALL_LETTER_O_WITH_GRAVE);

                    token068.setText("\\`o");
                    token = token068;

                    break;
                }
                case LATIN_SMALL_LETTER_O_WITH_ACUTE: {
                    token069 = LT(1);
                    match(LATIN_SMALL_LETTER_O_WITH_ACUTE);

                    token069.setText("\\'o");
                    token = token069;

                    break;
                }
                case LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX: {
                    token070 = LT(1);
                    match(LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX);

                    token070.setText("\\^o");
                    token = token070;

                    break;
                }
                case LATIN_SMALL_LETTER_O_WITH_TILDE: {
                    token071 = LT(1);
                    match(LATIN_SMALL_LETTER_O_WITH_TILDE);

                    token071.setText("\\~o");
                    token = token071;

                    break;
                }
                case DIVISION_SIGN: {
                    token073 = LT(1);
                    match(DIVISION_SIGN);

                    token073.setText("$\\div$");
                    token = token073;

                    break;
                }
                case LATIN_SMALL_LETTER_O_WITH_STROKE: {
                    token074 = LT(1);
                    match(LATIN_SMALL_LETTER_O_WITH_STROKE);

                    token074.setText("\\o ");
                    token = token074;

                    break;
                }
                case LATIN_SMALL_LETTER_U_WITH_GRAVE: {
                    token075 = LT(1);
                    match(LATIN_SMALL_LETTER_U_WITH_GRAVE);

                    token075.setText("\\`u");
                    token = token075;

                    break;
                }
                case LATIN_SMALL_LETTER_U_WITH_ACUTE: {
                    token076 = LT(1);
                    match(LATIN_SMALL_LETTER_U_WITH_ACUTE);

                    token076.setText("\\'u");
                    token = token076;

                    break;
                }
                case LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX: {
                    token077 = LT(1);
                    match(LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX);

                    token077.setText("\\^u");
                    token = token077;

                    break;
                }
                case LATIN_SMALL_LETTER_Y_WITH_ACUTE: {
                    token079 = LT(1);
                    match(LATIN_SMALL_LETTER_Y_WITH_ACUTE);

                    token079.setText("\\'y");
                    token = token079;

                    break;
                }
                case LATIN_SMALL_LETTER_THORN: {
                    token080 = LT(1);
                    match(LATIN_SMALL_LETTER_THORN);

                    //token082.setText("\\\"u");
                    token = token080;

                    break;
                }
                case EURO_CURRENCY: {
                    token082 = LT(1);
                    match(EURO_CURRENCY);

                    token082.setText("<Euro Currency Symbol>");
                    token = token082;

                    break;
                }
                case EURO_SIGN: {
                    token083 = LT(1);
                    match(EURO_SIGN);

                    token083.setText("\\euro ");
                    token = token083;

                    break;
                }
                case ANY_CHAR: {
                    tokenAnyChar = LT(1);
                    match(ANY_CHAR);

                    token = tokenAnyChar;

                    break;
                }
                case EOF: {
                    tokenEOF = LT(1);
                    match(Token.EOF_TYPE);

                    token = tokenEOF;

                    break;
                }
                default: {
                    throw new NoViableAltException(LT(1), getFilename());
                }
            }
        }
        return token;
    }


    public static final String[] _tokenNames = {
            "<0>",
            "EOF",
            "<2>",
            "NULL_TREE_LOOKAHEAD",
            "QUOTATION_MARK",
            "NUMBER_SIGN",
            "DOLLAR_SIGN",
            "PERCENT_SIGN",
            "AMPERSAND",
            "APOSTROPHE",
            "ASTERISK",
            "CIRCUMFLEX",
            "LEFT_SQUARE_BRACKET",
            "RIGHT_SQUARE_BRACKET",
            "LOW_LINE",
            "LEFT_CURLY_BRACKET",
            "RIGHT_CURLY_BRACKET",
            "CENT_SIGN",
            "POUND_SIGN",
            "COPYRIGHT_SIGN",
            "REGISTERED_SIGN",
            "DEGREE_SIGN",
            "LATIN_CAPITAL_LETTER_A_WITH_GRAVE",
            "LATIN_CAPITAL_LETTER_A_WITH_ACUTE",
            "LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX",
            "LATIN_CAPITAL_LETTER_A_WITH_TILDE",
            "LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE",
            "LATIN_CAPITAL_LETTER_AE",
            "LATIN_CAPITAL_LETTER_C_WITH_CEDILLA",
            "LATIN_CAPITAL_LETTER_E_WITH_GRAVE",
            "LATIN_CAPITAL_LETTER_E_WITH_ACUTE",
            "LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX",
            "LATIN_CAPITAL_LETTER_I_WITH_GRAVE",
            "LATIN_CAPITAL_LETTER_I_WITH_ACUTE",
            "LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX",
            "LATIN_CAPITAL_LETTER_ETH",
            "LATIN_CAPITAL_LETTER_N_WITH_TILDE",
            "LATIN_CAPITAL_LETTER_O_WITH_GRAVE",
            "LATIN_CAPITAL_LETTER_O_WITH_ACUTE",
            "LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX",
            "LATIN_CAPITAL_LETTER_O_WITH_TILDE",
            "MULTIPLICATION_SIGN",
            "LATIN_CAPITAL_LETTER_O_WITH_STROKE",
            "LATIN_CAPITAL_LETTER_U_WITH_GRAVE",
            "LATIN_CAPITAL_LETTER_U_WITH_ACUTE",
            "LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX",
            "LATIN_CAPITAL_LETTER_Y_WITH_ACUTE",
            "LATIN_CAPITAL_LETTER_THORN",
            "LATIN_SMALL_LETTER_SHARP_S",
            "LATIN_SMALL_LETTER_A_WITH_GRAVE",
            "LATIN_SMALL_LETTER_A_WITH_ACUTE",
            "LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX",
            "LATIN_SMALL_LETTER_A_WITH_TILDE",
            "LATIN_SMALL_LETTER_A_WITH_RING_ABOVE",
            "LATIN_SMALL_LETTER_AE",
            "LATIN_SMALL_LETTER_C_WITH_CEDILLA",
            "LATIN_SMALL_LETTER_E_WITH_GRAVE",
            "LATIN_SMALL_LETTER_E_WITH_ACUTE",
            "LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX",
            "LATIN_SMALL_LETTER_I_WITH_GRAVE",
            "LATIN_SMALL_LETTER_I_WITH_ACUTE",
            "LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX",
            "LATIN_SMALL_LETTER_ETH",
            "LATIN_SMALL_LETTER_N_WITH_TILDE",
            "LATIN_SMALL_LETTER_O_WITH_GRAVE",
            "LATIN_SMALL_LETTER_O_WITH_ACUTE",
            "LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX",
            "LATIN_SMALL_LETTER_O_WITH_TILDE",
            "DIVISION_SIGN",
            "LATIN_SMALL_LETTER_O_WITH_STROKE",
            "LATIN_SMALL_LETTER_U_WITH_GRAVE",
            "LATIN_SMALL_LETTER_U_WITH_ACUTE",
            "LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX",
            "LATIN_SMALL_LETTER_Y_WITH_ACUTE",
            "LATIN_SMALL_LETTER_THORN",
            "EURO_CURRENCY",
            "EURO_SIGN",
            "ANY_CHAR"
    };


}
