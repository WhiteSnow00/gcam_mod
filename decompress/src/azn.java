import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class azn
{
    private final azm a;
    private final Map b;
    
    public azn() {
        this.a = new azm(null);
        this.b = new HashMap();
    }
    
    private static void d(final azm azm) {
        final azm d = azm.d;
        d.c = azm.c;
        azm.c.d = d;
    }
    
    private static void e(final azm azm) {
        azm.c.d = azm;
        azm.d.c = azm;
    }
    
    public final Object a(final azu azu) {
        final azm azm = this.b.get(azu);
        azm azm3;
        if (azm == null) {
            final azm azm2 = new azm(azu);
            this.b.put(azu, azm2);
            azm3 = azm2;
        }
        else {
            azu.a();
            azm3 = azm;
        }
        d(azm3);
        final azm a = this.a;
        azm3.d = a;
        azm3.c = a.c;
        e(azm3);
        return azm3.b();
    }
    
    public final Object b() {
        for (azm azm = this.a.d; !azm.equals(this.a); azm = azm.d) {
            final Object b = azm.b();
            if (b != null) {
                return b;
            }
            d(azm);
            this.b.remove(azm.a);
            ((azu)azm.a).a();
        }
        return null;
    }
    
    public final void c(final azu azu, final Object o) {
        final azm azm = this.b.get(azu);
        azm azm3;
        if (azm == null) {
            final azm azm2 = new azm(azu);
            d(azm2);
            final azm a = this.a;
            azm2.d = a.d;
            azm2.c = a;
            e(azm2);
            this.b.put(azu, azm2);
            azm3 = azm2;
        }
        else {
            azu.a();
            azm3 = azm;
        }
        if (azm3.b == null) {
            azm3.b = new ArrayList();
        }
        azm3.b.add(o);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        azm azm = this.a.c;
        boolean b = false;
        while (!azm.equals(this.a)) {
            sb.append('{');
            sb.append(azm.a);
            sb.append(':');
            sb.append(azm.a());
            sb.append("}, ");
            azm = azm.c;
            b = true;
        }
        if (b) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
