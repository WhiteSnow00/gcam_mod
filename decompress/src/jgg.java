import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgg implements jgn
{
    private jgn a;
    
    public jgg() {
        this.a = null;
    }
    
    @Override
    public final void a(final PointF pointF) {
        final jgn a = this.a;
        if (a == null) {
            return;
        }
        a.a(pointF);
    }
    
    @Override
    public final void b() {
        final jgn a = this.a;
        if (a == null) {
            return;
        }
        a.b();
    }
    
    @Override
    public final void c(final PointF pointF) {
        final jgn a = this.a;
        if (a == null) {
            return;
        }
        a.c(pointF);
    }
    
    public final void e() {
        this.a = null;
    }
    
    public final void f(final jgn a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final void g() {
    }
}
