// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.graphics.Shader;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Bitmap;
import android.graphics.Paint;

class RoundedThumbnailView$RevealRequest
{
    private String accessibilityString;
    private boolean animationDisabled;
    private boolean rippleAnimationFinished;
    private boolean thumbnailAnimationFinished;
    private Paint thumbnailPaint;
    private float viewSize;
    
    private RoundedThumbnailView$RevealRequest(final float viewSize, final String accessibilityString) {
        this.accessibilityString = accessibilityString;
        this.viewSize = viewSize;
    }
    
    static RoundedThumbnailView$RevealRequest createAnimatedRevealRequest(final float n, final String s) {
        return new RoundedThumbnailView$RevealRequest(n, s);
    }
    
    static RoundedThumbnailView$RevealRequest createNonAnimatedRevealRequest(final float n, final String s) {
        final RoundedThumbnailView$RevealRequest roundedThumbnailView$RevealRequest = new RoundedThumbnailView$RevealRequest(n, s);
        roundedThumbnailView$RevealRequest.animationDisabled = true;
        return roundedThumbnailView$RevealRequest;
    }
    
    private void precomputeThumbnailPaint(final Bitmap bitmap, final int n) {
        if (this.thumbnailPaint == null) {
            if (bitmap == null) {
                return;
            }
            if (bitmap.getWidth() != bitmap.getHeight()) {
                return;
            }
            final BitmapShader shader = new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
            if (bitmap.getWidth() != this.viewSize) {
                final RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
                final float viewSize = this.viewSize;
                final RectF rectF2 = new RectF(0.0f, 0.0f, viewSize, viewSize);
                final Matrix localMatrix = new Matrix();
                localMatrix.setRectToRect(rectF, rectF2, Matrix$ScaleToFit.FILL);
                localMatrix.preRotate((float)n, rectF.width() / 2.0f, rectF.height() / 2.0f);
                shader.setLocalMatrix(localMatrix);
            }
            (this.thumbnailPaint = new Paint()).setAntiAlias(true);
            this.thumbnailPaint.setShader((Shader)shader);
        }
    }
    
    public void finishRippleAnimation() {
        this.rippleAnimationFinished = true;
    }
    
    public void finishThumbnailAnimation() {
        this.thumbnailAnimationFinished = true;
    }
    
    public String getAccessibilityString() {
        return this.accessibilityString;
    }
    
    public Paint getThumbnailPaint() {
        return this.thumbnailPaint;
    }
    
    public boolean isAnimationDisabled() {
        return this.animationDisabled;
    }
    
    public boolean isFinished() {
        return this.thumbnailAnimationFinished && this.rippleAnimationFinished;
    }
    
    public void setThumbnailBitmap(Bitmap scaledBitmap, final int n) {
        Bitmap bitmap = scaledBitmap;
        if (scaledBitmap.getWidth() != scaledBitmap.getHeight()) {
            final int width = scaledBitmap.getWidth();
            final int height = scaledBitmap.getHeight();
            int n2 = 512;
            if (width > 512 || height > 512) {
                int n3;
                if (width > height) {
                    n3 = height * 512 / width;
                }
                else {
                    n2 = width * 512 / height;
                    n3 = 512;
                }
                scaledBitmap = Bitmap.createScaledBitmap(scaledBitmap, n2, n3, false);
            }
            final int width2 = scaledBitmap.getWidth();
            final int height2 = scaledBitmap.getHeight();
            if (width2 >= height2) {
                bitmap = Bitmap.createBitmap(scaledBitmap, width2 / 2 - height2 / 2, 0, height2, height2);
            }
            else {
                bitmap = Bitmap.createBitmap(scaledBitmap, 0, height2 / 2 - width2 / 2, width2, width2);
            }
        }
        this.precomputeThumbnailPaint(bitmap, n);
    }
}
