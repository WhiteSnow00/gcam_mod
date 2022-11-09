import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjo
{
    public long a;
    public boolean b;
    private final klj c;
    
    public bjo(final dgm dgm, final bqz bqz) {
        this.a = 0L;
        final klv a = dgm.a;
        this.c = a;
        this.b = (boolean)((kkz)a).d;
        bqz.b.c(a.a(new bjn(this), odx.a));
    }
    
    public final boolean a() {
        return (boolean)((kkz)this.c).d || System.currentTimeMillis() - this.a < 3000L;
    }
}
