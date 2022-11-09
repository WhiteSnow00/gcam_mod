import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bdg implements awk
{
    @Override
    public final aza b(final Context context, final aza aza, int width, int height) {
        if (!biv.o(width, height)) {
            final StringBuilder sb = new StringBuilder(128);
            sb.append("Cannot apply transformation on width: ");
            sb.append(width);
            sb.append(" or height: ");
            sb.append(height);
            sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(sb.toString());
        }
        final azk a = auf.b(context).a;
        final Bitmap bitmap = (Bitmap)aza.c();
        if (width == Integer.MIN_VALUE) {
            width = bitmap.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = bitmap.getHeight();
        }
        final Bitmap c = this.c(a, bitmap, width, height);
        if (bitmap.equals(c)) {
            return aza;
        }
        return bdf.f(c, a);
    }
    
    protected abstract Bitmap c(final azk p0, final Bitmap p1, final int p2, final int p3);
}
