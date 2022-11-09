import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avz implements awa
{
    final /* synthetic */ axd a;
    final /* synthetic */ azi b;
    
    public avz(final axd a, final azi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final avt avt) {
        InputStream inputStream;
        try {
            final bel bel = new bel(new FileInputStream(this.a.c().getFileDescriptor()), this.b);
            try {
                final int a = avt.a(bel, this.b);
                try {
                    bel.close();
                }
                catch (final IOException ex) {}
                this.a.c();
                return a;
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
