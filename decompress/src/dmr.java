import android.os.Looper;
import android.os.Handler;
import java.util.regex.Pattern;
import java.util.ArrayList;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.TimeUnit;
import android.os.HandlerThread;
import com.google.googlex.gcam.Gcam;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmr implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public dmr(final pii a) {
        this.a = a;
    }
    
    public dmr(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static dmr a(final pii pii) {
        return new dmr(pii, 3);
    }
    
    public static dmr b(final pii pii) {
        return new dmr(pii, 4);
    }
    
    public static dmr c(final pii pii) {
        return new dmr(pii, 6);
    }
    
    public static dmr d(final pii pii) {
        return new dmr(pii, 7);
    }
    
    public static dmr e(final pii pii) {
        return new dmr(pii, 11);
    }
    
    public static dmr f(final pii pii) {
        return new dmr(pii, 14);
    }
    
    public static dmr g(final pii pii) {
        return new dmr(pii, 15);
    }
    
    public static dmr h(final pii pii) {
        return new dmr(pii, 16);
    }
    
    public static dmr i(final pii pii) {
        return new dmr(pii, 17);
    }
    
    public static dmr j(final pii pii) {
        return new dmr(pii, 19);
    }
}
