// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.io.UnsupportedEncodingException;
import android.util.SparseArray;

public class Script extends BaseObj
{
    private final SparseArray mFIDs;
    private final SparseArray mIIDs;
    private final SparseArray mKIDs;
    private boolean mUseIncSupp;
    
    public Script(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        this.mKIDs = new SparseArray();
        this.mIIDs = new SparseArray();
        this.mFIDs = new SparseArray();
        this.mUseIncSupp = false;
    }
    
    public void bindAllocation(final Allocation allocation, final int n) {
        this.mRS.validate();
        if (allocation != null) {
            final RenderScript mrs = this.mRS;
            mrs.nScriptBindAllocation(this.getID(mrs), allocation.getID(this.mRS), n, this.mUseIncSupp);
            return;
        }
        final RenderScript mrs2 = this.mRS;
        mrs2.nScriptBindAllocation(this.getID(mrs2), 0L, n, this.mUseIncSupp);
    }
    
    protected Script$FieldID createFieldID(final int n, final Element element) {
        final Script$FieldID script$FieldID = (Script$FieldID)this.mFIDs.get(n);
        if (script$FieldID != null) {
            return script$FieldID;
        }
        final RenderScript mrs = this.mRS;
        final long nScriptFieldIDCreate = mrs.nScriptFieldIDCreate(this.getID(mrs), n, this.mUseIncSupp);
        if (nScriptFieldIDCreate != 0L) {
            final Script$FieldID script$FieldID2 = new Script$FieldID(nScriptFieldIDCreate, this.mRS, this, n);
            this.mFIDs.put(n, (Object)script$FieldID2);
            return script$FieldID2;
        }
        throw new RSDriverException("Failed to create FieldID");
    }
    
    protected Script$InvokeID createInvokeID(final int n) {
        final Script$InvokeID script$InvokeID = (Script$InvokeID)this.mIIDs.get(n);
        if (script$InvokeID != null) {
            return script$InvokeID;
        }
        final RenderScript mrs = this.mRS;
        final long nScriptInvokeIDCreate = mrs.nScriptInvokeIDCreate(this.getID(mrs), n);
        if (nScriptInvokeIDCreate != 0L) {
            final Script$InvokeID script$InvokeID2 = new Script$InvokeID(nScriptInvokeIDCreate, this.mRS, this, n);
            this.mIIDs.put(n, (Object)script$InvokeID2);
            return script$InvokeID2;
        }
        throw new RSDriverException("Failed to create KernelID");
    }
    
    protected Script$KernelID createKernelID(final int n, final int n2, final Element element, final Element element2) {
        final Script$KernelID script$KernelID = (Script$KernelID)this.mKIDs.get(n);
        if (script$KernelID != null) {
            return script$KernelID;
        }
        final RenderScript mrs = this.mRS;
        final long nScriptKernelIDCreate = mrs.nScriptKernelIDCreate(this.getID(mrs), n, n2, this.mUseIncSupp);
        if (nScriptKernelIDCreate != 0L) {
            final Script$KernelID script$KernelID2 = new Script$KernelID(nScriptKernelIDCreate, this.mRS, this, n, n2);
            this.mKIDs.put(n, (Object)script$KernelID2);
            return script$KernelID2;
        }
        throw new RSDriverException("Failed to create KernelID");
    }
    
