// $ANTLR 2.7.4: "latexencoder.g" -> "LatexEncoderLexer.java"$

package info.monitorenter.unicode.encoder.latex;

import antlr.*;

import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;

public class LatexEncoderLexer extends CharScanner implements LatexEncoderTokenTypes, TokenStream {
    public LatexEncoderLexer(InputStream in) {
        this(new ByteBuffer(in));
    }

    public LatexEncoderLexer(Reader in) {
        this(new CharBuffer(in));
    }

    public LatexEncoderLexer(InputBuffer ib) {
        this(new LexerSharedInputState(ib));
    }

    public LatexEncoderLexer(LexerSharedInputState state) {
        super(state);
        caseSensitiveLiterals = true;
        setCaseSensitive(true);
        literals = new Hashtable();
    }

    public Token nextToken() throws TokenStreamException {
        Token theRetToken = null;
        tryAgain:
        for (; ; ) {
            Token _token = null;
            int _ttype = Token.INVALID_TYPE;
            resetText();
            try {   // for char stream error handling
                try {   // for lexical error handling
                    if ((LA(1) == '"') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mQUOTATION_MARK(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '#') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mNUMBER_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '$') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mDOLLAR_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '%') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mPERCENT_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mAMPERSAND(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\'') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mAPOSTROPHE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '*') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mASTERISK(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '^') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mCIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '[') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLEFT_SQUARE_BRACKET(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == ']') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mRIGHT_SQUARE_BRACKET(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '_') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLOW_LINE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '{') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLEFT_CURLY_BRACKET(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '}') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mRIGHT_CURLY_BRACKET(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00a2') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mCENT_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00a3') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mPOUND_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00a9') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mCOPYRIGHT_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ae') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mREGISTERED_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00b0') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mDEGREE_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c0') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_A_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c1') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_A_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c2') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c3') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_A_WITH_TILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c5') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c6') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_AE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c7') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_C_WITH_CEDILLA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c8') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_E_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00c9') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_E_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ca') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00cc') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_I_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00cd') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_I_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ce') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d0') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_ETH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d1') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_N_WITH_TILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d2') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_O_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d3') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_O_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d4') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d5') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_O_WITH_TILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d7') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mMULTIPLICATION_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d8') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_O_WITH_STROKE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00d9') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_U_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00da') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_U_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00db') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00dd') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_Y_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00de') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_CAPITAL_LETTER_THORN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00df') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_SHARP_S(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e0') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_A_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e1') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_A_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e2') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e3') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_A_WITH_TILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e5') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_A_WITH_RING_ABOVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e6') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_AE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e7') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_C_WITH_CEDILLA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e8') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_E_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00e9') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_E_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ea') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ec') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_I_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ed') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_I_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00ee') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f0') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_ETH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f1') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_N_WITH_TILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f2') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_O_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f3') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_O_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f4') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f5') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_O_WITH_TILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f7') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mDIVISION_SIGN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f8') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_O_WITH_STROKE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00f9') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_U_WITH_GRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00fa') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_U_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00fb') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00fd') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_Y_WITH_ACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u00fe') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mLATIN_SMALL_LETTER_THORN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '\u20a0') && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mEURO_CURRENCY(true);
                        theRetToken = _returnToken;
                    } else if (((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mANY_CHAR(true);
                        theRetToken = _returnToken;
                    } else {
                        if (LA(1) == EOF_CHAR) {
                            uponEOF();
                            _returnToken = makeToken(Token.EOF_TYPE);
                        } else {
                            throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
                        }
                    }

                    if (_returnToken == null) continue tryAgain; // found SKIP token
                    _ttype = _returnToken.getType();
                    _ttype = testLiteralsTable(_ttype);
                    _returnToken.setType(_ttype);
                    return _returnToken;
                } catch (RecognitionException e) {
                    throw new TokenStreamRecognitionException(e);
                }
            } catch (CharStreamException cse) {
                if (cse instanceof CharStreamIOException) {
                    throw new TokenStreamIOException(((CharStreamIOException) cse).io);
                } else {
                    throw new TokenStreamException(cse.getMessage());
                }
            }
        }
    }

    public final void mQUOTATION_MARK(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = QUOTATION_MARK;
        int _saveIndex;

        match('\u0022');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNUMBER_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NUMBER_SIGN;
        int _saveIndex;

        match('\u0023');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDOLLAR_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DOLLAR_SIGN;
        int _saveIndex;

        match('\u0024');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPERCENT_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PERCENT_SIGN;
        int _saveIndex;

        match('\u0025');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAMPERSAND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AMPERSAND;
        int _saveIndex;

        match('\u0026');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAPOSTROPHE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = APOSTROPHE;
        int _saveIndex;

        match('\'');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mASTERISK(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ASTERISK;
        int _saveIndex;

        match('\u002A');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CIRCUMFLEX;
        int _saveIndex;

        match('\u005E');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLEFT_SQUARE_BRACKET(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LEFT_SQUARE_BRACKET;
        int _saveIndex;

        match('\u005B');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRIGHT_SQUARE_BRACKET(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RIGHT_SQUARE_BRACKET;
        int _saveIndex;

        match('\u005D');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLOW_LINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LOW_LINE;
        int _saveIndex;

        match('\u005F');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLEFT_CURLY_BRACKET(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LEFT_CURLY_BRACKET;
        int _saveIndex;

        match('\u007B');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRIGHT_CURLY_BRACKET(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RIGHT_CURLY_BRACKET;
        int _saveIndex;

        match('\u007D');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCENT_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CENT_SIGN;
        int _saveIndex;

        match('\u00A2');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPOUND_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = POUND_SIGN;
        int _saveIndex;

        match('\u00A3');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCOPYRIGHT_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = COPYRIGHT_SIGN;
        int _saveIndex;

        match('\u00A9');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mREGISTERED_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = REGISTERED_SIGN;
        int _saveIndex;

        match('\u00AE');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDEGREE_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DEGREE_SIGN;
        int _saveIndex;

        match('\u00B0');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_A_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_A_WITH_GRAVE;
        int _saveIndex;

        match('\u00C0');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_A_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_A_WITH_ACUTE;
        int _saveIndex;

        match('\u00C1');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_A_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00C2');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_A_WITH_TILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_A_WITH_TILDE;
        int _saveIndex;

        match('\u00C3');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_A_WITH_RING_ABOVE;
        int _saveIndex;

        match('\u00C5');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_AE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_AE;
        int _saveIndex;

        match('\u00C6');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_C_WITH_CEDILLA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_C_WITH_CEDILLA;
        int _saveIndex;

        match('\u00C7');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_E_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_E_WITH_GRAVE;
        int _saveIndex;

        match('\u00C8');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_E_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_E_WITH_ACUTE;
        int _saveIndex;

        match('\u00C9');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_E_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00CA');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_I_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_I_WITH_GRAVE;
        int _saveIndex;

        match('\u00CC');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_I_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_I_WITH_ACUTE;
        int _saveIndex;

        match('\u00CD');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_I_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00CE');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_ETH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_ETH;
        int _saveIndex;

        match('\u00D0');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_N_WITH_TILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_N_WITH_TILDE;
        int _saveIndex;

        match('\u00D1');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_O_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_O_WITH_GRAVE;
        int _saveIndex;

        match('\u00D2');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_O_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_O_WITH_ACUTE;
        int _saveIndex;

        match('\u00D3');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_O_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00D4');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_O_WITH_TILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_O_WITH_TILDE;
        int _saveIndex;

        match('\u00D5');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMULTIPLICATION_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MULTIPLICATION_SIGN;
        int _saveIndex;

        match('\u00D7');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_O_WITH_STROKE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_O_WITH_STROKE;
        int _saveIndex;

        match('\u00D8');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_U_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_U_WITH_GRAVE;
        int _saveIndex;

        match('\u00D9');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_U_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_U_WITH_ACUTE;
        int _saveIndex;

        match('\u00DA');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_U_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00DB');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_Y_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_Y_WITH_ACUTE;
        int _saveIndex;

        match('\u00DD');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_CAPITAL_LETTER_THORN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_CAPITAL_LETTER_THORN;
        int _saveIndex;

        match('\u00DE');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_SHARP_S(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_SHARP_S;
        int _saveIndex;

        match('\u00DF');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_A_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_A_WITH_GRAVE;
        int _saveIndex;

        match('\u00E0');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_A_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_A_WITH_ACUTE;
        int _saveIndex;

        match('\u00E1');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_A_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00E2');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_A_WITH_TILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_A_WITH_TILDE;
        int _saveIndex;

        match('\u00E3');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_A_WITH_RING_ABOVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_A_WITH_RING_ABOVE;
        int _saveIndex;

        match('\u00E5');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_AE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_AE;
        int _saveIndex;

        match('\u00E6');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_C_WITH_CEDILLA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_C_WITH_CEDILLA;
        int _saveIndex;

        match('\u00E7');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_E_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_E_WITH_GRAVE;
        int _saveIndex;

        match('\u00E8');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_E_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_E_WITH_ACUTE;
        int _saveIndex;

        match('\u00E9');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_E_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00EA');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_I_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_I_WITH_GRAVE;
        int _saveIndex;

        match('\u00EC');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_I_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_I_WITH_ACUTE;
        int _saveIndex;

        match('\u00ED');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_I_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00EE');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_ETH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_ETH;
        int _saveIndex;

        match('\u00F0');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_N_WITH_TILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_N_WITH_TILDE;
        int _saveIndex;

        match('\u00F1');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_O_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_O_WITH_GRAVE;
        int _saveIndex;

        match('\u00F2');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_O_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_O_WITH_ACUTE;
        int _saveIndex;

        match('\u00F3');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_O_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00F4');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_O_WITH_TILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_O_WITH_TILDE;
        int _saveIndex;

        match('\u00F5');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDIVISION_SIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DIVISION_SIGN;
        int _saveIndex;

        match('\u00F7');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_O_WITH_STROKE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_O_WITH_STROKE;
        int _saveIndex;

        match('\u00F8');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_U_WITH_GRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_U_WITH_GRAVE;
        int _saveIndex;

        match('\u00F9');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_U_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_U_WITH_ACUTE;
        int _saveIndex;

        match('\u00FA');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_U_WITH_CIRCUMFLEX;
        int _saveIndex;

        match('\u00FB');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_Y_WITH_ACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_Y_WITH_ACUTE;
        int _saveIndex;

        match('\u00FD');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLATIN_SMALL_LETTER_THORN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LATIN_SMALL_LETTER_THORN;
        int _saveIndex;

        match('\u00FE');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEURO_CURRENCY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EURO_CURRENCY;
        int _saveIndex;

        match('\u20A0');
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mANY_CHAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ANY_CHAR;
        int _saveIndex;

        if ((LA(1) == '\r') && (LA(2) == '\n')) {
            match('\r');
            match('\n');
            newline();
        } else if ((LA(1) == '\n') && (true) && (true) && (true) && (true) && (true) && (true)) {
            match('\n');
            newline();
        } else if (((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true) && (true) && (true) && (true) && (true) && (true)) {
            matchNot(EOF_CHAR);
        } else {
            throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
        }

        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }


}
