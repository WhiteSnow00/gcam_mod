import java.util.List;
import android.os.Bundle;
import android.app.ApplicationErrorReport;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxt implements Parcelable$Creator
{
    public static void a(final jxs jxs, final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 2, jxs.a);
        jwn.p(parcel, 3, jxs.b);
        jwn.v(parcel, 5, jxs.c);
        jwn.u(parcel, 6, (Parcelable)jxs.d, n);
        jwn.v(parcel, 7, jxs.e);
        jwn.u(parcel, 8, (Parcelable)jxs.f, n);
        jwn.v(parcel, 9, jxs.g);
        jwn.z(parcel, 10, jxs.h);
        jwn.j(parcel, 11, jxs.i);
        jwn.u(parcel, 12, (Parcelable)jxs.j, n);
        jwn.u(parcel, 13, (Parcelable)jxs.k, n);
        jwn.j(parcel, 14, jxs.l);
        jwn.u(parcel, 15, (Parcelable)jxs.m, n);
        jwn.v(parcel, 16, jxs.n);
        jwn.j(parcel, 17, jxs.o);
        jwn.o(parcel, 18, jxs.p);
        jwn.i(parcel, g);
    }
}
