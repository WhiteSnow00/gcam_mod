// 
// Decompiled by Procyon v0.6.0
// 

public final class hul implements huh, huk
{
    public final huh a;
    private final huh[] b;
    
    public hul(final huh a, final huh... b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void e() {
        huf.a(this.a);
        final huh[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            huf.a(b[i]);
        }
    }
    
    @Override
    public final void f() {
        this.a.f();
        final huh[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].f();
        }
    }
    
    @Override
    public final void g() {
        final huh[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].g();
        }
        this.a.g();
    }
    
    @Override
    public final void h() {
        huf.b(this);
    }
}
