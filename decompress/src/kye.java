// 
// Decompiled by Procyon v0.6.0
// 

final class kye implements Runnable
{
    public boolean a;
    public boolean b;
    public kvx c;
    public boolean d;
    public ljm e;
    public boolean f;
    public boolean g;
    public kwp h;
    private final kyf i;
    
    public kye(final kyf i) {
        this.h = null;
        this.c = null;
        this.e = null;
        this.i = i;
    }
    
    @Override
    public final void run() {
        final kwp h = this.h;
        h.getClass();
        if (this.a) {
            h.a();
        }
        if (this.b) {
            final kwp h2 = this.h;
            this.c.getClass();
            h2.e();
        }
        if (this.d) {
            this.h.d(this.e);
        }
        if (this.f) {
            this.h.c();
        }
        if (this.g) {
            this.h.b();
        }
        this.h = null;
        this.a = false;
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = false;
        this.g = false;
        final kyf i = this.i;
        synchronized (i.a) {
            i.a.add(this);
        }
    }
}
