// 
// Decompiled by Procyon v0.6.0
// 

final class oft extends oex
{
    final /* synthetic */ ofv a;
    private final odo b;
    
    public oft(final ofv a, final odo b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final String b() {
        return this.b.toString();
    }
    
    @Override
    public final void d(final Throwable t) {
        this.a.a(t);
    }
    
    @Override
    public final boolean g() {
        return this.a.isDone();
    }
}
