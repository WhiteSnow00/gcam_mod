import android.util.Log;
import android.database.Cursor;
import android.os.Looper;
import java.util.concurrent.locks.Lock;
import java.util.Set;
import java.util.Collections;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Map;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aq
{
    public Executor a;
    public afd b;
    public final an c;
    public boolean d;
    @Deprecated
    public List e;
    protected final Map f;
    public final ReentrantReadWriteLock g;
    public final Map h;
    @Deprecated
    public volatile afh i;
    private final ThreadLocal j;
    
    public aq() {
        this.g = new ReentrantReadWriteLock();
        this.j = new ThreadLocal();
        DesugarCollections.synchronizedMap((Map)new HashMap());
        this.c = this.a();
        this.h = new HashMap();
        this.f = new HashMap();
    }
    
    public static final Object q(final Class clazz, final afd afd) {
        if (clazz.isInstance(afd)) {
            return afd;
        }
        return null;
    }
    
    protected abstract an a();
    
    protected abstract afd b(final af p0);
    
    protected Map c() {
        return Collections.emptyMap();
    }
    
    public Set d() {
        return Collections.emptySet();
    }
    
    final Lock e() {
        return this.g.readLock();
    }
    
    public final void f() {
        if (this.d) {
            return;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
    
    public final void g() {
        if (!this.k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
    
    @Deprecated
    public final void h() {
        this.f();
        this.f();
        final afh a = this.b.a();
        this.c.b(a);
        if (a.k()) {
            a.e();
            return;
        }
        a.d();
    }
    
    @Deprecated
    public final void i() {
        this.b.a().f();
        if (!this.k()) {
            final an c = this.c;
            if (c.e.compareAndSet(false, true)) {
                final a k = c.k;
                c.d.a.execute(c.i);
            }
        }
    }
    
    @Deprecated
    public final void j() {
        this.b.a().h();
    }
    
    public final boolean k() {
        return this.b.a().i();
    }
    
    public final boolean l() {
        final afh i = this.i;
        return i != null && i.j();
    }
    
    public final afn m(final String s) {
        this.f();
        this.g();
        return this.b.a().l(s);
    }
    
    public List n() {
        return Collections.emptyList();
    }
    
    public final Cursor o(final aff aff) {
        this.f();
        this.g();
        return this.b.a().a(aff);
    }
    
    public final void p(final afh afh) {
        final an c = this.c;
        synchronized (c) {
            if (c.f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            afh.g("PRAGMA temp_store = MEMORY;");
            afh.g("PRAGMA recursive_triggers='ON';");
            afh.g("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c.b(afh);
            c.j = afh.l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            c.f = true;
        }
    }
}
