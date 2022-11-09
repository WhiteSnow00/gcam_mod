import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nog extends nni
{
    Object[] d;
    private int e;
    
    public nog() {
        super(4);
    }
    
    public nog(final byte[] array) {
        super(3);
        this.d = new Object[noi.B(3)];
    }
    
    public final noi f() {
        final int b = this.b;
        switch (b) {
            default: {
                noi e2;
                if (this.d != null && noi.B(b) == this.d.length) {
                    Object[] array;
                    if (noi.N(this.b, this.a.length)) {
                        array = Arrays.copyOf(this.a, this.b);
                    }
                    else {
                        array = this.a;
                    }
                    final int e = this.e;
                    final Object[] d = this.d;
                    e2 = new nqr(array, e, d, d.length - 1, this.b);
                }
                else {
                    e2 = noi.E(this.b, this.a);
                    this.b = e2.size();
                }
                this.c = true;
                this.d = null;
                return e2;
            }
            case 1: {
                final Object o = this.a[0];
                o.getClass();
                return noi.H(o);
            }
            case 0: {
                return nqr.a;
            }
        }
    }
    
    public final void g(final Object o) {
        o.getClass();
        if (this.d != null) {
            final int b = noi.B(this.b);
            final Object[] d = this.d;
            final int length = d.length;
            if (b <= length) {
                d.getClass();
                final int hashCode = o.hashCode();
                int j = nov.j(hashCode);
                while (true) {
                    j &= length - 1;
                    final Object[] d2 = this.d;
                    final Object o2 = d2[j];
                    if (o2 == null) {
                        d2[j] = o;
                        this.e += hashCode;
                        super.c(o);
                        return;
                    }
                    if (o2.equals(o)) {
                        return;
                    }
                    ++j;
                }
            }
        }
        this.d = null;
        super.c(o);
    }
    
    public final void h(final Object... array) {
        final Object[] d = this.d;
        int i = 0;
        if (d != null) {
            while (i < array.length) {
                this.g(array[i]);
                ++i;
            }
            return;
        }
        final int length = array.length;
        nrr.z(array, length);
        super.b(super.b + length);
        System.arraycopy(array, 0, super.a, super.b, length);
        super.b += length;
    }
    
    public final void i(final Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            final Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.g(iterator.next());
            }
            return;
        }
        super.e(iterable);
    }
}
