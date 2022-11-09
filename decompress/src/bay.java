import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bay implements bbx
{
    private final /* synthetic */ int a;
    
    public bay() {
    }
    
    public bay(final int a) {
        this.a = a;
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        switch (this.a) {
            default: {
                return new bcw(bcf.a(Uri.class, InputStream.class), 1);
            }
            case 4: {
                return new bcw(bcf.a(Uri.class, ParcelFileDescriptor.class), 1);
            }
            case 3: {
                return new bcw(bcf.a(Uri.class, AssetFileDescriptor.class), 1);
            }
            case 2: {
                return new bbc();
            }
            case 1: {
                return new baz(new bax(1));
            }
            case 0: {
                return new baz(new bax());
            }
        }
    }
}
