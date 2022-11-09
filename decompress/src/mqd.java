import android.util.Log;
import java.io.IOException;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqd implements njp
{
    private static volatile mop b;
    private final String c;
    private final Object d;
    private final mpc e;
    private final Object f;
    private final Map g;
    
    static {
        mqd.b = new mop(mqc.a);
    }
    
    public mqd(final String c, final Object d, final mpc e) {
        this.f = new Object();
        this.g = new HashMap();
        d.getClass();
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a() {
        mny.a = true;
        if (mny.b == null) {
            mny.b = new Exception();
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
    
    public final Object b(Context ex) {
        ex = (IOException)((Context)ex).getApplicationContext();
        ex.getClass();
        final mny a = mny.a((Context)ex);
        ex = this.g.get("");
        if (ex != null) {
            return ex;
        }
        synchronized (this.f) {
            mny.c = true;
            if (mny.d == null) {
                mny.d = new Exception();
            }
            final mpc e = this.e;
            final String c = this.c;
            String string = "com.google.android.libraries.performance.primes";
            if (((mox)e).c) {
                njo.i("com.google.android.libraries.performance.primes".contains("#") ^ true, "Package %s cannot have an existing subpackage when used with the autoSubpackage option.", "com.google.android.libraries.performance.primes");
                final String packageName = a.e.getPackageName();
                final StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 48);
                sb.append("com.google.android.libraries.performance.primes");
                sb.append("#");
                sb.append(packageName);
                string = sb.toString();
            }
            if (((mox)e).e) {
                njo.r(true, "DirectBoot aware package %s can not access account-scoped flags.", string);
            }
            final Context e2 = a.e;
            if (mox.a == 0) {
                synchronized (mox.class) {
                    if (mox.a == 0) {
                        final int c2 = jpx.c;
                        mox.a = jqg.a(e2);
                    }
                }
            }
            final int a2 = mox.a;
            final boolean d = ((mox)e).d;
            final IOException ex2 = null;
            Label_0425: {
                if (d) {
                    mpp.a(a.b().a(new mpv(a, string, 1)));
                    ex = (IOException)((mox)e).a(a, string, c);
                }
                else if (a2 >= 13000000) {
                    ex = (IOException)mpi.c.a(a, string, ((mox)e).e, mow.b).g(c);
                    if (ex == null) {
                        ex = null;
                    }
                    else {
                        try {
                            ex = (IOException)((mox)e).f.a(ex);
                            break Label_0425;
                        }
                        catch (final IOException ex) {}
                        catch (final IllegalArgumentException ex3) {}
                        String concat;
                        if (c.length() != 0) {
                            concat = "Invalid Phenotype flag value for flag ".concat(c);
                        }
                        else {
                            concat = new String("Invalid Phenotype flag value for flag ");
                        }
                        Log.e("PhenotypeCombinedFlags", concat, (Throwable)ex);
                        ex = null;
                    }
                }
                else {
                    ex = (IOException)((mox)e).a(a, string, c);
                }
            }
            final Context e3 = a.e;
            niz niz = mox.b;
            if (niz == null) {
                synchronized (mox.class) {
                    if (mox.b == null) {
                        mox.b = mnu.b(e3);
                    }
                    niz = mox.b;
                }
            }
            Label_0580: {
                if (niz.g()) {
                    ex = (IOException)((mnt)niz.c()).a(mnw.a("com.google.android.libraries.performance.primes"), null, c);
                    if (ex == null) {
                        ex = ex2;
                    }
                    else {
                        try {
                            ex = (IOException)((mox)e).f.a(ex);
                            break Label_0580;
                        }
                        catch (final IOException ex) {}
                        catch (final IllegalArgumentException ex4) {}
                        String concat2;
                        if (c.length() != 0) {
                            concat2 = "Invalid Phenotype flag value for flag ".concat(c);
                        }
                        else {
                            concat2 = new String("Invalid Phenotype flag value for flag ");
                        }
                        Log.e("PhenotypeCombinedFlags", concat2, (Throwable)ex);
                        ex = ex2;
                    }
                }
            }
            if (ex == null) {
                ex = (IOException)this.d;
            }
            this.g.put("", ex);
            return ex;
        }
    }
}
