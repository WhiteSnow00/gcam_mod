import android.support.wearable.complications.rendering.ComplicationDrawable;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.googlehelp.GoogleHelp;
import android.content.Intent;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import android.net.Uri;
import java.util.List;
import android.os.Bundle;
import android.app.ApplicationErrorReport;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.graphics.RectF;
import android.graphics.Bitmap;
import com.google.android.gms.feedback.ErrorReport;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ul implements Parcelable$Creator
{
    private final /* synthetic */ int a;
    
    public ul() {
    }
    
    public ul(final int a) {
        this.a = a;
    }
    
    public static void a(final jux jux, final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, jux.a);
        jwn.n(parcel, 2, jux.b);
        jwn.n(parcel, 3, jux.c);
        jwn.v(parcel, 4, jux.d);
        jwn.s(parcel, 5, jux.e);
        jwn.y(parcel, 6, (Parcelable[])jux.f, n);
        jwn.p(parcel, 7, jux.g);
        jwn.u(parcel, 8, (Parcelable)jux.h, n);
        jwn.y(parcel, 10, (Parcelable[])jux.i, n);
        jwn.y(parcel, 11, (Parcelable[])jux.j, n);
        jwn.j(parcel, 12, jux.k);
        jwn.n(parcel, 13, jux.l);
        jwn.j(parcel, 14, jux.m);
        jwn.v(parcel, 15, jux.n);
        jwn.i(parcel, g);
    }
    
    public static final ErrorReport b(final Parcel parcel) {
        final int g = jwn.G(parcel);
        Object l;
        Object o = l = null;
        Object j;
        String i = (String)(j = l);
        Object m;
        String k = (String)(m = j);
        Object l3;
        String l2 = (String)(l3 = m);
        Object l5;
        String l4 = (String)(l5 = l3);
        Object l7;
        String l6 = (String)(l7 = l5);
        Object l9;
        String l8 = (String)(l9 = l7);
        Object v2;
        Object v = v2 = l9;
        Object l10;
        String[] v3 = (String[])(l10 = v2);
        Object s;
        String l11 = (String)(s = l10);
        Object l13;
        Object l12 = l13 = s;
        Object i2;
        String l14 = (String)(i2 = l13);
        Object l16;
        Object l15 = l16 = i2;
        Object l18;
        String l17 = (String)(l18 = l16);
        Object l20;
        String l19 = (String)(l20 = l18);
        Object l22;
        String l21 = (String)(l22 = l20);
        Object o2;
        String l23 = (String)(o2 = l22);
        Object o3;
        Object l24 = o3 = o2;
        Object l25;
        Object[] v4 = (Object[])(l25 = o3);
        Object o5;
        Object o4 = o5 = l25;
        Object i3;
        Object l26 = i3 = o5;
        Object o6;
        Object n = o6 = i3;
        Object m2;
        Object l27 = m2 = o6;
        int e = 0;
        int e2 = 0;
        int e3 = 0;
        int e4 = 0;
        int e5 = 0;
        int e6 = 0;
        boolean r = false;
        int e7 = 0;
        int e8 = 0;
        boolean r2 = false;
        int e9 = 0;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        int e10 = 0;
        while (parcel.dataPosition() < g) {
            final int d = jwn.D(parcel);
            switch (jwn.C(d)) {
                default: {
                    jwn.Q(parcel, d);
                    continue;
                }
                case 62: {
                    e10 = jwn.E(parcel, d);
                    continue;
                }
                case 61: {
                    m2 = jwn.M(parcel, d);
                    continue;
                }
                case 60: {
                    l27 = jwn.L(parcel, d);
                    continue;
                }
                case 59: {
                    o6 = jwn.K(parcel, d, Bitmap.CREATOR);
                    continue;
                }
                case 58: {
                    r5 = jwn.R(parcel, d);
                    continue;
                }
                case 57: {
                    n = jwn.N(parcel, d, RectF.CREATOR);
                    continue;
                }
                case 56: {
                    i3 = jwn.I(parcel, d);
                    continue;
                }
                case 55: {
                    r4 = jwn.R(parcel, d);
                    continue;
                }
                case 54: {
                    l26 = jwn.L(parcel, d);
                    continue;
                }
                case 53: {
                    o5 = jwn.K(parcel, d, jxv.CREATOR);
                    continue;
                }
                case 52: {
                    o4 = jwn.K(parcel, d, jxw.CREATOR);
                    continue;
                }
                case 51: {
                    l25 = jwn.L(parcel, d);
                    continue;
                }
                case 50: {
                    r3 = jwn.R(parcel, d);
                    continue;
                }
                case 49: {
                    v4 = jwn.V(parcel, d);
                    continue;
                }
                case 48: {
                    o3 = jwn.U(parcel, d, jxu.CREATOR);
                    continue;
                }
                case 47: {
                    l24 = jwn.L(parcel, d);
                    continue;
                }
                case 46: {
                    o2 = jwn.K(parcel, d, BitmapTeleporter.CREATOR);
                    continue;
                }
                case 45: {
                    l23 = jwn.L(parcel, d);
                    continue;
                }
                case 44: {
                    l22 = jwn.L(parcel, d);
                    continue;
                }
                case 43: {
                    l21 = jwn.L(parcel, d);
                    continue;
                }
                case 42: {
                    l20 = jwn.L(parcel, d);
                    continue;
                }
                case 41: {
                    l19 = jwn.L(parcel, d);
                    continue;
                }
                case 40: {
                    l18 = jwn.L(parcel, d);
                    continue;
                }
                case 39: {
                    l17 = jwn.L(parcel, d);
                    continue;
                }
                case 38: {
                    e9 = jwn.E(parcel, d);
                    continue;
                }
                case 37: {
                    l16 = jwn.L(parcel, d);
                    continue;
                }
                case 36: {
                    l15 = jwn.L(parcel, d);
                    continue;
                }
                case 35: {
                    r2 = jwn.R(parcel, d);
                    continue;
                }
                case 34: {
                    e8 = jwn.E(parcel, d);
                    continue;
                }
                case 33: {
                    e7 = jwn.E(parcel, d);
                    continue;
                }
                case 32: {
                    r = jwn.R(parcel, d);
                    continue;
                }
                case 31: {
                    i2 = jwn.I(parcel, d);
                    continue;
                }
                case 30: {
                    l14 = jwn.L(parcel, d);
                    continue;
                }
                case 29: {
                    l13 = jwn.L(parcel, d);
                    continue;
                }
                case 28: {
                    l12 = jwn.L(parcel, d);
                    continue;
                }
                case 27: {
                    e6 = jwn.E(parcel, d);
                    continue;
                }
                case 26: {
                    e5 = jwn.E(parcel, d);
                    continue;
                }
                case 25: {
                    e4 = jwn.E(parcel, d);
                    continue;
                }
                case 24: {
                    e3 = jwn.E(parcel, d);
                    continue;
                }
                case 23: {
                    s = jwn.S(parcel, d);
                    continue;
                }
                case 22: {
                    l11 = jwn.L(parcel, d);
                    continue;
                }
                case 21: {
                    l10 = jwn.L(parcel, d);
                    continue;
                }
                case 20: {
                    v3 = jwn.V(parcel, d);
                    continue;
                }
                case 19: {
                    v2 = jwn.V(parcel, d);
                    continue;
                }
                case 18: {
                    v = jwn.V(parcel, d);
                    continue;
                }
                case 17: {
                    l9 = jwn.L(parcel, d);
                    continue;
                }
                case 16: {
                    l8 = jwn.L(parcel, d);
                    continue;
                }
                case 15: {
                    l7 = jwn.L(parcel, d);
                    continue;
                }
                case 14: {
                    l6 = jwn.L(parcel, d);
                    continue;
                }
                case 13: {
                    l5 = jwn.L(parcel, d);
                    continue;
                }
                case 12: {
                    e2 = jwn.E(parcel, d);
                    continue;
                }
                case 11: {
                    l4 = jwn.L(parcel, d);
                    continue;
                }
                case 10: {
                    l3 = jwn.L(parcel, d);
                    continue;
                }
                case 9: {
                    l2 = jwn.L(parcel, d);
                    continue;
                }
                case 8: {
                    m = jwn.L(parcel, d);
                    continue;
                }
                case 7: {
                    k = jwn.L(parcel, d);
                    continue;
                }
                case 6: {
                    j = jwn.L(parcel, d);
                    continue;
                }
                case 5: {
                    i = jwn.L(parcel, d);
                    continue;
                }
                case 4: {
                    e = jwn.E(parcel, d);
                    continue;
                }
                case 3: {
                    l = jwn.L(parcel, d);
                    continue;
                }
                case 2: {
                    o = jwn.K(parcel, d, ApplicationErrorReport.CREATOR);
                    continue;
                }
            }
        }
        jwn.O(parcel, g);
        return new ErrorReport((ApplicationErrorReport)o, (String)l, e, i, (String)j, k, (String)m, l2, (String)l3, l4, e2, (String)l5, l6, (String)l7, l8, (String)l9, (String[])v, (String[])v2, v3, (String)l10, l11, (byte[])s, e3, e4, e5, e6, (String)l12, (String)l13, l14, (Bundle)i2, r, e7, e8, r2, (String)l15, (String)l16, e9, l17, (String)l18, l19, (String)l20, l21, (String)l22, l23, (BitmapTeleporter)o2, (String)l24, (jxu[])o3, (String[])v4, r3, (String)l25, (jxw)o4, (jxv)o5, (String)l26, r4, (Bundle)i3, (List)n, r5, (Bitmap)o6, (String)l27, (List)m2, e10);
    }
    
    public static void c(final jyg jyg, final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 1, (Parcelable)jyg.a, n);
        jwn.v(parcel, 2, jyg.b);
        jwn.v(parcel, 3, jyg.c);
        jwn.n(parcel, 4, jyg.d);
        jwn.v(parcel, 5, jyg.e);
        jwn.n(parcel, 6, jyg.f);
        jwn.i(parcel, g);
    }
}
