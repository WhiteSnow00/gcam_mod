import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class hxp extends aaj
{
    private final int a;
    
    public hxp(final Resources resources) {
        this.a = resources.getDimensionPixelSize(2131166236);
    }
    
    @Override
    public final void o(final Rect rect, final View view, final RecyclerView recyclerView) {
        final st f = RecyclerView.f(view);
        int a;
        if (f != null) {
            a = f.a();
        }
        else {
            a = -1;
        }
        final rw k = recyclerView.k;
        k.getClass();
        if (a != k.a() - 1) {
            rect.bottom = this.a;
        }
    }
}
