// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.filmstrip.transition;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.view.View;

public class FilmstripTransitionThumbnailView extends View
{
    public final Object a;
    public Bitmap b;
    public Paint c;
    private float d;
    
    public FilmstripTransitionThumbnailView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Object();
        this.d = -1.0f;
        this.setWillNotDraw(false);
    }
    
    public final Bitmap a() {
        synchronized (this.a) {
            return this.b;
        }
    }
    
    public final void b(final float d) {
        this.d = d;
        this.invalidate();
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.d < 0.0f) {
            return;
        }
        synchronized (this.a) {
            canvas.drawCircle((float)(canvas.getWidth() / 2), (float)(canvas.getHeight() / 2), this.d, this.c);
        }
    }
}
