// 
// Decompiled by Procyon v0.6.0
// 

public final class ain
{
    public static final ain a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public aip h;
    public int i;
    
    static {
        a = new aim().a();
    }
    
    public ain() {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new aip();
    }
    
    public ain(final aim aim) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new aip();
        this.b = false;
        this.c = false;
        this.i = aim.b;
        this.d = false;
        this.e = false;
        this.h = aim.a;
        this.f = -1L;
        this.g = -1L;
    }
    
    public ain(final ain ain) {
        this.i = 1;
        this.f = -1L;
        this.g = -1L;
        this.h = new aip();
        this.b = ain.b;
        this.c = ain.c;
        this.i = ain.i;
        this.d = ain.d;
        this.e = ain.e;
        this.h = ain.h;
    }
    
    public final boolean a() {
        return this.h.a() > 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ain ain = (ain)o;
            return this.b == ain.b && this.c == ain.c && this.d == ain.d && this.e == ain.e && this.f == ain.f && this.g == ain.g && this.i == ain.i && this.h.equals(ain.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int i = this.i;
        if (i != 0) {
            final int b = this.b ? 1 : 0;
            final int c = this.c ? 1 : 0;
            final int d = this.d ? 1 : 0;
            final int e = this.e ? 1 : 0;
            final long f = this.f;
            final long g = this.g;
            return ((((((i * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + (int)(f >>> 32 ^ f)) * 31 + (int)(g >>> 32 ^ g)) * 31 + this.h.hashCode();
        }
        throw null;
    }
}
