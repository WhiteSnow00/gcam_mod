import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnc
{
    @Deprecated
    private static final AtomicIntegerFieldUpdater a;
    private volatile int b;
    
    static {
        a = AtomicIntegerFieldUpdater.newUpdater(pnc.class, "b");
    }
    
    public pnc() {
        this.b = 0;
    }
    
    public final boolean a() {
        return this.b != 0;
    }
    
    public final boolean b() {
        final int a = png.a;
        return pnc.a.compareAndSet(this, 0, 1);
    }
    
    public final void c() {
        final int a = png.a;
        this.b = 1;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.a());
    }
}
