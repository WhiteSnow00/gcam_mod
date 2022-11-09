// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public GoogleSignInOptions b;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(12);
    }
    
    public SignInConfiguration(final String a, final GoogleSignInOptions b) {
        jvu.h(a);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof SignInConfiguration)) {
            return false;
        }
        final SignInConfiguration signInConfiguration = (SignInConfiguration)o;
        if (this.a.equals(signInConfiguration.a)) {
            final GoogleSignInOptions b = this.b;
            final GoogleSignInOptions b2 = signInConfiguration.b;
            if (b == null) {
                if (b2 != null) {
                    return false;
                }
            }
            else if (!b.equals(b2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final jou jou = new jou();
        jou.b(this.a);
        jou.b(this.b);
        return jou.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.u(parcel, 5, (Parcelable)this.b, n);
        jwn.i(parcel, g);
    }
}
