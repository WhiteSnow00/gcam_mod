import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;

// 
// Decompiled by Procyon v0.6.0
// 

final class afx extends Drawable$ConstantState
{
    int a;
    afw b;
    ColorStateList c;
    PorterDuff$Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff$Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;
    
    public afx() {
        this.c = null;
        this.d = afz.b;
        this.b = new afw();
    }
    
    public afx(final afx afx) {
        this.c = null;
        this.d = afz.b;
        if (afx != null) {
            this.a = afx.a;
            this.b = new afw(afx.b);
            final Paint c = afx.b.c;
            if (c != null) {
                this.b.c = new Paint(c);
            }
            final Paint b = afx.b.b;
            if (b != null) {
                this.b.b = new Paint(b);
            }
            this.c = afx.c;
            this.d = afx.d;
            this.e = afx.e;
        }
    }
    
    public final void a(final int n, final int n2) {
        this.f.eraseColor(0);
        final Canvas canvas = new Canvas(this.f);
        final afw b = this.b;
        b.a(b.d, afw.a, canvas, n, n2);
    }
    
    public final boolean b() {
        final afw b = this.b;
        if (b.k == null) {
            b.k = b.d.b();
        }
        return b.k;
    }
    
    public int getChangingConfigurations() {
        return this.a;
    }
    
    public final Drawable newDrawable() {
        return new afz(this);
    }
    
    public final Drawable newDrawable(final Resources resources) {
        return new afz(this);
    }
}
