// 
// Decompiled by Procyon v0.6.0
// 

public final class ald
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    
    public ald(final boolean a, final boolean b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ald)) {
            return false;
        }
        final ald ald = (ald)o;
        return this.a == ald.a && this.b == ald.b && this.c == ald.c && this.d == ald.d;
    }
    
    @Override
    public final int hashCode() {
        int a;
        final int n = a = (this.a ? 1 : 0);
        if (this.b) {
            a = n + 16;
        }
        int n2 = a;
        if (this.c) {
            n2 = a + 256;
        }
        int n3 = n2;
        if (this.d) {
            n3 = n2 + 4096;
        }
        return n3;
    }
    
    @Override
    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", this.a, this.b, this.c, this.d);
    }
}
