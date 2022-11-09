import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avw implements awb
{
    final /* synthetic */ axd a;
    final /* synthetic */ azi b;
    
    public avw(final axd a, final azi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ImageHeaderParser$ImageType a(avt c) {
        InputStream inputStream;
        try {
            final bel bel = new bel(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
            try {
                c = (avt)c.c(bel);
                try {
                    bel.close();
                }
                catch (final IOException ex) {}
                this.a.c();
                return (ImageHeaderParser$ImageType)c;
            }
            finally {}
        }
        finally {
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            catch (final IOException ex2) {}
        }
        this.a.c();
    }
}
