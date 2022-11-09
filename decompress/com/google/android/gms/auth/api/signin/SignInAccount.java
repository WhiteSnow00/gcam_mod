// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    @Deprecated
    String a;
    public GoogleSignInAccount b;
    @Deprecated
    String c;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(10);
    }
    
    public SignInAccount(final String a, final GoogleSignInAccount b, final String c) {
        this.b = b;
        jvu.i(a, "8.3 and 8.4 SDKs require non-null email");
        this.a = a;
        jvu.i(c, "8.3 and 8.4 SDKs require non-null userId");
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 4, this.a);
        jwn.u(parcel, 7, (Parcelable)this.b, n);
        jwn.v(parcel, 8, this.c);
        jwn.i(parcel, g);
    }
}
