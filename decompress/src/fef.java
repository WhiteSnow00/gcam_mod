import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fef implements hub
{
    private static final nsd c;
    final AtomicBoolean a;
    final hgg b;
    
    static {
        c = nsd.g("com/google/android/apps/camera/microvideo/SafeJpegSaving$ScanAndResumeFailedJpegsBehavior");
    }
    
    public fef(final hgg b) {
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            if (this.a.getAndSet(true)) {
                return;
            }
            final hgg b = this.b;
            b.b(false);
            if (b.b.k(cxr.bi)) {
                b.b(true);
            }
        }
        finally {
            final Throwable t;
            a.m(fef.c.b(), "Failed to restore JPEG files", '\u0623', t);
        }
    }
}
