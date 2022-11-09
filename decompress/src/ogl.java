import com.google.googlex.gcam.GcamModuleJNI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogl
{
    public transient long a;
    protected transient boolean b;
    
    public ogl(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_PortraitDepthArguments(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
