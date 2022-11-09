import java.util.Locale;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class llj implements lkb
{
    private static final AtomicInteger a;
    private final int b;
    private final llz c;
    private final lli d;
    private final lkc e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final llx j;
    private final String k;
    private final String l;
    private final String m;
    private final llu n;
    private final kse o;
    private final krr p;
    private boolean q;
    private String r;
    private llw s;
    private final ofn t;
    private final int u;
    private final lke v;
    
    static {
        a = new AtomicInteger(0);
    }
    
    public llj(final llz c, final lke v, final llu n, final lli d, final long f, final long g, final long h, final long i, final String m, final int u, final llx j, final String k, final String l, final kse o, final krr krr) {
        this.r = "";
        String b;
        if ((b = lou.b(l)) == null) {
            b = "";
        }
        njo.d(j.c(b));
        this.c = c;
        this.v = v;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.u = u;
        this.k = k;
        this.l = l;
        this.m = m;
        this.s = null;
        this.o = o;
        this.n = n;
        this.t = ofn.f();
        final lkc e = new lkc();
        e.c = "";
        final lmb a = lmb.a;
        if (a != null) {
            e.d = a;
            e.a = h;
            e.b = i;
            this.e = e;
            this.b = llj.a.incrementAndGet();
            this.p = krr.a("MediaFile");
            return;
        }
        throw new NullPointerException("Null metadata");
    }
    
    private final llw l() {
        this.o.f(String.valueOf(this.toString()).concat("-create"));
        final lke v = this.v;
        final lll lll = new lll();
        lll.a = this.f;
        lll.b = this.g;
        lll.e = this.m;
        lll.c = this.h;
        lll.d = this.i;
        final String r = this.r;
        if (r == null) {
            throw new NullPointerException("Null tag");
        }
        lll.f = r;
        final String l = this.l;
        if (l == null) {
            throw new NullPointerException("Null extension");
        }
        lll.g = l;
        final Long a = lll.a;
        if (a != null && lll.b != null && lll.c != null && lll.d != null && lll.e != null && lll.f != null && lll.g != null) {
            final llm llm = new llm(a, lll.b, lll.c, lll.d, lll.e, lll.f, lll.g);
            final StringBuilder sb = new StringBuilder();
            sb.append(v.a.d);
            sb.append(llm.a);
            sb.append("_");
            sb.append(llm.b);
            sb.append("_");
            sb.append(llm.c);
            final String string = sb.toString();
            final llx j = this.j;
            final String k = this.k;
            final String i = this.l;
            String b;
            if ((b = lou.b(i)) == null) {
                b = "";
            }
            final llw a2 = this.c.a(lmf.a(j, k, string, i, b), this.n);
            this.o.g();
            return a2;
        }
        final StringBuilder sb2 = new StringBuilder();
        if (lll.a == null) {
            sb2.append(" groupTimestampNs");
        }
        if (lll.b == null) {
            sb2.append(" groupUtcTimestampMs");
        }
        if (lll.c == null) {
            sb2.append(" timestampNs");
        }
        if (lll.d == null) {
            sb2.append(" utcTimestampMs");
        }
        if (lll.e == null) {
            sb2.append(" groupTag");
        }
        if (lll.f == null) {
            sb2.append(" tag");
        }
        if (lll.g == null) {
            sb2.append(" extension");
        }
        final String value = String.valueOf(sb2);
        final StringBuilder sb3 = new StringBuilder(String.valueOf(value).length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(value);
        throw new IllegalStateException(sb3.toString());
    }
    
    @Override
    public final long a() {
        monitorenter(this);
        try {
            final llw s = this.s;
            long a;
            if (s != null) {
                a = s.a();
            }
            else {
                a = -1L;
            }
            monitorexit(this);
            return a;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final Uri b() {
        final llw s = this.s;
        if (s == null) {
            return Uri.EMPTY;
        }
        return s.h();
    }
    
    @Override
    public final oey c() {
        return ofi.o(this.t);
    }
    
    @Override
    public final FileInputStream d() {
        synchronized (this) {
            njo.r(this.q ^ true, "Cannot open an input stream after %s has been published or abandoned.", this);
            final kse o = this.o;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
            sb.append(value);
            sb.append("#openInputStream");
            o.f(sb.toString());
            if (this.s == null) {
                this.s = this.l();
            }
            try {
                final FileInputStream b = this.s.b();
                final krr p = this.p;
                final String value2 = String.valueOf(this);
                final String value3 = String.valueOf(b);
                final String value4 = String.valueOf(this.s.i());
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 10 + String.valueOf(value3).length() + String.valueOf(value4).length());
                sb2.append(value2);
                sb2.append(" opened ");
                sb2.append(value3);
                sb2.append(": ");
                sb2.append(value4);
                p.f(sb2.toString());
                this.o.g();
                final ofn t = this.t;
                final llw s = this.s;
                s.getClass();
                t.o(s.h());
                return b;
            }
            finally {
                this.o.g();
            }
        }
    }
    
    @Override
    public final FileOutputStream e() {
        synchronized (this) {
            njo.r(this.q ^ true, "Cannot open an output stream after %s has been published or abandoned.", this);
            final kse o = this.o;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
            sb.append(value);
            sb.append("#openOutputStream");
            o.f(sb.toString());
            if (this.s == null) {
                this.s = this.l();
            }
            try {
                final FileOutputStream c = this.s.c();
                final krr p = this.p;
                final String value2 = String.valueOf(this);
                final String value3 = String.valueOf(c);
                final String value4 = String.valueOf(this.s.i());
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 10 + String.valueOf(value3).length() + String.valueOf(value4).length());
                sb2.append(value2);
                sb2.append(" opened ");
                sb2.append(value3);
                sb2.append(": ");
                sb2.append(value4);
                p.f(sb2.toString());
                return c;
            }
            finally {
                this.o.g();
                final ofn t = this.t;
                final llw s = this.s;
                s.getClass();
                t.o(s.h());
            }
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            synchronized (this) {
                if (this.q) {
                    return;
                }
                this.q = true;
                monitorexit(this);
                final krr p = this.p;
                final String value = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 10);
                sb.append(value);
                sb.append(" Abandoned");
                p.f(sb.toString());
                this.d.d(this);
            }
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            if (this.q) {
                return;
            }
            this.q = true;
            final lkc e = this.e;
            final llw s = this.s;
            s.getClass();
            e.e = s;
            monitorexit(this);
            final krr p = this.p;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 86);
            sb.append(value);
            sb.append(" Published, but will be visible to other apps after the MediaGroup is also published).");
            p.f(sb.toString());
            this.d.e(this);
        }
    }
    
    @Override
    public final void h(final String s) {
        njo.r(this.q ^ true, "Cannot set tag after %s has been published or abandoned.", this);
        this.r = s;
        this.e.c = s;
    }
    
    @Override
    public final void i() {
        synchronized (this) {
            njo.r(this.q ^ true, "Cannot create new file after %s has been published or abandoned.", this);
            if (this.s == null) {
                final kse o = this.o;
                final String value = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 6);
                sb.append(value);
                sb.append("#touch");
                o.f(sb.toString());
                final llw l = this.l();
                this.s = l;
                try {
                    l.d();
                    final krr p = this.p;
                    final String value2 = String.valueOf(this);
                    final String value3 = String.valueOf(this.s.i());
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 10 + String.valueOf(value3).length());
                    sb2.append(value2);
                    sb2.append(" created: ");
                    sb2.append(value3);
                    p.f(sb2.toString());
                }
                finally {
                    this.o.g();
                    final ofn t = this.t;
                    final llw s = this.s;
                    s.getClass();
                    t.o(s.h());
                }
            }
        }
    }
    
    final lkd j() {
        synchronized (this) {
            njo.r(this.q, "Cannot be invoked until %s is published or abandoned.", this);
            final lkc e = this.e;
            final Long a = e.a;
            if (a != null && e.b != null && e.c != null && e.d != null && e.e != null) {
                return new lkd(a, e.b, e.c, e.d, e.e);
            }
            final StringBuilder sb = new StringBuilder();
            if (e.a == null) {
                sb.append(" timestampNs");
            }
            if (e.b == null) {
                sb.append(" utcTimestampMs");
            }
            if (e.c == null) {
                sb.append(" tag");
            }
            if (e.d == null) {
                sb.append(" metadata");
            }
            if (e.e == null) {
                sb.append(" fileObject");
            }
            final String value = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    final llw k() {
        synchronized (this) {
            njo.r(this.q, "Cannot be invoked until %s is published or abandoned.", this);
            return this.s;
        }
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final int b = this.b;
        final int u = this.u;
        String string;
        if (u == 1) {
            string = "";
        }
        else {
            String s = null;
            switch (u) {
                default: {
                    s = "CACHE";
                    break;
                }
                case 2: {
                    s = "PRIVATE";
                    break;
                }
            }
            final StringBuilder sb = new StringBuilder(s.length() + 3);
            sb.append(" (");
            sb.append(s);
            sb.append(")");
            string = sb.toString();
        }
        return String.format(root, "MediaFile-%s%s", b, string);
    }
}
