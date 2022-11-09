// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.exif;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.TimeZone;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import android.util.Log;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Collection;
import android.util.SparseIntArray;
import java.util.Calendar;
import java.text.DateFormat;
import java.nio.ByteOrder;
import java.util.HashSet;

public class ExifInterface implements kva
{
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int TAG_SOFTWARE;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;
    public static final int a;
    public static final int aA;
    public static final int aB;
    public static final int aC;
    public static final int aD;
    public static final int aE;
    public static final int aF;
    public static final int aG;
    public static final int aH;
    public static final int aI;
    public static final int aJ;
    public static final int aK;
    public static final int aL;
    public static final int aM;
    public static final int aN;
    public static final int aO;
    public static final int aP;
    public static final int aQ;
    public static final int aR;
    public static final int aS;
    public static final int aT;
    public static final int aU;
    public static final int aV;
    public static final int aW;
    public static final int aX;
    public static final int aY;
    public static final int aZ;
    public static final int aa;
    public static final int ab;
    public static final int ac;
    public static final int ad;
    public static final int ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static final int an;
    public static final int ao;
    public static final int ap;
    public static final int aq;
    public static final int ar;
    public static final int as;
    public static final int at;
    public static final int au;
    public static final int av;
    public static final int aw;
    public static final int ax;
    public static final int ay;
    public static final int az;
    public static final int b;
    private static HashSet bC;
    private static final Long bD;
    public static final int ba;
    public static final int bb;
    public static final int bc;
    public static final int bd;
    public static final int be;
    public static final int bf;
    public static final int bg;
    public static final int bh;
    public static final int bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final int bm;
    public static final int bn;
    public static final int bo;
    public static final int bp;
    public static final int bq;
    public static final int br;
    public static final int bs;
    public static final int bt;
    protected static HashSet bu;
    public static final Long bv;
    public static final ByteOrder bw;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    public final DateFormat bA;
    public final Calendar bB;
    private final DateFormat bE;
    private SparseIntArray bF;
    public int bx;
    public String by;
    public kuz bz;
    
