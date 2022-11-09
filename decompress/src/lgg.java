import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgg
{
    public final int a;
    public final kre b;
    
    public lgg(final int a, final kre b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null && o instanceof lgg) {
            final lgg lgg = (lgg)o;
            if (lgg.a == this.a && lgg.b.equals(this.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("ImageReaderFormat");
        d.b("ImageFormat", lou.f(this.a));
        d.b("Size", this.b);
        return d.toString();
    }
}
