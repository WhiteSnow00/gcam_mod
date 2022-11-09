// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public abstract class ScriptIntrinsic extends Script
{
    public ScriptIntrinsic(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        if (n != 0L) {
            return;
        }
        throw new RSRuntimeException("Loading of ScriptIntrinsic failed.");
    }
}
