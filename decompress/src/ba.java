import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ba
{
    private final AtomicBoolean a;
    private final aq b;
    private volatile afn c;
    
    public ba(final aq b) {
        this.a = new AtomicBoolean(false);
        this.b = b;
    }
    
    private final afn a() {
        return this.b.m(this.d());
    }
    
    protected abstract String d();
    
    public final afn e() {
        this.b.f();
        afn afn;
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.a();
            }
            afn = this.c;
        }
        else {
            afn = this.a();
        }
        return afn;
    }
    
    public final void f(final afn afn) {
        if (afn == this.c) {
            this.a.set(false);
        }
    }
}
