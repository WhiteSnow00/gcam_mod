// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.shutterbutton;

import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import java.util.Arrays;
import android.view.View;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewOutlineProvider;
import android.content.res.Resources$Theme;
import android.graphics.Paint$Style;
import android.view.GestureDetector$OnGestureListener;
import android.graphics.LightingColorFilter;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import j$.util.function.Consumer;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.AnimatorSet;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.animation.ValueAnimator;
import java.util.concurrent.atomic.AtomicBoolean;
import android.graphics.Paint;
import android.graphics.RectF;

public class ShutterButton extends ov
{
    private static final int ALL_CIRCLE_SCALES = 360;
    private static final float BUTTON_CLICK_SPLASH_FACTOR = 1.06f;
    private static final int BUTTON_CLICK_SPLASH_IN_DURATION_MS = 250;
    private static final int BUTTON_CLICK_SPLASH_OUT_DURATION_MS = 100;
    private static final int BUTTON_DISABLED_DELAY_MS = 500;
    private static final noi CAROUSEL_IDLE_MODES;
    static final int DISABLED_FILTER_COLOR_VALUE = 165;
    private static final int INNER_DOTS_BASE = 18;
    private static final float INTER_CIRCLE_RING_ALPHA = 0.32f;
    private static final int MSG_UPDATE_CIRCLE_PAUSE_STATE = 1001;
    private static final int MSG_UPDATE_CIRCLE_PROGRESS_STATE = 1002;
    private static final int MSG_UPDATE_CIRCLE_RESUME_STATE = 1000;
    private static final int PHOTO_DISABLE_ANIMATION_DURATION_MS = 150;
    private static final long TICK_MARK_BLINKING_INTERVAL_MS = 1000L;
    private static final int TICK_MARK_SCALE_BASE = 30;
    private static final int TICK_MARK_SCALE_SIZE = 30;
    private static final float VIDEO_RECORDING_INTER_CIRCLE_RING_ALPHA = 0.86f;
    private static final nsd logger;
    private static ium msgHandler;
    private static iun progressState;
    private jbm applicationMode;
    private boolean blockClickForAnimation;
    private int buttonCenterX;
    private int buttonCenterY;
    private RectF buttonRect;
    private int circleAnimationIndex;
    boolean clickEnabled;
    private final klr clickEnabledObservable;
    private Paint currentInnerPortraitRingPaint;
    private Paint currentMainButtonPaint;
    private Paint currentOuterPortraitRingPaint;
    private Paint currentPhotoCirclePaint;
    private Paint currentRipplePaint;
    private float currentScaleFactor;
    private ivx currentSpec;
    private final Object currentSpecLock;
    private Paint currentVideoCirclePaint;
    private int disabledFilterGreyValue;
    private final AtomicBoolean enableLongPressMotion;
    private ValueAnimator enableStateChangeAnimator;
    private final klj filteredClickEnabledObservable;
    private GestureDetector gestureDetector;
    private boolean hasPressAndReleaseHaptic;
    public ivw inFlightSpecBuilder;
    private Paint innerDotsCirclePaint;
    private final AtomicBoolean isAccessibleShot;
    private boolean isCircleProgressVisible;
    private boolean isCircleWaitingVisible;
    private final AtomicBoolean isLongPressInProgress;
    private boolean isMaterialNextEnabled;
    private boolean isP20NewUIEnabled;
    private boolean isP20NewUIUpdated;
    private boolean isVideoButtonAnimating;
    private boolean isZoomLockEnabled;
    private ivq listener;
    private iui longPressMotionListener;
    private MotionEvent longPressStartMotionEvent;
    private final AccessibilityNodeInfo$AccessibilityAction longShotEndAccessibilityAction;
    private final AccessibilityNodeInfo$AccessibilityAction longShotStartAccessibilityAction;
    private Paint mainInnerCircleButtonPaint;
    private Paint mainOuterCircleButtonPaint;
    private AnimatorSet modeTransitionAnimatorSet;
    private boolean oldPressed;
    private iuj onDrawListener;
    private final boolean[] tickMarkCircleState;
    private Paint tickMarkPaint;
    private jby touchCoordinate;
    private Paint videoButtonStopSquarePaint;
    private boolean visualFeedbackForEnableState;
    
    static {
        logger = nsd.g("com/google/android/apps/camera/ui/shutterbutton/ShutterButton");
        CAROUSEL_IDLE_MODES = noi.M(iuk.t, iuk.y, iuk.c, iuk.a, iuk.D, iuk.e, iuk.A);
        ShutterButton.progressState = iun.a;
    }
    
