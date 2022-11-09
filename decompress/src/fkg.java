// 
// Decompiled by Procyon v0.6.0
// 

public final class fkg implements fkl
{
    final /* synthetic */ fkh a;
    private final fkl b;
    private final long c;
    private niz d;
    private niz e;
    private boolean f;
    
    public fkg(final fkh a, final long c, final fkl b) {
        this.a = a;
        this.d = nii.a;
        this.e = nii.a;
        this.f = false;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long a() {
        synchronized (this.a) {
            this.a.e.add(this);
            this.b.a();
            final long c = this.c;
            final fkh a = this.a;
            final long g = a.g;
            if (c <= g || !a.f) {
                this.c(g);
            }
            return this.c;
        }
    }
    
    public final void b() {
        final nii a = nii.a;
        final nii a2 = nii.a;
        niz niz = nii.a;
        synchronized (this.a) {
            if (this.f) {
                return;
            }
            niz niz2 = a;
            niz niz3 = a2;
            niz niz4 = niz;
            if (this.e.g()) {
                niz2 = a;
                niz3 = a2;
                niz4 = niz;
                if (this.d.g()) {
                    final fkh a3 = this.a;
                    if (a3.c) {
                        if ((long)this.d.c() <= this.c + a3.d) {
                            niz = niz.i(fjy.g);
                            niz2 = a;
                            niz3 = a2;
                        }
                        else {
                            niz2 = niz.i(this.d.c());
                            niz3 = niz.i(fkp.k);
                        }
                    }
                    else {
                        final long n = this.c + 500000L;
                        if ((long)this.d.c() <= n) {
                            niz2 = niz.i(n);
                            niz3 = niz.i(fkp.l);
                        }
                        else {
                            niz2 = niz.i(this.d.c());
                            niz3 = niz.i(fkp.k);
                        }
                    }
                    this.f = true;
                    this.a.e.remove(this);
                    niz4 = niz;
                }
            }
            monitorexit(this.a);
            if (niz3.g()) {
                final krr a4 = this.a.a;
                final String value = String.valueOf(niz2.c());
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
                sb.append("Sending out end timestamp: ");
                sb.append(value);
                a4.b(sb.toString());
                ((fkk)this.e.c()).b((long)niz2.c(), (fkp)niz3.e(fkp.a));
            }
            if (niz4.g()) {
                this.a.a.b("Cancelling long shot.");
                ((fkk)this.e.c()).a((fjy)niz4.c());
            }
        }
    }
    
    public final void c(final long n) {
        this.d = niz.i(n);
        this.b();
    }
    
    @Override
    public final void d(final fkk fkk) {
        this.e = niz.i(fkk);
        this.b.d(new fkf(this));
        this.b();
    }
}
