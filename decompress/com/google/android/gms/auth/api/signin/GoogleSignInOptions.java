// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.Map;
import android.accounts.Account;
import java.util.ArrayList;
import java.util.Comparator;
import com.google.android.gms.common.api.Scope;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class GoogleSignInOptions extends jwc implements ReflectedParcelable, jqn
{
    public static final Parcelable$Creator CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final Scope e;
    public static final GoogleSignInOptions f;
    public static Comparator g;
    final int h;
    public final ArrayList i;
    public Account j;
    public boolean k;
    public final boolean l;
    public final boolean m;
    public String n;
    public String o;
    public ArrayList p;
    public String q;
    
    static {
        final Scope scope = a = new Scope("profile");
        b = new Scope("email");
        c = new Scope("openid");
        final Scope scope2 = d = new Scope("https://www.googleapis.com/auth/games_lite");
        e = new Scope("https://www.googleapis.com/auth/games");
        final jof jof = new jof();
        jof.b();
        jof.a.add(scope);
        f = jof.a();
        final jof jof2 = new jof();
        jof2.c(scope2, new Scope[0]);
        jof2.a();
        CREATOR = (Parcelable$Creator)new uj(9);
        GoogleSignInOptions.g = new aab(7);
    }
    
    public GoogleSignInOptions(final int h, final ArrayList i, final Account j, final boolean k, final boolean l, final boolean m, final String n, final String o, final Map map, final String q) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = new ArrayList(map.values());
        this.q = q;
    }
    
    public static GoogleSignInOptions a(String optString) {
        final boolean empty = TextUtils.isEmpty((CharSequence)optString);
        String optString2 = null;
        if (empty) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject(optString);
        final HashSet set = new HashSet();
        final JSONArray jsonArray = jsonObject.getJSONArray("scopes");
        for (int length = jsonArray.length(), i = 0; i < length; ++i) {
            set.add(new Scope(jsonArray.getString(i)));
        }
        if (jsonObject.has("accountName")) {
            optString = jsonObject.optString("accountName");
        }
        else {
            optString = null;
        }
        Account account;
        if (!TextUtils.isEmpty((CharSequence)optString)) {
            account = new Account(optString, "com.google");
        }
        else {
            account = null;
        }
        final ArrayList list = new ArrayList(set);
        final boolean boolean1 = jsonObject.getBoolean("idTokenRequested");
        final boolean boolean2 = jsonObject.getBoolean("serverAuthRequested");
        final boolean boolean3 = jsonObject.getBoolean("forceCodeForRefreshToken");
        String optString3;
        if (jsonObject.has("serverClientId")) {
            optString3 = jsonObject.optString("serverClientId");
        }
        else {
            optString3 = null;
        }
        if (jsonObject.has("hostedDomain")) {
            optString2 = jsonObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, list, account, boolean1, boolean2, boolean3, optString3, optString2, new HashMap(), null);
    }
    
    public static Map c(final List list) {
        final HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (final jos jos : list) {
            hashMap.put(jos.b, jos);
        }
        return hashMap;
    }
    
    public final ArrayList b() {
        return new ArrayList(this.i);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            final GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)o;
            if (this.p.size() > 0 || googleSignInOptions.p.size() > 0) {
                return false;
            }
            if (this.i.size() == googleSignInOptions.b().size() && this.i.containsAll(googleSignInOptions.b())) {
                final Account j = this.j;
                if (j == null) {
                    if (googleSignInOptions.j != null) {
                        return false;
                    }
                }
                else if (!j.equals((Object)googleSignInOptions.j)) {
                    return false;
                }
                if (TextUtils.isEmpty((CharSequence)this.n)) {
                    if (!TextUtils.isEmpty((CharSequence)googleSignInOptions.n)) {
                        return false;
                    }
                }
                else if (!this.n.equals(googleSignInOptions.n)) {
                    return false;
                }
                if (this.m == googleSignInOptions.m && this.k == googleSignInOptions.k && this.l == googleSignInOptions.l && TextUtils.equals((CharSequence)this.q, (CharSequence)googleSignInOptions.q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final ArrayList list = new ArrayList();
        final ArrayList i = this.i;
        for (int size = i.size(), j = 0; j < size; ++j) {
            list.add(((Scope)i.get(j)).b);
        }
        Collections.sort((List<Comparable>)list);
        final jou jou = new jou();
        jou.b(list);
        jou.b(this.j);
        jou.b(this.n);
        jou.a(this.m);
        jou.a(this.k);
        jou.a(this.l);
        jou.b(this.q);
        return jou.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.h);
        jwn.z(parcel, 2, this.b());
        jwn.u(parcel, 3, (Parcelable)this.j, n);
        jwn.j(parcel, 4, this.k);
        jwn.j(parcel, 5, this.l);
        jwn.j(parcel, 6, this.m);
        jwn.v(parcel, 7, this.n);
        jwn.v(parcel, 8, this.o);
        jwn.z(parcel, 9, this.p);
        jwn.v(parcel, 10, this.q);
        jwn.i(parcel, g);
    }
}
