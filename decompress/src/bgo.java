import android.util.Log;
import android.os.Message;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.Application;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Bundle;
import java.util.HashMap;
import android.os.Handler;
import java.util.Map;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgo implements Handler$Callback
{
    final Map a;
    final Map b;
    private volatile auz c;
    private final Handler d;
    
    public bgo() {
        this.a = new HashMap();
        this.b = new HashMap();
        new yu();
        new yu();
        new Bundle();
        this.d = new Handler(Looper.getMainLooper(), (Handler$Callback)this);
        final int a = bec.a;
    }
    
    private static Activity e(final Context context) {
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    private static void f(final Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }
    
    private static boolean g(final Context context) {
        final Activity e = e(context);
        return e == null || !e.isFinishing();
    }
    
    public final auz a(final Context context) {
        if (context != null) {
            if (biv.n() && !(context instanceof Application)) {
                if (context instanceof em) {
                    return this.b((em)context);
                }
                if (context instanceof Activity) {
                    final Activity activity = (Activity)context;
                    auz c;
                    if (biv.m()) {
                        c = this.a(activity.getApplicationContext());
                    }
                    else if (activity instanceof em) {
                        c = this.b((em)activity);
                    }
                    else {
                        f(activity);
                        final FragmentManager fragmentManager = activity.getFragmentManager();
                        final boolean g = g((Context)activity);
                        final bgn c2 = this.c(fragmentManager);
                        c = c2.c;
                        if (c == null) {
                            c = bgv.b(auf.b((Context)activity), c2.a, c2.b, (Context)activity);
                            if (g) {
                                c.h();
                            }
                            c2.c = c;
                        }
                    }
                    return c;
                }
                if (context instanceof ContextWrapper) {
                    final ContextWrapper contextWrapper = (ContextWrapper)context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return this.a(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.c == null) {
                synchronized (this) {
                    if (this.c == null) {
                        this.c = bgv.b(auf.b(context.getApplicationContext()), new bgd(), new bgi(), context.getApplicationContext());
                    }
                }
            }
            return this.c;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
    
    public final auz b(final em em) {
        if (biv.m()) {
            return this.a(em.getApplicationContext());
        }
        f(em);
        final fi c = em.c();
        final boolean g = g((Context)em);
        final bgs d = this.d(c);
        final auz c2 = d.c;
        auz b;
        if (c2 == null) {
            b = bgv.b(auf.b((Context)em), d.a, d.b, (Context)em);
            if (g) {
                b.h();
            }
            d.c = b;
        }
        else {
            b = c2;
        }
        return b;
    }
    
    public final bgn c(final FragmentManager fragmentManager) {
        final bgn bgn = (bgn)fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        bgn bgn4;
        if (bgn == null) {
            final bgn bgn2 = this.a.get(fragmentManager);
            if (bgn2 == null) {
                final bgn bgn3 = new bgn();
                this.a.put(fragmentManager, bgn3);
                fragmentManager.beginTransaction().add((Fragment)bgn3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.d.obtainMessage(1, (Object)fragmentManager).sendToTarget();
                return bgn3;
            }
            bgn4 = bgn2;
        }
        else {
            bgn4 = bgn;
        }
        return bgn4;
    }
    
    public final bgs d(final fi fi) {
        final bgs bgs = (bgs)fi.d("com.bumptech.glide.manager");
        bgs bgs4;
        if (bgs == null) {
            final bgs bgs2 = this.b.get(fi);
            if (bgs2 == null) {
                final bgs bgs3 = new bgs();
                this.b.put(fi, bgs3);
                final fr i = fi.i();
                i.m(bgs3, "com.bumptech.glide.manager");
                i.g();
                this.d.obtainMessage(2, (Object)fi).sendToTarget();
                return bgs3;
            }
            bgs4 = bgs2;
        }
        else {
            bgs4 = bgs;
        }
        return bgs4;
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        Object o = null;
        boolean b = false;
        Object o2 = null;
        switch (what) {
            default: {
                b = false;
                o2 = null;
                break;
            }
            case 2: {
                o2 = message.obj;
                o = this.b.remove(o2);
                b = true;
                break;
            }
            case 1: {
                o2 = message.obj;
                o = this.a.remove(o2);
                b = true;
                break;
            }
        }
        if (b && o == null && Log.isLoggable("RMRetriever", 5)) {
            final String value = String.valueOf(o2);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 61);
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(value);
            Log.w("RMRetriever", sb.toString());
            return true;
        }
        return b;
    }
}
