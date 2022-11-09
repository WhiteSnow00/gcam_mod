import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Iterator;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.content.ComponentCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import android.util.Log;
import android.os.Message;
import java.util.Collection;
import java.util.concurrent.Executor;
import android.os.SystemClock;
import android.os.HandlerThread;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;
import android.os.Looper;
import android.os.Handler;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsq implements Handler$Callback
{
    public static final Status a;
    public static final Status b;
    public static final Object c;
    public static jsq d;
    public long e;
    public boolean f;
    public final Context g;
    public final jpw h;
    public final jvj i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public final Map l;
    public jse m;
    public final Set n;
    public final Handler o;
    public volatile boolean p;
    private jvz q;
    private jwa r;
    private final Set s;
    
    static {
        a = new Status(4, "Sign-out occurred while this API call was in progress.");
        b = new Status(4, "The user must be signed in to make this API call.");
        c = new Object();
    }
    
    private jsq(final Context g, final Looper looper, final jpw h) {
        this.e = 10000L;
        this.f = false;
        this.j = new AtomicInteger(1);
        this.k = new AtomicInteger(0);
        this.l = (Map)new ConcurrentHashMap(5, 0.75f, 1);
        this.m = null;
        this.n = new yw();
        this.s = new yw();
        this.p = true;
        this.g = g;
        final kax o = new kax(looper, (Handler$Callback)this);
        this.o = o;
        this.h = h;
        this.i = new jvj(h);
        final PackageManager packageManager = g.getPackageManager();
        if (jwn.d == null) {
            jwn.d = packageManager.hasSystemFeature("android.hardware.type.automotive");
        }
        if (jwn.d) {
            this.p = false;
        }
        o.sendMessage(o.obtainMessage(6));
    }
    
    public static Status a(final jrq jrq, final jps jps) {
        final String a = jrq.a.a;
        final String value = String.valueOf(jps);
        final StringBuilder sb = new StringBuilder(a.length() + 63 + String.valueOf(value).length());
        sb.append("API: ");
        sb.append(a);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(value);
        return new Status(1, 17, sb.toString(), jps.d, jps);
    }
    
    public static jsq c(final Context context) {
        synchronized (jsq.c) {
            if (jsq.d == null) {
                final HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                jsq.d = new jsq(context.getApplicationContext(), handlerThread.getLooper(), jpw.a);
            }
            return jsq.d;
        }
    }
    
    private final jsm j(final jqt jqt) {
        final jrq g = jqt.g;
        final jsm jsm = this.l.get(g);
        jsm jsm2;
        if (jsm == null) {
            jsm2 = new jsm(this, jqt);
            this.l.put(g, jsm2);
        }
        else {
            jsm2 = jsm;
        }
        if (jsm2.o()) {
            this.s.add(g);
        }
        jsm2.d();
        return jsm2;
    }
    
    private final jwa k() {
        if (this.r == null) {
            this.r = new jwi(this.g, jwb.a);
        }
        return this.r;
    }
    
    private final void l() {
        final jvz q = this.q;
        if (q != null) {
            if (q.a > 0 || this.h()) {
                this.k().a(q);
            }
            this.q = null;
        }
    }
    
    final jsm b(final jrq jrq) {
        return this.l.get(jrq);
    }
    
    public final void d(final kej kej, final int n, final jqt jqt) {
        if (n != 0) {
            final jrq g = jqt.g;
            final boolean h = this.h();
            kdy kdy = null;
            Label_0205: {
                if (h) {
                    final jvy a = jvx.a().a;
                    boolean b = true;
                    if (a != null) {
                        if (!a.b) {
                            break Label_0205;
                        }
                        b = a.c;
                        final jsm b2 = this.b(g);
                        if (b2 != null) {
                            final jqo b3 = b2.b;
                            if (!(b3 instanceof jum)) {
                                break Label_0205;
                            }
                            final jum jum = (jum)b3;
                            if (jum.C() && !jum.m()) {
                                final jut b4 = jte.b(b2, jum, n);
                                if (b4 == null) {
                                    break Label_0205;
                                }
                                ++b2.i;
                                b = b4.c;
                            }
                        }
                    }
                    long currentTimeMillis;
                    if (b) {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    else {
                        currentTimeMillis = 0L;
                    }
                    long elapsedRealtime;
                    if (b) {
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    else {
                        elapsedRealtime = 0L;
                    }
                    kdy = new jte(this, n, g, currentTimeMillis, elapsedRealtime);
                }
            }
            if (kdy != null) {
                final kem a2 = kej.a;
                final Handler o = this.o;
                o.getClass();
                a2.g(new jsg(o), kdy);
            }
        }
    }
    
    public final void e(final jps jps, final int n) {
        if (!this.i(jps, n)) {
            final Handler o = this.o;
            o.sendMessage(o.obtainMessage(5, n, 0, (Object)jps));
        }
    }
    
    public final void f() {
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(3));
    }
    
    public final void g(final jse m) {
        synchronized (jsq.c) {
            if (this.m != m) {
                this.m = m;
                this.n.clear();
            }
            this.n.addAll(m.e);
        }
    }
    
    final boolean h() {
        if (this.f) {
            return false;
        }
        final jvy a = jvx.a().a;
        if (a != null && !a.b) {
            return false;
        }
        final int b = this.i.b(203400000);
        return b == -1 || b == 0;
    }
    
    public final boolean handleMessage(Message message) {
        final int what = message.what;
        long e = 300000L;
        final jsm jsm = null;
        int i = 0;
        Label_1850: {
            switch (what) {
                default: {
                    final int what2 = message.what;
                    final StringBuilder sb = new StringBuilder(31);
                    sb.append("Unknown message id: ");
                    sb.append(what2);
                    Log.w("GoogleApiManager", sb.toString());
                    return false;
                }
                case 19: {
                    this.f = false;
                    break;
                }
                case 18: {
                    final jtf jtf = (jtf)message.obj;
                    if (jtf.c == 0L) {
                        this.k().a(new jvz(jtf.b, Arrays.asList(jtf.a)));
                        break;
                    }
                    final jvz q = this.q;
                    if (q != null) {
                        final List b = q.b;
                        if (q.a == jtf.b && (b == null || b.size() < jtf.d)) {
                            final jvz q2 = this.q;
                            final jvq a = jtf.a;
                            if (q2.b == null) {
                                q2.b = new ArrayList();
                            }
                            q2.b.add(a);
                        }
                        else {
                            this.o.removeMessages(17);
                            this.l();
                        }
                    }
                    if (this.q == null) {
                        final ArrayList<jvq> list = new ArrayList<jvq>();
                        list.add(jtf.a);
                        this.q = new jvz(jtf.b, list);
                        final Handler o = this.o;
                        o.sendMessageDelayed(o.obtainMessage(17), jtf.c);
                        break;
                    }
                    break;
                }
                case 17: {
                    this.l();
                    break;
                }
                case 16: {
                    final jsn jsn = (jsn)message.obj;
                    if (!this.l.containsKey(jsn.a)) {
                        break;
                    }
                    final jsm jsm2 = this.l.get(jsn.a);
                    if (jsm2.h.remove(jsn)) {
                        jsm2.j.o.removeMessages(15, (Object)jsn);
                        jsm2.j.o.removeMessages(16, (Object)jsn);
                        final jpu b2 = jsn.b;
                        final ArrayList list2 = new ArrayList<Object>(jsm2.a.size());
                        for (final jrp jrp : jsm2.a) {
                            if (jrp instanceof jrj) {
                                final jpu[] b3 = ((jrj)jrp).b(jsm2);
                                if (b3 == null || !jwn.f(b3, b2)) {
                                    continue;
                                }
                                list2.add((jrj)jrp);
                            }
                        }
                        while (i < list2.size()) {
                            final jrp jrp2 = list2.get(i);
                            jsm2.a.remove(jrp2);
                            jrp2.e(new jri(b2));
                            ++i;
                        }
                        break;
                    }
                    break;
                }
                case 15: {
                    final jsn jsn2 = (jsn)message.obj;
                    if (!this.l.containsKey(jsn2.a)) {
                        break;
                    }
                    final jsm jsm3 = this.l.get(jsn2.a);
                    if (!jsm3.h.contains(jsn2) || jsm3.g) {
                        break;
                    }
                    if (!jsm3.b.l()) {
                        jsm3.d();
                        break;
                    }
                    jsm3.g();
                    break;
                }
                case 14: {
                    final lsp lsp = (lsp)message.obj;
                    throw null;
                }
                case 12: {
                    if (!this.l.containsKey(message.obj)) {
                        break;
                    }
                    final jsm jsm4 = this.l.get(message.obj);
                    jvu.d(jsm4.j.o);
                    if (!jsm4.b.l() || jsm4.e.size() != 0) {
                        break;
                    }
                    final jsd d = jsm4.d;
                    if (d.a.isEmpty() && d.b.isEmpty()) {
                        jsm4.b.k("Timing out service connection.");
                        break;
                    }
                    jsm4.l();
                    break;
                }
                case 11: {
                    if (!this.l.containsKey(message.obj)) {
                        break;
                    }
                    final jsm jsm5 = this.l.get(message.obj);
                    jvu.d(jsm5.j.o);
                    if (jsm5.g) {
                        jsm5.n();
                        final jsq j = jsm5.j;
                        Status status;
                        if (j.h.e(j.g) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        }
                        else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        jsm5.f(status);
                        jsm5.b.k("Timing out connection while resuming.");
                        break;
                    }
                    break;
                }
                case 10: {
                    final Iterator iterator2 = this.s.iterator();
                    while (iterator2.hasNext()) {
                        final jsm jsm6 = this.l.remove(iterator2.next());
                        if (jsm6 != null) {
                            jsm6.m();
                        }
                    }
                    this.s.clear();
                    break;
                }
                case 9: {
                    if (!this.l.containsKey(message.obj)) {
                        break;
                    }
                    final jsm jsm7 = this.l.get(message.obj);
                    jvu.d(jsm7.j.o);
                    if (jsm7.g) {
                        jsm7.d();
                        break;
                    }
                    break;
                }
                case 7: {
                    this.j((jqt)message.obj);
                    break;
                }
                case 6: {
                    if (this.g.getApplicationContext() instanceof Application) {
                        final Application application = (Application)this.g.getApplicationContext();
                        message = (Message)jrr.a;
                        synchronized (message) {
                            if (!jrr.a.e) {
                                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)jrr.a);
                                application.registerComponentCallbacks((ComponentCallbacks)jrr.a);
                                jrr.a.e = true;
                            }
                            monitorexit(message);
                            final jrr a2 = jrr.a;
                            final jsh jsh = new jsh(this);
                            message = (Message)jrr.a;
                            synchronized (message) {
                                a2.d.add(jsh);
                                monitorexit(message);
                                message = (Message)jrr.a;
                                if (!((jrr)message).c.get()) {
                                    final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
                                    ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
                                    if (!((jrr)message).c.getAndSet(true) && activityManager$RunningAppProcessInfo.importance > 100) {
                                        ((jrr)message).b.set(true);
                                    }
                                }
                                if (!((jrr)message).b.get()) {
                                    this.e = 300000L;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    final int arg1 = message.arg1;
                    final jps jps = (jps)message.obj;
                    while (true) {
                        for (final jsm jsm8 : this.l.values()) {
                            if (jsm8.f == arg1) {
                                if (jsm8 == null) {
                                    final StringBuilder sb2 = new StringBuilder(76);
                                    sb2.append("Could not find API instance ");
                                    sb2.append(arg1);
                                    sb2.append(" while trying to fail enqueued calls.");
                                    Log.wtf("GoogleApiManager", sb2.toString(), (Throwable)new Exception());
                                    break Label_1850;
                                }
                                if (jps.c == 13) {
                                    final String g = jqg.g();
                                    final String e2 = jps.e;
                                    final StringBuilder sb3 = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(e2).length());
                                    sb3.append("Error resolution was canceled by the user, original error message: ");
                                    sb3.append(g);
                                    sb3.append(": ");
                                    sb3.append(e2);
                                    jsm8.f(new Status(17, sb3.toString()));
                                    break Label_1850;
                                }
                                jsm8.f(a(jsm8.c, jps));
                                break Label_1850;
                            }
                        }
                        jsm jsm8 = jsm;
                        continue;
                    }
                }
                case 4:
                case 8:
                case 13: {
                    final jth jth = (jth)message.obj;
                    jsm k;
                    if ((k = this.l.get(jth.c.g)) == null) {
                        k = this.j(jth.c);
                    }
                    if (k.o() && this.k.get() != jth.b) {
                        jth.a.d(jsq.a);
                        k.m();
                        break;
                    }
                    k.e(jth.a);
                    break;
                }
                case 3: {
                    for (final jsm jsm9 : this.l.values()) {
                        jsm9.c();
                        jsm9.d();
                    }
                    break;
                }
                case 2: {
                    final lsp lsp2 = (lsp)message.obj;
                    throw null;
                }
                case 1: {
                    if (message.obj) {
                        e = 10000L;
                    }
                    this.e = e;
                    this.o.removeMessages(12);
                    for (final jrq jrq : this.l.keySet()) {
                        final Handler o2 = this.o;
                        o2.sendMessageDelayed(o2.obtainMessage(12, (Object)jrq), this.e);
                    }
                    break;
                }
            }
        }
        return true;
    }
    
    final boolean i(final jps jps, final int n) {
        final jpw h = this.h;
        final Context g = this.g;
        PendingIntent pendingIntent;
        if (jps.b()) {
            pendingIntent = jps.d;
        }
        else {
            pendingIntent = h.h(g, jps.c, null);
        }
        if (pendingIntent != null) {
            h.c(g, jps.c, kau.a(g, GoogleApiActivity.a(g, pendingIntent, n, true), kau.a | 0x8000000));
            return true;
        }
        return false;
    }
}
