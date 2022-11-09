import android.net.Uri;
import android.content.ActivityNotFoundException;
import android.app.Activity;
import android.os.Parcelable;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicInteger;
import j$.util.function.Supplier;
import java.util.Comparator;
import j$.util.function.Consumer;
import j$.util.stream.Collectors;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate;
import j$.util.function.Function;
import android.util.ArrayMap;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqo
{
    private static final noi e;
    public final hrv a;
    public final Context b;
    public final bqv c;
    private final hfn f;
    private final hdo g;
    private final boolean h;
    private final cxl i;
    private final Map j;
    private final Map k;
    private final hjx l;
    private final hkc m;
    private final hkd n;
    
    static {
        e = noi.I(hrn.a.getPackageName(), hrn.b.getPackageName());
    }
    
    public hqo(final hrv a, final Context b, final hfn f, final hdo g, final boolean h, final bqv c, final cxl i, final hjx l, final hkc m, final hkd n) {
        this.j = (Map)new ArrayMap();
        this.k = (Map)new ArrayMap();
        this.a = a;
        this.b = b;
        this.f = f;
        this.g = g;
        this.h = h;
        this.c = c;
        this.i = i;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    private static Predicate e(final Function function) {
        return (Predicate)new hrq((Map)new ConcurrentHashMap(), function, 1);
    }
    
    private static String f(final bqr bqr) {
        final String i = bqr.a().i();
        String s = null;
        if (TextUtils.isEmpty((CharSequence)i)) {
            final bqt a = bqt.a;
            final hio a2 = hio.a;
            switch (bqr.b().ordinal()) {
                default: {
                    s = "*/*";
                    break;
                }
                case 2: {
                    s = "video/*";
                    break;
                }
                case 1:
                case 5: {
                    s = "image/*";
                    break;
                }
            }
        }
        else {
            s = i;
        }
        return s;
    }
    
    private final ResolveInfo g(final int n) {
        final hqn hqn = new hqn(this, n);
        hqn.activityInfo = new ActivityInfo();
        hqn.activityInfo.packageName = this.b.getPackageName();
        hqn.activityInfo.name = "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity";
        return hqn;
    }
    
    final ArrayList a(final bqr bqr) {
        final String f = f(bqr);
        final hrv a = this.a;
        final String s = "image/*";
        final List c = a.c("image/*");
        final List c2 = this.a.c("video/*");
        final ArrayList list = new ArrayList();
        String s2 = s;
        if (!f.equals("image/*")) {
            if (llk.a(f).b()) {
                s2 = s;
            }
            else {
                s2 = "video/*";
            }
        }
        final ArrayList list2 = new ArrayList(c);
        list2.addAll(c2);
        this.a.h((List)Collection$_EL.stream((Collection)list2).filter(e((Function)cdd.l)).collect(Collectors.toList()));
        Collection$_EL.stream((Collection)c).forEachOrdered((Consumer)new hql(this, list, s2, 1));
        Collection$_EL.stream((Collection)c2).forEachOrdered((Consumer)new hql(this, list, s2));
        final ArrayList list3 = (ArrayList)Collection$_EL.stream((Collection)list).sorted((Comparator)new hqk(this)).filter(e((Function)cdd.m)).collect(Collectors.toCollection((Supplier)hrr.b));
        final htk a2 = htl.a();
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicInteger atomicInteger2 = new AtomicInteger();
        Collection$_EL.stream((Collection)list3).forEachOrdered((Consumer)new hqm(atomicInteger, atomicInteger2));
        ResolveInfo resolveInfo;
        if (atomicInteger.get() < 3 && atomicInteger2.get() > 0) {
            resolveInfo = this.g(2);
        }
        else {
            resolveInfo = this.g(3);
        }
        a2.b(resolveInfo);
        a2.c(true);
        a2.d(true);
        list3.add(a2.a());
        return (ArrayList)Collection$_EL.stream((Collection)list3).filter((Predicate)bne.h).collect(Collectors.toCollection((Supplier)hrr.b));
    }
    
    public final boolean b(final String s) {
        final hjx l = this.l;
        final hrm hrm = (hrm)this.a.a().get(s);
        hrm.getClass();
        return l.m(hrm.b());
    }
    
    final int c(final bqr bqr) {
        final boolean booleanValue = (boolean)this.m.c(hjq.z);
        boolean b = false;
        Label_0292: {
            if (!booleanValue && !(boolean)this.m.c(hjq.A)) {
                final niz h = niz.h(this.k.get("image/*"));
                final niz h2 = niz.h(this.k.get("video/*"));
                niz i = h;
                if (!h.g()) {
                    i = niz.i(this.a.j("image/*"));
                    this.k.put("image/*", ((njd)i).a);
                }
                Label_0271: {
                    if (this.i.k(cxr.aD)) {
                        niz j = h2;
                        if (!h2.g()) {
                            j = niz.i(this.a.j("video/*"));
                            this.k.put("video/*", ((njd)j).a);
                        }
                        if ((boolean)i.c() || (boolean)j.c()) {
                            break Label_0271;
                        }
                    }
                    else if (i.c()) {
                        break Label_0271;
                    }
                    this.n.d(hjq.x, false);
                    break Label_0292;
                }
                this.n.d(hjq.x, true);
                b = true;
            }
        }
        if (!(boolean)this.m.c(hjq.x)) {
            return 2;
        }
        if (bqr == null) {
            return 2;
        }
        if (!this.i.k(cxr.aD)) {
            final bqt b2 = bqr.b();
            int n = 0;
            Label_0560: {
                if (bqt.b.equals(b2)) {
                    final him d = bqr.a().d();
                    hhy a;
                    if (d == null) {
                        a = null;
                    }
                    else {
                        a = this.f.a(d);
                    }
                    if (a != null) {
                        final hio k = a.i();
                        final hio a2 = hio.a;
                        switch (k.ordinal()) {
                            default: {
                                n = 2;
                                break Label_0560;
                            }
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 10:
                            case 12: {
                                break;
                            }
                        }
                    }
                    else {
                        if (bqr.a().j()) {
                            n = 3;
                            break Label_0560;
                        }
                        final fbl c = bqr.c();
                        if (c.b.h || c.e() || c.d()) {
                            n = 2;
                            break Label_0560;
                        }
                    }
                }
                else if (b2 != bqt.f) {
                    n = 2;
                    break Label_0560;
                }
                n = 1;
            }
            if (n != 1) {
                return n;
            }
        }
        if (!b) {
            final String f = f(bqr);
            Boolean value = this.j.get(f);
            if (value == null) {
                value = this.a.i(f);
                this.j.put(f, value);
            }
            if (!value) {
                return 2;
            }
        }
        return 1;
    }
    
    final int d(final ResolveInfo resolveInfo, final bqr bqr) {
        final Uri c = bqr.a().c();
        final String f = f(bqr);
        final boolean equals = this.b.getPackageName().equals(resolveInfo.activityInfo.packageName);
        boolean b = false;
        int n = 1;
        if (equals && "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity".equals(resolveInfo.activityInfo.name)) {
            b = true;
        }
        final Intent intent = new Intent("android.intent.action.SEND");
        if (this.i.k(cxr.aF) && hqo.e.contains(resolveInfo.activityInfo.packageName) && this.b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.internal.camera.imageobfuscator") != null) {
            intent.setClassName("com.google.android.apps.internal.camera.imageobfuscator", ".activities.SharingActivity");
        }
        else {
            intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (b) {
            intent.putExtra("pref_open_setting_page", "pref_category_social_share");
            intent.putExtra("pref_make_setting_page_root", true);
            n = 3;
        }
        else {
            intent.setType(f);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable)c);
            intent.addFlags(268435457);
        }
        while (true) {
            if (b) {
                try {
                    if (!this.h) {
                        ((Activity)this.b).startActivityForResult(intent, 1000);
                    }
                    else {
                        this.g.g(intent);
                    }
                }
                catch (final ActivityNotFoundException ex) {
                    n = 2;
                }
                return n;
            }
            continue;
        }
    }
}
