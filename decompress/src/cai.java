import java.util.concurrent.Executor;
import java.util.List;
import android.provider.MediaStore$Images$Media;
import android.net.Uri;
import java.util.concurrent.ExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cai
{
    public static final String[] a;
    public final Context b;
    public final bzi c;
    private final ExecutorService d;
    
    static {
        a = new String[] { "_id" };
    }
    
    public cai(final Context b, final ExecutorService d, final bzi c) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final niz a(final Uri uri) {
        final List pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() == MediaStore$Images$Media.EXTERNAL_CONTENT_URI.getPathSegments().size() + 1) {
            nov.d(pathSegments);
            return niz.i(nov.d(pathSegments));
        }
        return nii.a;
    }
    
    public final oey b(final List list) {
        final oey i = odg.i(oet.q(odg.h(oet.q(odg.h(oet.q(ofi.r(new caf(this, list), this.d)), new cae(list), this.d)), btt.g, this.d)), new cah(this), this.d);
        final bzi c = this.c;
        c.getClass();
        return odg.i(i, new cag(c), this.d);
    }
}
