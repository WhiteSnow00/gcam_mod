// 
// Decompiled by Procyon v0.6.0
// 

final class dlv extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ kwz b;
    final /* synthetic */ dlw c;
    
    public dlv(final dlw c, final kvs a, final kwz b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.a.close();
    }
    
    @Override
    public final void b() {
        try {
            final kra d = this.c.b.d();
            final ljm c = this.a.c();
            final int e = d.e;
            if (c != null) {
                new gzn(c, e, this.c.a);
                final kvx b = this.a.b();
                final lju d2 = this.a.d(this.b);
                if (b != null && d2 != null) {
                    try {
                        final dmm c2 = this.c.c;
                        c2.b.g(b.a, c2.a.a(d2));
                    }
                    finally {
                        try {
                            d2.close();
                        }
                        finally {
                            final Throwable t;
                            t.addSuppressed((Throwable)d2);
                        }
                    }
                }
                if (d2 != null) {
                    d2.close();
                }
            }
        }
        finally {
            this.a.close();
        }
    }
}
