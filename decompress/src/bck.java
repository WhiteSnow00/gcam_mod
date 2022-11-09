import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bck implements bbx, bcl
{
    private final ContentResolver a;
    private final /* synthetic */ int b;
    
    public bck(final ContentResolver a) {
        this.a = a;
    }
    
    public bck(final ContentResolver a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final awp a(final Uri uri) {
        switch (this.b) {
            default: {
                return new axf(this.a, uri);
            }
            case 1: {
                return new awl(this.a, uri);
            }
            case 0: {
                return new awx(this.a, uri);
            }
        }
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        switch (this.b) {
            default: {
                return new bcm(this);
            }
            case 1: {
                return new bcm(this);
            }
            case 0: {
                return new bcm(this);
            }
        }
    }
}
