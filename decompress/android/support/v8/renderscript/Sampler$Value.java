// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum Sampler$Value
{
    CLAMP("CLAMP", 5, 4), 
    LINEAR("LINEAR", 1, 1), 
    LINEAR_MIP_LINEAR("LINEAR_MIP_LINEAR", 2, 2), 
    LINEAR_MIP_NEAREST("LINEAR_MIP_NEAREST", 3, 5), 
    MIRRORED_REPEAT("MIRRORED_REPEAT", 6, 6), 
    NEAREST("NEAREST", 0, 0), 
    WRAP("WRAP", 4, 3);
    
    int mID;
    
    private Sampler$Value(final String s, final int n, final int mid) {
        this.mID = mid;
    }
}
