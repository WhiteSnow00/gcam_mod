import android.accounts.Account;
import java.util.Iterator;
import android.net.Uri;
import org.json.JSONException;
import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import com.google.android.gms.common.api.Scope;
import org.json.JSONArray;
import org.json.JSONObject;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jot
{
    private static jot d;
    final joz a;
    GoogleSignInAccount b;
    GoogleSignInOptions c;
    
    static {
        jot.d = null;
    }
    
    private jot(final Context context) {
        final joz c = joz.c(context);
        this.a = c;
        this.b = c.a();
        this.c = c.b();
    }
    
    public static jot c(final Context context) {
        synchronized (jot.class) {
            return f(context.getApplicationContext());
        }
    }
    
    private static jot f(final Context context) {
        synchronized (jot.class) {
            final jot d = jot.d;
            if (d != null) {
                return d;
            }
            return jot.d = new jot(context);
        }
    }
    
    public final GoogleSignInAccount a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final GoogleSignInOptions b() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final void d() {
        synchronized (this) {
            final joz a = this.a;
            a.a.lock();
            try {
                a.b.edit().clear().apply();
                a.a.unlock();
                this.b = null;
                this.c = null;
            }
            finally {
                a.a.unlock();
            }
        }
    }
    
    public final void e(final GoogleSignInOptions c, final GoogleSignInAccount b) {
        monitorenter(this);
        try {
            final joz a = this.a;
            jvu.a(c);
            a.f("defaultGoogleSignInAccount", b.i);
            jvu.a(c);
            final String i = b.i;
            final String e = a.e("googleSignInAccount", i);
            final JSONObject jsonObject = new JSONObject();
            try {
                final String b2 = b.b;
                if (b2 != null) {
                    jsonObject.put("id", (Object)b2);
                }
                final String c2 = b.c;
                if (c2 != null) {
                    jsonObject.put("tokenId", (Object)c2);
                }
                final String d = b.d;
                if (d != null) {
                    jsonObject.put("email", (Object)d);
                }
                final String e2 = b.e;
                if (e2 != null) {
                    jsonObject.put("displayName", (Object)e2);
                }
                final String k = b.k;
                if (k != null) {
                    jsonObject.put("givenName", (Object)k);
                }
                final String l = b.l;
                if (l != null) {
                    jsonObject.put("familyName", (Object)l);
                }
                final Uri f = b.f;
                if (f != null) {
                    jsonObject.put("photoUrl", (Object)f.toString());
                }
                final String g = b.g;
                if (g != null) {
                    jsonObject.put("serverAuthCode", (Object)g);
                }
                jsonObject.put("expirationTime", b.h);
                jsonObject.put("obfuscatedIdentifier", (Object)b.i);
                final JSONArray jsonArray = new JSONArray();
                final List j = b.j;
                final Scope[] array = j.toArray(new Scope[j.size()]);
                Arrays.sort(array, bzj.m);
                for (int length = array.length, n = 0; n < length; ++n) {
                    jsonArray.put((Object)array[n].b);
                }
                jsonObject.put("grantedScopes", (Object)jsonArray);
                jsonObject.remove("serverAuthCode");
                a.f(e, jsonObject.toString());
                final String e3 = a.e("googleSignInOptions", i);
                final JSONObject jsonObject2 = new JSONObject();
                try {
                    final JSONArray jsonArray2 = new JSONArray();
                    Collections.sort((List<Object>)c.i, GoogleSignInOptions.g);
                    final Iterator iterator = c.i.iterator();
                    while (iterator.hasNext()) {
                        jsonArray2.put((Object)((Scope)iterator.next()).b);
                    }
                    jsonObject2.put("scopes", (Object)jsonArray2);
                    final Account m = c.j;
                    if (m != null) {
                        jsonObject2.put("accountName", (Object)m.name);
                    }
                    jsonObject2.put("idTokenRequested", c.k);
                    jsonObject2.put("forceCodeForRefreshToken", c.m);
                    jsonObject2.put("serverAuthRequested", c.l);
                    if (!TextUtils.isEmpty((CharSequence)c.n)) {
                        jsonObject2.put("serverClientId", (Object)c.n);
                    }
                    if (!TextUtils.isEmpty((CharSequence)c.o)) {
                        jsonObject2.put("hostedDomain", (Object)c.o);
                    }
                    a.f(e3, jsonObject2.toString());
                    this.b = b;
                    this.c = c;
                    monitorexit(this);
                }
                catch (final JSONException ex) {
                    throw new RuntimeException((Throwable)ex);
                }
            }
            catch (final JSONException ex2) {
                throw new RuntimeException((Throwable)ex2);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
