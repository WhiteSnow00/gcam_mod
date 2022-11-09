// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Status extends jwc implements ReflectedParcelable, jrf
{
    public static final Parcelable$Creator CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    final int f;
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final jps j;
    
    static {
        a = new Status(0);
        b = new Status(14);
        c = new Status(8);
        d = new Status(15);
        e = new Status(16);
        new Status(17);
        new Status(18);
        CREATOR = (Parcelable$Creator)new uj(18);
    }
    
    public Status(final int n) {
        this(n, null);
    }
    
    public Status(final int f, final int g, final String h, final PendingIntent i, final jps j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public Status(final int n, final String s) {
        this(n, s, null);
    }
    
    public Status(final int n, final String s, final byte[] array) {
        this(1, n, s, null, null);
    }
    
    @Override
    public final Status a() {
        return this;
    }
    
    public final boolean b() {
        return this.g <= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof Status)) {
            return false;
        }
        final Status status = (Status)o;
        return this.f == status.f && this.g == status.g && jvu.m(this.h, status.h) && jvu.m(this.i, status.i) && jvu.m(this.j, status.j);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j });
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        String s;
        if ((s = this.h) == null) {
            s = lio.l(this.g);
        }
        jvu.o("statusCode", s, list);
        jvu.o("resolution", this.i, list);
        return jvu.n(list, this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.g);
        jwn.v(parcel, 2, this.h);
        jwn.u(parcel, 3, (Parcelable)this.i, n);
        jwn.u(parcel, 4, (Parcelable)this.j, n);
        jwn.n(parcel, 1000, this.f);
        jwn.i(parcel, g);
    }
}
