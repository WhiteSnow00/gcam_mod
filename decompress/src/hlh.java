import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlh
{
    private static final nsd a;
    private static final EnumMap b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/settings/util/SettingsUtil");
        b = new EnumMap((Class<K>)lfu.class);
    }
    
    public static kre a(final String s, final List list, final lfu lfu) {
        if (!"1836x3264".equals(s)) {
            ArrayList list2 = new ArrayList(list);
            final EnumMap b = hlh.b;
            hlg hlg;
            if (b.get(lfu) != null) {
                hlg = b.get(lfu);
            }
            else {
                final hlg hlg2 = new hlg();
                Collections.sort((List<Object>)list2, new aab(6));
                hlg2.a = (kre)list2.remove(0);
                final kre a = hlg2.a;
                final float n = a.a / (float)a.b;
                final ArrayList list3 = new ArrayList();
                for (int size = list2.size(), i = 0; i < size; ++i) {
                    final kre kre = (kre)list2.get(i);
                    if (Math.abs(kre.a / (float)kre.b - n) < 0.01) {
                        list3.add(kre);
                    }
                }
                if (list3.size() >= 2) {
                    list2 = list3;
                }
                if (list2.isEmpty()) {
                    a.l(hlh.a.c(), "Only one supported resolution.", '\u0930');
                    final kre a2 = hlg2.a;
                    hlg2.b = a2;
                    hlg2.c = a2;
                }
                else if (list2.size() == 1) {
                    a.l(hlh.a.c(), "Only two supported resolutions.", '\u092f');
                    hlg2.b = (kre)list2.get(0);
                    hlg2.c = (kre)list2.get(0);
                }
                else if (list2.size() == 2) {
                    a.l(hlh.a.c(), "Exactly three supported resolutions.", '\u092e');
                    hlg2.b = (kre)list2.get(0);
                    hlg2.c = (kre)list2.get(1);
                }
                else {
                    final kre a3 = hlg2.a;
                    final float n2 = (float)(a3.a * a3.b);
                    final int b2 = b(list2, (int)(0.5f * n2));
                    int b3;
                    final int n3 = b3 = b(list2, (int)(n2 * 0.25f));
                    int n4 = b2;
                    if (((kre)list2.get(b2)).equals(list2.get(n3))) {
                        if (n3 < list2.size() - 1) {
                            b3 = n3 + 1;
                            n4 = b2;
                        }
                        else {
                            n4 = b2 - 1;
                            b3 = n3;
                        }
                    }
                    hlg2.b = (kre)list2.get(n4);
                    hlg2.c = (kre)list2.get(b3);
                }
                hlh.b.put(lfu, hlg2);
                hlg = hlg2;
            }
            hlg.getClass();
            kre kre2;
            if ("large".equals(s)) {
                kre2 = hlg.a;
            }
            else if ("medium".equals(s)) {
                kre2 = hlg.b;
            }
            else if ("small".equals(s)) {
                kre2 = hlg.c;
            }
            else if (s == null || s.split("x").length != 2 || list.contains(kre2 = krf.b(s))) {
                return hlg.a;
            }
            return kre2;
        }
        return hlf.a;
    }
    
    private static int b(final List list, final int n) {
        int i = 0;
        int n2 = 0;
        int n3 = Integer.MAX_VALUE;
        while (i < list.size()) {
            final kre kre = list.get(i);
            final int abs = Math.abs(kre.a * kre.b - n);
            int n4;
            if (abs < n3) {
                n4 = abs;
            }
            else {
                n4 = n3;
            }
            if (abs < n3) {
                n2 = i;
            }
            ++i;
            n3 = n4;
        }
        return n2;
    }
}
