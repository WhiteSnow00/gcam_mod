import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chr extends kxc
{
    private static final nsd c;
    public int a;
    public int b;
    
    static {
        c = nsd.g("com/google/android/apps/camera/camcorder/frameserver/listener/AutoFrameListener");
    }
    
    public chr() {
        this.a = 0;
        this.b = 0;
    }
    
    @Override
    public final void b(final ljm ljm) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        n.getClass();
        this.d(n);
    }
    
    final void d(final long n) {
        monitorenter(this);
        Label_0034: {
            if (n < 29979000L || n > 36641000L) {
                break Label_0034;
            }
            try {
                ++this.a;
                while (true) {
                    monitorexit(this);
                    return;
                    Label_0063: {
                        a.k(chr.c.c(), "Auto FPS received a frame that was neither 30 or 60 fps. Frame was: %f", 1.0E9f / n, '\u01da');
                    }
                    continue;
                }
                iftrue(Label_0063:)(n < 14999400L || n > 18332600L);
                ++this.b;
                monitorexit(this);
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
}
