import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// 
// Decompiled by Procyon v0.6.0
// 

final class bep implements Lock
{
    public bep() {
    }
    
    @Override
    public final void lock() {
    }
    
    @Override
    public final void lockInterruptibly() {
    }
    
    @Override
    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }
    
    @Override
    public final boolean tryLock() {
        return true;
    }
    
    @Override
    public final boolean tryLock(final long n, final TimeUnit timeUnit) {
        return true;
    }
    
    @Override
    public final void unlock() {
    }
}
