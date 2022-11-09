import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import android.app.Activity;
import j$.util.DesugarCollections;
import java.util.Map;
import android.os.Bundle;
import java.util.WeakHashMap;
import android.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsz extends Fragment implements jsx
{
    public static final WeakHashMap a;
    public int b;
    public Bundle c;
    private final Map d;
    
    static {
        a = new WeakHashMap();
    }
    
    public jsz() {
        this.d = DesugarCollections.synchronizedMap((Map)new yu());
        this.b = 0;
    }
    
    public final Activity a() {
        return this.getActivity();
    }
    
    public final void b(final LifecycleCallback lifecycleCallback) {
        if (this.d.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        this.d.put("ConnectionlessLifecycleHelper", lifecycleCallback);
        if (this.b > 0) {
            new kax(Looper.getMainLooper()).post((Runnable)new jsy(this, lifecycleCallback));
        }
    }
    
    public final LifecycleCallback c(final Class clazz) {
        return clazz.cast(this.d.get("ConnectionlessLifecycleHelper"));
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {}
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).c(n, n2, intent);
        }
    }
    
    public final void onCreate(final Bundle c) {
        super.onCreate(c);
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
    
    public final void onDestroy() {
        super.onDestroy();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {}
    }
    
    public final void onResume() {
        super.onResume();
        this.b = 3;
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<K, LifecycleCallback> entry : this.d.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().g(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.b = 2;
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).i();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.b = 4;
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }
}
