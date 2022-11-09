// 
// Decompiled by Procyon v0.6.0
// 

public final class bmk
{
    private volatile int a;
    private volatile int b;
    private volatile int c;
    private volatile int d;
    
    public bmk() {
        this.a();
    }
    
    public final void a() {
        synchronized (this) {
            this.d = 1;
            this.c = 0;
            this.a = 0;
            this.b = 0;
        }
    }
    
    public final boolean b(final gzr gzr) {
        monitorenter(this);
        try {
            ++this.a;
            final boolean b = gzr.b();
            final boolean b2 = false;
            final boolean b3 = false;
            if (b) {
                ++this.c;
            }
            else {
                this.c = 0;
            }
            int n;
            if (this.a - this.b < 30) {
                n = (b3 ? 1 : 0);
            }
            else {
                int n2;
                if (this.c > 30) {
                    n2 = (b2 ? 1 : 0);
                    if (this.d != 3) {
                        this.d = 3;
                        n2 = 1;
                    }
                }
                else {
                    n2 = (b2 ? 1 : 0);
                    if (this.d != 2) {
                        this.d = 2;
                        n2 = (b2 ? 1 : 0);
                    }
                }
                n = n2;
                if (n2 != 0) {
                    this.b = this.a;
                    this.d = 1;
                    n = n2;
                }
            }
            monitorexit(this);
            return n != 0;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
