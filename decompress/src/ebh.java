// 
// Decompiled by Procyon v0.6.0
// 

final class ebh extends ivr
{
    final /* synthetic */ eby a;
    
    public ebh(final eby a) {
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final eby a = this.a;
        kjm.a();
        if (a.s.get() == 3) {
            a.c();
            a.h(true, 1);
            return;
        }
        a.f();
    }
}
