// 
// Decompiled by Procyon v0.6.0
// 

public final class ppi extends pnw
{
    static {
        new ppi();
    }
    
    private ppi() {
    }
    
    @Override
    public final void cj(final pjq pjq, final Runnable runnable) {
        pjq.getClass();
        runnable.getClass();
        if (pjq.b(ppl.a) != null) {
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
    
    @Override
    public final boolean i(final pjq pjq) {
        pjq.getClass();
        return false;
    }
    
    @Override
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
