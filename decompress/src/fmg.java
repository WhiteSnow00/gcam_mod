// 
// Decompiled by Procyon v0.6.0
// 

public final class fmg implements fvo, krc
{
    private fvo a;
    
    public fmg(final fvo a) {
        this.a = a;
    }
    
    @Override
    public final void A() {
        synchronized (this) {
            final fvo a = this.a;
            if (a != null) {
                a.A();
            }
        }
    }
    
    @Override
    public final void B() {
        synchronized (this) {
            final fvo a = this.a;
            if (a != null) {
                a.B();
            }
        }
    }
    
    @Override
    public final void D(final float n) {
        synchronized (this) {
            final fvo a = this.a;
            if (a != null) {
                a.D(n);
            }
        }
    }
    
    @Override
    public final void E(final float n, final int n2) {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final void F(final float n, final long n2) {
        synchronized (this) {
            final fvo a = this.a;
            if (a != null) {
                a.F(n, n2);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a = null;
        }
    }
}
