// 
// Decompiled by Procyon v0.6.0
// 

public final class brf extends brh
{
    public static final nsd a;
    public final brk b;
    private final kjm c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/app/silentfeedback/UncaughtExceptionForwarder");
    }
    
    public brf(final brk b, final UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        this.c = kjm.b;
        this.b = b;
    }
    
    @Override
    protected final void a(final Throwable t) {
        if (this.b != null) {
            if (!kjm.c()) {
                a.m(brf.a.b(), "Uncaught exception in background thread", '{', t);
            }
            this.c.b(new bre(this, t));
        }
    }
}
