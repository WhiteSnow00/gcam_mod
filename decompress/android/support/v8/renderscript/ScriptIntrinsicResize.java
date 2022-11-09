// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicResize extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 21;
    private Allocation mInput;
    
    public ScriptIntrinsicResize(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public static ScriptIntrinsicResize create(final RenderScript renderScript) {
        renderScript.isUseNative();
        final ScriptIntrinsicResize scriptIntrinsicResize = new ScriptIntrinsicResize(renderScript.nScriptIntrinsicCreate(12, 0L, false), renderScript);
        scriptIntrinsicResize.setIncSupp(false);
        return scriptIntrinsicResize;
    }
    
    public void forEach_bicubic(final Allocation allocation) {
        if (allocation != this.mInput) {
            this.forEach_bicubic(allocation, null);
            return;
        }
        throw new RSIllegalArgumentException("Output cannot be same as Input.");
    }
    
    public void forEach_bicubic(final Allocation allocation, final Script$LaunchOptions script$LaunchOptions) {
        this.forEach(0, (Allocation)null, allocation, null, script$LaunchOptions);
    }
    
    public Script$FieldID getFieldID_Input() {
        return this.createFieldID(0, null);
    }
    
    public Script$KernelID getKernelID_bicubic() {
        return this.createKernelID(0, 2, null, null);
    }
    
    public void setInput(final Allocation mInput) {
        final Element element = mInput.getElement();
        if (!element.isCompatible(Element.U8(this.mRS)) && !element.isCompatible(Element.U8_2(this.mRS)) && !element.isCompatible(Element.U8_3(this.mRS)) && !element.isCompatible(Element.U8_4(this.mRS)) && !element.isCompatible(Element.F32(this.mRS)) && !element.isCompatible(Element.F32_2(this.mRS)) && !element.isCompatible(Element.F32_3(this.mRS)) && !element.isCompatible(Element.F32_4(this.mRS))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        this.setVar(0, this.mInput = mInput);
    }
}
