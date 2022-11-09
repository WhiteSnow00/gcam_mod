// 
// Decompiled by Procyon v0.6.0
// 

public final class gnr implements fxx
{
    private static final nsd a;
    private final oey b;
    private final kwd c;
    private final niz d;
    private final niz e;
    private final boa f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/advice/PckAdviceFrameRetrievalCommand");
    }
    
    public gnr(final oey b, final kwd c, final niz d, final niz e, final boa f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void a() {
        if (this.d.g() && this.e.g()) {
            if (((kzl)this.d.c()).c.contains(this.e.c())) {
                final kzl kzl = (kzl)this.d.c();
                final kwz kwz = (kwz)this.e.c();
                try {
                    final kvs q = this.c.q(kzl);
                    try {
                        kwp.j(q);
                        final lju d = q.d(kwz);
                        final boi boi = (boi)knf.d(this.b);
                        if (d != null) {
                            if (boi != null) {
                                final gya a = gyb.a(d);
                                a.c(q.c());
                                a.c = kra.b((int)this.f.c().aQ());
                                boi.g(a.a());
                            }
                            else {
                                d.close();
                            }
                        }
                        q.close();
                    }
                    finally {
                        try {
                            q.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
                catch (final InterruptedException ex) {
                    a.m(gnr.a.c(), "Unable to retrieve frame", '\u076a', ex);
                }
            }
        }
    }
}
