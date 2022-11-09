import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class nnt
{
    Object[] a;
    int b;
    
    public nnt() {
        this(4);
    }
    
    public nnt(final int n) {
        this.a = new Object[n + n];
        this.b = 0;
    }
    
    private final void a(int length) {
        final int n = length + length;
        final Object[] a = this.a;
        length = a.length;
        if (n > length) {
            this.a = Arrays.copyOf(a, nni.a(length, n));
        }
    }
    
    public nnx b() {
        return nqq.a(this.b, this.a);
    }
    
    public void d(final Object o, final Object o2) {
        this.a(this.b + 1);
        nqb.A(o, o2);
        final Object[] a = this.a;
        final int b = this.b;
        final int n = b + b;
        a[n] = o;
        a[n + 1] = o2;
        this.b = b + 1;
    }
    
    public final void e(final Iterable iterable) {
        if (iterable instanceof Collection) {
            this.a(this.b + ((Collection)iterable).size());
        }
        for (final Map.Entry<Object, V> entry : iterable) {
            this.d(entry.getKey(), entry.getValue());
        }
    }
}
