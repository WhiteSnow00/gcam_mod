import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

// 
// Decompiled by Procyon v0.6.0
// 

final class jok extends jow
{
    final /* synthetic */ jol a;
    
    public jok(final jol a) {
        this.a = a;
    }
    
    @Override
    public final void b(final GoogleSignInAccount googleSignInAccount, final Status status) {
        if (googleSignInAccount != null) {
            jot.c(this.a.a).e(this.a.b, googleSignInAccount);
        }
        this.a.j(new jog(googleSignInAccount, status));
    }
}
