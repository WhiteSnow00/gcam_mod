import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public class ov extends ImageButton
{
    private final oo mBackgroundTintHelper;
    private final ow mImageHelper;
    
    public ov(final Context context) {
        this(context, null);
    }
    
    public ov(final Context context, final AttributeSet set) {
        this(context, set, 2130969190);
    }
    
    public ov(final Context context, final AttributeSet set, final int n) {
        tl.a(context);
        super(context, set, n);
        tj.d((View)this, this.getContext());
        (this.mBackgroundTintHelper = new oo((View)this)).d(set, n);
        (this.mImageHelper = new ow((ImageView)this)).b(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.c();
        }
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            return mBackgroundTintHelper.a();
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            return mBackgroundTintHelper.b();
        }
        return null;
    }
    
    public ColorStateList getSupportImageTintList() {
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            final tm a = mImageHelper.a;
            if (a != null) {
                return a.a;
            }
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            final tm a = mImageHelper.a;
            if (a != null) {
                return a.b;
            }
        }
        return null;
    }
    
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.d() && super.hasOverlappingRendering();
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.i();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.e(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public void setImageResource(final int n) {
        this.mImageHelper.c(n);
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            mImageHelper.a();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.g(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final oo mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.h(porterDuff$Mode);
        }
    }
    
    public void setSupportImageTintList(final ColorStateList a) {
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            if (mImageHelper.a == null) {
                mImageHelper.a = new tm();
            }
            final tm a2 = mImageHelper.a;
            a2.a = a;
            a2.d = true;
            mImageHelper.a();
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode b) {
        final ow mImageHelper = this.mImageHelper;
        if (mImageHelper != null) {
            if (mImageHelper.a == null) {
                mImageHelper.a = new tm();
            }
            final tm a = mImageHelper.a;
            a.b = b;
            a.c = true;
            mImageHelper.a();
        }
    }
}
