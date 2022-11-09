// 
// Decompiled by Procyon v0.6.0
// 

package android.arch.lifecycle;

public class LiveData$LifecycleBoundObserver extends r implements j
{
    final k a;
    final /* synthetic */ s b;
    
    public LiveData$LifecycleBoundObserver(final s b, final k a, final u u) {
        this.b = b;
        super(b, u);
        this.a = a;
    }
    
    @Override
    public final void a(final k k, final g g) {
        h a = this.a.aD().a;
        if (a != h.a) {
            h a2;
            for (h h = null; h != a; h = a, a = a2) {
                this.d(this.g());
                a2 = this.a.aD().a;
            }
            return;
        }
        this.b.f(this.c);
    }
    
    @Override
    public final void b() {
        this.a.aD().d(this);
    }
    
    @Override
    public final boolean c(final k k) {
        return this.a == k;
    }
    
    @Override
    public final boolean g() {
        return this.a.aD().a.a(h.d);
    }
}
