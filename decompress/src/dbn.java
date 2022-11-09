import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbn
{
    final /* synthetic */ dbr a;
    
    public dbn(final dbr a) {
        this.a = a;
    }
    
    public final void a(final int n, final double n2, final double n3) {
        Object o = this.a;
        monitorenter(o);
        try {
            for (final dbq dbq : this.a.b) {
                final double n4 = n2 / n3;
                final Map b = dbq.b;
                final Integer value = n;
                dbo dbo;
                if ((dbo = b.get(value)) == null) {
                    dbo = new dbo();
                    dbq.b.put(value, dbo);
                }
                if (n4 < 1.5) {
                    ++dbo.a;
                }
                else if (n4 < 2.5) {
                    ++dbo.b;
                }
                else if (n4 < 5.0) {
                    ++dbo.c;
                }
                else {
                    ++dbo.d;
                }
            }
            monitorexit(o);
            final nsa nsa = (nsa)dbr.a.c().E(701);
            o = this.a.d;
            String s = null;
            switch (n) {
                default: {
                    s = String.format("rel pipeline latency = %.2f > %.2f", n2, n3);
                    break;
                }
                case 5: {
                    s = String.format("abs pipeline latency = %.2f ms > %.2f ms", n2, n3);
                    break;
                }
                case 4: {
                    s = String.format("rel \u0394(surface sensor timestamp) = %.2f > %.2f", n2, n3);
                    break;
                }
                case 3: {
                    s = String.format("abs \u0394(surface sensor timestamp) = %.2f ms > %.2f ms", n2, n3);
                    break;
                }
                case 2: {
                    s = String.format("result sensor delay = %.2f > %.2f", n2, n3);
                    break;
                }
                case 1: {
                    s = String.format("rel \u0394(result sensor timestamp) = %.2f > %.2f", n2, n3);
                    break;
                }
                case 0: {
                    s = String.format("abs \u0394(result sensor timestamp) = %.2f ms > %.2f ms", n2, n3);
                    break;
                }
            }
            nsa.x("%s > %s", o, s);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
