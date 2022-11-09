import android.graphics.RectF;
import android.util.SizeF;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dop
{
    private static final nsd a;
    private final float b;
    private final float c;
    private final PointF d;
    private final PointF e;
    private final float f;
    private final float g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/filmstrip/transition/FilmstripTransitionTransformBuilder");
    }
    
    public dop(final SizeF sizeF, final RectF rectF, final RectF rectF2, final RectF rectF3, float n) {
        if (!rectF.contains(rectF2)) {
            a.l(dop.a.b(), "Expected that the photos target area is contained in the camera window area.", '\u0357');
        }
        final RectF rectF4 = new RectF(rectF2);
        rectF4.intersect(rectF);
        final SizeF sizeF2 = new SizeF(rectF4.width(), rectF4.height());
        final PointF pointF = new PointF(rectF4.left - rectF.left, rectF4.top - rectF.top);
        final float width = sizeF.getWidth();
        final float height = sizeF.getHeight();
        final float width2 = sizeF2.getWidth();
        final float height2 = sizeF2.getHeight();
        float b;
        if (width / height > width2 / height2) {
            b = width2 / width;
        }
        else {
            b = height2 / height;
        }
        this.b = b;
        final float width3 = sizeF.getWidth();
        final float height3 = sizeF.getHeight();
        float c;
        if (width3 < height3) {
            c = n / width3;
        }
        else {
            c = n / height3;
        }
        this.c = c;
        final float width4 = sizeF.getWidth();
        final float height4 = sizeF.getHeight();
        final float width5 = sizeF2.getWidth();
        final float height5 = sizeF2.getHeight();
        final float n2 = width5 / height5;
        final float n3 = width4 / height4;
        float n4;
        float n5;
        if (n3 > n2) {
            n4 = width5 / n3;
            n5 = width5;
        }
        else {
            n5 = height5 * n3;
            n4 = height5;
        }
        final float n6 = 0.0f;
        float n7;
        float n8;
        if (n3 > n2) {
            n7 = (height5 - n4) / 2.0f;
            n8 = n6;
        }
        else {
            n8 = (width5 - n5) / 2.0f;
            n7 = 0.0f;
        }
        final float n9 = n8 + pointF.x;
        final float n10 = n7 + pointF.y;
        float n12;
        float n13;
        if (b != 1.0f) {
            final float n11 = n9 + (n5 - width4) / 2.0f;
            n12 = n10 + (n4 - height4) / 2.0f;
            n13 = n11;
        }
        else {
            n13 = n9;
            n12 = n10;
        }
        this.d = new PointF(n13, n12);
        final float width6 = sizeF.getWidth();
        final float height6 = sizeF.getHeight();
        final float left = rectF3.left;
        final float top = rectF3.top;
        final float n14 = (rectF3.width() - n) / 2.0f;
        final float n15 = left + n14;
        final float n16 = top + n14;
        float n17;
        if (c != 1.0f) {
            n17 = n15 + (n - width6) / 2.0f;
            n = n16 + (n - height6) / 2.0f;
        }
        else {
            n = n16;
            n17 = n15;
        }
        this.e = new PointF(n17, n);
        final float n18 = sizeF.getWidth() / 2.0f;
        n = sizeF.getHeight() / 2.0f;
        this.f = (float)Math.sqrt(n18 * n18 + n * n);
        this.g = Math.min(sizeF.getWidth() / 2.0f, sizeF.getHeight() / 2.0f);
    }
    
    public final doo a() {
        return new doo(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
