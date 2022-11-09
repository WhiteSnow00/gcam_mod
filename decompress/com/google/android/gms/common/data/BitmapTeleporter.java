// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.data;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class BitmapTeleporter extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    ParcelFileDescriptor b;
    final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(19);
    }
    
    public BitmapTeleporter(final int a, final ParcelFileDescriptor b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        if (this.b != null) {
            final int g = jwn.g(parcel);
            jwn.n(parcel, 1, this.a);
            jwn.u(parcel, 2, (Parcelable)this.b, n | 0x1);
            jwn.n(parcel, 3, this.c);
            jwn.i(parcel, g);
            this.b = null;
            return;
        }
        jvu.a(null);
        throw null;
    }
}
