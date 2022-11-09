// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class Script$FieldID extends BaseObj
{
    android.renderscript.Script$FieldID mN;
    Script mScript;
    int mSlot;
    
    public Script$FieldID(final long n, final RenderScript renderScript, final Script mScript, final int mSlot) {
        super(n, renderScript);
        this.mScript = mScript;
        this.mSlot = mSlot;
    }
}
