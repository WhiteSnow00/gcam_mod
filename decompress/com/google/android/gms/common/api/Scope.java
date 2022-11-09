// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(17);
    }
    
    public Scope(final int a, final String b) {
        jvu.i(b, "scopeUri must not be null or empty");
        this.a = a;
        this.b = b;
    }
    
    public Scope(final String s) {
        this(1, s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof Scope && this.b.equals(((Scope)o).b));
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.v(parcel, 2, this.b);
        jwn.i(parcel, g);
    }
}
