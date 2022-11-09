import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfn extends AtomicInteger implements oxp
{
    private static final long serialVersionUID = -5556924161382950569L;
    final oxl a;
    final oyf b;
    final pfo[] c;
    final Object[] d;
    
    public pfn(final oxl a, final oyf b) {
        super(2);
        this.a = a;
        this.b = b;
        final pfo[] c = new pfo[2];
        for (int i = 0; i < 2; ++i) {
            c[i] = new pfo(this, i);
        }
        this.c = c;
        this.d = new Object[2];
    }
    
    final void b(final Throwable t, int i) {
        int j = 0;
        if (this.getAndSet(0) > 0) {
            final pfo[] c = this.c;
            final int length = c.length;
            while (j < i) {
                oyj.g(c[j]);
                ++j;
            }
            ++i;
            while (i < 2) {
                oyj.g(c[i]);
                ++i;
            }
            this.a.b(t);
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bX() {
        int i = 0;
        if (this.getAndSet(0) > 0) {
            final pfo[] c = this.c;
            final int length = c.length;
            while (i < 2) {
                oyj.g(c[i]);
                ++i;
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
