import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class pcn extends oze
{
    final Collection e;
    
    public pcn(final oxg oxg, final Collection e) {
        super(oxg);
        this.e = e;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d) {
            pip.g(t);
            return;
        }
        this.d = true;
        this.e.clear();
        this.a.b(t);
    }
    
    @Override
    public final void bU() {
        if (!this.d) {
            this.d = true;
            this.e.clear();
            this.a.bU();
        }
    }
    
    @Override
    public final Object bW() {
        Object bw;
        do {
            bw = this.c.bW();
        } while (bw != null && !this.e.add(bw));
        return bw;
    }
    
    @Override
    public final void bZ() {
        this.e.clear();
        super.bZ();
    }
    
    @Override
    public final void e(final Object o) {
        if (!this.d) {
            try {
                phn.g(o, "The keySelector returned a null key");
                if (this.e.add(o)) {
                    this.a.e(o);
                }
            }
            finally {
                final Throwable t;
                this.f(t);
            }
        }
    }
    
    @Override
    public final int k() {
        return 0;
    }
}
