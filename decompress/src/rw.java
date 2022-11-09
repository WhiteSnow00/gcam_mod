import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rw
{
    public final int a;
    private final rx b;
    
    public rw() {
        this.b = new rx();
        this.a = 1;
    }
    
    public abstract int a();
    
    public abstract void b(final st p0, final int p1);
    
    public void c(final st st) {
    }
    
    public abstract st d(final ViewGroup p0);
    
    public final void e(final aah aah) {
        this.b.registerObserver((Object)aah);
    }
    
    public final void f(final aah aah) {
        this.b.unregisterObserver((Object)aah);
    }
}