    protected void forEach(final int n, final Allocation allocation, final Allocation allocation2, final FieldPacker fieldPacker) {
        if (allocation == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long id;
        if (allocation != null) {
            id = allocation.getID(this.mRS);
        }
        else {
            id = 0L;
        }
        long id2;
        if (allocation2 != null) {
            id2 = allocation2.getID(this.mRS);
        }
        else {
            id2 = 0L;
        }
        byte[] data;
        if (fieldPacker != null) {
            data = fieldPacker.getData();
        }
        else {
            data = null;
        }
        if (this.mUseIncSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            final RenderScript mrs = this.mRS;
            mrs.nScriptForEach(this.getID(mrs), n, dummyAlloc, dummyAlloc2, data, this.mUseIncSupp);
            return;
        }
        final RenderScript mrs2 = this.mRS;
        mrs2.nScriptForEach(this.getID(mrs2), n, id, id2, data, this.mUseIncSupp);
    }
    
    protected void forEach(final int n, final Allocation allocation, final Allocation allocation2, final FieldPacker fieldPacker, final Script$LaunchOptions script$LaunchOptions) {
        if (allocation == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (script$LaunchOptions == null) {
            this.forEach(n, allocation, allocation2, fieldPacker);
            return;
        }
        long id;
        if (allocation != null) {
            id = allocation.getID(this.mRS);
        }
        else {
            id = 0L;
        }
        long id2;
        if (allocation2 != null) {
            id2 = allocation2.getID(this.mRS);
        }
        else {
            id2 = 0L;
        }
        byte[] data;
        if (fieldPacker != null) {
            data = fieldPacker.getData();
        }
        else {
            data = null;
        }
        if (this.mUseIncSupp) {
            final long dummyAlloc = this.getDummyAlloc(allocation);
            final long dummyAlloc2 = this.getDummyAlloc(allocation2);
            final RenderScript mrs = this.mRS;
            mrs.nScriptForEachClipped(this.getID(mrs), n, dummyAlloc, dummyAlloc2, data, script$LaunchOptions.xstart, script$LaunchOptions.xend, script$LaunchOptions.ystart, script$LaunchOptions.yend, script$LaunchOptions.zstart, script$LaunchOptions.zend, this.mUseIncSupp);
            return;
        }
        final RenderScript mrs2 = this.mRS;
        mrs2.nScriptForEachClipped(this.getID(mrs2), n, id, id2, data, script$LaunchOptions.xstart, script$LaunchOptions.xend, script$LaunchOptions.ystart, script$LaunchOptions.yend, script$LaunchOptions.zstart, script$LaunchOptions.zend, this.mUseIncSupp);
    }
    
    protected void forEach(final int n, final Allocation[] array, final Allocation allocation, final FieldPacker fieldPacker) {
        this.forEach(n, array, allocation, fieldPacker, null);
    }
    
    protected void forEach(final int n, final Allocation[] array, final Allocation allocation, final FieldPacker fieldPacker, final Script$LaunchOptions script$LaunchOptions) {
        this.mRS.validate();
        if (array != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.mRS.validateObject(array[i]);
            }
        }
        this.mRS.validateObject(allocation);
        if (array == null && allocation == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long[] array3;
        if (array != null) {
            final long[] array2 = new long[array.length];
            for (int j = 0; j < array.length; ++j) {
                array2[j] = array[j].getID(this.mRS);
            }
            array3 = array2;
        }
        else {
            array3 = null;
        }
        long id;
        if (allocation != null) {
            id = allocation.getID(this.mRS);
        }
        else {
            id = 0L;
        }
        byte[] data;
        if (fieldPacker != null) {
            data = fieldPacker.getData();
        }
        else {
            data = null;
        }
        int[] array4;
        if (script$LaunchOptions != null) {
            array4 = new int[] { script$LaunchOptions.xstart, script$LaunchOptions.xend, script$LaunchOptions.ystart, script$LaunchOptions.yend, script$LaunchOptions.zstart, script$LaunchOptions.zend };
        }
        else {
            array4 = null;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptForEach(this.getID(mrs), n, array3, id, data, array4);
    }
    
    public long getDummyAlloc(final Allocation allocation) {
        if (allocation != null) {
            final Type type = allocation.getType();
            final long dummyType = type.getDummyType(this.mRS, type.getElement().getDummyElement(this.mRS));
            final int x = type.getX();
            final int bytesSize = type.getElement().getBytesSize();
            final RenderScript mrs = this.mRS;
            final long nIncAllocationCreateTyped = mrs.nIncAllocationCreateTyped(allocation.getID(mrs), dummyType, x * bytesSize);
            allocation.setIncAllocID(nIncAllocationCreateTyped);
            return nIncAllocationCreateTyped;
        }
        return 0L;
    }
    
    protected void invoke(final int n) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptInvoke(this.getID(mrs), n, this.mUseIncSupp);
    }
    
    protected void invoke(final int n, final FieldPacker fieldPacker) {
        if (fieldPacker != null) {
            final RenderScript mrs = this.mRS;
            mrs.nScriptInvokeV(this.getID(mrs), n, fieldPacker.getData(), this.mUseIncSupp);
            return;
        }
        final RenderScript mrs2 = this.mRS;
        mrs2.nScriptInvoke(this.getID(mrs2), n, this.mUseIncSupp);
    }
    
    protected boolean isIncSupp() {
        return this.mUseIncSupp;
    }
    
    protected void reduce(final int n, final Allocation[] array, final Allocation allocation, final Script$LaunchOptions script$LaunchOptions) {
        this.mRS.validate();
        if (array != null) {
            final int length = array.length;
            if (length > 0) {
                if (allocation != null) {
                    for (int i = 0; i < length; ++i) {
                        this.mRS.validateObject(array[i]);
                    }
                    final long[] array2 = new long[array.length];
                    for (int j = 0; j < array.length; ++j) {
                        array2[j] = array[j].getID(this.mRS);
                    }
                    final long id = allocation.getID(this.mRS);
                    int[] array3;
                    if (script$LaunchOptions != null) {
                        array3 = new int[] { script$LaunchOptions.xstart, script$LaunchOptions.xend, script$LaunchOptions.ystart, script$LaunchOptions.yend, script$LaunchOptions.zstart, script$LaunchOptions.zend };
                    }
                    else {
                        array3 = null;
                    }
                    final RenderScript mrs = this.mRS;
                    mrs.nScriptReduce(this.getID(mrs), n, array2, id, array3);
                    return;
                }
                throw new RSIllegalArgumentException("aout is required to be non-null.");
            }
        }
        throw new RSIllegalArgumentException("At least one input is required.");
    }
    
    protected void setIncSupp(final boolean mUseIncSupp) {
        this.mUseIncSupp = mUseIncSupp;
    }
    
    public void setTimeZone(final String s) {
        this.mRS.validate();
        try {
            final RenderScript mrs = this.mRS;
            mrs.nScriptSetTimeZone(this.getID(mrs), s.getBytes("UTF-8"), this.mUseIncSupp);
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void setVar(final int n, final double n2) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptSetVarD(this.getID(mrs), n, n2, this.mUseIncSupp);
    }
    
    public void setVar(final int n, final float n2) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptSetVarF(this.getID(mrs), n, n2, this.mUseIncSupp);
    }
    
    public void setVar(final int n, final int n2) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptSetVarI(this.getID(mrs), n, n2, this.mUseIncSupp);
    }
    
    public void setVar(final int n, final long n2) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptSetVarJ(this.getID(mrs), n, n2, this.mUseIncSupp);
    }
    
