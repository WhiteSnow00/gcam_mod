import java.util.EnumSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class hoe
{
    public final hpc a;
    public final hpe b;
    public hph c;
    public boolean d;
    public boolean e;
    public final kjk f;
    private final EnumSet g;
    
    public hoe(final hpc a, final hpe b) {
        this.a = a;
        this.b = b;
        this.d = false;
        this.e = false;
        final EnumSet<hod> all = EnumSet.allOf(hod.class);
        this.g = all;
        if (!b.d) {
            all.remove(hod.d);
        }
        if (!b.e) {
            all.remove(hod.f);
        }
        if (b.f.aQ()) {
            all.remove(hod.e);
        }
        this.f = new kjk();
    }
    
    public final void a(final lfg lfg) {
        njo.o(this.d);
        final hpc a = this.a;
        if (a instanceof hpb) {
            ((hpb)a).c(lfg);
        }
    }
    
    public final void b(final hod hod, final boolean b) {
        if (b != this.g.contains(hod)) {
            if (b) {
                this.g.add(hod);
            }
            else {
                this.g.remove(hod);
            }
            njo.o(this.d);
            final boolean empty = this.g.isEmpty();
            if (this.e != empty) {
                this.e = empty;
                if (empty) {
                    this.a.u();
                    return;
                }
                this.a.t();
                this.c.a();
            }
        }
    }
    
    public final void c(final boolean b) {
        njo.o(this.d);
        this.b(hod.a, b ^ true);
    }
    
    public final void d(final jbm jbm) {
        njo.o(this.d);
        this.b(hod.b, this.b.b.contains(jbm) ^ true);
    }
    
    public final void e(final lfu lfu) {
        njo.o(this.d);
        this.b(hod.c, this.b.c.contains(lfu) ^ true);
    }
    
    public final void f(final boolean b) {
        njo.o(this.d);
        final hod d = hod.d;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (this.b.d) {
                b2 = true;
            }
        }
        this.b(d, b2);
    }
    
    public final void g(final boolean b) {
        final hod f = hod.f;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (this.b.e) {
                b2 = true;
            }
        }
        this.b(f, b2);
    }
    
    public final void h(final boolean b) {
        this.b(hod.g, b);
    }
}
