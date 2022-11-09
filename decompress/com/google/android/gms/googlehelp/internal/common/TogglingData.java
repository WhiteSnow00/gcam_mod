// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class TogglingData extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    public String c;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(17);
    }
    
    private TogglingData() {
    }
    
    public TogglingData(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.v(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
