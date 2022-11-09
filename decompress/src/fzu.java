import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import android.hardware.camera2.CaptureRequest$Key;
import java.util.Set;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzu
{
    public fzu() {
        new ArrayDeque();
    }
    
    public static fzr a(final kws kws) {
        return new fzr(noi.H(kws));
    }
    
    public static fzr b(final CaptureRequest$Key captureRequest$Key, final Object o) {
        return a(kxc.p(captureRequest$Key, o));
    }
    
    public static fzr c(final List list) {
        return new fzr(noi.F(list));
    }
    
    public static fzr d(final kws... array) {
        return c(Arrays.asList(array));
    }
    
    public static fzr e() {
        return new fzr(nqr.a);
    }
    
    public static klj f(final CaptureRequest$Key captureRequest$Key, final klj klj) {
        return klq.j(klq.j(klj, new fzs(captureRequest$Key)), fzt.a);
    }
}
