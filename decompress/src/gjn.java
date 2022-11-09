// 
// Decompiled by Procyon v0.6.0
// 

public final class gjn
{
    public final gjp a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    
    public gjn(final gjp a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = "";
        this.f = "";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof gjn && this.a == ((gjn)o).a;
    }
    
    @Override
    public final int hashCode() {
        return this.b;
    }
}
