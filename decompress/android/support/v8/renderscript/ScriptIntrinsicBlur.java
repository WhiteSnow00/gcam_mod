// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicBlur extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float[] mValues;
    
    public ScriptIntrinsicBlur(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        this.mValues = new float[9];
    }
    
    public static ScriptIntrinsicBlur create(final RenderScript renderScript, final Element element) {
        if (!element.isCompatible(Element.U8_4(renderScript)) && !element.isCompatible(Element.U8(renderScript))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        renderScript.isUseNative();
        final ScriptIntrinsicBlur scriptIntrinsicBlur = new ScriptIntrinsicBlur(renderScript.nScriptIntrinsicCreate(5, element.getID(renderScript), false), renderScript);
        scriptIntrinsicBlur.setIncSupp(false);
        scriptIntrinsicBlur.setRadius(5.0f);
        return scriptIntrinsicBlur;
    }
    
    public void forEach(final Allocation allocation) {
        this.forEach(0, (Allocation)null, allocation, null);
    }
    
    public Script$FieldID getFieldID_Input() {
        return this.createFieldID(1, null);
    }
    
    public Script$KernelID getKernelID() {
        return this.createKernelID(0, 2, null, null);
    }
    
    public void setInput(final Allocation mInput) {
        this.setVar(1, this.mInput = mInput);
    }
    
    public void setRadius(final float n) {
        if (n > 0.0f && n <= 25.0f) {
            this.setVar(0, n);
            return;
        }
        throw new RSIllegalArgumentException("Radius out of range (0 < r <= 25).");
    }
}
