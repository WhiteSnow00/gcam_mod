// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jug
{
    public Object d;
    public boolean e;
    final /* synthetic */ jum f;
    
    public jug(final jum f, final Object d) {
        this.f = f;
        this.d = d;
        this.e = false;
    }
    
    protected abstract void b();
    
    protected abstract void d();
    
    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }
    
    public final void f() {
        this.e();
        synchronized (this.f.h) {
            this.f.h.remove(this);
        }
    }
}
