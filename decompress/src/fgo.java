import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgo implements mbz
{
    public final lup a;
    public final ofn b;
    private final AtomicBoolean c;
    
    public fgo(final lup a) {
        this.c = new AtomicBoolean();
        this.b = ofn.f();
        this.a = a;
    }
    
    @Override
    public final mcf a(final mce mce) {
        if (!this.c.getAndSet(true)) {
            this.a.a(mce.a);
            return new fgn(this);
        }
        throw new IllegalStateException("Added more than one track");
    }
    
    @Override
    public final oey b() {
        return this.b;
    }
    
    @Override
    public final void c() {
        if (this.c.get()) {
            return;
        }
        throw new IllegalStateException("Staring with no track added");
    }
}
