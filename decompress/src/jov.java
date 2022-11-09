import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcel;
import android.os.Binder;
import android.content.Context;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jov extends bjf implements IInterface
{
    private final Context a;
    
    public jov() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
    
    public jov(final Context a) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = a;
    }
    
    private final void b() {
        if (jxc.b(this.a, Binder.getCallingUid())) {
            return;
        }
        final int callingUid = Binder.getCallingUid();
        final StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
    
    @Override
    protected final boolean x(int b, final Parcel parcel, final Parcel parcel2) {
        switch (b) {
            default: {
                return false;
            }
            case 2: {
                this.b();
                jot.c(this.a).d();
                break;
            }
            case 1: {
                this.b();
                final joz c = joz.c(this.a);
                final GoogleSignInAccount a = c.a();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f;
                if (a != null) {
                    googleSignInOptions = c.b();
                }
                final joe h = lfe.h(this.a, googleSignInOptions);
                if (a != null) {
                    final jqw j = h.j;
                    final Context c2 = h.c;
                    b = h.b();
                    jor.a.b("Revoking access");
                    final String d = joz.c(c2).d("refreshToken");
                    jor.a(c2);
                    jqz a2;
                    if (b == 3) {
                        a2 = joh.a(d);
                    }
                    else {
                        a2 = new jop(j);
                        j.c((jrs)a2);
                    }
                    jvu.l(a2);
                    break;
                }
                h.a();
                break;
            }
        }
        return true;
    }
}
