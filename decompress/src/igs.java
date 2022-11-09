import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igs
{
    private PointF a;
    
    public igs() {
        this.a = new PointF(-1.0f, -1.0f);
    }
    
    public final void a() {
        this.a = new PointF(-1.0f, -1.0f);
    }
    
    public final boolean b(final PointF a) {
        if (a.x < 0.0f || a.y < 0.0f) {
            return false;
        }
        if (Math.abs(a.x - this.a.x) <= 0.005f && Math.abs(a.y - this.a.y) <= 0.005f) {
            return false;
        }
        this.a = a;
        return true;
    }
}
