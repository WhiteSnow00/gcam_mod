import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import j$.util.function.BooleanSupplier;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwl
{
    private static final float n;
    private static final float o;
    public final CameraCoachHudView a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final BooleanSupplier g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    
    static {
        n = (float)jvu.u(18.0f);
        o = (float)jvu.u(2.0f);
    }
    
    public cwl(final CameraCoachHudView a, final BooleanSupplier g) {
        this.k = 9.424778f;
        this.l = 9.424778f;
        this.m = false;
        this.a = a;
        this.g = g;
        final Paint b = new Paint();
        (this.b = b).setColor(-1);
        b.setStrokeWidth((float)jvu.u(1.0f));
        b.setAntiAlias(true);
        b.setAlpha(255);
        b.setStyle(Paint$Style.STROKE);
        b.setStrokeCap(Paint$Cap.SQUARE);
        b.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint d = new Paint();
        (this.d = d).setColor(Color.parseColor("#FDD663"));
        d.setStrokeWidth((float)jvu.u(2.0f));
        d.setAntiAlias(true);
        d.setAlpha(255);
        d.setStyle(Paint$Style.STROKE);
        d.setStrokeCap(Paint$Cap.SQUARE);
        d.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint e = new Paint();
        (this.e = e).setColor(Color.parseColor("#FDD663"));
        e.setStrokeWidth((float)jvu.u(1.0f));
        e.setAntiAlias(true);
        e.setAlpha(255);
        e.setStyle(Paint$Style.STROKE);
        e.setStrokeCap(Paint$Cap.SQUARE);
        e.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint c = new Paint();
        (this.c = c).setColor(-1);
        c.setAntiAlias(true);
        c.setAlpha(255);
        final Paint f = new Paint();
        (this.f = f).setColor(Color.parseColor("#FDD663"));
        f.setAntiAlias(true);
        f.setAlpha(255);
    }
    
    public static void a(final float n, final float n2, final Paint paint, final Paint paint2, final Canvas canvas) {
        final float o = cwl.o;
        canvas.drawCircle(n, n2, o, paint2);
        final float n3 = cwl.n;
        canvas.drawLine(n - n3 / 2.0f, n2, n - o, n2, paint);
        canvas.drawLine(n + n3 / 2.0f, n2, n + o, n2, paint);
        canvas.drawLine(n, n2 - n3 / 2.0f, n, n2 - o, paint);
        canvas.drawLine(n, n2 + n3 / 2.0f, n, n2 + o, paint);
    }
    
    public final void b() {
        final boolean h = this.h;
        this.h = false;
        if (h) {
            this.k = 9.424778f;
            this.l = 9.424778f;
            this.m = false;
            this.a.invalidate();
        }
    }
}
