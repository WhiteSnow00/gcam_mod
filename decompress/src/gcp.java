import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.hardware.camera2.CaptureResult$Key;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcp
{
    public final List a;
    
    public gcp(final List a) {
        this.a = a;
    }
    
    public final boolean a(final CaptureResult$Key captureResult$Key, final Object o) {
        return this.b(captureResult$Key, o);
    }
    
    @SafeVarargs
    public final boolean b(final CaptureResult$Key captureResult$Key, final Object... array) {
        njo.d(array.length > 0);
        final HashSet set = new HashSet(Arrays.asList(array));
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (!set.contains(((ljm)iterator.next()).d(captureResult$Key))) {
                return false;
            }
        }
        return true;
    }
}
