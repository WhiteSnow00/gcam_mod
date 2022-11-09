import android.graphics.PointF;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bxg extends jgp
{
    public fxu a;
    public lfu b;
    public fwx c;
    bxf d;
    private final jbt e;
    private final crg f;
    private final ioe g;
    
    public bxg(final jbt e, final ioe g, final lfw lfw, final crg f, final bmz bmz, final cxl cxl) {
        this.e = e;
        this.g = g;
        this.f = f;
        bmz.i().c(f.a(new bxe(this), odx.a));
        final lfu e2 = f.e();
        this.b = e2;
        final lfj b = der.b(lfw, cxl, e2);
        b.getClass();
        this.c = new fwx(lfw.f(b).f());
    }
    
    @Override
    public final boolean a(PointF a) {
        monitorenter(this);
        try {
            boolean b;
            if (this.c != null) {
                a = this.e.a(a, this.g.a(), this.f.e());
                this.c.a(a);
                final bxf d = this.d;
                if (d != null) {
                    ++((bxd)d).i;
                }
                b = true;
            }
            else {
                b = false;
            }
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
