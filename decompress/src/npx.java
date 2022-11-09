// 
// Decompiled by Procyon v0.6.0
// 

abstract class npx extends nqw
{
    public npx() {
    }
    
    public abstract npt a();
    
    @Override
    public final void clear() {
        this.a().clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o instanceof nps) {
            final nps nps = (nps)o;
            if (nps.a() <= 0) {
                return false;
            }
            if (this.a().bK(nps.b()) == nps.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean remove(Object b) {
        if (b instanceof nps) {
            final nps nps = (nps)b;
            b = nps.b();
            final int a = nps.a();
            if (a != 0) {
                return this.a().i(b, a);
            }
        }
        return false;
    }
}
