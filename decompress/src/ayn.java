// 
// Decompiled by Procyon v0.6.0
// 

public final class ayn
{
    public final ayx a;
    public final ayk b;
    public final aze c;
    public final ayi d;
    public final axq e;
    public final bah f;
    private final ayl g;
    
    public ayn(final bah f, bae e, final bar bar, final bar bar2, final bar bar3, final bar bar4) {
        this.f = f;
        final ayl g = new ayl(e);
        this.g = g;
        e = (bae)new axq();
        this.e = (axq)e;
        synchronized (this) {
            synchronized (e) {
                monitorexit(e);
                monitorexit(this);
                this.a = new ayx();
                this.b = new ayk(bar, bar2, bar4, this, this);
                this.d = new ayi(g);
                this.c = new aze();
                f.a = this;
            }
        }
    }
    
    public final void a(final ayr ayr, final awc awc) {
        synchronized (this) {
            this.a.b(awc, ayr);
        }
    }
    
    public final void b(final ayr ayr, final awc awc, final ayt ayt) {
        monitorenter(this);
        Label_0022: {
            if (ayt == null) {
                break Label_0022;
            }
            try {
                if (ayt.a) {
                    this.e.b(awc, ayt);
                }
                this.a.b(awc, ayr);
            }
            finally {
                monitorexit(this);
            }
        }
    }
}
