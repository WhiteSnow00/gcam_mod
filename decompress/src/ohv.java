import com.google.googlex.gcam.WeightedNormalizedRectVector;
import com.google.googlex.gcam.WeightedNormalizedRect;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.MeshTranslation;
import com.google.googlex.gcam.AeShotParams;
import android.hardware.camera2.CaptureRequest$Key;
import com.google.googlex.gcam.FrameRequest;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.LensShadingMap;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.FrameMetadataKey;
import com.google.googlex.gcam.AeMetadata;
import com.google.googlex.gcam.AfMetadata;
import com.google.googlex.gcam.AwbMetadata;
import android.graphics.Point;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.OisSample;
import com.google.googlex.gcam.OisPositionVector;
import com.google.googlex.gcam.IspAwbMetadata;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import com.google.googlex.gcam.AeModeResult;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.LiveHdrMetadata;
import android.hardware.camera2.params.BlackLevelPattern;
import com.google.googlex.gcam.NoiseModel;
import android.util.Pair;
import com.google.googlex.gcam.SceneFlicker;
import com.google.googlex.gcam.OisPosition;
import j$.util.function.Consumer;
import com.google.googlex.gcam.OisMetadata;
import com.google.googlex.gcam.GeometricCalibration;
import j$.util.Optional;
import com.google.googlex.gcam.GeometricCalibrationVector;
import com.google.googlex.gcam.FaceInfo$Landmark;
import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.FrameMetadata;
import java.util.Arrays;
import android.hardware.camera2.params.RggbChannelVector;
import com.google.googlex.gcam.AwbInfo;
import android.util.Rational;
import com.google.googlex.gcam.WeightedPixelRect;
import com.google.googlex.gcam.WeightedPixelRectVector;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.googlex.gcam.BufferUtils;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Iterator;
import android.graphics.ImageFormat;
import android.util.Size;
import com.google.googlex.gcam.QcColorCalibration$IlluminantData;
import com.google.googlex.gcam.QcIlluminantVector;
import com.google.googlex.gcam.QcColorCalibration;
import com.google.googlex.gcam.DngColorCalibration;
import android.hardware.camera2.params.ColorSpaceTransform;
import com.google.googlex.gcam.DngColorCalibrationVector;
import com.google.googlex.gcam.PixelRectVector;
import com.ctgcam;
import android.os.Build;
import com.google.googlex.gcam.StaticMetadata;
import android.hardware.camera2.CaptureResult$Key;
import android.util.Range;
import com.google.googlex.gcam.FloatVector;
import android.util.Log;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.MeshWarp;
import android.graphics.Rect;
import java.util.List;
import android.util.SizeF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohv
{
    private static final String c;
    private static final liz d;
    public final lfg a;
    public final lfh b;
    
    static {
        c = ohv.class.getSimpleName();
        d = liz.a();
    }
    
    public ohv(final lfg a, final lfh b) {
        this.a = a;
        this.b = b;
        njo.e(liy.a().f, "Android Q or higher required.");
    }
    
    public static float b(final long n) {
        return n / 1000000.0f;
    }
    
    public static int c(final lfg lfg, final lfh lfh, final ljm ljm) {
        final lfu l = lfg.l();
        final boolean i = lfg.I();
        final int intValue = (int)lfg.m(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
        if (i && ljm == null) {
            if (l == lfu.b) {
                return 5;
            }
            return 3;
        }
        else {
            lfg t = lfg;
            if (ljm != null) {
                t = t(lfg, lfh, ljm);
            }
            final List t2 = t.t();
            Float n;
            if (t2.size() == 1) {
                n = t2.get(0);
            }
            else if (ljm != null) {
                n = (Float)ljm.d(CaptureResult.LENS_FOCAL_LENGTH);
            }
            else {
                n = null;
            }
            final SizeF sizeF = (SizeF)t.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (l == lfu.b) {
                if (i && n == null) {
                    return 5;
                }
                if (n != null && n > 5.0f) {
                    final liz d = ohv.d;
                    if (d.h() && n < 10.0f) {
                        if (sizeF.getWidth() > 7.5f) {
                            return 10;
                        }
                        return 11;
                    }
                    else {
                        if (x(ljm)) {
                            return 7;
                        }
                        if (d.h()) {
                            return 7;
                        }
                        return 4;
                    }
                }
                else {
                    if (n == null || n >= 3.5f) {
                        return 0;
                    }
                    if (x(ljm)) {
                        return 9;
                    }
                    return 8;
                }
            }
            else {
                if (i && n == null) {
                    return 3;
                }
                Label_0339: {
                    if (n != null) {
                        final liz d2 = ohv.d;
                        if ((!d2.d() || n >= 2.1f) && (!d2.a || n >= 5.0f)) {
                            if (!d2.j) {
                                break Label_0339;
                            }
                            if (sizeF.getWidth() <= 4.5f) {
                                break Label_0339;
                            }
                        }
                        return 2;
                    }
                }
                if (intValue == 6) {
                    return 6;
                }
                return 1;
            }
        }
    }
    
    public static long d(final lfg lfg) {
        final lgg g = g(lfg);
        return lfg.g(g.a, g.b);
    }
    
    public static lgg g(final lfg lfg) {
        final List v = lfg.v(37);
        final List v2 = lfg.v(38);
        final List v3 = lfg.v(32);
        if (!v.isEmpty()) {
            return new lgg(37, krf.c(v));
        }
        if (!v2.isEmpty()) {
            return new lgg(38, krf.c(v2));
        }
        if (!v3.isEmpty()) {
            return new lgg(32, krf.c(v3));
        }
        throw new IllegalArgumentException("No HDR+ compatible raw format supported.");
    }
    
    public static MeshWarp m(final Rect rect, final lji lji) {
        final MeshWarp meshWarp = new MeshWarp(GcamModuleJNI.new_MeshWarp(), true);
        if (jlj.l != null && jlj.j != null && jlj.k != null && (jlj.m == null || lji.d(jlj.m) == null || !(boolean)lji.d(jlj.m))) {
            final float[] array = (float[])lji.d(jlj.l);
            final int[] array2 = (int[])lji.d(jlj.j);
            final int[] array3 = (int[])lji.d(jlj.k);
            if (array != null && array2 != null && array2.length == 2 && array3 != null && array3.length == 4) {
                final int length = array.length;
                final int n = array2[0] * array2[1];
                if (length == n + n) {
                    final FloatVector v = v(array);
                    GcamModuleJNI.MeshWarp_mesh_warp_data_set(meshWarp.a, meshWarp, v.a, v);
                    GcamModuleJNI.MeshWarp_grid_cols_set(meshWarp.a, meshWarp, array2[0]);
                    GcamModuleJNI.MeshWarp_grid_rows_set(meshWarp.a, meshWarp, array2[1]);
                    final PixelRect pixelRect = new PixelRect();
                    pixelRect.b(array3[0]);
                    pixelRect.d(array3[1]);
                    pixelRect.c(array3[0] + array3[2]);
                    pixelRect.e(array3[1] + array3[3]);
                    GcamModuleJNI.MeshWarp_mesh_warp_crop_region_set(meshWarp.a, meshWarp, pixelRect.a, pixelRect);
                    njo.i(rect.isEmpty() ^ true, "Invalid physical scaler crop region: %s", rect);
                    final PixelRect pixelRect2 = new PixelRect();
                    pixelRect2.b(rect.left);
                    pixelRect2.c(rect.right);
                    pixelRect2.d(rect.top);
                    pixelRect2.e(rect.bottom);
                    GcamModuleJNI.MeshWarp_mesh_warp_dst_region_set(meshWarp.a, meshWarp, pixelRect2.a, pixelRect2);
                }
                else {
                    Log.e(ohv.c, String.format("Mesh data length (%d) and grid dimension (%dx%dx2) mismatch.", length, array2[0], array2[1]));
                }
            }
        }
        return meshWarp;
    }
    
    public static float[] o(final lfg lfg, final ljm ljm) {
        final CaptureResult$Key r = jlk.r;
        final Float n = null;
        Float n2;
        if (r != null) {
            n2 = (Float)ljm.d(jlk.r);
        }
        else {
            n2 = null;
        }
        float floatValue;
        if (n2 != null) {
            floatValue = n2;
        }
        else {
            floatValue = (float)(int)ljm.d(CaptureResult.SENSOR_SENSITIVITY);
        }
        Float value;
        if (jll.j != null) {
            value = ((float[])lfg.m(jll.j))[0];
        }
        else {
            value = null;
        }
        float floatValue2;
        if (value != null) {
            floatValue2 = value;
        }
        else {
            floatValue2 = (float)(int)((Range)lfg.o(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower();
        }
        Float n3;
        if (jll.k != null) {
            n3 = (Float)lfg.m(jll.k);
        }
        else {
            n3 = n;
        }
        float floatValue3;
        if (n3 != null) {
            floatValue3 = n3;
        }
        else {
            floatValue3 = (float)(int)lfg.o(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY);
        }
        final float n4 = 1.0f;
        float n6;
        float n7;
        if (floatValue > floatValue3) {
            final float n5 = floatValue3 / floatValue2;
            final float max = Math.max(floatValue / floatValue3, 1.0f);
            n6 = n5;
            n7 = max;
        }
        else {
            n6 = floatValue / floatValue2;
            n7 = n4;
        }
        return new float[] { n6, n7 };
    }
    
    public static StaticMetadata q(final lfg lfg) {
        final StaticMetadata staticMetadata = new StaticMetadata(GcamModuleJNI.new_StaticMetadata__SWIG_0(), true);
        GcamModuleJNI.StaticMetadata_make_set(staticMetadata.a, staticMetadata, "Google");
        GcamModuleJNI.StaticMetadata_model_set(staticMetadata.a, staticMetadata, Build.MODEL);
        GcamModuleJNI.StaticMetadata_device_set(staticMetadata.a, staticMetadata, ctgcam.getHdrModel());
        final String a = lja.a.a("ro.revision");
        if (a != null && !a.isEmpty()) {
            GcamModuleJNI.StaticMetadata_hardware_revision_set(staticMetadata.a, staticMetadata, a);
        }
        final String value = String.valueOf(GcamModuleJNI.GetVersion());
        String concat;
        if (value.length() != 0) {
            concat = "HDR+ ".concat(value);
        }
        else {
            concat = new String("HDR+ ");
        }
        GcamModuleJNI.StaticMetadata_software_set(staticMetadata.a, staticMetadata, concat);
        GcamModuleJNI.StaticMetadata_device_os_version_set(staticMetadata.a, staticMetadata, Build.FINGERPRINT);
        staticMetadata.e(s(lfg));
        GcamModuleJNI.StaticMetadata_has_flash_set(staticMetadata.a, staticMetadata, lfg.F());
        final lfu l = lfg.l();
        final lfu a2 = lfu.a;
        final int ordinal = l.ordinal();
        final int n = 0;
        int n2 = 0;
        switch (ordinal) {
            default: {
                n2 = -1;
                break;
            }
            case 2: {
                n2 = 2;
                break;
            }
            case 1: {
                n2 = 1;
                break;
            }
            case 0: {
                n2 = 0;
                break;
            }
        }
        GcamModuleJNI.StaticMetadata_lens_facing_set(staticMetadata.a, staticMetadata, n2);
        final List s = lfg.s();
        njo.e(s.isEmpty() ^ true, "Cameras must have at least one focal length.");
        final FloatVector floatVector = new FloatVector();
        final Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            floatVector.c((float)iterator.next());
        }
        GcamModuleJNI.StaticMetadata_available_focal_lengths_mm_set(staticMetadata.a, staticMetadata, floatVector.a, floatVector);
        final float[] array = (float[])lfg.o(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        njo.e(array.length > 0, "Cameras must have at least one f-number (aperture size).");
        final FloatVector v = v(array);
        GcamModuleJNI.StaticMetadata_available_f_numbers_set(staticMetadata.a, staticMetadata, v.a, v);
        GcamModuleJNI.StaticMetadata_white_level_set(staticMetadata.a, staticMetadata, (int)lfg.m(CameraCharacteristics.SENSOR_INFO_WHITE_LEVEL));
        final Rect[] array2 = (Rect[])lfg.m(CameraCharacteristics.SENSOR_OPTICAL_BLACK_REGIONS);
        if (array2 != null) {
            final PixelRectVector pixelRectVector = new PixelRectVector();
            for (final Rect rect : array2) {
                final PixelRect pixelRect = new PixelRect();
                pixelRect.b(rect.left);
                pixelRect.c(rect.right);
                pixelRect.d(rect.top);
                pixelRect.e(rect.bottom);
                pixelRectVector.a(pixelRect);
            }
            GcamModuleJNI.StaticMetadata_optically_black_regions_set(staticMetadata.a, staticMetadata, pixelRectVector.a, pixelRectVector);
        }
        final int intValue = (int)lfg.o(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
        int n3 = 0;
        switch (intValue) {
            default: {
                final String c = ohv.c;
                final StringBuilder sb = new StringBuilder(93);
                sb.append("convertToBayerPattern: unsupported color filter arrangement: ");
                sb.append(intValue);
                sb.append(", returning kInvalid.");
                Log.w(c, sb.toString());
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 0: {
                n3 = 1;
                break;
            }
        }
        GcamModuleJNI.StaticMetadata_bayer_pattern_set(staticMetadata.a, staticMetadata, n3);
        final long[] array3 = { (long)((Range)lfg.o(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getLower(), (long)((Range)lfg.o(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)).getUpper() };
        final float[] array4 = { b(array3[0]), b(array3[1]) };
        final lfu j = lfg.l();
        final lfu b = lfu.b;
        Float n4 = null;
        if (j == b) {
            final liz d = ohv.d;
            if (d.e() || d.e || d.g() || d.h() || d.h) {
                final int s2 = s(lfg);
                if (s2 != 0 && s2 != 10) {
                    if (s2 == 4 || s2 == 5 || s2 == 8) {
                        n4 = 24000.0f;
                    }
                }
                else {
                    n4 = 32000.0f;
                }
            }
        }
        if (n4 != null) {
            array4[1] = Math.max(n4, array4[0]);
        }
        GcamModuleJNI.StaticMetadata_exposure_time_range_ms_set(staticMetadata.a, staticMetadata, array4);
        final float n5 = (float)(int)((Range)lfg.o(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower();
        final float n6 = (float)(int)((Range)lfg.o(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getUpper();
        final int intValue2 = (int)lfg.o(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY);
        GcamModuleJNI.StaticMetadata_iso_range_set(staticMetadata.a, staticMetadata, new float[] { n5, n6 });
        GcamModuleJNI.StaticMetadata_max_analog_iso_set(staticMetadata.a, staticMetadata, (float)intValue2);
        final DngColorCalibrationVector dngColorCalibrationVector = new DngColorCalibrationVector();
        final Integer n7 = (Integer)lfg.m(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT1);
        if (n7 != null) {
            final float[] y = y((ColorSpaceTransform)lfg.o(CameraCharacteristics.SENSOR_COLOR_TRANSFORM1));
            final float[] y2 = y((ColorSpaceTransform)lfg.o(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1));
            final DngColorCalibration dngColorCalibration = new DngColorCalibration();
            dngColorCalibration.b(n7);
            dngColorCalibration.d(y);
            dngColorCalibration.c(y2);
            dngColorCalibrationVector.a(dngColorCalibration);
        }
        final Byte b2 = (Byte)lfg.m(CameraCharacteristics.SENSOR_REFERENCE_ILLUMINANT2);
        if (b2 != null) {
            final float[] y3 = y((ColorSpaceTransform)lfg.o(CameraCharacteristics.SENSOR_COLOR_TRANSFORM2));
            final float[] y4 = y((ColorSpaceTransform)lfg.o(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM2));
            final DngColorCalibration dngColorCalibration2 = new DngColorCalibration();
            dngColorCalibration2.b(b2);
            dngColorCalibration2.d(y3);
            dngColorCalibration2.c(y4);
            dngColorCalibrationVector.a(dngColorCalibration2);
        }
        GcamModuleJNI.StaticMetadata_dng_color_calibration_set(staticMetadata.a, staticMetadata, dngColorCalibrationVector.a, dngColorCalibrationVector);
        QcColorCalibration qcColorCalibration = new QcColorCalibration();
        try {
            if (jlh.l != null) {
                final Integer n8 = (Integer)lfg.m(jlh.l);
                if (n8 == null) {
                    Log.w(ohv.c, "The EEPROM_WB_CALIB is not available");
                    qcColorCalibration = new QcColorCalibration();
                }
                else {
                    final int intValue3 = n8;
                    String.format("EEPROM_WB_CALIB is available, found %d illuminants", intValue3);
                    if (intValue3 > 0) {
                        final float[] array5 = (float[])lfg.o(jlh.m);
                        final float[] array6 = (float[])lfg.o(jlh.n);
                        if (array5.length == intValue3 && array6.length == intValue3) {
                            final QcIlluminantVector qcIlluminantVector = new QcIlluminantVector();
                            for (int k = 0; k < intValue3; ++k) {
                                final QcColorCalibration$IlluminantData qcColorCalibration$IlluminantData = new QcColorCalibration$IlluminantData();
                                GcamModuleJNI.QcColorCalibration_IlluminantData_rg_ratio_set(qcColorCalibration$IlluminantData.a, qcColorCalibration$IlluminantData, array5[k]);
                                GcamModuleJNI.QcColorCalibration_IlluminantData_bg_ratio_set(qcColorCalibration$IlluminantData.a, qcColorCalibration$IlluminantData, array6[k]);
                                GcamModuleJNI.QcIlluminantVector_add(qcIlluminantVector.a, qcIlluminantVector, qcColorCalibration$IlluminantData.a, qcColorCalibration$IlluminantData);
                            }
                            GcamModuleJNI.QcColorCalibration_illuminant_data_set(qcColorCalibration.a, qcColorCalibration, qcIlluminantVector.a, qcIlluminantVector);
                            if (jlh.o != null) {
                                qcColorCalibration.b((float)lfg.o(jlh.o));
                            }
                            else {
                                Log.w(ohv.c, "EEPROM_WB_CALIB_GR_OVER_GB_RATIO is not available. Setting the value to 1.0f.");
                                qcColorCalibration.b(1.0f);
                            }
                        }
                        else {
                            Log.w(ohv.c, "The r/g and b/g ratio data is corrupted");
                            qcColorCalibration = new QcColorCalibration();
                        }
                    }
                    else {
                        Log.w(ohv.c, "EEPROM_WB_CALIB available, but has no calibrated illuminants");
                        qcColorCalibration = new QcColorCalibration();
                    }
                }
            }
            else {
                Log.w(ohv.c, "EEPROM_WB_CALIB is not available");
                qcColorCalibration = new QcColorCalibration();
            }
        }
        catch (final IllegalArgumentException ex) {
            Log.w(ohv.c, "EEPROM_WB keys do not exist");
            qcColorCalibration = new QcColorCalibration();
        }
        GcamModuleJNI.StaticMetadata_qc_color_calibration_set(staticMetadata.a, staticMetadata, qcColorCalibration.a, qcColorCalibration);
        final SizeF sizeF = (SizeF)lfg.o(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_set(staticMetadata.a, staticMetadata, sizeF.getWidth());
        GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_set(staticMetadata.a, staticMetadata, sizeF.getHeight());
        final Size size = (Size)lfg.o(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        GcamModuleJNI.StaticMetadata_pixel_array_width_set(staticMetadata.a, staticMetadata, size.getWidth());
        GcamModuleJNI.StaticMetadata_pixel_array_height_set(staticMetadata.a, staticMetadata, size.getHeight());
        final Rect rect2 = (Rect)lfg.o(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        final PixelRect pixelRect2 = new PixelRect();
        pixelRect2.b(rect2.left);
        pixelRect2.c(rect2.right);
        pixelRect2.d(rect2.top);
        pixelRect2.e(rect2.bottom);
        GcamModuleJNI.StaticMetadata_active_area_set(staticMetadata.a, staticMetadata, pixelRect2.a, pixelRect2);
        final lgg g = g(lfg);
        GcamModuleJNI.StaticMetadata_frame_raw_max_width_set(staticMetadata.a, staticMetadata, g.b.a);
        staticMetadata.d(g.b.b);
        GcamModuleJNI.StaticMetadata_raw_bits_per_pixel_set(staticMetadata.a, staticMetadata, ImageFormat.getBitsPerPixel(g.a));
        GcamModuleJNI.StaticMetadata_frame_readout_time_ms_set(staticMetadata.a, staticMetadata, b(d(lfg)));
        final int[] array7 = (int[])lfg.o(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        for (int length2 = array7.length, n9 = n; n9 < length2; ++n9) {
            if (array7[n9] == 1) {
                GcamModuleJNI.StaticMetadata_has_ois_set(staticMetadata.a, staticMetadata, true);
            }
        }
        return staticMetadata;
    }
    
    private static int s(final lfg lfg) {
        return c(lfg, null, null);
    }
    
    private static lfg t(final lfg lfg, final lfh lfh, final ljm ljm) {
        if (!lfg.I()) {
            return lfg;
        }
        final Set z = lfg.z();
        if (z.size() == 1) {
            return lfh.a(z.iterator().next());
        }
        final Map h = ljm.h();
        String s;
        if (h.isEmpty() && !ohv.d.d()) {
            s = ljm.e();
        }
        else if (((nqq)h).c == 1) {
            s = ((lji)Collection$_EL.stream((Collection)((nnx)h).i()).findFirst().get()).e();
        }
        else {
            s = null;
        }
        if (s != null) {
            for (final lfj lfj : z) {
                if (s.equals(lfj.a)) {
                    return lfh.a(lfj);
                }
            }
            Log.e(ohv.c, String.format("Physical camera ID not found: %s in %s", s, z));
            String concat;
            if (s.length() != 0) {
                concat = "Physical camera with matching ID not found: ".concat(s);
            }
            else {
                concat = new String("Physical camera with matching ID not found: ");
            }
            throw new IllegalArgumentException(concat);
        }
        final Map h2 = ljm.h();
        Float n;
        if (((nqq)h2).c == 1) {
            n = (Float)((lji)Collection$_EL.stream((Collection)((nnx)h2).i()).findFirst().get()).d(CaptureResult.LENS_FOCAL_LENGTH);
        }
        else {
            n = (Float)ljm.d(CaptureResult.LENS_FOCAL_LENGTH);
        }
        n.getClass();
        final Iterator iterator2 = z.iterator();
        while (iterator2.hasNext()) {
            final lfg a = lfh.a((lfj)iterator2.next());
            final List s2 = a.s();
            njo.e(s2.size() == 1, "Physical cameras must have single focal length.");
            if (n == (float)s2.get(0)) {
                return a;
            }
        }
        throw new IllegalArgumentException("Physical camera with matching focal length not found.");
    }
    
    private static ljm u(final ljm ljm, String s) {
        final Map h = ljm.h();
        ljm ljm2 = ljm;
        if (!h.isEmpty()) {
            final lji lji = h.get(s);
            if (lji == null) {
                final String c = ohv.c;
                s = String.valueOf(s);
                if (s.length() != 0) {
                    s = "Physical metadata is null for images from camera ".concat(s);
                }
                else {
                    s = new String("Physical metadata is null for images from camera ");
                }
                Log.w(c, s);
                return ljm;
            }
            ljm2 = new ljl(lji);
        }
        return ljm2;
    }
    
    private static FloatVector v(final float[] array) {
        final FloatVector floatVector = new FloatVector();
        BufferUtils.setFloatVectorImpl(array, floatVector.a);
        return floatVector;
    }
    
    private static void w(final MeteringRectangle[] array, final boolean b, final WeightedPixelRectVector weightedPixelRectVector) {
        if (array != null) {
            for (final MeteringRectangle meteringRectangle : array) {
                if (b || meteringRectangle.getMeteringWeight() != 0) {
                    final WeightedPixelRect weightedPixelRect = new WeightedPixelRect();
                    final Rect rect = meteringRectangle.getRect();
                    final long weightedPixelRect_rect_get = GcamModuleJNI.WeightedPixelRect_rect_get(weightedPixelRect.a, weightedPixelRect);
                    PixelRect pixelRect;
                    if (weightedPixelRect_rect_get == 0L) {
                        pixelRect = null;
                    }
                    else {
                        pixelRect = new PixelRect(weightedPixelRect_rect_get, false);
                    }
                    pixelRect.b(rect.left);
                    pixelRect.c(rect.right);
                    pixelRect.d(rect.top);
                    pixelRect.e(rect.bottom);
                    GcamModuleJNI.WeightedPixelRect_weight_set(weightedPixelRect.a, weightedPixelRect, (float)meteringRectangle.getMeteringWeight());
                    GcamModuleJNI.WeightedPixelRectVector_add(weightedPixelRectVector.a, weightedPixelRectVector, weightedPixelRect.a, weightedPixelRect);
                }
            }
        }
    }
    
    private static boolean x(final lji lji) {
        final liz d = ohv.d;
        if (d.e() || d.g() || d.h || d.h()) {
            Integer value;
            if (lji == null) {
                value = -1;
            }
            else {
                value = (Integer)lji.d(CaptureResult.CONTROL_SCENE_MODE);
            }
            if (value == 3) {
                return true;
            }
        }
        return false;
    }
    
    private static float[] y(final ColorSpaceTransform colorSpaceTransform) {
        final Rational[] array = new Rational[9];
        int i = 0;
        colorSpaceTransform.copyElements(array, 0);
        final float[] array2 = new float[9];
        while (i < 9) {
            array2[i] = array[i].floatValue();
            ++i;
        }
        return array2;
    }
    
    private static int[] z(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("CameraCharacteristics: unsupported colorFilterArrangment");
            }
            case 2:
            case 3: {
                return new int[] { 0, 2, 1, 3 };
            }
            case 0:
            case 1: {
                return new int[] { 0, 1, 2, 3 };
            }
        }
    }
    
    public final float a(final int n) {
        final Rational rational = (Rational)this.a.o(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        return new Rational(n * rational.getNumerator(), rational.getDenominator()).floatValue();
    }
    
    public final long e(final ljm ljm) {
        return d(this.f(ljm));
    }
    
    public final lfg f(final ljm ljm) {
        return t(this.a, this.b, ljm);
    }
    
    public final AwbInfo h(final ljm ljm) {
        final AwbInfo awbInfo = new AwbInfo(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
        final int[] z = z((int)this.f(ljm).o(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT));
        final float[] array = new float[4];
        final RggbChannelVector rggbChannelVector = (RggbChannelVector)ljm.d(CaptureResult.COLOR_CORRECTION_GAINS);
        if (rggbChannelVector == null) {
            Log.w(ohv.c, "CaptureResult missing COLOR_CORRECTION_GAINS.");
            Arrays.fill(array, 1.0f);
        }
        else {
            for (int i = 0; i < 4; ++i) {
                array[i] = rggbChannelVector.getComponent(z[i]);
            }
        }
        GcamModuleJNI.AwbInfo_gains_set(awbInfo.a, awbInfo, array);
        final ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform)ljm.d(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        float[] y;
        if (colorSpaceTransform == null) {
            Log.w(ohv.c, "CaptureResult missing COLOR_CORRECTION_TRANSFORM.");
            final float[] array2;
            y = (array2 = new float[9]);
            array2[0] = 1.0f;
            array2[1] = 0.0f;
            array2[3] = (array2[2] = 0.0f);
            array2[4] = 1.0f;
            array2[5] = 0.0f;
            array2[7] = (array2[6] = 0.0f);
            array2[8] = 1.0f;
        }
        else {
            y = y(colorSpaceTransform);
        }
        GcamModuleJNI.AwbInfo_rgb2rgb_set(awbInfo.a, awbInfo, y);
        return awbInfo;
    }
    
    public final FrameMetadata i(final ljm ljm) {
        return this.j(ljm, null);
    }
    
    public final FrameMetadata j(final ljm ljm, final GyroSampleVector gyroSampleVector) {
        return this.k(ljm, gyroSampleVector, null);
    }
    
    public final FrameMetadata k(final ljm ex, final GyroSampleVector gyroSampleVector, final Map map) {
        final FrameMetadata frameMetadata = new FrameMetadata();
        try {
            final lfg f = this.f((ljm)ex);
            final ljm u = u((ljm)ex, f.j().a);
            final ohu ohu = new ohu(u);
            final long frameMetadata_faces_get = GcamModuleJNI.FrameMetadata_faces_get(frameMetadata.a, frameMetadata);
            FaceInfoVector faceInfoVector;
            if (frameMetadata_faces_get == 0L) {
                faceInfoVector = null;
            }
            else {
                faceInfoVector = new FaceInfoVector(frameMetadata_faces_get);
            }
            final Rect rect = (Rect)f.o(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
            final int width = rect.width();
            final int height = rect.height();
            final Face[] a = ohu.a;
        Label_0133_Outer:
            while (true) {
                if (a == null) {
                    final lfg lfg = f;
                    break Label_0864;
                }
                int n = 0;
                int n2 = 0;
                lfg lfg;
                Face face;
                Rect bounds;
                float exactCenterX;
                float n3;
                float n4;
                float exactCenterY;
                float n5;
                float n6;
                float n7;
                float n8;
                float n9;
                FaceInfo faceInfo;
                Face[] a2;
                int length;
                int[] b;
                float[] d;
                byte[] c;
                int n10;
                int n11;
                FaceInfo$Landmark faceInfo$Landmark;
                int n12;
                int n13;
                int n14;
                lfu a3;
                int n15;
                Point point = null;
                FaceInfo$Landmark faceInfo$Landmark2;
                Float n16;
                MeteringRectangle[] array;
                WeightedPixelRectVector weightedPixelRectVector;
                AwbMetadata e;
                long awbMetadata_metering_rectangles_get;
                long aeMetadata_metering_rectangles_get;
                MeteringRectangle[] array2;
                WeightedPixelRectVector weightedPixelRectVector2;
                Rect rect2;
                MeshWarp m;
                Integer n17;
                RuntimeException ex2;
                lfg lfg2;
                GeometricCalibrationVector geometricCalibrationVector;
                float[] array3;
                float[] array4;
                float[] array5;
                float[] array6;
                float[] array7;
                OisPositionVector oisPositionVector;
                Optional optional;
                GeometricCalibration geometricCalibration;
                Long n18;
                float[] array8;
                OisMetadata oisMetadata;
                Integer n19;
                Long n20;
                long oisMetadata_ois_positions_get;
                MeteringRectangle[] array9;
                WeightedPixelRectVector weightedPixelRectVector3;
                AfMetadata d2;
                long afMetadata_metering_rectangles_get;
                float[] array10;
                OisSample[] array11;
                int n21;
                OisSample oisSample;
                OisPosition oisPosition;
                int length2;
                float[] o;
                Integer n22;
                int intValue;
                AwbInfo h;
                Boolean value;
                SceneFlicker sceneFlicker;
                CaptureResult$Key f2;
                float n23;
                Integer n24;
                float n25;
                Integer n26;
                Integer n27;
                Pair[] array12;
                FloatVector floatVector;
                FloatVector floatVector2;
                NoiseModel noiseModel;
                float[] array13;
                BlackLevelPattern blackLevelPattern;
                float[] array14;
                Float n28;
                Integer n29;
                Float n30;
                Float n31;
                LiveHdrMetadata liveHdrMetadata;
                AeResults aeResults;
                float[] array15;
                liz d3;
                float[] array16;
                int length3;
                AeModeResult aeModeResult;
                AeModeResult aeModeResult2;
                AeModeResult aeModeResult3;
                int l;
                long a4;
                long[] array17;
                AeMetadata c2;
                Integer n32;
                AwbMetadata e2;
                AfMetadata d4;
                Integer n33;
                byte[] array18;
                ByteBuffer order;
                IspAwbMetadata ispAwbMetadata;
                float[] array19;
                AeMetadata c3;
                float[] array20;
                float[] array21;
                float[] array22;
                int[] array23;
                int[] array24;
                GeometricCalibration geometricCalibration2;
                float[] geometricCalibration_lens_distortion_get;
                float[] geometricCalibration_lens_distortion_extended_get;
                float[] geometricCalibration_lens_intrinsic_calibration_get;
                Label_0997_Outer:Label_1099_Outer:Label_1498_Outer:Block_31_Outer:Label_1322_Outer:Block_50_Outer:
                while (true) {
                    Label_0861: {
                        if (n >= a.length) {
                            break Label_0861;
                        }
                        face = a[n];
                        try {
                            bounds = face.getBounds();
                            exactCenterX = bounds.exactCenterX();
                            n3 = (float)width;
                            n4 = exactCenterX / n3;
                            exactCenterY = bounds.exactCenterY();
                            n5 = (float)height;
                            n6 = exactCenterY / n5;
                            n7 = (bounds.width() + bounds.height()) / 2.0f;
                            if (width > height) {
                                n8 = n7 / n3;
                            }
                            else {
                                n8 = n7 / n5;
                            }
                            n9 = (face.getScore() - 1) / 99.0f;
                            if (n4 >= 0.0f && n4 <= 1.0f && n6 >= 0.0f && n6 <= 1.0f && n8 >= 0.0f && n8 <= 1.0f && n9 >= 0.0f && n9 <= 1.0f) {
                                faceInfo = new FaceInfo();
                                GcamModuleJNI.FaceInfo_pos_x_set(faceInfo.a, faceInfo, n4);
                                GcamModuleJNI.FaceInfo_pos_y_set(faceInfo.a, faceInfo, n6);
                                GcamModuleJNI.FaceInfo_size_set(faceInfo.a, faceInfo, n8);
                                GcamModuleJNI.FaceInfo_confidence_set(faceInfo.a, faceInfo, n9);
                                a2 = ohu.a;
                                Label_0716: {
                                    if (a2 != null) {
                                        length = a2.length;
                                        if (length > 0) {
                                            b = ohu.b;
                                            if (b != null && b.length == length) {
                                                d = ohu.d;
                                                c = ohu.c;
                                                if (d != null && c != null) {
                                                    n10 = 0;
                                                    while (true) {
                                                        n11 = b[n];
                                                        if (n10 >= n11) {
                                                            break;
                                                        }
                                                        faceInfo$Landmark = new FaceInfo$Landmark();
                                                        n12 = n2 + n10;
                                                        n13 = n12 + n12;
                                                        faceInfo$Landmark.b(d[n13] / n3);
                                                        faceInfo$Landmark.c(d[n13 + 1] / n5);
                                                        faceInfo.a().b(c[n12], faceInfo$Landmark);
                                                        ++n10;
                                                    }
                                                    n2 += n11;
                                                }
                                                break Label_0716;
                                            }
                                        }
                                    }
                                    for (int i = 0; i < 3; ++i) {
                                        n14 = (new int[] { 1, 2, 46 })[i];
                                        a3 = lfu.a;
                                        n15 = n14 - 1;
                                        if (n14 == 0) {
                                            throw null;
                                        }
                                        switch (n15) {
                                            default: {
                                                point = null;
                                                break;
                                            }
                                            case 45: {
                                                point = face.getMouthPosition();
                                                break;
                                            }
                                            case 1: {
                                                point = face.getRightEyePosition();
                                                break;
                                            }
                                            case 0: {
                                                point = face.getLeftEyePosition();
                                                break;
                                            }
                                        }
                                        if (point != null) {
                                            faceInfo$Landmark2 = new FaceInfo$Landmark();
                                            faceInfo$Landmark2.b(point.x / n3);
                                            faceInfo$Landmark2.c(point.y / n5);
                                            faceInfo.a().b(n15, faceInfo$Landmark2);
                                        }
                                    }
                                }
                                if (map != null) {
                                    n16 = map.get(face.getId());
                                    if (n16 != null) {
                                        GcamModuleJNI.FaceInfo_familiarity_set(faceInfo.a, faceInfo, n16);
                                    }
                                }
                                GcamModuleJNI.FaceInfoVector_add(faceInfoVector.a, faceInfoVector, faceInfo.a, faceInfo);
                            }
                            else {
                                Log.w(ohv.c, String.format("Face data is bad: (%d, %d) - (%d, %d), score %d", bounds.left, bounds.top, bounds.right, bounds.bottom, face.getScore()));
                            }
                            ++n;
                            continue Label_0997_Outer;
                            while (true) {
                            Label_1731:
                                while (true) {
                                    Label_1457:Label_1695_Outer:Label_2135_Outer:
                                    while (true) {
                                        Label_2135:Label_1238_Outer:Label_1772_Outer:
                                        while (true) {
                                        Block_61:
                                            while (true) {
                                            Label_1765:
                                                while (true) {
                                                    Label_1677_Outer:Block_51_Outer:
                                                    while (true) {
                                                        Label_1721: {
                                                            while (true) {
                                                                Label_1748: {
                                                                    Block_56: {
                                                                        while (true) {
                                                                        Block_44:
                                                                            while (true) {
                                                                                Block_41: {
                                                                                    while (true) {
                                                                                        Label_1322:Label_1330_Outer:
                                                                                        while (true) {
                                                                                        Label_1330:
                                                                                            while (true) {
                                                                                            Label_1048:
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        Label_0909: {
                                                                                                            while (true) {
                                                                                                                Block_43: {
                                                                                                                    Block_32: {
                                                                                                                        while (true) {
                                                                                                                            while (true) {
                                                                                                                                Block_40: {
                                                                                                                                Label_1629:
                                                                                                                                    while (true) {
                                                                                                                                        while (true) {
                                                                                                                                            w(array, false, weightedPixelRectVector);
                                                                                                                                            e = frameMetadata.e();
                                                                                                                                            awbMetadata_metering_rectangles_get = GcamModuleJNI.AwbMetadata_metering_rectangles_get(e.a, e);
                                                                                                                                            iftrue(Label_1037:)(awbMetadata_metering_rectangles_get != 0L);
                                                                                                                                            break Block_32;
                                                                                                                                            Label_0986: {
                                                                                                                                                weightedPixelRectVector = new WeightedPixelRectVector(aeMetadata_metering_rectangles_get);
                                                                                                                                            }
                                                                                                                                            continue Label_1099_Outer;
                                                                                                                                            w(array2, true, weightedPixelRectVector2);
                                                                                                                                            rect2 = (Rect)u.d(CaptureResult.SCALER_CROP_REGION);
                                                                                                                                            rect2.getClass();
                                                                                                                                            m = m(rect2, (lji)ex);
                                                                                                                                            GcamModuleJNI.FrameMetadata_mesh_warp_set(frameMetadata.a, frameMetadata, m.a, m);
                                                                                                                                            n17 = (Integer)((lji)ex).d(CaptureResult.STATISTICS_OIS_DATA_MODE);
                                                                                                                                            iftrue(Label_1452:)(n17 == null || n17 == 0);
                                                                                                                                            break Label_1677_Outer;
                                                                                                                                            ex2 = ex;
                                                                                                                                            lfg2 = lfg;
                                                                                                                                            njo.e(lfg2.I() ^ true, "Logical cameras not supported.");
                                                                                                                                            geometricCalibrationVector = new GeometricCalibrationVector(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), true);
                                                                                                                                            array3 = (float[])((lji)ex2).d(CaptureResult.LENS_DISTORTION);
                                                                                                                                            array4 = (float[])((lji)ex2).d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
                                                                                                                                            array5 = (float[])((lji)ex2).d(CaptureResult.LENS_POSE_ROTATION);
                                                                                                                                            array6 = (float[])((lji)ex2).d(CaptureResult.LENS_POSE_TRANSLATION);
                                                                                                                                            iftrue(Label_1607:)((array7 = array3) != null);
                                                                                                                                            break Block_41;
                                                                                                                                            weightedPixelRectVector = null;
                                                                                                                                            continue Label_1099_Outer;
                                                                                                                                        }
                                                                                                                                        while (true) {
                                                                                                                                            while (true) {
                                                                                                                                                oisPositionVector = null;
                                                                                                                                                break Label_1322;
                                                                                                                                                Label_1444: {
                                                                                                                                                    optional = Optional.empty();
                                                                                                                                                }
                                                                                                                                                break Label_1457;
                                                                                                                                                while (true) {
                                                                                                                                                    geometricCalibration.b(array7);
                                                                                                                                                    break Label_1721;
                                                                                                                                                    geometricCalibration = new GeometricCalibration();
                                                                                                                                                    geometricCalibration.d(0);
                                                                                                                                                    iftrue(Label_1721:)(array7 == null);
                                                                                                                                                    continue Label_1695_Outer;
                                                                                                                                                }
                                                                                                                                                Label_2132:
                                                                                                                                                break Label_2135;
                                                                                                                                                GcamModuleJNI.FrameMetadata_timestamp_faces_ns_set(frameMetadata.a, frameMetadata, n18);
                                                                                                                                                break Label_0909;
                                                                                                                                                GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(geometricCalibration.a, geometricCalibration, array8);
                                                                                                                                                break Label_1748;
                                                                                                                                                iftrue(Label_0909:)(jlk.e == null);
                                                                                                                                                break Label_1457;
                                                                                                                                                weightedPixelRectVector2 = null;
                                                                                                                                                continue Label_1498_Outer;
                                                                                                                                                oisMetadata = new OisMetadata();
                                                                                                                                                GcamModuleJNI.OisMetadata_lens_optical_stabilization_mode_set(oisMetadata.a, oisMetadata, n19);
                                                                                                                                                GcamModuleJNI.OisMetadata_timestamp_ois_clock_ns_set(oisMetadata.a, oisMetadata, n20);
                                                                                                                                                oisMetadata_ois_positions_get = GcamModuleJNI.OisMetadata_ois_positions_get(oisMetadata.a, oisMetadata);
                                                                                                                                                iftrue(Label_1311:)(oisMetadata_ois_positions_get != 0L);
                                                                                                                                                continue Label_1322_Outer;
                                                                                                                                            }
                                                                                                                                            w(array9, false, weightedPixelRectVector3);
                                                                                                                                            d2 = frameMetadata.d();
                                                                                                                                            afMetadata_metering_rectangles_get = GcamModuleJNI.AfMetadata_metering_rectangles_get(d2.a, d2);
                                                                                                                                            iftrue(Label_1088:)(afMetadata_metering_rectangles_get != 0L);
                                                                                                                                            continue Label_1238_Outer;
                                                                                                                                        }
                                                                                                                                        array10 = (float[])lfg2.m(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION);
                                                                                                                                        break Label_1629;
                                                                                                                                        iftrue(Label_2135:)(jli.b == null || jli.c == null || jli.d == null || jli.e == null || jli.f == null);
                                                                                                                                        break Block_56;
                                                                                                                                        optional.ifPresent((Consumer)new oht(frameMetadata));
                                                                                                                                        iftrue(Label_1498:)(gyroSampleVector == null);
                                                                                                                                        break Block_40;
                                                                                                                                        Label_1088: {
                                                                                                                                            weightedPixelRectVector2 = new WeightedPixelRectVector(afMetadata_metering_rectangles_get);
                                                                                                                                        }
                                                                                                                                        continue Label_1498_Outer;
                                                                                                                                    }
                                                                                                                                    iftrue(Label_1653:)((array8 = array5) != null);
                                                                                                                                    break Block_43;
                                                                                                                                    oisSample = array11[n21];
                                                                                                                                    oisPosition = new OisPosition();
                                                                                                                                    GcamModuleJNI.OisPosition_timestamp_ns_set(oisPosition.a, oisPosition, oisSample.getTimestamp());
                                                                                                                                    GcamModuleJNI.OisPosition_shift_pixel_x_set(oisPosition.a, oisPosition, oisSample.getXshift());
                                                                                                                                    GcamModuleJNI.OisPosition_shift_pixel_y_set(oisPosition.a, oisPosition, oisSample.getYshift());
                                                                                                                                    GcamModuleJNI.OisPositionVector_add(oisPositionVector.a, oisPositionVector, oisPosition.a, oisPosition);
                                                                                                                                    ++n21;
                                                                                                                                    break Label_1330;
                                                                                                                                }
                                                                                                                                GcamModuleJNI.FrameMetadata_gyro_samples_set(frameMetadata.a, frameMetadata, gyroSampleVector.a, gyroSampleVector);
                                                                                                                                continue Block_31_Outer;
                                                                                                                            }
                                                                                                                            iftrue(Label_1434:)(n21 >= length2);
                                                                                                                            continue Label_1330_Outer;
                                                                                                                        }
                                                                                                                        geometricCalibration.c(array10);
                                                                                                                        break Label_1731;
                                                                                                                    }
                                                                                                                    weightedPixelRectVector3 = null;
                                                                                                                    continue Label_1048;
                                                                                                                    GcamModuleJNI.FrameMetadata_geometric_calibration_set(frameMetadata.a, frameMetadata, geometricCalibrationVector.a, geometricCalibrationVector);
                                                                                                                    try {
                                                                                                                        GcamModuleJNI.FrameMetadata_sensor_id_set(frameMetadata.a, frameMetadata, c(lfg2, this.b, (ljm)ex));
                                                                                                                        GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_set(frameMetadata.a, frameMetadata, b((long)((lji)ex).d(CaptureResult.SENSOR_EXPOSURE_TIME)));
                                                                                                                        o = o(lfg2, (ljm)ex);
                                                                                                                        GcamModuleJNI.FrameMetadata_actual_analog_gain_set(frameMetadata.a, frameMetadata, o[0]);
                                                                                                                        GcamModuleJNI.FrameMetadata_applied_digital_gain_set(frameMetadata.a, frameMetadata, o[1]);
                                                                                                                        n22 = (Integer)((lji)ex).d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                                                                                                                        if (n22 != null) {
                                                                                                                            GcamModuleJNI.FrameMetadata_post_raw_digital_gain_set(frameMetadata.a, frameMetadata, n22 / 100.0f);
                                                                                                                        }
                                                                                                                        intValue = (int)((lji)ex).d(CaptureResult.FLASH_MODE);
                                                                                                                        if (intValue != 1 && intValue != 2) {
                                                                                                                            frameMetadata.i(0);
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            frameMetadata.i(1);
                                                                                                                        }
                                                                                                                        h = this.h((ljm)ex);
                                                                                                                        GcamModuleJNI.FrameMetadata_wb_set(frameMetadata.a, frameMetadata, AwbInfo.a(h), h);
                                                                                                                        if ((value = (Boolean)((lji)ex).d(CaptureResult.BLACK_LEVEL_LOCK)) == null) {
                                                                                                                            value = false;
                                                                                                                        }
                                                                                                                        GcamModuleJNI.FrameMetadata_was_black_level_locked_set(frameMetadata.a, frameMetadata, value);
                                                                                                                        GcamModuleJNI.FrameMetadata_timestamp_ns_set(frameMetadata.a, frameMetadata, (long)((lji)ex).d(CaptureResult.SENSOR_TIMESTAMP));
                                                                                                                        GcamModuleJNI.FrameMetadata_sensor_temp_set(frameMetadata.a, frameMetadata, GcamModuleJNI.kSensorTempUnknown_get());
                                                                                                                        sceneFlicker = new SceneFlicker();
                                                                                                                        f2 = jlk.f;
                                                                                                                        n23 = -1.0f;
                                                                                                                        Label_2498: {
                                                                                                                            if (f2 != null) {
                                                                                                                                n24 = (Integer)((lji)ex).d(jlk.f);
                                                                                                                                if (n24 != null) {
                                                                                                                                    n25 = n24;
                                                                                                                                    break Label_2498;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n25 = -1.0f;
                                                                                                                        }
                                                                                                                        if (jlk.g != null) {
                                                                                                                            n26 = (Integer)((lji)ex).d(jlk.g);
                                                                                                                            if (n26 != null) {
                                                                                                                                n23 = n26 / 10000.0f;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        Label_2644: {
                                                                                                                            if (n25 < 0.0f || n23 < 0.0f) {
                                                                                                                                n27 = (Integer)((lji)ex).d(CaptureResult.STATISTICS_SCENE_FLICKER);
                                                                                                                                if (n27 != null) {
                                                                                                                                    switch (n27) {
                                                                                                                                        default: {
                                                                                                                                            Log.e(ohv.c, "Unexpected STATISTICS_SCENE_FLICKER type!");
                                                                                                                                            break Label_2644;
                                                                                                                                        }
                                                                                                                                        case 2: {
                                                                                                                                            n25 = 120.0f;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        case 1: {
                                                                                                                                            n25 = 100.0f;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        case 0: {
                                                                                                                                            n25 = 0.0f;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    n23 = 1.0f;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        GcamModuleJNI.SceneFlicker_frequency_set(sceneFlicker.a, sceneFlicker, n25);
                                                                                                                        GcamModuleJNI.SceneFlicker_confidence_set(sceneFlicker.a, sceneFlicker, n23);
                                                                                                                        GcamModuleJNI.FrameMetadata_scene_flicker_set(frameMetadata.a, frameMetadata, sceneFlicker.a, sceneFlicker);
                                                                                                                        array12 = (Pair[])((lji)ex).d(CaptureResult.SENSOR_NOISE_PROFILE);
                                                                                                                        floatVector = new FloatVector();
                                                                                                                        floatVector2 = new FloatVector();
                                                                                                                        for (int j = 0; j < 4; ++j) {
                                                                                                                            floatVector.c(((Double)array12[j].first).floatValue());
                                                                                                                            floatVector2.c(((Double)array12[j].second).floatValue());
                                                                                                                        }
                                                                                                                        noiseModel = new NoiseModel(GcamModuleJNI.NoiseModel_FromShotReadNoise__SWIG_0(floatVector.a, floatVector, floatVector2.a, floatVector2));
                                                                                                                        GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(frameMetadata.a, frameMetadata, noiseModel.a, noiseModel);
                                                                                                                        array13 = (float[])((lji)ex).d(CaptureResult.SENSOR_DYNAMIC_BLACK_LEVEL);
                                                                                                                        if (array13 != null) {
                                                                                                                            frameMetadata.h(array13);
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            blackLevelPattern = (BlackLevelPattern)lfg2.m(CameraCharacteristics.SENSOR_BLACK_LEVEL_PATTERN);
                                                                                                                            if (blackLevelPattern != null) {
                                                                                                                                array14 = new float[4];
                                                                                                                                for (int k = 0; k < 4; ++k) {
                                                                                                                                    array14[k] = (float)blackLevelPattern.getOffsetForIndex(k % 2, k / 2);
                                                                                                                                }
                                                                                                                                frameMetadata.h(array14);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n28 = (Float)((lji)ex).d(CaptureResult.LENS_FOCUS_DISTANCE);
                                                                                                                        n29 = (Integer)lfg2.m(CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION);
                                                                                                                        if (n28 != null && n29 != null && (n29 == 2 || n29 == 1)) {
                                                                                                                            GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(frameMetadata.a, frameMetadata, n28);
                                                                                                                        }
                                                                                                                        n30 = (Float)((lji)ex).d(CaptureResult.LENS_FOCAL_LENGTH);
                                                                                                                        if (n30 != null) {
                                                                                                                            GcamModuleJNI.FrameMetadata_focal_length_mm_set(frameMetadata.a, frameMetadata, n30);
                                                                                                                        }
                                                                                                                        n31 = (Float)((lji)ex).d(CaptureResult.LENS_APERTURE);
                                                                                                                        if (n31 != null) {
                                                                                                                            GcamModuleJNI.FrameMetadata_f_number_set(frameMetadata.a, frameMetadata, n31);
                                                                                                                        }
                                                                                                                        liveHdrMetadata = new LiveHdrMetadata(GcamModuleJNI.new_LiveHdrMetadata(), true);
                                                                                                                        aeResults = new AeResults(GcamModuleJNI.new_AeResults(), true);
                                                                                                                        if (jlj.d != null) {
                                                                                                                            array15 = (float[])((lji)ex).d(jlj.d);
                                                                                                                            if (array15 != null && array15.length > 0) {
                                                                                                                                GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(liveHdrMetadata.a, liveHdrMetadata, array15[0]);
                                                                                                                                liveHdrMetadata.c(array15[1]);
                                                                                                                                liveHdrMetadata.b(array15[2]);
                                                                                                                                d3 = ohv.d;
                                                                                                                                if (d3.g() || d3.h() || d3.h) {
                                                                                                                                    GcamModuleJNI.LiveHdrMetadata_night_factor_set(liveHdrMetadata.a, liveHdrMetadata, array15[3]);
                                                                                                                                }
                                                                                                                                GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(liveHdrMetadata.a, liveHdrMetadata, array15[4]);
                                                                                                                                GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(liveHdrMetadata.a, liveHdrMetadata, array15[5]);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (jlj.b != null) {
                                                                                                                            array16 = (float[])((lji)ex).d(jlj.b);
                                                                                                                            if (array16 != null) {
                                                                                                                                length3 = array16.length;
                                                                                                                                if (length3 > 0) {
                                                                                                                                    aeModeResult = new AeModeResult();
                                                                                                                                    aeModeResult2 = new AeModeResult();
                                                                                                                                    aeModeResult.d(array16[0]);
                                                                                                                                    aeModeResult2.d(array16[1]);
                                                                                                                                    aeModeResult.c(array16[2]);
                                                                                                                                    aeModeResult2.c(array16[3]);
                                                                                                                                    GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(aeResults.a, aeResults, array16[4]);
                                                                                                                                    GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(aeResults.a, aeResults, array16[5]);
                                                                                                                                    GcamModuleJNI.AeModeResult_log_scene_brightness_set(aeModeResult.a, aeModeResult, array16[6]);
                                                                                                                                    GcamModuleJNI.AeResults_predicted_image_brightness_set(aeResults.a, aeResults, array16[7]);
                                                                                                                                    GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(liveHdrMetadata.a, liveHdrMetadata, array16[8]);
                                                                                                                                    GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(liveHdrMetadata.a, liveHdrMetadata, array16[9]);
                                                                                                                                    GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(liveHdrMetadata.a, liveHdrMetadata, array16[10]);
                                                                                                                                    liveHdrMetadata.f(array16[11]);
                                                                                                                                    liveHdrMetadata.d(array16[12]);
                                                                                                                                    if (length3 > 13) {
                                                                                                                                        GcamModuleJNI.AeResults_safe_underexposure_set(aeResults.a, aeResults, array16[13]);
                                                                                                                                    }
                                                                                                                                    if (length3 > 15) {
                                                                                                                                        aeModeResult3 = new AeModeResult();
                                                                                                                                        aeModeResult3.d(array16[14]);
                                                                                                                                        aeModeResult3.c(array16[15]);
                                                                                                                                        GcamModuleJNI.AeResults_portrait_result_set(aeResults.a, aeResults, AeModeResult.a(aeModeResult3), aeModeResult3);
                                                                                                                                        if (length3 > 16) {
                                                                                                                                            liveHdrMetadata.e(array16[16]);
                                                                                                                                        }
                                                                                                                                        else {
                                                                                                                                            liveHdrMetadata.e(array16[15]);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    l = 0;
                                                                                                                                    a4 = aeResults.a;
                                                                                                                                    array17 = new long[2];
                                                                                                                                    while (l < 2) {
                                                                                                                                        array17[l] = AeModeResult.a((new AeModeResult[] { aeModeResult, aeModeResult2 })[l]);
                                                                                                                                        ++l;
                                                                                                                                    }
                                                                                                                                    GcamModuleJNI.AeResults_mode_result_set(a4, aeResults, array17);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        GcamModuleJNI.FrameMetadata_live_hdr_set(frameMetadata.a, frameMetadata, liveHdrMetadata.a, liveHdrMetadata);
                                                                                                                        GcamModuleJNI.FrameMetadata_ae_results_set(frameMetadata.a, frameMetadata, AeResults.b(aeResults), aeResults);
                                                                                                                        GcamModuleJNI.FrameMetadata_control_mode_set(frameMetadata.a, frameMetadata, (int)((lji)ex).d(CaptureResult.CONTROL_MODE));
                                                                                                                        c2 = frameMetadata.c();
                                                                                                                        GcamModuleJNI.AeMetadata_mode_set(c2.a, c2, (int)((lji)ex).d(CaptureResult.CONTROL_AE_MODE));
                                                                                                                        GcamModuleJNI.AeMetadata_lock_set(c2.a, c2, (boolean)((lji)ex).d(CaptureResult.CONTROL_AE_LOCK));
                                                                                                                        GcamModuleJNI.AeMetadata_state_set(c2.a, c2, (int)((lji)ex).d(CaptureResult.CONTROL_AE_STATE));
                                                                                                                        n32 = (Integer)((lji)ex).d(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
                                                                                                                        if (n32 != null) {
                                                                                                                            GcamModuleJNI.AeMetadata_precapture_trigger_set(c2.a, c2, n32);
                                                                                                                        }
                                                                                                                        GcamModuleJNI.AeMetadata_exposure_compensation_set(c2.a, c2, this.a((int)((lji)ex).d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION)));
                                                                                                                        e2 = frameMetadata.e();
                                                                                                                        GcamModuleJNI.AwbMetadata_mode_set(e2.a, e2, (int)((lji)ex).d(CaptureResult.CONTROL_AWB_MODE));
                                                                                                                        GcamModuleJNI.AwbMetadata_lock_set(e2.a, e2, (boolean)((lji)ex).d(CaptureResult.CONTROL_AWB_LOCK));
                                                                                                                        GcamModuleJNI.AwbMetadata_state_set(e2.a, e2, (int)((lji)ex).d(CaptureResult.CONTROL_AWB_STATE));
                                                                                                                        d4 = frameMetadata.d();
                                                                                                                        GcamModuleJNI.AfMetadata_mode_set(d4.a, d4, (int)((lji)ex).d(CaptureResult.CONTROL_AF_MODE));
                                                                                                                        GcamModuleJNI.AfMetadata_state_set(d4.a, d4, (int)((lji)ex).d(CaptureResult.CONTROL_AF_STATE));
                                                                                                                        GcamModuleJNI.AfMetadata_trigger_set(d4.a, d4, (int)((lji)ex).d(CaptureResult.CONTROL_AF_TRIGGER));
                                                                                                                        n33 = (Integer)((lji)ex).d(CaptureResult.LENS_STATE);
                                                                                                                        if (n33 != null) {
                                                                                                                            GcamModuleJNI.FrameMetadata_lens_state_set(frameMetadata.a, frameMetadata, n33);
                                                                                                                        }
                                                                                                                        if (jlh.i != null) {
                                                                                                                            GcamModuleJNI.FrameMetadata_exposure_time_boost_set(frameMetadata.a, frameMetadata, (float)((lji)ex).d(jlh.i));
                                                                                                                        }
                                                                                                                        if (jli.t != null) {
                                                                                                                            try {
                                                                                                                                array18 = (byte[])((lji)ex).d(jli.t);
                                                                                                                                if (array18 != null) {
                                                                                                                                    order = ByteBuffer.allocateDirect(array18.length).order(ByteOrder.nativeOrder());
                                                                                                                                    order.put(array18);
                                                                                                                                    ispAwbMetadata = new IspAwbMetadata(GcamModuleJNI.DeserializeFromBytes(ogn.a(new ogn(BufferUtils.a(order))), order.capacity()));
                                                                                                                                    GcamModuleJNI.FrameMetadata_isp_metadata_set(frameMetadata.a, frameMetadata, ispAwbMetadata.a, ispAwbMetadata);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            catch (final RuntimeException ex3) {
                                                                                                                                Log.e(ohv.c, "Error retrieving EXPERIMENTAL_BGSTATS_AWB", (Throwable)ex3);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (frameMetadata.a() == 7 || frameMetadata.a() == 9) {
                                                                                                                            GcamModuleJNI.ApplySensorBinning__SWIG_0(2, true, false, FrameMetadata.b(frameMetadata), frameMetadata);
                                                                                                                            return frameMetadata;
                                                                                                                        }
                                                                                                                        return frameMetadata;
                                                                                                                    }
                                                                                                                    catch (final RuntimeException ex) {}
                                                                                                                    iftrue(Label_1677:)((array19 = array6) != null);
                                                                                                                    break Block_44;
                                                                                                                }
                                                                                                                array8 = (float[])lfg2.m(CameraCharacteristics.LENS_POSE_ROTATION);
                                                                                                                continue Label_1677_Outer;
                                                                                                            }
                                                                                                        }
                                                                                                        array = (MeteringRectangle[])u.d(CaptureResult.CONTROL_AE_REGIONS);
                                                                                                        array9 = (MeteringRectangle[])u.d(CaptureResult.CONTROL_AWB_REGIONS);
                                                                                                        array2 = (MeteringRectangle[])u.d(CaptureResult.CONTROL_AF_REGIONS);
                                                                                                        c3 = frameMetadata.c();
                                                                                                        aeMetadata_metering_rectangles_get = GcamModuleJNI.AeMetadata_metering_rectangles_get(c3.a, c3);
                                                                                                        iftrue(Label_0986:)(aeMetadata_metering_rectangles_get != 0L);
                                                                                                        continue Label_1322_Outer;
                                                                                                    }
                                                                                                    Label_1037: {
                                                                                                        weightedPixelRectVector3 = new WeightedPixelRectVector(awbMetadata_metering_rectangles_get);
                                                                                                    }
                                                                                                    continue Label_1048;
                                                                                                }
                                                                                                length2 = array11.length;
                                                                                                n21 = 0;
                                                                                                continue Label_1330;
                                                                                            }
                                                                                            Label_1311: {
                                                                                                oisPositionVector = new OisPositionVector(oisMetadata_ois_positions_get);
                                                                                            }
                                                                                            continue Label_1322;
                                                                                        }
                                                                                        iftrue(Label_1772:)(array7 == null && array10 == null && array8 == null && array19 == null);
                                                                                        continue Label_2135_Outer;
                                                                                    }
                                                                                }
                                                                                array7 = (float[])lfg2.m(CameraCharacteristics.LENS_DISTORTION);
                                                                                Label_1607: {
                                                                                    iftrue(Label_1629:)((array10 = array4) != null);
                                                                                }
                                                                                continue Label_1772_Outer;
                                                                            }
                                                                            array19 = (float[])lfg2.m(CameraCharacteristics.LENS_POSE_TRANSLATION);
                                                                            continue Block_51_Outer;
                                                                        }
                                                                        lfg = f;
                                                                        continue Label_0133_Outer;
                                                                        GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(geometricCalibration.a, geometricCalibration, array19);
                                                                        break Label_1765;
                                                                    }
                                                                    array20 = (float[])lfg2.m(jli.b);
                                                                    array21 = (float[])lfg2.m(jli.c);
                                                                    array22 = (float[])lfg2.m(jli.d);
                                                                    array23 = (int[])lfg2.m(jli.e);
                                                                    array24 = (int[])lfg2.m(jli.f);
                                                                    iftrue(Label_2132:)(array20 == null || array21 == null || array22 == null || array23 == null || array24 == null);
                                                                    break Block_61;
                                                                }
                                                                iftrue(Label_1765:)(array19 == null);
                                                                continue;
                                                            }
                                                        }
                                                        iftrue(Label_1731:)(array10 == null);
                                                        continue;
                                                    }
                                                    n19 = (Integer)((lji)ex).d(CaptureResult.LENS_OPTICAL_STABILIZATION_MODE);
                                                    n20 = (Long)((lji)ex).d(CaptureResult.SENSOR_TIMESTAMP);
                                                    array11 = (OisSample[])((lji)ex).d(CaptureResult.STATISTICS_OIS_SAMPLES);
                                                    iftrue(Label_1444:)(n20 == null || array11 == null);
                                                    continue Label_1772_Outer;
                                                }
                                                geometricCalibrationVector.a(geometricCalibration);
                                                continue;
                                            }
                                            geometricCalibration2 = new GeometricCalibration();
                                            geometricCalibration2.d(1);
                                            geometricCalibration_lens_distortion_get = GcamModuleJNI.GeometricCalibration_lens_distortion_get(geometricCalibration2.a, geometricCalibration2);
                                            geometricCalibration_lens_distortion_get[0] = array20[0];
                                            geometricCalibration_lens_distortion_get[1] = array20[1];
                                            geometricCalibration_lens_distortion_get[2] = array20[2];
                                            geometricCalibration_lens_distortion_get[3] = array20[6];
                                            geometricCalibration_lens_distortion_get[4] = array20[7];
                                            geometricCalibration2.b(geometricCalibration_lens_distortion_get);
                                            geometricCalibration_lens_distortion_extended_get = GcamModuleJNI.GeometricCalibration_lens_distortion_extended_get(geometricCalibration2.a, geometricCalibration2);
                                            geometricCalibration_lens_distortion_extended_get[0] = array20[3];
                                            geometricCalibration_lens_distortion_extended_get[1] = array20[4];
                                            geometricCalibration_lens_distortion_extended_get[2] = array20[5];
                                            geometricCalibration_lens_distortion_extended_get[3] = array20[8];
                                            geometricCalibration_lens_distortion_extended_get[4] = array20[9];
                                            geometricCalibration_lens_distortion_extended_get[5] = array20[10];
                                            geometricCalibration_lens_distortion_extended_get[6] = array20[11];
                                            GcamModuleJNI.GeometricCalibration_lens_distortion_extended_set(geometricCalibration2.a, geometricCalibration2, geometricCalibration_lens_distortion_extended_get);
                                            geometricCalibration_lens_intrinsic_calibration_get = GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_get(geometricCalibration2.a, geometricCalibration2);
                                            geometricCalibration_lens_intrinsic_calibration_get[0] = array22[0];
                                            geometricCalibration_lens_intrinsic_calibration_get[1] = array22[1];
                                            geometricCalibration_lens_intrinsic_calibration_get[2] = array21[0];
                                            geometricCalibration_lens_intrinsic_calibration_get[3] = array21[1];
                                            geometricCalibration_lens_intrinsic_calibration_get[4] = 0.0f;
                                            geometricCalibration2.c(geometricCalibration_lens_intrinsic_calibration_get);
                                            GcamModuleJNI.GeometricCalibration_active_rectangle_set(geometricCalibration2.a, geometricCalibration2, array23);
                                            GcamModuleJNI.GeometricCalibration_valid_rectangle_set(geometricCalibration2.a, geometricCalibration2, array24);
                                            geometricCalibrationVector.a(geometricCalibration2);
                                            continue Label_2135;
                                        }
                                        Label_1452: {
                                            optional = Optional.empty();
                                        }
                                        continue Label_1457;
                                    }
                                    n18 = (Long)u.d(jlk.e);
                                    iftrue(Label_0909:)(n18 == null);
                                    continue Block_50_Outer;
                                }
                                iftrue(Label_1748:)(array8 == null);
                                continue;
                            }
                            Label_1434: {
                                optional = Optional.of((Object)oisMetadata);
                            }
                        }
                        catch (final RuntimeException ex) {}
                    }
                    break;
                }
                break;
            }
        }
        catch (final RuntimeException ex4) {}
        final String c4 = ohv.c;
        final String value2 = String.valueOf(ex);
        final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 46);
        sb.append("Exception in converting to Gcam FrameMetadata.");
        sb.append(value2);
        Log.e(c4, sb.toString());
        return frameMetadata;
    }
    
    public final FrameMetadataKey l(final ljm ljm) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        if (n == null) {
            return null;
        }
        return new FrameMetadataKey(n, c(this.f(ljm), this.b, ljm));
    }
    
    public final SpatialGainMap n(final ljm ljm) {
        final LensShadingMap lensShadingMap = (LensShadingMap)ljm.d(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
        if (lensShadingMap == null) {
            final int intValue = (int)ljm.c().a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE);
            final String c = ohv.c;
            final StringBuilder sb = new StringBuilder(112);
            sb.append("android.statistics.lensShadingMap was null, returning the empty SpatialGainMap(). Requested mode was ");
            sb.append(intValue);
            Log.w(c, sb.toString());
            return new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_0());
        }
        final int columnCount = lensShadingMap.getColumnCount();
        final int rowCount = lensShadingMap.getRowCount();
        final SpatialGainMap spatialGainMap = new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_2(columnCount, rowCount, false));
        final int[] z = z((int)this.f(ljm).o(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT));
        for (int i = 0; i < 4; ++i) {
            final int n = z[i];
            for (int j = 0; j < rowCount; ++j) {
                for (int k = 0; k < columnCount; ++k) {
                    GcamModuleJNI.SpatialGainMap_WriteRggb(spatialGainMap.a, spatialGainMap, k, j, i, lensShadingMap.getGainFactor(n, k, j));
                }
            }
        }
        return spatialGainMap;
    }
    
    public final void p(final FrameRequest frameRequest, final ljm ljm, final gpj gpj) {
        final lfg f = this.f(ljm);
        final float c = frameRequest.c();
        final float a = frameRequest.a();
        final float b = frameRequest.b();
        final CaptureRequest$Key control_MODE = CaptureRequest.CONTROL_MODE;
        boolean b2 = true;
        final Integer value = 1;
        gpj.a(control_MODE, value);
        final CaptureRequest$Key control_AE_MODE = CaptureRequest.CONTROL_AE_MODE;
        int i = 0;
        final Integer value2 = 0;
        gpj.a(control_AE_MODE, value2);
        gpj.a(CaptureRequest.SENSOR_EXPOSURE_TIME, (long)(c * 1000000.0f));
        gpj.a(CaptureRequest.SENSOR_FRAME_DURATION, 0L);
        gpj.a(CaptureRequest.SENSOR_SENSITIVITY, (int)(b * a * (int)((Range)f.o(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()));
        gpj.a(CaptureRequest.BLACK_LEVEL_LOCK, GcamModuleJNI.FrameRequest_try_to_lock_black_level_get(frameRequest.a, frameRequest));
        final long frameRequest_awb_get = GcamModuleJNI.FrameRequest_awb_get(frameRequest.a, frameRequest);
        AwbInfo awbInfo;
        if (frameRequest_awb_get == 0L) {
            awbInfo = null;
        }
        else {
            awbInfo = new AwbInfo(frameRequest_awb_get, false);
        }
        if (GcamModuleJNI.AwbInfo_IsValid(awbInfo.a, awbInfo)) {
            gpj.a(CaptureRequest.CONTROL_AWB_MODE, value2);
            gpj.a(CaptureRequest.COLOR_CORRECTION_MODE, value2);
            final int[] z = z((int)f.o(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT));
            final float[] awbInfo_gains_get = GcamModuleJNI.AwbInfo_gains_get(awbInfo.a, awbInfo);
            gpj.a(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(awbInfo_gains_get[z[0]], awbInfo_gains_get[z[1]], awbInfo_gains_get[z[2]], awbInfo_gains_get[z[3]]));
            final float[] awbInfo_rgb2rgb_get = GcamModuleJNI.AwbInfo_rgb2rgb_get(awbInfo.a, awbInfo);
            if (awbInfo_rgb2rgb_get.length != 9) {
                b2 = false;
            }
            njo.g(b2, "ccm must have length %s.", 9);
            final Rational[] array = new Rational[9];
            while (i < 9) {
                array[i] = new Rational((int)(awbInfo_rgb2rgb_get[i] * 10000.0f), 10000);
                ++i;
            }
            gpj.a(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(array));
        }
        gpj.a(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, value);
        gpj.a(CaptureRequest.STATISTICS_OIS_DATA_MODE, value);
        int e;
        if (jli.k != null) {
            e = 128;
        }
        else {
            e = f.k().e;
        }
        gpj.a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, e);
    }
    
    public final void r(final AeShotParams aeShotParams, final ljm ljm, final float n, final kre kre) {
        final lfg f = this.f(ljm);
        final ljm u = u(ljm, f.j().a);
        final Rect rect = (Rect)u.d(CaptureResult.SCALER_CROP_REGION);
        rect.getClass();
        final MeshWarp m = m(rect, ljm);
        final MeteringRectangle[] array = (MeteringRectangle[])u.d(CaptureResult.CONTROL_AE_REGIONS);
        final Rect rect2 = (Rect)u.d(CaptureResult.SCALER_CROP_REGION);
        rect2.getClass();
        njo.i(rect2.isEmpty() ^ true, "Invalid scaler crop region: %s", rect2);
        final Rect rect3 = (Rect)f.o(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE);
        final Rect c = kqp.g(kre).c(rect2);
        final MeshTranslation meshTranslation = new MeshTranslation(GcamModuleJNI.MeshWarp_TranslationHint(m.a, m));
        final Rect rect4 = new Rect(c);
        rect4.offset(rect3.left - GcamModuleJNI.MeshTranslation_x_get(meshTranslation.a, meshTranslation), rect3.top - GcamModuleJNI.MeshTranslation_y_get(meshTranslation.a, meshTranslation));
        if (rect3.contains(rect4)) {
            c.set(rect4);
            c.offset(-rect3.left, -rect3.top);
        }
        else {
            final int y = ofi.y(rect4.left, rect3.left, rect3.right - rect4.width());
            final int y2 = ofi.y(rect4.top, rect3.top, rect3.bottom - rect4.height());
            c.set(new Rect(y, y2, rect4.width() + y, rect4.height() + y2));
            c.offset(-rect3.left, -rect3.top);
            Log.w(ohv.c, "translateAeCrop failed because translation exceeds active array.");
        }
        final NormalizedRect normalizedRect = new NormalizedRect();
        final float n2 = 1.0f / rect3.width();
        final float n3 = 1.0f / rect3.height();
        normalizedRect.c(c.left * n2);
        normalizedRect.e(c.top * n3);
        normalizedRect.d(c.right * n2);
        normalizedRect.f(c.bottom * n3);
        aeShotParams.f(normalizedRect);
        final WeightedNormalizedRectVector d = aeShotParams.d();
        final WeightedNormalizedRect weightedNormalizedRect = new WeightedNormalizedRect();
        weightedNormalizedRect.b(1.0f);
        final NormalizedRect normalizedRect2 = new NormalizedRect();
        GcamModuleJNI.WeightedNormalizedRect_rect_set(weightedNormalizedRect.a, weightedNormalizedRect, NormalizedRect.a(normalizedRect2), normalizedRect2);
        d.b(weightedNormalizedRect);
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].getMeteringWeight() != 0) {
                    final WeightedNormalizedRect weightedNormalizedRect2 = new WeightedNormalizedRect();
                    final Rect rect5 = array[i].getRect();
                    final float exactCenterX = rect5.exactCenterX();
                    final float exactCenterY = rect5.exactCenterY();
                    final float n4 = Math.min(c.width(), c.height()) * 0.06125f;
                    final float c2 = och.c((exactCenterX - n4) / rect3.width(), 0.0f, 1.0f);
                    final float c3 = och.c((exactCenterY - n4) / rect3.height(), 0.0f, 1.0f);
                    final float c4 = och.c((exactCenterX + n4) / rect3.width(), 0.0f, 1.0f);
                    final float c5 = och.c((exactCenterY + n4) / rect3.height(), 0.0f, 1.0f);
                    final long weightedNormalizedRect_rect_get = GcamModuleJNI.WeightedNormalizedRect_rect_get(weightedNormalizedRect2.a, weightedNormalizedRect2);
                    NormalizedRect normalizedRect3;
                    if (weightedNormalizedRect_rect_get == 0L) {
                        normalizedRect3 = null;
                    }
                    else {
                        normalizedRect3 = new NormalizedRect(weightedNormalizedRect_rect_get, false);
                    }
                    normalizedRect3.c(c2);
                    normalizedRect3.e(c3);
                    normalizedRect3.d(c4);
                    normalizedRect3.f(c5);
                    weightedNormalizedRect2.b(n);
                    d.b(weightedNormalizedRect2);
                }
            }
        }
    }
}
