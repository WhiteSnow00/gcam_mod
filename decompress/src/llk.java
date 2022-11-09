import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum llk
{
    a("DNG", 0, "image/x-adobe-dng", "dng"), 
    b("GIF", 1, "image/gif", "gif"), 
    c("JPEG", 2, "image/jpeg", "jpg"), 
    d("PHOTOSPHERE", 3, "application/vnd.google.panorama360+jpg", "jpg"), 
    e("MPEG4", 4, "video/mp4", "mp4"), 
    f("THREE_GPP", 5, "video/3gpp", "3gp"), 
    g("WEBM", 6, "video/webm", "webm"), 
    h;
    
    private static final Map k;
    private static final Set l;
    private static final Set m;
    public final String i;
    public final String j;
    
    static {
        int i = 0;
        final nnt nnt = new nnt();
        for (llk[] values = values(); i < values.length; ++i) {
            final llk llk = values[i];
            nnt.d(llk.i, llk);
        }
        k = nnt.b();
        l = noi.K(llk.a, llk.b, llk.c, llk.d);
        m = noi.I(llk.e, llk.f);
    }
    
    private llk() {
        this.i = "";
        this.j = "";
    }
    
    private llk(final String s, final int n, final String i, final String j) {
        this.i = i;
        this.j = j;
    }
    
    public static llk a(final String s) {
        final Map k = llk.k;
        if (!k.containsKey(s)) {
            return llk.h;
        }
        return (llk)k.get(s);
    }
    
    public final boolean b() {
        return llk.l.contains(this);
    }
    
    public final boolean c() {
        return llk.m.contains(this);
    }
}
