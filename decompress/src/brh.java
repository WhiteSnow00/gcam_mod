// 
// Decompiled by Procyon v0.6.0
// 

public abstract class brh implements UncaughtExceptionHandler
{
    private static final nsd a;
    private final UncaughtExceptionHandler b;
    private final kjm c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/app/silentfeedback/UncaughtExceptionHandlerBase");
    }
    
    public brh(final UncaughtExceptionHandler b) {
        this.c = kjm.b;
        this.b = b;
    }
    
    protected abstract void a(final Throwable p0);
    
    public final void b(final Thread thread, final Throwable t) {
        final UncaughtExceptionHandler b = this.b;
        if (b != null) {
            b.uncaughtException(thread, t);
        }
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        this.a(t);
        if (!kjm.c()) {
            a.n(brh.a.b(), "Uncaught exception in background thread %s", thread, '|', t);
            this.c.execute(new brg(this, thread, t));
            return;
        }
        this.b(thread, t);
    }
}
