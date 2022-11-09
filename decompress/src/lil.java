import java.util.Comparator;
import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lil
{
    public final lhz a;
    public final TreeMap b;
    
    public lil(final lhz a) {
        this.a = a;
        final lht[] b = ((lia)a).b;
        final Comparator[] array = new Comparator[b.length];
        for (int i = 0; i < b.length; ++i) {
            final Class b2 = b[i].b;
            if (b2 == String.class) {
                array[i] = bzj.o;
            }
            else if (b2 == Integer.class) {
                array[i] = bzj.p;
            }
            else if (b2 == Boolean.class) {
                array[i] = bzj.q;
            }
        }
        this.b = new TreeMap(new lhv(array));
    }
    
    public final String a() {
        return ((lia)this.a).a;
    }
    
    public final lht[] b() {
        return ((lia)this.a).b;
    }
}
