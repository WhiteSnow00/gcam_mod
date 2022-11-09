import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.os.Parcelable;
import android.content.Intent;
import java.util.HashMap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wp
{
    public Random a;
    public final Map b;
    public final Map c;
    public final Map d;
    public ArrayList e;
    public final transient Map f;
    public final Map g;
    public final Bundle h;
    final /* synthetic */ we i;
    
    public wp() {
        this.a = new Random();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new Bundle();
    }
    
    public wp(final we i) {
        this.i = i;
        this.a = new Random();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new Bundle();
    }
    
    public final wn a(final String s, final wt wt, final wm wm) {
        final Integer n = this.c.get(s);
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            for (intValue = this.a.nextInt(2147418112) + 65536; this.b.containsKey(intValue); intValue = this.a.nextInt(2147418112) + 65536) {}
            this.b(intValue, s);
        }
        this.f.put(s, new wo(wm, wt));
        if (this.g.containsKey(s)) {
            final Object value = this.g.get(s);
            this.g.remove(s);
            wm.a(value);
        }
        final wl wl = (wl)this.h.getParcelable(s);
        if (wl != null) {
            this.h.remove(s);
            wm.a(wt.a(wl.a, wl.b));
        }
        return new wn(this, s, intValue, wt);
    }
    
    public final void b(final int n, final String s) {
        final Map b = this.b;
        final Integer value = n;
        b.put(value, s);
        this.c.put(s, value);
    }
    
    public final boolean c(final int n, final int n2, final Intent intent) {
        final String s = this.b.get(n);
        if (s == null) {
            return false;
        }
        this.e.remove(s);
        final wo wo = this.f.get(s);
        if (wo != null) {
            final wm a = wo.a;
            if (a != null) {
                a.a(wo.b.a(n2, intent));
                return true;
            }
        }
        this.g.remove(s);
        this.h.putParcelable(s, (Parcelable)new wl(n2, intent));
        return true;
    }
    
    public final void d(final int n, final wt wt, final Object o) {
        final we i = this.i;
        final ws c = wt.c((Context)i, o);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post((Runnable)new wb(this, n, c));
            return;
        }
        final Intent b = wt.b(o);
        if (b.getExtras() != null && b.getExtras().getClassLoader() == null) {
            b.setExtrasClassLoader(i.getClassLoader());
        }
        Bundle bundleExtra;
        if (b.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        else {
            bundleExtra = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(b.getAction())) {
            String[] stringArrayExtra;
            if ((stringArrayExtra = b.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS")) == null) {
                stringArrayExtra = new String[0];
            }
            zv.t(i, stringArrayExtra, n);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(b.getAction())) {
            final wr wr = (wr)b.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i.startIntentSenderForResult(wr.a, n, wr.b, wr.c, wr.d, 0, bundleExtra);
                return;
            }
            catch (final IntentSender$SendIntentException ex) {
                new Handler(Looper.getMainLooper()).post((Runnable)new wc(this, n, ex));
                return;
            }
        }
        i.startActivityForResult(b, n, bundleExtra);
    }
}
