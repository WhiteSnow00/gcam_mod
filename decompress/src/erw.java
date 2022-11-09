import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erw extends esc
{
    private PointF m;
    
    @Override
    public final void a(final float[] array) {
        this.f(array, this.m.x, this.m.y, 1.0f);
    }
    
    public final void b(final PointF pointF) {
        (this.m = new PointF()).set(pointF);
    }
}
