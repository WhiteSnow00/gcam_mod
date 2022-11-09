import android.os.RemoteException;
import java.util.Collection;
import android.content.Context;
import android.os.Looper;
import android.os.Handler;
import android.app.PendingIntent;
import android.os.Message;
import android.util.Log;
import android.os.DeadObjectException;
import java.util.Iterator;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsm implements jqu, jqv
{
    public final Queue a;
    public final jqo b;
    public final jrq c;
    public final jsd d;
    public final Map e;
    public final int f;
    public boolean g;
    public final List h;
    public int i;
    public final /* synthetic */ jsq j;
    private final Set k;
    private final jtp l;
    private jps m;
    
    public jsm(final jsq j, final jqt jqt) {
        this.j = j;
        this.a = new LinkedList();
        this.k = new HashSet();
        this.e = new HashMap();
        this.h = new ArrayList();
        this.m = null;
        this.i = 0;
        final jqo a = jqt.e.b.a(jqt.c, j.o.getLooper(), jqt.c().a(), jqt.f, this, this);
        final String d = jqt.d;
        if (d != null) {
            ((jum)a).k = d;
        }
        this.b = a;
        this.c = jqt.g;
        this.d = new jsd();
        this.f = jqt.i;
        if (a.o()) {
            this.l = new jtp(j.g, j.o, jqt.c().a());
            return;
        }
        this.l = null;
    }
    
    private final jpu p(final jpu[] array) {
        if (array != null) {
            final jpu[] p = this.b.p();
            final int n = 0;
            jpu[] array2;
            if ((array2 = p) == null) {
                array2 = new jpu[0];
            }
            final int length = array2.length;
            final yu yu = new yu(length);
            for (final jpu jpu : array2) {
                yu.put(jpu.a, jpu.a());
            }
            for (int j = n; j <= 0; ++j) {
                final jpu jpu2 = array[j];
                final Long n2 = yu.get(jpu2.a);
                if (n2 == null || n2 < jpu2.a()) {
                    return jpu2;
                }
            }
        }
        return null;
    }
    
    private final Status q(final jps jps) {
        return jsq.a(this.c, jps);
    }
    
    private final void r(final jps jps) {
        final Iterator iterator = this.k.iterator();
        if (iterator.hasNext()) {
            final lsp lsp = (lsp)iterator.next();
            if (jvu.m(jps, jps.a)) {
                this.b.r();
            }
            throw null;
        }
        this.k.clear();
    }
    
    private final void s(final Status status, final Exception ex, final boolean b) {
        jvu.d(this.j.o);
        int n = false ? 1 : 0;
        final boolean b2 = status == null;
        if (ex == null) {
            n = (true ? 1 : 0);
        }
        if ((b2 ? 1 : 0) != n) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final jrp jrp = (jrp)iterator.next();
                if (!b || jrp.c == 2) {
                    if (status != null) {
                        jrp.d(status);
                    }
                    else {
                        jrp.e(ex);
                    }
                    iterator.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
    
    private final void t(final jrp jrp) {
        jrp.g(this.d, this.o());
        try {
            jrp.f(this);
        }
        catch (final DeadObjectException ex) {
            this.a(1);
            this.b.k("DeadObjectException thrown while running ApiCallRunner.");
        }
        finally {
            final Throwable t;
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.b.getClass().getName()), t);
        }
    }
    
    private final boolean u(final jrp jrp) {
        if (!(jrp instanceof jrj)) {
            this.t(jrp);
            return true;
        }
        final jrj jrj = (jrj)jrp;
        final jpu p = this.p(jrj.b(this));
        if (p == null) {
            this.t(jrp);
            return true;
        }
        final String name = this.b.getClass().getName();
        final String a = p.a;
        final long a2 = p.a();
        final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(a).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(a);
        sb.append(", ");
        sb.append(a2);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (this.j.p && jrj.a(this)) {
            final jsn jsn = new jsn(this.c, p);
            final int index = this.h.indexOf(jsn);
            if (index >= 0) {
                final jsn jsn2 = this.h.get(index);
                this.j.o.removeMessages(15, (Object)jsn2);
                final Handler o = this.j.o;
                o.sendMessageDelayed(Message.obtain(o, 15, (Object)jsn2), 5000L);
            }
            else {
                this.h.add(jsn);
                final Handler o2 = this.j.o;
                o2.sendMessageDelayed(Message.obtain(o2, 15, (Object)jsn), 5000L);
                final Handler o3 = this.j.o;
                o3.sendMessageDelayed(Message.obtain(o3, 16, (Object)jsn), 120000L);
                final jps jps = new jps(2, null);
                if (!this.v(jps)) {
                    this.j.i(jps, this.f);
                }
            }
            return false;
        }
        jrj.e(new jri(p));
        return true;
    }
    
    private final boolean v(final jps jps) {
        synchronized (jsq.c) {
            final jsq j = this.j;
            if (j.m != null && j.n.contains(this.c)) {
                final jse m = this.j.m;
                final jru jru = new jru(jps, this.f);
                if (m.b.compareAndSet(null, jru)) {
                    m.c.post((Runnable)new jrv(m, jru));
                }
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final void a(final int n) {
        if (Looper.myLooper() == this.j.o.getLooper()) {
            this.k(n);
            return;
        }
        this.j.o.post((Runnable)new jsj(this, n));
    }
    
    @Override
    public final void b() {
        if (Looper.myLooper() == this.j.o.getLooper()) {
            this.h();
            return;
        }
        this.j.o.post((Runnable)new jsi(this));
    }
    
    public final void c() {
        jvu.d(this.j.o);
        this.m = null;
    }
    
    public final void d() {
        jvu.d(this.j.o);
        if (!this.b.l()) {
            if (!this.b.m()) {
                try {
                    final jsq j = this.j;
                    final jvj i = j.i;
                    final Context g = j.g;
                    final jqo b = this.b;
                    jvu.a(g);
                    jvu.a(b);
                    final boolean n = b.n();
                    final int n2 = 0;
                    final int n3 = 0;
                    int f = 0;
                    Label_0216: {
                        if (!n) {
                            f = n2;
                        }
                        else {
                            final int a = b.a();
                            final int b2 = i.b(a);
                            if (b2 == -1) {
                                while (true) {
                                    for (int k = 0; k < i.a.size(); ++k) {
                                        final int key = i.a.keyAt(k);
                                        if (key > a && i.a.get(key) == 0) {
                                            final int n4 = n3;
                                            f = n4;
                                            if (n4 == -1) {
                                                f = i.b.f(g, a);
                                            }
                                            i.a.put(a, f);
                                            break Label_0216;
                                        }
                                    }
                                    final int n4 = -1;
                                    continue;
                                }
                            }
                            f = b2;
                        }
                    }
                    if (f != 0) {
                        final jps jps = new jps(f, null);
                        final String name = this.b.getClass().getName();
                        final String value = String.valueOf(jps);
                        final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(value).length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(value);
                        Log.w("GoogleApiManager", sb.toString());
                        this.i(jps);
                        return;
                    }
                    final jsp f2 = new jsp(this.j, this.b, this.c);
                    if (this.b.o()) {
                        final jtp l = this.l;
                        jvu.a(l);
                        final kde e = l.e;
                        if (e != null) {
                            e.j();
                        }
                        l.d.h = System.identityHashCode(l);
                        final lio g2 = l.g;
                        final Context a2 = l.a;
                        final Looper looper = l.b.getLooper();
                        final juq d = l.d;
                        l.e = (kde)g2.a(a2, looper, d, d.g, l, l);
                        l.f = f2;
                        final Set c = l.c;
                        if (c != null && !c.isEmpty()) {
                            final jum jum = (jum)l.e;
                            jum.i(new juj(jum));
                        }
                        else {
                            l.b.post((Runnable)new jtn(l));
                        }
                    }
                    try {
                        this.b.i(f2);
                    }
                    catch (final SecurityException ex) {
                        this.j(new jps(10), ex);
                    }
                }
                catch (final IllegalStateException ex2) {
                    this.j(new jps(10), ex2);
                }
            }
        }
    }
    
    public final void e(final jrp jrp) {
        jvu.d(this.j.o);
        if (this.b.l()) {
            if (this.u(jrp)) {
                this.l();
                return;
            }
            this.a.add(jrp);
        }
        else {
            this.a.add(jrp);
            final jps m = this.m;
            if (m != null && m.b()) {
                this.i(this.m);
                return;
            }
            this.d();
        }
    }
    
    public final void f(final Status status) {
        jvu.d(this.j.o);
        this.s(status, null, false);
    }
    
    public final void g() {
        final ArrayList list = new ArrayList(this.a);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final jrp jrp = (jrp)list.get(i);
            if (!this.b.l()) {
                break;
            }
            if (this.u(jrp)) {
                this.a.remove(jrp);
            }
        }
    }
    
    public final void h() {
        this.c();
        this.r(jps.a);
        this.n();
        final Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            final jtj jtj = (jtj)iterator.next();
            final jti a = jtj.a;
            if (this.p(null) == null) {
                try {
                    jtj.a.b(this.b, new kej());
                    continue;
                }
                catch (final RemoteException ex) {
                    iterator.remove();
                    continue;
                }
                catch (final DeadObjectException ex2) {
                    this.a(3);
                    this.b.k("DeadObjectException thrown while calling register listener method.");
                }
                break;
            }
            iterator.remove();
        }
        this.g();
        this.l();
    }
    
    @Override
    public final void i(final jps jps) {
        this.j(jps, null);
    }
    
    public final void j(final jps m, final Exception ex) {
        jvu.d(this.j.o);
        final jtp l = this.l;
        if (l != null) {
            final kde e = l.e;
            if (e != null) {
                e.j();
            }
        }
        this.c();
        this.j.i.a();
        this.r(m);
        if (this.b instanceof jwj && m.c != 24) {
            final jsq j = this.j;
            j.f = true;
            final Handler o = j.o;
            o.sendMessageDelayed(o.obtainMessage(19), 300000L);
        }
        if (m.c == 4) {
            this.f(jsq.b);
            return;
        }
        if (this.a.isEmpty()) {
            this.m = m;
            return;
        }
        if (ex != null) {
            jvu.d(this.j.o);
            this.s(null, ex, false);
            return;
        }
        if (!this.j.p) {
            this.f(this.q(m));
            return;
        }
        this.s(this.q(m), null, true);
        if (this.a.isEmpty()) {
            return;
        }
        if (this.v(m)) {
            return;
        }
        if (!this.j.i(m, this.f)) {
            if (m.c == 18) {
                this.g = true;
            }
            if (this.g) {
                final Handler o2 = this.j.o;
                o2.sendMessageDelayed(Message.obtain(o2, 9, (Object)this.c), 5000L);
                return;
            }
            this.f(this.q(m));
        }
    }
    
    public final void k(final int n) {
        this.c();
        this.g = true;
        final jsd d = this.d;
        final String g = this.b.g();
        final StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (n == 1) {
            sb.append(" due to service disconnection.");
        }
        else if (n == 3) {
            sb.append(" due to dead object exception.");
        }
        if (g != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(g);
        }
        d.a(true, new Status(20, sb.toString()));
        final Handler o = this.j.o;
        o.sendMessageDelayed(Message.obtain(o, 9, (Object)this.c), 5000L);
        final Handler o2 = this.j.o;
        o2.sendMessageDelayed(Message.obtain(o2, 11, (Object)this.c), 120000L);
        this.j.i.a();
        final Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            final Runnable c = ((jtj)iterator.next()).c;
        }
    }
    
    public final void l() {
        this.j.o.removeMessages(12, (Object)this.c);
        final Handler o = this.j.o;
        o.sendMessageDelayed(o.obtainMessage(12, (Object)this.c), this.j.e);
    }
    
    public final void m() {
        jvu.d(this.j.o);
        this.f(jsq.a);
        final jsd d = this.d;
        final Status a = jsq.a;
        int i = 0;
        d.a(false, a);
        for (jtb[] array = (jtb[])this.e.keySet().toArray(new jtb[0]); i < array.length; ++i) {
            this.e(new jro(array[i], new kej()));
        }
        this.r(new jps(4));
        if (this.b.l()) {
            this.b.q(new jsl(this));
        }
    }
    
    public final void n() {
        if (this.g) {
            this.j.o.removeMessages(11, (Object)this.c);
            this.j.o.removeMessages(9, (Object)this.c);
            this.g = false;
        }
    }
    
    public final boolean o() {
        return this.b.o();
    }
}
