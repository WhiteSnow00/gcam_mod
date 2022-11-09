import android.hardware.camera2.params.Face;
import android.graphics.PointF;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzm
{
    public final Rect a;
    public final int b;
    public final PointF c;
    public final PointF d;
    public final PointF e;
    public final PointF f;
    public final PointF g;
    public final PointF h;
    public final int i;
    public final float j;
    public final float k;
    public final float l;
    
    public gzm(final int n, final Rect rect, final int n2, final PointF pointF, final PointF pointF2, final PointF pointF3) {
        this(n, rect, n2, pointF, pointF2, pointF3, null, null, null, 0.0f, 0.0f, 0.0f);
    }
    
    public gzm(final int i, final Rect a, final int b, final PointF c, final PointF d, final PointF e, final PointF f, final PointF g, final PointF h, final float j, final float k, final float l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public static gzm a(final Face face) {
        final int id = face.getId();
        final Rect bounds = face.getBounds();
        final int score = face.getScore();
        PointF pointF;
        if (face.getLeftEyePosition() == null) {
            pointF = null;
        }
        else {
            pointF = new PointF(face.getLeftEyePosition());
        }
        PointF pointF2;
        if (face.getRightEyePosition() == null) {
            pointF2 = null;
        }
        else {
            pointF2 = new PointF(face.getRightEyePosition());
        }
        PointF pointF3;
        if (face.getMouthPosition() == null) {
            pointF3 = null;
        }
        else {
            pointF3 = new PointF(face.getMouthPosition());
        }
        return new gzm(id, bounds, score, pointF, pointF2, pointF3);
    }
    
    public static gzm b(final ljj ljj) {
        return new gzm(ljj.a.getId(), ljj.a.getBounds(), ljj.a.getScore(), ljj.a((byte)1), ljj.a((byte)2), ljj.a((byte)4), ljj.a((byte)3), ljj.a((byte)5), ljj.a((byte)6), ljj.b, ljj.c, ljj.d);
    }
}
