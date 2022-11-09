// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.graphics.Canvas;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.animation.Animator;
import android.view.animation.Interpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.AnimationUtils;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.Paint$Style;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.animation.AnimatorSet;
import android.view.View$OnClickListener;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.widget.ImageButton;

public class RoundedThumbnailView extends ImageButton
{
    private static final float HIT_STATE_CIRCLE_OPACITY_BEGIN = 0.7f;
    private static final float HIT_STATE_CIRCLE_OPACITY_END = 0.0f;
    private static final float HIT_STATE_CIRCLE_OPACITY_HIDDEN = -1.0f;
    private static final long HIT_STATE_DURATION_MS = 150L;
    private static final int MARS_PLACEHOLDER_ICON_COLOR = -7129882;
    private static final int MAX_THUMBNAIL_BITMAP_SIZE = 512;
    private static final int PLACEHOLDER_ICON_COLOR = -10525848;
    private static final long RIPPLE_DURATION_MS = 200L;
    private static final float RIPPLE_OPACITY_BEGIN = 0.4f;
    private static final float RIPPLE_OPACITY_END = 0.0f;
    private static final long RIPPLE_START_DELAY_MS = 100L;
    private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN = 0.8f;
    private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_END = 0.0f;
    private static final long THUMBNAIL_FLASH_DURATION_MS = 200L;
    private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN = 0.5f;
    private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_END = 0.0f;
    private static final long THUMBNAIL_SHRINK_DURATION_MS = 200L;
    private static final long THUMBNAIL_STRETCH_DURATION_MS = 200L;
    private static final nsd logger;
    private RoundedThumbnailView$RevealRequest backgroundRequest;
    private Paint borderStrokePaint;
    private ValueAnimator burstFlashAnimator;
    private niz callback;
    private float currentHitStateCircleOpacity;
    private float currentRevealCircleOpacity;
    private float currentRippleRingDiameter;
    private float currentRippleRingOpacity;
    private float currentRippleRingThickness;
    private float currentThumbnailDiameter;
    private RoundedThumbnailView$RevealRequest foregroundRequest;
    private Paint hitStateCirclePaint;
    private float innerStrokeWidth;
    private boolean isMaterialNextEnabled;
    private final View$OnClickListener onClickListener;
    private niz optionalOnClickListener;
    private RoundedThumbnailView$RevealRequest pendingRequest;
    private Paint revealCirclePaint;
    private ValueAnimator rippleAnimator;
    private Paint ripplePaint;
    private float rippleRingDiameterBegin;
    private float rippleRingDiameterEnd;
    private float rippleRingThicknessBegin;
    private float rippleRingThicknessEnd;
    private boolean shrinkTouchArea;
    private AnimatorSet thumbnailAnimatorSet;
    private float thumbnailPadding;
    private float thumbnailShrinkDiameterBegin;
    private float thumbnailShrinkDiameterEnd;
    private float thumbnailStretchDiameterBegin;
    private float thumbnailStretchDiameterEnd;
    private float thumbnailTypeIconSize;
    private int touchShrinkSize;
    private RectF viewRect;
    
    static {
        logger = nsd.g("com/google/android/apps/camera/bottombar/RoundedThumbnailView");
    }
    
    public RoundedThumbnailView(final Context context, final AttributeSet set) {
        super(context, set);
        this.shrinkTouchArea = false;
        this.onClickListener = (View$OnClickListener)new RoundedThumbnailView$1(this);
        this.initialize();
    }
    
    private void clearAnimations() {
        final AnimatorSet thumbnailAnimatorSet = this.thumbnailAnimatorSet;
        if (thumbnailAnimatorSet != null && thumbnailAnimatorSet.isStarted()) {
            this.thumbnailAnimatorSet.removeAllListeners();
            this.thumbnailAnimatorSet.cancel();
            this.thumbnailAnimatorSet = null;
        }
        final ValueAnimator rippleAnimator = this.rippleAnimator;
        if (rippleAnimator != null && rippleAnimator.isStarted()) {
            this.rippleAnimator.removeAllListeners();
            this.rippleAnimator.cancel();
            this.rippleAnimator = null;
        }
        final ValueAnimator burstFlashAnimator = this.burstFlashAnimator;
        if (burstFlashAnimator != null && burstFlashAnimator.isStarted()) {
            this.burstFlashAnimator.removeAllListeners();
            this.burstFlashAnimator.cancel();
            this.burstFlashAnimator = null;
        }
    }
    