    public ShutterButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.blockClickForAnimation = false;
        this.clickEnabled = false;
        final klr clickEnabledObservable = new klr(new iuf(this));
        this.clickEnabledObservable = clickEnabledObservable;
        this.filteredClickEnabledObservable = kld.c(clickEnabledObservable);
        this.isLongPressInProgress = new AtomicBoolean(false);
        this.enableLongPressMotion = new AtomicBoolean(false);
        this.isAccessibleShot = new AtomicBoolean(false);
        this.currentSpecLock = new Object();
        this.tickMarkCircleState = new boolean[30];
        this.isP20NewUIUpdated = false;
        this.isP20NewUIEnabled = true;
        this.isMaterialNextEnabled = false;
        this.isZoomLockEnabled = false;
        this.hasPressAndReleaseHaptic = false;
        this.visualFeedbackForEnableState = true;
        this.longShotStartAccessibilityAction = new AccessibilityNodeInfo$AccessibilityAction(2131427397, (CharSequence)this.getResources().getString(2131951673));
        this.longShotEndAccessibilityAction = new AccessibilityNodeInfo$AccessibilityAction(2131427396, (CharSequence)this.getResources().getString(2131951658));
        final long n = ViewConfiguration.getLongPressTimeout();
        if (n <= 0L) {
            ShutterButton.logger.c().E(2950).q("System has invalid long press threshold value=%d ms", n);
        }
        this.initialize(context);
    }
    
    static /* synthetic */ void access$801(final ShutterButton shutterButton, final boolean enabled) {
        shutterButton.setEnabled(enabled);
    }
    
    private void animateMainButton(final iuk iuk, final hjg hjg, final ivh ivh) {
        this.cancelModeTransitionAnimations(true);
        final ivx currentSpec = this.getCurrentSpec();
        final ivx b = ivx.b(iuk, hjg, this.getResources(), this.isP20NewUIEnabled, this.isZoomLockEnabled, this.isMaterialNextEnabled);
        final AnimatorSet a = ivh.a(ivh.b.getCurrentSpec(), b);
        this.setSpecsForAnimatorTransition(currentSpec, b);
        a.addListener(jvh.e((Consumer)new iug(this, b)));
        (this.modeTransitionAnimatorSet = a).start();
    }
    
    private void drawInnerDots(final Canvas canvas) {
        final ivx currentSpec = this.getCurrentSpec();
        this.innerDotsCirclePaint.setAlpha(currentSpec.q);
        for (int i = 0; i < 18; ++i) {
            canvas.save();
            canvas.rotate(i * 20.0f, (float)this.buttonCenterX, (float)this.buttonCenterY);
            final int buttonCenterX = this.buttonCenterX;
            final int d = currentSpec.D;
            canvas.drawCircle((float)(buttonCenterX + d), (float)(this.buttonCenterY + d), jvu.u(1.5f) * this.currentScaleFactor, this.innerDotsCirclePaint);
            canvas.restore();
        }
    }
    
    private void drawTickMarkForCircleEdge(final Canvas canvas) {
        if (ShutterButton.progressState != iun.a && ShutterButton.progressState != iun.b) {
            final ivx currentSpec = this.getCurrentSpec();
            final float n = (float)currentSpec.y;
            final float n2 = (float)currentSpec.z;
            final float n3 = (float)currentSpec.A;
            int n4 = 0;
            while (true) {
                final boolean[] tickMarkCircleState = this.tickMarkCircleState;
                if (n4 >= tickMarkCircleState.length) {
                    break;
                }
                if (tickMarkCircleState[n4]) {
                    canvas.save();
                    canvas.rotate(n4 * 12.0f, (float)this.buttonCenterX, (float)this.buttonCenterY);
                    canvas.drawRoundRect((float)(this.buttonCenterX - jvu.u(0.5f)), n2, (float)(this.buttonCenterX + jvu.u(0.5f)), n2 + n, n3, n3, this.tickMarkPaint);
                    canvas.restore();
                }
                ++n4;
            }
            if (ShutterButton.progressState == iun.d) {
                this.updateTickMarkBlinkingState();
            }
        }
    }
    
    private void endAccessibleLongShot() {
        final ivq listener = this.listener;
        if (listener != null) {
            this.isAccessibleShot.set(false);
            listener.onShutterButtonLongPressRelease();
            listener.onShutterButtonPressedStateChanged(false);
        }
    }
    
    private ColorFilter getColorFilterToApply(final boolean b, final iuk iuk) {
        if (!this.visualFeedbackForEnableState || b) {
            return null;
        }
        if (ShutterButton.CAROUSEL_IDLE_MODES.contains(iuk)) {
            final int disabledFilterGreyValue = this.disabledFilterGreyValue;
            return (ColorFilter)new LightingColorFilter(Color.rgb(disabledFilterGreyValue, disabledFilterGreyValue, disabledFilterGreyValue), 0);
        }
        return null;
    }
    
    private int getContentDescriptionIdForMode(final iuk iuk) {
        final iuk a = iuk.a;
        switch (iuk.ordinal()) {
            default: {
                return 2131951687;
            }
            case 36: {
                return 2131951688;
            }
            case 35: {
                return 2131951650;
            }
            case 34: {
                return 2131951649;
            }
            case 33: {
                return 2131951658;
            }
            case 31: {
                return 2131951660;
            }
            case 29:
            case 30: {
                return 2131951659;
            }
            case 26:
            case 27:
            case 28: {
                return 2131951685;
            }
            case 23: {
                return 2131951674;
            }
            case 16:
            case 17:
            case 18: {
                return 2131951684;
            }
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            case 24:
            case 25: {
                return 2131951683;
            }
            case 12: {
                return 2131951655;
            }
            case 11: {
                return 2131951654;
            }
            case 10: {
                if (this.applicationMode == jbm.f) {
                    return 2131951669;
                }
                return 2131951658;
            }
            case 7:
            case 8:
            case 9: {
                return 2131951663;
            }
            case 6:
            case 22: {
                return 2131951653;
            }
            case 4:
            case 5: {
                if (this.applicationMode == jbm.f) {
                    return 2131951668;
                }
                return 2131951657;
            }
            case 2:
            case 3: {
                return 2131951689;
            }
            case 0:
            case 1:
            case 32: {
                return 2131951687;
            }
        }
    }
    
    private void initialize(final Context context) {
        this.setLayerType(2, (Paint)null);
        this.gestureDetector = new GestureDetector(context, (GestureDetector$OnGestureListener)new iuh(this));
        (this.currentMainButtonPaint = new Paint()).setAntiAlias(true);
        this.currentMainButtonPaint.setColor(-1);
        final Paint currentRipplePaint = new Paint(this.currentMainButtonPaint);
        this.currentRipplePaint = currentRipplePaint;
        if (this.isP20NewUIEnabled) {
            (this.mainInnerCircleButtonPaint = new Paint()).setAntiAlias(true);
            (this.mainOuterCircleButtonPaint = new Paint()).setAntiAlias(true);
            this.mainOuterCircleButtonPaint.setStrokeWidth(this.getOuterCircleStrokeWidth());
            this.mainOuterCircleButtonPaint.setStyle(Paint$Style.STROKE);
            this.mainOuterCircleButtonPaint.setColor(-1);
            (this.innerDotsCirclePaint = new Paint()).setAntiAlias(true);
            this.currentRipplePaint.setColor(this.getResources().getColor(2131099734, (Resources$Theme)null));
        }
        else {
            this.isP20NewUIUpdated = false;
            currentRipplePaint.setColor(this.getResources().getColor(2131099730, (Resources$Theme)null));
        }
        (this.currentPhotoCirclePaint = new Paint(this.currentMainButtonPaint)).setColor(this.getResources().getColor(2131099732, (Resources$Theme)null));
        (this.currentInnerPortraitRingPaint = new Paint(this.currentMainButtonPaint)).setColor(this.getResources().getColor(2131101052, (Resources$Theme)null));
        (this.currentOuterPortraitRingPaint = new Paint(this.currentMainButtonPaint)).setColor(this.getResources().getColor(2131101053, (Resources$Theme)null));
        this.disabledFilterGreyValue = 255;
        this.videoButtonStopSquarePaint = new Paint(this.currentMainButtonPaint);
        (this.currentVideoCirclePaint = new Paint(this.currentMainButtonPaint)).setColor(this.getResources().getColor(2131101480, (Resources$Theme)null));
        (this.tickMarkPaint = new Paint()).setAntiAlias(true);
        this.tickMarkPaint.setColor(-1);
        this.tickMarkPaint.setStyle(Paint$Style.STROKE);
        this.tickMarkPaint.setStrokeWidth((float)jvu.u(2.3f));
        final ivx b = ivx.b(iuk.a, hjg.e, this.getResources(), this.isP20NewUIEnabled, this.isZoomLockEnabled, this.isMaterialNextEnabled);
        this.setCurrentSpec(b);
        this.resetShutterButton();
        this.buttonRect = new RectF();
        this.currentScaleFactor = this.getDefaultScale();
        this.setOutlineProvider((ViewOutlineProvider)new iul(this));
        this.updateContentDescription(b.w);
        this.setClickEnabled(false);
    }
    
    private boolean isLasagnaShutter(final iuk iuk) {
        return iuk == iuk.A || iuk == iuk.B || iuk == iuk.C;
    }
    
    private void resetShutterButton() {
        final ivx currentSpec = this.getCurrentSpec();
        final iuk w = currentSpec.w;
        final hjg x = currentSpec.x;
        this.cancelModeTransitionAnimations(false);
        this.setCurrentSpec(ivx.b(currentSpec.w, currentSpec.x, this.getResources(), this.isP20NewUIEnabled, this.isZoomLockEnabled, this.isMaterialNextEnabled));
        this.invalidate();
    }
    
    private void runEnableChangeAnimation(final boolean b) {
        final ValueAnimator enableStateChangeAnimator = this.enableStateChangeAnimator;
        if (enableStateChangeAnimator != null) {
            enableStateChangeAnimator.cancel();
        }
        int n;
        if (!b) {
            n = 165;
        }
        else {
            n = 255;
        }
        (this.enableStateChangeAnimator = ValueAnimator.ofInt(new int[] { this.disabledFilterGreyValue, n })).setDuration(150L);
        this.enableStateChangeAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new iue(this));
        if (!b) {
            this.enableStateChangeAnimator.setStartDelay(500L);
        }
        this.enableStateChangeAnimator.start();
    }
    
    private void setCurrentSpec(final ivx currentSpec) {
        synchronized (this.currentSpecLock) {
            this.currentSpec = currentSpec;
            monitorexit(this.currentSpecLock);
            this.inFlightSpecBuilder = currentSpec.c();
        }
    }
    
    private void setSpecsForAnimatorTransition(final ivx ivx, final ivx currentSpec) {
        synchronized (this.currentSpecLock) {
            this.currentSpec = currentSpec;
            monitorexit(this.currentSpecLock);
            this.inFlightSpecBuilder = ivx.c();
        }
    }
    
    private boolean shouldDrawVideoDotOrSquare(final iuk iuk) {
        return iuk == iuk.e || iuk == iuk.f || iuk == iuk.J || iuk == iuk.j || iuk == iuk.i || iuk == iuk.k || iuk == iuk.D || iuk == iuk.F || iuk == iuk.E || iuk == iuk.m || iuk == iuk.x;
    }
    
    private void startAccessibleLongShot() {
        final ivq listener = this.listener;
        if (listener != null) {
            this.isAccessibleShot.set(true);
            listener.onShutterButtonPressedStateChanged(true);
            listener.onShutterButtonLongPressed();
        }
    }
    
    private void updateAnimationProgressIndex(final iun iun) {
        if (this.circleAnimationIndex >= 30) {
            this.circleAnimationIndex = 0;
            final boolean isCircleProgressVisible = this.isCircleProgressVisible;
            this.isCircleWaitingVisible = isCircleProgressVisible;
            this.isCircleProgressVisible = (isCircleProgressVisible ^ true);
        }
        if (iun == iun.d) {
            final boolean isCircleWaitingVisible = this.isCircleWaitingVisible ^ true;
            this.isCircleWaitingVisible = isCircleWaitingVisible;
            final boolean[] tickMarkCircleState = this.tickMarkCircleState;
            int circleAnimationIndex = this.circleAnimationIndex;
            if (circleAnimationIndex == 0) {
                circleAnimationIndex = tickMarkCircleState.length - 1;
            }
            else {
                --circleAnimationIndex;
            }
            tickMarkCircleState[circleAnimationIndex] = isCircleWaitingVisible;
            this.invalidate();
            return;
        }
        if (iun == iun.c) {
            final boolean[] tickMarkCircleState2 = this.tickMarkCircleState;
            int circleAnimationIndex2 = this.circleAnimationIndex;
            if (circleAnimationIndex2 == 0) {
                circleAnimationIndex2 = tickMarkCircleState2.length - 1;
            }
            else {
                --circleAnimationIndex2;
            }
            tickMarkCircleState2[circleAnimationIndex2] = this.isCircleProgressVisible;
            this.invalidate();
            return;
        }
        if (iun == iun.e) {
            final boolean[] tickMarkCircleState3 = this.tickMarkCircleState;
            final int circleAnimationIndex3 = this.circleAnimationIndex;
            tickMarkCircleState3[circleAnimationIndex3] = this.isCircleProgressVisible;
            this.circleAnimationIndex = circleAnimationIndex3 + 1;
            this.invalidate();
        }
    }
    
    private void updateButtonRect() {
        final int n = (int)(this.getCurrentSpec().u * this.currentScaleFactor);
        final int n2 = this.buttonCenterX - n;
        final int n3 = this.buttonCenterY - n;
        final int n4 = n + n;
        this.buttonRect.set((float)n2, (float)n3, (float)(n2 + n4), (float)(n3 + n4));
    }
    
    private void updateContentDescription(final iuk iuk) {
        super.setContentDescription((CharSequence)this.getResources().getString(this.getContentDescriptionIdForMode(iuk)));
    }
    
    private void updateHapticsForMode(final iuk iuk) {
        final iuk e = iuk.e;
        boolean hapticsEnabled;
        final boolean b = hapticsEnabled = true;
        if (iuk != e) {
            hapticsEnabled = b;
            if (iuk != iuk.l) {
                hapticsEnabled = (iuk == iuk.m && b);
            }
        }
        this.setHapticsEnabled(hapticsEnabled);
    }
    
    private void updateTickMarkBlinkingState() {
        ShutterButton.msgHandler.sendMessageDelayed(ShutterButton.msgHandler.obtainMessage(1001), 1000L);
    }
    
    public void animateToScale(final float n) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { this.currentScaleFactor, n * this.getDefaultScale() });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new iue(this, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator((TimeInterpolator)new adh());
        ofFloat.start();
    }
    
    public void blockClickForAnimation(final boolean blockClickForAnimation) {
        this.isEnabled();
        this.blockClickForAnimation = blockClickForAnimation;
    }
    
    public void buildDrawingCache(final boolean b) {
        this.invalidate();
        super.buildDrawingCache(b);
    }
    
    public void cancelModeTransitionAnimations(final boolean b) {
        final AnimatorSet modeTransitionAnimatorSet = this.modeTransitionAnimatorSet;
        if (modeTransitionAnimatorSet != null) {
            if (b) {
                modeTransitionAnimatorSet.end();
            }
            this.modeTransitionAnimatorSet.cancel();
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final boolean b = motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() >= this.getWidth() || motionEvent.getY() >= this.getHeight();
        boolean b2 = false;
        Label_0092: {
            if (b) {
                if (!this.enableLongPressMotion.get()) {
                    b2 = true;
                    break Label_0092;
                }
                if (!this.isLongPressInProgress.get()) {
                    b2 = true;
                    break Label_0092;
                }
            }
            b2 = false;
        }
        final boolean b3 = (b2 | motionEvent.getPointerCount() > 1 | (motionEvent.getAction() == 0 && motionEvent.getDownTime() != motionEvent.getEventTime())) & motionEvent.getActionMasked() != 1 & motionEvent.getActionMasked() != 6;
        final int[] array = new int[2];
        this.getLocationOnScreen(array);
        final int n = array[0];
        final Rect rect = new Rect(n, array[1], this.getWidth() + n, array[1] + this.getHeight());
        if (this.longPressStartMotionEvent == null) {
            this.longPressStartMotionEvent = MotionEvent.obtain(motionEvent);
        }
        final iui longPressMotionListener = this.longPressMotionListener;
        final MotionEvent longPressStartMotionEvent = this.longPressStartMotionEvent;
        if (longPressMotionListener != null && longPressStartMotionEvent != null && this.enableLongPressMotion.get() && this.getMode() == iuk.G) {
            longPressMotionListener.a(motionEvent, longPressStartMotionEvent, rect, b ^ true);
        }
        if (!b3) {
            this.gestureDetector.onTouchEvent(motionEvent);
        }
        if (((motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 2) || b3) && this.isLongPressInProgress.compareAndSet(true, false)) {
            final ivq listener = this.listener;
            if (listener != null) {
                listener.onShutterButtonLongPressRelease();
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.touchCoordinate = new jby(motionEvent.getX(), motionEvent.getY(), (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight());
            this.performHapticIfEnabled();
        }
        else if (motionEvent.getActionMasked() == 0) {
            this.performHapticIfEnabled();
            this.performShutterTouchStart();
            this.performShutterButtonDown();
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final boolean pressed = this.isPressed();
        if (!pressed && this.isLongPressInProgress.compareAndSet(true, false)) {
            final ivq listener = this.listener;
            if (listener != null) {
                listener.onShutterButtonLongPressRelease();
            }
        }
        if (pressed != this.oldPressed) {
            final ivq listener2 = this.listener;
            if (listener2 != null) {
                listener2.onShutterButtonPressedStateChanged(pressed);
            }
            this.oldPressed = pressed;
        }
    }
    
    public klj getClickEnabledObservable() {
        return this.filteredClickEnabledObservable;
    }
    
    String getContentDescriptionString() {
        return super.getContentDescription().toString();
    }
    
    public ivx getCurrentSpec() {
        synchronized (this.currentSpecLock) {
            return this.currentSpec;
        }
    }
    
    protected float getDefaultScale() {
        return 1.0f;
    }
    
    public Drawable getDrawable() {
        return this.getBackground();
    }
    
    boolean getHapticsEnabled() {
        return this.hasPressAndReleaseHaptic;
    }
    
    public iuk getMode() {
        return this.getCurrentSpec().w;
    }
    
    AnimatorSet getModeTransitionAnimatorSet() {
        return this.modeTransitionAnimatorSet;
    }
    
    protected float getOuterCircleStrokeWidth() {
        return (float)jvu.u(3.0f);
    }
    
    public int getTimelapseTickMarkVisibleCount() {
        final boolean[] tickMarkCircleState = this.tickMarkCircleState;
        final int length = tickMarkCircleState.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2 = n;
            if (tickMarkCircleState[i]) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public boolean isClickEnabled() {
        return this.clickEnabled;
    }
    
    public boolean isClickEnabledAndNotBlocked() {
        return !this.blockClickForAnimation && this.clickEnabled;
    }
    
    public boolean isP20NewUIEnabled() {
        return this.isP20NewUIEnabled;
    }
    
    public void onDraw(final Canvas canvas) {
        final ivx a = this.inFlightSpecBuilder.a();
        this.currentPhotoCirclePaint.setColor(a.f);
        this.currentPhotoCirclePaint.setAlpha(a.e);
        this.currentInnerPortraitRingPaint.setColor(this.getResources().getColor(2131101052, (Resources$Theme)null));
        this.currentOuterPortraitRingPaint.setColor(this.getResources().getColor(2131101053, (Resources$Theme)null));
        if (this.isP20NewUIEnabled) {
            if (this.mainInnerCircleButtonPaint == null) {
                (this.mainInnerCircleButtonPaint = new Paint()).setAntiAlias(true);
                (this.mainOuterCircleButtonPaint = new Paint()).setAntiAlias(true);
                this.mainOuterCircleButtonPaint.setStrokeWidth((float)jvu.u(3.0f));
                this.mainOuterCircleButtonPaint.setStyle(Paint$Style.STROKE);
                this.mainOuterCircleButtonPaint.setColor(-1);
            }
            this.currentInnerPortraitRingPaint.setColor(this.getResources().getColor(2131099733, (Resources$Theme)null));
            this.currentOuterPortraitRingPaint.setColor(this.getResources().getColor(2131099733, (Resources$Theme)null));
            this.currentOuterPortraitRingPaint.setAlpha(127);
            this.mainInnerCircleButtonPaint.setColor(a.t);
            final Paint mainInnerCircleButtonPaint = this.mainInnerCircleButtonPaint;
            float n;
            if (a.i > 0) {
                n = 0.86f;
            }
            else {
                n = 0.32f;
            }
            mainInnerCircleButtonPaint.setAlpha((int)(n * 255.0f));
        }
        this.currentRipplePaint.setAlpha(a.q);
        this.currentVideoCirclePaint.setColor(a.h);
        this.currentMainButtonPaint.setColor(a.t);
        final ColorFilter colorFilterToApply = this.getColorFilterToApply(this.isEnabled(), a.w);
        if (colorFilterToApply == null) {
            this.isEnabled();
        }
        this.mainOuterCircleButtonPaint.setColorFilter(colorFilterToApply);
        this.mainInnerCircleButtonPaint.setColorFilter(colorFilterToApply);
        this.currentInnerPortraitRingPaint.setColorFilter(colorFilterToApply);
        this.currentOuterPortraitRingPaint.setColorFilter(colorFilterToApply);
        this.currentPhotoCirclePaint.setColorFilter(colorFilterToApply);
        this.currentVideoCirclePaint.setColorFilter(colorFilterToApply);
        this.currentMainButtonPaint.setColorFilter(colorFilterToApply);
        this.innerDotsCirclePaint.setColorFilter(colorFilterToApply);
        final iuj onDrawListener = this.onDrawListener;
        if (onDrawListener != null) {
            onDrawListener.a();
            if (this.isClickEnabledAndNotBlocked()) {
                this.onDrawListener.b();
            }
        }
        if (this.isP20NewUIEnabled) {
            this.mainOuterCircleButtonPaint.setAlpha(a.C);
            this.currentRipplePaint.setColor(a.r);
            this.currentPhotoCirclePaint.setColor(a.f);
            this.currentPhotoCirclePaint.setAlpha(a.e);
            this.innerDotsCirclePaint.setColor(a.E);
            canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.v * this.currentScaleFactor, this.mainOuterCircleButtonPaint);
            canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.u * this.currentScaleFactor, this.mainInnerCircleButtonPaint);
            final int k = a.k;
            if (k == a.d) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, k * this.currentScaleFactor, this.currentOuterPortraitRingPaint);
            }
            final int j = a.j;
            if (j < a.d) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, j * this.currentScaleFactor, this.currentInnerPortraitRingPaint);
            }
            if (a.e > 0) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.d * this.currentScaleFactor, this.currentPhotoCirclePaint);
            }
            if (a.p) {
                if (a.s >= this.getResources().getDimensionPixelSize(2131165185)) {
                    if (!this.isLasagnaShutter(a.w)) {
                        final Paint currentRipplePaint = this.currentRipplePaint;
                        final Resources resources = this.getResources();
                        int n2;
                        if (a.w == iuk.G) {
                            if (this.isMaterialNextEnabled) {
                                n2 = 2131101481;
                            }
                            else {
                                n2 = 2131101482;
                            }
                        }
                        else {
                            n2 = 2131100901;
                        }
                        currentRipplePaint.setColor(resources.getColor(n2, (Resources$Theme)null));
                    }
                }
                else if (a.w == iuk.G && a.s == this.getResources().getDimensionPixelSize(2131165187)) {
                    this.currentRipplePaint.setColor(this.getResources().getColor(2131099733, (Resources$Theme)null));
                }
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.s * this.currentScaleFactor, this.currentRipplePaint);
            }
            if (a.D > 0) {
                this.drawInnerDots(canvas);
            }
            if (this.shouldDrawVideoDotOrSquare(a.w) || this.isVideoButtonAnimating) {
                final int g = a.g;
                if (g > 0) {
                    canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, g * this.currentScaleFactor, this.currentVideoCirclePaint);
                }
                if (a.i > 0 && a.B > 0) {
                    this.drawTickMarkForCircleEdge(canvas);
                }
            }
        }
        else {
            canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.u * this.currentScaleFactor, this.currentMainButtonPaint);
            final int i = a.k;
            if (i > a.d) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, i * this.currentScaleFactor, this.currentOuterPortraitRingPaint);
            }
            final int l = a.j;
            if (l > a.d) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, l * this.currentScaleFactor, this.currentInnerPortraitRingPaint);
            }
            if (a.e > 0) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.d * this.currentScaleFactor, this.currentPhotoCirclePaint);
            }
            if (a.p) {
                canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, a.s * this.currentScaleFactor, this.currentRipplePaint);
            }
            if (this.shouldDrawVideoDotOrSquare(a.w) || this.isVideoButtonAnimating) {
                final int g2 = a.g;
                if (g2 > 0) {
                    canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, g2 * this.currentScaleFactor, this.currentVideoCirclePaint);
                }
                final int m = a.i;
                if (m > 0) {
                    final float n3 = m * this.currentScaleFactor;
                    if (this.isMaterialNextEnabled) {
                        final float n4 = (float)this.buttonCenterX;
                        final float n5 = (float)this.buttonCenterY;
                        canvas.drawRoundRect(n4 - n3, n5 - n3, n4 + n3, n5 + n3, (float)this.getResources().getDimensionPixelSize(2131166364), (float)this.getResources().getDimensionPixelSize(2131166364), this.videoButtonStopSquarePaint);
                    }
                    else {
                        final float n6 = (float)this.buttonCenterX;
                        final float n7 = (float)this.buttonCenterY;
                        canvas.drawRect(n6 - n3, n7 - n3, n6 + n3, n7 + n3, this.videoButtonStopSquarePaint);
                    }
                    if (a.B > 0) {
                        this.drawTickMarkForCircleEdge(canvas);
                    }
                }
            }
        }
        final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)a.l.f();
        if (drawable$ConstantState != null) {
            final Drawable mutate = drawable$ConstantState.newDrawable().mutate();
            mutate.setColorFilter(colorFilterToApply);
            final int o = a.o;
            final int buttonCenterX = this.buttonCenterX;
            final int buttonCenterY = this.buttonCenterY;
            mutate.setBounds(buttonCenterX - o, buttonCenterY - o, buttonCenterX + o, buttonCenterY + o);
            mutate.getBounds();
            mutate.draw(canvas);
        }
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final iuk w = this.getCurrentSpec().w;
        if (w == iuk.a || w == iuk.n) {
            accessibilityNodeInfo.removeAction(this.longShotEndAccessibilityAction);
            accessibilityNodeInfo.addAction(this.longShotStartAccessibilityAction);
            return;
        }
        if (w != iuk.G && w != iuk.H) {
            accessibilityNodeInfo.removeAction(this.longShotStartAccessibilityAction);
            accessibilityNodeInfo.removeAction(this.longShotEndAccessibilityAction);
            return;
        }
        if (this.isAccessibleShot.get()) {
            this.setEnabled(true);
        }
        accessibilityNodeInfo.removeAction(this.longShotStartAccessibilityAction);
        accessibilityNodeInfo.addAction(this.longShotEndAccessibilityAction);
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.updateButtonRect();
        super.onMeasure(n, n2);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        this.buttonCenterX = n / 2;
        this.buttonCenterY = n2 / 2;
        this.updateButtonRect();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public void pauseTimelapseAnimationState() {
        if (ShutterButton.progressState != iun.d && ShutterButton.progressState != iun.a) {
            this.updateTickMarkBlinkingState();
        }
    }
    
    public boolean performAccessibilityAction(final int n, final Bundle bundle) {
        if (n == 2131427397) {
            this.startAccessibleLongShot();
            return true;
        }
        if (n == 2131427396) {
            this.endAccessibleLongShot();
            return true;
        }
        return super.performAccessibilityAction(n, bundle);
    }
    
    public boolean performClick() {
        if (!this.isClickEnabledAndNotBlocked()) {
            this.isEnabled();
            return false;
        }
        final boolean performClick = super.performClick();
        if (this.getVisibility() == 0) {
            final ivq listener = this.listener;
            if (listener != null) {
                final jby touchCoordinate = this.touchCoordinate;
                if (touchCoordinate != null) {
                    listener.onShutterTouch(touchCoordinate);
                }
                this.touchCoordinate = null;
                this.listener.onShutterButtonClick();
            }
        }
        return performClick;
    }
    
    public void performHapticIfEnabled() {
        if (this.hasPressAndReleaseHaptic) {
            jdj.e((View)this);
        }
    }
    
    public void performShutterButtonDown() {
        if (this.isClickEnabledAndNotBlocked() && this.getVisibility() == 0) {
            final ivq listener = this.listener;
            if (listener != null) {
                listener.onShutterButtonDown();
            }
            return;
        }
        this.isEnabled();
        this.getVisibility();
    }
    
    public void performShutterTouchStart() {
        final ivq listener = this.listener;
        if (listener != null) {
            listener.onShutterTouchStart();
        }
    }
    
    public void resetTo(final iuk iuk) {
        this.resetTo(iuk, this.getCurrentSpec().x);
    }
    
    public void resetTo(final iuk iuk, final hjg hjg) {
        this.setCurrentSpec(ivx.b(iuk, hjg, this.getResources(), this.isP20NewUIEnabled, this.isZoomLockEnabled, this.isMaterialNextEnabled));
        this.resetShutterButton();
    }
    
    public void resumeTimelapseAnimationState() {
        if (ShutterButton.progressState != iun.c && ShutterButton.progressState != iun.a) {
            ShutterButton.progressState = iun.c;
            ShutterButton.msgHandler.removeMessages(1001);
            ShutterButton.msgHandler.sendMessage(ShutterButton.msgHandler.obtainMessage(1000));
        }
    }
    
    public void runPressedStateAnimation(final boolean b, final ivh ivh) {
        final iuk mode = this.getMode();
        if (b) {
            if (!this.isEnabled() || !this.clickEnabled) {
                this.isEnabled();
                return;
            }
            ivh.b(1.06f, 100).start();
            if (mode == iuk.a) {
                this.setMode(iuk.b, ivh, this.isP20NewUIEnabled);
                return;
            }
            if (mode == iuk.c) {
                this.setMode(iuk.d, ivh, this.isP20NewUIEnabled);
                return;
            }
            if (mode == iuk.t) {
                this.setMode(iuk.u, ivh, this.isP20NewUIEnabled);
                return;
            }
            if (mode == iuk.n) {
                this.setMode(iuk.o, ivh, this.isP20NewUIEnabled);
                return;
            }
            if (mode == iuk.q) {
                this.setMode(iuk.r, ivh, this.isP20NewUIEnabled);
                return;
            }
            if (mode == iuk.y) {
                this.setMode(iuk.z, ivh, this.isP20NewUIEnabled);
                return;
            }
            if (mode == iuk.A) {
                this.setMode(iuk.B, ivh, this.isP20NewUIEnabled);
            }
        }
        else {
            ivh.b(1.0f, 250).start();
            if (this.isP20NewUIEnabled) {
                if (mode == iuk.b) {
                    this.setMode(iuk.a, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.d) {
                    this.setMode(iuk.c, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.u) {
                    this.setMode(iuk.t, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.o) {
                    this.setMode(iuk.n, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.r) {
                    this.setMode(iuk.q, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.z) {
                    this.setMode(iuk.y, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.v) {
                    this.setMode(iuk.t, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.f) {
                    this.setMode(iuk.k, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.E) {
                    this.setMode(iuk.F, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.B) {
                    this.setMode(iuk.A, ivh, this.isP20NewUIEnabled);
                }
            }
            else {
                if (mode == iuk.b) {
                    this.setMode(iuk.a, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.d) {
                    this.setMode(iuk.c, ivh, this.isP20NewUIEnabled);
                    return;
                }
                if (mode == iuk.u) {
                    this.setMode(iuk.t, ivh, this.isP20NewUIEnabled);
                }
            }
        }
    }
    
    public void setApplicationMode(final jbm applicationMode) {
        this.applicationMode = applicationMode;
    }
    
    public void setClickEnabled(final boolean clickEnabled) {
        this.isEnabled();
        this.setClickable(this.clickEnabled = clickEnabled);
        this.clickEnabledObservable.c();
        this.invalidate();
    }
    
    public void setContentDescription(final int n) {
        super.setContentDescription((CharSequence)this.getResources().getString(n));
    }
    
    public void setEnableLongPressMotion(final boolean b) {
        this.enableLongPressMotion.set(b);
    }
    
    public void setEnabled(final boolean clickEnabled) {
        this.isEnabled();
        access$801(this, clickEnabled);
        this.setClickEnabled(clickEnabled);
        this.runEnableChangeAnimation(clickEnabled);
    }
    
    public void setHapticsEnabled(final boolean hasPressAndReleaseHaptic) {
        this.hasPressAndReleaseHaptic = hasPressAndReleaseHaptic;
    }
    
    public void setListener(final ivq listener) {
        this.listener = listener;
    }
    
    public void setLongPressMotionListener(final iui longPressMotionListener) {
        this.longPressMotionListener = longPressMotionListener;
    }
    
    public void setMaterialNextEnabled(final boolean isMaterialNextEnabled) {
        this.isMaterialNextEnabled = isMaterialNextEnabled;
        this.invalidate();
    }
    
    public void setMode(final iuk iuk, final hjg hjg, final ivh ivh, final boolean isP20NewUIEnabled) {
        this.isP20NewUIEnabled = isP20NewUIEnabled;
        this.updateContentDescription(iuk);
        this.updateHapticsForMode(iuk);
        final ivx currentSpec = this.getCurrentSpec();
        if (iuk == currentSpec.w && hjg == currentSpec.x && (this.isP20NewUIEnabled || this.isP20NewUIUpdated)) {
            return;
        }
        this.isP20NewUIUpdated = true;
        final hjg x = currentSpec.x;
        this.animateMainButton(iuk, hjg, ivh);
        this.setTag((Object)iuk.toString());
    }
    
    public void setMode(final iuk iuk, final ivh ivh, final boolean b) {
        this.setMode(iuk, this.getCurrentSpec().x, ivh, b);
    }
    
    public void setOnDrawListener(final iuj onDrawListener) {
        njo.p(this.onDrawListener == null, "Cannot set on draw listener more than once.");
        this.onDrawListener = onDrawListener;
        this.invalidate();
    }
    
    public void setP20NewUIEnabled(final boolean isP20NewUIEnabled) {
        this.isP20NewUIEnabled = isP20NewUIEnabled;
        this.invalidate();
    }
    
    public void setVideoButtonAnimating(final boolean isVideoButtonAnimating) {
        this.isVideoButtonAnimating = isVideoButtonAnimating;
    }
    
    public void setVisualFeedbackForEnableState(final boolean visualFeedbackForEnableState) {
        this.visualFeedbackForEnableState = visualFeedbackForEnableState;
    }
    
    public void setZoomLockViewEnabled(final boolean isZoomLockEnabled) {
        this.isZoomLockEnabled = isZoomLockEnabled;
        this.invalidate();
    }
    
    public void startTimelapseCircleAnimation() {
        if (ShutterButton.progressState == iun.a) {
            Arrays.fill(this.tickMarkCircleState, false);
            ShutterButton.msgHandler = new ium(this);
        }
        this.circleAnimationIndex = 0;
        this.isCircleProgressVisible = true;
        this.isCircleWaitingVisible = true;
        ShutterButton.progressState = iun.b;
        this.tickMarkPaint.setColor(-1);
        this.tickMarkPaint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        this.tickMarkPaint.setStyle(Paint$Style.STROKE);
        this.tickMarkPaint.setStrokeWidth((float)jvu.u(2.3f));
    }
    
    public void stopTimelapseCircleAnimation() {
        if (ShutterButton.progressState == iun.a) {
            return;
        }
        ShutterButton.progressState = iun.a;
        ShutterButton.msgHandler.removeCallbacksAndMessages((Object)null);
        this.circleAnimationIndex = 0;
        this.isCircleProgressVisible = false;
        this.isCircleWaitingVisible = false;
        Arrays.fill(this.tickMarkCircleState, false);
        this.tickMarkPaint.reset();
        this.tickMarkPaint.setAntiAlias(true);
        this.tickMarkPaint.setColor(0);
        this.tickMarkPaint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
    }
    
    public void updateTimelapseProgressState() {
        if (ShutterButton.progressState != iun.d && ShutterButton.progressState != iun.a) {
            ShutterButton.msgHandler.sendMessage(ShutterButton.msgHandler.obtainMessage(1002));
        }
    }
}
