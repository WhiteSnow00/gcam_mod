// 
// Decompiled by Procyon v0.6.0
// 

public final class lhk implements krc
{
    final /* synthetic */ lhl a;
    private final lhc b;
    private boolean c;
    private boolean d;
    
    public lhk(final lhl a, final lhc b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final boolean c) {
        synchronized (this) {
            if (!this.d) {
                long a = this.b.a;
                if (a != 0L) {
                    final boolean c2 = this.c;
                    if (c2 && !c) {
                        a = -a;
                    }
                    else if (c2 || !c) {
                        a = 0L;
                    }
                    this.c = c;
                    monitorexit(this);
                    this.a.h(a);
                }
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            long n;
            if (this.c) {
                n = -this.b.a;
            }
            else {
                n = 0L;
            }
            monitorexit(this);
            final krc c = this.a.c();
            this.b.close();
            this.a.h(n);
            c.close();
        }
    }
}
