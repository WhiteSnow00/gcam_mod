import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class mts implements odo
{
    public List a;
    final /* synthetic */ mtv b;
    
    public mts(final mtv b) {
        this.b = b;
    }
    
    @Override
    public final oey a() {
        final mtv b = this.b;
        final nhl e = b.e;
        final String value = String.valueOf(b.a);
        String concat;
        if (value.length() != 0) {
            concat = "Initialize ".concat(value);
        }
        else {
            concat = new String("Initialize ");
        }
        final nho b2 = e.b(concat);
        try {
            Object o = this.b.d;
            synchronized (o) {
                if (this.a == null) {
                    final mtv b3 = this.b;
                    this.a = b3.f;
                    b3.f = Collections.emptyList();
                }
                monitorexit(o);
                o = new ArrayList<oey>(this.a.size());
                final mtu mtu = new mtu(this.b);
                for (final odp odp : this.a) {
                    try {
                        ((List<oey>)o).add(odp.a(mtu));
                        continue;
                    }
                    catch (final Exception ex) {
                        ((List<oey>)o).add(ofi.m(ex));
                    }
                    break;
                }
                final oer i = ofi.i((Iterable)o);
                o = new mtr(this);
                o = i.a((Callable)o, odx.a);
                b2.a((oey)o);
                b2.close();
                return (oey)o;
            }
        }
        finally {
            Label_0235: {
                try {
                    b2.close();
                    break Label_0235;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
            while (true) {}
        }
    }
}