    static {
        a = c(0, (short)256);
        b = c(0, (short)257);
        c = c(0, (short)258);
        d = c(0, (short)259);
        e = c(0, (short)262);
        f = c(0, (short)270);
        g = c(0, (short)271);
        h = c(0, (short)272);
        final int n2 = i = c(0, (short)273);
        j = c(0, (short)274);
        k = c(0, (short)277);
        l = c(0, (short)278);
        final int n3 = m = c(0, (short)279);
        n = c(0, (short)282);
        o = c(0, (short)283);
        p = c(0, (short)284);
        q = c(0, (short)296);
        r = c(0, (short)301);
        TAG_SOFTWARE = c(0, (short)305);
        s = c(0, (short)306);
        t = c(0, (short)315);
        u = c(0, (short)318);
        v = c(0, (short)319);
        w = c(0, (short)529);
        x = c(0, (short)530);
        y = c(0, (short)531);
        z = c(0, (short)532);
        A = c(0, (short)(-32104));
        final int n4 = B = c(0, (short)(-30871));
        final int n5 = C = c(0, (short)(-30683));
        final int n6 = D = c(1, (short)513);
        final int n7 = E = c(1, (short)514);
        F = c(2, (short)(-32102));
        G = c(2, (short)(-32099));
        H = c(2, (short)(-30686));
        I = c(2, (short)(-30684));
        J = c(2, (short)(-30681));
        K = c(2, (short)(-30680));
        L = c(2, (short)(-28672));
        M = c(2, (short)(-28669));
        N = c(2, (short)(-28668));
        O = c(2, (short)(-28415));
        P = c(2, (short)(-28414));
        Q = c(2, (short)(-28159));
        R = c(2, (short)(-28158));
        S = c(2, (short)(-28157));
        T = c(2, (short)(-28156));
        U = c(2, (short)(-28155));
        V = c(2, (short)(-28154));
        W = c(2, (short)(-28153));
        X = c(2, (short)(-28152));
        Y = c(2, (short)(-28151));
        Z = c(2, (short)(-28150));
        aa = c(2, (short)(-28140));
        ab = c(2, (short)(-28036));
        ac = c(2, (short)(-28026));
        ad = c(2, (short)(-28016));
        ae = c(2, (short)(-28015));
        af = c(2, (short)(-28014));
        ag = c(2, (short)(-24576));
        ah = c(2, (short)(-24575));
        ai = c(2, (short)(-24574));
        aj = c(2, (short)(-24573));
        ak = c(2, (short)(-24572));
        final int n8 = al = c(2, (short)(-24571));
        am = c(2, (short)(-24053));
        an = c(2, (short)(-24052));
        ao = c(2, (short)(-24050));
        ap = c(2, (short)(-24049));
        aq = c(2, (short)(-24048));
        ar = c(2, (short)(-24044));
        as = c(2, (short)(-24043));
        at = c(2, (short)(-24041));
        au = c(2, (short)(-23808));
        av = c(2, (short)(-23807));
        aw = c(2, (short)(-23806));
        ax = c(2, (short)(-23551));
        ay = c(2, (short)(-23550));
        az = c(2, (short)(-23549));
        aA = c(2, (short)(-23548));
        aB = c(2, (short)(-23547));
        aC = c(2, (short)(-23546));
        aD = c(2, (short)(-23545));
        aE = c(2, (short)(-23544));
        aF = c(2, (short)(-23543));
        aG = c(2, (short)(-23542));
        aH = c(2, (short)(-23541));
        aI = c(2, (short)(-23540));
        aJ = c(2, (short)(-23520));
        aK = c(2, (short)(-28656));
        aL = c(2, (short)(-28655));
        aM = c(2, (short)(-28654));
        aN = c(2, (short)(-27648));
        aO = c(2, (short)(-27645));
        aP = c(4, (short)0);
        aQ = c(4, (short)1);
        aR = c(4, (short)2);
        aS = c(4, (short)3);
        aT = c(4, (short)4);
        aU = c(4, (short)5);
        aV = c(4, (short)6);
        aW = c(4, (short)7);
        aX = c(4, (short)8);
        aY = c(4, (short)9);
        aZ = c(4, (short)10);
        ba = c(4, (short)11);
        bb = c(4, (short)12);
        bc = c(4, (short)13);
        bd = c(4, (short)14);
        be = c(4, (short)15);
        bf = c(4, (short)16);
        bg = c(4, (short)17);
        bh = c(4, (short)18);
        bi = c(4, (short)19);
        bj = c(4, (short)20);
        bk = c(4, (short)23);
        bl = c(4, (short)24);
        bm = c(4, (short)25);
        bn = c(4, (short)26);
        bo = c(4, (short)27);
        bp = c(4, (short)28);
        bq = c(4, (short)29);
        br = c(4, (short)30);
        bs = c(3, (short)1);
        bt = c(3, (short)2);
        (ExifInterface.bC = new HashSet()).add(n(n5));
        ExifInterface.bC.add(n(n4));
        ExifInterface.bC.add(n(n6));
        ExifInterface.bC.add(n(n8));
        ExifInterface.bC.add(n(n2));
        (ExifInterface.bu = new HashSet(ExifInterface.bC)).add(n(-1));
        ExifInterface.bu.add(n(n7));
        ExifInterface.bu.add(n(n3));
        bD = (bv = 100L);
        bw = ByteOrder.BIG_ENDIAN;
    }
    
