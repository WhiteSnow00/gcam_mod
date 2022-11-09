// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.camcorder.ui.modeslider;

import android.widget.TextView;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import android.widget.FrameLayout;

public class ModeSliderUi extends FrameLayout
{
    private ModeSlider a;
    private RecordSpeedSlider b;
    private jcb c;
    
    public ModeSliderUi(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = jcb.a;
    }
    
    public final ModeSlider a() {
        final ModeSlider a = this.a;
        a.getClass();
        return a;
    }
    
    public final RecordSpeedSlider b() {
        final RecordSpeedSlider b = this.b;
        b.getClass();
        return b;
    }
    
    public final void c(final jcb c) {
        jvu.r((View)this, this.c = c);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624054, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
        final ModeSlider a = (ModeSlider)this.findViewById(2131427771);
        a.getClass();
        this.a = a;
        final RecordSpeedSlider b = (RecordSpeedSlider)this.findViewById(2131427869);
        b.getClass();
        this.b = b;
    }
    
    protected final void onLayout(final boolean b, int i, int n, int maxWidth, final int n2) {
        super.onLayout(b, i, n, maxWidth, n2);
        if (b) {
            final ModeSlider a = this.a();
            i = this.getMeasuredWidth();
            this.getMeasuredHeight();
            n = a.getResources().getDimensionPixelSize(2131165848);
            maxWidth = i - (n + n);
            n = a.b.size();
            i = a.getResources().getDimensionPixelSize(2131165849);
            if (a.getMeasuredWidth() > maxWidth) {
                maxWidth = (maxWidth - (i + i)) / n;
                for (i = 0; i < n; ++i) {
                    ((TextView)a.getChildAt(i)).setMaxWidth(maxWidth);
                }
            }
            this.c(this.c);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.c)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
}
