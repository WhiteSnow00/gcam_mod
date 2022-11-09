// 
// Decompiled by Procyon v0.6.0
// 

public final class flh
{
    public final jdr a;
    private fhn b;
    
    public flh() {
        this.b = null;
        this.a = jxc.l(new hbx(1));
    }
    
    public final int a() {
        final jdr a = this.a;
        synchronized (a.a) {
            return a.c.b;
        }
    }
    
    public final void b(final fhn fhn) {
        synchronized (this.a) {
            final fhn b = this.b;
            if (b != null && fhn.e(b)) {
                fhn.b();
                return;
            }
            this.a.e(fhn.a(), (Object)fhn);
        }
    }
    
    public final void c(final long n, final flg flg) {
        final jdr a = this.a;
        monitorenter(a);
        try {
            final fhn b = (fhn)this.a.a(n);
            if (b != null) {
                flg.a(b.a);
                this.b = b;
                while (true) {
                    final fhn fhn = (fhn)this.a.b();
                    if (fhn == null || !fhn.e(b)) {
                        break;
                    }
                    final fhn fhn2 = (fhn)this.a.c();
                    if (fhn2 == null) {
                        continue;
                    }
                    fhn2.b();
                }
                monitorexit(a);
                return;
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
