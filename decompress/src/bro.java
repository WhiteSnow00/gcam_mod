import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bro
{
    private final AtomicBoolean a;
    private final Executor b;
    private final Executor c;
    private final pii d;
    private final pii e;
    private final pii f;
    
    public bro(final pii d, final pii e, final pii f, final Executor executor, final Executor executor2, final kse kse) {
        this.a = new AtomicBoolean(false);
        this.b = new ksk(executor, kse, "ActivityStartup");
        this.c = new ksk(executor2, kse, "ActivityStartup");
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final int n) {
        if (this.a.compareAndSet(false, true)) {
            switch (n - 1) {
                default: {
                    hue.b(this.e, this.b);
                    hue.b(this.f, this.c);
                    return;
                }
                case 1: {
                    hue.b(this.d, this.b);
                    hue.b(this.e, this.b);
                    hue.b(this.f, this.b);
                    break;
                }
            }
        }
    }
}
