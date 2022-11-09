// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.feedback;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import android.app.ApplicationErrorReport$CrashInfo;
import android.text.TextUtils;
import java.io.File;
import android.graphics.Bitmap;
import java.util.List;
import android.app.ApplicationErrorReport;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class ErrorReport extends jwc implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public jxu[] U;
    public String[] V;
    public boolean W;
    public String X;
    public jxw Y;
    public jxv Z;
    public ApplicationErrorReport a;
    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(10);
    }
    
    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }
    
    public ErrorReport(final ApplicationErrorReport a, final String b, final int c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final int k, final String l, final String m, final String n, final String o, final String p61, final String[] q, final String[] r, final String[] s, final String t, final String u, final byte[] v, final int w, final int x, final int y, final int z, final String a2, final String b2, final String c2, final Bundle d2, final boolean e2, final int f2, final int g2, final boolean h2, final String i2, final String j2, final int k2, final String l2, final String m2, final String n2, final String o2, final String p62, final String q2, final String r2, final BitmapTeleporter s2, final String t2, final jxu[] u2, final String[] v2, final boolean w2, final String x2, final jxw y2, final jxv z2, final String aa, final boolean ab, final Bundle ac, final List ad, final boolean ae, final Bitmap af, final String ag, final List ah, final int ai) {
        new ApplicationErrorReport();
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
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p61;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
        this.J = j2;
        this.K = k2;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o2;
        this.P = p62;
        this.Q = q2;
        this.R = r2;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.V = v2;
        this.W = w2;
        this.X = x2;
        this.Y = y2;
        this.Z = z2;
        this.aa = aa;
        this.ab = ab;
        this.ac = ac;
        this.ad = ad;
        this.ae = ae;
        this.af = af;
        this.ag = ag;
        this.ah = ah;
        this.ai = ai;
    }
    
    public ErrorReport(final jxs jxs, final File d) {
        this.a = new ApplicationErrorReport();
        final Bundle b = jxs.b;
        if (b != null && !b.isEmpty()) {
            this.D = jxs.b;
        }
        if (!TextUtils.isEmpty((CharSequence)jxs.a)) {
            this.B = jxs.a;
        }
        if (!TextUtils.isEmpty((CharSequence)jxs.c)) {
            this.b = jxs.c;
        }
        final ApplicationErrorReport$CrashInfo crashInfo = jxs.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        final jxw j = jxs.j;
        if (j != null) {
            this.Y = j;
        }
        if (!TextUtils.isEmpty((CharSequence)jxs.e)) {
            this.P = jxs.e;
        }
        final String g = jxs.g;
        if (!TextUtils.isEmpty((CharSequence)g)) {
            this.a.packageName = g;
        }
        if (!TextUtils.isEmpty((CharSequence)jxs.n)) {
            this.ag = jxs.n;
        }
        final Bitmap m = jxs.m;
        if (m != null) {
            this.af = m;
        }
        if (d != null) {
            this.S = jxs.f;
            final List h = jxs.h;
            if (h != null && !h.isEmpty()) {
                final Iterator iterator = h.iterator();
                while (iterator.hasNext()) {
                    ((jxu)iterator.next()).d = d;
                }
                this.U = h.toArray(new jxu[0]);
            }
        }
        final jxv k = jxs.k;
        if (k != null) {
            this.Z = k;
        }
        this.W = jxs.i;
        this.ae = jxs.l;
        this.E = jxs.o;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 2, (Parcelable)this.a, n);
        jwn.v(parcel, 3, this.b);
        jwn.n(parcel, 4, this.c);
        jwn.v(parcel, 5, this.d);
        jwn.v(parcel, 6, this.e);
        jwn.v(parcel, 7, this.f);
        jwn.v(parcel, 8, this.g);
        jwn.v(parcel, 9, this.h);
        jwn.v(parcel, 10, this.i);
        jwn.v(parcel, 11, this.j);
        jwn.n(parcel, 12, this.k);
        jwn.v(parcel, 13, this.l);
        jwn.v(parcel, 14, this.m);
        jwn.v(parcel, 15, this.n);
        jwn.v(parcel, 16, this.o);
        jwn.v(parcel, 17, this.p);
        jwn.w(parcel, 18, this.q);
        jwn.w(parcel, 19, this.r);
        jwn.w(parcel, 20, this.s);
        jwn.v(parcel, 21, this.t);
        jwn.v(parcel, 22, this.u);
        jwn.q(parcel, 23, this.v);
        jwn.n(parcel, 24, this.w);
        jwn.n(parcel, 25, this.x);
        jwn.n(parcel, 26, this.y);
        jwn.n(parcel, 27, this.z);
        jwn.v(parcel, 28, this.A);
        jwn.v(parcel, 29, this.B);
        jwn.v(parcel, 30, this.C);
        jwn.p(parcel, 31, this.D);
        jwn.j(parcel, 32, this.E);
        jwn.n(parcel, 33, this.F);
        jwn.n(parcel, 34, this.G);
        jwn.j(parcel, 35, this.H);
        jwn.v(parcel, 36, this.I);
        jwn.v(parcel, 37, this.J);
        jwn.n(parcel, 38, this.K);
        jwn.v(parcel, 39, this.L);
        jwn.v(parcel, 40, this.M);
        jwn.v(parcel, 41, this.N);
        jwn.v(parcel, 42, this.O);
        jwn.v(parcel, 43, this.P);
        jwn.v(parcel, 44, this.Q);
        jwn.v(parcel, 45, this.R);
        jwn.u(parcel, 46, (Parcelable)this.S, n);
        jwn.v(parcel, 47, this.T);
        jwn.y(parcel, 48, (Parcelable[])this.U, n);
        jwn.w(parcel, 49, this.V);
        jwn.j(parcel, 50, this.W);
        jwn.v(parcel, 51, this.X);
        jwn.u(parcel, 52, (Parcelable)this.Y, n);
        jwn.u(parcel, 53, (Parcelable)this.Z, n);
        jwn.v(parcel, 54, this.aa);
        jwn.j(parcel, 55, this.ab);
        jwn.p(parcel, 56, this.ac);
        jwn.z(parcel, 57, this.ad);
        jwn.j(parcel, 58, this.ae);
        jwn.u(parcel, 59, (Parcelable)this.af, n);
        jwn.v(parcel, 60, this.ag);
        jwn.x(parcel, 61, this.ah);
        jwn.n(parcel, 62, this.ai);
        jwn.i(parcel, g);
    }
}
