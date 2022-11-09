// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class Script$KernelID extends BaseObj
{
    android.renderscript.Script$KernelID mN;
    Script mScript;
    int mSig;
    int mSlot;
    
    public Script$KernelID(final long n, final RenderScript renderScript, final Script mScript, final int mSlot, final int mSig) {
        super(n, renderScript);
        this.mScript = mScript;
        this.mSlot = mSlot;
        this.mSig = mSig;
    }
}
