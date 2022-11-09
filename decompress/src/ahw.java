import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Iterator;
import androidx.window.sidecar.SidecarDisplayFeature;
import java.util.ArrayList;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahw
{
    public static final cgq a;
    
    static {
        a = new cgq();
        ahw.class.getSimpleName();
    }
    
    public static final List a(final List list, final SidecarDeviceState sidecarDeviceState) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final ahv g = cgq.g((SidecarDisplayFeature)iterator.next(), sidecarDeviceState);
            if (g != null) {
                list2.add(g);
            }
        }
        return list2;
    }
    
    public static final aif b(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new aif(pja.a);
        }
        final SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        cgq.e(sidecarDeviceState2, cgq.f(sidecarDeviceState));
        return new aif(a(cgq.d(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }
}
