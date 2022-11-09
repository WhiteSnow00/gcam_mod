// 
// Decompiled by Procyon v0.6.0
// 

final class adp implements u
{
    public final adu a;
    public final adm b;
    public boolean c;
    
    public adp(final adu a, final adm b) {
        this.c = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Object o) {
        if (adn.c(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("  onLoadFinished in ");
            sb.append(this.a);
            sb.append(": ");
            sb.append(adu.j(o));
            sb.toString();
        }
        this.c = true;
        this.b.b(o);
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
