import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kds implements keh
{
    public final kdq a;
    public final kem b;
    private final Executor c;
    
    public kds(final Executor c, final kdq a, final kem b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final keg keg) {
        this.c.execute(new kdr(this, keg));
    }
}
