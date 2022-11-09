import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glx implements fwt
{
    private static final nsd b;
    public final long a;
    private final kwh c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private boolean g;
    
    static {
        b = nsd.g("com/google/android/apps/camera/pixelcamerakit/aaa/PckLock3A");
    }
    
    public glx(final kwh c, final long a, final boolean d, final boolean e, final boolean f) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final long a() {
        return this.a;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            try {
                ofi.w(((kzi)this.c).a.d(this.d, this.e, this.f, false), new gnn(1), odx.a);
            }
            catch (final kuw kuw) {
                a.m(glx.b.b(), "Error unlocking 3A.", '\u074f', kuw);
            }
        }
    }
}
