import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzk implements lyp
{
    public final AtomicInteger a;
    public final AtomicBoolean b;
    private final lyp c;
    private final Throwable d;
    
    public lzk(final lyp c) {
        this.a = new AtomicInteger(0);
        this.b = new AtomicBoolean(false);
        this.c = c;
        this.d = new Throwable("Context stacktrace");
    }
    
    @Override
    public final lwk a() {
        return this.c.a();
    }
    
    @Override
    public final void close() {
        this.b.set(true);
        this.c.close();
    }
    
    @Override
    public final lyo d() {
        return this.c.d();
    }
    
    @Override
    public final map e() {
        return this.c.e();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.c.execute(new lzj(this, runnable, this.d));
    }
    
    @Override
    public final void f(final lzq lzq, final Runnable runnable) {
        this.c.f(lzq, runnable);
    }
    
    @Override
    public final boolean g() {
        return this.c.g();
    }
    
    @Override
    public final mdk h(final Object o, final njp njp) {
        return this.c.h(o, njp);
    }
}
