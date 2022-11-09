import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.Map$_CC;
import j$.util.function.BiFunction;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moi extends nmn implements j$.util.Map
{
    private final Map a;
    
    private moi(final Map a) {
        this.a = a;
    }
    
    public static moi b() {
        return new moi((Map)new ConcurrentHashMap());
    }
    
    @Override
    protected final Map c() {
        return this.a;
    }
    
    public final Object putIfAbsent(final Object o, final Object o2) {
        return ((ConcurrentHashMap)this.a).putIfAbsent(o, o2);
    }
}
