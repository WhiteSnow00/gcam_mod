// 
// Decompiled by Procyon v0.6.0
// 

public final class ud
{
    public final zb a;
    public final yz b;
    
    public ud() {
        this.a = new zb();
        this.b = new yz();
    }
    
    public final rz a(final st st, final int n) {
        final int c = this.a.c(st);
        if (c < 0) {
            return null;
        }
        final uc uc = (uc)this.a.i(c);
        if (uc != null) {
            final int b = uc.b;
            if ((b & n) != 0x0) {
                final int b2 = ~n & b;
                uc.b = b2;
                rz rz;
                if (n == 4) {
                    rz = uc.c;
                }
                else {
                    if (n != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    rz = uc.d;
                }
                if ((b2 & 0xC) == 0x0) {
                    this.a.g(c);
                    uc.c(uc);
                }
                return rz;
            }
        }
        return null;
    }
    
    final void b(final st st) {
        final uc uc = (uc)this.a.get(st);
        uc uc2;
        if (uc == null) {
            final uc a = uc.a();
            this.a.put(st, a);
            uc2 = a;
        }
        else {
            uc2 = uc;
        }
        uc2.b |= 0x1;
    }
    
    public final void c(final long n, final st st) {
        this.b.g(n, st);
    }
    
    public final void d(final st st, final rz d) {
        final uc uc = (uc)this.a.get(st);
        uc uc2;
        if (uc == null) {
            final uc a = uc.a();
            this.a.put(st, a);
            uc2 = a;
        }
        else {
            uc2 = uc;
        }
        uc2.d = d;
        uc2.b |= 0x8;
    }
    
    public final void e(final st st, final rz c) {
        final uc uc = (uc)this.a.get(st);
        uc uc2;
        if (uc == null) {
            final uc a = uc.a();
            this.a.put(st, a);
            uc2 = a;
        }
        else {
            uc2 = uc;
        }
        uc2.c = c;
        uc2.b |= 0x4;
    }
    
    public final void f() {
        this.a.clear();
        this.b.e();
    }
    
    final void g(final st st) {
        final uc uc = (uc)this.a.get(st);
        if (uc == null) {
            return;
        }
        uc.b &= 0xFFFFFFFE;
    }
    
    final void h(final st st) {
        int i = this.b.a() - 1;
        while (i >= 0) {
            if (st == this.b.d(i)) {
                final yz b = this.b;
                if (b.d[i] != yz.a) {
                    b.d[i] = yz.a;
                    b.b = true;
                    break;
                }
                break;
            }
            else {
                --i;
            }
        }
        final uc uc = (uc)this.a.remove(st);
        if (uc != null) {
            uc.c(uc);
        }
    }
    
    public final boolean i(final st st) {
        final uc uc = (uc)this.a.get(st);
        return uc != null && (uc.b & 0x1) != 0x0;
    }
}
