import android.util.Rational;
import android.media.MediaRecorder;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import android.graphics.SurfaceTexture;
import android.util.Range;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class are extends atl
{
    private static final aub x;
    
    static {
        x = new aub("AndCam2Capabs");
    }
    
    public are(final CameraCharacteristics cameraCharacteristics) {
        super(new atj());
        final StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap)cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        final Range[] array = (Range[])cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        final int length = array.length;
        final int n = 0;
        for (final Range range : array) {
            this.b.add(new int[] { (int)range.getLower(), (int)range.getUpper() });
        }
        this.c.addAll(aua.c(Arrays.asList(streamConfigurationMap.getOutputSizes((Class)SurfaceTexture.class))));
        final int[] outputFormats = streamConfigurationMap.getOutputFormats();
        for (int length2 = outputFormats.length, j = 0; j < length2; ++j) {
            this.d.add(outputFormats[j]);
        }
        this.e.addAll(aua.c(Arrays.asList(streamConfigurationMap.getOutputSizes((Class)MediaRecorder.class))));
        this.f.addAll(aua.c(Arrays.asList(streamConfigurationMap.getOutputSizes(256))));
        this.g.addAll(this.d);
        final int[] array2 = (int[])cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (array2 != null) {
            for (int length3 = array2.length, k = 0; k < length3; ++k) {
                final ati b = b(array2[k]);
                if (b != null) {
                    this.h.add(b);
                }
            }
        }
        this.i.add(atg.c);
        if (cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)) {
            this.i.add(atg.b);
            this.i.add(atg.d);
            this.i.add(atg.e);
            final int[] array3 = (int[])cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            for (int length4 = array3.length, l = 0; l < length4; ++l) {
                if (array3[l] == 4) {
                    this.i.add(atg.f);
                }
            }
        }
        final int[] array4 = (int[])cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (array4 != null) {
            for (int length5 = array4.length, n2 = 0; n2 < length5; ++n2) {
                final ath a = a(array4[n2]);
                if (a != null) {
                    this.j.add(a);
                }
            }
        }
        final int[] array5 = (int[])cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (array5 != null) {
            for (int length6 = array5.length, n3 = n; n3 < length6; ++n3) {
                final atk c = c(array5[n3]);
                if (c != null) {
                    this.k.add(c);
                }
            }
        }
        final Range range2 = (Range)cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.n = (int)range2.getLower();
        this.o = (int)range2.getUpper();
        final Rational rational = (Rational)cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        this.p = rational.getNumerator() / (float)rational.getDenominator();
        this.q = (int)cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        this.s = (int)cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        this.t = (float)cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (this.f(ath.a) && (this.r = (int)cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)) > 0) {
            this.l.add(atf.c);
        }
        if (this.s > 0) {
            this.l.add(atf.d);
        }
        if (this.t > 1.0f) {
            this.l.add(atf.a);
        }
    }
    
    public static ath a(final int n) {
        switch (n) {
            default: {
                final aub x = are.x;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to convert from API 2 focus mode: ");
                sb.append(n);
                auc.c(x, sb.toString());
                return null;
            }
            case 5: {
                return ath.d;
            }
            case 4: {
                return ath.b;
            }
            case 3: {
                return ath.c;
            }
            case 2: {
                return ath.g;
            }
            case 1: {
                return ath.a;
            }
            case 0: {
                return ath.e;
            }
        }
    }
    
    public static ati b(final int n) {
        switch (n) {
            default: {
                if (n == atz.a) {
                    return ati.h;
                }
                final aub x = are.x;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to convert from API 2 scene mode: ");
                sb.append(n);
                auc.c(x, sb.toString());
                return null;
            }
            case 16: {
                return ati.d;
            }
            case 15: {
                return ati.f;
            }
            case 14: {
                return ati.l;
            }
            case 13: {
                return ati.o;
            }
            case 12: {
                return ati.g;
            }
            case 11: {
                return ati.p;
            }
            case 10: {
                return ati.q;
            }
            case 9: {
                return ati.n;
            }
            case 8: {
                return ati.e;
            }
            case 7: {
                return ati.r;
            }
            case 5: {
                return ati.j;
            }
            case 4: {
                return ati.i;
            }
            case 3: {
                return ati.m;
            }
            case 2: {
                return ati.c;
            }
            case 0: {
                return ati.b;
            }
        }
    }
    
    public static atk c(final int n) {
        switch (n) {
            default: {
                final aub x = are.x;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to convert from API 2 white balance: ");
                sb.append(n);
                auc.c(x, sb.toString());
                return null;
            }
            case 8: {
                return atk.f;
            }
            case 7: {
                return atk.g;
            }
            case 6: {
                return atk.b;
            }
            case 5: {
                return atk.c;
            }
            case 4: {
                return atk.h;
            }
            case 3: {
                return atk.d;
            }
            case 2: {
                return atk.e;
            }
            case 1: {
                return atk.a;
            }
        }
    }
}
