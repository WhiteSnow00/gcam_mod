import j$.util.function.Supplier;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Set;
import j$.util.stream.Stream;
import j$.util.function.Consumer;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import j$.util.function.ToIntFunction;
import j$.util.Comparator$_CC;
import java.util.Comparator;
import android.util.ArraySet;
import j$.util.function.Predicate;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.content.Intent;
import java.util.List;
import java.util.Collection;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsf implements hrv
{
    public static final nsd a;
    public static final Pattern b;
    public final hjx c;
    public nnx d;
    private final PackageManager e;
    private final hkc f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/socialshare/setting/SocialShareSettingsImpl");
        b = Pattern.compile("^([A-Za-z][A-Za-z\\d_]*(\\.|\\$))+[A-Za-z][A-Za-z\\d_]*$");
    }
    
    public hsf(final PackageManager e, final hjx c, final hkc f) {
        this.e = e;
        this.c = c;
        this.f = f;
    }
    
    public static noi k(final String s, final noi noi) {
        if (!s.isEmpty()) {
            final List f = njk.b(',').f(s);
            if (f.size() >= 2) {
                return noi.F(f);
            }
        }
        return noi;
    }
    
    private final List n(final String type) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(type);
        return this.e.queryIntentActivities(intent, 0);
    }
    
    private static Map o(final noi noi) {
        final njk b = njk.b('/');
        final HashMap hashMap = new HashMap();
        final nrv bn = noi.bN();
        while (bn.hasNext()) {
            final ArrayList list = new ArrayList(b.f(bn.next()));
            Collection$_EL.removeIf((Collection)list, (Predicate)bne.j);
            if (list.size() >= 2 && Collection$_EL.stream((Collection)list).allMatch((Predicate)bne.l)) {
                final ArraySet set = new ArraySet();
                final int size = list.size();
                int i = 0;
                String s = "";
                while (i < size) {
                    final String s2 = (String)list.get(i);
                    if (s.isEmpty()) {
                        s = s2;
                    }
                    else {
                        ((Set<String>)set).add(s2);
                    }
                    ++i;
                }
                hashMap.put(s, set);
            }
        }
        return hashMap;
    }
    
    @Override
    public final nnx a() {
        return this.d;
    }
    
    @Override
    public final Comparator b() {
        return Comparator$_CC.comparingInt((ToIntFunction)new hsa(this));
    }
    
    @Override
    public final void e(List list) {
        list = (List)Collection$_EL.stream((Collection)list).map((Function)cdd.r).collect(Collectors.toList());
        final Stream map = Collection$_EL.stream((Collection)this.d.t()).filter((Predicate)new hry(list)).map((Function)hsc.a);
        final hjx c = this.c;
        c.getClass();
        map.filter((Predicate)new hsd(c)).forEach((Consumer)new hsb(this, 1));
    }
    
    @Override
    public final void f() {
        final nnt l = nnx.l();
        final noi k = k(ouy.a.b().b(), hrn.d);
        final noi i = k(ouy.a.b().d(), hrn.e);
        final Map o = o(k);
        final Map o2 = o(i);
        for (final Map.Entry<String, V> entry : o.entrySet()) {
            final String s = entry.getKey();
            final noi f = noi.F((Collection)entry.getValue());
            noi noi = nqr.a;
            if (o2.containsKey(s)) {
                final Set set = o2.get(s);
                set.getClass();
                noi = noi.F(set);
                o2.remove(s);
            }
            final hrl a = hrm.a();
            a.b(s);
            a.c(f);
            a.d(noi);
            l.d(s, a.a());
        }
        for (final Map.Entry<String, V> entry2 : o2.entrySet()) {
            entry2.getKey();
            final String s2 = entry2.getKey();
            final hrl a2 = hrm.a();
            a2.b(entry2.getKey());
            a2.c(nqr.a);
            a2.d(noi.F((Collection)entry2.getValue()));
            l.d(s2, a2.a());
        }
        this.d = l.b();
    }
    
    @Override
    public final void g(final List list) {
        this.e(nns.l());
        Collection$_EL.stream((Collection)list).sorted(this.b()).limit(3L).map((Function)hsc.b).forEach((Consumer)new hsb(this));
    }
    
    @Override
    public final void h(final List list) {
        if ((boolean)this.f.c(hjq.x) && !this.m()) {
            this.g(list);
        }
    }
    
    @Override
    public final boolean i(final String s) {
        final Stream map = Collection$_EL.stream((Collection)this.n(s)).map((Function)cdd.t);
        final nnx d = this.d;
        d.getClass();
        return map.anyMatch((Predicate)new hrx(d));
    }
    
    @Override
    public final boolean j(final String s) {
        final Set set = (Set)Collection$_EL.stream((Collection)this.d.t()).filter((Predicate)bne.k).collect(Collectors.toSet());
        final Stream map = Collection$_EL.stream((Collection)this.n(s)).map((Function)cdd.u);
        set.getClass();
        return map.anyMatch((Predicate)new hrz(set));
    }
    
    public final ArrayList l(final String s) {
        return (ArrayList)Collection$_EL.stream((Collection)this.n(s)).filter((Predicate)new hrw(this, s)).filter((Predicate)new hrq((Map)new ConcurrentHashMap(), (Function)cdd.s, 2)).collect(Collectors.toCollection((Supplier)hrr.c));
    }
    
    public final boolean m() {
        return (boolean)this.f.c(hjq.B) || (boolean)this.f.c(hjq.C);
    }
}
