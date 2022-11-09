import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class nni
{
    Object[] a;
    int b;
    boolean c;
    
    public nni(final int n) {
        nqb.C(n, "initialCapacity");
        this.a = new Object[n];
        this.b = 0;
    }
    
    static int a(int highestOneBit, int n) {
        if ((highestOneBit = highestOneBit + (highestOneBit >> 1) + 1) < n) {
            highestOneBit = Integer.highestOneBit(n - 1);
            highestOneBit += highestOneBit;
        }
        if ((n = highestOneBit) < 0) {
            n = Integer.MAX_VALUE;
        }
        return n;
    }
    
    public final void b(final int n) {
        final Object[] a = this.a;
        final int length = a.length;
        if (length < n) {
            this.a = Arrays.copyOf(a, a(length, n));
            this.c = false;
            return;
        }
        if (this.c) {
            this.a = a.clone();
            this.c = false;
        }
    }
    
    public final void c(final Object o) {
        o.getClass();
        this.b(this.b + 1);
        this.a[this.b++] = o;
    }
    
    public final void e(final Iterable iterable) {
        if (iterable instanceof Collection) {
            final Collection collection = (Collection)iterable;
            this.b(this.b + collection.size());
            if (collection instanceof nnj) {
                this.b = ((nnj)collection).x(this.a, this.b);
                return;
            }
        }
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.d(iterator.next());
        }
    }
}
