// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.view.View$OnClickListener;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.widget.ImageButton;

public class BottomBarController
{
    private final BottomBar bottomBar;
    private final CameraSwitchButton cameraSwitchButton;
    private final ImageButton cancelButton;
    private final niz gcaConfig;
    private final HfrButton hfrButton;
    private boolean isSelfieFlashOn;
    private boolean isSocialShareOpened;
    private final ImageButton leftCancelButton;
    private final BottomBarListener listenerDispatcher;
    private final List listeners;
    private final Object lock;
    private jbm mode;
    private final PauseResumeButton pauseResumeButton;
    private final ImageButton retakeButton;
    private final ImageButton reviewPlayButton;
    private final SnapshotButton snapshotButton;
    private final RoundedThumbnailView thumbnailButton;
    
    @Deprecated
    public BottomBarController(final BottomBar bottomBar) {
        this(bottomBar, null, nii.a);
    }
    
    public BottomBarController(final BottomBar bottomBar, final hyt hyt, final niz gcaConfig) {
        this.listenerDispatcher = new BottomBarController$1(this);
        this.bottomBar = bottomBar;
        this.gcaConfig = gcaConfig;
        bottomBar.post((Runnable)new BottomBarController$$ExternalSyntheticLambda13(bottomBar, hyt));
        this.pauseResumeButton = bottomBar.getPauseResumeButton();
        this.cameraSwitchButton = bottomBar.getCameraSwitchButton();
        this.snapshotButton = bottomBar.getSnapshotButton();
        this.thumbnailButton = bottomBar.getThumbnailButton();
        this.hfrButton = bottomBar.getHfrButton();
        this.cancelButton = bottomBar.getCancelButton();
        this.leftCancelButton = bottomBar.getLeftSideCancelButton();
        this.retakeButton = bottomBar.getRetakeButton();
        this.reviewPlayButton = bottomBar.getReviewPlayButton();
        this.lock = new Object();
        this.listeners = new ArrayList();
        this.mode = jbm.a;
    }
    
