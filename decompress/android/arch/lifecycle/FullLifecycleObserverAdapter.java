// 
// Decompiled by Procyon v0.6.0
// 

package android.arch.lifecycle;

public class FullLifecycleObserverAdapter implements j
{
    private final e a;
    private final j b;
    
    public FullLifecycleObserverAdapter(final e a, final j b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final k k, final g g) {
        switch (g.ordinal()) {
            case 6: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            case 5: {
                this.a.b();
                break;
            }
            case 4: {
                this.a.f();
                break;
            }
            case 3: {
                this.a.c();
                break;
            }
            case 2: {
                this.a.d();
                break;
            }
            case 1: {
                this.a.e();
                break;
            }
            case 0: {
                this.a.a();
                break;
            }
        }
        final j b = this.b;
        if (b != null) {
            b.a(k, g);
        }
    }
}
