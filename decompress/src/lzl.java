import java.util.concurrent.RejectedExecutionException;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzl implements lyp
{
    private final lyp a;
    
    public lzl(final lyp a) {
        this.a = a;
    }
    
    @Override
    public final lwk a() {
        return this.a.a();
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final lyo d() {
        return this.a.d();
    }
    
    @Override
    public final map e() {
        return this.a.e();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        try {
            this.a.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", (Throwable)ex);
        }
    }
    
    @Override
    public final void f(final lzq lzq, final Runnable runnable) {
        try {
            this.a.f(lzq, runnable);
        }
        catch (final RejectedExecutionException ex) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", (Throwable)ex);
        }
    }
    
    @Override
    public final boolean g() {
        return this.a.g();
    }
    
    @Override
    public final mdk h(final Object o, final njp njp) {
        return this.a.h(o, njp);
    }
}
