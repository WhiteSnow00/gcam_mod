import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oa extends nh
{
    final /* synthetic */ og d;
    
    public oa(final og d, final Context context, final nr nr, final View view) {
        this.d = d;
        super(context, nr, view, false);
        if (!nr.k.o()) {
            Object g;
            if ((g = d.g) == null) {
                g = d.f;
            }
            super.a = (View)g;
        }
        this.e(d.l);
    }
    
    @Override
    protected final void c() {
        this.d.j = null;
        super.c();
    }
}
