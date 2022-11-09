// 
// Decompiled by Procyon v0.6.0
// 

public final class cws
{
    private final cwr a;
    private final cwr b;
    private final long c;
    private niz d;
    private boolean e;
    
    public cws(final cwr a, final cwr b, final long c) {
        this.d = nii.a;
        this.e = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        synchronized (this) {
            this.e = false;
            this.d = nii.a;
        }
    }
    
    public final void b(final long n) {
        monitorenter(this);
        try {
            final boolean a = this.b.a();
            boolean e = false;
            if (a) {
                this.d = nii.a;
                this.e = false;
                monitorexit(this);
                return;
            }
            niz d;
            if (!this.a.a() && this.d.g() && !this.e) {
                d = nii.a;
            }
            else {
                if (!this.a.a() || this.d.g()) {
                    if (this.d.g() && n - (long)this.d.c() > this.c) {
                        e = true;
                    }
                    this.e = e;
                    monitorexit(this);
                    return;
                }
                d = niz.i(n);
            }
            this.d = d;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean c() {
        synchronized (this) {
            return this.e;
        }
    }
}
