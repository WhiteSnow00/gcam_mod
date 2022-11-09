// 
// Decompiled by Procyon v0.6.0
// 

final class eox extends ivr
{
    final /* synthetic */ epb a;
    
    public eox(final epb a) {
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        this.a.w();
    }
    
    @Override
    public final void onShutterButtonPressedStateChanged(final boolean q) {
        this.a.q = q;
    }
}
