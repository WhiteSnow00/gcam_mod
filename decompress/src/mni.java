import android.text.TextUtils;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mni
{
    public static final mnh a;
    public static final mnh b;
    public static final mnh c;
    private static final njk d;
    
    static {
        d = njk.b('/').a();
        a = new mng(1);
        b = new mng();
        c = new mng(2);
    }
    
    public static List a(final String s) {
        return nqb.s(mni.d.f(s), mcj.f);
    }
    
    public static void b(final mnh mnh, final omi omi) {
        final String a = mnh.a(omi);
        final String b = mnh.b(omi);
        if (TextUtils.isEmpty((CharSequence)a) && !TextUtils.isEmpty((CharSequence)b)) {
            mnh.c(omi, ofz.a(b));
        }
        else {
            mnh.c(omi, null);
        }
        mnh.d(omi);
    }
}
