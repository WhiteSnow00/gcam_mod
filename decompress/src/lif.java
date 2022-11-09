import java.util.Iterator;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lif implements lib
{
    public volatile lib a;
    private final ConcurrentHashMap b;
    
    public lif() {
        this.b = new ConcurrentHashMap();
        this.a = null;
    }
    
    private final lhz e(final String s, final lht[] array, final lia lia) {
        final lia lia2 = (lia)this.b.putIfAbsent((Object)s, (Object)lia);
        if (lia2 == null) {
            return lia;
        }
        lio.d(s, lia2.b, array);
        return lia2;
    }
    
    public final lhr a(final String s, final lht... array) {
        final lia lia = (lia)this.b.get((Object)s);
        lhz e;
        if (lia != null) {
            lio.d(s, lia.b, array);
            e = lia;
        }
        else {
            e = this.e(s, array, new lia(s, array, this, lhq.c(array, lhx.b)));
        }
        return (lhr)e;
    }
    
    public final lhw b(final String s, final lht... array) {
        final lia lia = (lia)this.b.get((Object)s);
        lhz e;
        if (lia != null) {
            lio.d(s, lia.b, array);
            e = lia;
        }
        else {
            e = this.e(s, array, new lia(s, array, this, lhq.c(array, lhx.a)));
        }
        return (lhw)e;
    }
    
    public final void c(final lib a) {
        this.a = a;
    }
    
    public final void d(final lih lih) {
        for (final lia lia : this.b.values()) {
            lia.c.b(lih, lia);
        }
    }
}
