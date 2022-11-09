// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class ScriptIntrinsicBlend extends ScriptIntrinsic
{
    private static final int INTRINSIC_API_LEVEL = 19;
    
    public ScriptIntrinsicBlend(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    private void blend(final int n, final Allocation allocation, final Allocation allocation2) {
        if (!allocation.getElement().isCompatible(Element.U8_4(this.mRS))) {
            throw new RSIllegalArgumentException("Input is not of expected format.");
        }
        if (allocation2.getElement().isCompatible(Element.U8_4(this.mRS))) {
            this.forEach(n, allocation, allocation2, null);
            return;
        }
        throw new RSIllegalArgumentException("Output is not of expected format.");
    }
    
    public static ScriptIntrinsicBlend create(final RenderScript renderScript, final Element element) {
        renderScript.isUseNative();
        final ScriptIntrinsicBlend scriptIntrinsicBlend = new ScriptIntrinsicBlend(renderScript.nScriptIntrinsicCreate(7, element.getID(renderScript), false), renderScript);
        scriptIntrinsicBlend.setIncSupp(false);
        return scriptIntrinsicBlend;
    }
    
    public void forEachAdd(final Allocation allocation, final Allocation allocation2) {
        this.blend(34, allocation, allocation2);
    }
    
    public void forEachClear(final Allocation allocation, final Allocation allocation2) {
        this.blend(0, allocation, allocation2);
    }
    
    public void forEachDst(final Allocation allocation, final Allocation allocation2) {
    }
    
    public void forEachDstAtop(final Allocation allocation, final Allocation allocation2) {
        this.blend(10, allocation, allocation2);
    }
    
    public void forEachDstIn(final Allocation allocation, final Allocation allocation2) {
        this.blend(6, allocation, allocation2);
    }
    
    public void forEachDstOut(final Allocation allocation, final Allocation allocation2) {
        this.blend(8, allocation, allocation2);
    }
    
    public void forEachDstOver(final Allocation allocation, final Allocation allocation2) {
        this.blend(4, allocation, allocation2);
    }
    
    public void forEachMultiply(final Allocation allocation, final Allocation allocation2) {
        this.blend(14, allocation, allocation2);
    }
    
    public void forEachSrc(final Allocation allocation, final Allocation allocation2) {
        this.blend(1, allocation, allocation2);
    }
    
    public void forEachSrcAtop(final Allocation allocation, final Allocation allocation2) {
        this.blend(9, allocation, allocation2);
    }
    
    public void forEachSrcIn(final Allocation allocation, final Allocation allocation2) {
        this.blend(5, allocation, allocation2);
    }
    
    public void forEachSrcOut(final Allocation allocation, final Allocation allocation2) {
        this.blend(7, allocation, allocation2);
    }
    
    public void forEachSrcOver(final Allocation allocation, final Allocation allocation2) {
        this.blend(3, allocation, allocation2);
    }
    
    public void forEachSubtract(final Allocation allocation, final Allocation allocation2) {
        this.blend(35, allocation, allocation2);
    }
    
    public void forEachXor(final Allocation allocation, final Allocation allocation2) {
        this.blend(11, allocation, allocation2);
    }
    
    public Script$KernelID getKernelIDAdd() {
        return this.createKernelID(34, 3, null, null);
    }
    
    public Script$KernelID getKernelIDClear() {
        return this.createKernelID(0, 3, null, null);
    }
    
    public Script$KernelID getKernelIDDst() {
        return this.createKernelID(2, 3, null, null);
    }
    
    public Script$KernelID getKernelIDDstAtop() {
        return this.createKernelID(10, 3, null, null);
    }
    
    public Script$KernelID getKernelIDDstIn() {
        return this.createKernelID(6, 3, null, null);
    }
    
    public Script$KernelID getKernelIDDstOut() {
        return this.createKernelID(8, 3, null, null);
    }
    
    public Script$KernelID getKernelIDDstOver() {
        return this.createKernelID(4, 3, null, null);
    }
    
    public Script$KernelID getKernelIDMultiply() {
        return this.createKernelID(14, 3, null, null);
    }
    
    public Script$KernelID getKernelIDSrc() {
        return this.createKernelID(1, 3, null, null);
    }
    
    public Script$KernelID getKernelIDSrcAtop() {
        return this.createKernelID(9, 3, null, null);
    }
    
    public Script$KernelID getKernelIDSrcIn() {
        return this.createKernelID(5, 3, null, null);
    }
    
    public Script$KernelID getKernelIDSrcOut() {
        return this.createKernelID(7, 3, null, null);
    }
    
    public Script$KernelID getKernelIDSrcOver() {
        return this.createKernelID(3, 3, null, null);
    }
    
    public Script$KernelID getKernelIDSubtract() {
        return this.createKernelID(35, 3, null, null);
    }
    
    public Script$KernelID getKernelIDXor() {
        return this.createKernelID(11, 3, null, null);
    }
}
