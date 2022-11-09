// 
// Decompiled by Procyon v0.6.0
// 

final class nsl extends nsm
{
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f;
    
    public nsl(final int d) {
        this.f = 0;
        this.b = "A";
        this.c = "a";
        this.d = d;
        this.e = "PG";
    }
    
    @Override
    public final int a() {
        return (char)this.d;
    }
    
    @Override
    public final String b() {
        return this.b.replace('/', '.');
    }
    
    @Override
    public final String c() {
        return this.e;
    }
    
    @Override
    public final String d() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nsl) {
            final nsl nsl = (nsl)o;
            if (this.b.equals(nsl.b) && this.c.equals(nsl.c) && this.d == nsl.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int f;
        if ((f = this.f) == 0) {
            f = ((this.b.hashCode() + 4867) * 31 + this.c.hashCode()) * 31 + this.d;
            this.f = f;
        }
        return f;
    }
}
