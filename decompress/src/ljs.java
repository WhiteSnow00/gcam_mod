import android.os.Handler;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public class ljs implements ljx
{
    private final ljx a;
    
    public ljs(final ljx a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a.a();
    }
    
    @Override
    public final int b() {
        return this.a.b();
    }
    
    @Override
    public final int c() {
        return this.a.c();
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public final int d() {
        return this.a.d();
    }
    
    @Override
    public final Surface e() {
        return this.a.e();
    }
    
    @Override
    public lju f() {
        return this.a.f();
    }
    
    @Override
    public lju g() {
        return this.a.g();
    }
    
    @Override
    public final void h() {
        this.a.h();
    }
    
    @Override
    public void i(final ljw ljw, final Handler handler) {
        this.a.i(ljw, handler);
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
