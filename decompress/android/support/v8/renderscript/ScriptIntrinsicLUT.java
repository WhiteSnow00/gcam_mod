// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicLUT extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private final byte[] mCache;
    private boolean mDirty;
    private final Matrix4f mMatrix;
    private Allocation mTables;
    
    public ScriptIntrinsicLUT(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        this.mMatrix = new Matrix4f();
        this.mCache = new byte[1024];
        this.mDirty = true;
    }
    
    public static ScriptIntrinsicLUT create(final RenderScript renderScript, final Element element) {
        renderScript.isUseNative();
        final ScriptIntrinsicLUT scriptIntrinsicLUT = new ScriptIntrinsicLUT(renderScript.nScriptIntrinsicCreate(3, element.getID(renderScript), false), renderScript);
        scriptIntrinsicLUT.setIncSupp(false);
        scriptIntrinsicLUT.mTables = Allocation.createSized(renderScript, Element.U8(renderScript), 1024);
        for (int i = 0; i < 256; ++i) {
            final byte[] mCache = scriptIntrinsicLUT.mCache;
            final byte b = (byte)i;
            mCache[i] = b;
            mCache[i + 256] = b;
            mCache[i + 512] = b;
            mCache[i + 768] = b;
        }
        scriptIntrinsicLUT.setVar(0, scriptIntrinsicLUT.mTables);
        return scriptIntrinsicLUT;
    }
    
    private void validate(final int n, final int n2) {
        if (n < 0 || n > 255) {
            throw new RSIllegalArgumentException("Index out of range (0-255).");
        }
        if (n2 >= 0 && n2 <= 255) {
            return;
        }
        throw new RSIllegalArgumentException("Value out of range (0-255).");
    }
    
    public void forEach(final Allocation allocation, final Allocation allocation2) {
        if (this.mDirty) {
            this.mDirty = false;
            this.mTables.copyFromUnchecked(this.mCache);
        }
        this.forEach(0, allocation, allocation2, null);
    }
    
    public Script$KernelID getKernelID() {
        return this.createKernelID(0, 3, null, null);
    }
    
    public void setAlpha(final int n, final int n2) {
        this.validate(n, n2);
        this.mCache[n + 768] = (byte)n2;
        this.mDirty = true;
    }
    
    public void setBlue(final int n, final int n2) {
        this.validate(n, n2);
        this.mCache[n + 512] = (byte)n2;
        this.mDirty = true;
    }
    
    public void setGreen(final int n, final int n2) {
        this.validate(n, n2);
        this.mCache[n + 256] = (byte)n2;
        this.mDirty = true;
    }
    
    public void setRed(final int n, final int n2) {
        this.validate(n, n2);
        this.mCache[n] = (byte)n2;
        this.mDirty = true;
    }
}
