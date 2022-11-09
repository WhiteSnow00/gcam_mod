// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pkd extends pjw
{
    public pkd(final pjl pjl) {
        super(pjl);
        if (pjl != null && pjl.d() != pjr.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }
    
    @Override
    public final pjq d() {
        return pjr.a;
    }
}
