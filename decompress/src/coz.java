import android.content.res.Resources;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.text.TextUtils$TruncateAt;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import android.content.res.Resources$Theme;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coz implements View$OnLayoutChangeListener
{
    final /* synthetic */ int a;
    final /* synthetic */ nle b;
    final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    public final /* synthetic */ cpa f;
    public final /* synthetic */ int g;
    
    public coz(final cpa f, final int a, final nle b, final int g, final int c, final boolean d, final int e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void onLayoutChange(final View view, int i, int n, int n2, int n3, int minWidth, int j, int n4, int dimensionPixelSize) {
        final RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider)view;
        if (view.getWidth() == this.a) {
            final nle b = this.b;
            final int g = this.g;
            i = this.c;
            final cpa f = this.f;
            final int n5 = f.n;
            final cxl d = f.d;
            recordSpeedSlider.removeAllViews();
            recordSpeedSlider.a.set(-1);
            final Resources resources = recordSpeedSlider.getResources();
            recordSpeedSlider.c = b;
            recordSpeedSlider.h = g;
            recordSpeedSlider.f = n5;
            recordSpeedSlider.g = i;
            recordSpeedSlider.e = d;
            final GradientDrawable gradientDrawable = (GradientDrawable)((InsetDrawable)recordSpeedSlider.getBackground()).getDrawable();
            if (!d.k(cxr.at) && gradientDrawable != null) {
                gradientDrawable.setTintMode(PorterDuff$Mode.DST);
                gradientDrawable.setTint(recordSpeedSlider.getContext().getColor(2131101411));
            }
            n4 = b.r().size() + 1;
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166191);
            dimensionPixelSize = resources.getDimensionPixelSize(2131166188);
            final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131166193);
            n2 = resources.getDimensionPixelSize(2131166190);
            n = resources.getDimensionPixelSize(2131166192);
            i = resources.getDimensionPixelSize(2131166189);
            final int dimensionPixelSize4 = resources.getDimensionPixelSize(2131166186);
            final float n6 = (float)resources.getDimensionPixelSize(2131166198);
            final float t = jvu.t(resources.getDimension(2131166197));
            final Drawable drawable = resources.getDrawable(2131231439, (Resources$Theme)null);
            final Drawable drawable2 = resources.getDrawable(2131231440, (Resources$Theme)null);
            String text;
            String contentDescription;
            TextView textView;
            LinearLayout$LayoutParams layoutParams;
            int n7;
            Drawable drawable3;
            for (j = 0; j < n4; ++j) {
                if (j == recordSpeedSlider.f) {
                    text = "";
                }
                else {
                    text = recordSpeedSlider.c.d(recordSpeedSlider.e(j)).get(0);
                }
                n3 = recordSpeedSlider.h;
                if (n3 == 0) {
                    throw null;
                }
                if (n3 == 1) {
                    if (j == recordSpeedSlider.f) {
                        contentDescription = recordSpeedSlider.getResources().getString(2131951652);
                    }
                    else {
                        contentDescription = recordSpeedSlider.c.d(j - 1).get(1);
                    }
                }
                else if (j == recordSpeedSlider.f) {
                    contentDescription = recordSpeedSlider.getResources().getString(2131951652);
                }
                else {
                    contentDescription = recordSpeedSlider.c.d(j).get(1);
                }
                textView = new TextView(recordSpeedSlider.getContext());
                layoutParams = new LinearLayout$LayoutParams(-2, dimensionPixelSize4);
                layoutParams.gravity = 8388627;
                textView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                textView.setEllipsize(TextUtils$TruncateAt.END);
                textView.setSingleLine(true);
                textView.setBackgroundColor(0);
                textView.setGravity(17);
                if (d.k(cxr.at)) {
                    recordSpeedSlider.j(textView, 2131296293, neu.c((View)textView, 2130968871));
                }
                else {
                    recordSpeedSlider.j(textView, 2131296290, recordSpeedSlider.getContext().getColor(2131101415));
                }
                textView.setTextAlignment(4);
                textView.setTextSize(0, n6);
                textView.setText((CharSequence)text);
                textView.setLetterSpacing(t);
                textView.setAlpha(0.0f);
                textView.setContentDescription((CharSequence)contentDescription);
                textView.setOnClickListener((View$OnClickListener)new cpc(recordSpeedSlider, j));
                if (text.length() > 3) {
                    n3 = n;
                    minWidth = i;
                }
                else if (text.length() > 2) {
                    n3 = dimensionPixelSize3;
                    minWidth = n2;
                }
                else {
                    n3 = dimensionPixelSize2;
                    minWidth = dimensionPixelSize;
                }
                textView.setMinWidth(n3);
                textView.setMaxWidth(minWidth);
                if (j == n5) {
                    n3 = resources.getDimensionPixelSize(2131166179);
                    n7 = n3 / 2;
                    minWidth = drawable.getIntrinsicWidth() / 2;
                    textView.setMinWidth(n3);
                    if (g != 1) {
                        drawable3 = drawable2;
                    }
                    else {
                        drawable3 = drawable;
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable3, (Drawable)null, (Drawable)null, (Drawable)null);
                    textView.setCompoundDrawablePadding(0);
                    textView.setPadding(n7 - minWidth, 0, 0, 0);
                }
                else {
                    n3 = recordSpeedSlider.b;
                    textView.setPadding(n3, 0, n3, 0);
                }
                recordSpeedSlider.addView((View)textView, j);
            }
            i = recordSpeedSlider.getResources().getDimensionPixelSize(2131166196);
            recordSpeedSlider.setPadding(i, 0, i, 0);
            i = Math.min(recordSpeedSlider.getRootView().getMeasuredWidth(), recordSpeedSlider.getRootView().getMeasuredHeight());
            if (!recordSpeedSlider.c.t()) {
                n = recordSpeedSlider.getResources().getDimensionPixelSize(2131166195);
                i -= n + n;
                n = recordSpeedSlider.c.r().size() + 1;
                n2 = recordSpeedSlider.getResources().getDimensionPixelSize(2131166196);
                recordSpeedSlider.measure(0, 0);
                if (recordSpeedSlider.getMeasuredWidth() > i) {
                    n2 = (recordSpeedSlider.getMeasuredWidth() - (n2 + n2) - i) / n;
                    TextView textView2;
                    for (i = 0; i < n; ++i) {
                        textView2 = (TextView)recordSpeedSlider.getChildAt(i);
                        minWidth = textView2.getMinWidth();
                        n3 = textView2.getMaxWidth();
                        textView2.setMinWidth(minWidth - n2);
                        textView2.setMaxWidth(n3 - n2);
                    }
                }
            }
            recordSpeedSlider.setOnTouchListener((View$OnTouchListener)new cpd(recordSpeedSlider));
            recordSpeedSlider.requestLayout();
            recordSpeedSlider.invalidate();
            for (i = 0; i < this.b.b; ++i) {
                this.f.a.add(i, false);
            }
            final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)recordSpeedSlider.getLayoutParams();
            layoutParams2.width = -2;
            recordSpeedSlider.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            recordSpeedSlider.d = new coy(this, recordSpeedSlider);
            recordSpeedSlider.f(this.e);
            return;
        }
        if (recordSpeedSlider.getLayoutParams().width == -2) {
            view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
    }
}
