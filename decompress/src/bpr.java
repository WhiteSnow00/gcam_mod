import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.FloatDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpr
{
    public final FloatDeque a;
    
    public bpr() {
        this.a = new FloatDeque(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }
    
    public bpr(final FloatDeque a) {
        this.a = a;
    }
    
    public final float a(final int n) {
        final FloatDeque a = this.a;
        return GcamModuleJNI.FloatDeque_getitem(a.a, a, n);
    }
    
    public final long b() {
        final FloatDeque a = this.a;
        return GcamModuleJNI.FloatDeque_size(a.a, a);
    }
    
    public final void c(final float n) {
        final FloatDeque a = this.a;
        GcamModuleJNI.FloatDeque_push_back(a.a, a, n);
    }
}
