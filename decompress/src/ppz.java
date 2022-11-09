// 
// Decompiled by Procyon v0.6.0
// 

public final class ppz
{
    public static final pqe a;
    public final pne b;
    private final int c;
    private final pnf d;
    private final pnb e;
    private final int f;
    private final boolean g;
    
    static {
        a = new pqe("REMOVE_FROZEN");
    }
    
    public ppz(final int f, final boolean g) {
        this.f = f;
        this.g = g;
        final int c = f - 1;
        this.c = c;
        this.d = plv.g(null);
        this.b = plv.f(0L);
        this.e = new pnb(f);
        if (c > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((f & c) == 0x0) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final int a(final Object o) {
        o.getClass();
        final pne b = this.b;
        while (true) {
            final long b2 = b.b;
            if ((0x3000000000000000L & b2) != 0x0L) {
                if ((0x2000000000000000L & b2) != 0x0L) {
                    return 2;
                }
                return 1;
            }
            else {
                final int n = (int)(0x3FFFFFFFL & b2);
                final int n2 = (int)((b2 & 0xFFFFFFFC0000000L) >> 30);
                final int c = this.c;
                if ((n2 + 2 & c) == (n & c)) {
                    return 1;
                }
                if (!this.g && this.e.a(n2 & c).a != null) {
                    final int f = this.f;
                    if (f < 1024 || (n2 - n & 0x3FFFFFFF) > f >> 1) {
                        return 1;
                    }
                    continue;
                }
                else {
                    if (this.b.b(b2, pqf.c(b2, 1152921503533105152L) | (long)(n2 + 1 & 0x3FFFFFFF) << 30)) {
                        final pnf a = this.e.a(n2 & c);
                        final int a2 = png.a;
                        a.a = o;
                        ppz c2 = this;
                        while ((c2.b.b & 0x1000000000000000L) != 0x0L) {
                            c2 = c2.c();
                            final Object a3 = c2.e.a(c2.c & n2).a;
                            if (a3 instanceof ppy && ((ppy)a3).a == n2) {
                                c2.e.a(c2.c & n2).a = o;
                            }
                            else {
                                c2 = null;
                            }
                            if (c2 != null) {
                                continue;
                            }
                            return 0;
                        }
                        return 0;
                    }
                    continue;
                }
            }
        }
    }
    
    public final Object b() {
        final pne b = this.b;
        while (true) {
            final long b2 = b.b;
            if ((b2 & 0x1000000000000000L) != 0x0L) {
                return ppz.a;
            }
            final int n = (int)(b2 & 0x3FFFFFFFL);
            final int c = this.c;
            final int n2 = n & c;
            if ((c & (int)((0xFFFFFFFC0000000L & b2) >> 30)) == n2) {
                return null;
            }
            final Object a = this.e.a(n2).a;
            if (a == null) {
                if (this.g) {
                    return null;
                }
                continue;
            }
            else {
                if (a instanceof ppy) {
                    return null;
                }
                final int n3 = n + 1 & 0x3FFFFFFF;
                if (this.b.b(b2, pqf.d(b2, n3))) {
                    final pnf a2 = this.e.a(this.c & n);
                    final int a3 = png.a;
                    a2.a = null;
                    return a;
                }
                if (this.g) {
                    ppz c2 = this;
                    do {
                        final pne b3 = c2.b;
                        while (true) {
                            final long b4 = b3.b;
                            final int n4 = (int)(b4 & 0x3FFFFFFFL);
                            final boolean a4 = pod.a;
                            if ((b4 & 0x1000000000000000L) != 0x0L) {
                                c2 = c2.c();
                                break;
                            }
                            if (c2.b.b(b4, pqf.d(b4, n3))) {
                                final pnf a5 = c2.e.a(n4 & c2.c);
                                final int a6 = png.a;
                                a5.a = null;
                                c2 = null;
                                break;
                            }
                        }
                    } while (c2 != null);
                    return a;
                }
                continue;
            }
        }
    }
    
    public final ppz c() {
        final pne b = this.b;
        while (true) {
            long b2;
            long n;
            do {
                b2 = b.b;
                if ((b2 & 0x1000000000000000L) != 0x0L) {
                    final pnf d = this.d;
                    ppz ppz;
                    while (true) {
                        ppz = (ppz)d.a;
                        if (ppz != null) {
                            break;
                        }
                        final pnf d2 = this.d;
                        final int f = this.f;
                        final ppz ppz2 = new ppz(f + f, this.g);
                        int n2 = (int)(0x3FFFFFFFL & b2);
                        final int n3 = (int)((0xFFFFFFFC0000000L & b2) >> 30);
                        while (true) {
                            final int c = this.c;
                            final int n4 = n2 & c;
                            if (n4 == (c & n3)) {
                                break;
                            }
                            Object a;
                            if ((a = this.e.a(n4).a) == null) {
                                a = new ppy(n2);
                            }
                            final pnf a2 = ppz2.e.a(ppz2.c & n2);
                            final int a3 = png.a;
                            a2.a = a;
                            ++n2;
                        }
                        final pne b3 = ppz2.b;
                        final int a4 = png.a;
                        b3.b = pqf.c(b2, 1152921504606846976L);
                        d2.c(null, ppz2);
                    }
                    return ppz;
                }
                n = (b2 | 0x1000000000000000L);
            } while (!b.b(b2, n));
            b2 = n;
            continue;
        }
    }
    
    public final boolean d() {
        final pne b = this.b;
        long b2;
        do {
            b2 = b.b;
            if ((b2 & 0x2000000000000000L) != 0x0L) {
                return true;
            }
            if ((0x1000000000000000L & b2) != 0x0L) {
                return false;
            }
        } while (!b.b(b2, 0x2000000000000000L | b2));
        return true;
    }
    
    public final boolean e() {
        final long b = this.b.b;
        return (int)(0x3FFFFFFFL & b) == (int)((b & 0xFFFFFFFC0000000L) >> 30);
    }
}
