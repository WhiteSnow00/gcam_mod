import java.util.Collection;
import java.util.SortedMap;
import java.util.Set;
import java.util.NavigableSet;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

class kqy implements NavigableMap
{
    private final NavigableMap a;
    
    public kqy(final NavigableMap a) {
        this.a = a;
    }
    
    @Override
    public final Entry ceilingEntry(final Object o) {
        return (Entry)this.a.ceilingEntry(o);
    }
    
    @Override
    public final Object ceilingKey(final Object o) {
        return this.a.ceilingKey(o);
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Comparator comparator() {
        return this.a.comparator();
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.a.containsValue(o);
    }
    
    @Override
    public final NavigableSet descendingKeySet() {
        return this.a.descendingKeySet();
    }
    
    @Override
    public final NavigableMap descendingMap() {
        return this.a.descendingMap();
    }
    
    @Override
    public final Set entrySet() {
        return this.a.entrySet();
    }
    
    @Override
    public final Entry firstEntry() {
        return (Entry)this.a.firstEntry();
    }
    
    @Override
    public final Object firstKey() {
        return this.a.firstKey();
    }
    
    @Override
    public final Entry floorEntry(final Object o) {
        return (Entry)this.a.floorEntry(o);
    }
    
    @Override
    public final Object floorKey(final Object o) {
        return this.a.floorKey(o);
    }
    
    @Override
    public final Object get(final Object o) {
        return this.a.get(o);
    }
    
    @Override
    public final NavigableMap headMap(final Object o, final boolean b) {
        return this.a.headMap(o, b);
    }
    
    @Override
    public final SortedMap headMap(final Object o) {
        return this.a.headMap(o);
    }
    
    @Override
    public final Entry higherEntry(final Object o) {
        return (Entry)this.a.higherEntry(o);
    }
    
    @Override
    public final Object higherKey(final Object o) {
        return this.a.higherKey(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Set keySet() {
        return this.a.keySet();
    }
    
    @Override
    public final Entry lastEntry() {
        return (Entry)this.a.lastEntry();
    }
    
    @Override
    public final Object lastKey() {
        return this.a.lastKey();
    }
    
    @Override
    public final Entry lowerEntry(final Object o) {
        return (Entry)this.a.lowerEntry(o);
    }
    
    @Override
    public final Object lowerKey(final Object o) {
        return this.a.lowerKey(o);
    }
    
    @Override
    public final NavigableSet navigableKeySet() {
        return this.a.navigableKeySet();
    }
    
    @Override
    public final Entry pollFirstEntry() {
        return (Entry)this.a.pollFirstEntry();
    }
    
    @Override
    public final Entry pollLastEntry() {
        return (Entry)this.a.pollLastEntry();
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        return this.a.put(o, o2);
    }
    
    @Override
    public void putAll(final Map map) {
        this.a.putAll(map);
    }
    
    @Override
    public final Object remove(final Object o) {
        return this.a.remove(o);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final NavigableMap subMap(final Object o, final boolean b, final Object o2, final boolean b2) {
        return this.a.subMap(o, b, o2, b2);
    }
    
    @Override
    public final SortedMap subMap(final Object o, final Object o2) {
        return this.a.subMap(o, o2);
    }
    
    @Override
    public final NavigableMap tailMap(final Object o, final boolean b) {
        return this.a.tailMap(o, b);
    }
    
    @Override
    public final SortedMap tailMap(final Object o) {
        return this.a.tailMap(o);
    }
    
    @Override
    public final Collection values() {
        return this.a.values();
    }
}
