// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicHistogram extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mOut;
    
    public ScriptIntrinsicHistogram(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public static ScriptIntrinsicHistogram create(final RenderScript renderScript, final Element element) {
        if (!element.isCompatible(Element.U8_4(renderScript)) && !element.isCompatible(Element.U8_3(renderScript)) && !element.isCompatible(Element.U8_2(renderScript)) && !element.isCompatible(Element.U8(renderScript))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        renderScript.isUseNative();
        final ScriptIntrinsicHistogram scriptIntrinsicHistogram = new ScriptIntrinsicHistogram(renderScript.nScriptIntrinsicCreate(9, element.getID(renderScript), false), renderScript);
        scriptIntrinsicHistogram.setIncSupp(false);
        return scriptIntrinsicHistogram;
    }
    
    public void forEach(final Allocation allocation) {
        this.forEach(allocation, null);
    }
    
    public void forEach(final Allocation allocation, final Script$LaunchOptions script$LaunchOptions) {
        if (allocation.getType().getElement().getVectorSize() < this.mOut.getType().getElement().getVectorSize()) {
            throw new RSIllegalArgumentException("Input vector size must be >= output vector size.");
        }
        if (!allocation.getType().getElement().isCompatible(Element.U8(this.mRS)) && !allocation.getType().getElement().isCompatible(Element.U8_2(this.mRS)) && !allocation.getType().getElement().isCompatible(Element.U8_3(this.mRS)) && !allocation.getType().getElement().isCompatible(Element.U8_4(this.mRS))) {
            throw new RSIllegalArgumentException("Input type must be U8, U8_1, U8_2 or U8_4.");
        }
        this.forEach(0, allocation, null, null, script$LaunchOptions);
    }
    
    public void forEach_Dot(final Allocation allocation) {
        this.forEach_Dot(allocation, null);
    }
    
    public void forEach_Dot(final Allocation allocation, final Script$LaunchOptions script$LaunchOptions) {
        if (this.mOut.getType().getElement().getVectorSize() != 1) {
            throw new RSIllegalArgumentException("Output vector size must be one.");
        }
        if (!allocation.getType().getElement().isCompatible(Element.U8(this.mRS)) && !allocation.getType().getElement().isCompatible(Element.U8_2(this.mRS)) && !allocation.getType().getElement().isCompatible(Element.U8_3(this.mRS)) && !allocation.getType().getElement().isCompatible(Element.U8_4(this.mRS))) {
            throw new RSIllegalArgumentException("Input type must be U8, U8_1, U8_2 or U8_4.");
        }
        this.forEach(1, allocation, null, null, script$LaunchOptions);
    }
    
    public Script$FieldID getFieldID_Input() {
        return this.createFieldID(1, null);
    }
    
    public Script$KernelID getKernelID_Separate() {
        return this.createKernelID(0, 3, null, null);
    }
    
    public void setDotCoefficients(final float n, final float n2, final float n3, final float n4) {
        if (n < 0.0f || n2 < 0.0f || n3 < 0.0f || n4 < 0.0f) {
            throw new RSIllegalArgumentException("Coefficient may not be negative.");
        }
        if (n + n2 + n3 + n4 <= 1.0f) {
            final FieldPacker fieldPacker = new FieldPacker(16);
            fieldPacker.addF32(n);
            fieldPacker.addF32(n2);
            fieldPacker.addF32(n3);
            fieldPacker.addF32(n4);
            this.setVar(0, fieldPacker);
            return;
        }
        throw new RSIllegalArgumentException("Sum of coefficients must be 1.0 or less.");
    }
    
    public void setOutput(final Allocation mOut) {
        this.mOut = mOut;
        if (mOut.getType().getElement() != Element.U32(this.mRS) && this.mOut.getType().getElement() != Element.U32_2(this.mRS) && this.mOut.getType().getElement() != Element.U32_3(this.mRS) && this.mOut.getType().getElement() != Element.U32_4(this.mRS) && this.mOut.getType().getElement() != Element.I32(this.mRS) && this.mOut.getType().getElement() != Element.I32_2(this.mRS) && this.mOut.getType().getElement() != Element.I32_3(this.mRS) && this.mOut.getType().getElement() != Element.I32_4(this.mRS)) {
            throw new RSIllegalArgumentException("Output type must be U32 or I32.");
        }
        if (this.mOut.getType().getX() == 256 && this.mOut.getType().getY() == 0 && !this.mOut.getType().hasMipmaps() && this.mOut.getType().getYuv() == 0) {
            this.setVar(1, mOut);
            return;
        }
        throw new RSIllegalArgumentException("Output must be 1D, 256 elements.");
    }
}
