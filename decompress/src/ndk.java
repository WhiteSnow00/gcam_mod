import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ndk extends ndd
{
    final /* synthetic */ ndm a;
    
    public ndk(final ndm a) {
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final int n) {
        if (n == 5) {
            this.a.cancel();
        }
    }
    
    @Override
    public final void b(final View view) {
    }
}
