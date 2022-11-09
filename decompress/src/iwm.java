import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class iwm implements ViewTreeObserver$OnGlobalLayoutListener, krc
{
    public final AtomicReference a;
    public final List b;
    public final List c;
    public final Object d;
    public boolean e;
    public krc f;
    private final AtomicInteger g;
    
    public iwm(final View view) {
        this.f = bqx.r;
        this.a = new AtomicReference((V)view);
        this.g = new AtomicInteger(-1);
        this.d = new Object();
        this.b = Collections.synchronizedList(new ArrayList<Object>());
        this.c = Collections.synchronizedList(new ArrayList<Object>());
        this.e = false;
    }
    
    public final void a() {
        synchronized (this.d) {
            final View view = this.a.get();
            if (this.e && view != null) {
                this.f.close();
                this.f = kqz.a;
                this.e = false;
            }
        }
    }
    
    public final void close() {
        this.a();
        this.b.clear();
        this.c.clear();
        this.a.set(null);
    }
    
    public final void onGlobalLayout() {
        final View view = this.a.get();
        if (view == null) {
            return;
        }
        int visibility;
        if ((visibility = view.getVisibility()) == 0) {
            if (!view.isShown()) {
                return;
            }
            visibility = 0;
        }
        int n;
        if ((n = visibility) == 4) {
            if (view.isShown()) {
                return;
            }
            n = 4;
        }
        if (n != 8 || !view.isShown()) {
            final int andSet = this.g.getAndSet(n);
            if (andSet != n) {
                if (n == 0) {
                    final Iterator iterator = this.b.iterator();
                    while (iterator.hasNext()) {
                        ((Runnable)iterator.next()).run();
                    }
                }
                else if (andSet >= 0) {
                    final Iterator iterator2 = this.c.iterator();
                    while (iterator2.hasNext()) {
                        ((Runnable)iterator2.next()).run();
                    }
                }
            }
        }
    }
}
