import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkl implements lkj
{
    public final llb a;
    public final lmo b;
    public final nnn c;
    public boolean d;
    private final llz e;
    private final lku f;
    private final lmp g;
    private final krr h;
    private final kse i;
    private final String j;
    private final llu k;
    private final Set l;
    private final Set m;
    private final Set n;
    private final lko o;
    private final lkk p;
    private final long q;
    private final long r;
    private lkb s;
    private final lke t;
    
    public lkl(final llz e, final llb a, final lke t, final lmp g, final lmo b, final krr krr, final kse i, final lkh lkh, final llu llu, final lku f, final String s, final long q, final long r) {
        this.l = new HashSet();
        this.m = new HashSet();
        this.n = new HashSet();
        this.c = nns.e();
        final lko o = new lko();
        o.d = "";
        o.a(nns.l());
        o.b(1);
        this.o = o;
        this.e = e;
        this.a = a;
        this.t = t;
        this.g = g;
        this.b = b;
        this.h = krr.a("MediaGroup");
        this.i = i;
        this.j = s;
        this.k = llu;
        this.f = f;
        this.q = q;
        this.r = r;
        final lkk lkk = new lkk(lkk.a.getAndIncrement());
        this.p = lkk;
        synchronized (lkh.e) {
            lkh.f.put(lkk, false);
            monitorexit(lkh.e);
            o.a = lkk;
            o.d = s;
            o.b = q;
            o.j = llu;
            o.c = r;
        }
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            njo.r(this.d ^ true, "Cannot modify the group after publish() or abandon(): %s", this.p);
            this.d = true;
            final krr h = this.h;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 10);
            sb.append(value);
            sb.append(" Abandoned");
            h.f(sb.toString());
            final kse i = this.i;
            final String value2 = String.valueOf(this);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 8);
            sb2.append(value2);
            sb2.append("#abandon");
            i.f(sb2.toString());
            final lku f = this.f;
            final lks a = lkt.a();
            a.e = this.o;
            a.b = this.l;
            a.c = this.m;
            a.d = this.n;
            a.b(this.c.f());
            f.a(a.a());
            this.i.g();
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            njo.r(this.d ^ true, "Cannot modify the group after publish() or abandon(): %s", this.p);
            this.d = true;
            final krr h = this.h;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
            sb.append(value);
            sb.append(" Closed");
            h.f(sb.toString());
            final kse i = this.i;
            final String value2 = String.valueOf(this);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 6);
            sb2.append(value2);
            sb2.append("#close");
            i.f(sb2.toString());
            final lks a = lkt.a();
            a.e = this.o;
            a.b = this.l;
            a.c = this.m;
            a.d = this.n;
            a.b(this.c.f());
            final lkb s = this.s;
            if (s != null) {
                a.a = s;
            }
            this.f.b(a.a());
            this.i.g();
        }
    }
    
    @Override
    public final void c(final lkb s) {
        synchronized (this) {
            njo.r(this.d ^ true, "Cannot modify the group after publish() or abandon(): %s", this.p);
            final krr h = this.h;
            final String value = String.valueOf(s);
            final String value2 = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29 + String.valueOf(value2).length());
            sb.append("Set ");
            sb.append(value);
            sb.append(" as the primary item for ");
            sb.append(value2);
            h.f(sb.toString());
            this.s = s;
        }
    }
    
    @Override
    public final lkb d(final int n, final llx llx, String value, String value2, final long n2) {
        njo.p(this.d ^ true, "Cannot create files after publish() or abandon()");
        this.i.f("MediaGroup#create");
        final llj llj = new llj(this.e, this.t, this.k, this.f, this.q, this.r, SystemClock.elapsedRealtimeNanos(), n2, this.j, n, llx, value, value2, this.i, this.h);
        switch (n - 1) {
            default: {
                final llj llj2 = llj;
                final krr h = this.h;
                final String value3 = String.valueOf(llj2);
                value2 = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value3).length() + 14 + String.valueOf(value2).length());
                sb.append("Created ");
                sb.append(value3);
                sb.append(" from ");
                sb.append(value2);
                h.f(sb.toString());
                this.l.add(llj2);
                break;
            }
            case 2: {
                final krr h2 = this.h;
                final String value4 = String.valueOf(llj);
                value = String.valueOf(this);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value4).length() + 14 + String.valueOf(value).length());
                sb2.append("Created ");
                sb2.append(value4);
                sb2.append(" from ");
                sb2.append(value);
                h2.f(sb2.toString());
                this.n.add(llj);
                break;
            }
            case 1: {
                final llj llj3 = llj;
                final krr h3 = this.h;
                final String value5 = String.valueOf(llj3);
                final String value6 = String.valueOf(this);
                final StringBuilder sb3 = new StringBuilder(String.valueOf(value5).length() + 14 + String.valueOf(value6).length());
                sb3.append("Created ");
                sb3.append(value5);
                sb3.append(" from ");
                sb3.append(value6);
                h3.f(sb3.toString());
                this.m.add(llj3);
                break;
            }
        }
        this.i.g();
        return llj;
    }
    
    @Override
    public final String toString() {
        return this.p.toString();
    }
}
