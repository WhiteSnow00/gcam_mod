import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofu extends oex
{
    final /* synthetic */ ofv a;
    private final Callable b;
    
    public ofu(final ofv a, final Callable b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final Object a() {
        return this.b.call();
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
    public final void e(final Object o) {
        this.a.o(o);
    }
    
    @Override
    public final boolean g() {
        return this.a.isDone();
    }
}
