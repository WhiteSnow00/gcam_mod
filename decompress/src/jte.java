import android.os.Handler;
import com.google.android.gms.common.api.Status;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class jte implements kdy
{
    private final jsq a;
    private final int b;
    private final jrq c;
    private final long d;
    private final long e;
    
    public jte(final jsq a, final int b, final jrq c, final long d, final long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static jut b(final jsm jsm, final jum jum, final int n) {
        final jus n2 = jum.n;
        jut d;
        if (n2 == null) {
            d = null;
        }
        else {
            d = n2.d;
        }
        if (d != null && d.b) {
            final int[] d2 = d.d;
            if (d2 == null) {
                final int[] f = d.f;
                if (f != null) {
                    if (jwn.e(f, n)) {
                        return null;
                    }
                }
            }
            else if (!jwn.e(d2, n)) {
                return null;
            }
            if (jsm.i < d.e) {
                return d;
            }
            return null;
        }
        return null;
    }
    
    @Override
    public final void a(final keg keg) {
        if (!this.a.h()) {
            return;
        }
        final jvy a = jvx.a().a;
        if (a != null && !a.b) {
            return;
        }
        final jsm b = this.a.b(this.c);
        if (b != null) {
            final jqo b2 = b.b;
            if (b2 instanceof jum) {
                final long d = this.d;
                final int n = 1;
                final int n2 = 0;
                int n3;
                if (d > 0L) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                final jum jum = (jum)b2;
                final int j = jum.j;
                int d2;
                int a2;
                int n5;
                int n6;
                if (a != null) {
                    int n4 = n3 & (a.c ? 1 : 0);
                    d2 = a.d;
                    final int e = a.e;
                    a2 = a.a;
                    int e2;
                    if (jum.C() && !jum.m()) {
                        final jut b3 = b(b, jum, this.b);
                        if (b3 == null) {
                            return;
                        }
                        if (b3.c && this.d > 0L) {
                            n4 = n;
                        }
                        else {
                            n4 = 0;
                        }
                        e2 = b3.e;
                    }
                    else {
                        e2 = e;
                    }
                    n5 = e2;
                    n6 = n4;
                }
                else {
                    a2 = 0;
                    d2 = 5000;
                    n5 = 100;
                    n6 = n3;
                }
                final jsq a3 = this.a;
                int n7;
                int n8;
                if (keg.e()) {
                    n7 = 0;
                    n8 = n2;
                }
                else if (((kem)keg).d) {
                    n8 = 100;
                    n7 = -1;
                }
                else {
                    final Exception b4 = keg.b();
                    if (b4 instanceof jqq) {
                        final Status a4 = ((jqq)b4).a;
                        final int g = a4.g;
                        final jps i = a4.j;
                        int c;
                        if (i == null) {
                            c = -1;
                        }
                        else {
                            c = i.c;
                        }
                        n7 = c;
                        n8 = g;
                    }
                    else {
                        n8 = 101;
                        n7 = -1;
                    }
                }
                long d3;
                int n9;
                long n10;
                if (n6 != 0) {
                    d3 = this.d;
                    final long currentTimeMillis = System.currentTimeMillis();
                    n9 = (int)(SystemClock.elapsedRealtime() - this.e);
                    n10 = currentTimeMillis;
                }
                else {
                    n10 = 0L;
                    n9 = -1;
                    d3 = n10;
                }
                final jvq jvq = new jvq(this.b, n8, n7, d3, n10, null, null, j, n9);
                final Handler o = a3.o;
                o.sendMessage(o.obtainMessage(18, (Object)new jtf(jvq, a2, d2, n5)));
            }
        }
    }
}
