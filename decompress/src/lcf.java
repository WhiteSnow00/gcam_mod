import android.view.Surface;
import android.hardware.camera2.params.OutputConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcf extends lch
{
    private final ofn d;
    private final OutputConfiguration e;
    private final ljo f;
    private boolean g;
    
    public lcf(final ldm ldm, final OutputConfiguration e) {
        final ofn f = ofn.f();
        super(ldm, f);
        this.g = false;
        this.d = f;
        this.e = e;
        this.f = new lfb(e);
    }
    
    @Override
    public final ljo a() {
        synchronized (this) {
            return this.f;
        }
    }
    
    @Override
    public final void b(final Surface surface) {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            monitorexit(this);
            if (!this.d.isDone()) {
                try {
                    monitorenter(this);
                    try {
                        jlm.c(this.e, surface);
                    }
                    finally {}
                    try {
                        monitorexit(this);
                        this.d.o(surface);
                    }
                    finally {
                        monitorexit(this);
                    }
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
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
        sb.append("DeferredConfig<");
        sb.append(value);
        sb.append(">");
        return sb.toString();
    }
}
