// 
// Decompiled by Procyon v0.6.0
// 

final class icu extends ivr
{
    final /* synthetic */ igw a;
    final /* synthetic */ icy b;
    
    public icu(final icy b, final igw a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        if (this.a.a()) {
            final iep l = this.b.L;
            if (l != null) {
                l.a();
            }
        }
    }
    
    @Override
    public final void onShutterButtonDown() {
        if (!this.a.a()) {
            final iep l = this.b.L;
            if (l != null) {
                l.a();
            }
        }
    }
}
