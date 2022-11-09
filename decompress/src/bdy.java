import java.util.concurrent.locks.Lock;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.util.Log;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class bdy
{
    private static final azk a;
    
    static {
        a = new bdx();
    }
    
    static aza a(azk a, Drawable drawable, int intrinsicWidth, int intrinsicHeight) {
        final Drawable current = drawable.getCurrent();
        final boolean b = current instanceof BitmapDrawable;
        final int n = 0;
        Object o = null;
        drawable = null;
        Label_0350: {
            if (b) {
                drawable = (Drawable)((BitmapDrawable)current).getBitmap();
                intrinsicWidth = n;
            }
            else {
                if (!(current instanceof Animatable)) {
                    Label_0329: {
                        if (intrinsicWidth == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                            if (Log.isLoggable("DrawableToBitmap", 5)) {
                                final String value = String.valueOf(current);
                                o = new StringBuilder(String.valueOf(value).length() + 95);
                                ((StringBuilder)o).append("Unable to draw ");
                                ((StringBuilder)o).append(value);
                                ((StringBuilder)o).append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                                Log.w("DrawableToBitmap", ((StringBuilder)o).toString());
                                break Label_0329;
                            }
                            break Label_0329;
                        }
                        else if (intrinsicHeight == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                            if (Log.isLoggable("DrawableToBitmap", 5)) {
                                o = String.valueOf(current);
                                final StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 96);
                                sb.append("Unable to draw ");
                                sb.append((String)o);
                                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                                Log.w("DrawableToBitmap", sb.toString());
                                break Label_0329;
                            }
                            break Label_0329;
                        }
                        else {
                            if (current.getIntrinsicWidth() > 0) {
                                intrinsicWidth = current.getIntrinsicWidth();
                            }
                            if (current.getIntrinsicHeight() > 0) {
                                intrinsicHeight = current.getIntrinsicHeight();
                            }
                        }
                        o = beq.a;
                        ((Lock)o).lock();
                        drawable = (Drawable)a.a(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
                        try {
                            final Canvas canvas = new Canvas((Bitmap)drawable);
                            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                            current.draw(canvas);
                            canvas.setBitmap((Bitmap)null);
                            ((Lock)o).unlock();
                            intrinsicWidth = 1;
                            break Label_0350;
                        }
                        finally {
                            ((Lock)o).unlock();
                        }
                    }
                }
                drawable = (Drawable)o;
                intrinsicWidth = n;
            }
        }
        if (intrinsicWidth == 0) {
            a = bdy.a;
        }
        return bdf.f((Bitmap)drawable, a);
    }
}
