import android.graphics.Paint$Align;
import android.graphics.Color;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import j$.util.function.BooleanSupplier;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvp
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final cvo e;
    public final cvo f;
    public final cvo g;
    public final cvo h;
    public final Paint i;
    public final CameraCoachHudView j;
    public final BooleanSupplier k;
    public boolean l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    
    public cvp(final CameraCoachHudView j, final BooleanSupplier k) {
        this.a = (float)jvu.u(8.0f);
        this.b = (float)jvu.u(2.0f);
        this.c = (float)jvu.u(56.0f);
        this.d = (float)jvu.u(4.0f);
        this.l = false;
        this.m = false;
        this.p = 9.424778f;
        this.q = 9.424778f;
        this.r = false;
        this.s = false;
        this.j = j;
        this.k = k;
        final Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStrokeWidth((float)jvu.u(1.0f));
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.SQUARE);
        paint.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#FDD663"));
        paint2.setStrokeWidth((float)jvu.u(1.0f));
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        paint2.setStyle(Paint$Style.STROKE);
        paint2.setStrokeCap(Paint$Cap.SQUARE);
        paint2.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStrokeWidth((float)jvu.u(2.0f));
        paint3.setAntiAlias(true);
        paint3.setAlpha(255);
        paint3.setStyle(Paint$Style.STROKE);
        paint3.setStrokeCap(Paint$Cap.SQUARE);
        paint3.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint paint4 = new Paint();
        paint4.setColor(Color.parseColor("#FDD663"));
        paint4.setStrokeWidth((float)jvu.u(2.0f));
        paint4.setAntiAlias(true);
        paint4.setAlpha(255);
        paint4.setStyle(Paint$Style.STROKE);
        paint4.setStrokeCap(Paint$Cap.SQUARE);
        paint4.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint paint5 = new Paint();
        paint5.setColor(-1);
        paint5.setAntiAlias(true);
        paint5.setAlpha(255);
        paint5.setTextAlign(Paint$Align.CENTER);
        paint5.setTextSize(j.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint5.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        final Paint paint6 = new Paint();
        paint6.setColor(Color.parseColor("#FDD663"));
        paint6.setAntiAlias(true);
        paint6.setAlpha(255);
        paint6.setTextAlign(Paint$Align.CENTER);
        paint6.setTextSize(j.getResources().getDisplayMetrics().scaledDensity * 14.0f);
        paint6.setShadowLayer((float)jvu.u(4.0f), 0.0f, (float)jvu.u(1.0f), -16777216);
        this.e = new cvo(paint2, paint6);
        this.f = new cvo(paint4, paint6);
        this.g = new cvo(paint, paint5);
        this.h = new cvo(paint3, paint5);
        final Paint i = new Paint();
        (this.i = i).setColor(Color.parseColor("#FDD663"));
        i.setStrokeWidth((float)jvu.u(1.0f));
        i.setAntiAlias(true);
        i.setAlpha(255);
        i.setStyle(Paint$Style.STROKE);
        i.setStrokeCap(Paint$Cap.SQUARE);
    }
    
    public final void a() {
        final boolean l = this.l;
        this.l = false;
        if (l) {
            this.p = 9.424778f;
            this.q = 9.424778f;
            this.r = false;
            this.s = false;
            this.j.invalidate();
        }
    }
}
