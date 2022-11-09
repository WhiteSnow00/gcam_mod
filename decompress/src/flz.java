import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flz implements klj, krc
{
    public final kkz a;
    public final Executor b;
    public klj c;
    public klj d;
    public krc e;
    public krc f;
    public boolean g;
    
    public flz() {
        final kjm b = kjm.b;
        this.g = false;
        this.a = new kkz(true);
        this.b = b;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.a.a(kri, executor);
    }
    
    public final Boolean c() {
        return (Boolean)this.a.d;
    }
    
    @Override
    public final void close() {
        this.b.execute(new flx(this));
    }
    
    public final void d(final klj klj) {
        this.b.execute(new fly(this, klj, 1));
    }
    
    public final void e() {
        if (!this.g) {
            final klj c = this.c;
            boolean b = false;
            final boolean b2 = c == null || (boolean)c.aQ();
            final klj d = this.d;
            final boolean b3 = d == null || (boolean)d.aQ();
            final kkz a = this.a;
            if (b2 && b3) {
                b = true;
            }
            a.aR(b);
        }
    }
}
