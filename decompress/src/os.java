import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.content.res.ColorStateList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class os implements sw
{
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;
    
    public os() {
        this.a = new int[] { 2131231060, 2131231058, 2131230984 };
        this.b = new int[] { 2131231008, 2131231043, 2131231015, 2131231010, 2131231011, 2131231014, 2131231013 };
        this.c = new int[] { 2131231057, 2131231059, 2131231001, 2131231053, 2131231054, 2131231055, 2131231056 };
        this.d = new int[] { 2131231033, 2131230999, 2131231032 };
        this.e = new int[] { 2131231051, 2131231061 };
        this.f = new int[] { 2131230987, 2131230993, 2131230988, 2131230994 };
    }
    
    public static final boolean a(final int[] array, final int n) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static final ColorStateList b(final Context context, final int n) {
        final int b = tj.b(context, 2130968846);
        return new ColorStateList(new int[][] { tj.a, tj.c, tj.b, tj.e }, new int[] { tj.a(context, 2130968843), gv.b(b, n), gv.b(b, n), n });
    }
    
    public static final LayerDrawable c(final sx sx, final Context context, int dimensionPixelSize) {
        dimensionPixelSize = context.getResources().getDimensionPixelSize(dimensionPixelSize);
        final Drawable c = sx.c(context, 2131231047);
        final Drawable c2 = sx.c(context, 2131231048);
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        if (c instanceof BitmapDrawable && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable)c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        }
        else {
            final Bitmap bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmap);
        }
        bitmapDrawable2.setTileModeX(Shader$TileMode.REPEAT);
        BitmapDrawable bitmapDrawable3;
        if (c2 instanceof BitmapDrawable && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable)c2;
        }
        else {
            final Bitmap bitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
            final Canvas canvas2 = new Canvas(bitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmap2);
        }
        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)bitmapDrawable, (Drawable)bitmapDrawable3, (Drawable)bitmapDrawable2 });
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }
    
    public static final void d(final Drawable drawable, final int n, final PorterDuff$Mode porterDuff$Mode) {
        Drawable mutate = drawable;
        if (qi.c(drawable)) {
            mutate = drawable.mutate();
        }
        PorterDuff$Mode a;
        if ((a = porterDuff$Mode) == null) {
            a = ot.a;
        }
        mutate.setColorFilter((ColorFilter)ot.b(n, a));
    }
}
