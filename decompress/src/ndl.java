import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ndl extends ndd
{
    private final boolean a;
    private final boolean b;
    private final ix c;
    
    public ndl(final View view, final ix c) {
        this.c = c;
        final boolean b = (view.getSystemUiVisibility() & 0x2000) != 0x0;
        this.b = b;
        final nfd c2 = BottomSheetBehavior.y(view).c;
        ColorStateList list;
        if (c2 != null) {
            list = c2.a.d;
        }
        else {
            list = ik.l(view);
        }
        if (list != null) {
            this.a = neq.e(list.getDefaultColor());
            return;
        }
        if (view.getBackground() instanceof ColorDrawable) {
            this.a = neq.e(((ColorDrawable)view.getBackground()).getColor());
            return;
        }
        this.a = b;
    }
    
    private final void c(final View view) {
        if (view.getTop() < this.c.d()) {
            ndm.e(view, this.a);
            view.setPadding(view.getPaddingLeft(), this.c.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            ndm.e(view, this.b);
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
    
    @Override
    public final void a(final View view, final int n) {
        this.c(view);
    }
    
    @Override
    public final void b(final View view) {
        this.c(view);
    }
}
