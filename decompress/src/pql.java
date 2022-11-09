import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.io.Closeable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pql implements Executor, Closeable
{
    public static final pqe a;
    public final pne b;
    public final AtomicReferenceArray c;
    public final pne d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final ppx i;
    public final ppx j;
    private final pnc k;
    
    static {
        a = new pqe("NOT_IN_STACK");
    }
    
    public pql(final int e, final int f, final long g) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = "DefaultDispatcher";
        if (e <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Core pool size ");
            sb.append(e);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (f < e) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Max pool size ");
            sb2.append(f);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(e);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (f > 2097150) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Max pool size ");
            sb3.append(f);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (g > 0L) {
            this.i = new ppx();
            this.j = new ppx();
            this.b = plv.f(0L);
            this.c = new AtomicReferenceArray(f + 1);
            this.d = plv.f((long)e << 42);
            this.k = plv.i();
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Idle worker keep alive time ");
        sb4.append(g);
        sb4.append(" must be positive");
        throw new IllegalArgumentException(sb4.toString().toString());
    }
    
    public static /* synthetic */ void f(final pql pql, final Runnable runnable) {
        pql.b(runnable, pqp.a, false);
    }
    
    public static final void g(final pqq pqq) {
        try {
            pqq.run();
        }
        finally {
            try {
                final Thread currentThread = Thread.currentThread();
                final Throwable t;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
            }
            finally {}
        }
    }
    
    public static final pqq h(final Runnable runnable, final pqr h) {
        runnable.getClass();
        h.getClass();
        final long a = pqt.a;
        final long nanoTime = System.nanoTime();
        if (runnable instanceof pqq) {
            final pqq pqq = (pqq)runnable;
            pqq.g = nanoTime;
            pqq.h = h;
            return pqq;
        }
        return new pqs(runnable, nanoTime, h);
    }
    
    private final int i() {
        synchronized (this.c) {
            if (this.e()) {
                return -1;
            }
            final long b = this.d.b;
            final int n = (int)(b & 0x1FFFFFL);
            final int e = poe.e(n - (int)((b & 0x3FFFFE00000L) >> 21), 0);
            if (e >= this.e) {
                return 0;
            }
            if (n >= this.f) {
                return 0;
            }
            final int n2 = (int)(this.d.b & 0x1FFFFFL) + 1;
            if (this.c.get(n2) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            final pqk pqk = new pqk(this, n2);
            this.c.set(n2, pqk);
            final pne d = this.d;
            final int a = png.a;
            if (n2 == (int)(0x1FFFFFL & pne.a.incrementAndGet(d))) {
                pqk.start();
                monitorexit(this.c);
                return e + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
    
    private final pqk j() {
        Thread currentThread;
        if (!((currentThread = Thread.currentThread()) instanceof pqk)) {
            currentThread = null;
        }
        final pqk pqk = (pqk)currentThread;
        if (pqk != null && plr.b(pqk.d, this)) {
            return pqk;
        }
        return null;
    }
    
    private final boolean k(final long n) {
        if (poe.e((int)(0x1FFFFFL & n) - (int)((n & 0x3FFFFE00000L) >> 21), 0) < this.e) {
            final int i = this.i();
            if (i == 1) {
                if (this.e > 1) {
                    this.i();
                }
            }
            else if (i <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    private final boolean l() {
        pqk pqk = null;
    Block_3:
        do {
            final pne b = this.b;
            while (true) {
                int m;
                long b2;
                do {
                    b2 = b.b;
                    pqk = (pqk)this.c.get((int)(0x1FFFFFL & b2));
                    if (pqk != null) {
                        m = m(pqk);
                    }
                    else {
                        pqk = null;
                        final boolean b3 = false;
                        if (pqk != null) {
                            continue Block_3;
                        }
                        return b3;
                    }
                } while (m < 0 || !this.b.b(b2, (2097152L + b2 & 0xFFFFFFFFFFE00000L) | (long)m));
                pqk.nextParkedWorker = pql.a;
                continue;
            }
        } while (!pqk.b.c(-1, 0));
        LockSupport.unpark(pqk);
        return true;
    }
    
    private static final int m(pqk pqk) {
        for (Object o = pqk.nextParkedWorker; o != pql.a; o = pqk.nextParkedWorker) {
            if (o == null) {
                return 0;
            }
            pqk = (pqk)o;
            final int indexInArray = pqk.indexInArray;
            if (indexInArray != 0) {
                return indexInArray;
            }
        }
        return -1;
    }
    
    public final int a() {
        return (int)(this.d.b & 0x1FFFFFL);
    }
    
    public final void b(final Runnable runnable, final pqr pqr, final boolean b) {
        runnable.getClass();
        pqr.getClass();
        final pqq h = h(runnable, pqr);
        final pqk j = this.j();
        boolean b2 = true;
        pqq c = null;
        Label_0088: {
            if (j != null) {
                if (j.e != 5) {
                    if (h.h.j() != 0 || j.e != 2) {
                        j.c = true;
                        c = j.a.c(h, b);
                        break Label_0088;
                    }
                }
            }
            c = h;
        }
        if (c != null) {
            boolean b3;
            if (c.h.j() == 1) {
                b3 = this.j.d(c);
            }
            else {
                b3 = this.i.d(c);
            }
            if (!b3) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.h);
                sb.append(" was terminated");
                throw new RejectedExecutionException(sb.toString());
            }
        }
        if (!b || j == null) {
            b2 = false;
        }
        if (h.h.j() != 0) {
            final long a = this.d.a(2097152L);
            if (!b2) {
                if (!this.l() && !this.k(a)) {
                    this.l();
                }
            }
            return;
        }
        if (b2) {
            return;
        }
        this.d();
    }
    
    public final void c(final pqk pqk, final int n, final int n2) {
        pqk.getClass();
        final pne b = this.b;
        int m;
        long b2;
        do {
            b2 = b.b;
            if ((m = (int)(0x1FFFFFL & b2)) == n) {
                if (n2 == 0) {
                    m = m(pqk);
                }
                else {
                    m = n2;
                }
            }
        } while (m < 0 || !this.b.b(b2, (2097152L + b2 & 0xFFFFFFFFFFE00000L) | (long)m));
    }
    
    @Override
    public final void close() {
        if (!this.k.b()) {
            return;
        }
        final pqk j = this.j();
        Object o = this.c;
        monitorenter(o);
        try {
            final int n = (int)(this.d.b & 0x1FFFFFL);
            monitorexit(o);
            if (n > 0) {
                int n2 = 1;
                while (true) {
                    o = this.c.get(n2);
                    ((AtomicReferenceArray)o).getClass();
                    o = o;
                    if (o != j) {
                        while (((Thread)o).isAlive()) {
                            LockSupport.unpark((Thread)o);
                            ((Thread)o).join(10000L);
                        }
                        final int e = ((pqk)o).e;
                        final boolean a = pod.a;
                        o = ((pqk)o).a;
                        final ppx i = this.j;
                        i.getClass();
                        final pqq pqq = (pqq)((pqu)o).b.a(null);
                        if (pqq != null) {
                            i.d(pqq);
                        }
                        while (true) {
                            final pqq e2 = ((pqu)o).e();
                            if (e2 == null) {
                                break;
                            }
                            i.d(e2);
                        }
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            this.j.c();
            this.i.c();
            while (true) {
                if (j == null || (o = j.b(true)) == null) {
                    o = this.i.b();
                }
                Object o2;
                if ((o2 = o) == null) {
                    o2 = this.j.b();
                }
                if (o2 == null) {
                    break;
                }
                g((pqq)o2);
            }
            if (j != null) {
                j.d(5);
            }
            final boolean a2 = pod.a;
            o = this.b;
            final int a3 = png.a;
            ((pne)o).b = 0L;
            this.d.b = 0L;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void d() {
        if (!this.l()) {
            if (this.k(this.d.b)) {
                return;
            }
            this.l();
        }
    }
    
    public final boolean e() {
        return this.k.a();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        f(this, runnable);
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        final int length = this.c.length();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i = 1; i < length; ++i) {
            final pqk pqk = this.c.get(i);
            if (pqk != null) {
                final pqu a = pqk.a;
                int a2;
                if (a.b.a != null) {
                    a2 = a.a() + 1;
                }
                else {
                    a2 = a.a();
                }
                final int e = pqk.e;
                if (e == 0) {
                    throw null;
                }
                switch (e - 1) {
                    case 4: {
                        ++n5;
                        break;
                    }
                    case 3: {
                        ++n4;
                        if (a2 > 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(String.valueOf(a2));
                            sb.append("d");
                            list.add(sb.toString());
                            break;
                        }
                        break;
                    }
                    case 2: {
                        ++n3;
                        break;
                    }
                    case 1: {
                        ++n2;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(String.valueOf(a2));
                        sb2.append("b");
                        list.add(sb2.toString());
                        break;
                    }
                    case 0: {
                        ++n;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(String.valueOf(a2));
                        sb3.append("c");
                        list.add(sb3.toString());
                        break;
                    }
                }
            }
        }
        final long b = this.d.b;
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(poe.b(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.e);
        sb4.append(", max = ");
        sb4.append(this.f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(n);
        sb4.append(", blocking = ");
        sb4.append(n2);
        sb4.append(", parked = ");
        sb4.append(n3);
        sb4.append(", dormant = ");
        sb4.append(n4);
        sb4.append(", terminated = ");
        sb4.append(n5);
        sb4.append("}, running workers queues = ");
        sb4.append(list);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.a());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.a());
        sb4.append(", Control State {created workers= ");
        sb4.append((int)(0x1FFFFFL & b));
        sb4.append(", blocking tasks = ");
        sb4.append((int)((0x3FFFFE00000L & b) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.e - (int)((0x7FFFFC0000000000L & b) >> 42));
        sb4.append("}]");
        return sb4.toString();
    }
}
