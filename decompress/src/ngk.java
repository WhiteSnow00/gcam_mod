import android.text.Layout;
import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnLayoutChangeListener;
import android.content.res.ColorStateList;
import android.view.PointerIcon;
import android.view.View;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngk extends LinearLayout
{
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private ngh e;
    private int f;
    
    public ngk(final TabLayout d, final Context context) {
        this.d = d;
        super(context);
        this.f = 2;
        final int m = d.m;
        final GradientDrawable gradientDrawable = null;
        if (m != 0) {
            final Drawable b = lp.b(context, m);
            this.c = b;
            if (b != null && b.isStateful()) {
                b.setState(this.getDrawableState());
            }
        }
        else {
            this.c = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Object o = gradientDrawable2;
        if (d.h != null) {
            Object o2 = new GradientDrawable();
            ((GradientDrawable)o2).setCornerRadius(1.0E-5f);
            ((GradientDrawable)o2).setColor(-1);
            final ColorStateList a = nev.a(d.h);
            final boolean u = d.u;
            if (u) {
                gradientDrawable2 = null;
            }
            if (u) {
                o2 = gradientDrawable;
            }
            o = new RippleDrawable(a, (Drawable)gradientDrawable2, (Drawable)o2);
        }
        ik.G((View)this, (Drawable)o);
        d.invalidate();
        ik.M((View)this, d.b, d.c, d.d, d.e);
        this.setGravity(17);
        this.setOrientation((int)((d.s ^ true) ? 1 : 0));
        this.setClickable(true);
        ik.N((View)this, new ig(PointerIcon.getSystemIcon(this.getContext(), 1002)));
    }
    
    private static final void c(final View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new ngj(view));
    }
    
    public final void a(final ngh e) {
        if (e != this.e) {
            this.e = e;
            this.b();
        }
    }
    
    final void b() {
        final ngh e = this.e;
        final ImageView b = this.b;
        boolean selected = false;
        if (b == null) {
            ((ViewGroup)this).addView((View)(this.b = (ImageView)LayoutInflater.from(this.getContext()).inflate(2131623989, (ViewGroup)this, false)), 0);
        }
        if (this.a == null) {
            ((ViewGroup)this).addView((View)(this.a = (TextView)LayoutInflater.from(this.getContext()).inflate(2131623990, (ViewGroup)this, false)));
            this.f = this.a.getMaxLines();
        }
        this.a.setTextAppearance(this.d.f);
        final ColorStateList g = this.d.g;
        if (g != null) {
            this.a.setTextColor(g);
        }
        final TextView a = this.a;
        final ImageView b2 = this.b;
        final ngh e2 = this.e;
        CharSequence b3 = null;
        CharSequence a2;
        if (e2 != null) {
            a2 = e2.a;
        }
        else {
            a2 = null;
        }
        if (b2 != null) {
            b2.setVisibility(8);
            b2.setImageDrawable((Drawable)null);
        }
        final boolean empty = TextUtils.isEmpty(a2);
        final boolean b4 = empty ^ true;
        if (a != null) {
            if (b4) {
                a.setText(a2);
                final int e3 = this.e.e;
                a.setVisibility(0);
                this.setVisibility(0);
            }
            else {
                a.setVisibility(8);
                a.setText((CharSequence)null);
            }
        }
        if (b2 != null) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)b2.getLayoutParams();
            int n;
            if (b4 && b2.getVisibility() == 0) {
                n = (int)neq.a(this.getContext(), 8);
            }
            else {
                n = 0;
            }
            if (this.d.s) {
                if (n != viewGroup$MarginLayoutParams.getMarginEnd()) {
                    viewGroup$MarginLayoutParams.setMarginEnd(n);
                    viewGroup$MarginLayoutParams.bottomMargin = 0;
                    b2.setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                    b2.requestLayout();
                }
            }
            else if (n != viewGroup$MarginLayoutParams.bottomMargin) {
                viewGroup$MarginLayoutParams.bottomMargin = n;
                viewGroup$MarginLayoutParams.setMarginEnd(0);
                b2.setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                b2.requestLayout();
            }
        }
        final ngh e4 = this.e;
        if (e4 != null) {
            b3 = e4.b;
        }
        if (empty) {
            a2 = b3;
        }
        ((View)this).setTooltipText(a2);
        c((View)this.b);
        c((View)this.a);
        if (e != null && !TextUtils.isEmpty(e.b)) {
            this.setContentDescription(e.b);
        }
        if (e != null) {
            final TabLayout f = e.f;
            if (f == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if (f.a() == e.c) {
                selected = true;
            }
        }
        this.setSelected(selected);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable c = this.c;
        if (c != null && c.isStateful() && this.c.setState(drawableState)) {
            this.invalidate();
            this.d.invalidate();
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final jc a = jc.a(accessibilityNodeInfo);
        a.g(jb.a(0, 1, this.e.c, 1, this.isSelected()));
        if (this.isSelected()) {
            a.a.setClickable(false);
            a.j(iz.a);
        }
        a.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", (CharSequence)this.getResources().getString(2131952147));
    }
    
    public final void onMeasure(int maxLines, final int n) {
        final int size = View$MeasureSpec.getSize(maxLines);
        final int mode = View$MeasureSpec.getMode(maxLines);
        final int n2 = this.d.n;
        int measureSpec = maxLines;
        Label_0052: {
            if (n2 > 0) {
                if (mode != 0) {
                    measureSpec = maxLines;
                    if (size <= n2) {
                        break Label_0052;
                    }
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(measureSpec, n);
        if (this.a != null) {
            final float k = this.d.k;
            final int f = this.f;
            final ImageView b = this.b;
            float l;
            if (b != null && b.getVisibility() == 0) {
                maxLines = 1;
                l = k;
            }
            else {
                final TextView a = this.a;
                l = k;
                maxLines = f;
                if (a != null) {
                    l = k;
                    maxLines = f;
                    if (a.getLineCount() > 1) {
                        l = this.d.l;
                        maxLines = f;
                    }
                }
            }
            final float textSize = this.a.getTextSize();
            final int lineCount = this.a.getLineCount();
            final int maxLines2 = this.a.getMaxLines();
            if (l != textSize || (maxLines2 >= 0 && maxLines != maxLines2)) {
                if (this.d.r == 1 && l > textSize && lineCount == 1) {
                    final Layout layout = this.a.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if (layout.getLineWidth(0) * (l / layout.getPaint().getTextSize()) > this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()) {
                        return;
                    }
                }
                this.a.setTextSize(0, l);
                this.a.setMaxLines(maxLines);
                super.onMeasure(measureSpec, n);
            }
        }
    }
    
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e != null) {
            if (!performClick) {
                this.playSoundEffect(0);
            }
            this.e.a();
            performClick = true;
        }
        return performClick;
    }
    
    public final void setSelected(final boolean selected) {
        this.isSelected();
        super.setSelected(selected);
        final TextView a = this.a;
        if (a != null) {
            a.setSelected(selected);
        }
        final ImageView b = this.b;
        if (b != null) {
            b.setSelected(selected);
        }
    }
}
