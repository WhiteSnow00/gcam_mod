// 
// Decompiled by Procyon v0.6.0
// 

final class pdq implements Runnable
{
    final /* synthetic */ pdr a;
    private final pdp b;
    
    public pdq(final pdr a, final pdp b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.a.f(this.b);
    }
}
