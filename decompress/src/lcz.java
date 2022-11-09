import android.view.SurfaceHolder;
import android.hardware.camera2.params.OutputConfiguration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class lcz implements lcc
{
    protected final kwr a;
    protected final krr b;
    protected final kse c;
    protected final int d;
    private final ldy e;
    private final ldj f;
    
    protected lcz(final int d, final kwr a, final ldy e, final ldj f, final krr krr, final kse c) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.c = c;
        this.b = krr.a("SessionOpener");
    }
    
    private static final void c(final lch lch, final Executor executor) {
        lch.c.d(new ifv(lch.a.a.a(new lcw(lch), executor), 3), odx.a);
    }
    
    protected abstract void a(final ljg p0, final lcd p1, final List p2, final Handler p3);
    
    public final void b(final ljg ljg, final lcd lcd, final List list, final List list2, final kjk kjk, final Handler handler, final Executor executor) {
        final kse c = this.c;
        final String value = String.valueOf(lcd);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
        sb.append("Create-");
        sb.append(value);
        c.f(sb.toString());
        try {
            final ArrayList list3 = new ArrayList(list.size());
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final Surface c2 = ((lci)iterator.next()).c();
                c2.getClass();
                list3.add(c2);
            }
            this.f.d(lcd);
            Object o = this.f;
            synchronized (o) {
                nov.C(((ldj)o).d != null, "setActiveCaptureSession must be invoked first.", new Object[0]);
                if (lcd != ((ldj)o).d) {
                    monitorexit(o);
                }
                else {
                    final boolean addAll = ((ldj)o).a.addAll(list3);
                    monitorexit(o);
                    if (addAll) {
                        ((ldj)o).c();
                    }
                }
                final nnn e = nns.e();
                e.h(list2);
                e.h(list);
                final nns s = nns.s(aab.a, e.f());
                o = this.b;
                final String value2 = String.valueOf(lcd);
                final String value3 = String.valueOf(s);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 14 + String.valueOf(value3).length());
                sb2.append("Create ");
                sb2.append(value2);
                sb2.append(" using ");
                sb2.append(value3);
                ((krr)o).f(sb2.toString());
                this.a(ljg, lcd, s, handler);
                if (!list2.isEmpty()) {
                    final ArrayList list4 = new ArrayList(list2.size());
                    final ArrayList list5 = new ArrayList(list2.size());
                    for (final lcf lcf : list2) {
                        c(lcf, executor);
                        list4.add(lcf.c);
                        list5.add(lcf.a());
                    }
                    ofi.w(ofi.j(list4), new lcy(this, kjk, lcd, list2, list5), executor);
                }
                this.c.g();
            }
        }
        finally {
            this.c.g();
            while (true) {}
        }
    }
    
    @Override
    public final void d(final ljg ljg, final lcd lcd, final kjk kjk, final Handler handler) {
        final kjh kjh = new kjh(handler);
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final ldy e = this.e;
        final noi b = e.b;
        final noi c = e.c;
        final boolean empty = b.isEmpty();
        int i = 0;
        njo.e(!empty || !c.isEmpty(), "Cannot create a capture session without streams.");
        if (this.a == kwr.b) {
            njo.e(b.isEmpty(), "HIGH_SPEED Sessions cannot use buffered streams.");
            njo.e(c.isEmpty() ^ true, "HIGH_SPEED Sessions must have streams.");
            njo.e(c.size() <= 2, "HIGH_SPEED Sessions may only have 1 or 2 streams.");
        }
        for (final ldk ldk : b) {
            final Surface g = ldk.g();
            g.getClass();
            list.add(lcj.b(ldk, g));
        }
        for (final ldm ldm : c) {
            final Surface g2 = ldm.g();
            if (g2 != null) {
                if (g2.isValid()) {
                    list.add(lcj.b(ldm, g2));
                    continue;
                }
                this.b.h(ksc.c("%s for %s was not valid, this may prevent the viewfinder from starting!", g2, ldm));
            }
            if (this.a != kwr.b) {
                final int d = this.d;
                if (d != 5 && d != 3) {
                    final kxd h = ldm.h();
                    final kxd b2 = kxd.b;
                    final Object o = null;
                    OutputConfiguration outputConfiguration;
                    if (h == b2) {
                        outputConfiguration = new OutputConfiguration(ldm.b().c(), (Class)SurfaceTexture.class);
                        lck.b(ldm, outputConfiguration);
                    }
                    else if (ldm.h() == kxd.c) {
                        outputConfiguration = new OutputConfiguration(ldm.b().c(), (Class)SurfaceHolder.class);
                        lck.b(ldm, outputConfiguration);
                    }
                    else {
                        outputConfiguration = null;
                    }
                    Object o2;
                    if (outputConfiguration != null) {
                        o2 = new lcf(ldm, outputConfiguration);
                    }
                    else {
                        o2 = o;
                    }
                    if (o2 != null) {
                        list2.add(o2);
                        continue;
                    }
                }
            }
            list3.add(new lcg(ldm));
        }
        if (list3.isEmpty()) {
            this.b(ljg, lcd, nns.j(list), list2, kjk, handler, kjh);
            return;
        }
        final ArrayList list4 = new ArrayList(list3.size());
        while (i < list3.size()) {
            final lcg lcg = (lcg)list3.get(i);
            c(lcg, kjh);
            list4.add((Object)lcg.c);
            ++i;
        }
        final krr b3 = this.b;
        final String value = String.valueOf(lcd);
        final String value2 = String.valueOf(list3);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31 + String.valueOf(value2).length());
        sb.append("Awaiting required outputs for ");
        sb.append(value);
        sb.append(" ");
        sb.append(value2);
        b3.f(sb.toString());
        ofi.w(ofi.j(list4), new lcx(this, kjk, lcd, list3, ljg, list, list2, handler, kjh), kjh);
    }
}
