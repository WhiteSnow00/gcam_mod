import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joe extends jqt
{
    static int a;
    public static final jvs b;
    
    static {
        b = new jvs(1);
        joe.a = 1;
    }
    
    public joe(final Context context, final GoogleSignInOptions googleSignInOptions) {
        super(context, job.a, googleSignInOptions, new lsp(), null, null, null);
    }
    
    public final keg a() {
        final jqw j = super.j;
        final Context c = super.c;
        final int b = this.b();
        jor.a.b("Signing out");
        jor.a(c);
        BasePendingResult basePendingResult;
        if (b == 3) {
            final Status a = Status.a;
            basePendingResult = new jtq(j);
            basePendingResult.j(a);
        }
        else {
            basePendingResult = new jon(j);
            j.c((jrs)basePendingResult);
        }
        return jvu.l(basePendingResult);
    }
    
    public final int b() {
        synchronized (this) {
            if (joe.a == 1) {
                final Context c = super.c;
                final jpw a = jpw.a;
                final int f = a.f(c, 12451000);
                if (f == 0) {
                    joe.a = 4;
                }
                else if (a.g(c, f, null) == null && jxi.a(c, "com.google.android.gms.auth.api.fallback") != 0) {
                    joe.a = 3;
                }
                else {
                    joe.a = 2;
                }
            }
            return joe.a;
        }
    }
}
