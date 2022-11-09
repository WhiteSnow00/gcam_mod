import java.util.concurrent.TimeoutException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zm implements oey
{
    static final boolean a;
    static final zd b;
    private static final Logger c;
    private static final Object d;
    volatile zh listeners;
    volatile Object value;
    volatile zl waiters;
    
    static {
        a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        c = Logger.getLogger(zm.class.getName());
        zk b2;
        try {
            final zi zi = new zi(AtomicReferenceFieldUpdater.newUpdater(zl.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zl.class, zl.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zm.class, zl.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zm.class, zh.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zm.class, Object.class, "value"));
        }
        finally {
            b2 = new zk();
        }
        b = b2;
        final Throwable t;
        if (t != null) {
            zm.c.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        d = new Object();
    }
    
    protected zm() {
    }
    
    static Object a(final oey oey) {
        if (oey instanceof zm) {
            Object o2;
            final Object o = o2 = ((zm)oey).value;
            if (o instanceof ze) {
                final ze ze = (ze)o;
                o2 = o;
                if (ze.c) {
                    final Throwable d = ze.d;
                    if (d != null) {
                        o2 = new ze(false, d);
                    }
                    else {
                        o2 = ze.b;
                    }
                }
            }
            return o2;
        }
        final boolean cancelled = oey.isCancelled();
        if ((zm.a ^ true) & cancelled) {
            return ze.b;
        }
        try {
            Object o3;
            if ((o3 = b(oey)) == null) {
                o3 = zm.d;
            }
            return o3;
        }
        catch (final CancellationException ex) {
            if (!cancelled) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(oey);
                return new zg(new IllegalArgumentException(sb.toString(), ex));
            }
            return new ze(false, ex);
        }
        catch (final ExecutionException ex2) {
            return new zg(ex2.getCause());
        }
        finally {
            final Throwable t;
            return new zg(t);
        }
    }
    
    static Object b(final Future future) {
        int n = 0;
        while (true) {
            try {
                final Object value = future.get();
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
                return value;
            }
            catch (final InterruptedException ex) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    static void e(final zm zm) {
        final zh zh = null;
        zm a = zm;
        zh next = zh;
    Label_0006:
        while (true) {
            zl zl = a.waiters;
            if (zm.b.e(a, zl, zl.a)) {
                while (zl != null) {
                    final Thread thread = zl.thread;
                    if (thread != null) {
                        zl.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zl = zl.next;
                }
                zh listeners;
                do {
                    listeners = a.listeners;
                } while (!zm.b.c(a, listeners, zh.a));
                zh next2 = listeners;
                zh zh3;
                while (true) {
                    final zh zh2 = next2;
                    zh3 = next;
                    if (zh2 == null) {
                        break;
                    }
                    next2 = zh2.next;
                    zh2.next = next;
                    next = zh2;
                }
                while (zh3 != null) {
                    next = zh3.next;
                    final Runnable b = zh3.b;
                    if (b instanceof zj) {
                        final zj zj = (zj)b;
                        a = zj.a;
                        if (a.value == zj && zm.b.d(a, zj, a(zj.b))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        j(b, zh3.c);
                    }
                    zh3 = next;
                }
                break;
            }
        }
    }
    
    static void g(final Object o) {
        if (o != null) {
            return;
        }
        throw null;
    }
    
    private final String h(final Object o) {
        if (o == this) {
            return "this future";
        }
        return String.valueOf(o);
    }
    
    private final void i(final StringBuilder sb) {
        try {
            final Object b = b(this);
            sb.append("SUCCESS, result=[");
            sb.append(this.h(b));
            sb.append("]");
        }
        catch (final RuntimeException ex) {
            sb.append("UNKNOWN, cause=[");
            sb.append(ex.getClass());
            sb.append(" thrown from get()]");
        }
        catch (final CancellationException ex2) {
            sb.append("CANCELLED");
        }
        catch (final ExecutionException ex3) {
            sb.append("FAILURE, cause=[");
            sb.append(ex3.getCause());
            sb.append("]");
        }
    }
    
    private static void j(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger c = zm.c;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            c.log(severe, sb.toString(), ex);
        }
    }
    
    private final void k(zl waiters) {
        waiters.thread = null;
    Label_0005:
        while (true) {
            waiters = this.waiters;
            if (waiters != zl.a) {
                zl zl = null;
                while (waiters != null) {
                    final zl next = waiters.next;
                    zl zl2;
                    if (waiters.thread != null) {
                        zl2 = waiters;
                    }
                    else if (zl != null) {
                        zl.next = next;
                        zl2 = zl;
                        if (zl.thread == null) {
                            continue Label_0005;
                        }
                    }
                    else {
                        zl2 = zl;
                        if (!zm.b.e(this, waiters, next)) {
                            continue Label_0005;
                        }
                    }
                    waiters = next;
                    zl = zl2;
                }
                break;
            }
            break;
        }
    }
    
    private static final Object l(final Object o) {
        if (o instanceof ze) {
            final Throwable d = ((ze)o).d;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(d);
            throw ex;
        }
        if (!(o instanceof zg)) {
            Object o2;
            if ((o2 = o) == zm.d) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((zg)o).b);
    }
    
    protected String c() {
        final Object value = this.value;
        if (value instanceof zj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            sb.append(this.h(((zj)value).b));
            sb.append("]");
            return sb.toString();
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("remaining delay=[");
            sb2.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        Object o = this.value;
        final boolean b2 = false;
        boolean b5;
        if (o == null | o instanceof zj) {
            ze ze;
            if (zm.a) {
                ze = new ze(b, new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                ze = ze.a;
            }
            else {
                ze = ze.b;
            }
            boolean b3 = false;
            zm zm = this;
            Block_10: {
                while (true) {
                    if (zm.b.d(zm, o, ze)) {
                        e(zm);
                        if (!(o instanceof zj)) {
                            break;
                        }
                        final oey b4 = ((zj)o).b;
                        if (!(b4 instanceof zm)) {
                            b4.cancel(b);
                            break;
                        }
                        zm = (zm)b4;
                        o = zm.value;
                        if (!(o == null | o instanceof zj)) {
                            b5 = true;
                            return b5;
                        }
                        b3 = true;
                    }
                    else {
                        if (!((o = zm.value) instanceof zj)) {
                            break Block_10;
                        }
                        continue;
                    }
                }
                b5 = true;
                return b5;
            }
            b5 = b3;
        }
        else {
            b5 = b2;
        }
        return b5;
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        g(runnable);
        g(executor);
        zh next = this.listeners;
        if (next != zh.a) {
            final zh zh = new zh(runnable, executor);
            do {
                zh.next = next;
                if (zm.b.c(this, next, zh)) {
                    return;
                }
            } while ((next = this.listeners) != zh.a);
        }
        j(runnable, executor);
    }
    
    protected boolean f(final Object o) {
        Object d = o;
        if (o == null) {
            d = zm.d;
        }
        if (zm.b.d(this, null, d)) {
            e(this);
            return true;
        }
        return false;
    }
    
    @Override
    public final Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        if (value != null & (value instanceof zj ^ true)) {
            return l(value);
        }
        zl zl = this.waiters;
        if (zl != zl.a) {
            final zl zl2 = new zl();
            do {
                zl2.a(zl);
                if (zm.b.e(this, zl, zl2)) {
                    Object value2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.k(zl2);
                            throw new InterruptedException();
                        }
                        value2 = this.value;
                    } while (!(value2 != null & (value2 instanceof zj ^ true)));
                    return l(value2);
                }
            } while ((zl = this.waiters) != zl.a);
        }
        return l(this.value);
    }
    
    @Override
    public final Object get(long convert, final TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        final int n = 1;
        if (value != null & (value instanceof zj ^ true)) {
            return l(value);
        }
        long n2;
        if (nanos > 0L) {
            n2 = System.nanoTime() + nanos;
        }
        else {
            n2 = 0L;
        }
        Label_0249: {
            if (nanos >= 1000L) {
                zl zl = this.waiters;
                if (zl != zl.a) {
                    final zl zl2 = new zl();
                    do {
                        zl2.a(zl);
                        if (zm.b.e(this, zl, zl2)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.k(zl2);
                                    throw new InterruptedException();
                                }
                                final Object value2 = this.value;
                                if (value2 != null & (value2 instanceof zj ^ true)) {
                                    return l(value2);
                                }
                                nanos = n2 - System.nanoTime();
                                if (nanos < 1000L) {
                                    this.k(zl2);
                                    break Label_0249;
                                }
                            }
                        }
                    } while ((zl = this.waiters) != zl.a);
                }
                return l(this.value);
            }
        }
        while (nanos > 0L) {
            final Object value3 = this.value;
            if (value3 != null & (value3 instanceof zj ^ true)) {
                return l(value3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = n2 - System.nanoTime();
        }
        final String string = this.toString();
        final String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        final StringBuilder sb = new StringBuilder();
        sb.append("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        final String string2 = sb.toString();
        String string4;
        if (nanos + 1000L < 0L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(" (plus ");
            final String string3 = sb2.toString();
            final long n3 = -nanos;
            convert = timeUnit.convert(n3, TimeUnit.NANOSECONDS);
            final long n4 = n3 - timeUnit.toNanos(convert);
            int n5;
            if (convert != 0L) {
                if (n4 > 1000L) {
                    n5 = n;
                }
                else {
                    n5 = 0;
                }
            }
            else {
                n5 = n;
            }
            String s2;
            if (convert > 0L) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string3);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String s = sb3.toString();
                if (n5 != 0) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(s);
                    sb4.append(",");
                    s = sb4.toString();
                }
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(s);
                sb5.append(" ");
                s2 = sb5.toString();
            }
            else {
                s2 = string3;
            }
            if (n5 != 0) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(s2);
                sb6.append(n4);
                sb6.append(" nanoseconds ");
                s2 = sb6.toString();
            }
            final StringBuilder sb7 = new StringBuilder();
            sb7.append(s2);
            sb7.append("delay)");
            string4 = sb7.toString();
        }
        else {
            string4 = string2;
        }
        if (this.isDone()) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(string4);
            sb8.append(" but future completed as timeout expired");
            throw new TimeoutException(sb8.toString());
        }
        final StringBuilder sb9 = new StringBuilder();
        sb9.append(string4);
        sb9.append(" for ");
        sb9.append(string);
        throw new TimeoutException(sb9.toString());
    }
    
    @Override
    public final boolean isCancelled() {
        return this.value instanceof ze;
    }
    
    @Override
    public final boolean isDone() {
        final Object value = this.value;
        return (value instanceof zj ^ true) & value != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.isCancelled()) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.i(sb);
        }
        else {
            String s;
            try {
                s = this.c();
            }
            catch (final RuntimeException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception thrown from implementation: ");
                sb2.append(ex.getClass());
                s = sb2.toString();
            }
            if (s != null && !s.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(s);
                sb.append("]");
            }
            else if (this.isDone()) {
                this.i(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
