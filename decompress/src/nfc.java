import android.graphics.drawable.Drawable;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfc extends Drawable$ConstantState
{
    public nfi a;
    public ndx b;
    public ColorFilter c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint$Style v;
    
    public nfc(final nfc nfc) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff$Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint$Style.FILL_AND_STROKE;
        this.a = nfc.a;
        this.b = nfc.b;
        this.l = nfc.l;
        this.c = nfc.c;
        this.d = nfc.d;
        this.e = nfc.e;
        this.h = nfc.h;
        this.g = nfc.g;
        this.m = nfc.m;
        this.j = nfc.j;
        this.s = nfc.s;
        final int q = nfc.q;
        this.q = 0;
        final boolean u = nfc.u;
        this.u = false;
        this.k = nfc.k;
        this.n = nfc.n;
        this.o = nfc.o;
        final float p = nfc.p;
        this.p = 0.0f;
        this.r = nfc.r;
        final int t = nfc.t;
        this.t = 0;
        final ColorStateList f = nfc.f;
        this.f = null;
        this.v = nfc.v;
        final Rect i = nfc.i;
        if (i != null) {
            this.i = new Rect(i);
        }
    }
    
    public nfc(final nfi a) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff$Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint$Style.FILL_AND_STROKE;
        this.a = a;
        this.b = null;
    }
    
    public final int getChangingConfigurations() {
        return 0;
    }
    
    public final Drawable newDrawable() {
        final nfd nfd = new nfd(this);
        nfd.e = true;
        return nfd;
    }
}
