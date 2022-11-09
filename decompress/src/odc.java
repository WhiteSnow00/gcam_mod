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

public abstract class odc extends ofx implements oey
{
    private static final Logger a;
    private static final Object b;
    public static final boolean d;
    public static final ocp e;
    public volatile oct listeners;
    public volatile Object value;
    public volatile odb waiters;
    
    static {
        boolean boolean1;
        try {
            boolean1 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        }
        catch (final SecurityException ex) {
            boolean1 = false;
        }
        d = boolean1;
        a = Logger.getLogger(odc.class.getName());
        ocw e2 = null;
        try {
            final oda oda = new oda();
        }
        finally {
            try {
                final ocu ocu = new ocu(AtomicReferenceFieldUpdater.newUpdater(odb.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(odb.class, odb.class, "next"), AtomicReferenceFieldUpdater.newUpdater(odc.class, odb.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(odc.class, oct.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(odc.class, Object.class, "value"));
            }
            finally {
                e2 = new ocw();
            }
        }
        e = e2;
        final Throwable t;
        if (t != null) {
            final Logger a2 = odc.a;
            final Throwable t2;
            a2.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", t2);
            a2.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", t);
        }
        b = new Object();
    }
    
    protected odc() {
    }
    
    private static Object f(final Future future) {
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
    
    private final void g(final StringBuilder sb) {
        try {
            final Object f = f(this);
            sb.append("SUCCESS, result=[");
            if (f == null) {
                sb.append("null");
            }
            else if (f == this) {
                sb.append("this future");
            }
            else {
                sb.append(((odc)f).getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f)));
            }
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
    
    private final void h(final StringBuilder sb) {
        final int length = sb.length();
        sb.append("PENDING");
        Object o = this.value;
        if (o instanceof ocv) {
            sb.append(", setFuture=[");
            this.i(sb, ((ocv)o).b);
            sb.append("]");
        }
        else {
            Label_0128: {
                try {
                    o = this.bp();
                    if (njb.d((String)o)) {
                        o = null;
                    }
                    break Label_0128;
                }
                catch (final StackOverflowError o) {}
                catch (final RuntimeException ex) {}
                final String value = String.valueOf(((String)o).getClass());
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(value);
                o = sb2.toString();
            }
            if (o != null) {
                sb.append(", info=[");
                sb.append((String)o);
                sb.append("]");
            }
        }
        if (this.isDone()) {
            sb.delete(length, sb.length());
            this.g(sb);
        }
    }
    
    private final void i(final StringBuilder sb, final Object stackOverflowError) {
        while (true) {
            if (stackOverflowError == this) {
                try {
                    sb.append("this future");
                    return;
                    sb.append(stackOverflowError);
                    return;
                }
                catch (final StackOverflowError stackOverflowError) {}
                catch (final RuntimeException ex) {}
                sb.append("Exception thrown from implementation: ");
                sb.append(stackOverflowError.getClass());
                return;
            }
            continue;
        }
    }
    
    public static Object j(final oey oey) {
        if (oey instanceof ocx) {
            Object o2;
            final Object o = o2 = ((odc)oey).value;
            if (o instanceof ocq) {
                final ocq ocq = (ocq)o;
                o2 = o;
                if (ocq.c) {
                    final Throwable d = ocq.d;
                    if (d != null) {
                        o2 = new ocq(false, d);
                    }
                    else {
                        o2 = ocq.b;
                    }
                }
            }
            o2.getClass();
            return o2;
        }
        if (oey instanceof ofx) {
            final Throwable k = ((ofx)oey).k();
            if (k != null) {
                return new ocs(k);
            }
        }
        final boolean cancelled = oey.isCancelled();
        if ((odc.d ^ true) & cancelled) {
            final ocq b = ocq.b;
            b.getClass();
            return b;
        }
        try {
            final Object f = f(oey);
            if (cancelled) {
                final String value = String.valueOf(oey);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(value);
                return new ocq(false, new IllegalArgumentException(sb.toString()));
            }
            Object b2;
            if ((b2 = f) == null) {
                b2 = odc.b;
            }
            return b2;
        }
        catch (final CancellationException ex) {
            if (!cancelled) {
                final String value2 = String.valueOf(oey);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 77);
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(value2);
                return new ocs(new IllegalArgumentException(sb2.toString(), ex));
            }
            return new ocq(false, ex);
        }
        catch (final ExecutionException ex2) {
            if (cancelled) {
                final String value3 = String.valueOf(oey);
                final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(value3);
                return new ocq(false, new IllegalArgumentException(sb3.toString(), ex2));
            }
            return new ocs(ex2.getCause());
        }
        finally {
            final Throwable t;
            return new ocs(t);
        }
    }
    
    public static void l(final odc odc) {
        final oct oct = null;
        odc a = odc;
        oct next = oct;
    Label_0006:
        while (true) {
            odb odb = a.waiters;
            if (odc.e.e(a, odb, odb.a)) {
                while (odb != null) {
                    final Thread thread = odb.thread;
                    if (thread != null) {
                        odb.thread = null;
                        LockSupport.unpark(thread);
                    }
                    odb = odb.next;
                }
                a.c();
                oct listeners;
                do {
                    listeners = a.listeners;
                } while (!odc.e.c(a, listeners, oct.a));
                oct next2 = listeners;
                oct oct3;
                while (true) {
                    final oct oct2 = next2;
                    oct3 = next;
                    if (oct2 == null) {
                        break;
                    }
                    next2 = oct2.next;
                    oct2.next = next;
                    next = oct2;
                }
                while (oct3 != null) {
                    next = oct3.next;
                    final Runnable b = oct3.b;
                    b.getClass();
                    if (b instanceof ocv) {
                        final ocv ocv = (ocv)b;
                        a = ocv.a;
                        if (a.value == ocv && odc.e.d(a, ocv, j(ocv.b))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        final Executor c = oct3.c;
                        c.getClass();
                        q(b, c);
                    }
                    oct3 = next;
                }
                break;
            }
        }
    }
    
    private static void q(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger a = odc.a;
            final Level severe = Level.SEVERE;
            final String value = String.valueOf(runnable);
            final String value2 = String.valueOf(executor);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(value2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(value);
            sb.append(" with executor ");
            sb.append(value2);
            a.logp(severe, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), ex);
        }
    }
    
    private final void r(odb waiters) {
        waiters.thread = null;
    Label_0005:
        while (true) {
            waiters = this.waiters;
            if (waiters != odb.a) {
                odb odb = null;
                while (waiters != null) {
                    final odb next = waiters.next;
                    odb odb2;
                    if (waiters.thread != null) {
                        odb2 = waiters;
                    }
                    else if (odb != null) {
                        odb.next = next;
                        odb2 = odb;
                        if (odb.thread == null) {
                            continue Label_0005;
                        }
                    }
                    else {
                        odb2 = odb;
                        if (!odc.e.e(this, waiters, next)) {
                            continue Label_0005;
                        }
                    }
                    waiters = next;
                    odb = odb2;
                }
                break;
            }
            break;
        }
    }
    
    private static final Object s(final Object o) {
        if (o instanceof ocq) {
            final Throwable d = ((ocq)o).d;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(d);
            throw ex;
        }
        if (!(o instanceof ocs)) {
            Object o2;
            if ((o2 = o) == odc.b) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((ocs)o).b);
    }
    
    protected boolean a(final Throwable t) {
        t.getClass();
        if (odc.e.d(this, null, new ocs(t))) {
            l(this);
            return true;
        }
        return false;
    }
    
    protected String bp() {
        if (this instanceof ScheduledFuture) {
            final long delay = ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS);
            final StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }
    
    protected void c() {
    }
    
    @Override
    public boolean cancel(final boolean b) {
        final Object value = this.value;
        final boolean b2 = false;
        boolean b5;
        if (value == null | value instanceof ocv) {
            ocq ocq;
            if (odc.d) {
                ocq = new ocq(b, new CancellationException("Future.cancel() was called."));
            }
            else {
                ocq ocq2;
                if (b) {
                    ocq2 = ocq.a;
                }
                else {
                    ocq2 = ocq.b;
                }
                ocq2.getClass();
                ocq = ocq2;
            }
            boolean b3 = false;
            odc odc = this;
            Object o = value;
            Block_11: {
                while (true) {
                    if (odc.e.d(odc, o, ocq)) {
                        if (b) {
                            odc.m();
                        }
                        l(odc);
                        if (!(o instanceof ocv)) {
                            break;
                        }
                        final oey b4 = ((ocv)o).b;
                        if (!(b4 instanceof ocx)) {
                            b4.cancel(b);
                            break;
                        }
                        odc = (odc)b4;
                        o = odc.value;
                        if (!(o == null | o instanceof ocv)) {
                            b5 = true;
                            return b5;
                        }
                        b3 = true;
                    }
                    else {
                        if (!((o = odc.value) instanceof ocv)) {
                            break Block_11;
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
    public void d(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        if (!this.isDone()) {
            oct next = this.listeners;
            if (next != oct.a) {
                final oct oct = new oct(runnable, executor);
                do {
                    oct.next = next;
                    if (odc.e.c(this, next, oct)) {
                        return;
                    }
                } while ((next = this.listeners) != oct.a);
            }
        }
        q(runnable, executor);
    }
    
    protected boolean e(final oey oey) {
        oey.getClass();
        Object o = this.value;
        if (o == null) {
            if (oey.isDone()) {
                if (odc.e.d(this, null, j(oey))) {
                    l(this);
                    return true;
                }
                return false;
            }
            else {
                final ocv ocv = new ocv(this, oey);
                if (odc.e.d(this, null, ocv)) {
                    try {
                        oey.d(ocv, odx.a);
                    }
                    finally {
                        ocs a = null;
                        try {
                            final Throwable t;
                            final ocs ocs = new ocs(t);
                        }
                        finally {
                            a = ocs.a;
                        }
                        odc.e.d(this, ocv, a);
                    }
                    return true;
                }
                o = this.value;
            }
        }
        if (o instanceof ocq) {
            oey.cancel(((ocq)o).c);
        }
        return false;
    }
    
    @Override
    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        if (value != null & (value instanceof ocv ^ true)) {
            return s(value);
        }
        odb odb = this.waiters;
        if (odb != odb.a) {
            final odb odb2 = new odb();
            do {
                odb2.a(odb);
                if (odc.e.e(this, odb, odb2)) {
                    Object value2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.r(odb2);
                            throw new InterruptedException();
                        }
                        value2 = this.value;
                    } while (!(value2 != null & (value2 instanceof ocv ^ true)));
                    return s(value2);
                }
            } while ((odb = this.waiters) != odb.a);
        }
        final Object value3 = this.value;
        value3.getClass();
        return s(value3);
    }
    
    @Override
    public Object get(long convert, final TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object value = this.value;
        final int n = 1;
        if (value != null & (value instanceof ocv ^ true)) {
            return s(value);
        }
        long n2;
        if (nanos > 0L) {
            n2 = System.nanoTime() + nanos;
        }
        else {
            n2 = 0L;
        }
        Label_0262: {
            if (nanos >= 1000L) {
                odb odb = this.waiters;
                if (odb != odb.a) {
                    final odb odb2 = new odb();
                    do {
                        odb2.a(odb);
                        if (odc.e.e(this, odb, odb2)) {
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    this.r(odb2);
                                    throw new InterruptedException();
                                }
                                final Object value2 = this.value;
                                if (value2 != null & (value2 instanceof ocv ^ true)) {
                                    return s(value2);
                                }
                                nanos = n2 - System.nanoTime();
                                if (nanos < 1000L) {
                                    this.r(odb2);
                                    break Label_0262;
                                }
                            }
                        }
                    } while ((odb = this.waiters) != odb.a);
                }
                final Object value3 = this.value;
                value3.getClass();
                return s(value3);
            }
        }
        while (nanos > 0L) {
            final Object value4 = this.value;
            if (value4 != null & (value4 instanceof ocv ^ true)) {
                return s(value4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = n2 - System.nanoTime();
        }
        final String string = this.toString();
        final String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        final String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        final StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(lowerCase2);
        final String string2 = sb.toString();
        String concat2;
        if (nanos + 1000L < 0L) {
            final String concat = String.valueOf(string2).concat(" (plus ");
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
                final String value5 = String.valueOf(concat);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value5).length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(value5);
                sb2.append(convert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String s = sb2.toString();
                if (n5 != 0) {
                    s = String.valueOf(s).concat(",");
                }
                s2 = String.valueOf(s).concat(" ");
            }
            else {
                s2 = concat;
            }
            if (n5 != 0) {
                final String value6 = String.valueOf(s2);
                final StringBuilder sb3 = new StringBuilder(String.valueOf(value6).length() + 33);
                sb3.append(value6);
                sb3.append(n4);
                sb3.append(" nanoseconds ");
                s2 = sb3.toString();
            }
            concat2 = String.valueOf(s2).concat("delay)");
        }
        else {
            concat2 = string2;
        }
        if (this.isDone()) {
            throw new TimeoutException(String.valueOf(concat2).concat(" but future completed as timeout expired"));
        }
        final StringBuilder sb4 = new StringBuilder(String.valueOf(concat2).length() + 5 + String.valueOf(string).length());
        sb4.append(concat2);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }
    
    @Override
    public boolean isCancelled() {
        return this.value instanceof ocq;
    }
    
    @Override
    public boolean isDone() {
        final Object value = this.value;
        return (value instanceof ocv ^ true) & value != null;
    }
    
    @Override
    public final Throwable k() {
        if (this instanceof ocx) {
            final Object value = this.value;
            if (value instanceof ocs) {
                return ((ocs)value).b;
            }
        }
        return null;
    }
    
    protected void m() {
    }
    
    final void n(final Future future) {
        if (future != null & this.isCancelled()) {
            future.cancel(this.p());
        }
    }
    
    protected boolean o(final Object o) {
        Object b = o;
        if (o == null) {
            b = odc.b;
        }
        if (odc.e.d(this, null, b)) {
            l(this);
            return true;
        }
        return false;
    }
    
    protected final boolean p() {
        final Object value = this.value;
        return value instanceof ocq && ((ocq)value).c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(this.getClass().getSimpleName());
        }
        else {
            sb.append(this.getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.isCancelled()) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.g(sb);
        }
        else {
            this.h(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}
