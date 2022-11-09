import android.content.Context;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipo
{
    public boolean a;
    private float b;
    private float c;
    private final iqh d;
    private final WindowManager e;
    private final Context f;
    private int g;
    
    public ipo(final iqh d, final WindowManager e, final Context f) {
        this.b = 0.0f;
        this.c = 0.0f;
        this.a = true;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private final void e(final boolean b) {
        if (Math.abs(this.b) <= jvu.u(80.0f) && Math.abs(this.c) <= 3.0f) {
            this.a();
            return;
        }
        final float b2 = this.b;
        final int n = 2;
        int n2;
        if (b2 > 0.0f) {
            n2 = 2;
        }
        else {
            n2 = 1;
        }
        if (this.f(b)) {
            if (this.e.getDefaultDisplay().getRotation() == 3) {
                if (n2 == 2) {
                    n2 = 1;
                }
                else {
                    n2 = n;
                }
            }
            final iqh d = this.d;
            if (n2 == 1) {
                ((ipn)d).i.l();
            }
            else {
                ((ipn)d).i.f();
            }
            this.a();
            return;
        }
        this.d.u(n2, false);
    }
    
    private final boolean f(final boolean b) {
        return b == jcb.d(jcb.a(this.e.getDefaultDisplay(), this.f));
    }
    
    public final void a() {
        this.g = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        final ipn ipn = (ipn)this.d;
        ipn.b.setClickable(true);
        ipn.d.F(true);
        ipn.e.g(1);
    }
    
    public final void b(final boolean b) {
        if (!this.a && !this.f(b)) {
            return;
        }
        this.e(b);
    }
    
    public final void c(final float n) {
        float n2 = n;
        if (this.e.getDefaultDisplay().getRotation() == 1) {
            n2 = -n;
        }
        this.c = n2 / 1000.0f;
    }
    
    public final void d(float b, final boolean b2) {
        final boolean b3 = this.f(b2) ^ true;
        if (!this.a && b3) {
            return;
        }
        float n = b;
        if (b2) {
            n = b;
            if (this.e.getDefaultDisplay().getRotation() == 1) {
                n = -b;
            }
        }
        b = this.b + n;
        this.b = b;
        if (++this.g <= 2) {
            return;
        }
        Label_0138: {
            if (b3) {
                if (b <= 0.0f || !this.d.p()) {
                    if (this.b >= 0.0f) {
                        break Label_0138;
                    }
                    if (!this.d.o()) {
                        break Label_0138;
                    }
                }
                this.a();
                return;
            }
        }
        if (b3 && Math.abs(this.b) >= jvu.u(5.0f)) {
            final ipn ipn = (ipn)this.d;
            if (ipn.k) {
                ((hbv)ipn.j.get()).a();
            }
        }
        if (Math.abs(this.b) >= jvu.u(80.0f)) {
            this.e(b2);
        }
    }
}
