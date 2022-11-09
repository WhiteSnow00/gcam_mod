// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Element extends BaseObj
{
    int[] mArraySizes;
    String[] mElementNames;
    Element[] mElements;
    Element$DataKind mKind;
    boolean mNormalized;
    int[] mOffsetInBytes;
    int mSize;
    Element$DataType mType;
    int mVectorSize;
    int[] mVisibleElementMap;
    
    public Element(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public Element(final long n, final RenderScript renderScript, final Element$DataType mType, final Element$DataKind mKind, final boolean mNormalized, final int mVectorSize) {
        super(n, renderScript);
        if (mType != Element$DataType.UNSIGNED_5_6_5 && mType != Element$DataType.UNSIGNED_4_4_4_4 && mType != Element$DataType.UNSIGNED_5_5_5_1) {
            if (mVectorSize == 3) {
                this.mSize = mType.mSize * 4;
            }
            else {
                this.mSize = mType.mSize * mVectorSize;
            }
        }
        else {
            this.mSize = mType.mSize;
        }
        this.mType = mType;
        this.mKind = mKind;
        this.mNormalized = mNormalized;
        this.mVectorSize = mVectorSize;
    }
    
    public Element(final long n, final RenderScript renderScript, Element[] mElements, final String[] mElementNames, final int[] mArraySizes) {
        super(n, renderScript);
        int n2 = 0;
        this.mSize = 0;
        this.mVectorSize = 1;
        this.mElements = mElements;
        this.mElementNames = mElementNames;
        this.mArraySizes = mArraySizes;
        this.mType = Element$DataType.NONE;
        this.mKind = Element$DataKind.USER;
        this.mOffsetInBytes = new int[this.mElements.length];
        while (true) {
            mElements = this.mElements;
            if (n2 >= mElements.length) {
                break;
            }
            final int[] mOffsetInBytes = this.mOffsetInBytes;
            final int mSize = this.mSize;
            mOffsetInBytes[n2] = mSize;
            this.mSize = mSize + mElements[n2].mSize * this.mArraySizes[n2];
            ++n2;
        }
        this.updateVisibleSubElements();
    }
    
    public static Element ALLOCATION(final RenderScript renderScript) {
        if (renderScript.mElement_ALLOCATION == null) {
            renderScript.mElement_ALLOCATION = createUser(renderScript, Element$DataType.RS_ALLOCATION);
        }
        return renderScript.mElement_ALLOCATION;
    }
    
    public static Element A_8(final RenderScript renderScript) {
        if (renderScript.mElement_A_8 == null) {
            renderScript.mElement_A_8 = createPixel(renderScript, Element$DataType.UNSIGNED_8, Element$DataKind.PIXEL_A);
        }
        return renderScript.mElement_A_8;
    }
    
    public static Element BOOLEAN(final RenderScript renderScript) {
        if (renderScript.mElement_BOOLEAN == null) {
            renderScript.mElement_BOOLEAN = createUser(renderScript, Element$DataType.BOOLEAN);
        }
        return renderScript.mElement_BOOLEAN;
    }
    
    public static Element ELEMENT(final RenderScript renderScript) {
        if (renderScript.mElement_ELEMENT == null) {
            renderScript.mElement_ELEMENT = createUser(renderScript, Element$DataType.RS_ELEMENT);
        }
        return renderScript.mElement_ELEMENT;
    }
    
    public static Element F32(final RenderScript renderScript) {
        if (renderScript.mElement_F32 == null) {
            renderScript.mElement_F32 = createUser(renderScript, Element$DataType.FLOAT_32);
        }
        return renderScript.mElement_F32;
    }
    
    public static Element F32_2(final RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_2 == null) {
            renderScript.mElement_FLOAT_2 = createVector(renderScript, Element$DataType.FLOAT_32, 2);
        }
        return renderScript.mElement_FLOAT_2;
    }
    
    public static Element F32_3(final RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_3 == null) {
            renderScript.mElement_FLOAT_3 = createVector(renderScript, Element$DataType.FLOAT_32, 3);
        }
        return renderScript.mElement_FLOAT_3;
    }
    
    public static Element F32_4(final RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_4 == null) {
            renderScript.mElement_FLOAT_4 = createVector(renderScript, Element$DataType.FLOAT_32, 4);
        }
        return renderScript.mElement_FLOAT_4;
    }
    
    public static Element F64(final RenderScript renderScript) {
        if (renderScript.mElement_F64 == null) {
            renderScript.mElement_F64 = createUser(renderScript, Element$DataType.FLOAT_64);
        }
        return renderScript.mElement_F64;
    }
    
    public static Element F64_2(final RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_2 == null) {
            renderScript.mElement_DOUBLE_2 = createVector(renderScript, Element$DataType.FLOAT_64, 2);
        }
        return renderScript.mElement_DOUBLE_2;
    }
    
    public static Element F64_3(final RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_3 == null) {
            renderScript.mElement_DOUBLE_3 = createVector(renderScript, Element$DataType.FLOAT_64, 3);
        }
        return renderScript.mElement_DOUBLE_3;
    }
    
    public static Element F64_4(final RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_4 == null) {
            renderScript.mElement_DOUBLE_4 = createVector(renderScript, Element$DataType.FLOAT_64, 4);
        }
        return renderScript.mElement_DOUBLE_4;
    }
    
    public static Element I16(final RenderScript renderScript) {
        if (renderScript.mElement_I16 == null) {
            renderScript.mElement_I16 = createUser(renderScript, Element$DataType.SIGNED_16);
        }
        return renderScript.mElement_I16;
    }
    
    public static Element I16_2(final RenderScript renderScript) {
        if (renderScript.mElement_SHORT_2 == null) {
            renderScript.mElement_SHORT_2 = createVector(renderScript, Element$DataType.SIGNED_16, 2);
        }
        return renderScript.mElement_SHORT_2;
    }
    
    public static Element I16_3(final RenderScript renderScript) {
        if (renderScript.mElement_SHORT_3 == null) {
            renderScript.mElement_SHORT_3 = createVector(renderScript, Element$DataType.SIGNED_16, 3);
        }
        return renderScript.mElement_SHORT_3;
    }
    
    public static Element I16_4(final RenderScript renderScript) {
        if (renderScript.mElement_SHORT_4 == null) {
            renderScript.mElement_SHORT_4 = createVector(renderScript, Element$DataType.SIGNED_16, 4);
        }
        return renderScript.mElement_SHORT_4;
    }
    
    public static Element I32(final RenderScript renderScript) {
        if (renderScript.mElement_I32 == null) {
            renderScript.mElement_I32 = createUser(renderScript, Element$DataType.SIGNED_32);
        }
        return renderScript.mElement_I32;
    }
    
    public static Element I32_2(final RenderScript renderScript) {
        if (renderScript.mElement_INT_2 == null) {
            renderScript.mElement_INT_2 = createVector(renderScript, Element$DataType.SIGNED_32, 2);
        }
        return renderScript.mElement_INT_2;
    }
    
    public static Element I32_3(final RenderScript renderScript) {
        if (renderScript.mElement_INT_3 == null) {
            renderScript.mElement_INT_3 = createVector(renderScript, Element$DataType.SIGNED_32, 3);
        }
        return renderScript.mElement_INT_3;
    }
    
    public static Element I32_4(final RenderScript renderScript) {
        if (renderScript.mElement_INT_4 == null) {
            renderScript.mElement_INT_4 = createVector(renderScript, Element$DataType.SIGNED_32, 4);
        }
        return renderScript.mElement_INT_4;
    }
    
    public static Element I64(final RenderScript renderScript) {
        if (renderScript.mElement_I64 == null) {
            renderScript.mElement_I64 = createUser(renderScript, Element$DataType.SIGNED_64);
        }
        return renderScript.mElement_I64;
    }
    
    public static Element I64_2(final RenderScript renderScript) {
        if (renderScript.mElement_LONG_2 == null) {
            renderScript.mElement_LONG_2 = createVector(renderScript, Element$DataType.SIGNED_64, 2);
        }
        return renderScript.mElement_LONG_2;
    }
    
    public static Element I64_3(final RenderScript renderScript) {
        if (renderScript.mElement_LONG_3 == null) {
            renderScript.mElement_LONG_3 = createVector(renderScript, Element$DataType.SIGNED_64, 3);
        }
        return renderScript.mElement_LONG_3;
    }
    
    public static Element I64_4(final RenderScript renderScript) {
        if (renderScript.mElement_LONG_4 == null) {
            renderScript.mElement_LONG_4 = createVector(renderScript, Element$DataType.SIGNED_64, 4);
        }
        return renderScript.mElement_LONG_4;
    }
    
    public static Element I8(final RenderScript renderScript) {
        if (renderScript.mElement_I8 == null) {
            renderScript.mElement_I8 = createUser(renderScript, Element$DataType.SIGNED_8);
        }
        return renderScript.mElement_I8;
    }
    
    public static Element I8_2(final RenderScript renderScript) {
        if (renderScript.mElement_CHAR_2 == null) {
            renderScript.mElement_CHAR_2 = createVector(renderScript, Element$DataType.SIGNED_8, 2);
        }
        return renderScript.mElement_CHAR_2;
    }
    
    public static Element I8_3(final RenderScript renderScript) {
        if (renderScript.mElement_CHAR_3 == null) {
            renderScript.mElement_CHAR_3 = createVector(renderScript, Element$DataType.SIGNED_8, 3);
        }
        return renderScript.mElement_CHAR_3;
    }
    
    public static Element I8_4(final RenderScript renderScript) {
        if (renderScript.mElement_CHAR_4 == null) {
            renderScript.mElement_CHAR_4 = createVector(renderScript, Element$DataType.SIGNED_8, 4);
        }
        return renderScript.mElement_CHAR_4;
    }
    
    public static Element MATRIX_2X2(final RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_2X2 == null) {
            renderScript.mElement_MATRIX_2X2 = createUser(renderScript, Element$DataType.MATRIX_2X2);
        }
        return renderScript.mElement_MATRIX_2X2;
    }
    
    public static Element MATRIX_3X3(final RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_3X3 == null) {
            renderScript.mElement_MATRIX_3X3 = createUser(renderScript, Element$DataType.MATRIX_3X3);
        }
        return renderScript.mElement_MATRIX_3X3;
    }
    
    public static Element MATRIX_4X4(final RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_4X4 == null) {
            renderScript.mElement_MATRIX_4X4 = createUser(renderScript, Element$DataType.MATRIX_4X4);
        }
        return renderScript.mElement_MATRIX_4X4;
    }
    
    public static Element RGBA_4444(final RenderScript renderScript) {
        if (renderScript.mElement_RGBA_4444 == null) {
            renderScript.mElement_RGBA_4444 = createPixel(renderScript, Element$DataType.UNSIGNED_4_4_4_4, Element$DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_4444;
    }
    
    public static Element RGBA_5551(final RenderScript renderScript) {
        if (renderScript.mElement_RGBA_5551 == null) {
            renderScript.mElement_RGBA_5551 = createPixel(renderScript, Element$DataType.UNSIGNED_5_5_5_1, Element$DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_5551;
    }
    
    public static Element RGBA_8888(final RenderScript renderScript) {
        if (renderScript.mElement_RGBA_8888 == null) {
            renderScript.mElement_RGBA_8888 = createPixel(renderScript, Element$DataType.UNSIGNED_8, Element$DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_8888;
    }
    
    public static Element RGB_565(final RenderScript renderScript) {
        if (renderScript.mElement_RGB_565 == null) {
            renderScript.mElement_RGB_565 = createPixel(renderScript, Element$DataType.UNSIGNED_5_6_5, Element$DataKind.PIXEL_RGB);
        }
        return renderScript.mElement_RGB_565;
    }
    
    public static Element RGB_888(final RenderScript renderScript) {
        if (renderScript.mElement_RGB_888 == null) {
            renderScript.mElement_RGB_888 = createPixel(renderScript, Element$DataType.UNSIGNED_8, Element$DataKind.PIXEL_RGB);
        }
        return renderScript.mElement_RGB_888;
    }
    
    public static Element SAMPLER(final RenderScript renderScript) {
        if (renderScript.mElement_SAMPLER == null) {
            renderScript.mElement_SAMPLER = createUser(renderScript, Element$DataType.RS_SAMPLER);
        }
        return renderScript.mElement_SAMPLER;
    }
    
    public static Element SCRIPT(final RenderScript renderScript) {
        if (renderScript.mElement_SCRIPT == null) {
            renderScript.mElement_SCRIPT = createUser(renderScript, Element$DataType.RS_SCRIPT);
        }
        return renderScript.mElement_SCRIPT;
    }
    
    public static Element TYPE(final RenderScript renderScript) {
        if (renderScript.mElement_TYPE == null) {
            renderScript.mElement_TYPE = createUser(renderScript, Element$DataType.RS_TYPE);
        }
        return renderScript.mElement_TYPE;
    }
    
    public static Element U16(final RenderScript renderScript) {
        if (renderScript.mElement_U16 == null) {
            renderScript.mElement_U16 = createUser(renderScript, Element$DataType.UNSIGNED_16);
        }
        return renderScript.mElement_U16;
    }
    
    public static Element U16_2(final RenderScript renderScript) {
        if (renderScript.mElement_USHORT_2 == null) {
            renderScript.mElement_USHORT_2 = createVector(renderScript, Element$DataType.UNSIGNED_16, 2);
        }
        return renderScript.mElement_USHORT_2;
    }
    
    public static Element U16_3(final RenderScript renderScript) {
        if (renderScript.mElement_USHORT_3 == null) {
            renderScript.mElement_USHORT_3 = createVector(renderScript, Element$DataType.UNSIGNED_16, 3);
        }
        return renderScript.mElement_USHORT_3;
    }
    
    public static Element U16_4(final RenderScript renderScript) {
        if (renderScript.mElement_USHORT_4 == null) {
            renderScript.mElement_USHORT_4 = createVector(renderScript, Element$DataType.UNSIGNED_16, 4);
        }
        return renderScript.mElement_USHORT_4;
    }
    
    public static Element U32(final RenderScript renderScript) {
        if (renderScript.mElement_U32 == null) {
            renderScript.mElement_U32 = createUser(renderScript, Element$DataType.UNSIGNED_32);
        }
        return renderScript.mElement_U32;
    }
    
    public static Element U32_2(final RenderScript renderScript) {
        if (renderScript.mElement_UINT_2 == null) {
            renderScript.mElement_UINT_2 = createVector(renderScript, Element$DataType.UNSIGNED_32, 2);
        }
        return renderScript.mElement_UINT_2;
    }
    
    public static Element U32_3(final RenderScript renderScript) {
        if (renderScript.mElement_UINT_3 == null) {
            renderScript.mElement_UINT_3 = createVector(renderScript, Element$DataType.UNSIGNED_32, 3);
        }
        return renderScript.mElement_UINT_3;
    }
    
    public static Element U32_4(final RenderScript renderScript) {
        if (renderScript.mElement_UINT_4 == null) {
            renderScript.mElement_UINT_4 = createVector(renderScript, Element$DataType.UNSIGNED_32, 4);
        }
        return renderScript.mElement_UINT_4;
    }
    
    public static Element U64(final RenderScript renderScript) {
        if (renderScript.mElement_U64 == null) {
            renderScript.mElement_U64 = createUser(renderScript, Element$DataType.UNSIGNED_64);
        }
        return renderScript.mElement_U64;
    }
    
    public static Element U64_2(final RenderScript renderScript) {
        if (renderScript.mElement_ULONG_2 == null) {
            renderScript.mElement_ULONG_2 = createVector(renderScript, Element$DataType.UNSIGNED_64, 2);
        }
        return renderScript.mElement_ULONG_2;
    }
    
    public static Element U64_3(final RenderScript renderScript) {
        if (renderScript.mElement_ULONG_3 == null) {
            renderScript.mElement_ULONG_3 = createVector(renderScript, Element$DataType.UNSIGNED_64, 3);
        }
        return renderScript.mElement_ULONG_3;
    }
    
    public static Element U64_4(final RenderScript renderScript) {
        if (renderScript.mElement_ULONG_4 == null) {
            renderScript.mElement_ULONG_4 = createVector(renderScript, Element$DataType.UNSIGNED_64, 4);
        }
        return renderScript.mElement_ULONG_4;
    }
    
    public static Element U8(final RenderScript renderScript) {
        if (renderScript.mElement_U8 == null) {
            renderScript.mElement_U8 = createUser(renderScript, Element$DataType.UNSIGNED_8);
        }
        return renderScript.mElement_U8;
    }
    
    public static Element U8_2(final RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_2 == null) {
            renderScript.mElement_UCHAR_2 = createVector(renderScript, Element$DataType.UNSIGNED_8, 2);
        }
        return renderScript.mElement_UCHAR_2;
    }
    
    public static Element U8_3(final RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_3 == null) {
            renderScript.mElement_UCHAR_3 = createVector(renderScript, Element$DataType.UNSIGNED_8, 3);
        }
        return renderScript.mElement_UCHAR_3;
    }
    
    public static Element U8_4(final RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_4 == null) {
            renderScript.mElement_UCHAR_4 = createVector(renderScript, Element$DataType.UNSIGNED_8, 4);
        }
        return renderScript.mElement_UCHAR_4;
    }
    
    public static Element createPixel(final RenderScript renderScript, final Element$DataType element$DataType, final Element$DataKind element$DataKind) {
        if (element$DataKind != Element$DataKind.PIXEL_L && element$DataKind != Element$DataKind.PIXEL_A && element$DataKind != Element$DataKind.PIXEL_LA && element$DataKind != Element$DataKind.PIXEL_RGB && element$DataKind != Element$DataKind.PIXEL_RGBA && element$DataKind != Element$DataKind.PIXEL_DEPTH && element$DataKind != Element$DataKind.PIXEL_YUV) {
            throw new RSIllegalArgumentException("Unsupported DataKind");
        }
        if (element$DataType != Element$DataType.UNSIGNED_8 && element$DataType != Element$DataType.UNSIGNED_16 && element$DataType != Element$DataType.UNSIGNED_5_6_5 && element$DataType != Element$DataType.UNSIGNED_4_4_4_4 && element$DataType != Element$DataType.UNSIGNED_5_5_5_1) {
            throw new RSIllegalArgumentException("Unsupported DataType");
        }
        if (element$DataType == Element$DataType.UNSIGNED_5_6_5 && element$DataKind != Element$DataKind.PIXEL_RGB) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        }
        if (element$DataType == Element$DataType.UNSIGNED_5_5_5_1 && element$DataKind != Element$DataKind.PIXEL_RGBA) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        }
        if (element$DataType == Element$DataType.UNSIGNED_4_4_4_4 && element$DataKind != Element$DataKind.PIXEL_RGBA) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        }
        if (element$DataType == Element$DataType.UNSIGNED_16 && element$DataKind != Element$DataKind.PIXEL_DEPTH) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        }
        int n = 0;
        switch (element$DataKind.ordinal()) {
            default: {
                n = 1;
                break;
            }
            case 5: {
                n = 4;
                break;
            }
            case 4: {
                n = 3;
                break;
            }
            case 3: {
                n = 2;
                break;
            }
        }
        return new Element(renderScript.nElementCreate(element$DataType.mID, element$DataKind.mID, true, n), renderScript, element$DataType, element$DataKind, true, n);
    }
    
    static Element createUser(final RenderScript renderScript, final Element$DataType element$DataType) {
        final Element$DataKind user = Element$DataKind.USER;
        return new Element(renderScript.nElementCreate(element$DataType.mID, user.mID, false, 1), renderScript, element$DataType, user, false, 1);
    }
    
    public static Element createVector(final RenderScript renderScript, final Element$DataType element$DataType, final int n) {
        if (n < 2 || n > 4) {
            throw new RSIllegalArgumentException("Vector size out of range 2-4.");
        }
        final Element$DataKind user = Element$DataKind.USER;
        final Element$DataType none = Element$DataType.NONE;
        switch (element$DataType.ordinal()) {
            default: {
                throw new RSIllegalArgumentException("Cannot create vector of non-primitive type.");
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11: {
                final Element$DataKind user2 = Element$DataKind.USER;
                return new Element(renderScript.nElementCreate(element$DataType.mID, user2.mID, false, n), renderScript, element$DataType, user2, false, n);
            }
        }
    }
    
    private void updateVisibleSubElements() {
        if (this.mElements == null) {
            return;
        }
        final int length = this.mElementNames.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2 = n;
            if (this.mElementNames[i].charAt(0) != '#') {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        this.mVisibleElementMap = new int[n];
        int j = 0;
        int n3 = 0;
        while (j < length) {
            int n4 = n3;
            if (this.mElementNames[j].charAt(0) != '#') {
                this.mVisibleElementMap[n3] = j;
                n4 = n3 + 1;
            }
            ++j;
            n3 = n4;
        }
    }
    
    public int getBytesSize() {
        return this.mSize;
    }
    
    public Element$DataKind getDataKind() {
        return this.mKind;
    }
    
    public Element$DataType getDataType() {
        return this.mType;
    }
    
    public long getDummyElement(final RenderScript renderScript) {
        return renderScript.nIncElementCreate(this.mType.mID, this.mKind.mID, this.mNormalized, this.mVectorSize);
    }
    
    public Element getSubElement(final int n) {
        final int[] mVisibleElementMap = this.mVisibleElementMap;
        if (mVisibleElementMap == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        }
        if (n >= 0 && n < mVisibleElementMap.length) {
            return this.mElements[mVisibleElementMap[n]];
        }
        throw new RSIllegalArgumentException("Illegal sub-element index");
    }
    
    public int getSubElementArraySize(final int n) {
        final int[] mVisibleElementMap = this.mVisibleElementMap;
        if (mVisibleElementMap == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        }
        if (n >= 0 && n < mVisibleElementMap.length) {
            return this.mArraySizes[mVisibleElementMap[n]];
        }
        throw new RSIllegalArgumentException("Illegal sub-element index");
    }
    
    public int getSubElementCount() {
        final int[] mVisibleElementMap = this.mVisibleElementMap;
        if (mVisibleElementMap == null) {
            return 0;
        }
        return mVisibleElementMap.length;
    }
    
    public String getSubElementName(final int n) {
        final int[] mVisibleElementMap = this.mVisibleElementMap;
        if (mVisibleElementMap == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        }
        if (n >= 0 && n < mVisibleElementMap.length) {
            return this.mElementNames[mVisibleElementMap[n]];
        }
        throw new RSIllegalArgumentException("Illegal sub-element index");
    }
    
    public int getSubElementOffsetBytes(final int n) {
        final int[] mVisibleElementMap = this.mVisibleElementMap;
        if (mVisibleElementMap == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        }
        if (n >= 0 && n < mVisibleElementMap.length) {
            return this.mOffsetInBytes[mVisibleElementMap[n]];
        }
        throw new RSIllegalArgumentException("Illegal sub-element index");
    }
    
    public int getVectorSize() {
        return this.mVectorSize;
    }
    
    public boolean isCompatible(final Element element) {
        return this.equals(element) || (this.mSize == element.mSize && this.mType != Element$DataType.NONE && this.mType == element.mType && this.mVectorSize == element.mVectorSize);
    }
    
    public boolean isComplex() {
        if (this.mElements != null) {
            int n = 0;
            while (true) {
                final Element[] mElements = this.mElements;
                if (n >= mElements.length) {
                    break;
                }
                if (mElements[n].mElements != null) {
                    return true;
                }
                ++n;
            }
        }
        return false;
    }
}
