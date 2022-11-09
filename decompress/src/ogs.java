import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogs implements InterleavedU8ClientAllocator
{
    public InterleavedImageU8 a;
    public boolean b;
    private InterleavedWriteViewU8 c;
    
    public ogs() {
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
        final InterleavedImageU8 a = new InterleavedImageU8(n, n2, n3);
        this.a = a;
        this.c = a.d();
        return new LongPair(0L, InterleavedWriteViewU8.a(this.c));
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
