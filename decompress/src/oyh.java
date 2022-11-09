import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyh extends AtomicReference implements oxp
{
    private static final long serialVersionUID = 5718521705281392066L;
    
    public oyh(final nbl nbl) {
        super(nbl);
    }
    
    @Override
    public final void bX() {
        if (this.get() != null) {
            final nbl nbl = this.getAndSet(null);
            if (nbl != null) {
                try {
                    nbl.a.b.e();
                    final org b = nbl.a.b;
                    synchronized (b) {
                        final org b2 = ((ore)b).b;
                        if (b2 != null) {
                            synchronized (b2) {
                                ((orb)b2).g = 3;
                                b2.notifyAll();
                                monitorexit(b2);
                                ((ore)b).b = null;
                            }
                        }
                        ((ore)b).c = 3;
                        b.notifyAll();
                    }
                }
                catch (final Exception ex) {
                    psn.e(ex);
                    pip.g(ex);
                }
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
