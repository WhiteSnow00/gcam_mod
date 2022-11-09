import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.RemoteException;
import android.app.PendingIntent;
import android.util.Log;
import android.os.IInterface;
import android.os.Parcelable;
import android.accounts.Account;
import java.util.Set;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtp extends kdh implements jqu, jqv
{
    private static final lio h;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final juq d;
    public kde e;
    public jsp f;
    public final lio g;
    
    static {
        h = kdd.a;
    }
    
    public jtp(final Context a, final Handler b, final juq d) {
        final lio h = jtp.h;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = d.b;
        this.g = h;
    }
    
    public final void a(final int n) {
        this.e.j();
    }
    
    public final void b() {
        final kde e = this.e;
        try {
            Account a;
            if ((a = ((kdk)e).a.a) == null) {
                a = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount a2;
            if ("<<default account>>".equals(a.name)) {
                a2 = joz.c(((jum)e).c).a();
            }
            else {
                a2 = null;
            }
            final Integer t = ((kdk)e).t;
            jvu.a(t);
            final jvv jvv = new jvv(2, a, t, a2);
            final kdi kdi = (kdi)((jum)e).u();
            final kdl kdl = new kdl(1, jvv);
            final Parcel a3 = kdi.a();
            bjg.c(a3, (Parcelable)kdl);
            bjg.e(a3, (IInterface)this);
            kdi.z(12, a3);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.c(new kdm(1, new jps(8, null), null));
            }
            catch (final RemoteException ex2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)ex);
            }
        }
    }
    
    @Override
    public final void c(final kdm kdm) {
        this.b.post((Runnable)new jto(this, kdm));
    }
    
    public final void i(final jps jps) {
        this.f.b(jps);
    }
}
