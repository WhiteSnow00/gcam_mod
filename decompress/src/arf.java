import android.graphics.RectF;
import android.graphics.Matrix;
import android.hardware.Camera$Area;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;
import j$.util.Objects;
import android.hardware.camera2.CaptureRequest$Key;
import android.util.Size;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.hardware.camera2.CameraDevice;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arf extends atu
{
    public static final aub a;
    private final CaptureRequest$Builder A;
    private final Rect B;
    public final aue b;
    public final Rect c;
    
    static {
        a = new aub("AndCam2Set");
    }
    
    public arf(final CameraDevice cameraDevice, final Rect b, final aua aua, final aua aua2) {
        if (cameraDevice == null) {
            throw new NullPointerException("camera must not be null");
        }
        if (b != null) {
            boolean v = true;
            final CaptureRequest$Builder captureRequest = cameraDevice.createCaptureRequest(1);
            this.A = captureRequest;
            this.b = new aue();
            this.B = b;
            this.c = new Rect(0, 0, b.width(), b.height());
            this.g = false;
            final Range range = (Range)captureRequest.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (range != null) {
                this.j((int)range.getLower(), (int)range.getUpper());
            }
            this.l(aua);
            this.k(aua2);
            this.n = (byte)this.m(CaptureRequest.JPEG_QUALITY, 0);
            this.p = 1.0f;
            final CaptureRequest$Key control_AE_EXPOSURE_COMPENSATION = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            final Integer value = 0;
            this.q = (int)this.m(control_AE_EXPOSURE_COMPENSATION, value);
            final Integer n = (Integer)captureRequest.get(CaptureRequest.CONTROL_AE_MODE);
            atg r = null;
            if (n != null) {
                switch (n) {
                    case 4: {
                        r = atg.f;
                        break;
                    }
                    case 3: {
                        if ((int)captureRequest.get(CaptureRequest.FLASH_MODE) == 2) {
                            r = atg.e;
                            break;
                        }
                        r = atg.d;
                        break;
                    }
                    case 2: {
                        r = atg.b;
                        break;
                    }
                    case 1: {
                        r = atg.c;
                        break;
                    }
                }
            }
            this.r = r;
            final Integer n2 = (Integer)captureRequest.get(CaptureRequest.CONTROL_AF_MODE);
            if (n2 != null) {
                this.s = are.a(n2);
            }
            final Integer n3 = (Integer)captureRequest.get(CaptureRequest.CONTROL_SCENE_MODE);
            if (n3 != null) {
                this.t = are.b(n3);
            }
            final Integer n4 = (Integer)captureRequest.get(CaptureRequest.CONTROL_AWB_MODE);
            if (n4 != null) {
                this.u = are.c(n4);
            }
            if ((int)this.m(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, value) != 1) {
                v = false;
            }
            this.v = v;
            final CaptureRequest$Key control_AE_LOCK = CaptureRequest.CONTROL_AE_LOCK;
            final Boolean value2 = false;
            this.w = (boolean)this.m(control_AE_LOCK, value2);
            this.x = (boolean)this.m(CaptureRequest.CONTROL_AWB_LOCK, value2);
            final Size size = (Size)captureRequest.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
            if (size != null) {
                this.z = new aua(size.getWidth(), size.getHeight());
            }
            return;
        }
        throw new NullPointerException("activeArray must not be null");
    }
    
    public arf(final arf arf) {
        super(arf);
        this.A = arf.A;
        this.b = new aue(arf.b);
        this.B = arf.B;
        this.c = new Rect(arf.c);
    }
    
    private final Object m(final CaptureRequest$Key captureRequest$Key, final Object o) {
        final Object value = this.A.get(captureRequest$Key);
        if (value != null) {
            return value;
        }
        this.A.set(captureRequest$Key, o);
        return o;
    }
    
    private static final int n(final double n, final int n2) {
        return (int)Math.min(Math.max(n, 0.0), n2);
    }
    
    @Override
    public final atu a() {
        return new arf(this);
    }
    
    public final void b(final CaptureRequest$Key captureRequest$Key, Object o) {
        final aue b = this.b;
        Label_0476: {
            if (captureRequest$Key == CaptureRequest.CONTROL_AE_REGIONS) {
                if (this.e.size() == 0) {
                    o = null;
                }
            }
            else if (captureRequest$Key == CaptureRequest.CONTROL_AF_REGIONS) {
                if (this.f.size() == 0) {
                    o = null;
                }
            }
            else {
                final CaptureRequest$Key control_AE_TARGET_FPS_RANGE = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                final boolean b2 = false;
                boolean b3 = false;
                Label_0465: {
                    if (captureRequest$Key == control_AE_TARGET_FPS_RANGE) {
                        final Range range = (Range)this.A.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
                        while (true) {
                            int h = 0;
                            Label_0116: {
                                if ((h = this.h) != 0) {
                                    break Label_0116;
                                }
                                if (this.i != 0) {
                                    h = 0;
                                    break Label_0116;
                                }
                                b3 = true;
                                break Label_0465;
                            }
                            if (range != null && h == (int)range.getLower()) {
                                if (this.i == (int)range.getUpper()) {
                                    continue;
                                }
                                break Label_0476;
                            }
                            else {
                                b3 = b2;
                            }
                            break;
                        }
                    }
                    else if (captureRequest$Key == CaptureRequest.JPEG_QUALITY) {
                        b3 = Objects.equals((Object)this.n, this.A.get(CaptureRequest.JPEG_QUALITY));
                    }
                    else if (captureRequest$Key == CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION) {
                        b3 = Objects.equals((Object)this.q, this.A.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
                    }
                    else if (captureRequest$Key == CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE) {
                        final Integer n = (Integer)this.A.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
                        if (n == null || !this.v || n != 1) {
                            b3 = b2;
                            if (this.v) {
                                break Label_0465;
                            }
                            if (n != 0) {
                                break Label_0476;
                            }
                        }
                        b3 = true;
                    }
                    else if (captureRequest$Key == CaptureRequest.CONTROL_AE_LOCK) {
                        b3 = Objects.equals((Object)this.w, this.A.get(CaptureRequest.CONTROL_AE_LOCK));
                    }
                    else if (captureRequest$Key == CaptureRequest.CONTROL_AWB_LOCK) {
                        b3 = Objects.equals((Object)this.x, this.A.get(CaptureRequest.CONTROL_AWB_LOCK));
                    }
                    else {
                        if (captureRequest$Key != CaptureRequest.JPEG_THUMBNAIL_SIZE) {
                            auc.c(arf.a, "Settings implementation checked default of unhandled option key");
                            o = null;
                            break Label_0476;
                        }
                        if (this.z == null) {
                            break Label_0476;
                        }
                        final Size size = (Size)this.A.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
                        if (this.z.b() != 0 || this.z.a() != 0) {
                            b3 = b2;
                            if (size == null) {
                                break Label_0465;
                            }
                            b3 = b2;
                            if (this.z.b() != size.getWidth()) {
                                break Label_0465;
                            }
                            if (this.z.a() != size.getHeight()) {
                                break Label_0476;
                            }
                        }
                        b3 = true;
                    }
                }
                if (b3) {
                    o = null;
                }
            }
        }
        b.d(captureRequest$Key, o);
    }
    
    public final MeteringRectangle[] c(final List list) {
        MeteringRectangle[] array;
        if (list.size() > 0) {
            array = new MeteringRectangle[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                final Camera$Area camera$Area = list.get(i);
                final Rect rect = camera$Area.rect;
                final int left = rect.left;
                final int top = rect.top;
                final int right = rect.right;
                final int bottom = rect.bottom;
                final int left2 = this.c.left;
                final double n = this.c.width();
                final double n2 = left + 1000;
                Double.isNaN(n2);
                final double n3 = n2 / 2000.0;
                Double.isNaN(n);
                final int n4 = left2 + n(n * n3, this.c.width() - 1);
                final int top2 = this.c.top;
                final double n5 = this.c.height();
                final double n6 = top + 1000;
                Double.isNaN(n6);
                final double n7 = n6 / 2000.0;
                Double.isNaN(n5);
                final int n8 = top2 + n(n5 * n7, this.c.height() - 1);
                final int left3 = this.c.left;
                final int width = this.c.width();
                final int width2 = this.c.width();
                final double n9 = width;
                final double n10 = right + 1000;
                Double.isNaN(n10);
                final double n11 = n10 / 2000.0;
                Double.isNaN(n9);
                final int n12 = n(n9 * n11, width2 - 1);
                final int top3 = this.c.top;
                final int height = this.c.height();
                final int height2 = this.c.height();
                final double n13 = height;
                final double n14 = bottom + 1000;
                Double.isNaN(n14);
                final double n15 = n14 / 2000.0;
                Double.isNaN(n13);
                array[i] = new MeteringRectangle(n4, n8, left3 + n12 - n4, top3 + n(n13 * n15, height2 - 1) - n8, camera$Area.weight);
            }
        }
        else {
            array = null;
        }
        return array;
    }
    
    @Override
    public final void d() {
        super.p = 1.0f;
        this.c.set(0, 0, n(this.B.width() / this.p, this.B.width()), n(this.B.height() / this.p, this.B.height()));
        this.c.offsetTo((this.B.width() - this.c.width()) / 2, (this.B.height() - this.c.height()) / 2);
        final Rect c = this.c;
        final aua k = this.k;
        final int width = c.width();
        final int height = c.height();
        final float n = k.b() / (float)k.a();
        float n2;
        float n3;
        if (n < width / (float)height) {
            n2 = (float)c.height();
            n3 = n * n2;
        }
        else {
            n3 = (float)c.width();
            n2 = n3 / n;
        }
        final Matrix matrix = new Matrix();
        final RectF rectF = new RectF(0.0f, 0.0f, n3, n2);
        matrix.setTranslate(c.exactCenterX(), c.exactCenterY());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.mapRect(rectF);
        rectF.roundOut(new Rect());
    }
}
