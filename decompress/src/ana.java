// 
// Decompiled by Procyon v0.6.0
// 

public final class ana
{
    public String a;
    public final String b;
    public String c;
    public aiq d;
    public aiq e;
    public long f;
    public long g;
    public long h;
    public ain i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    
    static {
        aiy.b("WorkSpec");
    }
    
    public ana(final ana ana) {
        this.p = 1;
        this.d = aiq.a;
        this.e = aiq.a;
        this.i = ain.a;
        this.q = 1;
        this.k = 30000L;
        this.n = -1L;
        this.r = 1;
        this.a = ana.a;
        this.b = ana.b;
        this.p = ana.p;
        this.c = ana.c;
        this.d = new aiq(ana.d);
        this.e = new aiq(ana.e);
        this.f = ana.f;
        this.g = ana.g;
        this.h = ana.h;
        this.i = new ain(ana.i);
        this.j = ana.j;
        this.q = ana.q;
        this.k = ana.k;
        this.l = ana.l;
        this.m = ana.m;
        this.n = ana.n;
        this.o = ana.o;
        this.r = ana.r;
    }
    
    public ana(final String a, final String b) {
        this.p = 1;
        this.d = aiq.a;
        this.e = aiq.a;
        this.i = ain.a;
        this.q = 1;
        this.k = 30000L;
        this.n = -1L;
        this.r = 1;
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        if (this.c()) {
            long n;
            if (this.q == 2) {
                n = this.k * this.j;
            }
            else {
                n = (long)Math.scalb((float)this.k, this.j - 1);
            }
            return this.l + Math.min(18000000L, n);
        }
        final boolean d = this.d();
        long n2 = 0L;
        if (d) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long l = this.l;
            long n3;
            if (l == 0L) {
                n3 = currentTimeMillis + this.f;
            }
            else {
                n3 = l;
            }
            final long h = this.h;
            final long g = this.g;
            if (h != g) {
                if (l == 0L) {
                    n2 = -h;
                }
                n3 += g;
            }
            else if (l != 0L) {
                n2 = g;
            }
            return n3 + n2;
        }
        long n4;
        if ((n4 = this.l) == 0L) {
            n4 = System.currentTimeMillis();
        }
        return n4 + this.f;
    }
    
    public final boolean b() {
        return !ain.a.equals(this.i);
    }
    
    public final boolean c() {
        return this.p == 1 && this.j > 0;
    }
    
    public final boolean d() {
        return this.g != 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final ana ana = (ana)o;
        if (this.f != ana.f) {
            return false;
        }
        if (this.g != ana.g) {
            return false;
        }
        if (this.h != ana.h) {
            return false;
        }
        if (this.j != ana.j) {
            return false;
        }
        if (this.k != ana.k) {
            return false;
        }
        if (this.l != ana.l) {
            return false;
        }
        if (this.m != ana.m) {
            return false;
        }
        if (this.n != ana.n) {
            return false;
        }
        if (this.o != ana.o) {
            return false;
        }
        if (!this.a.equals(ana.a)) {
            return false;
        }
        if (this.p != ana.p) {
            return false;
        }
        if (!this.b.equals(ana.b)) {
            return false;
        }
        final String c = this.c;
        if (c != null) {
            if (c.equals(ana.c)) {
                return this.d.equals(ana.d) && this.e.equals(ana.e) && this.i.equals(ana.i) && this.q == ana.q && this.r == ana.r;
            }
        }
        else if (ana.c == null) {
            return this.d.equals(ana.d) && this.e.equals(ana.e) && this.i.equals(ana.i) && this.q == ana.q && this.r == ana.r;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int p = this.p;
        cwz.g(p);
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        final long f = this.f;
        final long g = this.g;
        final long h = this.h;
        final int n = (int)(f >>> 32 ^ f);
        final int n2 = (int)(g >>> 32 ^ g);
        final int n3 = (int)(h >>> 32 ^ h);
        final int hashCode6 = this.i.hashCode();
        final int j = this.j;
        final int q = this.q;
        if (q == 0) {
            throw null;
        }
        final long k = this.k;
        final long l = this.l;
        final long m = this.m;
        final long n4 = this.n;
        final int n5 = (int)(k ^ k >>> 32);
        final int n6 = (int)(l >>> 32 ^ l);
        final int n7 = (int)(m >>> 32 ^ m);
        final int n8 = (int)(n4 >>> 32 ^ n4);
        final int o = this.o ? 1 : 0;
        final int r = this.r;
        if (r != 0) {
            return ((((((((((((((((hashCode * 31 + p) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + n) * 31 + n2) * 31 + n3) * 31 + hashCode6) * 31 + j) * 31 + q) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + o) * 31 + r;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{WorkSpec: ");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
