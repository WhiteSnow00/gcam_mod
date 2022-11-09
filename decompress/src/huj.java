// 
// Decompiled by Procyon v0.6.0
// 

public final class huj
{
    int a;
    private final hul b;
    private hul c;
    private final boolean d;
    
    public huj(final hul hul, final boolean d) {
        this.a = 1;
        this.c = hul;
        this.b = hul;
        this.d = d;
    }
    
    public final hul a() {
        if (this.a != 2) {
            return null;
        }
        return this.c;
    }
    
    public final void b() {
        njo.o(this.a == 3);
        this.c = this.b;
    }
    
    public final void c() {
        if (this.a == 3) {
            if (!this.d) {
                this.c = this.b;
            }
            final hul c = this.c;
            nov.z(c);
            c.f();
            this.a = 2;
        }
    }
    
    public final void d() {
        if (this.a == 2) {
            final hul c = this.c;
            nov.z(c);
            c.g();
            this.a = 3;
        }
    }
    
    public final void e() {
        final hul c = this.c;
        c.getClass();
        c.g();
        this.c = null;
    }
    
    public final void f() {
        this.a = 3;
    }
    
    public final void g(final hul c) {
        c.getClass();
        njo.p(this.c == null, "Setting new state without first exiting current state");
        if (this.a == 1) {
            this.a = 2;
        }
        (this.c = c).f();
    }
}
