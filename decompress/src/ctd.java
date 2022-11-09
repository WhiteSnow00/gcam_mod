// 
// Decompiled by Procyon v0.6.0
// 

public final class ctd
{
    public final String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    
    public ctd(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ctd)) {
            return false;
        }
        final ctd ctd = (ctd)o;
        return this.a.equals(ctd.a) && this.d == ctd.d && this.e == ctd.e && this.c == ctd.c && this.b == ctd.b && this.f == ctd.f && this.g == ctd.g;
    }
}
