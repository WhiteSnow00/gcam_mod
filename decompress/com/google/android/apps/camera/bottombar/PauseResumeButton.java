// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.ImageButton;

public class PauseResumeButton extends ImageButton
{
    private static final int[] STATE_PAUSED;
    private final Context context;
    private boolean firstTimeLaunch;
    private boolean isP20NewUI;
    private boolean isResumeState;
    private PauseResumeButton$PauseResumeButtonListener listener;
    private Drawable pauseResumeAnimatable;
    private Drawable resumePauseAnimatable;
    
    static {
        STATE_PAUSED = new int[] { R$attr.state_paused };
    }
    
    public PauseResumeButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.firstTimeLaunch = true;
        this.isP20NewUI = false;
        this.context = context;
    }
    
    public boolean isResumeState() {
        return this.isResumeState;
    }
    
    public int[] onCreateDrawableState(final int n) {
        if (this.isResumeState) {
            final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
            mergeDrawableStates(onCreateDrawableState, PauseResumeButton.STATE_PAUSED);
            return onCreateDrawableState;
        }
        return super.onCreateDrawableState(n);
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.transitionToPauseState(this.isP20NewUI);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.firstTimeLaunch) {
            this.transitionToPauseState(this.isP20NewUI);
            this.firstTimeLaunch = false;
        }
    }
    
    public boolean performClick() {
        if (this.isResumeState) {
            final PauseResumeButton$PauseResumeButtonListener listener = this.listener;
            if (listener != null) {
                listener.onResumeButtonClicked();
            }
        }
        else {
            final PauseResumeButton$PauseResumeButtonListener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onPauseButtonClicked();
            }
        }
        return super.performClick();
    }
    
    public void resetButton(final boolean b) {
        this.transitionToPauseState(b);
        this.refreshDrawableState();
    }
    
    public void setListener(final PauseResumeButton$PauseResumeButtonListener listener, final boolean isP20NewUI) {
        this.listener = listener;
        this.isP20NewUI = isP20NewUI;
    }
    
    protected void transitionToPauseState(final boolean isP20NewUI) {
        if (this.resumePauseAnimatable == null || this.firstTimeLaunch) {
            final Resources resources = this.context.getResources();
            int n;
            if (isP20NewUI) {
                n = R$drawable.ic_pause_circle_outline_24px;
            }
            else {
                n = R$drawable.ic_resume_pause_animation;
            }
            this.resumePauseAnimatable = resources.getDrawable(n, (Resources$Theme)null);
        }
        this.setImageDrawable(this.resumePauseAnimatable);
        if (!isP20NewUI) {
            ((Animatable)this.resumePauseAnimatable).start();
            this.setBackground(this.context.getResources().getDrawable(R$drawable.crossfade_button_background_legacy));
        }
        else {
            this.setBackground(this.context.getResources().getDrawable(R$drawable.crossfade_button_background));
        }
        this.isP20NewUI = isP20NewUI;
        this.isResumeState = false;
        this.setContentDescription((CharSequence)this.getResources().getString(R$string.pause_video_recording));
        this.refreshDrawableState();
    }
    
    protected void transitionToResumeState(final boolean isP20NewUI) {
        if (this.pauseResumeAnimatable == null || this.firstTimeLaunch) {
            final Resources resources = this.context.getResources();
            int n;
            if (isP20NewUI) {
                n = R$drawable.resume_center_circle;
            }
            else {
                n = R$drawable.ic_pause_resume_animation;
            }
            this.pauseResumeAnimatable = resources.getDrawable(n, (Resources$Theme)null);
        }
        this.setImageDrawable(this.pauseResumeAnimatable);
        if (!isP20NewUI) {
            ((Animatable)this.pauseResumeAnimatable).start();
        }
        this.isP20NewUI = isP20NewUI;
        this.isResumeState = true;
        this.setContentDescription((CharSequence)this.getResources().getString(R$string.resume_video_recording));
        this.refreshDrawableState();
    }
}
