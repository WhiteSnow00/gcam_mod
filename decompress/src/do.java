import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class do implements Runnable
{
    final /* synthetic */ List a;
    final /* synthetic */ ge b;
    
    public do(final List a, final ge b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.a.contains(this.b)) {
            this.a.remove(this.b);
            gf.f(this.b);
        }
    }
}
