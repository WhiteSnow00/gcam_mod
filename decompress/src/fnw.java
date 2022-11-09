import android.graphics.Bitmap;
import java.io.IOException;
import java.io.FileOutputStream;
import android.os.SystemClock;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.drawable.BitmapDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class fnw extends Thread
{
    final /* synthetic */ fol a;
    
    public fnw(final fol a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final fol a = this.a;
        int n;
        if (a.Q == 1) {
            n = 2131231302;
        }
        else {
            n = 2131231295;
        }
        final Bitmap bitmap = ((BitmapDrawable)a.t.f().getResources().getDrawable(n)).getBitmap();
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap$CompressFormat.JPEG, 100, (OutputStream)byteArrayOutputStream);
            byteArrayOutputStream.close();
            final hgx b = this.a.m.b;
            b.P(kre.h(0, 0));
            b.O(jwn.ad(2131952556, new Object[0]));
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            b.U(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, new BitmapFactory$Options()), 0);
            this.a.A.e(b);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long o = this.a.O;
            final hij d = b.d;
            if (d.b()) {
                final FileOutputStream fileOutputStream = new FileOutputStream(d.a());
                try {
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    fileOutputStream.close();
                    this.a.m.b.K();
                    final fol a2 = this.a;
                    a2.v.aq(a2.q, a2.N, (elapsedRealtime - o) * 0.001f);
                    return;
                }
                finally {
                    try {
                        fileOutputStream.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
            throw new IOException("Temporary session file not usable.");
        }
        catch (final IOException ex) {
            a.l(fol.b.b(), "Could not write temporary panorama image.", '\u06ae');
        }
    }
}
