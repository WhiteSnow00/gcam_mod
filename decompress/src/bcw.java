import java.net.URL;
import android.text.TextUtils;
import java.io.File;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcw implements bbw
{
    private final bbw a;
    private final /* synthetic */ int b;
    
    public bcw(final bbw a) {
        this.a = a;
    }
    
    public bcw(final bbw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    private static Uri c(final String s) {
        return Uri.fromFile(new File(s));
    }
}
