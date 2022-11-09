import java.util.concurrent.TimeoutException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
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

public final class aox implements oey
{
    static final boolean a;
    static final aoo b;
    public static final Object c;
    private static final Logger g;
    volatile Object d;
    volatile aos e;
    volatile aow f;
    
    static {
        a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        g = Logger.getLogger(aox.class.getName());
        aov b2;
        try {
            final aot aot = new aot(AtomicReferenceFieldUpdater.newUpdater(aow.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(aow.class, aow.class, "c"), AtomicReferenceFieldUpdater.newUpdater(aox.class, aow.class, "f"), AtomicReferenceFieldUpdater.newUpdater(aox.class, aos.class, "e"), AtomicReferenceFieldUpdater.newUpdater(aox.class, Object.class, "d"));
        }
        finally {
            b2 = new aov();
        }
        b = b2;
        final Throwable t;
        if (t != null) {
            aox.g.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        c = new Object();
    }
    
    protected aox() {
    }
    
    static Object a(final oey oey) {
        if (oey instanceof aox) {
            Object o2;
            final Object o = o2 = ((aox)oey).d;
            if (o instanceof aop) {
                final aop aop = (aop)o;
                o2 = o;
                if (aop.c) {
                    final Throwable d = aop.d;
                    if (d != null) {
                        o2 = new aop(false, d);
                    }
                    else {
                        o2 = aop.b;
                    }
                }
            }
            return o2;
        }
        final boolean cancelled = oey.isCancelled();
        if ((aox.a ^ true) & cancelled) {
            return aop.b;
        }
        try {
            Object o3;
            if ((o3 = i(oey)) == null) {
                o3 = aox.c;
            }
            return o3;
        }
        catch (final CancellationException ex) {
            if (!cancelled) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(oey);
                return new aor(new IllegalArgumentException(sb.toString(), ex));
            }
            return new aop(false, ex);
        }
        catch (final ExecutionException ex2) {
            return new aor(ex2.getCause());
        }
        finally {
            final Throwable t;
            return new aor(t);
        }
    }
    
    static void b(final aox aox) {
        final aos aos = null;
        aox a = aox;
        aos d = aos;
    Label_0006:
        while (true) {
            aow aow = a.f;
            if (aox.b.e(a, aow, aow.a)) {
                while (aow != null) {
                    final Thread b = aow.b;
                    if (b != null) {
                        aow.b = null;
                        LockSupport.unpark(b);
                    }
                    aow = aow.c;
                }
                aos e;
                do {
                    e = a.e;
                } while (!aox.b.c(a, e, aos.a));
                aos d2 = e;
                aos aos3;
                while (true) {
                    final aos aos2 = d2;
                    aos3 = d;
                    if (aos2 == null) {
                        break;
                    }
                    d2 = aos2.d;
                    aos2.d = d;
                    d = aos2;
                }
                while (aos3 != null) {
                    d = aos3.d;
                    final Runnable b2 = aos3.b;
                    if (b2 instanceof aou) {
                        final aou aou = (aou)b2;
                        a = aou.a;
                        if (a.d == aou && aox.b.d(a, aou, a(aou.b))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        l(b2, aos3.c);
                    }
                    aos3 = d;
                }
                break;
            }
        }
    }
    
    static void c(final Object o) {
        if (o != null) {
            return;
        }
        throw null;
    }
    
    public static aox h() {
        return new aox();
    }
    
    private static Object i(final Future future) {
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
    
    private final String j(final Object o) {
        if (o == this) {
            return "this future";
        }
        return String.valueOf(o);
    }
    
    private final void k(final StringBuilder sb) {
        try {
            final Object i = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(this.j(i));
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
    
    private static void l(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger g = aox.g;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            g.log(severe, sb.toString(), ex);
        }
    }
    
    private final void m(aow f) {
        f.b = null;
    Label_0005:
        while (true) {
            f = this.f;
            if (f != aow.a) {
                aow aow = null;
                while (f != null) {
                    final aow c = f.c;
                    aow aow2;
                    if (f.b != null) {
                        aow2 = f;
                    }
                    else if (aow != null) {
                        aow.c = c;
                        aow2 = aow;
                        if (aow.b == null) {
                            continue Label_0005;
                        }
                    }
                    else {
                        aow2 = aow;
                        if (!aox.b.e(this, f, c)) {
                            continue Label_0005;
                        }
                    }
                    f = c;
                    aow = aow2;
                }
                break;
            }
            break;
        }
    }
    
    private static final Object n(final Object o) {
        if (o instanceof aop) {
            final Throwable d = ((aop)o).d;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(d);
            throw ex;
        }
        if (!(o instanceof aor)) {
            Object o2;
            if ((o2 = o) == aox.c) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((aor)o).b);
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        Object o = this.d;
        final boolean b2 = false;
        boolean b6;
        if (o == null | o instanceof aou) {
            aop aop;
            if (aox.a) {
                aop = new aop(b, new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                aop = aop.a;
            }
            else {
                aop = aop.b;
            }
            boolean b3 = false;
            oey b4 = this;
            Block_10: {
                while (true) {
                    final aoo b5 = aox.b;
                    final aox aox = (aox)b4;
                    if (b5.d(aox, o, aop)) {
                        b(aox);
                        if (!(o instanceof aou)) {
                            break;
                        }
                        b4 = ((aou)o).b;
                        if (!(b4 instanceof aox)) {
                            b4.cancel(b);
                            break;
                        }
                        o = ((aox)b4).d;
                        if (!(o == null | o instanceof aou)) {
                            b6 = true;
                            return b6;
                        }
                        b3 = true;
                    }
                    else {
                        if (!((o = aox.d) instanceof aou)) {
                            break Block_10;
                        }
                        continue;
                    }
                }
                b6 = true;
                return b6;
            }
            b6 = b3;
        }
        else {
            b6 = b2;
        }
        return b6;
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        c(runnable);
        c(executor);
        aos d = this.e;
        if (d != aos.a) {
            final aos aos = new aos(runnable, executor);
            do {
                aos.d = d;
                if (aox.b.c(this, d, aos)) {
                    return;
                }
            } while ((d = this.e) != aos.a);
        }
        l(runnable, executor);
    }
    
    public final void e(final Object o) {
        Object c = o;
        if (o == null) {
            c = aox.c;
        }
        if (aox.b.d(this, null, c)) {
            b(this);
        }
    }
    
    public final void f(final Throwable t) {
        c(t);
        if (aox.b.d(this, null, new aor(t))) {
            b(this);
        }
    }
    
    public final void g(final oey oey) {
        c(oey);
        Object o = this.d;
        if (o == null) {
            if (oey.isDone()) {
                if (aox.b.d(this, null, a(oey))) {
                    b(this);
                }
                return;
            }
            else {
                final aou aou = new aou(this, oey);
                if (aox.b.d(this, null, aou)) {
                    try {
                        oey.d(aou, aoy.a);
                        return;
                    }
                    finally {
                        aor a = null;
                        try {
                            final Throwable t;
                            final aor aor = new aor(t);
                        }
                        finally {
                            a = aor.a;
                        }
                        aox.b.d(this, aou, a);
                        return;
                    }
                }
                o = this.d;
            }
        }
        if (o instanceof aop) {
            oey.cancel(((aop)o).c);
        }
    }
    
    @Override
    public final Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object d = this.d;
        if (d != null & (d instanceof aou ^ true)) {
            return n(d);
        }
        aow aow = this.f;
        if (aow != aow.a) {
            final aow aow2 = new aow();
            do {
                aow2.a(aow);
                if (aox.b.e(this, aow, aow2)) {
                    Object d2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.m(aow2);
                            throw new InterruptedException();
                        }
                        d2 = this.d;
                    } while (!(d2 != null & (d2 instanceof aou ^ true)));
                    return n(d2);
                }
            } while ((aow = this.f) != aow.a);
        }
        return n(this.d);
    }
    
    @Override
    public final Object get(long convert, final TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object d = this.d;
        final int n = 1;
        if (d != null & (d instanceof aou ^ true)) {
            return n(d);
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
                aow aow = this.f;
                if (aow != aow.a) {
                    final aow aow2 = new aow();
                    do {
                        aow2.a(aow);
                        if (aox.b.e(this, aow, aow2)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.m(aow2);
                                    throw new InterruptedException();
                                }
                                final Object d2 = this.d;
                                if (d2 != null & (d2 instanceof aou ^ true)) {
                                    return n(d2);
                                }
                                nanos = n2 - System.nanoTime();
                                if (nanos < 1000L) {
                                    this.m(aow2);
                                    break Label_0249;
                                }
                            }
                        }
                    } while ((aow = this.f) != aow.a);
                }
                return n(this.d);
            }
        }
        while (nanos > 0L) {
            final Object d3 = this.d;
            if (d3 != null & (d3 instanceof aou ^ true)) {
                return n(d3);
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
        return this.d instanceof aop;
    }
    
    @Override
    public final boolean isDone() {
        final Object d = this.d;
        return (d instanceof aou ^ true) & d != null;
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
            this.k(sb);
        }
        else {
            String s;
            try {
                final Object d = this.d;
                if (d instanceof aou) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("setFuture=[");
                    sb2.append(this.j(((aou)d).b));
                    sb2.append("]");
                    s = sb2.toString();
                }
                else {
                    s = null;
                }
            }
            catch (final RuntimeException ex) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception thrown from implementation: ");
                sb3.append(ex.getClass());
                s = sb3.toString();
            }
            if (s != null && !s.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(s);
                sb.append("]");
            }
            else if (this.isDone()) {
                this.k(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
