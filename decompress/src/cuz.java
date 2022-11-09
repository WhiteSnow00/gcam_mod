import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import com.google.android.apps.camera.coach.CameraCoachHudView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cuz
{
    public static final float a;
    public static final float b;
    public static final float c;
    public final CameraCoachHudView d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    
    static {
        a = (float)jvu.u(18.0f);
        b = (float)jvu.u(2.0f);
        c = (float)jvu.u(12.0f);
        jvu.u(7.0f);
    }
    
    public cuz(final CameraCoachHudView d) {
        this.k = 9.424778f;
        this.l = 9.424778f;
        this.m = 4.0f;
        this.d = d;
        final Paint e = new Paint();
        (this.e = e).setColor(-1);
        e.setStrokeWidth((float)jvu.u(1.0f));
        e.setAntiAlias(true);
        e.setAlpha(153);
        e.setStyle(Paint$Style.STROKE);
        e.setStrokeCap(Paint$Cap.SQUARE);
        final Paint f = new Paint();
        (this.f = f).setColor(-1);
        f.setAntiAlias(true);
        f.setAlpha(153);
        final Paint g = new Paint();
        (this.g = g).setColor(-1);
        g.setAntiAlias(true);
        g.setAlpha(153);
    }
    
    public final void a() {
        final boolean h = this.h;
        this.h = false;
        if (h) {
            this.k = 9.424778f;
            this.l = 9.424778f;
            this.d.invalidate();
        }
    }
}
