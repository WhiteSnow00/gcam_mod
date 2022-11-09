// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class DataItemAssetParcelable extends jwc implements ReflectedParcelable, kfg
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(12);
    }
    
    public DataItemAssetParcelable(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public DataItemAssetParcelable(final kfg kfg) {
        final String d = kfg.d();
        jvu.a(d);
        this.a = d;
        final String c = kfg.c();
        jvu.a(c);
        this.b = c;
    }
    
    @Override
    public final String c() {
        return this.b;
    }
    
    @Override
    public final String d() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(this.hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        }
        else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
