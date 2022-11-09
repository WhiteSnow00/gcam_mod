import java.util.Map;
import java.util.Iterator;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class xg implements Iterable
{
    public xc b;
    public xc c;
    public final WeakHashMap d;
    public int e;
    
    public xg() {
        this.d = new WeakHashMap();
        this.e = 0;
    }
    
    protected xc a(final Object o) {
        xc xc;
        for (xc = this.b; xc != null && !xc.a.equals(o); xc = xc.c) {}
        return xc;
    }
    
    public Object b(final Object o) {
        final xc a = this.a(o);
        if (a == null) {
            return null;
        }
        --this.e;
        if (!this.d.isEmpty()) {
            final Iterator iterator = this.d.keySet().iterator();
            while (iterator.hasNext()) {
                ((xf)iterator.next()).aF(a);
            }
        }
        final xc d = a.d;
        final xc c = a.c;
        if (d != null) {
            d.c = c;
        }
        else {
            this.b = c;
        }
        final xc c2 = a.c;
        if (c2 != null) {
            c2.d = d;
        }
        else {
            this.c = d;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }
    
    public final xc d(final Object o, final Object o2) {
        final xc c = new xc(o, o2);
        ++this.e;
        final xc c2 = this.c;
        if (c2 == null) {
            this.b = c;
        }
        else {
            c2.c = c;
            c.d = c2;
        }
        return this.c = c;
    }
    
    public final xd e() {
        final xd xd = new xd(this);
        this.d.put(xd, false);
        return xd;
    }
    
    @Override
    public final boolean equals(Object next) {
        if (next == this) {
            return true;
        }
        if (!(next instanceof xg)) {
            return false;
        }
        final xg xg = (xg)next;
        if (this.e != xg.e) {
            return false;
        }
        final Iterator iterator = this.iterator();
        final Iterator iterator2 = xg.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map.Entry entry = iterator.next();
            final Object o = next = iterator2.next();
            if (entry == null) {
                if (o != null) {
                    return false;
                }
                next = null;
            }
            if (entry == null || entry.equals(next)) {
                continue;
            }
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }
    
    public final Object f(final Object o, final Object o2) {
        final xc a = this.a(o);
        if (a != null) {
            return a.b;
        }
        this.d(o, o2);
        return null;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().hashCode();
        }
        return n;
    }
    
    @Override
    public final Iterator iterator() {
        final xa xa = new xa(this.b, this.c);
        this.d.put(xa, false);
        return xa;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(((Map.Entry<?, ?>)iterator.next()).toString());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