    private int getColor(final int n) {
        return this.getResources().getColor(n, (Resources$Theme)null);
    }
    
    private void initialize() {
        this.callback = nii.a;
        this.optionalOnClickListener = nii.a;
        this.setClickable(true);
        super.setOnClickListener(this.onClickListener);
        this.thumbnailPadding = this.getResources().getDimension(R$dimen.rounded_thumbnail_padding);
        this.thumbnailStretchDiameterBegin = this.getResources().getDimension(R$dimen.rounded_thumbnail_diameter_min);
        final float dimension = this.getResources().getDimension(R$dimen.rounded_thumbnail_diameter_max);
        this.thumbnailStretchDiameterEnd = dimension;
        this.thumbnailShrinkDiameterBegin = dimension;
        this.thumbnailShrinkDiameterEnd = this.getResources().getDimension(R$dimen.rounded_thumbnail_diameter_normal);
        this.thumbnailTypeIconSize = this.getResources().getDimension(R$dimen.rounded_thumbnail_type_icon_size);
        final float dimension2 = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_diameter_max);
        this.rippleRingDiameterEnd = dimension2;
        this.viewRect = new RectF(0.0f, 0.0f, dimension2, dimension2);
        this.rippleRingDiameterBegin = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_diameter_min);
        this.rippleRingThicknessBegin = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_thick_max);
        this.rippleRingThicknessEnd = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_thick_min);
        this.touchShrinkSize = this.getResources().getDimensionPixelOffset(R$dimen.rounded_thumbnail_shrink_size);
        this.currentHitStateCircleOpacity = -1.0f;
        (this.hitStateCirclePaint = new Paint(1)).setColor(-1);
        this.hitStateCirclePaint.setStyle(Paint$Style.FILL);
        (this.ripplePaint = new Paint(1)).setColor(-1);
        this.ripplePaint.setStyle(Paint$Style.STROKE);
        (this.revealCirclePaint = new Paint(1)).setColor(-1);
        this.revealCirclePaint.setStyle(Paint$Style.FILL);
        (this.borderStrokePaint = new Paint(1)).setStyle(Paint$Style.STROKE);
        final float dimension3 = this.getResources().getDimension(R$dimen.rounded_thumbnail_inner_stroke_width);
        this.innerStrokeWidth = dimension3;
        this.borderStrokePaint.setStrokeWidth(dimension3);
        this.borderStrokePaint.setColor(-1);
        this.setThumbnail(this.getDefaultThumbnail(jbz.a), 0);
        final Drawable background = this.getBackground();
        if (background instanceof RippleDrawable) {
            final Drawable mutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable)mutate).setRadius(this.getResources().getDimensionPixelSize(R$dimen.camera_switch_button_ripple_diameter) / 2);
            this.setBackground(mutate);
        }
    }
    
    private void processRevealRequests() {
        final RoundedThumbnailView$RevealRequest foregroundRequest = this.foregroundRequest;
        if (foregroundRequest != null && foregroundRequest.isFinished()) {
            this.backgroundRequest = this.foregroundRequest;
            this.foregroundRequest = null;
        }
    }
    
    private void runBurstFlashAnimation() {
        final RoundedThumbnailView$RevealRequest foregroundRequest = this.foregroundRequest;
        if (foregroundRequest != null) {
            (this.backgroundRequest = foregroundRequest).finishRippleAnimation();
            this.backgroundRequest.finishThumbnailAnimation();
        }
        this.foregroundRequest = this.backgroundRequest;
        this.pendingRequest = null;
        this.clearAnimations();
        this.setVisibility(0);
        final Interpolator loadInterpolator = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
        (this.burstFlashAnimator = ValueAnimator.ofFloat(new float[] { this.thumbnailStretchDiameterBegin, this.thumbnailShrinkDiameterEnd })).setDuration(200L);
        this.burstFlashAnimator.setInterpolator((TimeInterpolator)loadInterpolator);
        this.burstFlashAnimator.setRepeatCount(-1);
        this.burstFlashAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new RoundedThumbnailView$$ExternalSyntheticLambda0(this));
        this.burstFlashAnimator.addListener((Animator$AnimatorListener)new RoundedThumbnailView$4(this));
        this.burstFlashAnimator.start();
    }
    
    private void runPendingRequestAnimation(final boolean b) {
        final RoundedThumbnailView$RevealRequest pendingRequest = this.pendingRequest;
        nov.z(pendingRequest);
        final boolean b2 = pendingRequest.isAnimationDisabled() ^ true;
        if (b2) {
            this.backgroundRequest = null;
            final RoundedThumbnailView$RevealRequest foregroundRequest = this.foregroundRequest;
            if (foregroundRequest != null && b) {
                (this.backgroundRequest = foregroundRequest).finishRippleAnimation();
                this.backgroundRequest.finishThumbnailAnimation();
            }
        }
        final RoundedThumbnailView$RevealRequest pendingRequest2 = this.pendingRequest;
        this.foregroundRequest = pendingRequest2;
        this.pendingRequest = null;
        if (!b2) {
            if (this.thumbnailAnimatorSet == null) {
                this.currentThumbnailDiameter = this.thumbnailShrinkDiameterEnd;
                this.currentRevealCircleOpacity = 0.0f;
                nov.z(pendingRequest2);
                pendingRequest2.finishThumbnailAnimation();
            }
            if (this.rippleAnimator == null) {
                final RoundedThumbnailView$RevealRequest foregroundRequest2 = this.foregroundRequest;
                nov.z(foregroundRequest2);
                foregroundRequest2.finishRippleAnimation();
            }
            this.invalidate();
            return;
        }
        this.clearAnimations();
        this.setVisibility(0);
        final Interpolator loadInterpolator = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { this.thumbnailStretchDiameterBegin, this.thumbnailStretchDiameterEnd });
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator((TimeInterpolator)loadInterpolator);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new RoundedThumbnailView$$ExternalSyntheticLambda1(this));
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { this.thumbnailShrinkDiameterBegin, this.thumbnailShrinkDiameterEnd });
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator((TimeInterpolator)loadInterpolator);
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new RoundedThumbnailView$$ExternalSyntheticLambda2(this));
        (this.thumbnailAnimatorSet = new AnimatorSet()).playSequentially(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
        this.thumbnailAnimatorSet.addListener((Animator$AnimatorListener)new RoundedThumbnailView$2(this));
        this.thumbnailAnimatorSet.start();
        final Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(this.getContext(), 17563662);
        (this.rippleAnimator = ValueAnimator.ofFloat(new float[] { this.rippleRingDiameterBegin, this.rippleRingDiameterEnd })).setDuration(200L);
        this.rippleAnimator.setInterpolator((TimeInterpolator)loadInterpolator2);
        this.rippleAnimator.addListener((Animator$AnimatorListener)new RoundedThumbnailView$3(this));
        this.rippleAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new RoundedThumbnailView$$ExternalSyntheticLambda3(this));
        this.rippleAnimator.setStartDelay(100L);
        this.rippleAnimator.start();
        final RoundedThumbnailView$RevealRequest foregroundRequest3 = this.foregroundRequest;
        nov.z(foregroundRequest3);
        this.announceForAccessibility((CharSequence)foregroundRequest3.getAccessibilityString());
    }
    
    private void setThumbnail(final Bitmap bitmap, final int n, final boolean b) {
        bitmap.getClass();
        kjm.a();
        if (this.pendingRequest == null) {
            this.pendingRequest = RoundedThumbnailView$RevealRequest.createNonAnimatedRevealRequest(this.rippleRingDiameterEnd, "");
        }
        this.pendingRequest.setThumbnailBitmap(bitmap, n);
        if (this.getVisibility() != 0) {
            this.backgroundRequest = null;
            this.foregroundRequest = null;
        }
        this.runPendingRequestAnimation(b);
    }
    
    private void stopBurstFlashAnimation() {
        final ValueAnimator burstFlashAnimator = this.burstFlashAnimator;
        if (burstFlashAnimator != null) {
            burstFlashAnimator.setRepeatCount(0);
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return (!this.shrinkTouchArea || motionEvent.getAction() != 0 || motionEvent.getY() >= this.touchShrinkSize) && super.dispatchTouchEvent(motionEvent);
    }
    
    public void flashThumbnail() {
        kjm.a();
        this.runBurstFlashAnimation();
    }
    
    public Bitmap getDefaultThumbnail(final jbz jbz) {
        final int n = (int)this.thumbnailShrinkDiameterEnd;
        final Bitmap bitmap = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
        bitmap.eraseColor(this.getColor(R$color.indicator_background));
        final jbz a = jbz.a;
        final int ordinal = jbz.ordinal();
        Drawable drawable = null;
        switch (ordinal) {
            case 5: {
                drawable = this.getResources().getDrawable(R$drawable.quantum_gm_ic_lock_vd_theme_24, (Resources$Theme)null);
                break;
            }
            case 4: {
                drawable = this.getResources().getDrawable(R$drawable.ic_videocam_thumbnail, (Resources$Theme)null);
                break;
            }
            case 3: {
                drawable = this.getResources().getDrawable(R$drawable.ic_burst_thumbnail, (Resources$Theme)null);
                break;
            }
            case 2: {
                drawable = this.getResources().getDrawable(R$drawable.ic_camera_thumbnail, (Resources$Theme)null);
                break;
            }
            case 1: {
                drawable = this.getResources().getDrawable(R$drawable.quantum_gm_ic_lock_vd_theme_24, (Resources$Theme)null);
                if (this.isMaterialNextEnabled) {
                    drawable.mutate().setTint(leg.i((View)this));
                }
                int m;
                if (this.isMaterialNextEnabled) {
                    m = leg.m((View)this);
                }
                else {
                    m = -7129882;
                }
                bitmap.eraseColor(m);
                break;
            }
            case 0: {
                bitmap.eraseColor(-10525848);
                return bitmap;
            }
        }
        final Canvas canvas = new Canvas(bitmap);
        if (drawable != null) {
            final float thumbnailTypeIconSize = this.thumbnailTypeIconSize;
            final int n2 = (int)((n - thumbnailTypeIconSize) / 2.0f);
            final int n3 = (int)thumbnailTypeIconSize + n2;
            drawable.setBounds(n2, n2, n3, n3);
            drawable.draw(canvas);
        }
        return bitmap;
    }
    
    public float getRippleRingMaxDiameterDp() {
        return this.rippleRingDiameterEnd;
    }
    
    public float getThumbnailFinalDiameter() {
        return this.thumbnailShrinkDiameterEnd;
    }
    
    public float getThumbnailPadding() {
        return this.thumbnailPadding;
    }
    
    public boolean hasOverlappingRendering() {
        return true;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final float n = (float)(canvas.getWidth() / 2);
        final float n2 = (float)(canvas.getHeight() / 2);
        final float rippleRingDiameterEnd = this.rippleRingDiameterEnd;
        final float thumbnailShrinkDiameterEnd = this.thumbnailShrinkDiameterEnd;
        canvas.clipRect(this.viewRect);
        final RoundedThumbnailView$RevealRequest backgroundRequest = this.backgroundRequest;
        if (backgroundRequest != null) {
            final Paint thumbnailPaint = backgroundRequest.getThumbnailPaint();
            if (thumbnailPaint != null) {
                final float n3 = thumbnailShrinkDiameterEnd / rippleRingDiameterEnd;
                canvas.save();
                canvas.scale(n3, n3, n, n2);
                canvas.drawRoundRect(this.viewRect, n, n2, thumbnailPaint);
                final float strokeWidth = this.innerStrokeWidth / n3;
                this.borderStrokePaint.setStrokeWidth(strokeWidth);
                canvas.drawCircle(n, n2, n - strokeWidth / 2.0f, this.borderStrokePaint);
                canvas.restore();
            }
        }
        if (this.foregroundRequest != null) {
            if (this.currentRippleRingThickness > 0.0f) {
                final ValueAnimator rippleAnimator = this.rippleAnimator;
                if (rippleAnimator != null && rippleAnimator.isRunning()) {
                    this.ripplePaint.setAlpha((int)(this.currentRippleRingOpacity * 255.0f));
                    this.ripplePaint.setStrokeWidth(this.currentRippleRingThickness);
                    canvas.save();
                    canvas.drawCircle(n, n2, this.currentRippleRingDiameter / 2.0f, this.ripplePaint);
                    canvas.restore();
                }
            }
            final float n4 = this.currentThumbnailDiameter / this.rippleRingDiameterEnd;
            canvas.save();
            canvas.scale(n4, n4, n, n2);
            final RoundedThumbnailView$RevealRequest foregroundRequest = this.foregroundRequest;
            nov.z(foregroundRequest);
            final Paint thumbnailPaint2 = foregroundRequest.getThumbnailPaint();
            if (thumbnailPaint2 != null) {
                canvas.drawRoundRect(this.viewRect, n, n2, thumbnailPaint2);
                final float strokeWidth2 = this.innerStrokeWidth / n4;
                this.borderStrokePaint.setStrokeWidth(strokeWidth2);
                canvas.drawCircle(n, n2, n - strokeWidth2 / 2.0f, this.borderStrokePaint);
            }
            this.revealCirclePaint.setAlpha((int)(this.currentRevealCircleOpacity * 255.0f));
            canvas.drawCircle(n, n2, this.rippleRingDiameterEnd / 2.0f, this.revealCirclePaint);
            canvas.restore();
        }
        if (this.currentHitStateCircleOpacity != -1.0f) {
            canvas.save();
            final float n5 = thumbnailShrinkDiameterEnd / rippleRingDiameterEnd;
            canvas.scale(n5, n5, n, n2);
            this.hitStateCirclePaint.setAlpha((int)(this.currentHitStateCircleOpacity * 255.0f));
            canvas.drawCircle(n, n2, this.rippleRingDiameterEnd / 2.0f, this.hitStateCirclePaint);
            canvas.restore();
        }
    }
    
    protected void onMeasure(int n, final int n2) {
        n = (int)this.rippleRingDiameterEnd;
        this.setMeasuredDimension(n, n);
    }
    
    public void resetThumbnailView() {
        this.setPressed(false);
        this.invalidate();
    }
    
    public void setCallback(final RoundedThumbnailView$Callback roundedThumbnailView$Callback) {
        this.callback = niz.i(roundedThumbnailView$Callback);
    }
    
    public void setMaterialNextEnabled(final boolean isMaterialNextEnabled) {
        this.isMaterialNextEnabled = isMaterialNextEnabled;
    }
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        this.optionalOnClickListener = niz.h(view$OnClickListener);
    }
    
    public void setShrinkTouchArea(final boolean shrinkTouchArea) {
        this.shrinkTouchArea = shrinkTouchArea;
    }
    
    public void setThumbnail(final Bitmap bitmap, final int n) {
        this.setThumbnail(bitmap, n, true);
    }
    
    public void startRevealThumbnailAnimation(final String s) {
        kjm.a();
        this.pendingRequest = RoundedThumbnailView$RevealRequest.createAnimatedRevealRequest((float)this.getMeasuredWidth(), s);
    }
    
    public void stopFlashThumbnail() {
        kjm.a();
        this.stopBurstFlashAnimation();
    }
}
