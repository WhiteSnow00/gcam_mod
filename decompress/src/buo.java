import android.media.AudioRecord;
import android.media.AudioRecord$Builder;
import java.util.concurrent.Executor;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buo implements buk
{
    private static final nsd a;
    private final klj b;
    private final jjb c;
    private final cid d;
    private final klv e;
    private final float f;
    private final float g;
    private HandlerThread h;
    private Handler i;
    private final AudioManager j;
    private int k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/audiozoom/AudioZoomControllerImpl");
    }
    
    public buo(final jjb c, final klj b, final cid d, final AudioManager j, final klv e) {
        this.h = null;
        this.b = b;
        this.c = c;
        this.d = d;
        this.j = j;
        this.e = e;
        this.f = c.b();
        this.g = c.c();
    }
    
    @Override
    public final void a() {
        final HandlerThread h = this.h;
        if (h != null) {
            h.quit();
            this.h = null;
        }
        (this.h = new HandlerThread("audioZoomThread")).start();
        this.i = new bun(this, this.h.getLooper());
        this.c.e(new bul(this));
        this.d.a(cic.b).c(this.b.a(new bum(this), odx.a));
        this.d.a(cic.b).c(this);
        this.k = 1;
    }
    
    @Override
    public final void b() {
        this.k = 2;
        this.j.setParameters("cal_devid=-2147483520;cal_moduleid=268435527;cal_instanceid=32768;cal_apptype=69940;cal_paramid=268435543;cal_topoid=268438458;cal_data=AQAAAA==");
        this.f(this.d());
    }
    
    @Override
    public final void c() {
        this.k = 3;
        final Handler i = this.i;
        if (i != null) {
            i.removeMessages(0);
        }
    }
    
    @Override
    public final void close() {
        this.k = 1;
        final HandlerThread h = this.h;
        if (h != null) {
            h.quitSafely();
            this.h = null;
        }
    }
    
    public final float d() {
        final float floatValue = (float)this.b.aQ();
        if (floatValue < 1.0f) {
            return 0.0f;
        }
        final float max = Math.max(1.0f, this.g);
        return (floatValue - max) / (this.f - max);
    }
    
    public final void e() {
        final Handler i = this.i;
        if (i != null && this.k == 2) {
            i.sendEmptyMessage(0);
        }
    }
    
    public final void f(float preferredMicrophoneFieldDimension) {
        if (!(boolean)this.e.aQ()) {
            return;
        }
        final AudioRecord build = new AudioRecord$Builder().build();
        if (build != null) {
            if (preferredMicrophoneFieldDimension == 0.0f) {
                preferredMicrophoneFieldDimension = 0.001f;
            }
            try {
                if (!build.setPreferredMicrophoneFieldDimension(preferredMicrophoneFieldDimension)) {
                    buo.a.b().E(147).r("Failed to set audio zoom ratio, ratio = %g", preferredMicrophoneFieldDimension);
                }
            }
            catch (final RuntimeException ex) {
                a.k(buo.a.b(), "Failed to call Audio Zoom API. error: %s", ex.getMessage(), '\u0092');
            }
        }
        build.release();
    }
}
