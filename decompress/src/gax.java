import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gax implements gdf
{
    public final hhy a;
    public final fvn b;
    public final hdz c;
    public kra d;
    final /* synthetic */ gay e;
    private final gbp f;
    private final List g;
    
    public gax(final gay e, final gbp f, final hhy a, final fvn b, final hdz c) {
        this.e = e;
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.g = new ArrayList();
    }
    
    private final List b(final List list) {
        final int size = list.size();
        final int size2 = this.g.size();
        int i = 0;
        njo.d(size == size2);
        final ArrayList list2 = new ArrayList();
        while (i < list.size()) {
            list2.add(new gaa(new lgc(list.get(i)), this.g.get(i).k()));
            ++i;
        }
        return list2;
    }
    
    private final void c() {
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            ((lju)iterator.next()).close();
        }
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        this.d = kra.b((int)this.e.c.c().aQ());
        this.g.add(new gaa(lju, oey));
    }
    
    @Override
    public final void close() {
        if (this.g.size() != 1) {
            final krr a = this.e.a;
            final int size = this.g.size();
            final StringBuilder sb = new StringBuilder(78);
            sb.append("Received ");
            sb.append(size);
            sb.append(" images, which is different than  1. Abort shot.");
            a.h(sb.toString());
            this.c();
            return;
        }
        this.d.getClass();
        try {
            final oey k = this.g.get(0).k();
            k.getClass();
            this.a.k().l((lji)k.get(1000L, TimeUnit.MILLISECONDS), false);
            final ArrayList list = new ArrayList();
            for (final gaa gaa : this.g) {
                if (gaa.m()) {
                    list.add(new lgb(gaa, 3));
                }
                else {
                    final krr a2 = this.e.a;
                    final fzy b = fzz.b;
                    final Object l = gaa.l(b);
                    String.valueOf(String.valueOf(b)).length();
                    l.getClass();
                    final String value = String.valueOf(l);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 27);
                    sb2.append("Ignoring and closing image ");
                    sb2.append(value);
                    a2.h(sb2.toString());
                    gaa.close();
                }
            }
            final List b2 = this.b(list);
            final List b3 = this.b(list);
            final List b4 = this.b(list);
            final gbp f = this.f;
            final kra d = this.d;
            d.getClass();
            final ArrayList list2 = new ArrayList();
            final Iterator iterator2 = b2.iterator();
            while (iterator2.hasNext()) {
                list2.add(((lju)iterator2.next()).d());
            }
            Label_0733: {
                if (b2.size() == 1) {
                    ((gaa)b2.get(0)).close();
                    final oey oey = ofi.n(0);
                    break Label_0733;
                }
                final kjk kjk = new kjk();
                final ArrayList list3 = new ArrayList();
                final Iterator iterator3 = b2.iterator();
                while (iterator3.hasNext()) {
                    list3.add(new lgc((lju)iterator3.next()));
                }
                final bss bss = new bss();
                bss.addAll(list3);
                kjk.c(bss);
                final gyh d2 = gsn.d();
                try {
                    final ofn a3 = d2.a;
                    for (int i = 0; i < b2.size(); ++i) {
                        final lju lju = (lju)list3.get(i);
                        final oey j = b2.get(i).k();
                        final gya a4 = gyb.a(lju);
                        a4.c = d;
                        a4.d = j;
                        final gyb a5 = a4.a();
                        final gyb b5 = d2.b;
                        if (b5 != null && b5.a.d() >= a5.a.d()) {
                            a5.a.close();
                        }
                        else {
                            final gyb b6 = d2.b;
                            if (b6 != null) {
                                b6.a.close();
                            }
                            d2.b = a5;
                        }
                    }
                    d2.close();
                    final oey oey = odg.h(a3, new gbm(b2), odx.a);
                    ofi.w(oey, new gbn(kjk), odx.a);
                    final oey h = odg.h(oey, new gbr((gbs)f, list2), odx.a);
                    njo.o(this.d != null);
                    final oey h2 = odg.h(h, new gar(this, b3), odx.a);
                    this.d.getClass();
                    ofi.w(h2, new gaw(this, 4), odx.a);
                    final oey m = odg.i(odg.i(odg.i(odg.h(h, new gas(this, b4, hjc.a((int)this.e.g.aQ())), odx.a), new emt(3), odx.a), new gat(this, 1), odx.a), new gat(this), odx.a);
                    ofi.w(m, new gaw(this, 1), odx.a);
                    ofi.w(m, new gaw(this), odx.a);
                }
                finally {
                    try {
                        d2.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        catch (final TimeoutException ex) {
            this.e.a.i("Timeout retrieving image metadata, aborting the shot", ex);
            this.c();
        }
        catch (final InterruptedException ex2) {
            this.e.a.i("Interrupted before image could be saved", ex2);
            this.c();
            Thread.currentThread().interrupt();
        }
        catch (final ExecutionException ex3) {
            this.e.a.i("Unable to save image.  Camera likely shutdown.", ex3);
            this.c();
        }
    }
}
