// 
// Decompiled by Procyon v0.6.0
// 

public final class jma extends jmc
{
    public final jmt a;
    
    public jma(final jmf jmf) {
        super(jmf);
        this.a = new jmt(jmf);
    }
    
    @Override
    protected final void a() {
        this.a.A();
    }
    
    public final void b(final jnb jnb) {
        this.z();
        this.e().b(new jlz(this, jnb));
    }
    
    final void c() {
        jlw.a();
        final jmt a = this.a;
        jlw.a();
        a.e = System.currentTimeMillis();
    }
}
