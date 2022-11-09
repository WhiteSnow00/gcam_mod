import android.hardware.HardwareBuffer;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class dhq implements gab
{
    final /* synthetic */ diz a;
    final /* synthetic */ dhs b;
    
    public dhq(final dhs b, final diz a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final oey a() {
        final HardwareBuffer f = this.a.a.f();
        if (f != null) {
            try {
                dhs.a.c().E(791).o("Using CPU processing on an image having a HardwareBuffer?");
            }
            finally {
                try {
                    f.close();
                }
                finally {
                    final Throwable t;
                    t.addSuppressed((Throwable)f);
                }
            }
        }
        if (f != null) {
            f.close();
        }
        final dhs b = this.b;
        final oez a = oez.a(new dhr(b.d, this.a, b.b));
        this.b.c.execute(a);
        return a;
    }
    
    @Override
    public final oey b() {
        return ofi.n(new dih(this.a.a));
    }
}
