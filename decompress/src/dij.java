import com.google.googlex.gcam.FloatVector;
import android.graphics.PointF;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.MeshWarp;
import android.graphics.Rect;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dij
{
    public static Point a(final Point point, final lvl lvl, final Rect rect) {
        final float n = lvl.b() / (float)lvl.a();
        final int width = rect.width();
        final int height = rect.height();
        int width2 = rect.width();
        int height2 = rect.height();
        final float n2 = width / (float)height;
        int n3 = 0;
        int n4;
        if (n < n2) {
            width2 = (int)(rect.height() * n);
            n3 = (int)((rect.width() - width2) * 0.5f);
            n4 = 0;
        }
        else {
            height2 = (int)(rect.width() / n);
            n4 = (int)((rect.height() - height2) * 0.5f);
        }
        return new Point((point.x - rect.left - n3) * lvl.b() / width2, (point.y - rect.top - n4) * lvl.a() / height2);
    }
    
    public static Point b(final Point point, final MeshWarp meshWarp) {
        if (meshWarp != null && meshWarp.a() != 0 && meshWarp.b() != 0) {
            final int a = meshWarp.a();
            final int b = meshWarp.b();
            final long meshWarp_mesh_warp_crop_region_get = GcamModuleJNI.MeshWarp_mesh_warp_crop_region_get(meshWarp.a, meshWarp);
            PixelRect pixelRect;
            if (meshWarp_mesh_warp_crop_region_get == 0L) {
                pixelRect = null;
            }
            else {
                pixelRect = new PixelRect(meshWarp_mesh_warp_crop_region_get, false);
            }
            final FloatVector c = meshWarp.c();
            final PointF pointF = new PointF((point.x - GcamModuleJNI.PixelRect_x0_get(pixelRect.a, pixelRect)) / (float)GcamModuleJNI.PixelRect_width(pixelRect.a, pixelRect), (point.y - GcamModuleJNI.PixelRect_y0_get(pixelRect.a, pixelRect)) / (float)GcamModuleJNI.PixelRect_height(pixelRect.a, pixelRect));
            final float min = Math.min(Math.max(pointF.x * a, 0.0f), (float)(a - 1));
            final float min2 = Math.min(Math.max(pointF.y * b, 0.0f), (float)(b - 1));
            final double n = min;
            final int n2 = (int)Math.floor(n);
            final int n3 = (int)Math.ceil(n);
            final double n4 = min2;
            final int n5 = (int)Math.floor(n4);
            final double ceil = Math.ceil(n4);
            final int n6 = n5 * a;
            final int n7 = n6 + n2;
            final int n8 = n7 + n7;
            final Point point2 = new Point(n8, n8 + 1);
            final int n9 = n6 + n3;
            final int n10 = n9 + n9;
            final Point point3 = new Point(n10, n10 + 1);
            final int n11 = (int)ceil * a;
            final int n12 = n11 + n2;
            final int n13 = n12 + n12;
            final Point point4 = new Point(n13, n13 + 1);
            final int n14 = n11 + n3;
            final int n15 = n14 + n14;
            final Point point5 = new Point(n15, n15 + 1);
            final PointF pointF2 = new PointF(c.a(point2.x), c.a(point2.y));
            final PointF pointF3 = new PointF(c.a(point3.x), c.a(point3.y));
            final PointF pointF4 = new PointF(c.a(point4.x), c.a(point4.y));
            final PointF pointF5 = new PointF(c.a(point5.x), c.a(point5.y));
            final float n16 = min - n2;
            final float n17 = min2 - n5;
            final float n18 = 1.0f - n16;
            final float x = pointF3.x;
            final float x2 = pointF2.x;
            final float x3 = pointF5.x;
            final float x4 = pointF4.x;
            final float n19 = 1.0f - n17;
            return new Point((int)((x3 * n16 + x4 * n18) * n17 + (x * n16 + x2 * n18) * n19), (int)(n16 * (pointF5.y * n17 + pointF3.y * n19) + n18 * (n17 * pointF4.y + n19 * pointF2.y)));
        }
        return point;
    }
}
