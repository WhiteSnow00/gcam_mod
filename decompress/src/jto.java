import java.util.Set;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class jto implements Runnable
{
    final /* synthetic */ kdm a;
    final /* synthetic */ jtp b;
    
    public jto(final jtp b, final kdm a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jtp b = this.b;
        final kdm a = this.a;
        final jps b2 = a.b;
        if (b2.c()) {
            final jvw c = a.c;
            jvu.a(c);
            final jps c2 = c.c;
            if (!c2.c()) {
                final String value = String.valueOf(c2);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(value);
                Log.wtf("SignInCoordinator", sb.toString(), (Throwable)new Exception());
                b.f.b(c2);
                b.e.j();
                return;
            }
            final jsp f = b.f;
            final jvk a2 = c.a();
            final Set c3 = b.c;
            if (a2 != null && c3 != null) {
                f.f = a2;
                f.c = c3;
                f.c();
            }
            else {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", (Throwable)new Exception());
                f.b(new jps(4));
            }
        }
        else {
            b.f.b(b2);
        }
        b.e.j();
    }
}
