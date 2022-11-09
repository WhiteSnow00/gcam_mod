import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import java.util.Collection;
import java.util.HashSet;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myt implements myw
{
    final /* synthetic */ joe a;
    
    public myt(final joe a) {
        this.a = a;
    }
    
    @Override
    public final keg a() {
        return this.a.a();
    }
    
    @Override
    public final keg b() {
        final joe a = this.a;
        final jqw j = a.j;
        final Context c = a.c;
        final GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)a.f;
        final int b = a.b();
        jor.a.b("silentSignIn()");
        jor.a.b("getEligibleSavedSignInResult()");
        jvu.a(googleSignInOptions);
        final GoogleSignInOptions b2 = jot.c(c).b();
        jrf jrf = null;
        Label_0253: {
            if (b2 == null) {
                jrf = null;
            }
            else {
                final Account i = b2.j;
                final Account k = googleSignInOptions.j;
            Label_0123:
                while (true) {
                    Label_0115: {
                        if (i == null) {
                            if (k == null) {
                                break Label_0115;
                            }
                        }
                        else {
                            if (!i.equals((Object)k)) {
                                jrf = null;
                                break Label_0253;
                            }
                            break Label_0115;
                        }
                        jrf = null;
                        break Label_0253;
                    }
                    if (!googleSignInOptions.l) {
                        if (googleSignInOptions.k) {
                            if (!b2.k) {
                                break Label_0123;
                            }
                            if (!jvu.m(googleSignInOptions.n, b2.n)) {
                                jrf = null;
                                break Label_0253;
                            }
                        }
                        if (!new HashSet(b2.b()).containsAll(new HashSet(googleSignInOptions.b()))) {
                            jrf = null;
                            break Label_0253;
                        }
                        final GoogleSignInAccount a2 = jot.c(c).a();
                        if (a2 == null) {
                            continue;
                        }
                        if (System.currentTimeMillis() / 1000L >= a2.h - 300L) {
                            jrf = null;
                            break Label_0253;
                        }
                        jrf = new jog(a2, Status.a);
                        break Label_0253;
                    }
                    break;
                }
                jrf = null;
            }
        }
        jqx jqx;
        if (jrf != null) {
            jor.a.b("Eligible saved sign in result found");
            jqx = lio.k(jrf, j);
        }
        else if (b == 3) {
            jqx = lio.k(new jog(null, new Status(4)), j);
        }
        else {
            jor.a.b("trySilentSignIn()");
            final jol jol = new jol(j, c, googleSignInOptions);
            j.b(jol);
            jqx = new jqx(jol);
        }
        return jvu.k(jqx, joe.b);
    }
}
