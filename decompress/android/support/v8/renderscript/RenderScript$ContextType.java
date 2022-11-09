// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum RenderScript$ContextType
{
    DEBUG("DEBUG", 1, 1), 
    NORMAL("NORMAL", 0, 0), 
    PROFILE("PROFILE", 2, 2);
    
    int mID;
    
    private RenderScript$ContextType(final String s, final int n, final int mid) {
        this.mID = mid;
    }
}
