import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import android.net.Uri;
import org.json.JSONObject;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joz
{
    private static final Lock c;
    private static joz d;
    public final Lock a;
    public final SharedPreferences b;
    
    static {
        c = new ReentrantLock();
    }
    
    public joz(final Context context) {
        this.a = new ReentrantLock();
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    
    public static joz c(final Context context) {
        jvu.a(context);
        final Lock c = joz.c;
        c.lock();
        try {
            if (joz.d == null) {
                joz.d = new joz(context.getApplicationContext());
            }
            final joz d = joz.d;
            c.unlock();
            return d;
        }
        finally {
            joz.c.unlock();
        }
    }
    
    public final GoogleSignInAccount a() {
        final String d = this.d("defaultGoogleSignInAccount");
        GoogleSignInAccount googleSignInAccount;
        if (TextUtils.isEmpty((CharSequence)d)) {
            googleSignInAccount = null;
        }
        else {
            final String d2 = this.d(this.e("googleSignInAccount", d));
            if (d2 != null) {
                try {
                    if (TextUtils.isEmpty((CharSequence)d2)) {
                        googleSignInAccount = null;
                        return googleSignInAccount;
                    }
                    final JSONObject jsonObject = new JSONObject(d2);
                    final String optString = jsonObject.optString("photoUrl");
                    Uri parse;
                    if (!TextUtils.isEmpty((CharSequence)optString)) {
                        parse = Uri.parse(optString);
                    }
                    else {
                        parse = null;
                    }
                    final long long1 = Long.parseLong(jsonObject.getString("expirationTime"));
                    final HashSet set = new HashSet();
                    final JSONArray jsonArray = jsonObject.getJSONArray("grantedScopes");
                    for (int length = jsonArray.length(), i = 0; i < length; ++i) {
                        set.add(new Scope(jsonArray.getString(i)));
                    }
                    final String optString2 = jsonObject.optString("id");
                    String optString3;
                    if (jsonObject.has("tokenId")) {
                        optString3 = jsonObject.optString("tokenId");
                    }
                    else {
                        optString3 = null;
                    }
                    String optString4;
                    if (jsonObject.has("email")) {
                        optString4 = jsonObject.optString("email");
                    }
                    else {
                        optString4 = null;
                    }
                    String optString5;
                    if (jsonObject.has("displayName")) {
                        optString5 = jsonObject.optString("displayName");
                    }
                    else {
                        optString5 = null;
                    }
                    String optString6;
                    if (jsonObject.has("givenName")) {
                        optString6 = jsonObject.optString("givenName");
                    }
                    else {
                        optString6 = null;
                    }
                    String optString7;
                    if (jsonObject.has("familyName")) {
                        optString7 = jsonObject.optString("familyName");
                    }
                    else {
                        optString7 = null;
                    }
                    final String string = jsonObject.getString("obfuscatedIdentifier");
                    final long longValue = long1;
                    jvu.h(string);
                    final GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(set), optString6, optString7);
                    String optString8;
                    if (jsonObject.has("serverAuthCode")) {
                        optString8 = jsonObject.optString("serverAuthCode");
                    }
                    else {
                        optString8 = null;
                    }
                    googleSignInAccount2.g = optString8;
                    googleSignInAccount = googleSignInAccount2;
                    return googleSignInAccount;
                }
                catch (final JSONException ex) {}
            }
            googleSignInAccount = null;
        }
        return googleSignInAccount;
    }
    
    public final GoogleSignInOptions b() {
        final String d = this.d("defaultGoogleSignInAccount");
        final boolean empty = TextUtils.isEmpty((CharSequence)d);
        GoogleSignInOptions a = null;
        final GoogleSignInOptions googleSignInOptions = null;
        if (!empty) {
            final String d2 = this.d(this.e("googleSignInOptions", d));
            a = googleSignInOptions;
            if (d2 != null) {
                try {
                    a = GoogleSignInOptions.a(d2);
                }
                catch (final JSONException ex) {
                    a = googleSignInOptions;
                }
            }
        }
        return a;
    }
    
    public final String d(String string) {
        this.a.lock();
        try {
            string = this.b.getString(string, (String)null);
            return string;
        }
        finally {
            this.a.unlock();
        }
    }
    
    public final String e(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(s.length() + 1 + String.valueOf(s2).length());
        sb.append(s);
        sb.append(":");
        sb.append(s2);
        return sb.toString();
    }
    
    protected final void f(final String s, final String s2) {
        this.a.lock();
        try {
            this.b.edit().putString(s, s2).apply();
        }
        finally {
            this.a.unlock();
        }
    }
}
