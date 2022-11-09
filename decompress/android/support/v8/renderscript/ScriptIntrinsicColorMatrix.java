// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicColorMatrix extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    private final Float4 mAdd;
    private Allocation mInput;
    private final Matrix4f mMatrix;
    
    public ScriptIntrinsicColorMatrix(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        this.mMatrix = new Matrix4f();
        this.mAdd = new Float4();
    }
    
    public static ScriptIntrinsicColorMatrix create(final RenderScript renderScript, final Element element) {
        if (element.isCompatible(Element.U8_4(renderScript))) {
            renderScript.isUseNative();
            final ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrix = new ScriptIntrinsicColorMatrix(renderScript.nScriptIntrinsicCreate(2, element.getID(renderScript), false), renderScript);
            scriptIntrinsicColorMatrix.setIncSupp(false);
            return scriptIntrinsicColorMatrix;
        }
        throw new RSIllegalArgumentException("Unsuported element type.");
    }
    
    private void setMatrix() {
        final FieldPacker fieldPacker = new FieldPacker(64);
        fieldPacker.addMatrix(this.mMatrix);
        this.setVar(0, fieldPacker);
    }
    
    public void forEach(final Allocation allocation, final Allocation allocation2) {
        this.forEach(0, allocation, allocation2, null);
    }
    
    public void forEach(final Allocation allocation, final Allocation allocation2, final Script$LaunchOptions script$LaunchOptions) {
        if (!allocation.getElement().isCompatible(Element.U8(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_2(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_3(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_4(this.mRS)) && !allocation.getElement().isCompatible(Element.F32(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_2(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_3(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_4(this.mRS))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        if (!allocation2.getElement().isCompatible(Element.U8(this.mRS)) && !allocation2.getElement().isCompatible(Element.U8_2(this.mRS)) && !allocation2.getElement().isCompatible(Element.U8_3(this.mRS)) && !allocation2.getElement().isCompatible(Element.U8_4(this.mRS)) && !allocation2.getElement().isCompatible(Element.F32(this.mRS)) && !allocation2.getElement().isCompatible(Element.F32_2(this.mRS)) && !allocation2.getElement().isCompatible(Element.F32_3(this.mRS)) && !allocation2.getElement().isCompatible(Element.F32_4(this.mRS))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        this.forEach(0, allocation, allocation2, null, script$LaunchOptions);
    }
    
    public Script$KernelID getKernelID() {
        return this.createKernelID(0, 3, null, null);
    }
    
    public void setAdd(final float x, final float y, final float z, final float w) {
        final Float4 mAdd = this.mAdd;
        mAdd.x = x;
        mAdd.y = y;
        mAdd.z = z;
        mAdd.w = w;
        final FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addF32(this.mAdd.x);
        fieldPacker.addF32(this.mAdd.y);
        fieldPacker.addF32(this.mAdd.z);
        fieldPacker.addF32(this.mAdd.w);
        this.setVar(1, fieldPacker);
    }
    
    public void setAdd(final Float4 float4) {
        final Float4 mAdd = this.mAdd;
        mAdd.x = float4.x;
        mAdd.y = float4.y;
        mAdd.z = float4.z;
        mAdd.w = float4.w;
        final FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addF32(float4.x);
        fieldPacker.addF32(float4.y);
        fieldPacker.addF32(float4.z);
        fieldPacker.addF32(float4.w);
        this.setVar(1, fieldPacker);
    }
    
    public void setColorMatrix(final Matrix3f matrix3f) {
        this.mMatrix.load(matrix3f);
        this.setMatrix();
    }
    
    public void setColorMatrix(final Matrix4f matrix4f) {
        this.mMatrix.load(matrix4f);
        this.setMatrix();
    }
    
    public void setGreyscale() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 0.299f);
        this.mMatrix.set(1, 0, 0.587f);
        this.mMatrix.set(2, 0, 0.114f);
        this.mMatrix.set(0, 1, 0.299f);
        this.mMatrix.set(1, 1, 0.587f);
        this.mMatrix.set(2, 1, 0.114f);
        this.mMatrix.set(0, 2, 0.299f);
        this.mMatrix.set(1, 2, 0.587f);
        this.mMatrix.set(2, 2, 0.114f);
        this.setMatrix();
    }
    
    public void setRGBtoYUV() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 0.299f);
        this.mMatrix.set(1, 0, 0.587f);
        this.mMatrix.set(2, 0, 0.114f);
        this.mMatrix.set(0, 1, -0.14713f);
        this.mMatrix.set(1, 1, -0.28886f);
        this.mMatrix.set(2, 1, 0.436f);
        this.mMatrix.set(0, 2, 0.615f);
        this.mMatrix.set(1, 2, -0.51499f);
        this.mMatrix.set(2, 2, -0.10001f);
        this.setMatrix();
    }
    
    public void setYUVtoRGB() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 1.0f);
        this.mMatrix.set(1, 0, 0.0f);
        this.mMatrix.set(2, 0, 1.13983f);
        this.mMatrix.set(0, 1, 1.0f);
        this.mMatrix.set(1, 1, -0.39465f);
        this.mMatrix.set(2, 1, -0.5806f);
        this.mMatrix.set(0, 2, 1.0f);
        this.mMatrix.set(1, 2, 2.03211f);
        this.mMatrix.set(2, 2, 0.0f);
        this.setMatrix();
    }
}
