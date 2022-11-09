import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

class nnw implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final Object a;
    private final Object b;
    
    public nnw(final nnx nnx) {
        final Object[] a = new Object[nnx.size()];
        final Object[] b = new Object[nnx.size()];
        final nrv bn = nnx.s().bN();
        int n = 0;
        while (bn.hasNext()) {
            final Map.Entry<Object, V> entry = bn.next();
            a[n] = entry.getKey();
            b[n] = entry.getValue();
            ++n;
        }
        this.a = a;
        this.b = b;
    }
    
    public nnt a(final int n) {
        return new nnt(n);
    }
    
    final Object readResolve() {
        final Object a = this.a;
        if (!(a instanceof noi)) {
            final Object[] array = (Object[])a;
            final Object[] array2 = (Object[])this.b;
            final nnt a2 = this.a(array.length);
            for (int i = 0; i < array.length; ++i) {
                a2.d(array[i], array2[i]);
            }
            return a2.b();
        }
        final noi noi = (noi)a;
        final nnj nnj = (nnj)this.b;
        final nnt a3 = this.a(noi.size());
        final nrv bn = noi.bN();
        final nrv bn2 = nnj.bN();
        while (bn.hasNext()) {
            a3.d(bn.next(), bn2.next());
        }
        return a3.b();
    }
}
