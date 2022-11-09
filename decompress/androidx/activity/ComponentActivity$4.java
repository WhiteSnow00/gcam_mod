// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

public class ComponentActivity$4 implements j
{
    final /* synthetic */ we a;
    
    public ComponentActivity$4(final we a) {
        this.a = a;
    }
    
    @Override
    public final void a(final k k, final g g) {
        if (g == g.f) {
            this.a.f.b = null;
            if (!this.a.isChangingConfigurations()) {
                this.a.bg().a();
            }
        }
    }
}
