// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LocationRequest extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public long e;
    int f;
    float g;
    long h;
    public boolean i;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr();
    }
    
    @Deprecated
    public LocationRequest() {
        this.a = 102;
        this.b = 3600000L;
        this.c = 600000L;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0L;
        this.i = false;
    }
    
    public LocationRequest(final int a, final long b, final long c, final boolean d, final long e, final int f, final float g, final long h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final long a() {
        final long h = this.h;
        final long b = this.b;
        if (h < b) {
            return b;
        }
        return h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof LocationRequest) {
            final LocationRequest locationRequest = (LocationRequest)o;
            if (this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.a() == locationRequest.a() && this.i == locationRequest.i) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.g, this.h });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        String s = null;
        switch (this.a) {
            default: {
                s = "???";
                break;
            }
            case 105: {
                s = "PRIORITY_NO_POWER";
                break;
            }
            case 104: {
                s = "PRIORITY_LOW_POWER";
                break;
            }
            case 102: {
                s = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            }
            case 100: {
                s = "PRIORITY_HIGH_ACCURACY";
                break;
            }
        }
        sb.append(s);
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h);
            sb.append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g);
            sb.append("m");
        }
        final long e = this.e;
        if (e != Long.MAX_VALUE) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(e - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.o(parcel, 2, this.b);
        jwn.o(parcel, 3, this.c);
        jwn.j(parcel, 4, this.d);
        jwn.o(parcel, 5, this.e);
        jwn.n(parcel, 6, this.f);
        jwn.l(parcel, 7, this.g);
        jwn.o(parcel, 8, this.h);
        jwn.j(parcel, 9, this.i);
        jwn.i(parcel, g);
    }
}
