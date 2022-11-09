// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicYuvToRGB extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    
    public ScriptIntrinsicYuvToRGB(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public static ScriptIntrinsicYuvToRGB create(final RenderScript renderScript, final Element element) {
        renderScript.isUseNative();
        final ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = new ScriptIntrinsicYuvToRGB(renderScript.nScriptIntrinsicCreate(6, element.getID(renderScript), false), renderScript);
        scriptIntrinsicYuvToRGB.setIncSupp(false);
        return scriptIntrinsicYuvToRGB;
    }
    
    public void forEach(final Allocation allocation) {
        this.forEach(0, (Allocation)null, allocation, null);
    }
    
    public Script$FieldID getFieldID_Input() {
        return this.createFieldID(0, null);
    }
    
    public Script$KernelID getKernelID() {
        return this.createKernelID(0, 2, null, null);
    }
    
    public void setInput(final Allocation mInput) {
        this.setVar(0, this.mInput = mInput);
    }
}
