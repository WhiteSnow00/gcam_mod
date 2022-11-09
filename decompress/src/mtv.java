import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mtv
{
    public final String a;
    public final mtw b;
    public final nhe c;
    public final Object d;
    public final nhl e;
    public List f;
    private final oey g;
    private final oeg h;
    private final nhe i;
    
    public mtv(final mtw b, final oey g, final boolean b2, final boolean b3) {
        this.i = new nhe(new mts(this), odx.a);
        this.d = new Object();
        this.f = new ArrayList();
        this.b = b;
        this.g = g;
        this.a = ((mtm)b).a;
        this.c = new nhe(new mtf((mtm)b, 1), odx.a);
        if (b3) {
            this.e = nhl.d();
        }
        else {
            this.e = nhl.c();
        }
        this.c(new mto(this, 1));
        oeg a;
        if (b2) {
            a = oeg.a();
        }
        else {
            a = null;
        }
        this.h = a;
    }
    
    public final oey a() {
        this.e.a();
        Label_0118: {
            if (this.i.d.isDone()) {
                final oey oey = ((mtm)this.b).a();
                break Label_0118;
            }
            final nhl e = this.e;
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "Get ".concat(value);
            }
            else {
                concat = new String("Get ");
            }
            final nho b = e.b(concat);
            try {
                final oey oey = odg.i(this.i.c(), nhu.b(new mto(this)), odx.a);
                b.a(oey);
                b.close();
                ofi.o(this.g);
                return ofi.o(oey);
            }
            finally {
                try {
                    b.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
    }
    
    public final oey b(final nir nir, final Executor executor) {
        final odp b = nhu.b(new mtq(nir));
        final nhl e = this.e;
        final String value = String.valueOf(this.a);
        String concat;
        if (value.length() != 0) {
            concat = "Update ".concat(value);
        }
        else {
            concat = new String("Update ");
        }
        final nho b2 = e.b(concat);
        try {
            final oey c = this.i.c();
            final oeg h = this.h;
            oey oey;
            if (h == null) {
                oey = odg.i(c, nhu.b(new mtp(this, b, executor, 1)), odx.a);
            }
            else {
                oey = h.b(nhu.a(new mtn(this, c, b, executor)), odx.a);
            }
            ofi.o(this.g);
            b2.a(oey);
            b2.close();
            return oey;
        }
        finally {
            try {
                b2.close();
            }
            finally {
                final Throwable t;
                ((Throwable)nir).addSuppressed(t);
            }
        }
    }
    
    public final void c(final odp odp) {
        synchronized (this.d) {
            this.f.add(odp);
        }
    }
}
