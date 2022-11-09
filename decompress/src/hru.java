import j$.util.function.Supplier;
import j$.util.stream.Collectors;
import j$.util.Comparator$_CC;
import j$.util.function.Predicate;
import j$.util.function.Function;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.List;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import java.util.HashMap;
import android.widget.Toast;
import android.preference.PreferenceScreen;
import android.content.pm.PackageManager;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hru
{
    public final Context a;
    public final hjx b;
    public final hkc c;
    public final hkd d;
    public final hrv e;
    public final eyt f;
    public final cxl g;
    public final nnn h;
    public final Map i;
    public final Map j;
    public final PackageManager k;
    public nns l;
    public PreferenceScreen m;
    public Toast n;
    
    public hru(final Context a, final hjx b, final hkc c, final hkd d, final hrv e, final eyt f, final cxl g) {
        if (g.k(cxr.at)) {
            this.a = a;
        }
        else {
            this.a = (Context)new lv(a, 2132017673);
        }
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = nns.e();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = a.getPackageManager();
    }
    
    public final int a() {
        final nns f = this.h.f();
        final int c = ((nql)f).c;
        int i = 0;
        int n = 0;
        while (i < c) {
            final ManagedSwitchPreference managedSwitchPreference = f.get(i);
            int n2 = n;
            if (this.b.m(managedSwitchPreference.getKey())) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public final int b(final boolean b) {
        if (this.g.k(cxr.at)) {
            return neq.c(this.a, 2130968882, -16777216);
        }
        final Resources resources = this.a.getResources();
        int n;
        if (!b) {
            n = 2131101434;
        }
        else {
            n = 2131099725;
        }
        return resources.getColor(n, (Resources$Theme)null);
    }
    
    public final nns c(final List list, final List list2) {
        final nnn e = nns.e();
        e.h(list);
        e.h(list2);
        return this.d(e.f());
    }
    
    public final nns d(final List list) {
        return nns.j((Collection)Collection$_EL.stream((Collection)list).filter((Predicate)new hrq((Map)new ConcurrentHashMap(), (Function)cdd.o)).map((Function)new hrp(this)).sorted(Comparator$_CC.comparing((Function)cdd.p)).map((Function)cdd.q).collect(Collectors.toCollection((Supplier)hrr.a)));
    }
    
    public final String e(final boolean b) {
        final Resources resources = this.a.getResources();
        int n;
        if (!b) {
            n = 2131952645;
        }
        else {
            n = 2131952646;
        }
        return resources.getString(n);
    }
    
    public final void f(final ManagedSwitchPreference managedSwitchPreference, final boolean checked) {
        managedSwitchPreference.setChecked(checked);
        this.b.l(managedSwitchPreference.getKey(), checked);
    }
    
    public final void g(final boolean checked) {
        final ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference)this.m.findPreference((CharSequence)hjq.x.b);
        managedSwitchPreference.setChecked(checked);
        managedSwitchPreference.setTitle((CharSequence)this.e(checked));
        managedSwitchPreference.f = this.b(checked);
        this.d.d(hjq.x, checked);
        this.d.d(hjq.A, true);
    }
    
    public final void h() {
        final int a = this.a();
        final String a2 = jwn.ae(2131820549, a, a).a(this.a.getResources());
        final ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference)this.m.findPreference((CharSequence)hjq.x.b);
        final boolean k = this.g.k(cxr.at);
        int c = -1;
        if (k) {
            c = neq.c(this.a, 2130968856, -1);
        }
        managedSwitchPreference.k = a2;
        managedSwitchPreference.h = c;
    }
}
