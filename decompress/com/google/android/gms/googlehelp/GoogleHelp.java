// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.text.TextUtils;
import android.app.PendingIntent;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.feedback.ErrorReport;
import android.net.Uri;
import java.util.List;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class GoogleHelp extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    boolean A;
    boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;
    @Deprecated
    Bundle k;
    @Deprecated
    Bitmap l;
    @Deprecated
    byte[] m;
    @Deprecated
    int n;
    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    jxw s;
    List t;
    boolean u;
    ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;
    
    static {
        CREATOR = (Parcelable$Creator)new jya();
    }
    
    @Deprecated
    public GoogleHelp(final int a, final String b, final Account c, final Bundle d, final String e, final String f, final Bitmap g, final boolean h, final boolean i, final List j, final Bundle k, final Bitmap l, final byte[] m, final int n, final int o, final String p32, final Uri q, final List r, final int a2, final jxw jxw, final List t, final boolean u, final ErrorReport v, final TogglingData w, final int x, final PendingIntent y, final int z, final boolean a3, final boolean b2, final int c2, final String d2, final boolean e2) {
        this.v = new ErrorReport();
        if (!TextUtils.isEmpty((CharSequence)b)) {
            this.a = a;
            this.z = z;
            this.A = a3;
            this.B = b2;
            this.C = c2;
            this.D = d2;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.E = e2;
            this.j = j;
            this.y = y;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p32;
            this.q = q;
            this.r = r;
            if (a < 4) {
                final jxw s = new jxw();
                s.a = a2;
                this.s = s;
            }
            else {
                jxw s2;
                if (jxw == null) {
                    s2 = new jxw();
                }
                else {
                    s2 = jxw;
                }
                this.s = s2;
            }
            this.t = t;
            this.u = u;
            this.v = v;
            if (v != null) {
                v.X = "GoogleHelp";
            }
            this.w = w;
            this.x = x;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }
    
    public GoogleHelp(final int n, final String s, final Account account, final Bundle bundle, final String s2, final String s3, final Bitmap bitmap, final boolean b, final boolean b2, final List list, final Bundle bundle2, final Bitmap bitmap2, final byte[] array, final int n2, final int n3, final String s4, final Uri uri, final List list2, final int n4, final jxw jxw, final List list3, final boolean b3, final ErrorReport errorReport, final TogglingData togglingData, final int n5, final PendingIntent pendingIntent, final int n6, final boolean b4, final boolean b5, final int n7, final String s5, final boolean b6, final String f, final boolean g) {
        this(n, s, account, bundle, s2, s3, bitmap, b, b2, list, bundle2, bitmap2, array, n2, n3, s4, uri, list2, n4, jxw, list3, b3, errorReport, togglingData, n5, pendingIntent, n6, b4, b5, n7, s5, b6);
        this.F = f;
        this.G = g;
    }
    
    public final void a(final int n, final String s, final Intent intent) {
        this.r.add(new jyq(n, s, intent));
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.v(parcel, 2, this.b);
        jwn.u(parcel, 3, (Parcelable)this.c, n);
        jwn.p(parcel, 4, this.d);
        jwn.j(parcel, 5, this.h);
        jwn.j(parcel, 6, this.i);
        jwn.x(parcel, 7, this.j);
        jwn.p(parcel, 10, this.k);
        jwn.u(parcel, 11, (Parcelable)this.l, n);
        jwn.v(parcel, 14, this.p);
        jwn.u(parcel, 15, (Parcelable)this.q, n);
        jwn.z(parcel, 16, this.r);
        jwn.n(parcel, 17, 0);
        jwn.z(parcel, 18, this.t);
        jwn.q(parcel, 19, this.m);
        jwn.n(parcel, 20, this.n);
        jwn.n(parcel, 21, this.o);
        jwn.j(parcel, 22, this.u);
        jwn.u(parcel, 23, (Parcelable)this.v, n);
        jwn.u(parcel, 25, (Parcelable)this.s, n);
        jwn.v(parcel, 28, this.e);
        jwn.u(parcel, 31, (Parcelable)this.w, n);
        jwn.n(parcel, 32, this.x);
        jwn.u(parcel, 33, (Parcelable)this.y, n);
        jwn.v(parcel, 34, this.f);
        jwn.u(parcel, 35, (Parcelable)this.g, n);
        jwn.n(parcel, 36, this.z);
        jwn.j(parcel, 37, this.A);
        jwn.j(parcel, 38, this.B);
        jwn.n(parcel, 39, this.C);
        jwn.v(parcel, 40, this.D);
        jwn.j(parcel, 41, this.E);
        jwn.v(parcel, 42, this.F);
        jwn.j(parcel, 43, this.G);
        jwn.i(parcel, g);
    }
}
