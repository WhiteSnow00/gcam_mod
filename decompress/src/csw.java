// 
// Decompiled by Procyon v0.6.0
// 

public final class csw
{
    final int a;
    int b;
    int c;
    int d;
    long e;
    
    public csw(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof csw)) {
            return false;
        }
        final csw csw = (csw)o;
        return this.a == csw.a && this.b == csw.b && this.c == csw.c && this.d == csw.d && this.e == csw.e;
    }
}
