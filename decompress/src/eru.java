import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eru
{
    private static ert a;
    
    static {
        eru.a = null;
    }
    
    public static ert a(final atl atl) {
        if (eru.a == null) {
            final ArrayList list = new ArrayList(atl.f);
            final ArrayList list2 = new ArrayList(atl.c);
            final int[] array = new int[list.size()];
            int n = 0;
            int n2 = 0;
            int n3;
            while (true) {
                final int size = list.size();
                n3 = -1;
                if (n >= size) {
                    break;
                }
                array[n] = -1;
                final double n4 = ((aua)list.get(n)).b();
                final double n5 = ((aua)list.get(n)).a();
                Double.isNaN(n4);
                Double.isNaN(n5);
                final double n6 = n4 / n5;
                int n7 = Integer.MAX_VALUE;
                int n10;
                for (int i = 0; i < list2.size(); ++i, n7 = n10) {
                    final double n8 = ((aua)list2.get(i)).b();
                    final double n9 = ((aua)list2.get(i)).a();
                    Double.isNaN(n8);
                    Double.isNaN(n9);
                    n10 = n7;
                    if (Math.abs(n6 - n8 / n9) < 0.03) {
                        n10 = n7;
                        if (((aua)list2.get(i)).b() < 640) {
                            final int abs = Math.abs(((aua)list2.get(i)).b() - 320);
                            if (abs < (n10 = n7)) {
                                array[n] = i;
                                n10 = abs;
                            }
                        }
                    }
                }
                int n11 = n2;
                if (array[n] >= 0) {
                    n11 = n2 + 1;
                }
                ++n;
                n2 = n11;
            }
            final double n12 = Double.MAX_VALUE;
            double n17;
            int l;
            int n18;
            double n19;
            if (n2 == 0) {
                double n13 = 320.0;
                int j = 0;
                int n14 = -1;
                while (j < list2.size()) {
                    final double n15 = Math.abs(((aua)list2.get(j)).b() - 320);
                    double n16;
                    if (n15 < n13) {
                        n16 = n15;
                    }
                    else {
                        n16 = n13;
                    }
                    if (n15 < n13) {
                        n14 = j;
                    }
                    ++j;
                    n13 = n16;
                }
                for (int k = 0; k < list.size(); ++k) {
                    array[k] = n14;
                }
                n17 = Double.MAX_VALUE;
                l = 0;
                n18 = n3;
                n19 = n12;
            }
            else {
                n17 = Double.MAX_VALUE;
                l = 0;
                n19 = n12;
                n18 = n3;
            }
            while (l < list.size()) {
                if (array[l] >= 0) {
                    final double n20 = Math.abs(((aua)list.get(l)).b() - 3000);
                    final int b = ((aua)list.get(l)).b();
                    final double n21 = n17;
                    final double n22 = b;
                    final double n23 = ((aua)list.get(l)).a();
                    Double.isNaN(n22);
                    Double.isNaN(n23);
                    final double abs2 = Math.abs(n22 / n23 - 1.3333333333333333);
                    if (n18 < 0 || n20 < n21 || (n20 == n21 && abs2 < n19)) {
                        n19 = abs2;
                        n18 = l;
                        n17 = n20;
                    }
                }
                ++l;
            }
            int n24 = n18;
            if (n19 > 0.03) {
                final int n25 = 0;
                n24 = n18;
                for (int n26 = n25; n26 < list.size(); ++n26) {
                    if (array[n26] >= 0) {
                        final double n27 = ((aua)list.get(n26)).b();
                        final double n28 = ((aua)list.get(n26)).a();
                        Double.isNaN(n27);
                        Double.isNaN(n28);
                        final double abs3 = Math.abs(n27 / n28 - 1.3333333333333333);
                        final double n29 = Math.abs(((aua)list.get(n26)).b() - 3000);
                        if (abs3 + 0.03 < n19) {
                            final double n30 = Math.abs(((aua)list.get(n26)).b() - 3000);
                            if (n30 < 1050.0) {
                                n19 = abs3;
                            }
                            if (n30 < 1050.0) {
                                n17 = n29;
                            }
                            if (n30 < 1050.0) {
                                n24 = n26;
                            }
                        }
                        else if (Math.abs(abs3 - n19) < 0.03 && n29 < n17) {
                            n24 = n26;
                            n19 = abs3;
                            n17 = n29;
                        }
                    }
                }
            }
            final int n31 = array[n24];
            final aua aua = (aua)list.get(n24);
            aua.b();
            aua.a();
            eru.a = new ert((aua)list2.get(n31), (aua)list.get(n24));
        }
        return eru.a;
    }
}
