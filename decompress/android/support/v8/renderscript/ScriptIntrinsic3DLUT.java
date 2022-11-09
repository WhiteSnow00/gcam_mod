// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsic3DLUT extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private Element mElement;
    private Allocation mLUT;
    
    protected ScriptIntrinsic3DLUT(final long n, final RenderScript renderScript, final Element mElement) {
        super(n, renderScript);
        this.mElement = mElement;
    }
    
    public static ScriptIntrinsic3DLUT create(final RenderScript renderScript, final Element element) {
        if (element.isCompatible(Element.U8_4(renderScript))) {
            renderScript.isUseNative();
            final ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = new ScriptIntrinsic3DLUT(renderScript.nScriptIntrinsicCreate(8, element.getID(renderScript), false), renderScript, element);
            scriptIntrinsic3DLUT.setIncSupp(false);
            return scriptIntrinsic3DLUT;
        }
        throw new RSIllegalArgumentException("Element must be compatible with uchar4.");
    }
    
    public void forEach(final Allocation allocation, final Allocation allocation2) {
        this.forEach(0, allocation, allocation2, null);
    }
    
    public Script$KernelID getKernelID() {
        return this.createKernelID(0, 3, null, null);
    }
    
    public void setLUT(final Allocation mlut) {
        final Type type = mlut.getType();
        if (type.getZ() == 0) {
            throw new RSIllegalArgumentException("LUT must be 3d.");
        }
        if (type.getElement().isCompatible(this.mElement)) {
            this.setVar(0, this.mLUT = mlut);
            return;
        }
        throw new RSIllegalArgumentException("LUT element type must match.");
    }
}
