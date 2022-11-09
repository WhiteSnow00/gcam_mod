import java.util.ArrayList;
import java.util.Arrays;
import android.media.MediaRecorder;
import android.view.Surface;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.List;
import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageReader;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlm
{
    private static final SparseArray a;
    private static final int[] b;
    
    static {
        final SparseArray a2 = new SparseArray();
        (a = a2).append(0, (Object)"com.google.android.camera.experimental2015.ExperimentalKeys");
        a2.append(1, (Object)"com.google.android.camera.experimental2016.ExperimentalKeys");
        a2.append(2, (Object)"com.google.android.camera.experimental2017.ExperimentalKeys");
        a2.append(3, (Object)"com.google.android.camera.experimental2018.ExperimentalKeys");
        a2.append(4, (Object)"com.google.android.camera.experimental2019.ExperimentalKeys");
        a2.append(5, (Object)"com.google.android.camera.experimental2020_midyear.ExperimentalKeys");
        a2.append(6, (Object)"com.google.android.camera.experimental2020.ExperimentalKeys");
        a2.append(7, (Object)"com.google.android.camera.experimental2021.ExperimentalKeys");
        b = f();
    }
    
    public static void a(final ImageReader imageReader) {
        imageReader.discardFreeBuffers();
    }
    
    public static void b(final CameraCaptureSession cameraCaptureSession, final List list) {
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }
    
    public static void c(final OutputConfiguration outputConfiguration, final Surface surface) {
        outputConfiguration.addSurface(surface);
    }
    
    public static void d(final MediaRecorder mediaRecorder, final int n, final int n2) {
        mediaRecorder.setVideoEncodingProfileLevel(n, n2);
    }
    
    public static boolean e(final int n) {
        return Arrays.binarySearch(jlm.b, n) >= 0;
    }
    
    private static int[] f() {
        final ArrayList list = new ArrayList();
        int i = 0;
        int n = 0;
        while (true) {
            final SparseArray a = jlm.a;
            if (n >= a.size()) {
                break;
            }
            try {
                Class.forName((String)a.valueAt(n));
                list.add(a.keyAt(n));
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {}
            catch (final ClassNotFoundException ex) {}
            ++n;
        }
        final int[] array = new int[list.size()];
        for (int size = list.size(), n2 = 0; i < size; ++i, ++n2) {
            array[n2] = (int)list.get(i);
        }
        Arrays.sort(array);
        return array;
    }
}
