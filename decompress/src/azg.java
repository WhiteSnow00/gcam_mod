import java.io.IOException;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class azg implements axw, axv
{
    public final axx a;
    public final axv b;
    public volatile Object c;
    public volatile axt d;
    private volatile int e;
    private volatile axs f;
    private volatile bbv g;
    
    public azg(final axx a, final axv b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        final bbv g = this.g;
        if (g != null) {
            g.c.aI();
        }
    }
    
    @Override
    public final void b() {
        throw null;
    }
    
    @Override
    public final boolean c() {
        final Object c = this.c;
        boolean b = false;
        Label_0295: {
            if (c != null) {
                final Object c2 = this.c;
                this.c = null;
                try {
                    bio.b();
                    boolean b2 = false;
                    Label_0275: {
                        try {
                            final awr a = this.a.c.c.a(c2);
                            final Object a2 = a.a();
                            final avr a3 = this.a.c.c.b.a(a2.getClass());
                            if (a3 != null) {
                                final axu axu = new axu(a3, a2, this.a.h);
                                final axt d = new axt(this.g.a, this.a.m);
                                final azz d2 = this.a.d();
                                d2.b(d, axu);
                                if (d2.a(d) != null) {
                                    this.d = d;
                                    this.f = new axs(Collections.singletonList(this.g.a), this.a, this);
                                    this.g.c.d();
                                    break Label_0295;
                                }
                                try {
                                    this.b.e(this.g.a, a.a(), this.g.c, this.g.c.g(), this.g.a);
                                    return true;
                                }
                                finally {
                                    break Label_0275;
                                }
                            }
                            throw new aut(a2.getClass());
                        }
                        finally {
                            b2 = false;
                        }
                    }
                    if (!b2) {
                        this.g.c.d();
                    }
                }
                catch (final IOException ex) {}
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!b && this.e < this.a.f().size()) {
            this.g = this.a.f().get(this.e++);
            if (this.g != null && (this.a.o.c(this.g.c.g()) || this.a.h(this.g.c.a()))) {
                this.g.c.f(this.a.n, new azf(this, this.g));
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final void d(final awc awc, final Exception ex, final awp awp, final int n) {
        this.b.d(awc, ex, awp, this.g.c.g());
    }
    
    @Override
    public final void e(final awc awc, final Object o, final awp awp, final int n, final awc awc2) {
        this.b.e(awc, o, awp, this.g.c.g(), awc);
    }
    
    final boolean f(final bbv bbv) {
        final bbv g = this.g;
        return g != null && g == bbv;
    }
}
