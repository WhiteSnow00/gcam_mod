import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogr implements InterleavedU16ClientAllocator
{
    public InterleavedImageU16 a;
    public boolean b;
    private InterleavedWriteViewU16 c;
    
    public ogr() {
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
        final InterleavedImageU16 a = new InterleavedImageU16(GcamModuleJNI.new_InterleavedImageU16__SWIG_1(n, n2, n3));
        this.a = a;
        this.c = new InterleavedWriteViewU16(GcamModuleJNI.InterleavedImageU16_write_view(a.a, a));
        return new LongPair(0L, InterleavedWriteViewU16.a(this.c));
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
