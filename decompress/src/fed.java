import java.io.IOException;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fed implements fes
{
    private static final nsd a;
    private final him b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/NoOpMicrovideoSession");
    }
    
    public fed(final him b) {
        this.b = b;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final oey b(final hwr hwr, final hia hia, final niz niz, final huz huz) {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31);
        sb.append("No in-flight session found for ");
        sb.append(value);
        return ofi.m(new RuntimeException(sb.toString()));
    }
    
    @Override
    public final oey c(final hwr hwr, final InputStream inputStream, final hia hia, final niz niz, final huz huz) {
        try {
            huz.m(lpy.i(inputStream, (ExifInterface)niz.f(), hia.a));
            hia.c();
            return ofi.n(hwr);
        }
        catch (final IOException ex) {
            a.m(fed.a.b(), "Error while saving jpeg in finishMicrovideo", '\u0622', ex);
            hia.b();
            return ofi.m(ex);
        }
    }
}
