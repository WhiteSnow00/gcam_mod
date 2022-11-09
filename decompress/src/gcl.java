import android.hardware.camera2.CameraCharacteristics;
import java.util.Arrays;
import android.hardware.camera2.CaptureResult$Key;
import java.util.Set;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcl
{
    public final gcq a;
    private final fxu b;
    private final gcb c;
    
    public gcl(final fxu b, final gcq a, final gcb c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final boolean a() {
        final CaptureResult$Key edge_MODE = CaptureResult.EDGE_MODE;
        final Integer value = 2;
        return this.e(Integer.class, edge_MODE, 0, noi.J(1, value, 3), noi.H(value));
    }
    
    public final boolean b() {
        return !this.a.a().b(CaptureResult.FLASH_STATE, 3, 4);
    }
    
    public final boolean c() {
        return this.c.b.size() == 1;
    }
    
    public final boolean d() {
        final CaptureResult$Key noise_REDUCTION_MODE = CaptureResult.NOISE_REDUCTION_MODE;
        final Integer value = 2;
        return this.e(Integer.class, noise_REDUCTION_MODE, 0, noi.J(value, 1, 4), noi.H(value));
    }
    
    public final boolean e(final Class clazz, final CaptureResult$Key captureResult$Key, final Object o, final Set set, final Set set2) {
        final gcq a = this.a;
        final boolean b = a.b().a.size() == 0 ^ true;
        final boolean b2 = !b && a.a().b(captureResult$Key, nov.h(set, clazz));
        final boolean b3 = b && a.a().a(captureResult$Key, o) && a.b().b(captureResult$Key, nov.h(set2, clazz));
        final boolean b4 = b && a.a().b(captureResult$Key, nov.h(set, clazz)) && a.b().a(captureResult$Key, o);
        return b2 || b3 || b4;
    }
    
    public final boolean f(final gcf... array) {
        return Arrays.asList(array).contains(this.c.a);
    }
    
    public final boolean g(final Integer... array) {
        return Arrays.asList(array).contains(this.b.m(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
    }
}
