// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wearable;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class ConnectionConfiguration extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean f;
    public volatile String g;
    public boolean h;
    public String i;
    public String j;
    
    static {
        CREATOR = (Parcelable$Creator)new kff();
    }
    
    public ConnectionConfiguration(final String a, final String b, final int c, final int d, final boolean e, final boolean f, final String g, final boolean h, final String i, final String j) {
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
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof ConnectionConfiguration)) {
            return false;
        }
        final ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration)o;
        return jvu.m(this.a, connectionConfiguration.a) && jvu.m(this.b, connectionConfiguration.b) && jvu.m(this.c, connectionConfiguration.c) && jvu.m(this.d, connectionConfiguration.d) && jvu.m(this.e, connectionConfiguration.e) && jvu.m(this.h, connectionConfiguration.h);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.h });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        final String value = String.valueOf(this.a);
        String concat;
        if (value.length() != 0) {
            concat = "Name=".concat(value);
        }
        else {
            concat = new String("Name=");
        }
        sb.append(concat);
        final String value2 = String.valueOf(this.b);
        String concat2;
        if (value2.length() != 0) {
            concat2 = ", Address=".concat(value2);
        }
        else {
            concat2 = new String(", Address=");
        }
        sb.append(concat2);
        final int c = this.c;
        final StringBuilder sb2 = new StringBuilder(18);
        sb2.append(", Type=");
        sb2.append(c);
        sb.append(sb2.toString());
        final int d = this.d;
        final StringBuilder sb3 = new StringBuilder(18);
        sb3.append(", Role=");
        sb3.append(d);
        sb.append(sb3.toString());
        final boolean e = this.e;
        final StringBuilder sb4 = new StringBuilder(15);
        sb4.append(", Enabled=");
        sb4.append(e);
        sb.append(sb4.toString());
        final boolean f = this.f;
        final StringBuilder sb5 = new StringBuilder(19);
        sb5.append(", IsConnected=");
        sb5.append(f);
        sb.append(sb5.toString());
        final String value3 = String.valueOf(this.g);
        String concat3;
        if (value3.length() != 0) {
            concat3 = ", PeerNodeId=".concat(value3);
        }
        else {
            concat3 = new String(", PeerNodeId=");
        }
        sb.append(concat3);
        final boolean h = this.h;
        final StringBuilder sb6 = new StringBuilder(20);
        sb6.append(", BtlePriority=");
        sb6.append(h);
        sb.append(sb6.toString());
        final String value4 = String.valueOf(this.i);
        String concat4;
        if (value4.length() != 0) {
            concat4 = ", NodeId=".concat(value4);
        }
        else {
            concat4 = new String(", NodeId=");
        }
        sb.append(concat4);
        final String value5 = String.valueOf(this.j);
        String concat5;
        if (value5.length() != 0) {
            concat5 = ", PackageName=".concat(value5);
        }
        else {
            concat5 = new String(", PackageName=");
        }
        sb.append(concat5);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.n(parcel, 4, this.c);
        jwn.n(parcel, 5, this.d);
        jwn.j(parcel, 6, this.e);
        jwn.j(parcel, 7, this.f);
        jwn.v(parcel, 8, this.g);
        jwn.j(parcel, 9, this.h);
        jwn.v(parcel, 10, this.i);
        jwn.v(parcel, 11, this.j);
        jwn.i(parcel, g);
    }
}
