import android.view.MotionEvent;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fll
{
    private PointF a;
    private PointF b;
    private PointF c;
    
    public final float a() {
        synchronized (this) {
            final PointF a = this.a;
            if (a != null && this.b != null) {
                final float y = a.y;
                final float y2 = this.b.y;
                monitorexit(this);
                return y - y2;
            }
            return 0.0f;
        }
    }
    
    public final void b(final MotionEvent motionEvent) {
        synchronized (this) {
            final PointF c = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
            final PointF b = this.b;
            this.c = b;
            final PointF a = this.a;
            this.b = a;
            this.a = c;
            if (a == null) {
                this.b = c;
            }
            if (b == null) {
                this.c = c;
            }
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }
    
    public final boolean d() {
        monitorenter(this);
        try {
            final PointF a = this.a;
            final boolean b = false;
            if (a != null && this.b != null && this.c != null) {
                final float n = a.y - this.b.y;
                final float n2 = this.b.y - this.c.y;
                boolean b2 = false;
                Label_0112: {
                    if (n >= 0.0f || n2 <= 0.0f) {
                        b2 = b;
                        if (n <= 0.0f) {
                            break Label_0112;
                        }
                        b2 = b;
                        if (n2 >= 0.0f) {
                            break Label_0112;
                        }
                    }
                    b2 = true;
                }
                monitorexit(this);
                return b2;
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final PointF e() {
        synchronized (this) {
            final PointF b = this.b;
            if (b == null) {
                return null;
            }
            return new PointF(b.x, this.b.y);
        }
    }
}
