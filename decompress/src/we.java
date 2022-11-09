import android.os.Trace;
import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import android.app.Activity;
import java.util.Random;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.activity.ComponentActivity$5;
import androidx.activity.ComponentActivity$4;
import androidx.activity.ComponentActivity$3;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public class we extends gh implements k, ad, aex, wi, wq
{
    private ac a;
    public final wj f;
    final aew g;
    public final wh h;
    public final wp i;
    public final i j;
    
    public we() {
        this.f = new wj();
        final i j = new i(this);
        this.j = j;
        this.g = aew.a(this);
        this.h = new wh(new wa(this));
        new AtomicInteger();
        this.i = new wp(this);
        j.b(new ComponentActivity$3(this));
        j.b(new ComponentActivity$4(this));
        j.b(new ComponentActivity$5(this));
    }
    
    private void c() {
        gz.w(this.getWindow().getDecorView(), this);
        a.b(this.getWindow().getDecorView(), this);
        aal.b(this.getWindow().getDecorView(), this);
    }
    
    @Override
    public final aev A() {
        return this.g.a;
    }
    
    @Override
    public final i aD() {
        return this.j;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    @Override
    public final ac bg() {
        if (this.getApplication() != null) {
            this.l();
            return this.a;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
    
    public final void k(final wk wk) {
        final wj f = this.f;
        if (f.b != null) {
            final Context b = f.b;
            wk.a();
        }
        f.a.add(wk);
    }
    
    public final void l() {
        if (this.a == null) {
            final wd wd = (wd)this.getLastNonConfigurationInstance();
            if (wd != null) {
                this.a = wd.a;
            }
            if (this.a == null) {
                this.a = new ac();
            }
        }
    }
    
    @Deprecated
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (!this.i.c(n, n2, intent)) {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    public void onBackPressed() {
        this.h.a();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.g.b(bundle);
        final wj f = this.f;
        f.b = (Context)this;
        final Iterator iterator = f.a.iterator();
        while (iterator.hasNext()) {
            ((wk)iterator.next()).a();
        }
        super.onCreate(bundle);
        final wp i = this.i;
        if (bundle != null) {
            final ArrayList integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            final ArrayList stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                for (int size = stringArrayList.size(), j = 0; j < size; ++j) {
                    i.b((int)integerArrayList.get(j), (String)stringArrayList.get(j));
                }
                i.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                i.a = (Random)bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                i.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        adl.b(this);
    }
    
    @Deprecated
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (!this.i.c(n, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", array2))) {
            super.onRequestPermissionsResult(n, array, array2);
        }
    }
    
    public final Object onRetainNonConfigurationInstance() {
        ac a = this.a;
        if (a == null) {
            final wd wd = (wd)this.getLastNonConfigurationInstance();
            if (wd != null) {
                a = wd.a;
            }
        }
        if (a == null) {
            return null;
        }
        final wd wd2 = new wd();
        wd2.a = a;
        return wd2;
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        final i j = this.j;
        if (j instanceof i) {
            j.e(h.c);
        }
        super.onSaveInstanceState(bundle);
        this.g.c(bundle);
        final wp i = this.i;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(i.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(i.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(i.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)i.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", (Serializable)i.a);
    }
    
    public final void reportFullyDrawn() {
        try {
            if (afo.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        }
        finally {
            Trace.endSection();
        }
    }
    
    public void setContentView(final int contentView) {
        this.c();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        this.c();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.c();
        super.setContentView(view, viewGroup$LayoutParams);
    }
}
