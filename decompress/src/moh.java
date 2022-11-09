import android.content.ContentResolver;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class moh
{
    private static final Object d;
    private static volatile mog e;
    private static volatile boolean f;
    private static final mop g;
    private static final AtomicInteger h;
    final mof a;
    final String b;
    private final Object i;
    private volatile int j;
    private volatile Object k;
    private final boolean l;
    
    static {
        d = new Object();
        moh.e = null;
        moh.f = false;
        new AtomicReference();
        g = new mop(mqc.b);
        h = new AtomicInteger();
    }
    
    public moh(final mof a, final String b, final Object i, final boolean l) {
        this.j = -1;
        if (a.b != null) {
            this.a = a;
            this.b = b;
            this.i = i;
            this.l = l;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
    
    public static moh b(final mof mof, final String s, final Boolean b, final boolean b2) {
        return new mob(mof, s, b, b2);
    }
    
    public static moh c(final mof mof, final String s, final Long n, final boolean b) {
        return new mnz(mof, s, n, b);
    }
    
    public static moh d(final mof mof, final String s, final String s2, final boolean b) {
        return new mod(mof, s, s2, b);
    }
    
    static void g() {
        moh.h.incrementAndGet();
    }
    
    public static void h(Context context) {
        if (moh.e == null) {
            synchronized (moh.d) {
                if (moh.e == null) {
                    synchronized (moh.d) {
                        final mog e = moh.e;
                        final Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (e == null || e.a != context) {
                            mnm.c();
                            moj.a();
                            mns.d();
                            moh.e = new mog(context, nov.F(new mii(context, 5)));
                            g();
                        }
                    }
                }
            }
        }
    }
    
    private final String i(String s) {
        if (s.isEmpty()) {
            s = this.b;
        }
        else {
            final String value = String.valueOf(this.b);
            if (value.length() != 0) {
                s = s.concat(value);
            }
            else {
                s = new String(s);
            }
        }
        return s;
    }
    
    public abstract Object a(final Object p0);
    
    public final Object e() {
        if (!this.l) {
            final mop g = moh.g;
            this.b.getClass();
            final boolean a = g.a;
            njo.p(true, "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        final int value = moh.h.get();
        if (this.j < value) {
            synchronized (this) {
                if (this.j < value) {
                    final mog e = moh.e;
                    njo.p(e != null, "Must call PhenotypeFlag.init() first");
                    final mof a2 = this.a;
                    final boolean f = a2.f;
                    final boolean g2 = a2.g;
                    final String c = mns.a(e.a).c("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    final Object o = null;
                    final Object o2 = null;
                    Object k = null;
                    Label_0354: {
                        if (c != null && kir.c.matcher(c).matches()) {
                            k = null;
                        }
                        else {
                            final mof a3 = this.a;
                            final Uri b = a3.b;
                            mnp mnp;
                            if (b != null) {
                                if (mnv.a(e.a, b)) {
                                    if (this.a.h) {
                                        final ContentResolver contentResolver = e.a.getContentResolver();
                                        final String lastPathSegment = this.a.b.getLastPathSegment();
                                        final String packageName = e.a.getPackageName();
                                        final StringBuilder sb = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(packageName).length());
                                        sb.append(lastPathSegment);
                                        sb.append("#");
                                        sb.append(packageName);
                                        mnp = mnm.a(contentResolver, mnw.a(sb.toString()));
                                    }
                                    else {
                                        mnp = mnm.a(e.a.getContentResolver(), this.a.b);
                                    }
                                }
                                else {
                                    mnp = null;
                                }
                            }
                            else {
                                final Context a4 = e.a;
                                final String a5 = a3.a;
                                mnp = moj.c();
                            }
                            if (mnp != null) {
                                final Object b2 = mnp.b(this.f());
                                if (b2 != null) {
                                    k = this.a(b2);
                                    break Label_0354;
                                }
                            }
                            k = null;
                        }
                    }
                    if (k == null) {
                        final mof a6 = this.a;
                        if (!a6.e) {
                            final nir i = a6.i;
                            final mns a7 = mns.a(e.a);
                            final mof a8 = this.a;
                            String j;
                            if (a8.e) {
                                j = null;
                            }
                            else {
                                j = this.i(a8.c);
                            }
                            final String c2 = a7.c(j);
                            k = o2;
                            if (c2 != null) {
                                k = this.a(c2);
                            }
                        }
                        else {
                            k = o;
                        }
                        if (k == null) {
                            k = this.i;
                        }
                    }
                    final niz niz = (niz)e.b.a();
                    if (niz.g()) {
                        final mnt mnt = (mnt)niz.c();
                        final mof a9 = this.a;
                        final Uri b3 = a9.b;
                        final String a10 = a9.a;
                        final String a11 = mnt.a(b3, a9.d, this.b);
                        if (a11 == null) {
                            k = this.i;
                        }
                        else {
                            k = this.a(a11);
                        }
                    }
                    this.k = k;
                    this.j = value;
                }
            }
        }
        return this.k;
    }
    
    public final String f() {
        return this.i(this.a.d);
    }
}
