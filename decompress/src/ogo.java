import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.InterleavedImageU8;
import java.util.HashMap;
import java.util.Map;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogo implements InterleavedU8ClientAllocator
{
    private final Object a;
    private final Object b;
    private long c;
    private final Map d;
    private final Map e;
    private final Map f;
    
    public ogo() {
        this.a = new Object();
        this.b = new Object();
        this.c = 0L;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }
    
    public final niz a(final long n) {
        synchronized (this.b) {
            return niz.h(this.f.remove(n));
        }
    }
    
    @Override
    public final LongPair allocate(final int n, final int n2, final int n3) {
        final InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(n, n2, n3);
        final InterleavedWriteViewU8 d = interleavedImageU8.d();
        synchronized (this.a) {
            final long c = this.c;
            this.c = 1L + c;
            final Map d2 = this.d;
            final Long value = c;
            d2.put(value, interleavedImageU8);
            this.e.put(value, d);
            return new LongPair(c, InterleavedWriteViewU8.a(d));
        }
    }
    
    @Override
    public final void doneWriting(final long n) {
        synchronized (this.a) {
            final Map d = this.d;
            final Long value = n;
            final InterleavedImageU8 interleavedImageU8 = d.remove(value);
            this.e.remove(value);
            monitorexit(this.a);
            interleavedImageU8.getClass();
            final Object b = this.b;
            synchronized (this.a) {
                this.f.put(value, interleavedImageU8);
            }
        }
    }
}
