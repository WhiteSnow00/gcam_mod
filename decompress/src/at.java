import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class at implements aff, afe
{
    static final TreeMap a;
    final long[] b;
    final double[] c;
    final String[] d;
    final byte[][] e;
    final int f;
    int g;
    private volatile String h;
    private final int[] i;
    
    static {
        a = new TreeMap();
    }
    
    private at(int f) {
        this.f = f;
        ++f;
        this.i = new int[f];
        this.b = new long[f];
        this.c = new double[f];
        this.d = new String[f];
        this.e = new byte[f][];
    }
    
    public static at a(final String s, final int n) {
        Object a = at.a;
        synchronized (a) {
            final Map.Entry<Integer, Object> ceilingEntry = (Map.Entry<Integer, Object>)((TreeMap<Integer, at>)a).ceilingEntry(Integer.valueOf(n));
            if (ceilingEntry != null) {
                ((TreeMap<Integer, at>)a).remove(ceilingEntry.getKey());
                final at at = ceilingEntry.getValue();
                at.i(s, n);
                return at;
            }
            monitorexit(a);
            a = new at(n);
            ((at)a).i(s, n);
            return (at)a;
        }
    }
    
    @Override
    public final String b() {
        return this.h;
    }
    
    @Override
    public final void c(final int n, final byte[] array) {
        throw null;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void d(final int n, final double n2) {
        throw null;
    }
    
    @Override
    public final void e(final int n, final long n2) {
        this.i[n] = 2;
        this.b[n] = n2;
    }
    
    @Override
    public final void f(final int n) {
        this.i[n] = 1;
    }
    
    @Override
    public final void g(final int n, final String s) {
        this.i[n] = 4;
        this.d[n] = s;
    }
    
    @Override
    public final void h(final afe afe) {
        for (int i = 1; i <= this.g; ++i) {
            switch (this.i[i]) {
                case 5: {
                    afe.c(i, this.e[i]);
                    break;
                }
                case 4: {
                    afe.g(i, this.d[i]);
                    break;
                }
                case 3: {
                    afe.d(i, this.c[i]);
                    break;
                }
                case 2: {
                    afe.e(i, this.b[i]);
                    break;
                }
                case 1: {
                    afe.f(i);
                    break;
                }
            }
        }
    }
    
    final void i(final String h, final int g) {
        this.h = h;
        this.g = g;
    }
    
    public final void j() {
        final TreeMap a = at.a;
        monitorenter(a);
        try {
            a.put(this.f, this);
            if (a.size() > 15) {
                int i = a.size() - 10;
                final Iterator iterator = a.descendingKeySet().iterator();
                while (i > 0) {
                    iterator.next();
                    iterator.remove();
                    --i;
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
