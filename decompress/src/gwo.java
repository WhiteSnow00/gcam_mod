import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

public class gwo
{
    private int a;
    private final ReentrantLock b;
    private final Condition c;
    
    public gwo() {
        final ReentrantLock b = new ReentrantLock();
        this.b = b;
        this.a = 0;
        this.c = b.newCondition();
    }
    
    public final int a(int a) {
        this.b.lock();
        try {
            a += this.a;
            return this.a = a;
        }
        finally {
            this.b.unlock();
        }
    }
    
    public final int b() {
        this.b.lock();
        final int a = this.a;
        this.b.unlock();
        return a;
    }
    
    public final void c() {
        this.b.lock();
        try {
            try {
                while (this.a != 0) {
                    this.c.await();
                }
                this.b.unlock();
            }
            finally {
                this.b.unlock();
                while (true) {}
            }
        }
        catch (final InterruptedException ex) {}
    }
    
    public final void d() {
        this.b.lock();
        this.c.signal();
        this.b.unlock();
    }
    
    public final void e(final int a) {
        this.b.lock();
        this.a = a;
        this.b.unlock();
    }
}
