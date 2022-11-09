// 
// Decompiled by Procyon v0.6.0
// 

public final class hup implements hui
{
    private final huq a;
    private krc b;
    
    public hup(final huq a) {
        this.a = a;
    }
    
    @Override
    public final void f() {
        this.b = this.a.a();
    }
    
    @Override
    public final void g() {
        final krc b = this.b;
        nov.z(b);
        b.close();
        this.b = null;
    }
}
