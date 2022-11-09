import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bwx implements bsk
{
    private final Executor a;
    private final AtomicBoolean b;
    public volatile ofn h;
    
    protected bwx(final Executor a) {
        this.b = new AtomicBoolean(false);
        this.a = a;
        this.h = ofn.f();
    }
    
    protected abstract void a();
    
    @Override
    public final oey aP() {
        if (!this.b.compareAndSet(false, true)) {
            return this.h;
        }
        this.a.execute(new bww(this));
        return this.h;
    }
}
