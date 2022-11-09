import java.util.concurrent.atomic.AtomicReference;
import java.util.Collection;
import java.util.Locale;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class av implements oxe
{
    final /* synthetic */ String[] a;
    final /* synthetic */ aq b;
    
    public av(final String[] a, final aq b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final oxd oxd) {
        final al al = new al(this.a, oxd);
        final an c = this.b.c;
        final String[] a = al.a;
        final HashSet set = new HashSet();
        final int length = a.length;
        final int n = 0;
        for (final String s : a) {
            final String lowerCase = s.toLowerCase(Locale.US);
            if (c.c.containsKey(lowerCase)) {
                set.addAll((Collection)c.c.get(lowerCase));
            }
            else {
                set.add(s);
            }
        }
        final String[] array = (String[])set.toArray(new String[set.size()]);
        final int length2 = array.length;
        final int[] array2 = new int[length2];
        for (int j = 0; j < length2; ++j) {
            final Integer n2 = c.a.get(array[j].toLowerCase(Locale.US));
            if (n2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(array[j]);
                throw new IllegalArgumentException(sb.toString());
            }
            array2[j] = n2;
        }
        final am am = new am(al, array2, array);
        Object o = c.h;
        monitorenter(o);
        try {
            final am am2 = (am)c.h.f(al, am);
            monitorexit(o);
            if (am2 == null) {
                o = c.g;
                monitorenter(o);
                boolean b = false;
                int n3 = n;
            Label_0371_Outer:
                while (true) {
                    while (true) {
                        if (n3 < length2) {
                            final int n4 = array2[n3];
                            while (true) {
                                try {
                                    final long[] a2 = ((ak)o).a;
                                    final long n5 = a2[n4];
                                    a2[n4] = 1L + n5;
                                    if (n5 == 0L) {
                                        ((ak)o).d = true;
                                        b = true;
                                    }
                                    ++n3;
                                    continue Label_0371_Outer;
                                    monitorexit(o);
                                    iftrue(Label_0395:)(!b);
                                    c.a();
                                    break;
                                    monitorexit(o);
                                    throw oxd;
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                            break;
                        }
                        continue;
                    }
                }
            }
            Label_0395: {
                oyj.i((AtomicReference)oxd, new oxn(new au(this, al)));
            }
            oxd.c(ay.a);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
