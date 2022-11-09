import java.util.Iterator;
import java.util.Set;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public class kxc
{
    public static kxb l(final lfj lfj, final kre kre) {
        final kxa a = kxb.a();
        a.h(kxd.b);
        a.b(lfj);
        a.g(kre);
        return a.a();
    }
    
    public static kxb m(final lfj lfj, final kre kre) {
        final kxa a = kxb.a();
        a.h(kxd.c);
        a.b(lfj);
        a.g(kre);
        return a.a();
    }
    
    public static kws p(final CaptureRequest$Key captureRequest$Key, final Object o) {
        return new kws(captureRequest$Key, o);
    }
    
    public static Set q(final Iterable iterable) {
        final nog d = noi.D();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            d.g(((CaptureRequest$Key)iterator.next()).getName());
        }
        return d.f();
    }
    
    public void aL(final kwz kwz, final long n) {
    }
    
    public void aM(final lji lji) {
    }
    
    public void aN(final kvx kvx) {
    }
    
    public void aO(final lem lem) {
    }
    
    public void aV(final long n, final int n2) {
    }
    
    public void aW(final long n, final int n2, final long n3) {
    }
    
    public void b(final ljm ljm) {
    }
    
    public void h(final long n, final Set set) {
    }
    
    public void i(final long n, final int n2) {
    }
}
