import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrs
{
    public final Object a;
    public int b;
    public int c;
    public long d;
    public nrs e;
    public nrs f;
    public nrs g;
    public nrs h;
    private int i;
    
    public nrs() {
        this.a = null;
        this.b = 1;
    }
    
    public nrs(final Object a, final int b) {
        njo.d(b > 0);
        this.a = a;
        this.b = b;
        this.d = b;
        this.c = 1;
        this.i = 1;
        this.e = null;
        this.f = null;
    }
    
    private final int j() {
        return k(this.e) - k(this.f);
    }
    
    private static int k(final nrs nrs) {
        if (nrs == null) {
            return 0;
        }
        return nrs.i;
    }
    
    private static long l(final nrs nrs) {
        if (nrs == null) {
            return 0L;
        }
        return nrs.d;
    }
    
    private final nrs m() {
        final int b = this.b;
        this.b = 0;
        nru.v(this.e(), this.g());
        final nrs e = this.e;
        if (e == null) {
            return this.f;
        }
        final nrs f = this.f;
        if (f == null) {
            return e;
        }
        if (e.i >= f.i) {
            final nrs e2 = this.e();
            e2.e = this.e.o(e2);
            e2.f = this.f;
            e2.c = this.c - 1;
            e2.d = this.d - b;
            return e2.n();
        }
        final nrs g = this.g();
        g.f = this.f.p(g);
        g.e = this.e;
        g.c = this.c - 1;
        g.d = this.d - b;
        return g.n();
    }
    
    private final nrs n() {
        switch (this.j()) {
            default: {
                this.t();
                return this;
            }
            case 2: {
                final nrs e = this.e;
                e.getClass();
                if (e.j() < 0) {
                    this.e = this.e.q();
                }
                return this.r();
            }
            case -2: {
                final nrs f = this.f;
                f.getClass();
                if (f.j() > 0) {
                    this.f = this.f.r();
                }
                return this.q();
            }
        }
    }
    
    private final nrs o(final nrs nrs) {
        final nrs f = this.f;
        if (f == null) {
            return this.e;
        }
        this.f = f.o(nrs);
        --this.c;
        this.d -= nrs.b;
        return this.n();
    }
    
    private final nrs p(final nrs nrs) {
        final nrs e = this.e;
        if (e == null) {
            return this.f;
        }
        this.e = e.p(nrs);
        --this.c;
        this.d -= nrs.b;
        return this.n();
    }
    
    private final nrs q() {
        njo.o(this.f != null);
        final nrs f = this.f;
        this.f = f.e;
        f.e = this;
        f.d = this.d;
        f.c = this.c;
        this.s();
        f.t();
        return f;
    }
    
    private final nrs r() {
        njo.o(this.e != null);
        final nrs e = this.e;
        this.e = e.f;
        e.f = this;
        e.d = this.d;
        e.c = this.c;
        this.s();
        e.t();
        return e;
    }
    
    private final void s() {
        this.c = nru.t(this.e) + 1 + nru.t(this.f);
        this.d = this.b + l(this.e) + l(this.f);
        this.t();
    }
    
    private final void t() {
        this.i = Math.max(k(this.e), k(this.f)) + 1;
    }
    
    final int a(final Comparator comparator, final Object o) {
        final int compare = comparator.compare(o, this.a);
        if (compare < 0) {
            final nrs e = this.e;
            if (e == null) {
                return 0;
            }
            return e.a(comparator, o);
        }
        else {
            if (compare <= 0) {
                return this.b;
            }
            final nrs f = this.f;
            if (f == null) {
                return 0;
            }
            return f.a(comparator, o);
        }
    }
    
    final nrs b(final Comparator comparator, final Object o, final int n, final int[] array) {
        final int compare = comparator.compare(o, this.a);
        boolean b = true;
        if (compare < 0) {
            final nrs e = this.e;
            if (e == null) {
                array[0] = 0;
                this.e = new nrs(o, n);
                nru.w(this.e(), this.e, this);
                this.i = Math.max(2, this.i);
                ++this.c;
                this.d += n;
                return this;
            }
            final int i = e.i;
            final nrs b2 = e.b(comparator, o, n, array);
            this.e = b2;
            if (array[0] == 0) {
                ++this.c;
            }
            this.d += n;
            if (b2.i == i) {
                return this;
            }
            return this.n();
        }
        else {
            if (compare <= 0) {
                final int b3 = this.b;
                array[0] = b3;
                final long n2 = n;
                if (b3 + n2 > 2147483647L) {
                    b = false;
                }
                njo.d(b);
                this.b += n;
                this.d += n2;
                return this;
            }
            final nrs f = this.f;
            if (f == null) {
                array[0] = 0;
                nru.w(this, this.f = new nrs(o, n), this.g());
                this.i = Math.max(2, this.i);
                ++this.c;
                this.d += n;
                return this;
            }
            final int j = f.i;
            final nrs b4 = f.b(comparator, o, n, array);
            this.f = b4;
            if (array[0] == 0) {
                ++this.c;
            }
            this.d += n;
            if (b4.i == j) {
                return this;
            }
            return this.n();
        }
    }
    
    public final nrs c(final Comparator comparator, final Object o) {
        final int compare = comparator.compare(o, this.a);
        if (compare < 0) {
            final nrs e = this.e;
            if (e == null) {
                return this;
            }
            return (nrs)nfa.e(e.c(comparator, o), this);
        }
        else {
            if (compare == 0) {
                return this;
            }
            final nrs f = this.f;
            if (f == null) {
                return null;
            }
            return f.c(comparator, o);
        }
    }
    
    public final nrs d(final Comparator comparator, final Object o) {
        final int compare = comparator.compare(o, this.a);
        if (compare > 0) {
            final nrs f = this.f;
            if (f == null) {
                return this;
            }
            return (nrs)nfa.e(f.d(comparator, o), this);
        }
        else {
            if (compare == 0) {
                return this;
            }
            final nrs e = this.e;
            if (e == null) {
                return null;
            }
            return e.d(comparator, o);
        }
    }
    
    public final nrs e() {
        final nrs g = this.g;
        g.getClass();
        return g;
    }
    
    final nrs f(final Comparator comparator, final Object o, final int n, final int[] array) {
        final int compare = comparator.compare(o, this.a);
        if (compare < 0) {
            final nrs e = this.e;
            if (e == null) {
                array[0] = 0;
                return this;
            }
            this.e = e.f(comparator, o, n, array);
            final int n2 = array[0];
            if (n2 > 0) {
                if (n >= n2) {
                    --this.c;
                    this.d -= n2;
                }
                else {
                    this.d -= n;
                }
            }
            if (n2 == 0) {
                return this;
            }
            return this.n();
        }
        else if (compare > 0) {
            final nrs f = this.f;
            if (f == null) {
                array[0] = 0;
                return this;
            }
            this.f = f.f(comparator, o, n, array);
            final int n3 = array[0];
            if (n3 > 0) {
                if (n >= n3) {
                    --this.c;
                    this.d -= n3;
                }
                else {
                    this.d -= n;
                }
            }
            return this.n();
        }
        else {
            final int b = this.b;
            if (n >= (array[0] = b)) {
                return this.m();
            }
            this.b = b - n;
            this.d -= n;
            return this;
        }
    }
    
    public final nrs g() {
        final nrs h = this.h;
        h.getClass();
        return h;
    }
    
    final nrs h(final Comparator comparator, final Object o, final int n, final int[] array) {
        final int compare = comparator.compare(o, this.a);
        if (compare < 0) {
            final nrs e = this.e;
            if (e == null) {
                array[0] = 0;
                return this;
            }
            this.e = e.h(comparator, o, n, array);
            final int n2 = array[0];
            if (n2 == n) {
                if (n2 != 0) {
                    --this.c;
                }
                this.d += -n2;
            }
            return this.n();
        }
        else if (compare > 0) {
            final nrs f = this.f;
            if (f == null) {
                array[0] = 0;
                return this;
            }
            this.f = f.h(comparator, o, n, array);
            final int n3 = array[0];
            if (n3 == n) {
                if (n3 != 0) {
                    --this.c;
                }
                this.d += -n3;
            }
            return this.n();
        }
        else {
            if (n == (array[0] = this.b)) {
                return this.m();
            }
            return this;
        }
    }
    
    final nrs i(final Comparator comparator, final Object o, final int[] array) {
        final int compare = comparator.compare(o, this.a);
        if (compare < 0) {
            final nrs e = this.e;
            if (e == null) {
                array[0] = 0;
                return this;
            }
            this.e = e.i(comparator, o, array);
            final int n = array[0];
            if (n != 0) {
                --this.c;
            }
            this.d += -n;
            return this.n();
        }
        else {
            if (compare <= 0) {
                array[0] = this.b;
                return this.m();
            }
            final nrs f = this.f;
            if (f == null) {
                array[0] = 0;
                return this;
            }
            this.f = f.i(comparator, o, array);
            final int n2 = array[0];
            if (n2 != 0) {
                --this.c;
            }
            this.d += -n2;
            return this.n();
        }
    }
    
    @Override
    public final String toString() {
        return nqb.a(this.a, this.b).toString();
    }
}
