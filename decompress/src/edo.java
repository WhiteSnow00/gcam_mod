// 
// Decompiled by Procyon v0.6.0
// 

public final class edo
{
    public static final nsd a;
    public final edp b;
    private final eel c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/audio/AudioRecorder");
    }
    
    public edo(final eel c, final edp b) {
        this.c = c;
        this.b = b;
    }
    
    public final void a() {
        this.c.a();
        final edp b = this.b;
        b.b = false;
        try {
            b.join(1000L);
        }
        catch (final InterruptedException ex) {
            a.n(edp.a.b(), "%s", ex.getMessage(), '\u0465', ex);
        }
    }
}
