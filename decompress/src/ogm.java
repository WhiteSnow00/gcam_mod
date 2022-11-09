import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogm extends RawWriteView
{
    private transient long b;
    
    public ogm() {
        this(GcamModuleJNI.new_RawImage__SWIG_0());
    }
    
    public ogm(final long b) {
        super(GcamModuleJNI.RawImage_SWIGUpcast(b));
        this.b = b;
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            final long b = this.b;
            if (b != 0L) {
                if (this.a) {
                    this.a = false;
                    GcamModuleJNI.delete_RawImage(b);
                }
                this.b = 0L;
            }
            super.a();
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
