// 
// Decompiled by Procyon v0.6.0
// 

public final class flu extends odc
{
    private final Runnable a;
    
    public flu(final Runnable a) {
        this.a = a;
    }
    
    public final boolean a(final Throwable t) {
        return super.a(t);
    }
    
    public final void b(final flv flv) {
        super.o(flv);
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        final Runnable a = this.a;
        if (a != null) {
            a.run();
        }
        return super.cancel(b);
    }
}
