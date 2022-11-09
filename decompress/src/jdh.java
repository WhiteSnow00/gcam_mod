import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdh
{
    public final MotionEvent a;
    private final View b;
    
    public jdh(final MotionEvent a, final View b) {
        this.a = a;
        this.b = b;
    }
    
    public final PointF a() {
        final Point z = jwn.Z(this.b);
        return new PointF(this.a.getRawX() - z.x, this.a.getRawY() - z.y);
    }
}
