import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfm extends bfc implements ayw
{
    private final /* synthetic */ int b;
    
    public bfm(final BitmapDrawable bitmapDrawable, final int b) {
        this.b = b;
        super((Drawable)bitmapDrawable);
    }
    
    public bfm(final bfk bfk) {
        super(bfk);
    }
    
    @Override
    public final int a() {
        switch (this.b) {
            default: {
                return biv.a(((BitmapDrawable)this.a).getBitmap());
            }
            case 0: {
                final bfr a = ((bfk)this.a).a.a;
                final avo avo = (avo)a.a;
                return avo.a.limit() + avo.c.length + avo.d.length * 4 + a.j;
            }
        }
    }
    
    @Override
    public final Class b() {
        switch (this.b) {
            default: {
                return BitmapDrawable.class;
            }
            case 0: {
                return bfk.class;
            }
        }
    }
    
    @Override
    public final void d() {
        switch (this.b) {
            default: {
                ((BitmapDrawable)this.a).getBitmap().prepareToDraw();
                return;
            }
            case 0: {
                ((bfk)this.a).a().prepareToDraw();
            }
        }
    }
    
    @Override
    public final void e() {
        switch (this.b) {
            default: {
                ((BitmapDrawable)this.a).getBitmap().recycle();
                return;
            }
            case 0: {
                ((bfk)this.a).stop();
                final bfk bfk = (bfk)this.a;
                bfk.b = true;
                final bfr a = bfk.a.a;
                a.b.clear();
                a.d();
                a.f();
                final bfo e = a.e;
                if (e != null) {
                    a.c.f(e);
                    a.e = null;
                }
                final bfo g = a.g;
                if (g != null) {
                    a.c.f(g);
                    a.g = null;
                }
                final bfo i = a.i;
                if (i != null) {
                    a.c.f(i);
                    a.i = null;
                }
                final avo avo = (avo)a.a;
                avo.f = null;
                final byte[] c = avo.c;
                if (c != null) {
                    avo.j.b(c);
                }
                final int[] d = avo.d;
                if (d != null) {
                    final azi b = avo.j.b;
                    if (b != null) {
                        b.c(d);
                    }
                }
                final Bitmap g2 = avo.g;
                if (g2 != null) {
                    avo.j.a(g2);
                }
                avo.g = null;
                avo.a = null;
                avo.h = null;
                final byte[] b2 = avo.b;
                if (b2 != null) {
                    avo.j.b(b2);
                }
                a.f = true;
            }
        }
    }
}
