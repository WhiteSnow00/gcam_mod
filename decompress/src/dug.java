import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dug
{
    public final cxl a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final float j;
    
    public dug(final ddm ddm, final cxl a) {
        this.a = a;
        final int max = Math.max(1, (int)a.a(cxs.h).c());
        this.b = max;
        final int intValue = (int)a.a(cxs.g).c();
        a.b();
        final int max2 = Math.max(1, intValue);
        int intValue2 = (int)a.a(cxs.q).c();
        njo.o(intValue2 >= 10);
        if (!c(a)) {
            intValue2 = max2;
        }
        int intValue3;
        if (!d(a)) {
            a.b();
            intValue3 = max2;
        }
        else {
            intValue3 = (int)a.a(cxs.p).c();
        }
        final int max3 = Math.max(intValue2, intValue3);
        int n;
        if (!ddm.b()) {
            n = 0;
        }
        else {
            n = 4;
        }
        final int b = ddm.b() ? 1 : 0;
        if (ddm.b() && a.k(cxx.s)) {
            final int max4 = Math.max(n + max2, b + max3);
            this.c = max4;
            int e;
            if (ddm.b()) {
                e = max4 - max2;
            }
            else {
                e = 0;
            }
            this.e = e;
            int f;
            if (ddm.b()) {
                f = max4 - max3;
            }
            else {
                f = 0;
            }
            this.f = f;
        }
        else {
            final int max5 = Math.max(n + max2, max3);
            this.c = max5;
            int e2;
            if (ddm.b()) {
                e2 = max5 - max2;
            }
            else {
                e2 = 0;
            }
            this.e = e2;
            this.f = 0;
        }
        this.d = (int)(this.c * (float)a.g(cxs.V).c());
        njo.o(max > 0);
        njo.o(max <= this.c);
        this.g = a.k(cxs.x);
        a.e();
        this.h = false;
        a.f();
        this.i = true;
        this.j = (float)a.g(cxk.a).c();
    }
    
    static String a(final duf duf) {
        switch (duf.ordinal()) {
            default: {
                return "";
            }
            case 4: {
                return "h";
            }
            case 3: {
                return "r";
            }
            case 2: {
                return "y";
            }
        }
    }
    
    public static boolean c(final cxl cxl) {
        return !cxl.k(cxs.S) && cxl.k(cxs.R);
    }
    
    public static boolean d(final cxl cxl) {
        return cxl.k(cxs.L);
    }
    
    public final boolean b() {
        final cxl a = this.a;
        final cxo a2 = cxs.a;
        a.f();
        return new File("/dev/adsprpc-smd").canRead();
    }
}
