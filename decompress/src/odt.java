import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class odt extends odv
{
    final /* synthetic */ odw a;
    private final odo c;
    
    public odt(final odw a, final odo c, final Executor executor) {
        this.a = a;
        super(a, executor);
        c.getClass();
        this.c = c;
    }
    
    @Override
    public final String b() {
        return this.c.toString();
    }
}
