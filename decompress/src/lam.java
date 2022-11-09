import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lam
{
    public static final Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    private final kzf f;
    private final kyw g;
    private final lcb h;
    private final laj i;
    private final lad j;
    private final kjk k;
    private final boolean l;
    private final kse m;
    private final krr n;
    private Set o;
    private final lal p;
    
    static {
        a = new Object();
    }
    
    public lam(final kyb kyb, final ldj ldj, final kxp kxp, final lad j, final lcb h, final laj i, final kyw g, final kzf f, final kjk k, final int n, final kse m, final krr krr) {
        final boolean b = true;
        this.e = 1;
        this.p = new lal(this);
        this.h = h;
        this.i = i;
        this.j = j;
        this.f = f;
        this.g = g;
        this.k = k;
        this.l = (n > 1);
        this.m = m;
        this.o = new HashSet();
        this.n = krr.a("RequestQueue");
        final lak lak = new lak(this, 1);
        final lak lak2 = new lak(this);
        k.c(kyb.a(lak));
        ldj.b(lak);
        kxp.b(lak);
        j.c(lak2);
        final lak f2 = new lak(this, 2);
        njo.p(i.f == null && b, "Session closed listener was set multiple times!");
        i.f = f2;
    }
    
    private final void c(final Set set) {
        if (set != null) {
            for (final kzp kzp : set) {
                final krr n = this.n;
                final String value = String.valueOf(kzp);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
                sb.append("Failed to submit ");
                sb.append(value);
                n.h(sb.toString());
                kzp.f();
            }
        }
    }
    
    final void a() {
        synchronized (this.f) {
            synchronized (lam.a) {
                if (!this.k.a() && (this.l || this.f.d(this.g))) {
                    final int e = this.e;
                    if (e != 2) {
                        if (e != 3) {
                            this.e = 2;
                            monitorexit(lam.a);
                            this.m.f("RequestQueue startCamera");
                            final lcb h = this.h;
                            lcq lcq = null;
                            Label_0407: {
                                if (!h.e.a()) {
                                    final lbw j = h.j;
                                    if (j == null || j.f()) {
                                        final kjk kjk = new kjk();
                                        h.e.c(new lbx(h, kjk));
                                        final lbw i = new lbw(h.a.a, h.a(h.h, h.i), h.c, h.i, h.f, h.g);
                                        final kta kta = new kta(nns.j(nns.n(i, h.k)));
                                        kjk.c(i);
                                        i.a.c(kjk);
                                        final lca lca = new lca(h);
                                        h.d.b(lca);
                                        kjk.c(new lby(h, lca));
                                        final krr g = h.g;
                                        final String value = String.valueOf(h.a.a.a);
                                        String concat;
                                        if (value.length() != 0) {
                                            concat = "Starting Camera ".concat(value);
                                        }
                                        else {
                                            concat = new String("Starting Camera ");
                                        }
                                        g.f(concat);
                                        h.b.c(h.a.a, kta);
                                        h.j = i;
                                        lcq = h.h;
                                        break Label_0407;
                                    }
                                }
                                lcq = h.h;
                            }
                            final lal p = this.p;
                            synchronized (lcq) {
                                if (lcq.d) {
                                    monitorexit(lcq);
                                }
                                else {
                                    p.getClass();
                                    lcq.e = p;
                                    final lcr a = lcq.a;
                                    monitorexit(lcq);
                                    if (a != null) {
                                        p.a();
                                    }
                                }
                                monitorexit(this.f);
                                synchronized (lam.a) {
                                    final boolean d = this.d;
                                    boolean b = true;
                                    if (!d) {
                                        this.b = true;
                                        this.c = true;
                                    }
                                    else {
                                        b = false;
                                    }
                                    monitorexit(lam.a);
                                    if (b) {
                                        this.b();
                                    }
                                    this.m.g();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void b() {
        Object a = lam.a;
        monitorenter(a);
        try {
            if (this.d) {
                monitorexit(a);
                return;
            }
            this.d = true;
            monitorexit(a);
        Label_0023:
            while (true) {
                final laj i = this.i;
                final lhc b = i.b.b(1L);
                final Set set = null;
                a = null;
                final Set set2 = null;
                lag a2;
                if (b != null) {
                    if (i.a.a()) {
                        b.close();
                        a2 = null;
                    }
                    else {
                        final kjk a3 = i.a;
                        a2 = i.d.a(b, i.f, i.c, ((las)i.e).a());
                        a3.c(a2);
                    }
                }
                else {
                    a2 = null;
                }
                int length = 0;
                Label_0809: {
                    if (a2 != null) {
                        Label_0767: {
                            try {
                                Object o = lam.a;
                                synchronized (o) {
                                    final boolean b2 = this.b;
                                    final boolean c = this.c;
                                    this.b = false;
                                    this.c = false;
                                    monitorexit(o);
                                    int length2 = 0;
                                    Label_0334: {
                                        if (b2) {
                                            final kyi b3 = a2.b().b();
                                            if (!b3.a().isEmpty()) {
                                                synchronized (o) {
                                                    if (!this.o.equals(b3.a())) {
                                                        final krr n = this.n;
                                                        final String value = String.valueOf(b3);
                                                        final String value2 = String.valueOf(b3.a());
                                                        length = String.valueOf(value).length();
                                                        length2 = String.valueOf(value2).length();
                                                        final StringBuilder sb = new StringBuilder(length + 31 + length2);
                                                        sb.append("Set repeating request to ");
                                                        sb.append(value);
                                                        sb.append(" with ");
                                                        sb.append(value2);
                                                        n.f(sb.toString());
                                                        this.o = noi.F(b3.a());
                                                    }
                                                    monitorexit(o);
                                                    a2.i(b3);
                                                    length2 = 1;
                                                    break Label_0334;
                                                }
                                            }
                                        }
                                        length2 = 0;
                                    }
                                    Label_0723: {
                                        if (c) {
                                            a = set2;
                                            length = length2;
                                            try {
                                                Set set3;
                                                for (set3 = this.j.a(); set3 != null; set3 = this.j.a()) {
                                                    a = set3;
                                                    length = length2;
                                                    final kyh b4 = a2.b();
                                                    a = set3;
                                                    length = length2;
                                                    o = set3.iterator();
                                                    while (true) {
                                                        a = set3;
                                                        length = length2;
                                                        if (!((Iterator)o).hasNext()) {
                                                            break;
                                                        }
                                                        a = set3;
                                                        length = length2;
                                                        b4.f(((kzp)((Iterator)o).next()).c);
                                                    }
                                                    a = set3;
                                                    length = length2;
                                                    final kyi b5 = b4.b();
                                                    a = set3;
                                                    length = length2;
                                                    if (b5.a().isEmpty()) {
                                                        a = set3;
                                                        length = length2;
                                                        this.c(set3);
                                                    }
                                                    else {
                                                        a = set3;
                                                        length = length2;
                                                        final krr n2 = this.n;
                                                        a = set3;
                                                        length = length2;
                                                        final String value3 = String.valueOf(b5);
                                                        a = set3;
                                                        length = length2;
                                                        o = String.valueOf(b5.a());
                                                        a = set3;
                                                        length = length2;
                                                        final int length3 = String.valueOf(value3).length();
                                                        a = set3;
                                                        length = length2;
                                                        final int length4 = String.valueOf(o).length();
                                                        a = set3;
                                                        length = length2;
                                                        a = set3;
                                                        length = length2;
                                                        final StringBuilder sb2 = new StringBuilder(length3 + 17 + length4);
                                                        a = set3;
                                                        length = length2;
                                                        sb2.append("Submitting ");
                                                        a = set3;
                                                        length = length2;
                                                        sb2.append(value3);
                                                        a = set3;
                                                        length = length2;
                                                        sb2.append(" with ");
                                                        a = set3;
                                                        length = length2;
                                                        sb2.append((String)o);
                                                        a = set3;
                                                        length = length2;
                                                        n2.f(sb2.toString());
                                                        a = set3;
                                                        length = length2;
                                                        a2.j(b5, set3);
                                                        length2 = 1;
                                                    }
                                                    a = set3;
                                                    length = length2;
                                                }
                                                a = set3;
                                                break Label_0723;
                                            }
                                            catch (final kuw kuw) {
                                                break Label_0767;
                                            }
                                        }
                                        a = set;
                                    }
                                    if (length2 != 0) {
                                        length = length2;
                                        this.a();
                                        length = length2;
                                        break Label_0809;
                                    }
                                    length = length2;
                                    break Label_0809;
                                }
                            }
                            catch (final kuw kuw2) {}
                            finally {
                                final kuw kuw3;
                                try {
                                    a2.close();
                                }
                                finally {
                                    ((Throwable)a).addSuppressed(kuw3);
                                }
                                this.n.i("Unable to invoke setRepeating, requestProcessor is unavailable", kuw3);
                                this.c((Set)a);
                                break Label_0809;
                            }
                        }
                    }
                    length = 0;
                }
                if (a2 != null) {
                    a2.close();
                }
                final Object a4 = lam.a;
                monitorenter(a4);
                Label_0860: {
                    if (length == 0) {
                        break Label_0860;
                    }
                    while (true) {
                        try {
                            if (this.b) {
                                length = 1;
                                break Label_0863;
                            }
                            if (this.c) {
                                length = 1;
                                break Label_0863;
                            }
                            break Label_0860;
                        }
                        finally {
                            monitorexit(a4);
                            iftrue(Label_0873:)(length != 0);
                            Block_36: {
                                break Block_36;
                                length = 0;
                                continue;
                            }
                            this.d = false;
                            Label_0873: {
                                monitorexit(a4);
                            }
                            iftrue(Label_0023:)(length != 0);
                        }
                        break;
                    }
                }
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
