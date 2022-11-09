import android.view.View$OnClickListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class nft extends FrameLayout
{
    private static final View$OnTouchListener a;
    private final float b;
    private ColorStateList c;
    private PorterDuff$Mode d;
    
    static {
        a = (View$OnTouchListener)new nfs();
    }
    
    protected nft(final Context context) {
        this(context, null);
    }
    
    protected nft(Context context, final AttributeSet set) {
        super(ngv.a(context, set, 0, 0), set);
        context = this.getContext();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nfu.a);
        if (obtainStyledAttributes.hasValue(6)) {
            ik.J((View)this, (float)obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        obtainStyledAttributes.getInt(2, 0);
        final float float1 = obtainStyledAttributes.getFloat(3, 1.0f);
        this.b = float1;
        this.setBackgroundTintList(neu.a(context, obtainStyledAttributes, 4));
        this.setBackgroundTintMode(neq.b(obtainStyledAttributes.getInt(5, -1), PorterDuff$Mode.SRC_IN));
        obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        this.setOnTouchListener(nft.a);
        this.setFocusable(true);
        if (this.getBackground() == null) {
            final float dimension = this.getResources().getDimension(2131166037);
            final GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(neq.d(neu.c((View)this, 2130968905), neu.c((View)this, 2130968871), float1));
            final ColorStateList c = this.c;
            if (c != null) {
                ((Drawable)gradientDrawable).setTintList(c);
            }
            ik.G((View)this, (Drawable)gradientDrawable);
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ik.D((View)this);
    }
    
    public final void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void setBackgroundDrawable(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.c != null) {
                mutate = drawable.mutate();
                mutate.setTintList(this.c);
                mutate.setTintMode(this.d);
            }
        }
        super.setBackgroundDrawable(mutate);
    }
    
    public final void setBackgroundTintList(final ColorStateList list) {
        this.c = list;
        if (this.getBackground() != null) {
            final Drawable mutate = this.getBackground().mutate();
            mutate.setTintList(list);
            mutate.setTintMode(this.d);
            if (mutate != this.getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }
    
    public final void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.d = porterDuff$Mode;
        if (this.getBackground() != null) {
            final Drawable mutate = this.getBackground().mutate();
            mutate.setTintMode(porterDuff$Mode);
            if (mutate != this.getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        View$OnTouchListener a;
        if (onClickListener != null) {
            a = null;
        }
        else {
            a = nft.a;
        }
        this.setOnTouchListener(a);
        super.setOnClickListener(onClickListener);
    }
}
