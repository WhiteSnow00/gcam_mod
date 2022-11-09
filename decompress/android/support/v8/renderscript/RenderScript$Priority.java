// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum RenderScript$Priority
{
    LOW("LOW", 0, 15), 
    NORMAL("NORMAL", 1, -4);
    
    int mID;
    
    private RenderScript$Priority(final String s, final int n, final int mid) {
        this.mID = mid;
    }
}
