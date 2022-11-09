import java.io.OutputStream;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfv implements bfy
{
    private final Bitmap$CompressFormat a;
    
    public bfv() {
        final Bitmap$CompressFormat jpeg = Bitmap$CompressFormat.JPEG;
        this.a = jpeg;
    }
    
    @Override
    public final aza a(final aza aza, final awg awg) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap)aza.c()).compress(this.a, 100, (OutputStream)byteArrayOutputStream);
        aza.e();
        return new bfa(byteArrayOutputStream.toByteArray());
    }
}
