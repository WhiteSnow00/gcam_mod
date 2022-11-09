import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbj implements gxv
{
    private static final krd a;
    private static final krd b;
    private static final krd c;
    private final hhy d;
    private final kra e;
    
    static {
        a = krd.b;
        b = krd.c(25);
        c = krd.c(95);
    }
    
    public gbj(final hhy d, final kra e) {
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a(final gyn gyn, final gyo gyo) {
        switch (gyn.c - 1) {
            default: {
                return;
            }
            case 1: {
                final int[] a = gyo.a;
                final gym b = gyn.b;
                final Bitmap bitmap = Bitmap.createBitmap(a, b.c, b.b, Bitmap$Config.ARGB_8888);
                final Matrix matrix = new Matrix();
                matrix.postRotate((float)this.e.e);
                this.d.W(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
                this.d.O(jwn.ad(2131952601, new Object[0]));
                this.d.b(gbj.b);
                return;
            }
            case 0: {
                final int[] a2 = gyo.a;
                final gym b2 = gyn.b;
                this.d.U(Bitmap.createBitmap(a2, b2.c, b2.b, Bitmap$Config.ARGB_8888), this.e.e);
            }
        }
    }
    
    @Override
    public final void b(final gyn gyn, final him him) {
    }
    
    @Override
    public final void c(final gyn gyn) {
        switch (gyn.c - 1) {
            default: {
                return;
            }
            case 0: {
                this.d.b(gbj.a);
            }
        }
    }
    
    @Override
    public final void d(final gyn gyn, final gzz gzz) {
        if (gyn.c == 3) {
            this.d.b(gbj.c);
        }
    }
}
