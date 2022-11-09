import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.LockedHardwareBuffer;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogq implements InterleavedU8ClientAllocator
{
    private final long a;
    private final long b;
    private HardwareBuffer c;
    private LockedHardwareBuffer d;
    
    public ogq(final long a, final long b) {
        njo.d(GcamModuleJNI.kInvalidAllocationId_get() != 0L);
        njo.e(true, "allocateUsage must contain USAGE_CPU_WRITE_RARELY.");
        njo.e(true, "lockUsage must contain USAGE_CPU_WRITE_RARELY.");
        this.a = a;
        this.b = b;
    }
    
    public final HardwareBuffer a() {
        final HardwareBuffer c = this.c;
        boolean b = false;
        if (c != null && this.d == null) {
            b = true;
        }
        njo.p(b, "doneWriting() must be called before getImage.");
        return this.c;
    }
    
    @Override
    public final LongPair allocate(final int n, final int n2, final int n3) {
        final boolean b = true;
        njo.j(n3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueHardwareBufferInterleavedU8ClientAllocator only supports %s.", n3, 4);
        njo.p(this.c == null && b, "allocate() should be called at most once.");
        final HardwareBuffer create = HardwareBuffer.create(n, n2, 1, 1, this.a);
        this.c = create;
        this.d = LockedHardwareBuffer.c(create, this.b);
        return new LongPair(0L, InterleavedWriteViewU8.a(this.d.b()));
    }
    
    @Override
    public final void doneWriting(final long n) {
        final boolean b = true;
        njo.d(n == 0L);
        njo.p(this.c != null, "doneWriting() was called before allocate().");
        njo.p(this.d != null && b, "doneWriting() was called more than once.");
        this.d.close();
        this.d = null;
    }
}
