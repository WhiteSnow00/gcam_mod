import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;
import android.util.Range;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledExecutorService;
import android.util.DisplayMetrics;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fep implements iui
{
    public final klv a;
    public final fll b;
    public volatile Optional c;
    public volatile float d;
    private final DisplayMetrics e;
    private final gkw f;
    private final ScheduledExecutorService g;
    private final AtomicBoolean h;
    private final jjb i;
    private volatile float j;
    
    public fep(final gkw f, final klv a, final DisplayMetrics e, final jjb i, final ScheduledExecutorService g) {
        this.b = new fll();
        this.h = new AtomicBoolean();
        this.c = Optional.empty();
        this.d = 0.0f;
        this.j = 0.0f;
        this.f = f;
        this.a = a;
        this.e = e;
        this.i = i;
        this.g = g;
    }
    
    private static float d(final float n, final Range range) {
        final float floatValue = (float)range.getLower();
        return (n - floatValue) / ((float)range.getUpper() - floatValue);
    }
    
    private static float e(final float n, final Range range) {
        return n * ((float)range.getUpper() - (float)range.getLower()) + (float)range.getLower();
    }
    
    private static Range f(final float n, final float n2) {
        return Range.create((Comparable)n, (Comparable)Math.max(n, n2));
    }
    
    private final void g(final Range range) {
        synchronized (this) {
            if (this.h.getAndSet(true)) {
                return;
            }
            this.g.schedule(new feo(this, range, 1), 33L, TimeUnit.MILLISECONDS);
        }
    }
    
    @Override
    public final void a(final MotionEvent motionEvent, final MotionEvent motionEvent2, final Rect rect, final boolean b) {
        this.b.b(motionEvent);
        final float c = this.i.c();
        final float b2 = this.i.b();
        Range range;
        if (c < b2) {
            range = Range.create((Comparable)c, (Comparable)b2);
        }
        else {
            range = Range.create((Comparable)1.0f, (Comparable)8.0f);
        }
        if (this.d <= 0.0f) {
            this.d = (float)this.a.aQ();
        }
        if (!this.c.isPresent()) {
            this.c = Optional.of((Object)this.a.aQ());
        }
        final int max = Math.max(this.e.heightPixels, this.e.widthPixels);
        final kra f = this.f.f();
        final kra a = kra.a;
        final int n = 1;
        final int n2 = 1;
        int n3 = 1;
        float n4;
        boolean b3;
        float n6;
        float n7;
        if (f != a && f != kra.c) {
            final float rawX = motionEvent2.getRawX();
            n4 = motionEvent.getRawX();
            b3 = (rect.left < n4 && n4 < rect.right);
            if (f == kra.b) {
                if (rawX > n4) {
                    n3 = 0;
                }
                final float n5 = (float)max;
                n4 = n5 - n4;
                n6 = n5 - Math.max(rawX, (float)rect.right);
                n7 = n5 - Math.min(rawX, (float)rect.left);
            }
            else {
                if (rawX >= n4) {
                    n3 = n;
                }
                else {
                    n3 = 0;
                }
                n6 = Math.min(rawX, (float)rect.left);
                n7 = Math.max(rawX, (float)rect.right);
            }
        }
        else {
            final float rawY = motionEvent2.getRawY();
            n4 = motionEvent.getRawY();
            n6 = Math.min(rawY, (float)rect.top);
            n7 = Math.max(rawY, (float)rect.bottom);
            b3 = (rect.top < n4 && n4 < rect.bottom);
            if (rawY >= n4) {
                n3 = n2;
            }
            else {
                n3 = 0;
            }
        }
        if (n3 != 0) {
            this.b();
            if (!b3) {
                final Range f2 = f(this.d, (float)range.getUpper());
                final Range f3 = f(-n6, max * -0.5f);
                final float max2 = Math.max(0.0f, Math.min(1.0f, d(-n4, f3)));
                float n8 = e(max2, f2);
                if (this.b.a() > 0.0f) {
                    n8 = n8;
                    if (this.b.d()) {
                        final float d = d(this.d, range);
                        final PointF e = this.b.e();
                        e.getClass();
                        this.d = e(Math.max(0.0f, d - d(-e.y, f3)), range);
                        n8 = e(max2, f(this.d, (float)range.getUpper()));
                    }
                }
                this.a.aR((float)range.clamp((Comparable)n8));
            }
        }
        else {
            final float n9 = (float)Math.max(this.e.heightPixels, this.e.widthPixels);
            if (n7 < n9) {
                final Range create = Range.create((Comparable)n7, (Comparable)n9);
                final Range create2 = Range.create((Comparable)0.0f, (Comparable)0.1f);
                if (b3) {
                    this.b();
                    return;
                }
                final float floatValue = (float)create.clamp((Comparable)n4);
                final float floatValue2 = (float)create.getLower();
                final float floatValue3 = (float)create.getUpper();
                final float floatValue4 = (float)create2.getLower();
                this.j = (floatValue - floatValue2) / (floatValue3 - floatValue2) * ((float)create2.getUpper() - floatValue4) + floatValue4;
                this.g(range);
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.j = 0.0f;
            this.h.set(false);
        }
    }
    
    public final void c(final Range range) {
        if (!this.h.get()) {
            return;
        }
        final float floatValue = (float)this.a.aQ();
        final float max = Math.max((float)range.getLower(), floatValue - this.j);
        if (floatValue <= max) {
            return;
        }
        final float floatValue2 = (float)range.clamp((Comparable)max);
        this.a.aR(floatValue2);
        this.d = floatValue2;
        this.g.schedule(new feo(this, range), 33L, TimeUnit.MILLISECONDS);
    }
}
