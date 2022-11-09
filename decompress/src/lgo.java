import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lgo
{
    private final lgx a;
    private final int b;
    private final byte[] c;
    private final krh d;
    private long e;
    private long f;
    private int g;
    private long h;
    private long i;
    private int j;
    
    public lgo(final lgx a) {
        this.a = a;
        final int b = a.a.getWidth() * a.a.getHeight() * a.a.getLayers() / 104 * 104;
        this.b = b;
        this.c = new byte[b];
        this.d = new krh(lgt.b, b / 104);
    }
    
    private final void c() {
        monitorenter(this);
        try {
            final lgx a = this.a;
            final byte[] c = this.c;
            final int b = this.b;
            int i = 0;
            a.b(c, 0, 0, b);
            this.e = 0L;
            this.f = 0L;
            this.g = 0;
            this.h = 0L;
            this.i = 0L;
            this.j = 0;
            while (i < this.b) {
                final long g = lio.g(this.c, i);
                if (g > this.f) {
                    this.f = g;
                    this.g = i;
                }
                if (g != 0L) {
                    final long j = this.i;
                    if (j == 0L || g < j) {
                        this.i = g;
                        this.j = i;
                    }
                }
                i += 104;
            }
            if (this.f > 0L) {
                this.e = lio.h(this.c, this.g);
            }
            if (this.i > 0L) {
                this.h = lio.h(this.c, this.j);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void d() {
        monitorenter(this);
        try {
            if (this.f == 0L || this.i == 0L) {
                this.c();
                monitorexit(this);
                return;
            }
            this.e(this.g);
            final long g = lio.g(this.c, this.g);
            final long f = this.f;
            if (g != f) {
                this.c();
                monitorexit(this);
                return;
            }
            int n = (this.g + 104) % this.b;
            long f2 = f + 1L;
            long g2;
            while (true) {
                this.e(n);
                g2 = lio.g(this.c, n);
                if (g2 != f2) {
                    break;
                }
                this.g = n;
                this.f = f2;
                this.e = lio.h(this.c, n);
                n = (n + 104) % this.b;
                ++f2;
            }
            if (g2 != 0L && g2 > this.i) {
                this.j = n;
                this.i = g2;
                this.h = lio.h(this.c, n);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void e(final int n) {
        synchronized (this) {
            this.a.b(this.c, n, n, 104);
        }
    }
    
    public final void a(final long n, final long n2, final List list) {
        monitorenter(this);
        try {
            list.clear();
            this.d();
            if (n <= this.e) {
                long h = this.h;
                if (n2 >= h) {
                    long i = this.i;
                    int j = this.j;
                    while (true) {
                        if (h >= n && h <= n2) {
                            final lgs lgs = (lgs)this.d.a();
                            final byte[] c = this.c;
                            lgs.a = lio.f(c, j);
                            lgs.b = lio.f(c, j + 4);
                            lgs.c = lio.f(c, j + 8);
                            lgs.d = lio.g(c, j);
                            lgs.e = lio.h(c, j);
                            lgs.f = lio.e(c, j + 24);
                            lgs.g = lio.e(c, j + 28);
                            lgs.h = lio.e(c, j + 32);
                            list.add(lgs);
                        }
                        if ((j += 104) >= this.b) {
                            j = 0;
                        }
                        final long g = lio.g(this.c, j);
                        if (g == 0L) {
                            break;
                        }
                        if (g < i) {
                            break;
                        }
                        final long h2 = lio.h(this.c, j);
                        if (h2 > n2) {
                            break;
                        }
                        h = h2;
                        i = g;
                    }
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void b(final List list) {
        monitorenter(this);
        try {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.d.b(iterator.next());
            }
            list.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
