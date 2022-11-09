import android.graphics.PointF;
import android.view.MotionEvent;
import android.content.Context;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import android.view.ScaleGestureDetector;
import android.view.GestureDetector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgu
{
    static final float a;
    public static boolean b;
    public final GestureDetector c;
    public final ScaleGestureDetector d;
    public final jgn e;
    public final jgq f;
    public final nlf g;
    public final klj h;
    public final View i;
    public final cxl j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public int o;
    public final eip p;
    public int q;
    public final jat r;
    public final jav s;
    public final jau t;
    public final jax u;
    private final GestureDetector$OnGestureListener v;
    
    static {
        a = (float)jvu.u(80.0f);
        jgu.b = false;
    }
    
    public jgu(final jay jay, final jat r, final jav s, final jgn e, final jgq f, final ScaleGestureDetector$OnScaleGestureListener scaleGestureDetector$OnScaleGestureListener, final jax u, final jau t, final klj h, final View i, final Context context, final cxl j) {
        final jgs v = new jgs(this);
        this.v = (GestureDetector$OnGestureListener)v;
        this.p = new jgt(this);
        this.c = new GestureDetector(jay.a, (GestureDetector$OnGestureListener)v, jay.b);
        (this.d = new ScaleGestureDetector(jay.a, (ScaleGestureDetector$OnScaleGestureListener)new jgr(this, scaleGestureDetector$OnScaleGestureListener, e), jay.b)).setQuickScaleEnabled(false);
        this.r = r;
        this.s = s;
        e.getClass();
        this.e = e;
        this.f = f;
        this.u = u;
        this.t = t;
        this.q = 1;
        this.g = nnh.c(jgk.a, context.getResources().getString(2131952542), jgk.b, context.getResources().getString(2131952541), jgk.c, context.getResources().getString(2131952540));
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public static void c() {
        jgu.b = false;
    }
    
    public static void d() {
        jgu.b = true;
    }
    
    public static boolean e(final float n) {
        return Math.abs(n) > jgu.a;
    }
    
    public final PointF a(final MotionEvent motionEvent) {
        return new jdh(motionEvent, this.i).a();
    }
    
    public final jgm b() {
        final int q = this.q;
        if (q == 2) {
            return this.r;
        }
        if (q == 3) {
            return this.s;
        }
        return jgm.m;
    }
}
