// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class Script$InvokeID extends BaseObj
{
    Script mScript;
    int mSlot;
    
    public Script$InvokeID(final long n, final RenderScript renderScript, final Script mScript, final int mSlot) {
        super(n, renderScript);
        this.mScript = mScript;
        this.mSlot = mSlot;
    }
}