    public void setVar(final int n, final BaseObj baseObj) {
        final boolean mUseIncSupp = this.mUseIncSupp;
        long id = 0L;
        if (mUseIncSupp) {
            long dummyAlloc = this.getDummyAlloc((Allocation)baseObj);
            final RenderScript mrs = this.mRS;
            final long id2 = this.getID(mrs);
            if (baseObj == null) {
                dummyAlloc = 0L;
            }
            mrs.nScriptSetVarObj(id2, n, dummyAlloc, this.mUseIncSupp);
            return;
        }
        final RenderScript mrs2 = this.mRS;
        final long id3 = this.getID(mrs2);
        if (baseObj != null) {
            id = baseObj.getID(this.mRS);
        }
        mrs2.nScriptSetVarObj(id3, n, id, this.mUseIncSupp);
    }
    
    public void setVar(final int n, final FieldPacker fieldPacker) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptSetVarV(this.getID(mrs), n, fieldPacker.getData(), this.mUseIncSupp);
    }
    
    public void setVar(final int n, final FieldPacker fieldPacker, final Element element, final int[] array) {
        if (this.mUseIncSupp) {
            final long dummyElement = element.getDummyElement(this.mRS);
            final RenderScript mrs = this.mRS;
            mrs.nScriptSetVarVE(this.getID(mrs), n, fieldPacker.getData(), dummyElement, array, this.mUseIncSupp);
            return;
        }
        final RenderScript mrs2 = this.mRS;
        mrs2.nScriptSetVarVE(this.getID(mrs2), n, fieldPacker.getData(), element.getID(this.mRS), array, this.mUseIncSupp);
    }
    
    public void setVar(final int n, final boolean b) {
        final RenderScript mrs = this.mRS;
        mrs.nScriptSetVarI(this.getID(mrs), n, b ? 1 : 0, this.mUseIncSupp);
    }
}
