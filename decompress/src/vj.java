import android.view.MotionEvent;
import android.util.TypedValue;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.content.res.TypedArray;
import android.view.animation.AccelerateInterpolator;
import android.view.ViewOutlineProvider;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Interpolator;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class vj extends View
{
    private static final double f;
    public final ShapeDrawable a;
    public ColorStateList b;
    public Drawable c;
    public int d;
    public int e;
    private RippleDrawable g;
    private final Interpolator h;
    
    static {
        f = Math.sqrt(2.0);
    }
    
    public vj(final Context context) {
        super(context, (AttributeSet)null, 0, 0);
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        this.a = shapeDrawable;
        shapeDrawable.getPaint().setColor(-3355444);
        super.setBackgroundDrawable((Drawable)shapeDrawable);
        this.setOutlineProvider((ViewOutlineProvider)new vi(this));
        this.h = (Interpolator)new AccelerateInterpolator(2.0f);
        this.e = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, ug.d, 0, 0);
        int i = 0;
        int clickable = 1;
        while (i < obtainStyledAttributes.getIndexCount()) {
            final int index = obtainStyledAttributes.getIndex(i);
            boolean boolean1;
            if (index == 2) {
                this.b = obtainStyledAttributes.getColorStateList(2);
                this.a.getPaint().setColor(this.b.getDefaultColor());
                boolean1 = (clickable != 0);
            }
            else if (index == 1) {
                this.c = obtainStyledAttributes.getDrawable(1);
                boolean1 = (clickable != 0);
            }
            else if (index == 5) {
                this.b(obtainStyledAttributes.getColor(5, -1));
                boolean1 = (clickable != 0);
            }
            else if (index == 7) {
                this.a(obtainStyledAttributes.getDimension(7, 0.0f));
                boolean1 = (clickable != 0);
            }
            else if (index == 6) {
                this.e = obtainStyledAttributes.getInt(6, this.e);
                boolean1 = (clickable != 0);
            }
            else {
                boolean1 = (clickable != 0);
                if (index == 0) {
                    boolean1 = obtainStyledAttributes.getBoolean(0, (boolean)(clickable != 0));
                }
            }
            ++i;
            clickable = (boolean1 ? 1 : 0);
        }
        obtainStyledAttributes.recycle();
        this.setClickable((boolean)(clickable != 0));
    }
    
    private static boolean c(final Drawable drawable) {
        return drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0;
    }
    
    private final void d(final Animator animator) {
        animator.setInterpolator((TimeInterpolator)this.h);
    }
    
    public final void a(final float n) {
        final StateListAnimator stateListAnimator = new StateListAnimator();
        final int[] pressed_ENABLED_STATE_SET = vj.PRESSED_ENABLED_STATE_SET;
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this, "translationZ", new float[] { n });
        this.d((Animator)ofFloat);
        stateListAnimator.addState(pressed_ENABLED_STATE_SET, (Animator)ofFloat);
        final int[] enabled_FOCUSED_STATE_SET = vj.ENABLED_FOCUSED_STATE_SET;
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this, "translationZ", new float[] { n });
        this.d((Animator)ofFloat2);
        stateListAnimator.addState(enabled_FOCUSED_STATE_SET, (Animator)ofFloat2);
        final int[] empty_STATE_SET = vj.EMPTY_STATE_SET;
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this, "translationZ", new float[] { this.getElevation() });
        this.d((Animator)ofFloat3);
        stateListAnimator.addState(empty_STATE_SET, (Animator)ofFloat3);
        this.setStateListAnimator(stateListAnimator);
    }
    
    public final void b(final int n) {
        final RippleDrawable g = this.g;
        if (g != null) {
            g.setColor(ColorStateList.valueOf(n));
            return;
        }
        if (n != -1 && !this.isInEditMode()) {
            final ColorStateList value = ColorStateList.valueOf(n);
            final ShapeDrawable a = this.a;
            super.setBackgroundDrawable((Drawable)(this.g = new RippleDrawable(value, (Drawable)a, (Drawable)a)));
            return;
        }
        this.g = null;
        super.setBackgroundDrawable((Drawable)this.a);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final ColorStateList b = this.b;
        if (b != null && b.isStateful()) {
            this.a.getPaint().setColor(this.b.getColorForState(this.getDrawableState(), this.b.getDefaultColor()));
            this.a.invalidateSelf();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Drawable c = this.c;
        if (c != null) {
            c.draw(canvas);
        }
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final Drawable c = this.c;
        if (c == null) {
            return;
        }
        final int intrinsicWidth = c.getIntrinsicWidth();
        final int intrinsicHeight = this.c.getIntrinsicHeight();
        if (this.e != 0 && c(this.c)) {
            n = (int)((n3 - n - intrinsicWidth) / 2.0f);
            n2 = (int)((n4 - n2 - intrinsicHeight) / 2.0f);
            this.c.setBounds(n, n2, intrinsicWidth + n, intrinsicHeight + n2);
            return;
        }
        final double n5 = this.d / 2;
        final double f = vj.f;
        Double.isNaN(n5);
        n2 = (int)Math.floor(n5 * f);
        n = (this.d - n2) / 2;
        if (!c(this.c)) {
            n2 += n;
            this.c.setBounds(n, n, n2, n2);
            return;
        }
        int n6;
        if (intrinsicWidth == intrinsicHeight) {
            n3 = n2;
            n4 = n;
            n6 = n2;
        }
        else {
            final float n7 = intrinsicWidth / (float)intrinsicHeight;
            if (intrinsicWidth > intrinsicHeight) {
                n3 = (int)(n2 / n7);
                n4 = (int)((n2 - n3) / 2.0f);
                n6 = n2;
            }
            else {
                n3 = (int)(n2 * n7);
                final int n8 = (int)((n2 - n3) / 2.0f);
                n4 = n;
                n = n8;
                n6 = n3;
                n3 = n2;
            }
        }
        this.c.setBounds(n, n4, n6 + n, n3 + n4);
    }
    
    protected final void onMeasure(int d, int d2) {
        int mode = View$MeasureSpec.getMode(d);
        final int size = View$MeasureSpec.getSize(d);
        final int mode2 = View$MeasureSpec.getMode(d2);
        d2 = View$MeasureSpec.getSize(d2);
        Label_0242: {
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    d = Math.min(size, d2);
                    this.d = d;
                    break Label_0242;
                }
                mode = 1073741824;
            }
            if (mode == 1073741824) {
                this.d = size;
                d = size;
            }
            else if (mode2 == 1073741824) {
                this.d = d2;
                d = d2;
            }
            else {
                if (c(this.c)) {
                    d = Math.max(this.c.getIntrinsicHeight(), this.c.getIntrinsicWidth());
                }
                else {
                    d = (int)Math.ceil(TypedValue.applyDimension(1, 48.0f, this.getResources().getDisplayMetrics()));
                }
                if (mode != Integer.MIN_VALUE && mode2 != Integer.MIN_VALUE) {
                    this.d = d;
                }
                else {
                    if (mode == Integer.MIN_VALUE) {
                        if (mode2 != Integer.MIN_VALUE) {
                            d2 = size;
                        }
                        else {
                            d2 = Math.min(size, d2);
                        }
                    }
                    final double n = d;
                    final double f = vj.f;
                    Double.isNaN(n);
                    d = (int)Math.floor(n / f);
                    d = Math.min(d2, d + d);
                    this.d = d;
                }
            }
        }
        this.setMeasuredDimension(d, d);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            switch (motionEvent.getAction() & 0xFF) {
                case 0: {
                    this.getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                    return true;
                }
            }
        }
        return onTouchEvent;
    }
    
    public final void setBackgroundDrawable(final Drawable drawable) {
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
