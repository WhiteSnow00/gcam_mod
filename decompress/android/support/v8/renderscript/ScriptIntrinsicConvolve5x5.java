// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicConvolve5x5 extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float[] mValues;
    
    public ScriptIntrinsicConvolve5x5(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        this.mValues = new float[25];
    }
    
    public static ScriptIntrinsicConvolve5x5 create(final RenderScript renderScript, final Element element) {
        if (!element.isCompatible(Element.U8(renderScript)) && !element.isCompatible(Element.U8_2(renderScript)) && !element.isCompatible(Element.U8_3(renderScript)) && !element.isCompatible(Element.U8_4(renderScript)) && !element.isCompatible(Element.F32(renderScript)) && !element.isCompatible(Element.F32_2(renderScript)) && !element.isCompatible(Element.F32_3(renderScript)) && !element.isCompatible(Element.F32_4(renderScript))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        renderScript.isUseNative();
        final ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5 = new ScriptIntrinsicConvolve5x5(renderScript.nScriptIntrinsicCreate(4, element.getID(renderScript), false), renderScript);
        scriptIntrinsicConvolve5x5.setIncSupp(false);
        return scriptIntrinsicConvolve5x5;
    }
    
    public void forEach(final Allocation allocation) {
        this.forEach(0, (Allocation)null, allocation, null);
    }
    
    public void forEach(final Allocation allocation, final Script$LaunchOptions script$LaunchOptions) {
        this.forEach(0, (Allocation)null, allocation, null, script$LaunchOptions);
    }
    
    public Script$FieldID getFieldID_Input() {
        return this.createFieldID(1, null);
    }
    
    public Script$KernelID getKernelID() {
        return this.createKernelID(0, 2, null, null);
    }
    
    public void setCoefficients(final float[] array) {
        final FieldPacker fieldPacker = new FieldPacker(100);
        int n = 0;
        while (true) {
            final float[] mValues = this.mValues;
            if (n >= mValues.length) {
                break;
            }
            fieldPacker.addF32(mValues[n] = array[n]);
            ++n;
        }
        this.setVar(0, fieldPacker);
    }
    
    public void setInput(final Allocation mInput) {
        this.setVar(1, this.mInput = mInput);
    }
}
