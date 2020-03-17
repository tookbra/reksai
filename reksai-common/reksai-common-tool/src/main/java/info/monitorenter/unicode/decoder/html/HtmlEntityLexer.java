// $ANTLR 2.7.4: "htmlentitydecoder.g" -> "HtmlEntityLexer.java"$

package info.monitorenter.unicode.decoder.html;

import antlr.*;
import antlr.collections.impl.BitSet;

import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;

public class HtmlEntityLexer extends CharScanner implements HtmlEntityDecoderTokenTypes, TokenStream {
    public HtmlEntityLexer(InputStream in) {
        this(new ByteBuffer(in));
    }

    public HtmlEntityLexer(Reader in) {
        this(new CharBuffer(in));
    }

    public HtmlEntityLexer(InputBuffer ib) {
        this(new LexerSharedInputState(ib));
    }

    public HtmlEntityLexer(LexerSharedInputState state) {
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
                    if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'u') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == 'e') && (LA(7) == 'n') && (LA(8) == ';')) {
                        mCURREN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'b') && (LA(3) == 'r') && (LA(4) == 'v') && (LA(5) == 'b') && (LA(6) == 'a') && (LA(7) == 'r') && (LA(8) == ';')) {
                        mBRVBAR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'l') && (LA(4) == 'u') && (LA(5) == 's') && (LA(6) == 'm') && (LA(7) == 'n') && (LA(8) == ';')) {
                        mPLUSMN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'f') && (LA(3) == 'r') && (LA(4) == 'a') && (LA(5) == 'c') && (LA(6) == '1') && (LA(7) == '4') && (LA(8) == ';')) {
                        mFRAC14(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'f') && (LA(3) == 'r') && (LA(4) == 'a') && (LA(5) == 'c') && (LA(6) == '1') && (LA(7) == '2') && (LA(8) == ';')) {
                        mFRAC12(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'f') && (LA(3) == 'r') && (LA(4) == 'a') && (LA(5) == 'c') && (LA(6) == '3') && (LA(7) == '4') && (LA(8) == ';')) {
                        mFRAC34(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'q') && (LA(4) == 'u') && (LA(5) == 'e') && (LA(6) == 's') && (LA(7) == 't') && (LA(8) == ';')) {
                        mIQUEST(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mAGRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mAACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'l') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mATILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'C') && (LA(3) == 'c') && (LA(4) == 'e') && (LA(5) == 'd') && (LA(6) == 'i') && (LA(7) == 'l') && (LA(8) == ';')) {
                        mCCEDIL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mEGRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mEACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'I') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mIGRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'I') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mIACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'N') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'l') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mNTILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mOGRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mOACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'l') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mOTILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 's') && (LA(4) == 'l') && (LA(5) == 'a') && (LA(6) == 's') && (LA(7) == 'h') && (LA(8) == ';')) {
                        mOSLASH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'U') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mUGRAVE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'U') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mUACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'Y') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mYACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mAGRAVE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mAACUTE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'l') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mATILDE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'c') && (LA(4) == 'e') && (LA(5) == 'd') && (LA(6) == 'i') && (LA(7) == 'l') && (LA(8) == ';')) {
                        mCCEDIL_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mEGRAVE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mEACUTE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mIGRAVE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mIACUTE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'l') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mNTILDE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mOGRAVE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mOACUTE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'l') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mOTILDE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'i') && (LA(4) == 'v') && (LA(5) == 'i') && (LA(6) == 'd') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mDIVIDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 's') && (LA(4) == 'l') && (LA(5) == 'a') && (LA(6) == 's') && (LA(7) == 'h') && (LA(8) == ';')) {
                        mOSLASH_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'g') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'v') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mUGRAVE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mUACUTE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'y') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'u') && (LA(6) == 't') && (LA(7) == 'e') && (LA(8) == ';')) {
                        mYACUTE_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 'p') && (LA(4) == 's') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == 'o') && (LA(8) == 'n')) {
                        mEPSILON(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'L') && (LA(3) == 'a') && (LA(4) == 'm') && (LA(5) == 'b') && (LA(6) == 'd') && (LA(7) == 'a') && (LA(8) == ';')) {
                        mLAMBDA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'm') && (LA(4) == 'i') && (LA(5) == 'c') && (LA(6) == 'r') && (LA(7) == 'o') && (LA(8) == 'n')) {
                        mOMICRON(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'U') && (LA(3) == 'p') && (LA(4) == 's') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == 'o') && (LA(8) == 'n')) {
                        mUPSILON(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'p') && (LA(4) == 's') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == 'o') && (LA(8) == 'n')) {
                        mEPSILON_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'a') && (LA(4) == 'm') && (LA(5) == 'b') && (LA(6) == 'd') && (LA(7) == 'a') && (LA(8) == ';')) {
                        mLAMBDA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'm') && (LA(4) == 'i') && (LA(5) == 'c') && (LA(6) == 'r') && (LA(7) == 'o') && (LA(8) == 'n')) {
                        mOMICRON_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'i') && (LA(4) == 'g') && (LA(5) == 'm') && (LA(6) == 'a') && (LA(7) == 'f') && (LA(8) == ';')) {
                        mSIGMAF_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'p') && (LA(4) == 's') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == 'o') && (LA(8) == 'n')) {
                        mUPSILON_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'h') && (LA(4) == 'e') && (LA(5) == 't') && (LA(6) == 'a') && (LA(7) == 's') && (LA(8) == 'y')) {
                        mTHETASYM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'h') && (LA(3) == 'e') && (LA(4) == 'l') && (LA(5) == 'l') && (LA(6) == 'i') && (LA(7) == 'p') && (LA(8) == ';')) {
                        mHELLIP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'w') && (LA(3) == 'e') && (LA(4) == 'i') && (LA(5) == 'e') && (LA(6) == 'r') && (LA(7) == 'p') && (LA(8) == ';')) {
                        mWEIERP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'l') && (LA(4) == 'e') && (LA(5) == 'f') && (LA(6) == 's') && (LA(7) == 'y') && (LA(8) == 'm')) {
                        mALEFSYM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'f') && (LA(3) == 'o') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == 'l') && (LA(7) == 'l') && (LA(8) == ';')) {
                        mFORALL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'o') && (LA(4) == 'w') && (LA(5) == 'a') && (LA(6) == 's') && (LA(7) == 't') && (LA(8) == ';')) {
                        mLOWAST(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'h') && (LA(4) == 'e') && (LA(5) == 'r') && (LA(6) == 'e') && (LA(7) == '4') && (LA(8) == ';')) {
                        mTHERE4(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 't') && (LA(4) == 'i') && (LA(5) == 'm') && (LA(6) == 'e') && (LA(7) == 's') && (LA(8) == ';')) {
                        mOTIMES(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'f') && (LA(4) == 'l') && (LA(5) == 'o') && (LA(6) == 'o') && (LA(7) == 'r') && (LA(8) == ';')) {
                        mLFLOOR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'f') && (LA(4) == 'l') && (LA(5) == 'o') && (LA(6) == 'o') && (LA(7) == 'r') && (LA(8) == ';')) {
                        mRFLOOR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'p') && (LA(4) == 'a') && (LA(5) == 'd') && (LA(6) == 'e') && (LA(7) == 's') && (LA(8) == ';')) {
                        mSPADES(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'h') && (LA(3) == 'e') && (LA(4) == 'a') && (LA(5) == 'r') && (LA(6) == 't') && (LA(7) == 's') && (LA(8) == ';')) {
                        mHEARTS(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'S') && (LA(3) == 'c') && (LA(4) == 'a') && (LA(5) == 'r') && (LA(6) == 'o') && (LA(7) == 'n') && (LA(8) == ';')) {
                        mSCARON(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'c') && (LA(4) == 'a') && (LA(5) == 'r') && (LA(6) == 'o') && (LA(7) == 'n') && (LA(8) == ';')) {
                        mSCARON_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'h') && (LA(4) == 'i') && (LA(5) == 'n') && (LA(6) == 's') && (LA(7) == 'p') && (LA(8) == ';')) {
                        mTHINSP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'a') && (LA(4) == 'g') && (LA(5) == 'g') && (LA(6) == 'e') && (LA(7) == 'r') && (LA(8) == ';')) {
                        mDAGGER_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'D') && (LA(3) == 'a') && (LA(4) == 'g') && (LA(5) == 'g') && (LA(6) == 'e') && (LA(7) == 'r') && (LA(8) == ';')) {
                        mDAGGER(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'e') && (LA(4) == 'r') && (LA(5) == 'm') && (LA(6) == 'i') && (LA(7) == 'l') && (LA(8) == ';')) {
                        mPERMIL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 's') && (LA(4) == 'a') && (LA(5) == 'q') && (LA(6) == 'u') && (LA(7) == 'o') && (LA(8) == ';')) {
                        mLSAQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 's') && (LA(4) == 'a') && (LA(5) == 'q') && (LA(6) == 'u') && (LA(7) == 'o') && (LA(8) == ';')) {
                        mRSAQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'e') && (LA(4) == 'x') && (LA(5) == 'c') && (LA(6) == 'l') && (LA(7) == ';') && (true)) {
                        mIEXCL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'o') && (LA(4) == 'u') && (LA(5) == 'n') && (LA(6) == 'd') && (LA(7) == ';') && (true)) {
                        mPOUND(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'a') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mLAQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'c') && (LA(4) == 'u') && (LA(5) == 't') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mACUTE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'm') && (LA(3) == 'i') && (LA(4) == 'c') && (LA(5) == 'r') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mMICRO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'm') && (LA(3) == 'i') && (LA(4) == 'd') && (LA(5) == 'd') && (LA(6) == 'o') && (LA(7) == 't') && (true)) {
                        mMIDDOT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'e') && (LA(4) == 'd') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == ';') && (true)) {
                        mCEDIL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'a') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mRAQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mACIRC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'r') && (LA(4) == 'i') && (LA(5) == 'n') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mARING(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'E') && (LA(4) == 'l') && (LA(5) == 'i') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mAELIG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mECIRC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'I') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mICIRC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mOCIRC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'i') && (LA(4) == 'm') && (LA(5) == 'e') && (LA(6) == 's') && (LA(7) == ';') && (true)) {
                        mTIMES(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'U') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mUCIRC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'T') && (LA(3) == 'H') && (LA(4) == 'O') && (LA(5) == 'R') && (LA(6) == 'N') && (LA(7) == ';') && (true)) {
                        mTHORN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'z') && (LA(4) == 'l') && (LA(5) == 'i') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mSZLIG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mACIRC_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'r') && (LA(4) == 'i') && (LA(5) == 'n') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mARING_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'e') && (LA(4) == 'l') && (LA(5) == 'i') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mAELIG_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mECIRC_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mICIRC_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mOCIRC_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'c') && (LA(4) == 'i') && (LA(5) == 'r') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mUCIRC_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'h') && (LA(4) == 'o') && (LA(5) == 'r') && (LA(6) == 'n') && (LA(7) == ';') && (true)) {
                        mTHORN_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'l') && (LA(4) == 'p') && (LA(5) == 'h') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mALPHA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'G') && (LA(3) == 'a') && (LA(4) == 'm') && (LA(5) == 'm') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mGAMMA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'D') && (LA(3) == 'e') && (LA(4) == 'l') && (LA(5) == 't') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mDELTA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'T') && (LA(3) == 'h') && (LA(4) == 'e') && (LA(5) == 't') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mTHETA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'K') && (LA(3) == 'a') && (LA(4) == 'p') && (LA(5) == 'p') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mKAPPA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'S') && (LA(3) == 'i') && (LA(4) == 'g') && (LA(5) == 'm') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mSIGMA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'm') && (LA(4) == 'e') && (LA(5) == 'g') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mOMEGA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'l') && (LA(4) == 'p') && (LA(5) == 'h') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mALPHA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'g') && (LA(3) == 'a') && (LA(4) == 'm') && (LA(5) == 'm') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mGAMMA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'e') && (LA(4) == 'l') && (LA(5) == 't') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mDELTA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'h') && (LA(4) == 'e') && (LA(5) == 't') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mTHETA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'k') && (LA(3) == 'a') && (LA(4) == 'p') && (LA(5) == 'p') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mKAPPA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'i') && (LA(4) == 'g') && (LA(5) == 'm') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mSIGMA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'm') && (LA(4) == 'e') && (LA(5) == 'g') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mOMEGA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'p') && (LA(4) == 's') && (LA(5) == 'i') && (LA(6) == 'h') && (LA(7) == ';') && (true)) {
                        mUPSIH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'r') && (LA(4) == 'i') && (LA(5) == 'm') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mPRIME_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'P') && (LA(3) == 'r') && (LA(4) == 'i') && (LA(5) == 'm') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mPRIME(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'l') && (LA(4) == 'i') && (LA(5) == 'n') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mOLINE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'f') && (LA(3) == 'r') && (LA(4) == 'a') && (LA(5) == 's') && (LA(6) == 'l') && (LA(7) == ';') && (true)) {
                        mFRASL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'm') && (LA(4) == 'a') && (LA(5) == 'g') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mIMAGE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'r') && (LA(4) == 'a') && (LA(5) == 'd') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mTRADE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'r') && (LA(4) == 'a') && (LA(5) == 'r') && (LA(6) == 'r') && (LA(7) == ';') && (true)) {
                        mCRARR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'x') && (LA(4) == 'i') && (LA(5) == 's') && (LA(6) == 't') && (LA(7) == ';') && (true)) {
                        mEXIST(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'm') && (LA(4) == 'p') && (LA(5) == 't') && (LA(6) == 'y') && (LA(7) == ';') && (true)) {
                        mEMPTY(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'a') && (LA(4) == 'b') && (LA(5) == 'l') && (LA(6) == 'a') && (LA(7) == ';') && (true)) {
                        mNABLA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'o') && (LA(4) == 't') && (LA(5) == 'i') && (LA(6) == 'n') && (LA(7) == ';') && (true)) {
                        mNOTIN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'm') && (LA(3) == 'i') && (LA(4) == 'n') && (LA(5) == 'u') && (LA(6) == 's') && (LA(7) == ';') && (true)) {
                        mMINUS(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'a') && (LA(4) == 'd') && (LA(5) == 'i') && (LA(6) == 'c') && (LA(7) == ';') && (true)) {
                        mRADIC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'n') && (LA(4) == 'f') && (LA(5) == 'i') && (LA(6) == 'n') && (LA(7) == ';') && (true)) {
                        mINFIN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 's') && (LA(4) == 'y') && (LA(5) == 'm') && (LA(6) == 'p') && (LA(7) == ';') && (true)) {
                        mASYMP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'q') && (LA(4) == 'u') && (LA(5) == 'i') && (LA(6) == 'v') && (LA(7) == ';') && (true)) {
                        mEQUIV(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'p') && (LA(4) == 'l') && (LA(5) == 'u') && (LA(6) == 's') && (LA(7) == ';') && (true)) {
                        mOPLUS(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'c') && (LA(4) == 'e') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == ';') && (true)) {
                        mLCEIL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'c') && (LA(4) == 'e') && (LA(5) == 'i') && (LA(6) == 'l') && (LA(7) == ';') && (true)) {
                        mRCEIL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'l') && (LA(4) == 'u') && (LA(5) == 'b') && (LA(6) == 's') && (LA(7) == ';') && (true)) {
                        mCLUBS(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'i') && (LA(4) == 'a') && (LA(5) == 'm') && (LA(6) == 's') && (LA(7) == ';') && (true)) {
                        mDIAMS(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'E') && (LA(4) == 'l') && (LA(5) == 'i') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mOELIG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'e') && (LA(4) == 'l') && (LA(5) == 'i') && (LA(6) == 'g') && (LA(7) == ';') && (true)) {
                        mOELIG_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'i') && (LA(4) == 'l') && (LA(5) == 'd') && (LA(6) == 'e') && (LA(7) == ';') && (true)) {
                        mTILDE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'd') && (LA(4) == 'a') && (LA(5) == 's') && (LA(6) == 'h') && (LA(7) == ';') && (true)) {
                        mNDASH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'm') && (LA(3) == 'd') && (LA(4) == 'a') && (LA(5) == 's') && (LA(6) == 'h') && (LA(7) == ';') && (true)) {
                        mMDASH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 's') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mLSQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 's') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mRSQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'b') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mSBQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'd') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mLDQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'd') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mRDQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'b') && (LA(3) == 'd') && (LA(4) == 'q') && (LA(5) == 'u') && (LA(6) == 'o') && (LA(7) == ';') && (true)) {
                        mBDQUO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'b') && (LA(4) == 's') && (LA(5) == 'p') && (LA(6) == ';') && (true) && (true)) {
                        mNBSP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'e') && (LA(4) == 'n') && (LA(5) == 't') && (LA(6) == ';') && (true) && (true)) {
                        mCENT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'e') && (LA(4) == 'c') && (LA(5) == 't') && (LA(6) == ';') && (true) && (true)) {
                        mSECT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'o') && (LA(4) == 'p') && (LA(5) == 'y') && (LA(6) == ';') && (true) && (true)) {
                        mCOPY(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'r') && (LA(4) == 'd') && (LA(5) == 'f') && (LA(6) == ';') && (true) && (true)) {
                        mORDF(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'm') && (LA(3) == 'a') && (LA(4) == 'c') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mMACR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'p') && (LA(5) == '2') && (LA(6) == ';') && (true) && (true)) {
                        mSUP2(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'p') && (LA(5) == '3') && (LA(6) == ';') && (true) && (true)) {
                        mSUP3(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mPARA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'p') && (LA(5) == '1') && (LA(6) == ';') && (true) && (true)) {
                        mSUP1(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'r') && (LA(4) == 'd') && (LA(5) == 'm') && (LA(6) == ';') && (true) && (true)) {
                        mORDM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'A') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mAUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mEUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'I') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mIUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'O') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mOUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'U') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mUUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mAUML_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mEUML_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mIUML_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mOUML_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mUUML_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'y') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mYUML_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'B') && (LA(3) == 'e') && (LA(4) == 't') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mBETA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'Z') && (LA(3) == 'e') && (LA(4) == 't') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mZETA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'I') && (LA(3) == 'o') && (LA(4) == 't') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mIOTA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'b') && (LA(3) == 'e') && (LA(4) == 't') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mBETA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'z') && (LA(3) == 'e') && (LA(4) == 't') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mZETA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'o') && (LA(4) == 't') && (LA(5) == 'a') && (LA(6) == ';') && (true) && (true)) {
                        mIOTA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'b') && (LA(3) == 'u') && (LA(4) == 'l') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mBULL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'e') && (LA(4) == 'a') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mREAL(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mLARR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mUARR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mRARR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mDARR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'h') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mHARR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'A') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mLARR_D(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'A') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mUARR_D(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'A') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mRARR_D(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'A') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mDARR_D(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'h') && (LA(3) == 'A') && (LA(4) == 'r') && (LA(5) == 'r') && (LA(6) == ';') && (true) && (true)) {
                        mHARR_D(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'a') && (LA(4) == 'r') && (LA(5) == 't') && (LA(6) == ';') && (true) && (true)) {
                        mPART(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 's') && (LA(4) == 'i') && (LA(5) == 'n') && (LA(6) == ';') && (true) && (true)) {
                        mISIN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'r') && (LA(4) == 'o') && (LA(5) == 'd') && (LA(6) == ';') && (true) && (true)) {
                        mPROD(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'r') && (LA(4) == 'o') && (LA(5) == 'p') && (LA(6) == ';') && (true) && (true)) {
                        mPROP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'o') && (LA(4) == 'n') && (LA(5) == 'g') && (LA(6) == ';') && (true) && (true)) {
                        mCONG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 's') && (LA(4) == 'u') && (LA(5) == 'b') && (LA(6) == ';') && (true) && (true)) {
                        mNSUB(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'b') && (LA(5) == 'e') && (LA(6) == ';') && (true) && (true)) {
                        mSUBE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'p') && (LA(5) == 'e') && (LA(6) == ';') && (true) && (true)) {
                        mSUPE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'e') && (LA(4) == 'r') && (LA(5) == 'p') && (LA(6) == ';') && (true) && (true)) {
                        mPERP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'd') && (LA(4) == 'o') && (LA(5) == 't') && (LA(6) == ';') && (true) && (true)) {
                        mSDOT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'a') && (LA(4) == 'n') && (LA(5) == 'g') && (LA(6) == ';') && (true) && (true)) {
                        mLANG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'a') && (LA(4) == 'n') && (LA(5) == 'g') && (LA(6) == ';') && (true) && (true)) {
                        mRANG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'q') && (LA(3) == 'u') && (LA(4) == 'o') && (LA(5) == 't') && (LA(6) == ';') && (true) && (true)) {
                        mQUOT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'Y') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == 'l') && (LA(6) == ';') && (true) && (true)) {
                        mYUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'i') && (LA(4) == 'r') && (LA(5) == 'c') && (LA(6) == ';') && (true) && (true)) {
                        mCIRC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'n') && (LA(4) == 's') && (LA(5) == 'p') && (LA(6) == ';') && (true) && (true)) {
                        mENSP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'm') && (LA(4) == 's') && (LA(5) == 'p') && (LA(6) == ';') && (true) && (true)) {
                        mEMSP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'z') && (LA(3) == 'w') && (LA(4) == 'n') && (LA(5) == 'j') && (LA(6) == ';') && (true) && (true)) {
                        mZWNJ(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 'u') && (LA(4) == 'r') && (LA(5) == 'o') && (LA(6) == ';') && (true) && (true)) {
                        mEURO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'y') && (LA(3) == 'e') && (LA(4) == 'n') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mYEN(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'u') && (LA(3) == 'm') && (LA(4) == 'l') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mUML(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'o') && (LA(4) == 't') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mNOT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'h') && (LA(4) == 'y') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mSHY(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'e') && (LA(4) == 'g') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mREG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'd') && (LA(3) == 'e') && (LA(4) == 'g') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mDEG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 'T') && (LA(4) == 'H') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mETH(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 't') && (LA(4) == 'h') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mETH_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'E') && (LA(3) == 't') && (LA(4) == 'a') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mETA(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'R') && (LA(3) == 'h') && (LA(4) == 'o') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mRHO(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'T') && (LA(3) == 'a') && (LA(4) == 'u') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mTAU(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'P') && (LA(3) == 'h') && (LA(4) == 'i') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mPHI(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'C') && (LA(3) == 'h') && (LA(4) == 'i') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mCHI(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'P') && (LA(3) == 's') && (LA(4) == 'i') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mPSI(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'e') && (LA(3) == 't') && (LA(4) == 'a') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mETA_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'h') && (LA(4) == 'o') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mRHO_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 't') && (LA(3) == 'a') && (LA(4) == 'u') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mTAU_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'h') && (LA(4) == 'i') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mPHI_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'h') && (LA(4) == 'i') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mCHI_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 's') && (LA(4) == 'i') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mPSI_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'i') && (LA(4) == 'v') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mPIV(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'm') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mSUM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'n') && (LA(4) == 'g') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mANG(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'n') && (LA(4) == 'd') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mAND(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'a') && (LA(4) == 'p') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mCAP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'c') && (LA(3) == 'u') && (LA(4) == 'p') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mCUP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'i') && (LA(3) == 'n') && (LA(4) == 't') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mINT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'i') && (LA(4) == 'm') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mSIM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'b') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mSUB(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 's') && (LA(3) == 'u') && (LA(4) == 'p') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mSUP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'o') && (LA(4) == 'z') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mLOZ(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'a') && (LA(3) == 'm') && (LA(4) == 'p') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mAMP(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'z') && (LA(3) == 'w') && (LA(4) == 'j') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mZWJ(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'r') && (LA(4) == 'm') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mLRM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'r') && (LA(3) == 'l') && (LA(4) == 'm') && (LA(5) == ';') && (true) && (true) && (true)) {
                        mRLM(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == '#') && (LA(3) == 'X' || LA(3) == 'x') && (_tokenSet_0.member(LA(4))) && (_tokenSet_1.member(LA(5))) && (true) && (true) && (true)) {
                        mNCR_H(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'M') && (LA(3) == 'u') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mMU(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'N') && (LA(3) == 'u') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mNU(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'X') && (LA(3) == 'i') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mXI(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'P') && (LA(3) == 'i') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mPI(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'm') && (LA(3) == 'u') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mMU_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'u') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mNU_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'x') && (LA(3) == 'i') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mXI_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'p') && (LA(3) == 'i') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mPI_LC(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'i') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mNI(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'o') && (LA(3) == 'r') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mOR(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'n') && (LA(3) == 'e') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mNE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 'e') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mLE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'g') && (LA(3) == 'e') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mGE(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'l') && (LA(3) == 't') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mLT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == 'g') && (LA(3) == 't') && (LA(4) == ';') && (true) && (true) && (true) && (true)) {
                        mGT(true);
                        theRetToken = _returnToken;
                    } else if ((LA(1) == '&') && (LA(2) == '#') && ((LA(3) >= '0' && LA(3) <= '9')) && (_tokenSet_2.member(LA(4))) && (true) && (true) && (true) && (true)) {
                        mNCR_D(true);
                        theRetToken = _returnToken;
                    } else if (((LA(1) >= '\u0000' && LA(1) <= '\ufffe')) && (true) && (true) && (true) && (true) && (true) && (true) && (true)) {
                        mWORD(true);
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
                    reportError(e);
                    consume();
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

    public final void mNBSP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NBSP;
        int _saveIndex;

        try {      // for error handling
            match("&nbsp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIEXCL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IEXCL;
        int _saveIndex;

        try {      // for error handling
            match("&iexcl;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CENT;
        int _saveIndex;

        try {      // for error handling
            match("&cent;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPOUND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = POUND;
        int _saveIndex;

        try {      // for error handling
            match("&pound;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCURREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CURREN;
        int _saveIndex;

        try {      // for error handling
            match("&curren;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mYEN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = YEN;
        int _saveIndex;

        try {      // for error handling
            match("&yen;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mBRVBAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = BRVBAR;
        int _saveIndex;

        try {      // for error handling
            match("&brvbar;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSECT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SECT;
        int _saveIndex;

        try {      // for error handling
            match("&sect;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UML;
        int _saveIndex;

        try {      // for error handling
            match("&uml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCOPY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = COPY;
        int _saveIndex;

        try {      // for error handling
            match("&copy;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mORDF(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ORDF;
        int _saveIndex;

        try {      // for error handling
            match("&ordf;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LAQUO;
        int _saveIndex;

        try {      // for error handling
            match("&laquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NOT;
        int _saveIndex;

        try {      // for error handling
            match("&not;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSHY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SHY;
        int _saveIndex;

        try {      // for error handling
            match("&shy;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mREG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = REG;
        int _saveIndex;

        try {      // for error handling
            match("&reg;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMACR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MACR;
        int _saveIndex;

        try {      // for error handling
            match("&macr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDEG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DEG;
        int _saveIndex;

        try {      // for error handling
            match("&deg;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPLUSMN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PLUSMN;
        int _saveIndex;

        try {      // for error handling
            match("&plusmn;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUP2(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUP2;
        int _saveIndex;

        try {      // for error handling
            match("&sup2;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUP3(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUP3;
        int _saveIndex;

        try {      // for error handling
            match("&sup3;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&acute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMICRO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MICRO;
        int _saveIndex;

        try {      // for error handling
            match("&micro;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPARA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PARA;
        int _saveIndex;

        try {      // for error handling
            match("&para;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMIDDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MIDDOT;
        int _saveIndex;

        try {      // for error handling
            match("&middot");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCEDIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CEDIL;
        int _saveIndex;

        try {      // for error handling
            match("&cedil;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUP1(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUP1;
        int _saveIndex;

        try {      // for error handling
            match("&sup1;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mORDM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ORDM;
        int _saveIndex;

        try {      // for error handling
            match("&ordm;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RAQUO;
        int _saveIndex;

        try {      // for error handling
            match("&raquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mFRAC14(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = FRAC14;
        int _saveIndex;

        try {      // for error handling
            match("&frac14;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mFRAC12(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = FRAC12;
        int _saveIndex;

        try {      // for error handling
            match("&frac12;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mFRAC34(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = FRAC34;
        int _saveIndex;

        try {      // for error handling
            match("&frac34;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIQUEST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IQUEST;
        int _saveIndex;

        try {      // for error handling
            match("&iquest;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AGRAVE;
        int _saveIndex;

        try {      // for error handling
            match("&Agrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&Aacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mACIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ACIRC;
        int _saveIndex;

        try {      // for error handling
            match("&Acirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mATILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ATILDE;
        int _saveIndex;

        try {      // for error handling
            match("&Atilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AUML;
        int _saveIndex;

        try {      // for error handling
            match("&Auml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mARING(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ARING;
        int _saveIndex;

        try {      // for error handling
            match("&Aring;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAELIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AELIG;
        int _saveIndex;

        try {      // for error handling
            match("&AElig;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCCEDIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CCEDIL;
        int _saveIndex;

        try {      // for error handling
            match("&Ccedil;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EGRAVE;
        int _saveIndex;

        try {      // for error handling
            match("&Egrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&Eacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mECIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ECIRC;
        int _saveIndex;

        try {      // for error handling
            match("&Ecirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EUML;
        int _saveIndex;

        try {      // for error handling
            match("&Euml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IGRAVE;
        int _saveIndex;

        try {      // for error handling
            match("&Igrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&Iacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mICIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ICIRC;
        int _saveIndex;

        try {      // for error handling
            match("&Icirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IUML;
        int _saveIndex;

        try {      // for error handling
            match("&Iuml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mETH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ETH;
        int _saveIndex;

        try {      // for error handling
            match("&ETH;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NTILDE;
        int _saveIndex;

        try {      // for error handling
            match("&Ntilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OGRAVE;
        int _saveIndex;

        try {      // for error handling
            match("&Ograve;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&Oacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OCIRC;
        int _saveIndex;

        try {      // for error handling
            match("&Ocirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OTILDE;
        int _saveIndex;

        try {      // for error handling
            match("&Otilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OUML;
        int _saveIndex;

        try {      // for error handling
            match("&Ouml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTIMES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = TIMES;
        int _saveIndex;

        try {      // for error handling
            match("&times;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOSLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OSLASH;
        int _saveIndex;

        try {      // for error handling
            match("&Oslash;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUGRAVE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UGRAVE;
        int _saveIndex;

        try {      // for error handling
            match("&Ugrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&Uacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UCIRC;
        int _saveIndex;

        try {      // for error handling
            match("&Ucirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UUML;
        int _saveIndex;

        try {      // for error handling
            match("&Uuml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mYACUTE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = YACUTE;
        int _saveIndex;

        try {      // for error handling
            match("&Yacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHORN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THORN;
        int _saveIndex;

        try {      // for error handling
            match("&THORN;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSZLIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SZLIG;
        int _saveIndex;

        try {      // for error handling
            match("&szlig;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AGRAVE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&agrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AACUTE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&aacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mACIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ACIRC_LC;
        int _saveIndex;

        try {      // for error handling
            match("&acirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mATILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ATILDE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&atilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AUML_LC;
        int _saveIndex;

        try {      // for error handling
            match("&auml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mARING_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ARING_LC;
        int _saveIndex;

        try {      // for error handling
            match("&aring;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAELIG_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AELIG_LC;
        int _saveIndex;

        try {      // for error handling
            match("&aelig;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCCEDIL_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CCEDIL_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ccedil;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EGRAVE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&egrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EACUTE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&eacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mECIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ECIRC_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ecirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EUML_LC;
        int _saveIndex;

        try {      // for error handling
            match("&euml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IGRAVE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&igrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IACUTE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&iacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mICIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ICIRC_LC;
        int _saveIndex;

        try {      // for error handling
            match("&icirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IUML_LC;
        int _saveIndex;

        try {      // for error handling
            match("&iuml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mETH_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ETH_LC;
        int _saveIndex;

        try {      // for error handling
            match("&eth;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNTILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NTILDE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ntilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OGRAVE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ograve;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OACUTE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&oacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOCIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OCIRC_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ocirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOTILDE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OTILDE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&otilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OUML_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ouml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDIVIDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DIVIDE;
        int _saveIndex;

        try {      // for error handling
            match("&divide;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOSLASH_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OSLASH_LC;
        int _saveIndex;

        try {      // for error handling
            match("&oslash;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUGRAVE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UGRAVE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ugrave;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UACUTE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&uacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUCIRC_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UCIRC_LC;
        int _saveIndex;

        try {      // for error handling
            match("&ucirc;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UUML_LC;
        int _saveIndex;

        try {      // for error handling
            match("&uuml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mYACUTE_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = YACUTE_LC;
        int _saveIndex;

        try {      // for error handling
            match("&yacute;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHORN_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THORN_LC;
        int _saveIndex;

        try {      // for error handling
            match("&thorn;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mYUML_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = YUML_LC;
        int _saveIndex;

        try {      // for error handling
            match("&yuml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mALPHA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ALPHA;
        int _saveIndex;

        try {      // for error handling
            match("&Alpha;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mBETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = BETA;
        int _saveIndex;

        try {      // for error handling
            match("&Beta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mGAMMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = GAMMA;
        int _saveIndex;

        try {      // for error handling
            match("&Gamma;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDELTA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DELTA;
        int _saveIndex;

        try {      // for error handling
            match("&Delta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEPSILON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EPSILON;
        int _saveIndex;

        try {      // for error handling
            match("&Epsilon;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mZETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ZETA;
        int _saveIndex;

        try {      // for error handling
            match("&Zeta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ETA;
        int _saveIndex;

        try {      // for error handling
            match("&Eta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHETA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THETA;
        int _saveIndex;

        try {      // for error handling
            match("&Theta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIOTA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IOTA;
        int _saveIndex;

        try {      // for error handling
            match("&Iota;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mKAPPA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = KAPPA;
        int _saveIndex;

        try {      // for error handling
            match("&Kappa;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLAMBDA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LAMBDA;
        int _saveIndex;

        try {      // for error handling
            match("&Lambda;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MU;
        int _saveIndex;

        try {      // for error handling
            match("&Mu;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NU;
        int _saveIndex;

        try {      // for error handling
            match("&Nu;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mXI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = XI;
        int _saveIndex;

        try {      // for error handling
            match("&Xi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOMICRON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OMICRON;
        int _saveIndex;

        try {      // for error handling
            match("&Omicron;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PI;
        int _saveIndex;

        try {      // for error handling
            match("&Pi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRHO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RHO;
        int _saveIndex;

        try {      // for error handling
            match("&Rho;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSIGMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SIGMA;
        int _saveIndex;

        try {      // for error handling
            match("&Sigma;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTAU(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = TAU;
        int _saveIndex;

        try {      // for error handling
            match("&Tau;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUPSILON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UPSILON;
        int _saveIndex;

        try {      // for error handling
            match("&Upsilon;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPHI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PHI;
        int _saveIndex;

        try {      // for error handling
            match("&Phi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCHI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CHI;
        int _saveIndex;

        try {      // for error handling
            match("&Chi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPSI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PSI;
        int _saveIndex;

        try {      // for error handling
            match("&Psi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOMEGA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OMEGA;
        int _saveIndex;

        try {      // for error handling
            match("&Omega;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mALPHA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ALPHA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&alpha;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mBETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = BETA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&beta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mGAMMA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = GAMMA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&gamma;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDELTA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DELTA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&delta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEPSILON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EPSILON_LC;
        int _saveIndex;

        try {      // for error handling
            match("&epsilon;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mZETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ZETA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&zeta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ETA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&eta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHETA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THETA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&theta;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIOTA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IOTA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&iota;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mKAPPA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = KAPPA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&kappa;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLAMBDA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LAMBDA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&lambda;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MU_LC;
        int _saveIndex;

        try {      // for error handling
            match("&mu;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NU_LC;
        int _saveIndex;

        try {      // for error handling
            match("&nu;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mXI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = XI_LC;
        int _saveIndex;

        try {      // for error handling
            match("&xi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOMICRON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OMICRON_LC;
        int _saveIndex;

        try {      // for error handling
            match("&omicron;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PI_LC;
        int _saveIndex;

        try {      // for error handling
            match("&pi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRHO_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RHO_LC;
        int _saveIndex;

        try {      // for error handling
            match("&rho;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSIGMAF_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SIGMAF_LC;
        int _saveIndex;

        try {      // for error handling
            match("&sigmaf;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSIGMA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SIGMA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&sigma;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTAU_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = TAU_LC;
        int _saveIndex;

        try {      // for error handling
            match("&tau;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUPSILON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UPSILON_LC;
        int _saveIndex;

        try {      // for error handling
            match("&upsilon;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPHI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PHI_LC;
        int _saveIndex;

        try {      // for error handling
            match("&phi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCHI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CHI_LC;
        int _saveIndex;

        try {      // for error handling
            match("&chi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPSI_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PSI_LC;
        int _saveIndex;

        try {      // for error handling
            match("&psi;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOMEGA_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OMEGA_LC;
        int _saveIndex;

        try {      // for error handling
            match("&omega;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHETASYM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THETASYM;
        int _saveIndex;

        try {      // for error handling
            match("&thetasym;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUPSIH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UPSIH;
        int _saveIndex;

        try {      // for error handling
            match("&upsih;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PIV;
        int _saveIndex;

        try {      // for error handling
            match("&piv;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mBULL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = BULL;
        int _saveIndex;

        try {      // for error handling
            match("&bull;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mHELLIP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = HELLIP;
        int _saveIndex;

        try {      // for error handling
            match("&hellip;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPRIME_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PRIME_LC;
        int _saveIndex;

        try {      // for error handling
            match("&prime;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPRIME(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PRIME;
        int _saveIndex;

        try {      // for error handling
            match("&Prime;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OLINE;
        int _saveIndex;

        try {      // for error handling
            match("&oline;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mFRASL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = FRASL;
        int _saveIndex;

        try {      // for error handling
            match("&frasl;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mWEIERP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = WEIERP;
        int _saveIndex;

        try {      // for error handling
            match("&weierp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mIMAGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = IMAGE;
        int _saveIndex;

        try {      // for error handling
            match("&image;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mREAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = REAL;
        int _saveIndex;

        try {      // for error handling
            match("&real;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTRADE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = TRADE;
        int _saveIndex;

        try {      // for error handling
            match("&trade;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mALEFSYM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ALEFSYM;
        int _saveIndex;

        try {      // for error handling
            match("&alefsym;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LARR;
        int _saveIndex;

        try {      // for error handling
            match("&larr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UARR;
        int _saveIndex;

        try {      // for error handling
            match("&uarr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RARR;
        int _saveIndex;

        try {      // for error handling
            match("&rarr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DARR;
        int _saveIndex;

        try {      // for error handling
            match("&darr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mHARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = HARR;
        int _saveIndex;

        try {      // for error handling
            match("&harr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCRARR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CRARR;
        int _saveIndex;

        try {      // for error handling
            match("&crarr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LARR_D;
        int _saveIndex;

        try {      // for error handling
            match("&lArr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mUARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = UARR_D;
        int _saveIndex;

        try {      // for error handling
            match("&uArr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RARR_D;
        int _saveIndex;

        try {      // for error handling
            match("&rArr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DARR_D;
        int _saveIndex;

        try {      // for error handling
            match("&dArr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mHARR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = HARR_D;
        int _saveIndex;

        try {      // for error handling
            match("&hArr;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mFORALL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = FORALL;
        int _saveIndex;

        try {      // for error handling
            match("&forall;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPART(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PART;
        int _saveIndex;

        try {      // for error handling
            match("&part;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEXIST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EXIST;
        int _saveIndex;

        try {      // for error handling
            match("&exist;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEMPTY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EMPTY;
        int _saveIndex;

        try {      // for error handling
            match("&empty;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNABLA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NABLA;
        int _saveIndex;

        try {      // for error handling
            match("&nabla;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mISIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ISIN;
        int _saveIndex;

        try {      // for error handling
            match("&isin;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNOTIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NOTIN;
        int _saveIndex;

        try {      // for error handling
            match("&notin;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NI;
        int _saveIndex;

        try {      // for error handling
            match("&ni;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPROD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PROD;
        int _saveIndex;

        try {      // for error handling
            match("&prod;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUM;
        int _saveIndex;

        try {      // for error handling
            match("&sum;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMINUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MINUS;
        int _saveIndex;

        try {      // for error handling
            match("&minus;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLOWAST(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LOWAST;
        int _saveIndex;

        try {      // for error handling
            match("&lowast;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRADIC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RADIC;
        int _saveIndex;

        try {      // for error handling
            match("&radic;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPROP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PROP;
        int _saveIndex;

        try {      // for error handling
            match("&prop;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mINFIN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = INFIN;
        int _saveIndex;

        try {      // for error handling
            match("&infin;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ANG;
        int _saveIndex;

        try {      // for error handling
            match("&ang;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAND(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AND;
        int _saveIndex;

        try {      // for error handling
            match("&and;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OR;
        int _saveIndex;

        try {      // for error handling
            match("&or;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCAP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CAP;
        int _saveIndex;

        try {      // for error handling
            match("&cap;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CUP;
        int _saveIndex;

        try {      // for error handling
            match("&cup;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mINT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = INT;
        int _saveIndex;

        try {      // for error handling
            match("&int;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHERE4(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THERE4;
        int _saveIndex;

        try {      // for error handling
            match("&there4;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSIM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SIM;
        int _saveIndex;

        try {      // for error handling
            match("&sim;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCONG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CONG;
        int _saveIndex;

        try {      // for error handling
            match("&cong;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mASYMP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ASYMP;
        int _saveIndex;

        try {      // for error handling
            match("&asymp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NE;
        int _saveIndex;

        try {      // for error handling
            match("&ne;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEQUIV(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EQUIV;
        int _saveIndex;

        try {      // for error handling
            match("&equiv;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LE;
        int _saveIndex;

        try {      // for error handling
            match("&le;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mGE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = GE;
        int _saveIndex;

        try {      // for error handling
            match("&ge;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUB;
        int _saveIndex;

        try {      // for error handling
            match("&sub;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUP;
        int _saveIndex;

        try {      // for error handling
            match("&sup;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNSUB(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NSUB;
        int _saveIndex;

        try {      // for error handling
            match("&nsub;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUBE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUBE;
        int _saveIndex;

        try {      // for error handling
            match("&sube;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSUPE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SUPE;
        int _saveIndex;

        try {      // for error handling
            match("&supe;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OPLUS;
        int _saveIndex;

        try {      // for error handling
            match("&oplus;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOTIMES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OTIMES;
        int _saveIndex;

        try {      // for error handling
            match("&otimes;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPERP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PERP;
        int _saveIndex;

        try {      // for error handling
            match("&perp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SDOT;
        int _saveIndex;

        try {      // for error handling
            match("&sdot;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLCEIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LCEIL;
        int _saveIndex;

        try {      // for error handling
            match("&lceil;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRCEIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RCEIL;
        int _saveIndex;

        try {      // for error handling
            match("&rceil;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLFLOOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LFLOOR;
        int _saveIndex;

        try {      // for error handling
            match("&lfloor;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRFLOOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RFLOOR;
        int _saveIndex;

        try {      // for error handling
            match("&rfloor;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LANG;
        int _saveIndex;

        try {      // for error handling
            match("&lang;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRANG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RANG;
        int _saveIndex;

        try {      // for error handling
            match("&rang;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLOZ(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LOZ;
        int _saveIndex;

        try {      // for error handling
            match("&loz;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSPADES(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SPADES;
        int _saveIndex;

        try {      // for error handling
            match("&spades;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCLUBS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CLUBS;
        int _saveIndex;

        try {      // for error handling
            match("&clubs;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mHEARTS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = HEARTS;
        int _saveIndex;

        try {      // for error handling
            match("&hearts;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDIAMS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DIAMS;
        int _saveIndex;

        try {      // for error handling
            match("&diams;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mQUOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = QUOT;
        int _saveIndex;

        try {      // for error handling
            match("&quot;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mAMP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = AMP;
        int _saveIndex;

        try {      // for error handling
            match("&amp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LT;
        int _saveIndex;

        try {      // for error handling
            match("&lt;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mGT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = GT;
        int _saveIndex;

        try {      // for error handling
            match("&gt;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOELIG(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OELIG;
        int _saveIndex;

        try {      // for error handling
            match("&OElig;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mOELIG_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = OELIG_LC;
        int _saveIndex;

        try {      // for error handling
            match("&oelig;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSCARON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SCARON;
        int _saveIndex;

        try {      // for error handling
            match("&Scaron;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSCARON_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SCARON_LC;
        int _saveIndex;

        try {      // for error handling
            match("&scaron;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mYUML(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = YUML;
        int _saveIndex;

        try {      // for error handling
            match("&Yuml;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mCIRC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = CIRC;
        int _saveIndex;

        try {      // for error handling
            match("&circ;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTILDE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = TILDE;
        int _saveIndex;

        try {      // for error handling
            match("&tilde;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mENSP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ENSP;
        int _saveIndex;

        try {      // for error handling
            match("&ensp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEMSP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EMSP;
        int _saveIndex;

        try {      // for error handling
            match("&emsp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mTHINSP(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = THINSP;
        int _saveIndex;

        try {      // for error handling
            match("&thinsp;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mZWNJ(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ZWNJ;
        int _saveIndex;

        try {      // for error handling
            match("&zwnj;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mZWJ(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = ZWJ;
        int _saveIndex;

        try {      // for error handling
            match("&zwj;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLRM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LRM;
        int _saveIndex;

        try {      // for error handling
            match("&lrm;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRLM(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RLM;
        int _saveIndex;

        try {      // for error handling
            match("&rlm;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNDASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NDASH;
        int _saveIndex;

        try {      // for error handling
            match("&ndash;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mMDASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = MDASH;
        int _saveIndex;

        try {      // for error handling
            match("&mdash;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLSQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LSQUO;
        int _saveIndex;

        try {      // for error handling
            match("&lsquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRSQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RSQUO;
        int _saveIndex;

        try {      // for error handling
            match("&rsquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mSBQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = SBQUO;
        int _saveIndex;

        try {      // for error handling
            match("&sbquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLDQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LDQUO;
        int _saveIndex;

        try {      // for error handling
            match("&ldquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRDQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RDQUO;
        int _saveIndex;

        try {      // for error handling
            match("&rdquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mBDQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = BDQUO;
        int _saveIndex;

        try {      // for error handling
            match("&bdquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDAGGER_LC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DAGGER_LC;
        int _saveIndex;

        try {      // for error handling
            match("&dagger;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mDAGGER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DAGGER;
        int _saveIndex;

        try {      // for error handling
            match("&Dagger;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mPERMIL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = PERMIL;
        int _saveIndex;

        try {      // for error handling
            match("&permil;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mLSAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = LSAQUO;
        int _saveIndex;

        try {      // for error handling
            match("&lsaquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mRSAQUO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = RSAQUO;
        int _saveIndex;

        try {      // for error handling
            match("&rsaquo;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mEURO(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = EURO;
        int _saveIndex;

        try {      // for error handling
            match("&euro;");
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNCR_D(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NCR_D;
        int _saveIndex;

        try {      // for error handling
            _saveIndex = text.length();
            match("&#");
            text.setLength(_saveIndex);
            {
                if (((LA(1) >= '0' && LA(1) <= '9')) && ((LA(2) >= '0' && LA(2) <= '9')) && ((LA(3) >= '0' && LA(3) <= '9')) && ((LA(4) >= '0' && LA(4) <= '9')) && ((LA(5) >= '0' && LA(5) <= '9')) && ((LA(6) >= '0' && LA(6) <= '9')) && (LA(7) == ';')) {
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                } else if (((LA(1) >= '0' && LA(1) <= '9')) && ((LA(2) >= '0' && LA(2) <= '9')) && ((LA(3) >= '0' && LA(3) <= '9')) && ((LA(4) >= '0' && LA(4) <= '9')) && ((LA(5) >= '0' && LA(5) <= '9')) && ((LA(6) >= '0' && LA(6) <= '9')) && ((LA(7) >= '0' && LA(7) <= '9'))) {
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                } else if (((LA(1) >= '0' && LA(1) <= '9')) && ((LA(2) >= '0' && LA(2) <= '9')) && ((LA(3) >= '0' && LA(3) <= '9')) && ((LA(4) >= '0' && LA(4) <= '9')) && ((LA(5) >= '0' && LA(5) <= '9')) && (LA(6) == ';')) {
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                } else if (((LA(1) >= '0' && LA(1) <= '9')) && ((LA(2) >= '0' && LA(2) <= '9')) && ((LA(3) >= '0' && LA(3) <= '9')) && ((LA(4) >= '0' && LA(4) <= '9')) && (LA(5) == ';')) {
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                } else if (((LA(1) >= '0' && LA(1) <= '9')) && ((LA(2) >= '0' && LA(2) <= '9')) && ((LA(3) >= '0' && LA(3) <= '9')) && (LA(4) == ';')) {
                    mDIGIT(false);
                    mDIGIT(false);
                    mDIGIT(false);
                } else if (((LA(1) >= '0' && LA(1) <= '9')) && ((LA(2) >= '0' && LA(2) <= '9')) && (LA(3) == ';')) {
                    mDIGIT(false);
                    mDIGIT(false);
                } else if (((LA(1) >= '0' && LA(1) <= '9')) && (LA(2) == ';')) {
                    mDIGIT(false);
                } else {
                    throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
                }

            }
            _saveIndex = text.length();
            match(";");
            text.setLength(_saveIndex);
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    protected final void mDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = DIGIT;
        int _saveIndex;

        try {      // for error handling
            matchRange('0', '9');
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_2);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mNCR_H(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = NCR_H;
        int _saveIndex;

        try {      // for error handling
            {
                if ((LA(1) == '&') && (LA(2) == '#') && (LA(3) == 'x')) {
                    _saveIndex = text.length();
                    match("&#x");
                    text.setLength(_saveIndex);
                } else if ((LA(1) == '&') && (LA(2) == '#') && (LA(3) == 'X')) {
                    _saveIndex = text.length();
                    match("&#X");
                    text.setLength(_saveIndex);
                } else {
                    throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
                }

            }
            {
                if ((_tokenSet_0.member(LA(1))) && (_tokenSet_0.member(LA(2))) && (_tokenSet_0.member(LA(3))) && (_tokenSet_0.member(LA(4))) && (_tokenSet_0.member(LA(5))) && (LA(6) == ';')) {
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                } else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_0.member(LA(2))) && (_tokenSet_0.member(LA(3))) && (_tokenSet_0.member(LA(4))) && (_tokenSet_0.member(LA(5))) && (_tokenSet_0.member(LA(6)))) {
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                } else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_0.member(LA(2))) && (_tokenSet_0.member(LA(3))) && (_tokenSet_0.member(LA(4))) && (LA(5) == ';')) {
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                } else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_0.member(LA(2))) && (_tokenSet_0.member(LA(3))) && (LA(4) == ';')) {
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                } else if ((_tokenSet_0.member(LA(1))) && (_tokenSet_0.member(LA(2))) && (LA(3) == ';')) {
                    mHEXDIGIT(false);
                    mHEXDIGIT(false);
                } else if ((_tokenSet_0.member(LA(1))) && (LA(2) == ';')) {
                    mHEXDIGIT(false);
                } else {
                    throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
                }

            }
            _saveIndex = text.length();
            match(";");
            text.setLength(_saveIndex);
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    protected final void mHEXDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = HEXDIGIT;
        int _saveIndex;

        try {      // for error handling
            switch (LA(1)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9': {
                    matchRange('0', '9');
                    break;
                }
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f': {
                    matchRange('a', 'f');
                    break;
                }
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F': {
                    matchRange('A', 'F');
                    break;
                }
                default: {
                    throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
                }
            }
        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_1);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }

    public final void mWORD(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
        int _ttype;
        Token _token = null;
        int _begin = text.length();
        _ttype = WORD;
        int _saveIndex;

        try {      // for error handling
            if ((LA(1) == '\r') && (LA(2) == '\n') && (true) && (true) && (true) && (true) && (true) && (true)) {
                match('\r');
                match('\n');
                newline();
            } else if ((LA(1) == '\n') && (true) && (true) && (true) && (true) && (true) && (true) && (true)) {
                match('\n');
                newline();
            } else if ((_tokenSet_4.member(LA(1))) && (true) && (true) && (true) && (true) && (true) && (true) && (true)) {
                {
                    int _cnt260 = 0;
                    _loop260:
                    do {
                        if ((_tokenSet_4.member(LA(1)))) {
                            matchNot('&');
                        } else {
                            if (_cnt260 >= 1) {
                                break _loop260;
                            } else {
                                throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
                            }
                        }

                        _cnt260++;
                    } while (true);
                }
            } else if ((LA(1) == '&')) {
                match('&');
            } else {
                throw new NoViableAltForCharException((char) LA(1), getFilename(), getLine(), getColumn());
            }

        } catch (RecognitionException ex) {
            reportError(ex);
            consume();
            consumeUntil(_tokenSet_3);
        }
        if (_createToken && _token == null && _ttype != Token.SKIP) {
            _token = makeToken(_ttype);
            _token.setText(new String(text.getBuffer(), _begin, text.length() - _begin));
        }
        _returnToken = _token;
    }


    private static final long[] mk_tokenSet_0() {
        long[] data = new long[1025];
        data[0] = 287948901175001088L;
        data[1] = 541165879422L;
        return data;
    }

    public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());

    private static final long[] mk_tokenSet_1() {
        long[] data = new long[1025];
        data[0] = 864409653478424576L;
        data[1] = 541165879422L;
        return data;
    }

    public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());

    private static final long[] mk_tokenSet_2() {
        long[] data = new long[1025];
        data[0] = 864409653478424576L;
        return data;
    }

    public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());

    private static final long[] mk_tokenSet_3() {
        long[] data = new long[1025];
        return data;
    }

    public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());

    private static final long[] mk_tokenSet_4() {
        long[] data = new long[2048];
        data[0] = -274877906945L;
        for (int i = 1; i <= 1022; i++) {
            data[i] = -1L;
        }
        data[1023] = 9223372036854775807L;
        return data;
    }

    public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());

}
