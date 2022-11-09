// 
// Decompiled by Procyon v0.6.0
// 

public final class fgk
{
    private final fev a;
    private final niz b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    
    public fgk(final fev a, final niz b) {
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = false;
        this.a = a;
        this.b = b;
    }
    
    private final void c() {
        final boolean d = this.e || this.f;
        if (this.d == d && this.c) {
            return;
        }
        this.c = true;
        if (d) {
            this.a.i();
            if (this.b.g()) {
                ((dpm)this.b.c()).a(true);
            }
        }
        else {
            this.a.i();
            if (this.b.g()) {
                ((dpm)this.b.c()).a(false);
            }
        }
        this.d = d;
    }
    
    public final void a(final boolean e) {
        synchronized (this) {
            this.e = e;
            this.c();
        }
    }
    
    public final void b(final boolean f) {
        synchronized (this) {
            this.f = f;
            this.c();
        }
    }
}
