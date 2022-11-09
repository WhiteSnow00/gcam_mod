import android.media.MediaDescription$Builder;
import android.net.Uri;
import android.media.MediaDescription;

// 
// Decompiled by Procyon v0.6.0
// 

public class hh
{
    public static Uri a(final MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }
    
    public static void b(final MediaDescription$Builder mediaDescription$Builder, final Uri mediaUri) {
        mediaDescription$Builder.setMediaUri(mediaUri);
    }
    
    public static void c(final int n) {
        if (n >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void d(final Object o) {
        if (o != null) {
            return;
        }
        throw null;
    }
    
    public static ix e(final iq iq) {
        final ix l = ix.l(iq.a.build());
        l.p(null);
        return l;
    }
    
    @Deprecated
    public static void f(final gw gw, final iq iq) {
        iq.a.setSystemWindowInsets(gw.a());
    }
}
