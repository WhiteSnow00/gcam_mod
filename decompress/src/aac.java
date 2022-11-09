import java.util.HashSet;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aac
{
    public final hp a;
    public final zb b;
    public final ArrayList c;
    public final HashSet d;
    
    public aac() {
        this.a = new hq(10);
        this.b = new zb();
        this.c = new ArrayList();
        this.d = new HashSet();
    }
    
    public final void a(final Object o) {
        if (!this.b.containsKey(o)) {
            this.b.put(o, null);
        }
    }
    
    public final void b(final Object o, final ArrayList list, final HashSet set) {
        if (list.contains(o)) {
            return;
        }
        if (!set.contains(o)) {
            set.add(o);
            final ArrayList list2 = (ArrayList)this.b.get(o);
            if (list2 != null) {
                for (int size = list2.size(), i = 0; i < size; ++i) {
                    this.b(list2.get(i), list, set);
                }
            }
            set.remove(o);
            list.add(o);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
