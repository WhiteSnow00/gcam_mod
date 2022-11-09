import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzs implements dkx, krc
{
    public static final nsd a;
    public final Object b;
    public final Object c;
    public lyp d;
    public final Executor e;
    public mao f;
    public final cxl g;
    public boolean h;
    public final Deque i;
    private final dsd j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/features/LowResImageExtractor");
    }
    
    public bzs(final dsd j, final Executor e, final cxl g) {
        this.b = new Object();
        this.c = new Object();
        this.h = true;
        this.j = j;
        this.e = e;
        this.g = g;
        this.i = new ConcurrentLinkedDeque();
    }
    
    public final void a() {
        final Object c = this.c;
        monitorenter(c);
        try {
            while (!this.i.isEmpty()) {
                this.i.removeFirst().a.close();
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    @Override
    public final void b(kvs a, final kwz kwz) {
        a = a.a();
        if (a != null) {
            a.j(new bzq(this, a, kwz));
        }
    }
    
    public final void c() {
        synchronized (this) {
            synchronized (this.b) {
                if (!this.h) {
                    return;
                }
                final lyp a = this.j.a("low-res");
                this.d = a;
                this.f = mao.a(a);
                this.h = false;
            }
        }
    }
    
    @Override
    public final void close() {
        this.e.execute(new bzp(this));
    }
}
