import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogt implements RawClientAllocator
{
    public ogm a;
    public boolean b;
    
    public ogt() {
        boolean b = false;
        this.b = false;
        if (GcamModuleJNI.kInvalidAllocationId_get() != 0L) {
            b = true;
        }
        njo.d(b);
    }
    
    @Override
    public final LongPair allocate(final int n, final int n2, final int n3) {
        njo.p(this.a == null, "allocate() should be called at most once.");
        this.a = new ogm(GcamModuleJNI.new_RawImage__SWIG_1(n, n2, n3));
        return new LongPair(0L, RawWriteView.d(this.a));
    }
    
    @Override
    public final void doneWriting(final long n) {
        final boolean b = false;
        njo.d(n == 0L);
        njo.p(this.a != null || b, "doneWriting() was called before allocate().");
        njo.p(this.b ^ true, "doneWriting() should be called at most once.");
        this.b = true;
    }
}
