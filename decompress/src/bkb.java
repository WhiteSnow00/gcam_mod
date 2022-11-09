import android.graphics.RectF;
import java.util.concurrent.Executor;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkb
{
    public final klj a;
    public final eyt b;
    private final jbt c;
    private final bjj d;
    private final ioe e;
    
    public bkb(final jbt c, final ioe e, final klj a, final eyt b, final bjj d) {
        this.c = c;
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final bkx a(final lfu lfu, final PointF pointF, final bkk bkk) {
        final RectF a = this.e.a();
        final bkx a2 = this.d.a(new bjz(this.c.a(pointF, a, lfu)));
        ofi.w(((bkn)bkk).c, new bka(this, pointF, a), odx.a);
        return a2;
    }
}
