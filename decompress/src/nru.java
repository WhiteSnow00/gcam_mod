import java.util.Iterator;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nru extends nld implements Serializable
{
    private static final long serialVersionUID = 1L;
    public final transient nrt c;
    public final transient nmu d;
    public final transient nrs e;
    
    public nru(final Comparator comparator) {
        super(comparator);
        this.d = nmu.a(comparator);
        final nrs e = new nrs();
        v(this.e = e, e);
        this.c = new nrt();
    }
    
    public nru(final nrt c, final nmu d, final nrs e) {
        super(d.a);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final long A(final int n) {
        final nrs nrs = (nrs)this.c.a;
        long b = nrr.b(n, nrs);
        if (this.d.b) {
            b -= this.z(n, nrs);
        }
        long n2 = b;
        if (this.d.d) {
            n2 = b - this.y(n, nrs);
        }
        return n2;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        final Comparator comparator = (Comparator)objectInputStream.readObject();
        nrr.r(nld.class, "comparator").a(this, comparator);
        nrr.r(nru.class, "range").a(this, nmu.a(comparator));
        nrr.r(nru.class, "rootReference").a(this, new nrt());
        final nrs nrs = new nrs();
        nrr.r(nru.class, "header").a(this, nrs);
        v(nrs, nrs);
        for (int int1 = objectInputStream.readInt(), i = 0; i < int1; ++i) {
            this.h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }
    
    static int t(final nrs nrs) {
        if (nrs == null) {
            return 0;
        }
        return nrs.c;
    }
    
    public static void v(final nrs g, final nrs h) {
        g.h = h;
        h.g = g;
    }
    
    public static void w(final nrs nrs, final nrs nrs2, final nrs nrs3) {
        v(nrs, nrs2);
        v(nrs2, nrs3);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.p().comparator());
        objectOutputStream.writeInt(this.g().size());
        for (final nps nps : this.g()) {
            objectOutputStream.writeObject(nps.b());
            objectOutputStream.writeInt(nps.a());
        }
    }
    
    private final long y(final int n, final nrs nrs) {
        if (nrs == null) {
            return 0L;
        }
        final int compare = super.b.compare(this.d.e, nrs.a);
        if (compare > 0) {
            return this.y(n, nrs.f);
        }
        if (compare != 0) {
            return nrr.b(n, nrs.f) + nrr.a(n, nrs) + this.y(n, nrs.e);
        }
        switch (this.d.g - 1) {
            default: {
                return nrr.b(n, nrs.f);
            }
            case 0: {
                return nrr.a(n, nrs) + nrr.b(n, nrs.f);
            }
        }
    }
    
    private final long z(final int n, final nrs nrs) {
        if (nrs == null) {
            return 0L;
        }
        final int compare = super.b.compare(this.d.c, nrs.a);
        if (compare < 0) {
            return this.z(n, nrs.e);
        }
        if (compare != 0) {
            return nrr.b(n, nrs.e) + nrr.a(n, nrs) + this.z(n, nrs.f);
        }
        switch (this.d.f - 1) {
            default: {
                return nrr.b(n, nrs.e);
            }
            case 0: {
                return nrr.a(n, nrs) + nrr.b(n, nrs.e);
            }
        }
    }
    
    @Override
    public final int b() {
        return ofi.C(this.A(2));
    }
    
    @Override
    public final int bK(final Object o) {
        try {
            final Object a = this.c.a;
            if (this.d.c(o) && a != null) {
                return ((nrs)a).a(super.b, o);
            }
            return 0;
        }
        catch (final NullPointerException ex) {}
        catch (final ClassCastException ex2) {}
        return 0;
    }
    
    @Override
    public final Iterator c() {
        return new nrq(this, 1);
    }
    
    @Override
    public final void clear() {
        final nmu d = this.d;
        if (!d.b && !d.d) {
            nrs g = this.e.g();
            nrs e;
            while (true) {
                e = this.e;
                if (g == e) {
                    break;
                }
                final nrs g2 = g.g();
                g.b = 0;
                g.e = null;
                g.f = null;
                g.g = null;
                g.h = null;
                g = g2;
            }
            v(e, e);
            this.c.a = null;
            return;
        }
        nqb.y(this.c());
    }
    
    @Override
    public final int d(final Object o, final int n) {
        nqb.C(n, "occurrences");
        final Object a = this.c.a;
        final int[] array = { 0 };
        try {
            if (this.d.c(o) && a != null) {
                this.c.a(a, ((nrs)a).f(super.b, o, n, array));
                return array[0];
            }
            return 0;
        }
        catch (final NullPointerException ex) {}
        catch (final ClassCastException ex2) {}
        return 0;
    }
    
    @Override
    public final void h(final Object o, final int n) {
        nqb.C(n, "occurrences");
        if (n == 0) {
            this.bK(o);
            return;
        }
        njo.d(this.d.c(o));
        final Object a = this.c.a;
        if (a == null) {
            super.b.compare(o, o);
            final nrs nrs = new nrs(o, n);
            final nrs e = this.e;
            w(e, nrs, e);
            this.c.a(null, nrs);
            return;
        }
        this.c.a(a, ((nrs)a).b(super.b, o, n, new int[1]));
    }
    
    @Override
    public final boolean i(final Object o, final int n) {
        nqb.C(0, "newCount");
        nqb.C(n, "oldCount");
        njo.d(this.d.c(o));
        final Object a = this.c.a;
        if (a == null) {
            return n == 0;
        }
        final int[] array = { 0 };
        this.c.a(a, ((nrs)a).h(super.b, o, n, array));
        return array[0] == n;
    }
    
    @Override
    public final Iterator iterator() {
        return nqb.c(this);
    }
    
    @Override
    public final Iterator o() {
        return new nrq(this);
    }
    
    @Override
    public final nra r(final Object o, final int n) {
        return new nru(this.c, this.d.b(new nmu(super.b, false, null, 1, true, o, n)), this.e);
    }
    
    @Override
    public final nra s(final Object o, final int n) {
        return new nru(this.c, this.d.b(new nmu(super.b, true, o, n, false, null, 1)), this.e);
    }
    
    @Override
    public final int size() {
        return ofi.C(this.A(1));
    }
    
    public final nps u(final nrs nrs) {
        return new nrp(this, nrs);
    }
    
    public final void x(final Object o) {
        nqb.C(0, "count");
        if (!this.d.c(o)) {
            njo.d(true);
            return;
        }
        final Object a = this.c.a;
        if (a == null) {
            return;
        }
        this.c.a(a, ((nrs)a).i(super.b, o, new int[1]));
    }
}