    public void addListener(final BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.add(bottomBarListener);
        }
    }
    
    public void announceAccessibilityForThumbnail(final String s) {
        final RoundedThumbnailView thumbnailButton = this.thumbnailButton;
        if (thumbnailButton != null) {
            thumbnailButton.announceForAccessibility((CharSequence)s);
        }
    }
    
    public krc disableCameraSwitchAwhile() {
        this.setCameraSwitchEnabled(false);
        return new BottomBarController$$ExternalSyntheticLambda9(this);
    }
    
    public krc disableHfrButtonAwhile() {
        this.bottomBar.getHfrButton().setEnabled(false);
        return new BottomBarController$$ExternalSyntheticLambda10(this);
    }
    
    public jbq getBackgroundColorProperty() {
        return this.bottomBar.getBackgroundColorProperty();
    }
    
    public int getBottomBarAreaPixels() {
        return this.bottomBar.getHeight() * this.bottomBar.getWidth();
    }
    
    public krc lowerAccessibilityImportanceAwhile() {
        this.setImportantForAccessibility(4);
        return new BottomBarController$$ExternalSyntheticLambda11(this);
    }
    
    public krc makeClickableAwhile() {
        this.setClickable(true);
        return new BottomBarController$$ExternalSyntheticLambda12(this);
    }
    
    public void pauseRecording() {
        this.pauseResumeButton.transitionToResumeState(((cxl)this.gcaConfig.c()).k(cxr.ar));
    }
    
    public void pauseTimelapseRecording() {
        this.pauseResumeButton.transitionToResumeState(((cxl)this.gcaConfig.c()).k(cxr.ar));
    }
    
    public void removeListener(final BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.remove(bottomBarListener);
        }
    }
    
    public void resetCameraSwitch(final boolean frontFacing) {
        this.bottomBar.getCameraSwitchButton().setFrontFacing(frontFacing);
    }
    
    public void resumeRecording() {
        this.pauseResumeButton.transitionToPauseState(((cxl)this.gcaConfig.c()).k(cxr.ar));
    }
    
    public void resumeTimelapseRecording() {
        this.pauseResumeButton.transitionToPauseState(((cxl)this.gcaConfig.c()).k(cxr.ar));
    }
    
    public void returnToPhotoIntent() {
        this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, null, true);
    }
    
    public void returnToVideoIntent() {
        this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, null, true);
    }
    
    public void setCameraSwitchEnabled(final boolean enabled) {
        this.bottomBar.getCameraSwitchButton().setEnabled(enabled);
    }
    
    public void setClickable(final boolean clickable) {
        this.bottomBar.setClickable(clickable);
        this.bottomBar.setPressed(false);
    }
    
    public void setImportantForAccessibility(final int importantForAccessibility) {
        this.bottomBar.setImportantForAccessibility(importantForAccessibility);
    }
    
    public void setSelfieFlashState(final boolean isSelfieFlashOn) {
        this.isSelfieFlashOn = isSelfieFlashOn;
    }
    
    public void setSideButtonsClickable(final boolean b) {
        this.bottomBar.post((Runnable)new BottomBarController$$ExternalSyntheticLambda14(this, b));
    }
    
    public void setSnapshotButtonClickEnabled(final boolean clickEnabled) {
        this.bottomBar.getSnapshotButton().setClickEnabled(clickEnabled);
    }
    
    public void setSocialShareState(final boolean isSocialShareOpened) {
        this.isSocialShareOpened = isSocialShareOpened;
    }
    
    public void startAutoTimerCapturing() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
    }
    
    public void startCountdown() {
        this.bottomBar.changeSideButtons(null, null, true);
        this.bottomBar.fadeBackground(false, true);
    }
    
    public void startHfrRecording() {
        this.bottomBar.fadeBackground(false, true);
        final boolean g = this.gcaConfig.g();
        Object o = null;
        Object o2;
        if (g) {
            Object pauseResumeButton;
            if (((cxl)this.gcaConfig.c()).k(cwv.T) && ((cxl)this.gcaConfig.c()).k(cwv.p)) {
                pauseResumeButton = this.pauseResumeButton;
            }
            else {
                pauseResumeButton = null;
            }
            if (((cxl)this.gcaConfig.c()).k(cwv.I)) {
                final SnapshotButton snapshotButton = this.snapshotButton;
                o = pauseResumeButton;
                o2 = snapshotButton;
            }
            else {
                o = pauseResumeButton;
                o2 = null;
            }
        }
        else {
            o2 = null;
        }
        this.bottomBar.changeSideButtons((View)o, (View)o2, true);
    }
    
    public void startImaxCapture(final boolean b) {
        final RoundedThumbnailView thumbnailButton = this.thumbnailButton;
        boolean b2 = false;
        thumbnailButton.setClickable(false);
        final jcb uiOrientation = this.bottomBar.getUiOrientation();
        if (uiOrientation != jcb.c) {
            if (uiOrientation == jcb.b) {
                b2 = true;
            }
        }
        else {
            b2 = true;
        }
        if (b) {
            b2 ^= true;
        }
        this.bottomBar.fadeBackground(b2, true);
        this.bottomBar.changeSideButtons(null, (View)this.cancelButton, true);
    }
    
    public void startLongShot() {
        this.bottomBar.changeSideButtons(null, null, true);
    }
    
    public void startPanoramaCalibration() {
        this.bottomBar.changeSideButtons((View)this.retakeButton, (View)this.cancelButton, true);
    }
    
    public void startPhotoSphereCapture() {
        this.bottomBar.changeSideButtons((View)this.retakeButton, (View)this.cancelButton, true);
    }
    
    public void startRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons((View)this.pauseResumeButton, (View)this.snapshotButton, true);
    }
    
    public void startTimelapseRecording() {
        this.bottomBar.fadeBackground(false, true);
        if (this.gcaConfig.g() && ((cxl)this.gcaConfig.c()).k(cyl.e)) {
            this.bottomBar.changeSideButtons((View)this.pauseResumeButton, (View)this.snapshotButton, true);
            return;
        }
        this.bottomBar.changeSideButtons((View)this.pauseResumeButton, null, true);
    }
    
    public void startVideoIntentRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons(null, null, true);
    }
    
    public void stopAutoTimerCapturing() {
        if (this.isSocialShareOpened) {
            return;
        }
        this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, (View)this.thumbnailButton, true);
    }
    
    public void stopCountdown() {
        this.switchToMode(this.mode);
    }
    
    public void stopHfrRecording() {
        this.bottomBar.fadeBackground(true, true);
        if (this.gcaConfig.g() && ((cxl)this.gcaConfig.c()).k(cwv.H)) {
            this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
        }
        else {
            this.bottomBar.changeSideButtons((View)this.hfrButton, (View)this.thumbnailButton, true);
        }
        this.pauseResumeButton.resetButton(((cxl)this.gcaConfig.c()).k(cxr.ar));
    }
    
    public void stopImaxCapture() {
        this.thumbnailButton.setClickable(true);
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
    }
    
    public void stopLongShot() {
        this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, (View)this.thumbnailButton, true);
    }
    
    public void stopPanoramaCapture() {
        this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
    }
    
    public void stopPhotoSphereCapture() {
        this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
    }
    
    public void stopRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(true, true);
        }
        this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, (View)this.thumbnailButton, true);
        this.pauseResumeButton.resetButton(((cxl)this.gcaConfig.c()).k(cxr.ar));
    }
    
    public void stopTimelapseRecording() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, (View)this.thumbnailButton, true);
    }
    
    public void switchCamera() {
        this.cameraSwitchButton.callOnClick();
    }
    
    public void switchToMode(final jbm mode) {
        this.mode = mode;
        this.bottomBar.fadeBackground(true, true);
        final jbm a = jbm.a;
        switch (mode.ordinal()) {
            default: {
                return;
            }
            case 17: {
                this.bottomBar.changeSideButtons((View)this.leftCancelButton, (View)this.thumbnailButton, true);
                return;
            }
            case 10:
            case 15: {
                this.bottomBar.changeSideButtons(null, null, true);
                return;
            }
            case 7:
            case 8: {
                this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, null, true);
                return;
            }
            case 5: {
                if (this.gcaConfig.g() && ((cxl)this.gcaConfig.c()).k(cwv.H)) {
                    this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
                    return;
                }
                this.bottomBar.changeSideButtons((View)this.hfrButton, (View)this.thumbnailButton, true);
                return;
            }
            case 3:
            case 4: {
                this.bottomBar.changeSideButtons(null, (View)this.thumbnailButton, true);
                return;
            }
            case 1:
            case 2:
            case 6:
            case 11:
            case 12:
            case 13: {
                this.bottomBar.changeSideButtons((View)this.cameraSwitchButton, (View)this.thumbnailButton, true);
                return;
            }
            case 0:
            case 9:
            case 14:
            case 16:
            case 18: {
                final String value = String.valueOf(mode);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29);
                sb.append("Unsupported application mode ");
                sb.append(value);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }
    
    public void switchToPhotoIntentReview() {
        this.bottomBar.changeSideButtons((View)this.retakeButton, null, true);
    }
    
    public void switchToVideoIntentReview() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons((View)this.retakeButton, (View)this.reviewPlayButton, true);
    }
    
    public void wireListeners() {
        kjm.a();
        this.bottomBar.getCameraSwitchButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda4(this));
        this.bottomBar.getThumbnailButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda5(this));
        this.bottomBar.getPauseResumeButton().setListener(this.listenerDispatcher, !this.gcaConfig.g() || ((cxl)this.gcaConfig.c()).k(cxr.ar));
        this.bottomBar.getShutterButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda6(this));
        this.bottomBar.getSnapshotButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda7(this));
        this.bottomBar.getSnapshotButton().wirePressedStateAnimationListener();
        this.bottomBar.getHfrButton().setOnStateChangeListener(new BottomBarController$$ExternalSyntheticLambda8(this));
        this.bottomBar.getRetakeButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda0(this));
        this.bottomBar.getCancelButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda1(this));
        this.bottomBar.getLeftSideCancelButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda2(this));
        this.bottomBar.getReviewPlayButton().setOnClickListener((View$OnClickListener)new BottomBarController$$ExternalSyntheticLambda3(this));
        this.setClickable(true);
    }
}
