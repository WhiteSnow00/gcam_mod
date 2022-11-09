import java.util.concurrent.Executor;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciz implements koh
{
    private static final nsd b;
    public final klj a;
    private final ciw c;
    private final klv d;
    private final klv e;
    private AudioRouting f;
    private boolean g;
    private final Object h;
    private krc i;
    
    static {
        b = nsd.g("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceSelectorImpl");
    }
    
    public ciz(final ciw c, final klv a, final klv d, final klv e) {
        this.h = new Object();
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.g = false;
    }
    
    public final void a(final AudioRouting audioRouting) {
        if (audioRouting == null) {
            return;
        }
        AudioDeviceInfo preferredDevice;
        if (((hje)this.a.aQ()).equals(hje.b) && (boolean)this.d.aQ()) {
            preferredDevice = this.c.b();
        }
        else if (((hje)this.a.aQ()).equals(hje.c) && (boolean)this.e.aQ()) {
            preferredDevice = this.c.a();
        }
        else {
            preferredDevice = null;
        }
        final boolean setPreferredDevice = audioRouting.setPreferredDevice(preferredDevice);
        if (preferredDevice != null) {
            ciw.c(preferredDevice);
            if (!setPreferredDevice) {
                audioRouting.setPreferredDevice((AudioDeviceInfo)null);
            }
        }
    }
    
    @Override
    public final void b(final AudioRouting f) {
        synchronized (this.h) {
            if (this.g) {
                ciz.b.c().E(526).o("Ignore start. Already closed");
                return;
            }
            if (this.f != null) {
                this.c();
            }
            f.getRoutedDevice().getType();
            this.a(this.f = f);
            this.i = klq.b(this.d, this.e).a(new ciy(this, f), odx.a);
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.h) {
            if (this.g) {
                ciz.b.c().E(528).o("Ignore stop. Already closed");
                return;
            }
            this.f = null;
            final krc i = this.i;
            if (i != null) {
                i.close();
                this.i = null;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.h) {
            if (this.g) {
                ciz.b.c().E(524).o("Already closed");
                return;
            }
            this.c();
            this.g = true;
        }
    }
}
