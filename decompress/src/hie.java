import java.util.Date;
import java.io.FileInputStream;
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import j$.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.HashMap;
import j$.util.DesugarTimeZone;
import java.util.Locale;
import java.util.Map;
import android.content.Context;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hie
{
    private static final SimpleDateFormat h;
    public final lkj a;
    public final long b;
    public final drk c;
    public final hip d;
    public final Context e;
    public final String f;
    public final krr g;
    private String i;
    private final Map j;
    
    static {
        final SimpleDateFormat h2 = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        h2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        h = h2;
    }
    
    private hie(final lkj a, final long b, drk a2, final String f, final krr krr, final hip d, final Context e) {
        this.i = null;
        this.j = new HashMap();
        this.a = a;
        this.b = b;
        if (a2 == null) {
            a2 = drk.a;
        }
        this.c = a2;
        this.f = f;
        this.g = krr.a("GcaMediaGroup");
        this.d = d;
        this.e = e;
    }
    
    public static hie b(final llc llc, final long n, final drk drk, final String s, final krr krr, final cxl cxl, final llu llu, final hip hip) {
        lkj lkj;
        if (hip == hip.b) {
            lkj = llc.a(llu, njb.c(s), n);
        }
        else {
            final String c = njb.c(s);
            final lld lld = (lld)llc;
            lkj = lld.a(lld.c, c, n);
        }
        final cxo a = cxr.a;
        cxl.e();
        return new hie(lkj, n, drk, s, krr, hip, llu.a);
    }
    
    private final hia j(final String s, final boolean b) {
        monitorenter(this);
        Label_0035: {
            if (!b) {
                break Label_0035;
            }
            try {
                njo.r(Collection$_EL.stream((Collection)this.j.keySet()).noneMatch((Predicate)bne.g), "Already created a primary item: %s", this.j);
                final lkj a = this.a;
                final String b2 = lou.b(s);
                final boolean d = njb.d(b2);
                boolean b3 = false;
                if (!d && llx.a.c(b2)) {
                    b3 = true;
                }
                llx llx;
                if (b3) {
                    llx = llx.a;
                }
                else {
                    llx = llx.d;
                }
                String s2;
                if (b3) {
                    s2 = ((lkl)a).a.n;
                }
                else {
                    s2 = ((lkl)a).a.m;
                }
                final hia hia = new hia(this, ((lkl)a).d(1, llx, s2, s, System.currentTimeMillis()), b);
                this.j.put(hia, hid.c);
                return hia;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    private final void k() {
        monitorenter(this);
        try {
            final krr g = this.g;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 12);
            sb.append("#tryPublish ");
            sb.append(value);
            g.f(sb.toString());
            final Iterator iterator = this.j.keySet().iterator();
            hia hia = null;
            hia hia2 = null;
            while (iterator.hasNext()) {
                final hia hia3 = (hia)iterator.next();
                if (hia3.b) {
                    njo.u(hia2 == null, "Found multiple primaries (%s and %s) in %s: %s", hia2, hia3, this, this.j);
                    hia2 = hia3;
                }
                else {
                    if (hia != null || this.j.get(hia3) != hid.a) {
                        continue;
                    }
                    hia = hia3;
                }
            }
            final Map j = this.j;
            hia2.getClass();
            Label_0357: {
                if (j.get(hia2) != hid.a) {
                    if (hia != null) {
                        try {
                            final FileInputStream d = hia.a.d();
                            try {
                                lpy.e(d, hia2.a);
                                hia2.c();
                                hia.b();
                                d.close();
                            }
                            finally {
                                try {
                                    d.close();
                                }
                                finally {
                                    final Throwable t;
                                    final Throwable t2;
                                    t.addSuppressed(t2);
                                }
                            }
                        }
                        catch (final IOException ex) {
                            this.g.i(String.format(Locale.ROOT, "Error publishing %s: %s", this, this.j), ex);
                            this.a.a();
                            break Label_0357;
                        }
                    }
                    this.g.h(String.format(Locale.ROOT, "No published files found for %s: %s", this, this.j));
                    this.a.a();
                    monitorexit(this);
                    return;
                }
            }
            for (final hia hia4 : this.j.keySet()) {
                final hid hid = this.j.get(hia4);
                hid.getClass();
                switch (hid.ordinal()) {
                    default: {
                        continue;
                    }
                    case 1:
                    case 2: {
                        hia4.a.f();
                        continue;
                    }
                    case 0: {
                        hia4.a.g();
                        continue;
                    }
                }
            }
            final krr g2 = this.g;
            final String value2 = String.valueOf(this.j);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 25);
            sb2.append("State before publishing: ");
            sb2.append(value2);
            g2.f(sb2.toString());
            this.a.b();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final boolean l() {
        synchronized (this) {
            final boolean b = this.i == null;
            if (b) {
                this.i = "Ignored";
            }
            return b;
        }
    }
    
    public final hia a(final String s) {
        return this.j(s, true);
    }
    
    public final lkb c() {
        synchronized (this) {
            return ((hia)Collection$_EL.stream((Collection)this.j.keySet()).filter((Predicate)bne.g).findFirst().get()).a;
        }
    }
    
    public final void d() {
        monitorenter(this);
        try {
            if (this.l()) {
                final Iterator iterator = this.j.keySet().iterator();
                while (iterator.hasNext()) {
                    ((hia)iterator.next()).a.f();
                }
                this.a.a();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e(final lki lki) {
        final lkl lkl = (lkl)this.a;
        njo.p(lkl.d ^ true, "Cannot modify the listener list after publish() or abandon()");
        lki.getClass();
        lkl.c.g(lki);
    }
    
    final void f(final hia hia, final hid hid) {
        synchronized (this) {
            njo.s(this.j.containsKey(hia), "Trying to mark as published %s not contained in %s", hia, this.j);
            this.j.put(hia, hid);
        }
    }
    
    public final void g() {
        synchronized (this) {
            if (this.l()) {
                this.k();
            }
        }
    }
    
    public final hia h() {
        return this.j("jpg", false);
    }
    
    public final hia i() {
        synchronized (this) {
            final lkj a = this.a;
            final hia hia = new hia(this, ((lkl)a).d(3, llx.e, ((lkl)a).a.l, "mp4", System.currentTimeMillis()), false);
            this.j.put(hia, hid.c);
            return hia;
        }
    }
    
    @Override
    public final String toString() {
        String concat;
        if (njb.d(this.f)) {
            concat = "";
        }
        else {
            final String value = String.valueOf(this.f);
            if (value.length() != 0) {
                concat = "-".concat(value);
            }
            else {
                concat = new String("-");
            }
        }
        final String format = hie.h.format(new Date(this.b));
        final String value2 = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 7 + String.valueOf(concat).length() + String.valueOf(value2).length());
        sb.append("PXL_");
        sb.append(format);
        sb.append(concat);
        sb.append(" (");
        sb.append(value2);
        sb.append(")");
        return sb.toString();
    }
}
