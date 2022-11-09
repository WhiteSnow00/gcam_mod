import java.io.File;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class axs implements axw, awo
{
    private final List a;
    private final axx b;
    private final axv c;
    private int d;
    private awc e;
    private List f;
    private int g;
    private volatile bbv h;
    private File i;
    
    public axs(final List a, final axx b, final axv c) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final boolean d() {
        return this.g < this.f.size();
    }
    
    @Override
    public final void a() {
        final bbv h = this.h;
        if (h != null) {
            h.c.aI();
        }
    }
    
    @Override
    public final void b(final Object o) {
        this.c.e(this.e, o, this.h.c, 3, this.e);
    }
    
    @Override
    public final boolean c() {
        try {
            while (true) {
                final List f = this.f;
                boolean b = false;
                if (f != null && this.d()) {
                    this.h = null;
                    while (!b && this.d()) {
                        final bbw bbw = this.f.get(this.g++);
                        final File i = this.i;
                        final axx b2 = this.b;
                        this.h = bbw.a(i, b2.e, b2.f, b2.h);
                        if (this.h != null && this.b.h(this.h.c.a())) {
                            this.h.c.f(this.b.n, this);
                            b = true;
                        }
                    }
                    return b;
                }
                if (++this.d >= this.a.size()) {
                    return false;
                }
                final awc e = this.a.get(this.d);
                final File a = this.b.d().a(new axt(e, this.b.m));
                if ((this.i = a) == null) {
                    continue;
                }
                this.e = e;
                this.f = this.b.g(a);
                this.g = 0;
            }
        }
        finally {
            while (true) {}
        }
    }
    
    @Override
    public final void e(final Exception ex) {
        this.c.d(this.e, ex, this.h.c, 3);
    }
}
