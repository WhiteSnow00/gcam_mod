import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgi implements jgq
{
    private jgq a;
    
    public jgi() {
        this.a = null;
    }
    
    @Override
    public final boolean a(final PointF pointF) {
        final jgq a = this.a;
        return a != null && a.a(pointF);
    }
    
    @Override
    public final void b() {
        final jgq a = this.a;
        if (a == null) {
            return;
        }
        a.b();
    }
    
    public final void c() {
        this.a = null;
    }
    
    public final void d(final jgq a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean e(final PointF pointF) {
        final jgq a = this.a;
        return a != null && a.e(pointF);
    }
}
