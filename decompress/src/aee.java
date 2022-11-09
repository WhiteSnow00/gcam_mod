import android.view.ViewGroup$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aee
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final aef j;
    
    public aee() {
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = -1.0f;
        this.h = -1.0f;
        this.j = new aef();
    }
    
    public final void a(final ViewGroup$LayoutParams viewGroup$LayoutParams, final int n, final int n2) {
        this.j.width = viewGroup$LayoutParams.width;
        this.j.height = viewGroup$LayoutParams.height;
        final aef j = this.j;
        final boolean b = j.b;
        boolean b2 = false;
        final boolean b3 = (b || j.width == 0) && this.a < 0.0f;
        final aef i = this.j;
        if ((i.a || i.height == 0) && this.b < 0.0f) {
            b2 = true;
        }
        final float a = this.a;
        if (a >= 0.0f) {
            viewGroup$LayoutParams.width = Math.round(n * a);
        }
        final float b4 = this.b;
        if (b4 >= 0.0f) {
            viewGroup$LayoutParams.height = Math.round(n2 * b4);
        }
        if (this.i >= 0.0f) {
            if (b3) {
                viewGroup$LayoutParams.width = Math.round(viewGroup$LayoutParams.height * this.i);
                this.j.b = true;
            }
            if (b2) {
                viewGroup$LayoutParams.height = Math.round(viewGroup$LayoutParams.width / this.i);
                this.j.a = true;
            }
        }
    }
    
    public final void b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final aef j = this.j;
        if (!j.b) {
            viewGroup$LayoutParams.width = j.width;
        }
        final aef i = this.j;
        if (!i.a) {
            viewGroup$LayoutParams.height = i.height;
        }
        final aef k = this.j;
        k.b = false;
        k.a = false;
    }
    
    @Override
    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
