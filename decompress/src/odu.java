import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class odu extends odv
{
    final /* synthetic */ odw a;
    private final Callable c;
    
    public odu(final odw a, final Callable c, final Executor executor) {
        this.a = a;
        super(a, executor);
        c.getClass();
        this.c = c;
    }
    
    @Override
    public final Object a() {
        return this.c.call();
    }
    
    @Override
    public final String b() {
        return this.c.toString();
    }
    
    @Override
    public final void c(final Object o) {
        this.a.o(o);
    }
}
