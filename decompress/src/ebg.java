// 
// Decompiled by Procyon v0.6.0
// 

final class ebg implements eip
{
    final /* synthetic */ ebi a;
    
    public ebg(final ebi a) {
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        final ivq j = this.a.j;
        j.getClass();
        if (b) {
            j.onShutterTouchStart();
            return;
        }
        j.onShutterButtonClick();
    }
}
