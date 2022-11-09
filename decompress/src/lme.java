import java.util.Locale;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.concurrent.locks.StampedLock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

class lme
{
    public static final AtomicInteger a;
    public static final AtomicInteger b;
    public final ReadWriteLock c;
    public final krr d;
    public final lou e;
    private llv f;
    
    static {
        a = new AtomicInteger(0);
        b = new AtomicInteger(0);
    }
    
    public lme(final lou e, final llv f, final krr krr, final byte[] array, final byte[] array2) {
        this.e = e;
        this.f = f;
        this.c = new StampedLock().asReadWriteLock();
        this.d = krr.a("MediaMutex");
    }
    
    public final FileInputStream b() {
        this.c.readLock().lock();
        try {
            njo.r(this.f.e(), "Unable to read from %s", this);
            return new lmc(this, this.f.b());
        }
        finally {
            this.c.readLock().unlock();
        }
    }
    
    public final FileOutputStream c() {
        return this.g();
    }
    
    public final void d() {
        this.c.writeLock().lock();
        try {
            this.f.d();
        }
        finally {
            this.c.writeLock().unlock();
        }
    }
    
    public final FileOutputStream g() {
        this.c.writeLock().lock();
        try {
            njo.r(this.f.f(), "Unable to write to %s", this);
            njo.r(true, "Unable to append to %s", this);
            return new lmd(this, this.f.g());
        }
        finally {
            this.c.writeLock().unlock();
        }
    }
    
    protected final llv l() {
        synchronized (this) {
            return this.f;
        }
    }
    
    final void m(final llv f) {
        synchronized (this) {
            final boolean assignable = this.f.getClass().isAssignableFrom(f.getClass());
            final String value = String.valueOf(this.f.getClass());
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 33);
            sb.append("The new delegate must be of type ");
            sb.append(value);
            njo.e(assignable, sb.toString());
            this.c.writeLock().lock();
            try {
                this.f = f;
            }
            finally {
                this.c.writeLock().unlock();
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format(Locale.ROOT, "<MediaMutex: %s>", this.f);
    }
}
