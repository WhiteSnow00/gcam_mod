import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzu
{
    private final float a;
    private final float b;
    private final boolean c;
    private final boolean d;
    
    public gzu(final boolean c, final boolean d, final boolean b) {
        this.c = c;
        this.d = d;
        float a;
        if (!b) {
            a = 4.666667f;
        }
        else {
            a = 1.4f;
        }
        this.a = a;
        float b2;
        if (!b) {
            b2 = 3.5f;
        }
        else {
            b2 = 1.2727273f;
        }
        this.b = b2;
    }
    
    public final hab a(final had had, final Collection collection, final boolean b) {
        final float n = har.a(had, collection) * 5.0E-4f;
        float n3;
        if (this.c) {
            final Iterator iterator = collection.iterator();
            float n2 = Float.MAX_VALUE;
            while (true) {
                n3 = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final had had2 = (had)iterator.next();
                if (had == had2) {
                    continue;
                }
                final niz p3 = had.p;
                final niz p4 = had2.p;
                float n4 = 0.0f;
                Label_0396: {
                    Label_0090: {
                        if (p3.g() || p4.g()) {
                            if (p3.g()) {
                                if (!p4.g()) {
                                    break Label_0090;
                                }
                                final HashMap a = gzz.a(((hat)p3.c()).a);
                                final HashMap a2 = gzz.a(((hat)p4.c()).a);
                                if (a.keySet().equals(a2.keySet())) {
                                    if (a.isEmpty()) {
                                        n4 = 10.0f;
                                        break Label_0396;
                                    }
                                    final Iterator iterator2 = a.keySet().iterator();
                                    float max = 0.0f;
                                    while (true) {
                                        n4 = max;
                                        if (!iterator2.hasNext()) {
                                            break Label_0396;
                                        }
                                        final Integer n5 = (Integer)iterator2.next();
                                        ((List<?>)a.get(n5)).getClass();
                                        ((List<?>)a2.get(n5)).getClass();
                                        final List list = a.get(n5);
                                        final List list2 = a2.get(n5);
                                        njo.p(list.size() == list2.size(), "The vector sizes are different.");
                                        final int size = list.size();
                                        float n6 = 0.0f;
                                        for (int i = 0; i <= size - 1; ++i) {
                                            final float n7 = (float)list.get(i) - (float)list2.get(i);
                                            n6 += n7 * n7;
                                        }
                                        max = Math.max(max, n6);
                                    }
                                }
                            }
                            n4 = 10.0f;
                            break Label_0396;
                        }
                    }
                    n4 = 10.0f;
                }
                if (n4 >= n2) {
                    continue;
                }
                n2 = n4;
            }
        }
        else {
            n3 = Float.MAX_VALUE;
        }
        float n8;
        if (b) {
            n8 = this.b;
        }
        else {
            n8 = this.a;
        }
        float n16;
        if (this.d) {
            final Iterator iterator3 = collection.iterator();
            float n9 = Float.MAX_VALUE;
            while (iterator3.hasNext()) {
                final had had3 = (had)iterator3.next();
                if (had != had3) {
                    final niz r = had.r;
                    final niz r2 = had3.r;
                    float n10;
                    if (r.g()) {
                        if (!r2.g()) {
                            n10 = 10.0f;
                        }
                        else {
                            final float[] array = (float[])r.c();
                            final float[] array2 = (float[])r2.c();
                            final int length = array.length;
                            njo.p(length == array2.length, "The vector sizes are different.");
                            int j = 0;
                            float n11 = 0.0f;
                            float n12 = 0.0f;
                            float n13 = 0.0f;
                            while (j < length) {
                                final float n14 = array[j];
                                final float n15 = array2[j];
                                n11 += n14 * n15;
                                n12 += n14 * n14;
                                n13 += n15 * n15;
                                ++j;
                            }
                            n10 = 1.0f - n11 / ((float)Math.sqrt(n12) * (float)Math.sqrt(n13));
                        }
                    }
                    else {
                        n10 = 10.0f;
                    }
                    if (n10 >= n9) {
                        continue;
                    }
                    n9 = n10;
                }
            }
            n16 = n9 * n8;
        }
        else {
            n16 = Float.MAX_VALUE;
        }
        return new hab(och.d(n, n3, n16), n);
    }
}
