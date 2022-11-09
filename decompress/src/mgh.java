import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mgh
{
    public abstract omj a(final String p0, final Object p1);
    
    public abstract omj b(final omj p0, final omj p1);
    
    public abstract String c(final omj p0);
    
    public final List d(final Map map) {
        final ArrayList list = new ArrayList();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                final omj a = this.a(entry.getKey(), entry.getValue());
                if (a == null) {
                    continue;
                }
                list.add(a);
            }
        }
        return list;
    }
    
    public final List e(final List list, final List list2) {
        if (list.isEmpty()) {
            return list;
        }
        final ArrayList list3 = new ArrayList();
    Label_0027:
        for (final omj omj : list) {
            final String c = this.c(omj);
            while (true) {
                for (final omj omj2 : list2) {
                    if (c.equals(this.c(omj2))) {
                        final omj b = this.b(omj, omj2);
                        if (b != null) {
                            list3.add(b);
                            continue Label_0027;
                        }
                        continue Label_0027;
                    }
                }
                omj omj2 = null;
                continue;
            }
        }
        return list3;
    }
}
