// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class GoogleSignInAccount extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public long h;
    public String i;
    public List j;
    public String k;
    public String l;
    private Set m;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(8);
    }
    
    public GoogleSignInAccount(final int a, final String b, final String c, final String d, final String e, final Uri f, final String g, final long h, final String i, final List j, final String k, final String l) {
        this.m = new HashSet();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final Set a() {
        final HashSet set = new HashSet(this.j);
        set.addAll(this.m);
        return set;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoogleSignInAccount)) {
            return false;
        }
        final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)o;
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.a().equals(this.a());
    }
    
    @Override
    public final int hashCode() {
        return (this.i.hashCode() + 527) * 31 + this.a().hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.v(parcel, 2, this.b);
        jwn.v(parcel, 3, this.c);
        jwn.v(parcel, 4, this.d);
        jwn.v(parcel, 5, this.e);
        jwn.u(parcel, 6, (Parcelable)this.f, n);
        jwn.v(parcel, 7, this.g);
        jwn.o(parcel, 8, this.h);
        jwn.v(parcel, 9, this.i);
        jwn.z(parcel, 10, this.j);
        jwn.v(parcel, 11, this.k);
        jwn.v(parcel, 12, this.l);
        jwn.i(parcel, g);
    }
}
