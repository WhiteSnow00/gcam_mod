import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkj
{
    public final dkm a;
    public final AtomicReference b;
    public final AtomicReference c;
    private final klj d;
    
    public dkj(final dkm a, final klj d) {
        this.b = new AtomicReference();
        this.c = new AtomicReference((V)jbm.b);
        this.a = a;
        this.d = d;
    }
    
    public final float a() {
        return (float)this.d.aQ();
    }
}
