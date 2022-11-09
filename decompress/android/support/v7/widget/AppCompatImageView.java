// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView
{
    private final oo a;
    private final ow b;
    
    public AppCompatImageView(final Context context) {
        this(context, null);
    }
    
    public AppCompatImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AppCompatImageView(final Context context, final AttributeSet set, final int n) {
        tl.a(context);
        super(context, set, n);
        tj.d((View)this, this.getContext());
        (this.a = new oo((View)this)).d(set, n);
        (this.b = new ow(this)).b(set, n);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final oo a = this.a;
        if (a != null) {
            a.c();
        }
        final ow b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final boolean hasOverlappingRendering() {
        return this.b.d() && super.hasOverlappingRendering();
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo a = this.a;
        if (a != null) {
            a.i();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo a = this.a;
        if (a != null) {
            a.e(backgroundResource);
        }
    }
    
    public final void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final ow b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void setImageDrawable(final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        final ow b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final void setImageResource(final int n) {
        final ow b = this.b;
        if (b != null) {
            b.c(n);
        }
    }
    
    public final void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final ow b = this.b;
        if (b != null) {
            b.a();
        }
    }
}
