// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Script$FieldBase
{
    protected Allocation mAllocation;
    protected Element mElement;
    
    protected Script$FieldBase() {
    }
    
    public Allocation getAllocation() {
        return this.mAllocation;
    }
    
    public Element getElement() {
        return this.mElement;
    }
    
    public Type getType() {
        return this.mAllocation.getType();
    }
    
    protected void init(final RenderScript renderScript, final int n) {
        this.mAllocation = Allocation.createSized(renderScript, this.mElement, n, 1);
    }
    
    protected void init(final RenderScript renderScript, final int n, final int n2) {
        this.mAllocation = Allocation.createSized(renderScript, this.mElement, n, n2 | 0x1);
    }
    
    public void updateAllocation() {
    }
}
