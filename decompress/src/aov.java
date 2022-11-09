// 
// Decompiled by Procyon v0.6.0
// 

final class aov extends aoo
{
    public aov() {
    }
    
    @Override
    public final void a(final aow aow, final aow c) {
        aow.c = c;
    }
    
    @Override
    public final void b(final aow aow, final Thread b) {
        aow.b = b;
    }
    
    @Override
    public final boolean c(final aox aox, final aos aos, final aos e) {
        synchronized (aox) {
            if (aox.e == aos) {
                aox.e = e;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean d(final aox aox, final Object o, final Object d) {
        synchronized (aox) {
            if (aox.d == o) {
                aox.d = d;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean e(final aox aox, final aow aow, final aow f) {
        synchronized (aox) {
            if (aox.f == aow) {
                aox.f = f;
                return true;
            }
            return false;
        }
    }
}
