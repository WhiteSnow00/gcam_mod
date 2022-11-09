import java.util.concurrent.RejectedExecutionException;
import java.util.Arrays;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxr
{
    public final kyv a;
    public final krr b;
    public kvr c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final Executor g;
    
    public kxr(final kyv a, final Executor g, final krr krr) {
        this.a = a;
        this.g = g;
        this.b = krr.a("FS3aUpdater");
        this.c = kxn.c().a();
        this.e = false;
    }
    
    public final void a(final kvr kvr, final boolean b) {
        synchronized (this) {
            final lbf c = lbf.c(this.c);
            if (!kvr.d().equals(kxn.a)) {
                c.a = kvr.d();
            }
            if (!kvr.b().equals(kxn.a)) {
                c.b = kvr.b();
            }
            if (!kvr.a().equals(kxn.a)) {
                c.c = kvr.a();
            }
            if (!kvr.c().equals(kxn.a)) {
                c.d = kvr.c();
            }
            if (!kvr.e().equals(kxn.a)) {
                c.e = kvr.e();
            }
            if (!Arrays.equals(kvr.g(), kxn.b)) {
                c.i = kvr.g();
            }
            if (!Arrays.equals(kvr.f(), kxn.b)) {
                c.j = kvr.f();
            }
            if (!Arrays.equals(kvr.h(), kxn.b)) {
                c.k = kvr.h();
            }
            this.c = c.e();
            this.e |= b;
            if (this.f) {
                this.d = true;
                return;
            }
            this.f = true;
            monitorexit(this);
            try {
                this.g.execute(new kxq(this));
            }
            catch (final RejectedExecutionException ex) {
                this.b.b("Task to update 3A rejected by the executor.");
            }
        }
    }
}
