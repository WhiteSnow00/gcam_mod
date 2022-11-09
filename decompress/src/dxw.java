import android.graphics.Bitmap;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedReadViewU8;
import android.location.Location;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.BitmapFactory;
import com.google.googlex.gcam.imageio.JpgHelper;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.LockedHardwareBuffer;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

final class dxw implements Runnable
{
    final /* synthetic */ dxy a;
    private final jcw b;
    private final ofn c;
    private int d;
    private final boolean e;
    private final ShotMetadata f;
    private final int g;
    private final niz h;
    
    public dxw(final dxy a, final jcw b, final ofn c, final int d, final boolean e, final ShotMetadata f, final int g, final niz h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        InterleavedReadViewU8 interleavedReadViewU8;
        if (this.b.a.g()) {
            interleavedReadViewU8 = ((InterleavedImageU8)this.b.a.c()).c();
        }
        else {
            if (!this.b.b.g()) {
                return;
            }
            interleavedReadViewU8 = LockedHardwareBuffer.c((HardwareBuffer)this.b.b.c(), 3L).a();
        }
        kre i = new kre(interleavedReadViewU8.d(), interleavedReadViewU8.c());
        int imageRotationToDegrees;
        if (this.e) {
            imageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(this.f.b());
            okn.z(this.f);
            i = i.i(kra.b(imageRotationToDegrees));
            this.d = 0;
        }
        else {
            imageRotationToDegrees = 0;
        }
        final niz a = JpgHelper.a(interleavedReadViewU8, new JpgEncodeOptions(), imageRotationToDegrees);
        if (a.g()) {
            final ExifInterface a2 = dub.a(i.a, i.b, this.f, this.h);
            final dxy a3 = this.a;
            final hdz g = a3.g;
            final lfu l = a3.f.l();
            final int d = this.d;
            if (g.c(l)) {
                final boolean f = a2.bz.f();
                Bitmap decodeByteArray = null;
                if (f) {
                    final byte[] b = a2.bz.b;
                    if (b != null) {
                        decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
                    }
                }
                else {
                    a2.bz.g();
                }
                if (decodeByteArray != null) {
                    final Bitmap b2 = g.b(decodeByteArray, d, l, false);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    if (b2.compress(Bitmap$CompressFormat.JPEG, 90, (OutputStream)byteArrayOutputStream)) {
                        final byte[] byteArray = byteArrayOutputStream.toByteArray();
                        a2.bz.e();
                        a2.bz.b = byteArray;
                    }
                }
            }
            final niz d2 = this.a.c.d();
            if (d2.g()) {
                new kvj(a2).d((Location)d2.c());
            }
            this.a.b.a(a2);
            this.c.o(gaf.a(this.f.d() / 1000L + this.g, (byte[])a.c(), i, this.d, a2, null));
            return;
        }
        a.l(dxy.a.b(), "Error encoding burst image", '\u03d8');
        this.c.a(new RuntimeException("Image couldn't be encoded."));
    }
}
