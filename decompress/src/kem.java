import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kem extends keg
{
    public final Object a;
    public final kei b;
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;
    
    public kem() {
        this.a = new Object();
        this.b = new kei();
    }
    
    private final void m() {
        if (this.c) {
            IllegalStateException ex;
            if (this.d()) {
                final Exception b = this.b();
                String string;
                if (b != null) {
                    string = "failure";
                }
                else if (this.e()) {
                    final String value = String.valueOf(this.c());
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
                    sb.append("result ");
                    sb.append(value);
                    string = sb.toString();
                }
                else if (this.d) {
                    string = "cancellation";
                }
                else {
                    string = "unknown issue";
                }
                final String value2 = String.valueOf(string);
                String concat;
                if (value2.length() != 0) {
                    concat = "Complete with: ".concat(value2);
                }
                else {
                    concat = new String("Complete with: ");
                }
                ex = new kdt(concat, b);
            }
            else {
                ex = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw ex;
        }
    }
    
    @Override
    public final keg a(final Executor executor, final kdq kdq) {
        final kem kem = new kem();
        this.b.a(new kds(executor, kdq, kem));
        this.j();
        return kem;
    }
    
    @Override
    public final Exception b() {
        synchronized (this.a) {
            return this.f;
        }
    }
    
    @Override
    public final Object c() {
        synchronized (this.a) {
            jvu.g(this.c, "Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            final Exception f = this.f;
            if (f == null) {
                return this.e;
            }
            throw new kef(f);
        }
    }
    
    @Override
    public final boolean d() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    @Override
    public final boolean e() {
        synchronized (this.a) {
            final boolean c = this.c;
            boolean b = false;
            if (c && !this.d && this.f == null) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final void f(final kdy kdy) {
        this.g(kel.a, kdy);
    }
    
    @Override
    public final void g(final Executor executor, final kdy kdy) {
        this.b.a(new kdx(executor, kdy));
        this.j();
    }
    
    @Override
    public final void h(final Executor executor, final keb keb) {
        this.b.a(new kea(executor, keb));
        this.j();
    }
    
    @Override
    public final void i(final Executor executor, final kee kee) {
        this.b.a(new ked(executor, kee));
        this.j();
    }
    
    public final void j() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            monitorexit(this.a);
            this.b.b(this);
        }
    }
    
    public final void k(final Exception f) {
        jvu.j(f, "Exception must not be null");
        synchronized (this.a) {
            this.m();
            this.c = true;
            this.f = f;
            monitorexit(this.a);
            this.b.b(this);
        }
    }
    
    public final void l(final Object e) {
        synchronized (this.a) {
            this.m();
            this.c = true;
            this.e = e;
            monitorexit(this.a);
            this.b.b(this);
        }
    }
}
