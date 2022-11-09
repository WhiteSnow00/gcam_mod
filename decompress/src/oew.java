import java.util.concurrent.locks.AbstractOwnableSynchronizer;

// 
// Decompiled by Procyon v0.6.0
// 

final class oew extends AbstractOwnableSynchronizer implements Runnable
{
    private final oex a;
    
    public oew(final oex a) {
        this.a = a;
    }
    
    public final void a(final Thread exclusiveOwnerThread) {
        super.setExclusiveOwnerThread(exclusiveOwnerThread);
    }
    
    @Override
    public final void run() {
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
