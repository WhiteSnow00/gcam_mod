import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogu implements YuvClientAllocator
{
    private YuvImage a;
    private boolean b;
    
    public ogu() {
        boolean b = false;
        this.b = false;
        if (GcamModuleJNI.kInvalidAllocationId_get() != 0L) {
            b = true;
        }
        njo.d(b);
    }
    
    public final YuvImage a() {
        njo.p(this.b, "doneWriting() must be called before getImage.");
        return this.a;
    }
    
    @Override
    public final LongPair allocate(final int n, final int n2, final int n3) {
        njo.p(this.a == null, "allocate() should be called at most once.");
        this.a = new YuvImage(n, n2, n3);
        return new LongPair(0L, YuvWriteView.e(this.a));
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
