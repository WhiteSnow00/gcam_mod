// 
// Decompiled by Procyon v0.6.0
// 

final class pal extends phd implements owy
{
    private static final long serialVersionUID = 897683679971470653L;
    final pam a;
    long b;
    
    public pal(final pam a) {
        this.a = a;
    }
    
    @Override
    public final void bY(final pss pss) {
        this.i(pss);
    }
    
    @Override
    public final void cc() {
        final long b = this.b;
        if (b != 0L) {
            this.b = 0L;
            this.h(b);
        }
        this.a.g();
    }
    
    @Override
    public final void cd(final Throwable t) {
        final long b = this.b;
        if (b != 0L) {
            this.b = 0L;
            this.h(b);
        }
        this.a.i(t);
    }
    
    @Override
    public final void ce(final Object o) {
        ++this.b;
        this.a.j(o);
    }
}