    public ExifInterface() {
        this.bx = 0;
        this.by = "";
        this.bz = new kuz(ExifInterface.bw);
        this.bE = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ROOT);
        final SimpleDateFormat ba = new SimpleDateFormat("yyyy:MM:dd", Locale.ROOT);
        this.bA = ba;
        this.bB = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.bF = null;
        ba.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }
    
    public static int c(final int n, final short n2) {
        return n << 16 | (char)n2;
    }
    
    protected static int d(final int n) {
        return (char)n;
    }
    
    protected static int f(final int[] array) {
        final int[] a = kvk.a;
        int i = 0;
        int n = 0;
        while (i < 5) {
            final int length = array.length;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (a[i] == array[n2]) {
                    n3 = (n | 1 << i);
                    break;
                }
                ++n2;
            }
            ++i;
            n = n3;
        }
        return n;
    }
    
    public static int g(final int n) {
        return n >>> 16;
    }
    
    public static short n(final int n) {
        return (short)n;
    }
    
    protected static short o(final int n) {
        return (short)(n >> 16 & 0xFF);
    }
    
    public static boolean s(final int n, final int n2) {
        final int[] a = kvk.a;
        for (int i = 0; i < 5; ++i) {
            if (n2 == a[i] && (n >>> 24 >> i & 0x1) == 0x1) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean t(final short n) {
        return ExifInterface.bC.contains(n);
    }
    
    public static krb[] w(double n) {
        final double abs = Math.abs(n);
        final int n2 = (int)abs;
        n = n2;
        Double.isNaN(n);
        final double n3 = (abs - n) * 60.0;
        final int n4 = (int)n3;
        final Long bd = ExifInterface.bD;
        final long longValue = bd;
        final krb krb = new krb(n2, 1L);
        final krb krb2 = new krb(n4, 1L);
        n = n4;
        Double.isNaN(n);
        final double n5 = (double)longValue;
        Double.isNaN(n5);
        return new krb[] { krb, krb2, new krb((int)((n3 - n) * 60.0 * n5), bd) };
    }
    
    private static final String z(final long n) {
        return njo.c(Long.toString(n), 2);
    }
    
    @Override
    public final krb a(final int n) {
        final krb[] v = this.v(n, this.e(n));
        if (v != null && v.length != 0) {
            return new krb(v[0]);
        }
        return null;
    }
    
    @Override
    public final Integer b(final int n) {
        final kvh l = this.l(n, this.e(n));
        int[] n2;
        if (l == null) {
            n2 = null;
        }
        else {
            n2 = l.n();
        }
        if (n2 != null && n2.length > 0) {
            return n2[0];
        }
        return null;
    }
    
    public final int e(final int n) {
        if (this.h().get(n) == 0) {
            return -1;
        }
        return g(n);
    }
    
    @Override
    public String getTagStringValue(final int n) {
        final kvh l = this.l(n, this.e(n));
        if (l == null) {
            return null;
        }
        return l.d();
    }
    
    public final SparseIntArray h() {
        if (this.bF == null) {
            this.bF = new SparseIntArray();
            final int n = f(new int[] { 0, 1 }) << 24;
            final SparseIntArray bf = this.bF;
            bf.getClass();
            final int n2 = n | 0x20000;
            final int g = ExifInterface.g;
            bf.put(g, n2);
            final int n3 = n | 0x40001;
            bf.put(ExifInterface.a, n3);
            bf.put(ExifInterface.b, n3);
            bf.put(ExifInterface.c, 0x30003 | n);
            final int n4 = n | 0x30001;
            bf.put(ExifInterface.d, n4);
            bf.put(ExifInterface.e, n4);
            bf.put(ExifInterface.j, n4);
            bf.put(ExifInterface.k, n4);
            bf.put(ExifInterface.p, n4);
            bf.put(ExifInterface.x, n | 0x30002);
            bf.put(ExifInterface.y, n4);
            final int n5 = n | 0x50001;
            bf.put(ExifInterface.n, n5);
            bf.put(ExifInterface.o, n5);
            bf.put(ExifInterface.q, n4);
            final int n6 = 0x40000 | n;
            bf.put(ExifInterface.i, n6);
            bf.put(ExifInterface.l, n3);
            bf.put(ExifInterface.m, n6);
            bf.put(ExifInterface.r, 0x30300 | n);
            bf.put(ExifInterface.u, 0x50002 | n);
            final int n7 = 0x50006 | n;
            bf.put(ExifInterface.v, n7);
            bf.put(ExifInterface.w, n | 0x50003);
            bf.put(ExifInterface.z, n7);
            bf.put(ExifInterface.s, n | 0x20014);
            bf.put(ExifInterface.f, n2);
            bf.put(g, n2);
            bf.put(ExifInterface.h, n2);
            bf.put(ExifInterface.TAG_SOFTWARE, n2);
            bf.put(ExifInterface.t, n2);
            bf.put(ExifInterface.A, n2);
            bf.put(ExifInterface.B, n3);
            bf.put(ExifInterface.C, n3);
            final int n8 = f(new int[] { 1 }) << 24 | 0x40001;
            bf.put(ExifInterface.D, n8);
            bf.put(ExifInterface.E, n8);
            final int n9 = f(new int[] { 2 }) << 24;
            final int n10 = 0x70004 | n9;
            bf.put(ExifInterface.L, n10);
            bf.put(ExifInterface.ag, n10);
            final int n11 = n9 | 0x30001;
            bf.put(ExifInterface.ah, n11);
            bf.put(ExifInterface.O, n10);
            final int n12 = n9 | 0x50001;
            bf.put(ExifInterface.P, n12);
            final int n13 = 0x40001 | n9;
            bf.put(ExifInterface.ai, n13);
            bf.put(ExifInterface.aj, n13);
            final int n14 = n9 | 0x70000;
            bf.put(ExifInterface.ab, n14);
            bf.put(ExifInterface.ac, n14);
            bf.put(ExifInterface.ak, n9 | 0x2000D);
            final int n15 = n9 | 0x20014;
            bf.put(ExifInterface.M, n15);
            bf.put(ExifInterface.N, n15);
            final int n16 = n9 | 0x20000;
            bf.put(ExifInterface.ad, n16);
            bf.put(ExifInterface.ae, n16);
            bf.put(ExifInterface.af, n16);
            bf.put(ExifInterface.aJ, 0x20021 | n9);
            bf.put(ExifInterface.F, n12);
            bf.put(ExifInterface.G, n12);
            bf.put(ExifInterface.H, n11);
            bf.put(ExifInterface.I, n16);
            final int n17 = 0x30000 | n9;
            bf.put(ExifInterface.J, n17);
            bf.put(ExifInterface.K, n14);
            final int n18 = 0xA0001 | n9;
            bf.put(ExifInterface.Q, n18);
            bf.put(ExifInterface.R, n12);
            bf.put(ExifInterface.S, n18);
            bf.put(ExifInterface.T, n18);
            bf.put(ExifInterface.U, n12);
            bf.put(ExifInterface.V, n12);
            bf.put(ExifInterface.W, n11);
            bf.put(ExifInterface.X, n11);
            bf.put(ExifInterface.Y, n11);
            bf.put(ExifInterface.Z, n12);
            bf.put(ExifInterface.aa, n17);
            bf.put(ExifInterface.am, n12);
            bf.put(ExifInterface.an, n14);
            bf.put(ExifInterface.ao, n12);
            bf.put(ExifInterface.ap, n12);
            bf.put(ExifInterface.aq, n11);
            bf.put(ExifInterface.ar, 0x30002 | n9);
            bf.put(ExifInterface.as, n12);
            bf.put(ExifInterface.at, n11);
            final int n19 = 0x70001 | n9;
            bf.put(ExifInterface.au, n19);
            bf.put(ExifInterface.av, n19);
            bf.put(ExifInterface.aw, n14);
            bf.put(ExifInterface.ax, n11);
            bf.put(ExifInterface.ay, n11);
            bf.put(ExifInterface.az, n11);
            bf.put(ExifInterface.aA, n12);
            bf.put(ExifInterface.aB, n11);
            bf.put(ExifInterface.aC, n11);
            bf.put(ExifInterface.aD, n12);
            bf.put(ExifInterface.aE, n11);
            bf.put(ExifInterface.aF, n11);
            bf.put(ExifInterface.aG, n11);
            bf.put(ExifInterface.aH, n14);
            bf.put(ExifInterface.aI, n11);
            bf.put(ExifInterface.al, n13);
            final int n20 = n9 | 0x20007;
            bf.put(ExifInterface.aK, n20);
            bf.put(ExifInterface.aM, n20);
            bf.put(ExifInterface.aL, n20);
            bf.put(ExifInterface.aN, n18);
            bf.put(ExifInterface.aO, n18);
            final int n21 = f(new int[] { 4 }) << 24;
            bf.put(ExifInterface.aP, 0x10004 | n21);
            final int n22 = 0x20002 | n21;
            bf.put(ExifInterface.aQ, n22);
            bf.put(ExifInterface.aS, n22);
            final int n23 = n21 | 0x50003;
            bf.put(ExifInterface.aR, n23);
            bf.put(ExifInterface.aT, n23);
            bf.put(ExifInterface.aU, 0x10001 | n21);
            final int n24 = n21 | 0x50001;
            bf.put(ExifInterface.aV, n24);
            bf.put(ExifInterface.aW, n23);
            final int n25 = n21 | 0x20000;
            bf.put(ExifInterface.aX, n25);
            bf.put(ExifInterface.aY, n22);
            bf.put(ExifInterface.aZ, n22);
            bf.put(ExifInterface.ba, n24);
            bf.put(ExifInterface.bb, n22);
            bf.put(ExifInterface.bc, n24);
            bf.put(ExifInterface.bd, n22);
            bf.put(ExifInterface.be, n24);
            bf.put(ExifInterface.bf, n22);
            bf.put(ExifInterface.bg, n24);
            bf.put(ExifInterface.bh, n25);
            bf.put(ExifInterface.bi, n22);
            bf.put(ExifInterface.bj, n24);
            bf.put(ExifInterface.bk, n22);
            bf.put(ExifInterface.bl, n24);
            bf.put(ExifInterface.bm, n22);
            bf.put(ExifInterface.bn, n24);
            final int n26 = n21 | 0x70000;
            bf.put(ExifInterface.bo, n26);
            bf.put(ExifInterface.bp, n26);
            bf.put(ExifInterface.bq, 0x2000B | n21);
            bf.put(ExifInterface.br, n21 | 0x3000B);
            final int n27 = f(new int[] { 3 }) << 24;
            bf.put(ExifInterface.bs, 0x20000 | n27);
            bf.put(ExifInterface.bt, n27 | 0x70000);
        }
        final SparseIntArray bf2 = this.bF;
        bf2.getClass();
        return bf2;
    }
    
    public final kvh i(int i, final Object o) {
        final int g = g(i);
        final int value = this.h().get(i);
        if (value != 0) {
            if (o != null) {
                final short o2 = o(value);
                final int d = d(value);
                final int n = 0;
                final boolean b = d != 0;
                if (s(value, g)) {
                    final kvh kvh = new kvh(n(i), o2, d, g, b);
                    boolean b2;
                    if (o instanceof Short) {
                        b2 = kvh.h((char)(short)o);
                    }
                    else if (o instanceof String) {
                        b2 = kvh.i((String)o);
                    }
                    else if (o instanceof int[]) {
                        b2 = kvh.k((int[])o);
                    }
                    else if (o instanceof long[]) {
                        b2 = kvh.l((long[])o);
                    }
                    else if (o instanceof krb) {
                        b2 = kvh.m(new krb[] { (krb)o });
                    }
                    else if (o instanceof krb[]) {
                        b2 = kvh.m((krb[])o);
                    }
                    else if (o instanceof byte[]) {
                        b2 = kvh.j((byte[])o);
                    }
                    else if (o instanceof Integer) {
                        b2 = kvh.h((int)o);
                    }
                    else if (o instanceof Long) {
                        b2 = kvh.l(new long[] { (long)o });
                    }
                    else if (o instanceof Byte) {
                        b2 = kvh.j(new byte[] { (byte)o });
                    }
                    else if (o instanceof Short[]) {
                        final Short[] array = (Short[])o;
                        final int[] array2 = new int[array.length];
                        Short n2;
                        int n3;
                        for (i = 0; i < array.length; ++i) {
                            n2 = array[i];
                            if (n2 == null) {
                                n3 = 0;
                            }
                            else {
                                n3 = (char)(short)n2;
                            }
                            array2[i] = n3;
                        }
                        b2 = kvh.k(array2);
                    }
                    else if (o instanceof Integer[]) {
                        final Integer[] array3 = (Integer[])o;
                        final int[] array4 = new int[array3.length];
                        Integer n4;
                        int intValue;
                        for (i = 0; i < array3.length; ++i) {
                            n4 = array3[i];
                            if (n4 == null) {
                                intValue = 0;
                            }
                            else {
                                intValue = n4;
                            }
                            array4[i] = intValue;
                        }
                        b2 = kvh.k(array4);
                    }
                    else if (o instanceof Long[]) {
                        final Long[] array5 = (Long[])o;
                        final long[] array6 = new long[array5.length];
                        Long n5;
                        long longValue;
                        for (i = n; i < array5.length; ++i) {
                            n5 = array5[i];
                            if (n5 == null) {
                                longValue = 0L;
                            }
                            else {
                                longValue = n5;
                            }
                            array6[i] = longValue;
                        }
                        b2 = kvh.l(array6);
                    }
                    else {
                        if (!(o instanceof Byte[])) {
                            return null;
                        }
                        final Byte[] array7 = (Byte[])o;
                        final byte[] array8 = new byte[array7.length];
                        Byte b3;
                        byte byteValue;
                        for (i = 0; i < array7.length; ++i) {
                            b3 = array7[i];
                            if (b3 == null) {
                                byteValue = 0;
                            }
                            else {
                                byteValue = b3;
                            }
                            array8[i] = byteValue;
                        }
                        b2 = kvh.j(array8);
                    }
                    if (b2) {
                        return kvh;
                    }
                }
            }
        }
        return null;
    }
    
    public final kvh j(final int n) {
        final int value = this.h().get(n);
        if (value == 0) {
            return null;
        }
        final short o = o(value);
        final int d = d(value);
        return new kvh(n(n), o, d, g(n), d != 0);
    }
    
    public final kvh k(final int n) {
        return this.l(n, this.e(n));
    }
    
    public final kvh l(final int n, final int n2) {
        if (!kvh.f(n2)) {
            return null;
        }
        final short n3 = n(n);
        final kvk kvk = this.bz.a[n2];
        if (kvk == null) {
            return null;
        }
        return kvk.b(n3);
    }
    
    public final OutputStream m(final OutputStream outputStream) {
        return new kvo(new kvi(new BufferedOutputStream(outputStream, 65536), this, this.bz));
    }
    
    public final void p(final int n) {
        this.bz.h(n(n), this.e(n));
    }
    
    public final void q(final InputStream inputStream) {
        try {
            final kvg kvg = new kvg(inputStream, this);
            final kuz bz = new kuz(kvg.a.b.order());
            for (int i = kvg.a(); i != 5; i = kvg.a()) {
                final int n = 0;
                final int n2 = 0;
                switch (i) {
                    default: {
                        final kvh e = kvg.e;
                        int n3;
                        if (e == null) {
                            n3 = n;
                        }
                        else {
                            n3 = (int)e.b(0);
                        }
                        final byte[] array = new byte[n3];
                        if (n3 != kvg.b(array)) {
                            Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                            break;
                        }
                        final int a = kvg.d.a;
                        if (a < bz.c.size()) {
                            bz.c.set(a, array);
                            break;
                        }
                        for (int j = bz.c.size(); j < a; ++j) {
                            bz.c.add(null);
                        }
                        bz.c.add(array);
                        break;
                    }
                    case 3: {
                        final kvh f = kvg.f;
                        int n4;
                        if (f == null) {
                            n4 = n2;
                        }
                        else {
                            n4 = (int)f.b(0);
                        }
                        final byte[] b = new byte[n4];
                        if (n4 == kvg.b(b)) {
                            bz.b = b;
                            break;
                        }
                        Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                        break;
                    }
                    case 2: {
                        final kvh c = kvg.c;
                        if (c == null) {
                            break;
                        }
                        if (c.b == 7) {
                            kvg.e(c);
                        }
                        final kvk b2 = bz.b(c.e);
                        if (b2 != null) {
                            b2.e(c);
                            break;
                        }
                        break;
                    }
                    case 1: {
                        final kvh c2 = kvg.c;
                        if (c2 == null) {
                            break;
                        }
                        if (!c2.e()) {
                            final int g = c2.g;
                            if (g >= kvg.a.a) {
                                kvg.g.put(g, new kvd(c2, true));
                                break;
                            }
                            break;
                        }
                        else {
                            final kvk b3 = bz.b(c2.e);
                            if (b3 != null) {
                                b3.e(c2);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    case 0: {
                        bz.d(new kvk(kvg.b));
                        break;
                    }
                }
            }
            this.bz = bz;
        }
        catch (final kvb kvb) {
            throw new IOException("Invalid exif format : ", kvb);
        }
    }
    
    public final void r(final byte[] array) {
        this.q(new ByteArrayInputStream(array));
    }
    
    public void readExif(final String s) {
        if (s != null) {
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(s));
            this.q(bufferedInputStream);
            bufferedInputStream.close();
            return;
        }
        throw new IllegalArgumentException("Argument is null");
    }
    
    public final krb[] u(final int n) {
        return this.v(n, this.e(n));
    }
    
    public final krb[] v(final int n, final int n2) {
        final kvh l = this.l(n, n2);
        if (l == null) {
            return null;
        }
        final Object f = l.f;
        if (f instanceof krb[]) {
            return (krb[])f;
        }
        return null;
    }
    
    public final void x(int n, final long n2, final TimeZone timeZone) {
        final int s = ExifInterface.s;
        if (n != s && n != ExifInterface.N && n != ExifInterface.M) {
            return;
        }
        Serializable be = this.bE;
        synchronized (be) {
            this.bE.setTimeZone(timeZone);
            final kvh i = this.i(n, this.bE.format(n2));
            monitorexit(be);
            if (i == null) {
                return;
            }
            this.y(i);
            int n3;
            if (n == s) {
                n3 = ExifInterface.aK;
            }
            else if (n == ExifInterface.N) {
                n3 = ExifInterface.aM;
            }
            else {
                if (n != ExifInterface.M) {
                    final StringBuilder sb = new StringBuilder(57);
                    sb.append("Must pass a date stamp tag, unrecognized tag: ");
                    sb.append(n);
                    throw new IllegalArgumentException(sb.toString());
                }
                n3 = ExifInterface.aL;
            }
            final int offset = timeZone.getOffset(n2);
            final int abs = Math.abs(offset);
            be = new StringBuilder();
            String s2;
            if (offset < 0) {
                s2 = "-";
            }
            else {
                s2 = "+";
            }
            ((StringBuilder)be).append(s2);
            final long n4 = abs;
            ((StringBuilder)be).append(z(TimeUnit.MILLISECONDS.toHours(n4)));
            ((StringBuilder)be).append(":");
            ((StringBuilder)be).append(z(TimeUnit.MILLISECONDS.toMinutes(n4) % 60L));
            final kvh j = this.i(n3, ((StringBuilder)be).toString());
            if (j != null) {
                this.y(j);
            }
            if (n == s) {
                n = ExifInterface.ad;
            }
            else if (n == ExifInterface.N) {
                n = ExifInterface.af;
            }
            else {
                if (n != ExifInterface.M) {
                    final StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Must pass a date stamp tag, unrecognized tag: ");
                    sb2.append(n);
                    throw new IllegalArgumentException(sb2.toString());
                }
                n = ExifInterface.ae;
            }
            final kvh k = this.i(n, kwp.n(n2));
            if (k == null) {
                return;
            }
            this.y(k);
        }
    }
    
    public final void y(final kvh kvh) {
        this.bz.j(kvh);
    }
}
