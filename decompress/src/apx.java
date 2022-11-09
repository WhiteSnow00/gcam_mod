import java.util.ListIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apx implements Comparable
{
    public String a;
    public String b;
    public apx c;
    public List d;
    public aqj e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private List j;
    
    public apx(final String s, final aqj aqj) {
        this(s, null, aqj);
    }
    
    public apx(final String a, final String b, final aqj e) {
        this.j = null;
        this.d = null;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    private final List u() {
        if (this.d == null) {
            this.d = new ArrayList(0);
        }
        return this.d;
    }
    
    private final void v(final String s) {
        if (!"[]".equals(s) && this.c(s) != null) {
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 35);
            sb.append("Duplicate property or field node '");
            sb.append(s);
            sb.append("'");
            throw new ape(sb.toString(), 203);
        }
    }
    
    private final boolean w() {
        return "xml:lang".equals(this.a);
    }
    
    private final boolean x() {
        return "rdf:type".equals(this.a);
    }
    
    private static final apx y(final List list, final String s) {
        if (list != null) {
            for (final apx apx : list) {
                if (apx.a.equals(s)) {
                    return apx;
                }
            }
        }
        return null;
    }
    
    public final int a() {
        final List j = this.j;
        if (j != null) {
            return j.size();
        }
        return 0;
    }
    
    public final int b() {
        final List d = this.d;
        if (d != null) {
            return d.size();
        }
        return 0;
    }
    
    public final apx c(final String s) {
        return y(this.j(), s);
    }
    
    public final Object clone() {
        aqj aqj;
        try {
            aqj = new aqj(this.g().a);
        }
        catch (final ape ape) {
            aqj = new aqj();
        }
        final apx apx = new apx(this.a, this.b, aqj);
        try {
            final Iterator h = this.h();
            while (h.hasNext()) {
                apx.k((apx)((apx)h.next()).clone());
            }
            final Iterator i = this.i();
            while (i.hasNext()) {
                apx.m((apx)((apx)i.next()).clone());
            }
        }
        catch (final ape ape2) {}
        return apx;
    }
    
    @Override
    public final int compareTo(final Object o) {
        if (this.g().n()) {
            return this.b.compareTo(((apx)o).b);
        }
        return this.a.compareTo(((apx)o).a);
    }
    
    public final apx d(final String s) {
        return y(this.d, s);
    }
    
    public final apx e(final int n) {
        return this.j().get(n - 1);
    }
    
    public final apx f(final int n) {
        return this.u().get(n - 1);
    }
    
    public final aqj g() {
        if (this.e == null) {
            this.e = new aqj();
        }
        return this.e;
    }
    
    public final Iterator h() {
        if (this.j != null) {
            return this.j().iterator();
        }
        return Collections.EMPTY_LIST.listIterator();
    }
    
    public final Iterator i() {
        if (this.d != null) {
            return new apw(this.u().iterator());
        }
        return Collections.EMPTY_LIST.iterator();
    }
    
    public final List j() {
        if (this.j == null) {
            this.j = new ArrayList(0);
        }
        return this.j;
    }
    
    public final void k(final apx apx) {
        this.v(apx.a);
        apx.c = this;
        this.j().add(apx);
    }
    
    public final void l(final int n, final apx apx) {
        this.v(apx.a);
        apx.c = this;
        this.j().add(n - 1, apx);
    }
    
    public final void m(final apx apx) {
        final String a = apx.a;
        if (!"[]".equals(a) && this.d(a) != null) {
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22);
            sb.append("Duplicate '");
            sb.append(a);
            sb.append("' qualifier");
            throw new ape(sb.toString(), 203);
        }
        apx.c = this;
        apx.g().f(32, true);
        this.g().v(true);
        if (apx.w()) {
            this.e.u(true);
            this.u().add(0, apx);
            return;
        }
        if (apx.x()) {
            this.e.w(true);
            this.u().add(this.e.c() ? 1 : 0, apx);
            return;
        }
        this.u().add(apx);
    }
    
    public final void n() {
        if (this.j.isEmpty()) {
            this.j = null;
        }
    }
    
    public final void o(final apx apx) {
        this.j().remove(apx);
        this.n();
    }
    
    public final void p() {
        this.j = null;
    }
    
    public final void q(final apx apx) {
        final aqj g = this.g();
        if (apx.w()) {
            g.u(false);
        }
        else if (apx.x()) {
            g.w(false);
        }
        this.u().remove(apx);
        if (this.d.isEmpty()) {
            g.v(false);
            this.d = null;
        }
    }
    
    public final void r() {
        if (this.t()) {
            final apx[] array = this.u().toArray(new apx[this.b()]);
            final int n = 0;
            int n2 = 0;
            int length;
            while (true) {
                length = array.length;
                if (length <= n2 || (!"xml:lang".equals(array[n2].a) && !"rdf:type".equals(array[n2].a))) {
                    break;
                }
                array[n2].r();
                ++n2;
            }
            Arrays.sort(array, n2, length);
            final ListIterator listIterator = this.d.listIterator();
            for (int i = n; i < array.length; ++i) {
                listIterator.next();
                listIterator.set(array[i]);
                array[i].r();
            }
        }
        if (this.s()) {
            if (!this.g().d()) {
                Collections.sort((List<Comparable>)this.j);
            }
            final Iterator h = this.h();
            while (h.hasNext()) {
                ((apx)h.next()).r();
            }
        }
    }
    
    public final boolean s() {
        final List j = this.j;
        return j != null && j.size() > 0;
    }
    
    public final boolean t() {
        final List d = this.d;
        return d != null && d.size() > 0;
    }
}
