import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmd extends kkz
{
    public int a;
    public volatile Object e;
    
    public kmd(final Object o) {
        super(o);
        this.e = null;
    }
    
    public kmd(final Object o, final klw klw) {
        super(o, klw);
        this.e = null;
    }
    
    @Override
    public final void c(final Object e) {
        if (this.a > 0) {
            this.e = e;
            return;
        }
        if (nqb.E(super.d, e)) {
            return;
        }
        super.c(e);
    }
    
    public final krc d() {
        this.c.execute(new kmc(this, 1));
        return new kmb(this, new AtomicBoolean(false));
    }
}
