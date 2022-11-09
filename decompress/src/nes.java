import android.widget.CompoundButton;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nes extends pa
{
    private static final int[][] a;
    private ColorStateList b;
    private boolean c;
    
    static {
        a = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public nes(Context context, final AttributeSet set) {
        super(ngv.a(context, set, 2130969581, 2132018515), set);
        context = this.getContext();
        final TypedArray a = nem.a(context, set, net.a, 2130969581, 2132018515, new int[0]);
        if (a.hasValue(0)) {
            ((CompoundButton)this).setButtonTintList(neu.a(context, a, 0));
        }
        this.c = a.getBoolean(1, false);
        a.recycle();
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && ((CompoundButton)this).getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                final int c = neu.c((View)this, 2130968845);
                final int c2 = neu.c((View)this, 2130968871);
                final int c3 = neu.c((View)this, 2130968905);
                final int[][] a = nes.a;
                final int length = a.length;
                this.b = new ColorStateList(a, new int[] { neq.d(c3, c, 1.0f), neq.d(c3, c2, 0.54f), neq.d(c3, c2, 0.38f), neq.d(c3, c2, 0.38f) });
            }
            ((CompoundButton)this).setButtonTintList(this.b);
        }
    }
}
