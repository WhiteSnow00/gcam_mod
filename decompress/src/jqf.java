import android.util.Log;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class jqf
{
    static final jqd a;
    static final jqd b;
    private static Context c;
    
    static {
        new jpy(jvl.e("0\u0082\u0005\u00c80\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        new jpz(jvl.e("0\u0082\u0006\u00040\u0082\u0003\u00ec \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        a = new jqa(jvl.e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        b = new jqb(jvl.e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085¸l}\u00d3N\u00f50"));
    }
    
    static void a(final Context context) {
        synchronized (jqf.class) {
            if (jqf.c == null) {
                if (context != null) {
                    jqf.c = context.getApplicationContext();
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }
}
