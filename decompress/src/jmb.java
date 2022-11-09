import android.util.Log;
import android.content.Context;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public class jmb
{
    public final jmf b;
    
    protected jmb(final jmf b) {
        this.b = b;
    }
    
    private static String a(final Object o) {
        if (o == null) {
            return "";
        }
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof Boolean) {
            if (o == Boolean.TRUE) {
                return "true";
            }
            return "false";
        }
        else {
            if (o instanceof Throwable) {
                return ((Throwable)o).toString();
            }
            return o.toString();
        }
    }
    
    protected static String l(String s, final Object o, final Object o2, final Object o3) {
        final String s2 = "";
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        final String a = a(o);
        final String a2 = a(o2);
        final String a3 = a(o3);
        final StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            sb.append(s3);
            s = ": ";
        }
        else {
            s = s2;
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)a);
        final String s4 = ", ";
        String s5 = s;
        if (!empty) {
            sb.append(s);
            sb.append(a);
            s5 = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            sb.append(s5);
            sb.append(a2);
            s = s4;
        }
        else {
            s = s5;
        }
        if (!TextUtils.isEmpty((CharSequence)a3)) {
            sb.append(s);
            sb.append(a3);
        }
        return sb.toString();
    }
    
    public static final void x() {
        final String s = (String)jnd.b.a();
    }
    
    protected final Context d() {
        return this.b.a;
    }
    
    protected final jlw e() {
        return this.b.a();
    }
    
    protected final jma f() {
        return this.b.b();
    }
    
    protected final jmv g() {
        return this.b.c;
    }
    
    protected final jna h() {
        final jmf b = this.b;
        jmf.f(b.e);
        return b.e;
    }
    
    protected final jnj i() {
        return this.b.d();
    }
    
    protected final jno j() {
        final jmf b = this.b;
        jmf.f(b.f);
        return b.f;
    }
    
    protected final jnw k() {
        return this.b.e();
    }
    
    public final void m(final String s, final Object o) {
        this.w(3, s, o, null, null);
    }
    
    public final void n(final String s) {
        this.w(6, s, null, null, null);
    }
    
    public final void o(final String s, final Object o) {
        this.w(6, s, o, null, null);
    }
    
    public final void p(final String s, final Object o, final Object o2) {
        this.w(6, s, o, o2, null);
    }
    
    public final void q(final String s) {
        this.w(2, s, null, null, null);
    }
    
    public final void r(final String s, final Object o) {
        this.w(2, s, o, null, null);
    }
    
    public final void s(final String s, final Object o, final Object o2) {
        this.w(2, s, o, o2, null);
    }
    
    public final void t(final String s) {
        this.w(5, s, null, null, null);
    }
    
    public final void u(final String s, final Object o) {
        this.w(5, s, o, null, null);
    }
    
    public final void v(final String s, final Object o, final Object o2) {
        this.w(5, s, o, o2, null);
    }
    
    public final void w(final int n, final String s, final Object o, final Object o2, final Object o3) {
        final jnj d = this.b.d;
        if (d != null) {
            final String s2 = (String)jnd.b.a();
            if (Log.isLoggable(s2, n)) {
                Log.println(n, s2, l(s, o, o2, o3));
            }
            if (n >= 5) {
                d.c(n, s, o, o2, o3);
            }
        }
        else {
            final String s3 = (String)jnd.b.a();
            if (Log.isLoggable(s3, n)) {
                Log.println(n, s3, l(s, o, o2, o3));
            }
        }
    }
    
    protected final void y() {
    }
}
