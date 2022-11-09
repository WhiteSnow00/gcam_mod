// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.graphics.drawable.Drawable;
import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import j$.util.function.Consumer;
import j$.util.Collection$_EL;
import android.view.ViewGroup;
import android.os.Trace;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class BottomBar extends LinearLayout
{
    private final int backgroundColor;
    private CameraSwitchButton cameraSwitchButton;
    private ImageButton cancelButton;
    private int contentSidePadding;
    private View currentLeftButton;
    private View currentRightButton;
    private HfrButton hfrButton;
    private boolean hideNavBar;
    private boolean isShown;
    private ImageButton leftSideCancelButton;
    private BottomBar$OnVisibilityChangedListener onThumbnailVisibilityChangedListener;
    private jcb orientation;
    private PauseResumeButton pauseResumeButton;
    private ImageButton retakeButton;
    private ImageButton reviewPlayButton;
    private ShutterButton shutterButton;
    private SnapshotButton snapshotButton;
    private hyt sysUiFlagApplier;
    private RoundedThumbnailView thumbnailView;
    private ZoomLockView zoomLockView;
    
    public BottomBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.orientation = jcb.a;
        this.isShown = false;
        this.hideNavBar = false;
        this.backgroundColor = context.getColor(R$color.bottom_bar_background_color);
        this.inflate(context);
    }
    
    private void adjustPadding() {
        final Resources resources = this.getResources();
        if (resources.getDimensionPixelOffset(R$dimen.bottom_bar_content_size) > Math.min(this.getMeasuredHeight(), this.getMeasuredWidth())) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final ViewGroup$LayoutParams layoutParams = this.getChildAt(i).getLayoutParams();
                layoutParams.height = resources.getDimensionPixelOffset(R$dimen.bottom_bar_content_size_small);
                this.getChildAt(i).setLayoutParams(layoutParams);
            }
            final ViewGroup$LayoutParams layoutParams2 = this.getShutterButton().getLayoutParams();
            layoutParams2.height = resources.getDimensionPixelOffset(R$dimen.bottom_bar_content_size_small);
            this.getShutterButton().setLayoutParams(layoutParams2);
        }
        this.applyOrientation();
    }
    
    private void applyOrientation() {
        Trace.beginSection("bottomBar:applyOrientation");
        final ZoomLockView zoomLockView = this.zoomLockView;
        if (zoomLockView != null) {
            zoomLockView.g = this.orientation;
            zoomLockView.a();
        }
        jvu.r((View)this, this.orientation);
        Collection$_EL.stream(jwn.aa((ViewGroup)this)).forEach((Consumer)new BottomBar$$ExternalSyntheticLambda1(this));
        Trace.endSection();
    }
    
    private static void fadeView(final View view, final boolean clickable, final boolean b) {
        kjm.a();
        int visibility = 8;
        if (b) {
            if (clickable) {
                visibility = 0;
            }
            jdz.a(visibility, view);
            return;
        }
        if (clickable) {
            visibility = 0;
        }
        view.setVisibility(visibility);
        view.setClickable(clickable);
        float alpha;
        if (!clickable) {
            alpha = 0.0f;
        }
        else {
            alpha = 1.0f;
        }
        view.setAlpha(alpha);
    }
    
    private void hideNavBar() {
        final hyt sysUiFlagApplier = this.sysUiFlagApplier;
        boolean hideNavBar;
        if (sysUiFlagApplier != null) {
            sysUiFlagApplier.d(4102);
            hideNavBar = false;
        }
        else {
            hideNavBar = true;
        }
        this.hideNavBar = hideNavBar;
    }
    
    private void inflate(final Context context) {
        final jea a = jea.a(((LayoutInflater)context.getSystemService("layout_inflater")).inflate(R$layout.bottom_bar_layout, (ViewGroup)this));
        this.shutterButton = (ShutterButton)a.c(R$id.shutter_button);
        this.zoomLockView = (ZoomLockView)a.c(R$id.zoom_lock_view);
        this.pauseResumeButton = (PauseResumeButton)a.c(R$id.pause_resume_button);
        this.cameraSwitchButton = (CameraSwitchButton)a.c(R$id.camera_switch_button);
        this.snapshotButton = (SnapshotButton)a.c(R$id.snapshot_button);
        this.thumbnailView = (RoundedThumbnailView)a.c(R$id.thumbnail_button);
        this.hfrButton = (HfrButton)a.c(R$id.hfr_button);
        this.cancelButton = (ImageButton)a.c(R$id.cancel_button);
        this.leftSideCancelButton = (ImageButton)a.c(R$id.left_side_cancel_button);
        this.retakeButton = (ImageButton)a.c(R$id.retake_button);
        this.reviewPlayButton = (ImageButton)a.c(R$id.review_play_button);
    }
    
    public void changeSideButtons(View currentRightButton, final View currentRightButton2, final boolean b) {
        kjm.a();
        final View currentLeftButton = this.currentLeftButton;
        if (currentLeftButton != null) {
            fadeView(currentLeftButton, false, b);
        }
        if ((this.currentLeftButton = currentRightButton) != null) {
            fadeView(currentRightButton, true, b);
        }
        final View currentRightButton3 = this.currentRightButton;
        if (currentRightButton3 != currentRightButton2) {
            final BottomBar$OnVisibilityChangedListener onThumbnailVisibilityChangedListener = this.onThumbnailVisibilityChangedListener;
            if (onThumbnailVisibilityChangedListener != null) {
                final RoundedThumbnailView thumbnailView = this.thumbnailView;
                if (currentRightButton3 == thumbnailView) {
                    onThumbnailVisibilityChangedListener.onVisibilityChanged((View)thumbnailView, 8);
                }
                else if (currentRightButton2 == thumbnailView) {
                    onThumbnailVisibilityChangedListener.onVisibilityChanged((View)thumbnailView, 0);
                }
            }
        }
        currentRightButton = this.currentRightButton;
        if (currentRightButton != null) {
            fadeView(currentRightButton, false, b);
        }
        if ((this.currentRightButton = currentRightButton2) != null) {
            fadeView(currentRightButton2, true, b);
        }
    }
    
    public void fadeBackground(final boolean isShown, final boolean b) {
        kjm.a();
        if (this.isShown == isShown) {
            return;
        }
        this.isShown = isShown;
        if (b) {
            ObjectAnimator objectAnimator;
            if (isShown) {
                objectAnimator = ObjectAnimator.ofInt((Object)this.getBackground(), "alpha", new int[] { 0, 255 });
            }
            else {
                objectAnimator = ObjectAnimator.ofInt((Object)this.getBackground(), "alpha", new int[] { 255, 0 });
            }
            objectAnimator.setDuration((long)this.getResources().getInteger(R$integer.bottom_bar_recording_fade_duration_ms));
            objectAnimator.setStartDelay((long)this.getResources().getInteger(R$integer.bottom_bar_recording_fade_delay_ms));
            objectAnimator.start();
            return;
        }
        final Drawable background = this.getBackground();
        int alpha;
        if (!isShown) {
            alpha = 0;
        }
        else {
            alpha = 255;
        }
        background.setAlpha(alpha);
    }
    
    public jbq getBackgroundColorProperty() {
        return new BottomBar$1(this);
    }
    
    public CameraSwitchButton getCameraSwitchButton() {
        return this.cameraSwitchButton;
    }
    
    public ImageButton getCancelButton() {
        return this.cancelButton;
    }
    
    public HfrButton getHfrButton() {
        return this.hfrButton;
    }
    
    public ImageButton getLeftSideCancelButton() {
        return this.leftSideCancelButton;
    }
    
    public PauseResumeButton getPauseResumeButton() {
        return this.pauseResumeButton;
    }
    
    float getPhotoVideoSwitchTranslation() {
        return (this.getResources().getDimension(R$dimen.bottom_bar_content_size) + this.getResources().getDimension(R$dimen.photo_video_switch_size)) / 2.0f;
    }
    
    public ImageButton getRetakeButton() {
        return this.retakeButton;
    }
    
    public ImageButton getReviewPlayButton() {
        return this.reviewPlayButton;
    }
    
    public ShutterButton getShutterButton() {
        return this.shutterButton;
    }
    
    public SnapshotButton getSnapshotButton() {
        return this.snapshotButton;
    }
    
    public RoundedThumbnailView getThumbnailButton() {
        return this.thumbnailView;
    }
    
    public jcb getUiOrientation() {
        return this.orientation;
    }
    
    public ZoomLockView getZoomLockView() {
        return this.zoomLockView;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.contentSidePadding = this.getResources().getDimensionPixelSize(R$dimen.bottom_bar_side_padding);
        boolean isShown = false;
        this.setBackgroundColor(0);
        final int contentSidePadding = this.contentSidePadding;
        this.setPadding(contentSidePadding, 0, contentSidePadding, 0);
        this.setBackgroundColor(this.backgroundColor);
        this.currentLeftButton = (View)this.getCameraSwitchButton();
        this.currentRightButton = (View)this.getThumbnailButton();
        if (this.getBackground().getAlpha() != 0) {
            isShown = true;
        }
        this.isShown = isShown;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        Trace.beginSection("bottomBar:onLayout");
        final int contentSidePadding = this.contentSidePadding;
        this.setPadding(contentSidePadding, 0, contentSidePadding, 0);
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.applyOrientation();
        }
        Trace.endSection();
    }
    
    protected void onMeasure(final int n, final int n2) {
        Trace.beginSection("bottomBar:onMeasure");
        super.setGravity(17);
        if (jcb.d(this.orientation)) {
            super.onMeasure(n, n2);
        }
        else {
            super.onMeasure(n2, n);
        }
        Trace.endSection();
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.adjustPadding();
    }
    
    public void setClickable(final boolean sideButtonsClickable) {
        this.setSideButtonsClickable(sideButtonsClickable);
    }
    
    public void setOnThumbnailVisibilityChangedListener(final BottomBar$OnVisibilityChangedListener onThumbnailVisibilityChangedListener) {
        this.onThumbnailVisibilityChangedListener = onThumbnailVisibilityChangedListener;
    }
    
    public void setSideButtonsClickable(final boolean b) {
        final View currentRightButton = this.currentRightButton;
        if (currentRightButton != null) {
            currentRightButton.setClickable(b);
        }
        final View currentLeftButton = this.currentLeftButton;
        if (currentLeftButton != null) {
            currentLeftButton.setClickable(b);
        }
    }
    
    public void setSysUiFlagApplier(final hyt sysUiFlagApplier) {
        this.sysUiFlagApplier = sysUiFlagApplier;
        if (this.hideNavBar) {
            this.hideNavBar();
        }
    }
    
    public void setUiOrientation(final jcb orientation) {
        if (this.orientation != orientation) {
            this.orientation = orientation;
            this.applyOrientation();
        }
    }
}
