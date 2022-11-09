import android.os.Looper;
import android.app.Activity;
import android.content.Intent;
import java.util.Iterator;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import j$.util.DesugarCollections;
import java.util.Map;
import android.os.Bundle;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jts extends ei implements jsx
{
    public static final WeakHashMap a;
    public int b;
    public Bundle c;
    private final Map d;
    
    static {
        a = new WeakHashMap();
    }
    
    public jts() {
        this.d = DesugarCollections.synchronizedMap((Map)new yu());
        this.b = 0;
    }
    
    @Override
    public final void B(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.B(s, fileDescriptor, printWriter, array);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {}
    }
    
    @Override
    public final void D(final int n, final int n2, final Intent intent) {
        super.D(n, n2, intent);
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).c(n, n2, intent);
        }
    }
    
    @Override
    public final void E() {
        super.E();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {}
    }
    
    @Override
    public final void G() {
        super.G();
        this.b = 3;
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }
    
    @Override
    public final void b(final LifecycleCallback lifecycleCallback) {
        if (this.d.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        this.d.put("ConnectionlessLifecycleHelper", lifecycleCallback);
        if (this.b > 0) {
            new kax(Looper.getMainLooper()).post((Runnable)new jtr(this, lifecycleCallback));
        }
    }
    
    @Override
    public final LifecycleCallback c(final Class clazz) {
        return clazz.cast(this.d.get("ConnectionlessLifecycleHelper"));
    }
    
    @Override
    public final void e(final Bundle c) {
        super.e(c);
        this.b = 1;
        this.c = c;
        for (final Map.Entry<K, LifecycleCallback> entry : this.d.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (c != null) {
                bundle = c.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.d(bundle);
        }
    }
    
    @Override
    public final void h(final Bundle bundle) {
        for (final Map.Entry<K, LifecycleCallback> entry : this.d.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().g(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    @Override
    public final void i() {
        super.i();
        this.b = 2;
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).i();
        }
    }
    
    @Override
    public final void j() {
        super.j();
        this.b = 4;
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }
}
