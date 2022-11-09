import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jct
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/util/BitmapUtils");
    }
    
    public static Bitmap a(final byte[] array) {
        try {
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            int n = 1;
            bitmapFactory$Options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(array, 0, array.length, bitmapFactory$Options);
            if (!bitmapFactory$Options.mCancel && bitmapFactory$Options.outWidth != -1 && bitmapFactory$Options.outHeight != -1) {
                final double n2 = bitmapFactory$Options.outWidth;
                final double n3 = bitmapFactory$Options.outHeight;
                Double.isNaN(n2);
                Double.isNaN(n3);
                final int n4 = (int)Math.ceil(Math.sqrt(n2 * n3 / 51200.0));
                int inSampleSize;
                if (n4 <= 8) {
                    while ((inSampleSize = n) < n4) {
                        n += n;
                    }
                }
                else {
                    inSampleSize = (n4 + 7) / 8 * 8;
                }
                bitmapFactory$Options.inSampleSize = inSampleSize;
                bitmapFactory$Options.inJustDecodeBounds = false;
                bitmapFactory$Options.inPreferredConfig = Bitmap$Config.ARGB_8888;
                return BitmapFactory.decodeByteArray(array, 0, array.length, bitmapFactory$Options);
            }
            return null;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            a.m(jct.a.b(), "Got oom exception ", '\u0bcb', outOfMemoryError);
            return null;
        }
    }
    
    public static Bitmap b(final Bitmap bitmap, final int n) {
        Bitmap bitmap2 = bitmap;
        if (n != 0) {
            final Matrix matrix = new Matrix();
            if (n != 0) {
                matrix.postRotate((float)n, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            }
            try {
                final Bitmap bitmap3 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if ((bitmap2 = bitmap) != bitmap3) {
                    bitmap.recycle();
                    bitmap2 = bitmap3;
                }
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                bitmap2 = bitmap;
            }
        }
        return bitmap2;
    }
}
