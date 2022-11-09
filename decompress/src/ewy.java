import j$.util.function.Consumer;
import j$.lang.Iterable$_EL;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewy
{
    private static final Bundle l;
    final List a;
    final List b;
    public ewx c;
    public ewx d;
    public ewx e;
    public ewx f;
    public ewx g;
    public ewx h;
    public ewx i;
    public ewx j;
    private final HashSet m;
    
    static {
        l = new Bundle();
    }
    
    public ewy() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.m = new HashSet();
    }
    
    public static final String d(final exn exn) {
        String s;
        if (exn instanceof exk) {
            if (exn instanceof exo) {
                s = ((exo)exn).a();
            }
            else {
                s = exn.getClass().getName();
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    public static final Bundle e(final exn exn, final Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            final String d = d(exn);
            if (d != null) {
                bundle2 = bundle.getBundle(d);
            }
            else {
                bundle2 = ewy.l;
            }
        }
        else {
            bundle2 = null;
        }
        return bundle2;
    }
    
    public final void a(final ewx ewx) {
        this.b.remove(ewx);
    }
    
    public final void b(final ewx ewx) {
        for (int i = 0; i < this.a.size(); ++i) {
            ewx.a((exn)this.a.get(i));
        }
        this.b.add(ewx);
    }
    
    public final void c(final exn exn) {
        njo.p(Looper.getMainLooper().isCurrentThread(), "addObserver must be called on the main thread.");
        final String d = d(exn);
        if (d != null) {
            if (this.m.contains(d)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", d));
            }
            this.m.add(d);
        }
        this.a.add(exn);
        Iterable$_EL.forEach((Iterable)this.b, (Consumer)new eww(exn));
    }
}
