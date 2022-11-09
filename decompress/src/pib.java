import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pib
{
    public static final oxj a;
    public static final oxj b;
    
    static {
        final mzt mzt = new mzt(5);
        final oyf d = pip.d;
        a = pip.f(mzt);
        final mzt mzt2 = new mzt(2);
        final oyf c = pip.c;
        pip.f(mzt2);
        final mzt mzt3 = new mzt(3);
        final oyf e = pip.e;
        b = pip.f(mzt3);
        final int a2 = pgu.a;
        final mzt mzt4 = new mzt(4);
        final oyf f = pip.f;
        pip.f(mzt4);
    }
    
    public static oxj a(final Executor executor) {
        return new pge(executor);
    }
}
