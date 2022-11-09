import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.graphics.drawable.ClipDrawable;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

class oz
{
    private static final int[] b;
    public Bitmap a;
    private final ProgressBar c;
    
    static {
        b = new int[] { 16843067, 16843068 };
    }
    
    public oz(final ProgressBar c) {
        this.c = c;
    }
    
    private final Drawable b(final Drawable drawable, final boolean b) {
        if (drawable instanceof hd) {
            final hd hd = (hd)drawable;
            final Drawable a = hd.a();
            if (a != null) {
                this.b(a, b);
                hd.b();
            }
        }
        else {
            if (drawable instanceof LayerDrawable) {
                final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                final int numberOfLayers = layerDrawable.getNumberOfLayers();
                final Drawable[] array = new Drawable[numberOfLayers];
                final int n = 0;
                for (int i = 0; i < numberOfLayers; ++i) {
                    final int id = layerDrawable.getId(i);
                    array[i] = this.b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                final LayerDrawable layerDrawable2 = new LayerDrawable(array);
                for (int j = n; j < numberOfLayers; ++j) {
                    layerDrawable2.setId(j, layerDrawable.getId(j));
                }
                return (Drawable)layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                final Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[] { 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f }, (RectF)null, (float[])null));
                shapeDrawable.getPaint().setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.REPEAT, Shader$TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (b) {
                    return (Drawable)new ClipDrawable((Drawable)shapeDrawable, 3, 1);
                }
                return (Drawable)shapeDrawable;
            }
        }
        return drawable;
    }
    
    public void a(final AttributeSet set, int i) {
        final to q = to.q(this.c.getContext(), set, oz.b, i);
        final Drawable j = q.i(0);
        if (j != null) {
            final ProgressBar c = this.c;
            Object indeterminateDrawable = j;
            if (j instanceof AnimationDrawable) {
                final AnimationDrawable animationDrawable = (AnimationDrawable)j;
                final int numberOfFrames = animationDrawable.getNumberOfFrames();
                indeterminateDrawable = new AnimationDrawable();
                ((AnimationDrawable)indeterminateDrawable).setOneShot(animationDrawable.isOneShot());
                Drawable b;
                for (i = 0; i < numberOfFrames; ++i) {
                    b = this.b(animationDrawable.getFrame(i), true);
                    b.setLevel(10000);
                    ((AnimationDrawable)indeterminateDrawable).addFrame(b, animationDrawable.getDuration(i));
                }
                ((AnimationDrawable)indeterminateDrawable).setLevel(10000);
            }
            c.setIndeterminateDrawable((Drawable)indeterminateDrawable);
        }
        final Drawable k = q.i(1);
        if (k != null) {
            this.c.setProgressDrawable(this.b(k, false));
        }
        q.n();
    }
}
