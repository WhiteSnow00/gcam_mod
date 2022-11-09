import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class ljk implements ljg
{
    protected final ljg c;
    
    public ljk(final ljg c) {
        this.c = c;
    }
    
    @Override
    public final int a() {
        return this.c.a();
    }
    
    @Override
    public final String b() {
        return this.c.b();
    }
    
    @Override
    public final void c(final ljq ljq) {
        this.c.c(ljq);
    }
    
    @Override
    public void close() {
        this.c.close();
    }
    
    @Override
    public final void d(final List list, final lje lje, final Handler handler) {
        this.c.d(list, lje, handler);
    }
    
    @Override
    public final void e(final List list, final lje lje, final Handler handler) {
        this.c.e(list, lje, handler);
    }
    
    @Override
    public final void f(final List list, final lje lje, final Handler handler) {
        this.c.f(list, lje, handler);
    }
    
    @Override
    public final void g(final int n) {
        this.c.g(n);
    }
    
    @Override
    public final leo h(final int n) {
        return this.c.h(n);
    }
}
