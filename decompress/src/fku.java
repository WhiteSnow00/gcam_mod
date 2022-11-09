import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class fku implements fky
{
    private final /* synthetic */ int a;
    
    public fku() {
    }
    
    public fku(final int a) {
        this.a = a;
    }
    
    @Override
    public final fkp a() {
        switch (this.a) {
            default: {
                return fkp.i;
            }
            case 1: {
                return fkp.o;
            }
            case 0: {
                return fkp.f;
            }
        }
    }
    
    @Override
    public final boolean b(final gzn gzn, final gzn gzn2) {
        final int a = this.a;
        boolean b = false;
        switch (a) {
            default: {
                if (gzn.i == 6) {
                    return true;
                }
                break;
            }
            case 1: {
                return gzn.r != gzn2.r;
            }
            case 0: {
                final Rect n = gzn.n;
                final Rect n2 = gzn2.n;
                if (n == null) {
                    b = true;
                    break;
                }
                if (n2 == null) {
                    b = true;
                    break;
                }
                if ((float)Math.hypot(n.width() - n2.width(), n.height() - n2.height()) <= 1.0E-6f) {
                    break;
                }
                return true;
            }
        }
        return b;
    }
}
