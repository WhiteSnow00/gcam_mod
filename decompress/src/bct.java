import android.net.Uri;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bct implements bbx
{
    private final Context a;
    private final Class b;
    
    public bct(final Context a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        return new bcv(this.a, bcf.a(File.class, this.b), bcf.a(Uri.class, this.b), this.b);
    }
}
