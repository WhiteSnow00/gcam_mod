import android.app.Activity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class mee implements Executor, mfh
{
    private final mfp a;
    private Runnable b;
    private boolean c;
    private boolean d;
    
    public mee(final mfp a) {
        this.a = a;
    }
    
    private final void b(final Runnable runnable) {
        if (this.d) {
            return;
        }
        this.d = true;
        runnable.run();
    }
    
    @Override
    public final void a(final Activity activity) {
        this.a.b(this);
        synchronized (this) {
            final Runnable b = this.b;
            if (b != null) {
                this.b(b);
                this.b = null;
            }
            else {
                this.c = true;
            }
        }
    }
    
    @Override
    public final void execute(final Runnable b) {
        synchronized (this) {
            if (!this.c) {
                final mfq a = this.a.a.a;
                final int c = mfq.c;
                if (a.b.get() <= 0) {
                    this.b = b;
                    return;
                }
            }
            this.b(b);
        }
    }
}
