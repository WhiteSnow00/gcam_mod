import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import android.util.Log;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import android.os.Handler;
import java.util.concurrent.Future;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class koz implements krc
{
    public final Map a;
    public final Map b;
    public final Object c;
    public niz d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public Future j;
    private final ofb k;
    private final Handler l;
    
    public koz(final Set set, final Handler l) {
        this.k = ofi.d(mcn.k("EncWatch", 1));
        this.c = new Object();
        this.d = nii.a;
        this.e = false;
        this.f = false;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.l = l;
        this.b = new HashMap();
        this.a = new HashMap();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            this.a.put(iterator.next(), false);
        }
    }
    
    public static final kov d(final kod kod, final int n) {
        final kod a = kod.a;
        Label_0115: {
            switch (n - 1) {
                default: {
                    switch (kod.ordinal()) {
                        default: {
                            break Label_0115;
                        }
                        case 2: {
                            return kov.j;
                        }
                        case 1: {
                            return kov.a;
                        }
                        case 0: {
                            return kov.b;
                        }
                    }
                    break;
                }
                case 0: {
                    switch (kod.ordinal()) {
                        default: {
                            break Label_0115;
                        }
                        case 2: {
                            return kov.j;
                        }
                        case 1: {
                            return kov.c;
                        }
                        case 0: {
                            return kov.d;
                        }
                    }
                    break;
                }
            }
        }
        return kov.j;
    }
    
    public final void a(final kov kov) {
        final String value = String.valueOf(kov);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 13);
        sb.append("Found error: ");
        sb.append(value);
        Log.w("EncWatcher", sb.toString());
        synchronized (this.c) {
            if (kov == kov.d) {
                this.a.remove(kod.a);
            }
            monitorexit(this.c);
            if (this.d.g()) {
                this.l.post((Runnable)new koy(this, kov));
            }
        }
    }
    
    public final void b(final kod kod, final AtomicLong atomicLong) {
        if (this.e) {
            return;
        }
        synchronized (this.c) {
            if (this.a.containsKey(kod)) {
                String.valueOf(String.valueOf(kod)).length();
                this.a.put(kod, true);
                this.b.put(kod, atomicLong);
            }
            else {
                final String value = String.valueOf(kod);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
                sb.append("Unexpected track was started: ");
                sb.append(value);
                Log.w("EncWatcher", sb.toString());
            }
        }
    }
    
    public final void c() {
        synchronized (this.c) {
            if (this.j == null) {
                this.j = this.k.f(new kox(this), 0L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.c) {
            if (!this.e) {
                this.e = true;
                this.k.shutdown();
            }
        }
    }
}
