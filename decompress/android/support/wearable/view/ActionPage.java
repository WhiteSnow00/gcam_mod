// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.view;

import android.animation.StateListAnimator;
import android.view.View$OnClickListener;
import android.view.View$MeasureSpec;
import android.view.WindowInsets;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.view.View;
import android.animation.AnimatorInflater;
import android.util.TypedValue;
import j$.util.Objects;
import android.graphics.drawable.Drawable$Callback;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;

@Deprecated
public class ActionPage extends ViewGroup
{
    private final ve a;
    private vj b;
    private int c;
    private float d;
    private final Point e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private boolean j;
    
    public ActionPage(final Context context) {
        this(context, null);
    }
    
    public ActionPage(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionPage(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 2132018126);
    }
    
    public ActionPage(final Context context, final AttributeSet set, int i, int int1) {
        super(context, set, i, int1);
        this.e = new Point();
        this.b = new vj(context);
        final ve a = new ve(context);
        (this.a = a).a(17);
        a.b(2);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ug.b, i, int1);
        float dimension = 1.0f;
        String string = null;
        i = 0;
        float dimension2 = 0.0f;
        int int2 = 1;
        int1 = 0;
        while (i < obtainStyledAttributes.getIndexCount()) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 7) {
                final vj b = this.b;
                b.b = obtainStyledAttributes.getColorStateList(7);
                b.a.getPaint().setColor(b.b.getDefaultColor());
            }
            else if (index == 4) {
                final vj b2 = this.b;
                final Drawable drawable = obtainStyledAttributes.getDrawable(4);
                final Drawable c = b2.c;
                if (c != null) {
                    c.setCallback((Drawable$Callback)null);
                }
                if (b2.c != drawable) {
                    b2.c = drawable;
                    b2.requestLayout();
                    b2.invalidate();
                }
                final Drawable c2 = b2.c;
                if (c2 != null) {
                    c2.setCallback((Drawable$Callback)b2);
                }
            }
            else if (index == 14) {
                final vj b3 = this.b;
                b3.e = obtainStyledAttributes.getInt(14, 0);
                if (b3.c != null) {
                    b3.invalidate();
                    b3.requestLayout();
                }
            }
            else if (index == 13) {
                this.b.b(obtainStyledAttributes.getColor(13, -1));
            }
            else if (index == 17) {
                this.b.a(obtainStyledAttributes.getDimension(17, 0.0f));
            }
            else if (index == 5) {
                final ve a2 = this.a;
                final CharSequence text = obtainStyledAttributes.getText(5);
                if (text == null) {
                    throw new RuntimeException("Can not set ActionLabel text to null");
                }
                if (!Objects.equals((Object)a2.c, (Object)text)) {
                    a2.a = null;
                    a2.c = text;
                    a2.requestLayout();
                    a2.invalidate();
                }
            }
            else if (index == 16) {
                final ve a3 = this.a;
                final float applyDimension = TypedValue.applyDimension(0, obtainStyledAttributes.getDimension(16, 10.0f), a3.getContext().getResources().getDisplayMetrics());
                if (applyDimension != a3.f) {
                    a3.a = null;
                    a3.f = applyDimension;
                    a3.requestLayout();
                    a3.invalidate();
                }
            }
            else if (index == 15) {
                final ve a4 = this.a;
                final float applyDimension2 = TypedValue.applyDimension(0, obtainStyledAttributes.getDimension(15, 60.0f), a4.getContext().getResources().getDisplayMetrics());
                if (applyDimension2 != a4.g) {
                    a4.a = null;
                    a4.g = applyDimension2;
                    a4.requestLayout();
                    a4.invalidate();
                }
            }
            else if (index == 2) {
                final ve a5 = this.a;
                final ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
                if (colorStateList == null) {
                    throw null;
                }
                a5.b = colorStateList;
                a5.e();
            }
            else if (index == 6) {
                this.a.b(obtainStyledAttributes.getInt(6, 2));
            }
            else if (index == 10) {
                string = obtainStyledAttributes.getString(10);
            }
            else if (index == 0) {
                int2 = obtainStyledAttributes.getInt(0, int2);
            }
            else if (index == 1) {
                int1 = obtainStyledAttributes.getInt(1, int1);
            }
            else if (index == 3) {
                this.a.a(obtainStyledAttributes.getInt(3, 17));
            }
            else if (index == 8) {
                dimension2 = obtainStyledAttributes.getDimension(8, dimension2);
            }
            else if (index == 9) {
                dimension = obtainStyledAttributes.getDimension(9, dimension);
            }
            else if (index == 12) {
                this.b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(12, 0)));
            }
            ++i;
        }
        obtainStyledAttributes.recycle();
        final ve a6 = this.a;
        if (a6.e != dimension2 || a6.d != dimension) {
            a6.e = dimension2;
            a6.d = dimension;
            if (a6.a != null) {
                a6.a = null;
                a6.requestLayout();
                a6.invalidate();
            }
        }
        this.a.d(string, int2, int1);
        this.addView((View)this.a);
        this.addView((View)this.b);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        this.j = true;
        if (this.h != windowInsets.isRound()) {
            this.h = windowInsets.isRound();
            this.requestLayout();
        }
        final int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.i != systemWindowInsetBottom) {
            this.i = systemWindowInsetBottom;
            this.requestLayout();
        }
        if (this.h) {
            this.i = (int)Math.max((float)this.i, this.getMeasuredHeight() * 0.09375f);
        }
        return windowInsets;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.j) {
            this.requestApplyInsets();
        }
    }
    
    protected final void onLayout(final boolean b, int n, final int n2, final int n3, final int n4) {
        this.b.layout((int)(this.e.x - this.d), (int)(this.e.y - this.d), (int)(this.e.x + this.d), (int)(this.e.y + this.d));
        n = (int)((n3 - n - this.f) / 2.0f);
        this.a.layout(n, this.b.getBottom(), this.f + n, this.b.getBottom() + this.g);
    }
    
    protected final void onMeasure(int measuredHeight, int measuredWidth) {
        super.onMeasure(measuredHeight, measuredWidth);
        measuredHeight = this.getMeasuredHeight();
        measuredWidth = this.getMeasuredWidth();
        final vj b = this.b;
        if (b.e == 1 && b.c != null) {
            b.measure(0, 0);
            final int min = Math.min(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
            this.c = min;
            this.d = min / 2.0f;
        }
        else {
            final int c = (int)(Math.min(measuredWidth, measuredHeight) * 0.45f);
            this.c = c;
            this.d = c / 2.0f;
            this.b.measure(View$MeasureSpec.makeMeasureSpec(c, 1073741824), View$MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        }
        if (this.h) {
            this.e.set(measuredWidth / 2, measuredHeight / 2);
            this.f = (int)(measuredWidth * 0.625f);
            this.i = (int)(measuredHeight * 0.09375f);
        }
        else {
            this.e.set(measuredWidth / 2, (int)(measuredHeight * 0.43f));
            this.f = (int)(measuredWidth * 0.892f);
        }
        this.g = (int)(measuredHeight - (this.e.y + this.d) - this.i);
        this.a.measure(View$MeasureSpec.makeMeasureSpec(this.f, 1073741824), View$MeasureSpec.makeMeasureSpec(this.g, 1073741824));
    }
    
    public final void setEnabled(final boolean b) {
        super.setEnabled(b);
        final vj b2 = this.b;
        if (b2 != null) {
            b2.setEnabled(b);
        }
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        final vj b = this.b;
        if (b != null) {
            b.setOnClickListener(onClickListener);
        }
    }
    
    public final void setStateListAnimator(final StateListAnimator stateListAnimator) {
        final vj b = this.b;
        if (b != null) {
            b.setStateListAnimator(stateListAnimator);
        }
    }
}
