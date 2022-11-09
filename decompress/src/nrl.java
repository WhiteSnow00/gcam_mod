import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

// 
// Decompiled by Procyon v0.6.0
// 

class nrl extends nrf implements SortedMap
{
    private static final long serialVersionUID = 0L;
    
    public nrl(final SortedMap sortedMap, final Object o) {
        super(sortedMap, o);
    }
    
    public SortedMap c() {
        return (SortedMap)super.a();
    }
    
    @Override
    public final Comparator comparator() {
        synchronized (this.h) {
            return this.c().comparator();
        }
    }
    
    @Override
    public final Object firstKey() {
        synchronized (this.h) {
            return this.c().firstKey();
        }
    }
    
    @Override
    public SortedMap headMap(final Object o) {
        synchronized (this.h) {
            return nrr.g(this.c().headMap(o), this.h);
        }
    }
    
    @Override
    public final Object lastKey() {
        synchronized (this.h) {
            return this.c().lastKey();
        }
    }
    
    @Override
    public SortedMap subMap(final Object o, final Object o2) {
        synchronized (this.h) {
            return nrr.g(this.c().subMap(o, o2), this.h);
        }
    }
    
    @Override
    public SortedMap tailMap(final Object o) {
        synchronized (this.h) {
            return nrr.g(this.c().tailMap(o), this.h);
        }
    }
}
