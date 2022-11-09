import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcg extends lch
{
    private final ofn d;
    private ljo e;
    private boolean f;
    
    public lcg(final ldm ldm) {
        final ofn f = ofn.f();
        super(ldm, f);
        this.f = false;
        this.d = f;
        this.e = null;
    }
    
    @Override
    public final ljo a() {
        synchronized (this) {
            return this.e;
        }
    }
    
    @Override
    public final void b(final Surface surface) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            monitorexit(this);
            if (!this.d.isDone()) {
                try {
                    final OutputConfiguration a = lck.a(this.b, surface);
                    if (a != null) {
                        synchronized (this) {
                            this.e = new lfb(a);
                        }
                    }
                    this.d.o(surface);
                }
                finally {
                    final Throwable t;
                    this.d.a(t);
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15);
        sb.append("DelayedConfig<");
        sb.append(value);
        sb.append(">");
        return sb.toString();
    }
}
