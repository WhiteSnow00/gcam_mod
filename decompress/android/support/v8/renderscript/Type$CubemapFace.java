// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum Type$CubemapFace
{
    NEGATIVE_X("NEGATIVE_X", 1, 1), 
    NEGATIVE_Y("NEGATIVE_Y", 3, 3), 
    NEGATIVE_Z("NEGATIVE_Z", 5, 5), 
    POSITIVE_X("POSITIVE_X", 0, 0), 
    POSITIVE_Y("POSITIVE_Y", 2, 2), 
    POSITIVE_Z("POSITIVE_Z", 4, 4);
    
    int mID;
    
    private Type$CubemapFace(final String s, final int n, final int mid) {
        this.mID = mid;
    }
}
