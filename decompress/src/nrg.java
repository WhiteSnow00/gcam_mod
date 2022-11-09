import java.util.Set;
import java.util.Map;
import java.util.SortedMap;
import java.util.NavigableSet;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrg extends nrl implements NavigableMap
{
    private static final long serialVersionUID = 0L;
    transient NavigableSet d;
    transient NavigableMap e;
    transient NavigableSet f;
    
    public nrg(final NavigableMap navigableMap, final Object o) {
        super(navigableMap, o);
    }
    
    final NavigableMap b() {
        return (NavigableMap)super.c();
    }
    
    @Override
    public final Entry ceilingEntry(final Object o) {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().ceilingEntry(o), this.h);
        }
    }
    
    @Override
    public final Object ceilingKey(Object ceilingKey) {
        synchronized (this.h) {
            ceilingKey = this.b().ceilingKey(ceilingKey);
            return ceilingKey;
        }
    }
    
    @Override
    public final NavigableSet descendingKeySet() {
        synchronized (this.h) {
            final NavigableSet d = this.d;
            if (d == null) {
                return this.d = nrr.e(this.b().descendingKeySet(), this.h);
            }
            return d;
        }
    }
    
    @Override
    public final NavigableMap descendingMap() {
        synchronized (this.h) {
            final NavigableMap e = this.e;
            if (e == null) {
                return this.e = nrr.d(this.b().descendingMap(), this.h);
            }
            return e;
        }
    }
    
    @Override
    public final Entry firstEntry() {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().firstEntry(), this.h);
        }
    }
    
    @Override
    public final Entry floorEntry(final Object o) {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().floorEntry(o), this.h);
        }
    }
    
    @Override
    public final Object floorKey(Object floorKey) {
        synchronized (this.h) {
            floorKey = this.b().floorKey(floorKey);
            return floorKey;
        }
    }
    
    @Override
    public final NavigableMap headMap(final Object o, final boolean b) {
        synchronized (this.h) {
            return nrr.d(this.b().headMap(o, b), this.h);
        }
    }
    
    @Override
    public final SortedMap headMap(final Object o) {
        return this.headMap(o, false);
    }
    
    @Override
    public final Entry higherEntry(final Object o) {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().higherEntry(o), this.h);
        }
    }
    
    @Override
    public final Object higherKey(Object higherKey) {
        synchronized (this.h) {
            higherKey = this.b().higherKey(higherKey);
            return higherKey;
        }
    }
    
    @Override
    public final Set keySet() {
        return this.navigableKeySet();
    }
    
    @Override
    public final Entry lastEntry() {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().lastEntry(), this.h);
        }
    }
    
    @Override
    public final Entry lowerEntry(final Object o) {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().lowerEntry(o), this.h);
        }
    }
    
    @Override
    public final Object lowerKey(Object lowerKey) {
        synchronized (this.h) {
            lowerKey = this.b().lowerKey(lowerKey);
            return lowerKey;
        }
    }
    
    @Override
    public final NavigableSet navigableKeySet() {
        synchronized (this.h) {
            final NavigableSet f = this.f;
            if (f == null) {
                return this.f = nrr.e(this.b().navigableKeySet(), this.h);
            }
            return f;
        }
    }
    
    @Override
    public final Entry pollFirstEntry() {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().pollFirstEntry(), this.h);
        }
    }
    
    @Override
    public final Entry pollLastEntry() {
        synchronized (this.h) {
            return nrr.c((Entry)this.b().pollLastEntry(), this.h);
        }
    }
    
    @Override
    public final NavigableMap subMap(final Object o, final boolean b, final Object o2, final boolean b2) {
        synchronized (this.h) {
            return nrr.d(this.b().subMap(o, b, o2, b2), this.h);
        }
    }
    
    @Override
    public final SortedMap subMap(final Object o, final Object o2) {
        return this.subMap(o, true, o2, false);
    }
    
    @Override
    public final NavigableMap tailMap(final Object o, final boolean b) {
        synchronized (this.h) {
            return nrr.d(this.b().tailMap(o, b), this.h);
        }
    }
    
    @Override
    public final SortedMap tailMap(final Object o) {
        return this.tailMap(o, true);
    }
}
