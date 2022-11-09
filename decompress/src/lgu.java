import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lgu implements lgq
{
    final /* synthetic */ lgw a;
    private final String b;
    private final List c;
    private boolean d;
    
    public lgu(final lgw a, final String b) {
        this.a = a;
        this.b = b;
        this.c = new ArrayList(6000);
        this.d = true;
    }
    
    @Override
    public final String a() {
        return this.b;
    }
    
    @Override
    public final void b(final long n, final long n2, lgp a) {
        monitorenter(this);
        try {
            if (!this.d) {
                a.a(nns.l());
                monitorexit(this);
                return;
            }
            synchronized (this.a) {
                this.c.clear();
                int c = this.a.c;
                int n3;
                int n4;
                while (true) {
                    n3 = 0;
                    if (c >= 6000) {
                        n4 = 0;
                        break;
                    }
                    final lgs lgs = this.a.a.get(c);
                    final long e = lgs.e;
                    if (e > n2) {
                        n4 = 0;
                        break;
                    }
                    if (e >= n) {
                        final lgs lgs2 = (lgs)this.a.b.a();
                        lgs2.a(lgs);
                        this.c.add(lgs2);
                    }
                    ++c;
                }
                while (true) {
                    final lgw a2 = this.a;
                    if (n4 >= a2.c) {
                        break;
                    }
                    final lgs lgs3 = a2.a.get(n4);
                    final long e2 = lgs3.e;
                    if (e2 > n2) {
                        break;
                    }
                    if (e2 >= n) {
                        final lgs lgs4 = (lgs)this.a.b.a();
                        lgs4.a(lgs3);
                        this.c.add(lgs4);
                    }
                    ++n4;
                }
                monitorexit(this.a);
                a.a(this.c);
                a = (lgp)this.a;
                monitorenter(a);
                int i = n3;
                try {
                    while (i < this.c.size()) {
                        this.a.b.b(this.c.get(i));
                        ++i;
                    }
                    this.c.clear();
                }
                finally {
                    monitorexit(a);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.d = false;
            this.a.b(this);
        }
    }
}
