import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public class bld extends kxc
{
    private final fwv a;
    private final bmm b;
    private final boolean c;
    private final fwk d;
    
    public bld(final fwk d, final fwv a, final bmm b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final niz j(final ljm ljm) {
        if (this.c) {
            final bmm b = this.b;
            ++b.b;
            final MeteringRectangle[] array = (MeteringRectangle[])ljm.d(CaptureResult.CONTROL_AF_REGIONS);
            nii nii;
            if (array != null && array.length != 0) {
                final Rect rect = array[0].getRect();
                final Face[] array2 = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
                if (array2 == null) {
                    nii = nii.a;
                }
                else {
                    final int length = array2.length;
                    nii = nii.a;
                    niz j;
                    for (int i = 0; i < length; ++i, nii = (nii)j) {
                        final Face face = array2[i];
                        final Rect bounds = face.getBounds();
                        j = nii;
                        if (Math.abs(rect.centerX() - bounds.centerX()) < 100) {
                            j = nii;
                            if (Math.abs(rect.centerY() - bounds.centerY()) < 100) {
                                final Rect bounds2 = face.getBounds();
                                j = nii;
                                if (bounds2.width() * bounds2.height() > 0) {
                                    j = niz.i(face);
                                }
                            }
                        }
                    }
                }
            }
            else {
                nii = nii.a;
            }
            if (nii.g()) {
                b.a = ((Face)nii.c()).getId();
            }
            final Face[] array3 = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
            niz niz = null;
            Label_0567: {
                if (array3 != null) {
                    final int length2 = array3.length;
                    if (length2 > 0) {
                        for (final Face face2 : array3) {
                            if (b.a == face2.getId()) {
                                niz = niz.i(bml.a(face2.getId(), new Rect(face2.getBounds())));
                                break Label_0567;
                            }
                        }
                    }
                }
                final MeteringRectangle[] array4 = (MeteringRectangle[])ljm.d(CaptureResult.CONTROL_AF_REGIONS);
                niz niz2;
                if (array4 != null && array4.length != 0) {
                    final Face[] array5 = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
                    if (array5 != null && array5.length > 0) {
                        niz2 = nii.a;
                    }
                    else {
                        final Rect rect2 = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
                        final Rect rect3 = array4[0].getRect();
                        if (Math.abs(rect2.centerX() - rect3.centerX()) < 100 && Math.abs(rect3.centerY() - rect2.centerY()) < 100) {
                            niz2 = niz.i(new Rect(rect3.centerX() - 50, rect3.centerY() - 50, rect3.centerX() + 50, rect3.centerY() + 50));
                        }
                        else {
                            niz2 = nii.a;
                        }
                    }
                }
                else {
                    niz2 = nii.a;
                }
                if (niz2.g()) {
                    niz = niz.i(bml.a(-2, (Rect)niz2.c()));
                }
                else {
                    niz = nii.a;
                }
            }
            niz niz3;
            if (!niz.g()) {
                niz3 = nii.a;
            }
            else {
                final int a = ((bml)niz.c()).a;
                niz3 = niz;
                if (a != b.c) {
                    if (b.b > 15) {
                        b.b = 0;
                        b.c = a;
                        niz3 = niz;
                    }
                    else {
                        niz3 = nii.a;
                    }
                }
            }
            return niz3;
        }
        final MeteringRectangle[] array6 = (MeteringRectangle[])ljm.d(CaptureResult.CONTROL_AF_REGIONS);
        if (array6 == null || array6.length <= 0) {
            return nii.a;
        }
        final MeteringRectangle meteringRectangle = array6[0];
        if (meteringRectangle.getRect().isEmpty()) {
            return nii.a;
        }
        return niz.i(bml.a(-2, meteringRectangle.getRect()));
    }
    
    protected boolean a(final ljm ljm) {
        return false;
    }
    
    @Override
    public final void b(final ljm ljm) {
        if (ljm.d(CaptureResult.CONTROL_AF_MODE) == null) {
            return;
        }
        final Integer n = (Integer)ljm.d(CaptureResult.CONTROL_AF_MODE);
        n.getClass();
        final int intValue = n;
        final gzq gzq = gzq.g.get(intValue);
        if (gzq != null) {
            final Integer n2 = (Integer)ljm.d(CaptureResult.CONTROL_AF_STATE);
            n2.getClass();
            final gzr a = gzr.a(n2);
            final Float n3 = (Float)ljm.d(CaptureResult.LENS_FOCUS_DISTANCE);
            n3.getClass();
            final boolean a2 = this.a(ljm);
            final niz j = this.j(ljm);
            niz niz = null;
            Label_0385: {
                if (!j.g()) {
                    niz = nii.a;
                }
                else {
                    final Rect rect = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
                    if (rect != null) {
                        final fwv a3 = this.a;
                        final Rect b = ((bml)j.c()).b;
                        final PointF pointF = new PointF(b.exactCenterX(), b.exactCenterY());
                        final PointF b2 = a3.a.b(new PointF((pointF.x - rect.left) / rect.width(), (pointF.y - rect.top) / rect.height()));
                        final fwh fwh = new fwh();
                        fwh.a(false);
                        fwh.b = -1;
                        fwh.a = b2;
                        final int a4 = ((bml)j.c()).a;
                        fwh.a(a4 >= 0 || a4 == -1);
                        final PointF a5 = fwh.a;
                        if (a5 != null) {
                            final Integer b3 = fwh.b;
                            if (b3 != null) {
                                if (fwh.c != null) {
                                    niz = niz.i(new fwi(a5, b3, fwh.c));
                                    break Label_0385;
                                }
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        if (fwh.a == null) {
                            sb.append(" normalizedCenterPoint");
                        }
                        if (fwh.b == null) {
                            sb.append(" confidenceScore");
                        }
                        if (fwh.c == null) {
                            sb.append(" isFace");
                        }
                        final String value = String.valueOf(sb);
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(value);
                        throw new IllegalStateException(sb2.toString());
                    }
                    niz = nii.a;
                }
            }
            final niz i = this.j(ljm);
            int n5;
            if (i.g()) {
                final Rect b4 = ((bml)i.c()).b;
                final int max = Math.max(b4.width(), b4.height());
                float n4;
                if (!this.c) {
                    n4 = 1.0f;
                }
                else {
                    n4 = 1.3f;
                }
                n5 = (int)(max * n4);
            }
            else {
                n5 = 0;
            }
            this.d.aR(new fwj(gzq, a, n3, a2, niz, n5));
            return;
        }
        final StringBuilder sb3 = new StringBuilder(35);
        sb3.append("unknown metadata value: ");
        sb3.append(intValue);
        throw new IllegalArgumentException(sb3.toString());
    }
}
