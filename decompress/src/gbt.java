import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbt implements gxv
{
    final /* synthetic */ ofn a;
    final /* synthetic */ kra b;
    final /* synthetic */ ofn c;
    
    public gbt(final ofn a, final kra b, final ofn c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final gyn gyn, final gyo gyo) {
        final int[] a = gyo.a;
        final gym b = gyn.b;
        final Bitmap bitmap = Bitmap.createBitmap(a, b.c, b.b, Bitmap$Config.ARGB_8888);
        final int c = gyn.c;
        if (c == 1) {
            this.a.o(bitmap);
            return;
        }
        if (c == 2) {
            final Matrix matrix = new Matrix();
            matrix.postRotate((float)this.b.e);
            this.c.o(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        }
    }
    
    @Override
    public final void b(final gyn gyn, final him him) {
        throw new IllegalStateException("No URI expected for thumbnail generation");
    }
    
    @Override
    public final void c(final gyn gyn) {
    }
    
    @Override
    public final void d(final gyn gyn, final gzz gzz) {
        throw new IllegalStateException("No compressed result expected for thumbnail generation");
    }
}
