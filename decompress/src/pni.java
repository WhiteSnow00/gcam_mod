import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pni extends pnh
{
    public final pol a;
    private final Thread d;
    
    public pni(final pjq pjq, final Thread d, final pol a) {
        pjq.getClass();
        d.getClass();
        super(pjq);
        this.d = d;
        this.a = a;
    }
    
    @Override
    protected final boolean co() {
        return true;
    }
    
    @Override
    protected final void f(final Object o) {
        if (plr.b(Thread.currentThread(), this.d) ^ true) {
            LockSupport.unpark(this.d);
        }
    }
}
