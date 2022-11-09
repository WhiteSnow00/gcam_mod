import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class dt implements aam
{
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ du c;
    
    public dt(final View a, final ViewGroup b, final du c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.b();
    }
}
