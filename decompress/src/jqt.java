import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Set;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import android.os.Handler;
import android.app.Fragment;
import java.lang.ref.WeakReference;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import android.app.Activity;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class jqt
{
    public final Context c;
    public final String d;
    public final jqp e;
    public final jqn f;
    public final jrq g;
    public final Looper h;
    public final int i;
    public final jqw j;
    protected final jsq k;
    
    public jqt(final Context context) {
        this(context, jxq.a, jqn.r, jqs.a);
        kiu.b(context.getApplicationContext());
    }
    
    public jqt(final Context context, final Activity activity, final jqp e, final jqn f, final jqs jqs) {
        jvu.j(context, "Null context is not permitted.");
        jvu.j(jqs, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.c = context.getApplicationContext();
        String d = null;
        Label_0062: {
            try {
                d = (String)Context.class.getMethod("getAttributionTag", (Class<?>[])new Class[0]).invoke(context, new Object[0]);
                break Label_0062;
            }
            catch (final InvocationTargetException ex) {}
            catch (final IllegalAccessException ex2) {}
            catch (final NoSuchMethodException ex3) {}
            d = null;
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = jqs.b;
        final jrq g = new jrq(e, f, d);
        this.g = g;
        this.j = new jsr(this);
        final jsq c = jsq.c(this.c);
        this.k = c;
        this.i = c.j.getAndIncrement();
        final lsp c2 = jqs.c;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            final Object a = new jsw(activity).a;
            Label_0420: {
                jsx jsx = null;
                if (a instanceof em) {
                    final em em = (em)a;
                    final WeakReference weakReference = jts.a.get(em);
                    if (weakReference != null) {
                        if ((jsx = (jts)weakReference.get()) != null) {
                            break Label_0420;
                        }
                    }
                    try {
                        final ei ei = em.c().d("SupportLifecycleFragmentImpl");
                        Label_0282: {
                            if (ei != null) {
                                jsx = (jsx)ei;
                                if (!ei.t) {
                                    break Label_0282;
                                }
                            }
                            jsx = new jts();
                            final fr i = em.c().i();
                            i.m((ei)jsx, "SupportLifecycleFragmentImpl");
                            i.g();
                        }
                        jts.a.put(em, new WeakReference(jsx));
                        break Label_0420;
                    }
                    catch (final ClassCastException ex4) {
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ex4);
                    }
                }
                final WeakReference weakReference2 = jsz.a.get(a);
                if (weakReference2 != null) {
                    if ((jsx = (jsz)weakReference2.get()) != null) {
                        break Label_0420;
                    }
                }
                try {
                    final jsz jsz = (jsz)((Activity)a).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    Label_0403: {
                        if (jsz != null) {
                            jsx = jsz;
                            if (!jsz.isRemoving()) {
                                break Label_0403;
                            }
                        }
                        jsx = new jsz();
                        ((Activity)a).getFragmentManager().beginTransaction().add((Fragment)jsx, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    jsz.a.put(a, new WeakReference(jsx));
                    final jse jse = (jse)jsx.c(jse.class);
                    jse jse2;
                    if (jse == null) {
                        jse2 = new jse(jsx, c);
                    }
                    else {
                        jse2 = jse;
                    }
                    jse2.e.add(g);
                    c.g(jse2);
                }
                catch (final ClassCastException ex5) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", ex5);
                }
            }
        }
        final Handler o = c.o;
        o.sendMessage(o.obtainMessage(7, (Object)this));
    }
    
    public jqt(final Context context, final jqp jqp, final jqn jqn, final jqs jqs) {
        this(context, null, jqp, jqn, jqs);
    }
    
    @Deprecated
    public jqt(final Context context, final jqp jqp, final jqn jqn, final lsp a, final byte[] array, final byte[] array2, final byte[] array3) {
        final jqr jqr = new jqr();
        jqr.a = a;
        this(context, jqp, jqn, jqr.a());
    }
    
    public jqt(final Context context, final keu keu) {
        this(context, kev.a, keu, jqs.a);
    }
    
    public static void m(final kgg kgg) {
        jvu.j(kgg, "channel must not be null");
    }
    
    public final juo c() {
        final juo juo = new juo();
        final jqn f = this.f;
        final boolean b = f instanceof jql;
        Account a = null;
        Label_0093: {
            if (b) {
                final GoogleSignInAccount a2 = ((jql)f).a();
                if (a2 != null) {
                    final String d = a2.d;
                    if (d == null) {
                        break Label_0093;
                    }
                    a = new Account(d, "com.google");
                    break Label_0093;
                }
            }
            final jqn f2 = this.f;
            if (f2 instanceof jqk) {
                a = ((jqk)f2).a();
            }
        }
        juo.a = a;
        final jqn f3 = this.f;
        Set<Object> set;
        if (f3 instanceof jql) {
            final GoogleSignInAccount a3 = ((jql)f3).a();
            if (a3 == null) {
                set = Collections.emptySet();
            }
            else {
                set = a3.a();
            }
        }
        else {
            set = Collections.emptySet();
        }
        if (juo.b == null) {
            juo.b = new yw();
        }
        juo.b.addAll(set);
        juo.d = this.c.getClass().getName();
        juo.c = this.c.getPackageName();
        return juo;
    }
    
    public final keg d(final int n, final jtu jtu) {
        final kej kej = new kej();
        final jsq k = this.k;
        k.d(kej, jtu.c, this);
        final jrn jrn = new jrn(n, jtu, kej);
        final Handler o = k.o;
        o.sendMessage(o.obtainMessage(4, (Object)new jth(jrn, k.k.get(), this)));
        return kej.a;
    }
    
    public final keg e(final jtu jtu) {
        return this.d(0, jtu);
    }
    
    public final keg f(final jtb jtb, final int n) {
        final jsq k = this.k;
        final kej kej = new kej();
        k.d(kej, n, this);
        final jro jro = new jro(jtb, kej);
        final Handler o = k.o;
        o.sendMessage(o.obtainMessage(13, (Object)new jth(jro, k.k.get(), this)));
        return kej.a;
    }
    
    public final void g(final int n, final jrs jrs) {
        final boolean i = jrs.i;
        boolean j = true;
        if (!i) {
            if (!BasePendingResult.c.get()) {
                j = false;
            }
        }
        jrs.i = j;
        final jsq k = this.k;
        final jrl jrl = new jrl(n, jrs);
        final Handler o = k.o;
        o.sendMessage(o.obtainMessage(4, (Object)new jth(jrl, k.k.get(), this)));
    }
    
    public final keg h() {
        final jtt a = jtu.a();
        a.a = new kbb(this);
        a.d = 2414;
        return this.e(a.a());
    }
    
    public final void i(final jtb jtb) {
        this.f(jtb, 0).a(kel.a, new jtv());
    }
    
    public final keg j(final String s) {
        final jtt a = jtu.a();
        a.a = new kcu(s);
        return this.e(a.a());
    }
    
    public final keg k(final String s, final String s2) {
        final jtt a = jtu.a();
        a.a = new kct(s, s2);
        return this.e(a.a());
    }
    
    public final keg l() {
        final jtt a = jtu.a();
        a.a = new ker();
        a.d = 4501;
        return this.e(a.a());
    }
    
    public final void n(final jtl jtl) {
        jvu.j(jtl.a.a(), "Listener has already been released.");
        final jsq k = this.k;
        final jti a = jtl.a;
        final jtx b = jtl.b;
        final Runnable c = jtl.c;
        final kej kej = new kej();
        k.d(kej, a.b, this);
        final jrm jrm = new jrm(new jtj(a, b, c), kej);
        final Handler o = k.o;
        o.sendMessage(o.obtainMessage(8, (Object)new jth(jrm, k.k.get(), this)));
    }
}
