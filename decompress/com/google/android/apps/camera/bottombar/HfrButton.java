// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.animation.Animator$AnimatorListener;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Paint$Style;
import android.animation.ValueAnimator;
import android.view.View$OnClickListener;
import android.graphics.Paint$FontMetrics;
import android.content.res.Resources$Theme;
import android.graphics.Paint$Align;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.animation.Animator;

public class HfrButton extends ov implements AnimatedImageButton
{
    private static final int ANIMATION_DURATION = 0;
    private static final int INITIAL_STATE = 0;
    private static final boolean IS_240_FPS_SUPPORTED = true;
    private static final int RATE_TEXT_SIZE_SP = 14;
    private Animator animator;
    private Paint backgroundPaint;
    private Paint borderStrokePaint;
    private String[] descriptionStrings;
    private float innerStrokeWidth;
    private int numStates;
    private OnStateChangeListener onStateChangeListener;
    private OnStateChangeListener onStatePreChangeListener;
    private String rateString240;
    private String[] rateStrings;
    private Paint rateTextPaint;
    private float rateTextYOffset;
    private int state;
    private String text;
    
    public HfrButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.initialize();
    }
    
    private Paint createTextPaint(final int n) {
        final Paint paint = new Paint();
        paint.setTextSize(TypedValue.applyDimension(2, (float)n, this.getResources().getDisplayMetrics()));
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setTextAlign(Paint$Align.CENTER);
        paint.setAntiAlias(true);
        return paint;
    }
    
    private int getColor(final int n) {
        return this.getResources().getColor(n, (Resources$Theme)null);
    }
    
    private float getFontYOffset(final Paint paint) {
        final Paint$FontMetrics fontMetrics = paint.getFontMetrics();
        return (Math.abs(fontMetrics.ascent) - Math.abs(fontMetrics.descent)) / 2.0f;
    }
    
    private void initialize() {
        this.setOnClickListener((View$OnClickListener)new HfrButton$$ExternalSyntheticLambda0(this));
        (this.animator = (Animator)ValueAnimator.ofInt(new int[] { 0 })).setDuration(0L);
        (this.backgroundPaint = new Paint()).setColor(this.getColor(R$color.hfr_button_background_color));
        this.backgroundPaint.setAntiAlias(true);
        (this.rateTextPaint = this.createTextPaint(14)).setColor(this.getColor(R$color.hfr_button_text_color));
        this.rateTextYOffset = this.getFontYOffset(this.rateTextPaint);
        this.innerStrokeWidth = this.getResources().getDimension(R$dimen.rounded_thumbnail_inner_stroke_width);
        (this.borderStrokePaint = new Paint(1)).setStyle(Paint$Style.STROKE);
        this.borderStrokePaint.setStrokeWidth(this.innerStrokeWidth);
        this.borderStrokePaint.setColor(-1);
        this.rateStrings = this.getResources().getStringArray(R$array.toybox_hfr_mode_rates);
        this.descriptionStrings = this.getResources().getStringArray(R$array.toybox_hfr_mode_descriptions);
        this.rateString240 = this.getResources().getString(R$string.hfr_fps_240);
        this.numStates = this.rateStrings.length;
        this.setTextFromState(this.state = 0);
    }
    
    private void nextState(int n, final boolean b) {
        if (++n >= this.numStates) {
            n = 0;
        }
        if (b) {
            this.setStateAnimated(n, true);
            return;
        }
        this.setState(n, true);
    }
    
    private void setTextFromState(final int n) {
        this.text = this.rateStrings[n];
        this.setContentDescription((CharSequence)this.descriptionStrings[n]);
        this.invalidate();
    }
    
    private boolean shouldSetState(final int n, final boolean b) {
        return n == this.state;
    }
    
    @Override
    public int getState() {
        return this.state;
    }
    
    protected void onDraw(final Canvas canvas) {
        final float n = (float)(canvas.getWidth() / 2);
        final float n2 = (float)(canvas.getHeight() / 2);
        canvas.drawCircle(n, n2, n, this.backgroundPaint);
        canvas.drawText(this.text, n, this.rateTextYOffset + n2, this.rateTextPaint);
        canvas.drawCircle(n, n2, n - this.innerStrokeWidth / 2.0f, this.borderStrokePaint);
    }
    
    @Override
    public void setOnPreChangeListener(final OnStateChangeListener onStatePreChangeListener) {
        this.onStatePreChangeListener = onStatePreChangeListener;
    }
    
    @Override
    public void setOnStateChangeListener(final OnStateChangeListener onStateChangeListener) {
        this.onStateChangeListener = onStateChangeListener;
    }
    
    @Override
    public void setState(final int state, final boolean b) {
        if (this.shouldSetState(state, false)) {
            return;
        }
        if (b) {
            final OnStateChangeListener onStatePreChangeListener = this.onStatePreChangeListener;
            if (onStatePreChangeListener != null) {
                onStatePreChangeListener.stateChanged((View)this, this.state);
            }
        }
        this.setTextFromState(this.state = state);
        if (b) {
            final OnStateChangeListener onStateChangeListener = this.onStateChangeListener;
            if (onStateChangeListener != null) {
                onStateChangeListener.stateChanged((View)this, state);
            }
        }
    }
    
    @Override
    public void setStateAnimated(final int n, final boolean b) {
        if (this.shouldSetState(n, true)) {
            return;
        }
        this.animator.removeAllListeners();
        this.animator.addListener((Animator$AnimatorListener)new HfrButton$1(this, b, n));
        this.animator.start();
    }
}
