// 
// Decompiled by Procyon v0.6.0
// 

final class fkb implements fkl
{
    public final fjz a;
    public boolean b;
    public niz c;
    public boolean d;
    public niz e;
    public long f;
    final /* synthetic */ fkc g;
    private final fkl h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private fkk n;
    
    public fkb(final fkc g, final fkl h) {
        this.g = g;
        this.a = new fjz(this);
        this.i = false;
        this.b = false;
        this.c = nii.a;
        this.d = false;
        this.e = nii.a;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = 0L;
        this.f = 0L;
        this.h = h;
    }
    
    @Override
    public final long a() {
        synchronized (this) {
            this.i = true;
            this.c();
            return this.m;
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.g.a.b("Ending still pending microvideo sessions");
            this.l = true;
            this.c();
        }
    }
    
    public final void c() {
        synchronized (this) {
            if (this.i && !this.j && !this.l) {
                final long a = this.h.a();
                this.m = a;
                final krr a2 = this.g.a;
                final StringBuilder sb = new StringBuilder(61);
                sb.append("Start timestamp from underlying trimmer: ");
                sb.append(a);
                a2.b(sb.toString());
                this.j = true;
            }
            if (this.l) {
                final fkk n = this.n;
                if (n != null) {
                    if (!this.j) {
                        this.g.a.b("... canceling since no start timestamp was requested");
                        final fkk n2 = this.n;
                        n2.getClass();
                        n2.a(fjy.b);
                    }
                    else {
                        n.b(this.m + 3000000L, fkp.j);
                        this.g.a.b("... ending max length later");
                    }
                    this.n = null;
                    this.a.a();
                }
            }
            if (this.n != null && !this.k && !this.l) {
                this.g.a.b("Asking delegate muxer for trimming decision");
                this.h.d(new fka(this));
                this.k = true;
            }
            if (this.b && this.n != null) {
                njo.o(this.l ^ true);
                final krr a3 = this.g.a;
                final long f = this.f;
                final StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Ending normally at ");
                sb2.append(f);
                a3.b(sb2.toString());
                final fkk n3 = this.n;
                n3.getClass();
                n3.b(this.f, (fkp)this.c.c());
                this.n = null;
                this.a.a();
                this.g.a.b("Ended normally.");
            }
            if (this.d && this.n != null) {
                njo.o(this.l ^ true);
                final fkk n4 = this.n;
                n4.getClass();
                n4.a((fjy)this.e.c());
                this.n = null;
                this.a.a();
                this.g.a.b("Cancelled normally.");
            }
        }
    }
    
    @Override
    public final void d(final fkk n) {
        synchronized (this) {
            this.n = n;
            this.a.a.set(this);
            this.c();
        }
    }
}
