import android.os.ParcelFileDescriptor;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import android.net.Uri;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcg implements bbx
{
    private final Resources a;
    private final /* synthetic */ int b;
    
    public bcg(final Resources a) {
        this.a = a;
    }
    
    public bcg(final Resources a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        switch (this.b) {
            default: {
                return new bch(this.a, bcd.a);
            }
            case 2: {
                return new bch(this.a, bcf.a(Uri.class, InputStream.class));
            }
            case 1: {
                return new bch(this.a, bcf.a(Uri.class, AssetFileDescriptor.class));
            }
            case 0: {
                return new bch(this.a, bcf.a(Uri.class, ParcelFileDescriptor.class));
            }
        }
    }
}
