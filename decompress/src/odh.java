import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class odh implements Runnable
{
    final /* synthetic */ oey a;
    final /* synthetic */ int b;
    final /* synthetic */ odj c;
    
    public odh(final odj c, final oey a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            if (this.a.isCancelled()) {
                final odj c = this.c;
                c.a = null;
                c.cancel(false);
            }
            else {
                this.c.h(this.b, this.a);
            }
        }
        finally {
            this.c.i(null);
        }
    }
}
