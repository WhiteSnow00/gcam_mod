// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements j, vz
{
    final /* synthetic */ wh a;
    private final i b;
    private final wf c;
    private vz d;
    
    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(final wh a, final i b, final wf c) {
        this.a = a;
        this.b = b;
        this.c = c;
        b.b(this);
    }
    
    @Override
    public final void a(final k k, final g g) {
        if (g == g.b) {
            final wh a = this.a;
            final wf c = this.c;
            a.a.add(c);
            final wg d = new wg(a, c);
            c.a(d);
            this.d = d;
            return;
        }
        if (g == g.e) {
            final vz d2 = this.d;
            if (d2 != null) {
                d2.b();
            }
        }
        else if (g == g.f) {
            this.b();
        }
    }
    
    @Override
    public final void b() {
        this.b.d(this);
        this.c.b(this);
        final vz d = this.d;
        if (d != null) {
            d.b();
            this.d = null;
        }
    }
}
