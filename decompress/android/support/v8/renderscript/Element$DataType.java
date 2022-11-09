// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum Element$DataType
{
    BOOLEAN("BOOLEAN", 11, 12, 1), 
    FLOAT_32("FLOAT_32", 1, 2, 4), 
    FLOAT_64("FLOAT_64", 2, 3, 8), 
    MATRIX_2X2("MATRIX_2X2", 17, 18, 16), 
    MATRIX_3X3("MATRIX_3X3", 16, 17, 36), 
    MATRIX_4X4("MATRIX_4X4", 15, 16, 64), 
    NONE("NONE", 0, 0, 0), 
    RS_ALLOCATION("RS_ALLOCATION", 20, 1002), 
    RS_ELEMENT("RS_ELEMENT", 18, 1000), 
    RS_SAMPLER("RS_SAMPLER", 21, 1003), 
    RS_SCRIPT("RS_SCRIPT", 22, 1004), 
    RS_TYPE("RS_TYPE", 19, 1001), 
    SIGNED_16("SIGNED_16", 4, 5, 2), 
    SIGNED_32("SIGNED_32", 5, 6, 4), 
    SIGNED_64("SIGNED_64", 6, 7, 8), 
    SIGNED_8("SIGNED_8", 3, 4, 1), 
    UNSIGNED_16("UNSIGNED_16", 8, 9, 2), 
    UNSIGNED_32("UNSIGNED_32", 9, 10, 4), 
    UNSIGNED_4_4_4_4("UNSIGNED_4_4_4_4", 14, 15, 2), 
    UNSIGNED_5_5_5_1("UNSIGNED_5_5_5_1", 13, 14, 2), 
    UNSIGNED_5_6_5("UNSIGNED_5_6_5", 12, 13, 2), 
    UNSIGNED_64("UNSIGNED_64", 10, 11, 8), 
    UNSIGNED_8("UNSIGNED_8", 7, 8, 1);
    
    int mID;
    int mSize;
    
    private Element$DataType(final String s, final int n, final int mid) {
        this.mID = mid;
        this.mSize = 4;
        if (RenderScript.sPointerSize == 8) {
            this.mSize = 32;
        }
    }
    
    private Element$DataType(final String s, final int n, final int mid, final int mSize) {
        this.mID = mid;
        this.mSize = mSize;
    }
}
