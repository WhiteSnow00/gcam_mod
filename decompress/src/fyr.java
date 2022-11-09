import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyr extends kxc
{
    public final ReentrantLock a;
    public final Condition b;
    public long c;
    private final TreeMap d;
    private long e;
    private final Set f;
    
    public fyr() {
        final ReentrantLock a = new ReentrantLock();
        this.a = a;
        this.b = a.newCondition();
        this.d = new TreeMap();
        this.c = -1L;
        this.e = -1L;
        this.f = new HashSet();
    }
    
    @Override
    public final void aN(final kvx kvx) {
        this.a.lock();
        try {
            final long c = kvx.c;
            if (this.c < c) {
                this.c = c;
                this.e = kvx.a;
                this.b.signal();
                while (!this.d.isEmpty() && this.d.firstKey() >= this.c) {
                    final Map.Entry<K, Runnable> pollFirstEntry = this.d.pollFirstEntry();
                    pollFirstEntry.getClass();
                    pollFirstEntry.getValue().run();
                }
                for (final fyq fyq : this.f) {
                    final long c2 = this.c;
                    final long a = fyq.a;
                    final long b = fyq.b;
                    if (c2 % 0L != 0L) {
                        continue;
                    }
                    final Runnable c3 = fyq.c;
                    throw null;
                }
            }
            this.a.unlock();
        }
        finally {
            this.a.unlock();
            while (true) {}
        }
    }
    
    public final long d() {
        this.a.lock();
        try {
            return this.e;
        }
        finally {
            this.a.unlock();
        }
    }
}
