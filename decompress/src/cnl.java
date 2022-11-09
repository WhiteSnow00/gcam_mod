import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnl implements krc
{
    public static final nsd a;
    public final Object b;
    public Surface c;
    public Surface d;
    public final kqm e;
    private kmv f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/surface/CachedPersistentSurface");
    }
    
    public cnl(final kqm e, final byte[] array) {
        this.b = new Object();
        this.e = e;
    }
    
    public final niz a(final kmv f) {
        synchronized (this.b) {
            if (this.f != f) {
                this.f = f;
                this.close();
            }
            return niz.h(this.c);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.b) {
            final Surface c = this.c;
            if (c != null) {
                c.release();
                this.c = null;
            }
            final Surface d = this.d;
            if (d != null) {
                d.release();
                this.d = null;
            }
        }
    }
}
