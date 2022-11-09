// 
// Decompiled by Procyon v0.6.0
// 

final class ged implements gel
{
    public int a;
    public int b;
    public long c;
    final /* synthetic */ gei d;
    private boolean e;
    
    public ged(final gei d) {
        this.d = d;
        this.e = false;
        this.a = 1;
        this.b = 0;
        this.c = -1L;
    }
    
    public final void b() {
        if (!this.e && this.d.c.get()) {
            this.e = true;
            this.d.d.y();
            final long c = this.c;
            if (c > 0L) {
                this.d.a.b.F(0.0f, c);
                return;
            }
            this.d.a.b.D(0.0f);
        }
    }
    
    @Override
    public final void c(final int a) {
        monitorenter(this);
        boolean b;
        if (a > 0) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            njo.d(b);
            this.a = a;
        }
        finally {
            monitorexit(this);
        }
    }
    
    @Override
    public final void d(final long c) {
        this.c = c;
    }
    
    @Override
    public final void e() {
        this.d.b.execute(new gec(this, 1));
    }
}
