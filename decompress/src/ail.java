import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ail
{
    public final Executor a;
    public final Executor b;
    public final ajk c;
    public final int d;
    public final int e;
    public final ajl f;
    
    public ail(final aij aij) {
        this.a = a();
        this.b = a();
        final ajk a = aij.a;
        if (a == null) {
            this.c = ajk.c();
        }
        else {
            this.c = a;
        }
        this.f = new ajl();
        this.d = Integer.MAX_VALUE;
        this.e = 20;
    }
    
    private static final Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
