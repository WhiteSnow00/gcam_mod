import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import com.google.android.material.button.MaterialButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndq
{
    public final MaterialButton a;
    public nfi b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff$Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n;
    public boolean o;
    public LayerDrawable p;
    public int q;
    
    public ndq(final MaterialButton a, final nfi b) {
        this.n = false;
        this.a = a;
        this.b = b;
    }
    
    private final nfd e(final boolean b) {
        final LayerDrawable p = this.p;
        if (p != null && p.getNumberOfLayers() > 0) {
            return (nfd)((LayerDrawable)((InsetDrawable)this.p.getDrawable(0)).getDrawable()).getDrawable((int)((b ^ true) ? 1 : 0));
        }
        return null;
    }
    
    private final nfd f() {
        return this.e(true);
    }
    
    public final nfd a() {
        return this.e(false);
    }
    
    public final nfr b() {
        final LayerDrawable p = this.p;
        if (p == null || p.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.p.getNumberOfLayers() > 2) {
            return (nfr)this.p.getDrawable(2);
        }
        return (nfr)this.p.getDrawable(1);
    }
    
    public final void c() {
        this.n = true;
        this.a.c(this.j);
        this.a.d(this.i);
    }
    
    public final void d(final nfi b) {
        this.b = b;
        if (this.a() != null) {
            this.a().b(b);
        }
        if (this.f() != null) {
            this.f().b(b);
        }
        if (this.b() != null) {
            this.b().b(b);
        }
    }
}
