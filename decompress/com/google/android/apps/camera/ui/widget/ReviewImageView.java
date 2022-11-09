// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.widget;

import android.widget.ImageView$ScaleType;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class ReviewImageView extends ImageView
{
    public ReviewImageView(final Context context) {
        super(context);
    }
    
    public ReviewImageView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ReviewImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public ReviewImageView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    private final void c() {
        final BitmapDrawable bitmapDrawable = (BitmapDrawable)this.getDrawable();
        if (bitmapDrawable != null && !bitmapDrawable.getBitmap().isRecycled()) {
            bitmapDrawable.getBitmap().recycle();
        }
    }
    
    public final void a() {
        this.c();
        this.setVisibility(8);
        this.setImageDrawable((Drawable)null);
    }
    
    public final void b(final Bitmap imageBitmap) {
        this.c();
        this.setVisibility(0);
        this.setImageBitmap(imageBitmap);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final BitmapDrawable bitmapDrawable = (BitmapDrawable)this.getDrawable();
        if (bitmapDrawable != null && bitmapDrawable.getBitmap() != null) {
            final Bitmap bitmap = bitmapDrawable.getBitmap();
            final float n5 = (float)bitmap.getWidth();
            final float n6 = (float)bitmap.getHeight();
            final float n7 = (float)this.getWidth();
            final float n8 = (float)this.getHeight();
            final Matrix imageMatrix = new Matrix();
            final float min = Math.min(n8 / n6, n7 / n5);
            imageMatrix.setScale(min, min);
            imageMatrix.postTranslate(n7 / 2.0f - n5 * min / 2.0f, n8 / 2.0f - n6 * min / 2.0f);
            this.setImageMatrix(imageMatrix);
            this.setScaleType(ImageView$ScaleType.MATRIX);
        }
    }
}
