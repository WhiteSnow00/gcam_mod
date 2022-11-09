import java.util.concurrent.Executor;
import java.util.Iterator;
import android.media.SoundPool$OnLoadCompleteListener;
import android.media.SoundPool;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import java.util.Collection;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htw implements htr, krc
{
    public static final nsd a;
    public final Object b;
    public final SparseArray c;
    public boolean d;
    public final Collection e;
    private final Context f;
    private final ExecutorService g;
    private SoundPool h;
    private final klj i;
    private final pii j;
    private final SoundPool$OnLoadCompleteListener k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/soundplayer/SoundPlayerImpl");
    }
    
    public htw(final Context f, final klj i, final pii j, final ExecutorService g) {
        this.e = nmj.c(5);
        this.k = (SoundPool$OnLoadCompleteListener)new htt(this);
        this.f = f;
        this.b = new Object();
        this.c = new SparseArray();
        this.i = i;
        this.j = j;
        this.g = g;
        this.d = false;
    }
    
    @Override
    public final oey a(final int a) {
        synchronized (this.b) {
            if (!this.d) {
                Object o = this.c.get(a);
                if (o == null) {
                    o = new htv();
                    ((htv)o).a = a;
                    this.c.put(a, o);
                    ((htv)o).b = this.f().load(this.f, a, 1);
                }
                return ((htv)o).c;
            }
            return ofi.n(false);
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.b) {
            if (!this.d) {
                this.f().autoPause();
            }
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.b) {
            if (!this.d) {
                this.f().autoResume();
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.h != null) {
                this.c.clear();
                final SoundPool h = this.h;
                nov.z(h);
                h.autoPause();
                final SoundPool h2 = this.h;
                nov.z(h2);
                h2.release();
                this.h = null;
            }
        }
    }
    
    @Override
    public final void d() {
        final Object b = this.b;
        monitorenter(b);
        try {
            if (!this.d) {
                final Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    this.f().stop((int)iterator.next());
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void e(final int n, final float n2) {
        if (!(boolean)this.i.aQ()) {
            return;
        }
        ofi.w(this.a(n), new htu(this, n, new int[] { -1 }, n2), this.g);
    }
    
    public final SoundPool f() {
        if (this.h == null && !this.d) {
            final SoundPool h = (SoundPool)this.j.get();
            nov.z(this.h = h);
            h.setOnLoadCompleteListener(this.k);
        }
        final SoundPool h2 = this.h;
        nov.z(h2);
        return h2;
    }
    
    public final void g(final int n) {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            final htv htv = (htv)this.c.get(n);
            if (htv == null) {
                return;
            }
            this.c.remove(n);
            this.f().unload(htv.b);
        }
    }
}
