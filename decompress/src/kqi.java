import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.Camera$CameraInfo;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqi implements lfh
{
    public final xq a;
    private final lfo b;
    private final liy c;
    private final krr d;
    private final kse e;
    
    public kqi(final xq a, final lfo b, final liy c, final krr d, final kse e) {
        c.getClass();
        e.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final lfg a(final lfj lfj) {
        lfj.getClass();
        final xi a = this.a.a(kqm.a(lfj));
        final Set b = a.b();
        final HashSet set = new HashSet();
        final Iterator iterator = b.iterator();
        while (iterator.hasNext()) {
            set.add(lfj.b(((xh)iterator.next()).a));
        }
        return new lff(lfj, new kqk(a), set, this.c, this.e, this.d);
    }
    
    @Override
    public final lfj b() {
        return (lfj)pjf.g(this.f());
    }
    
    @Override
    public final lfj c(final int n) {
        return this.d(String.valueOf(n));
    }
    
    @Override
    public final lfj d(final String s) {
        s.getClass();
        final lfj lfj = null;
        final Iterator a = new pmo(new kqh(this, null)).a();
        while (a.hasNext()) {
            final Object next = a.next();
            if (plr.b(((lfj)next).a, s)) {
                return (lfj)next;
            }
        }
        return lfj;
    }
    
    @Override
    public final lfj e(final lfu lfu) {
        lfu.getClass();
        for (final Object next : this.f()) {
            if (kql.a(this.a.a(kqm.a((lfj)next))) == lfu) {
                return (lfj)next;
            }
        }
        return null;
    }
    
    public final List f() {
        final List a = this.b.a();
        a.getClass();
        return a;
    }
    
    @Override
    public final List g() {
        return this.f();
    }
    
    @Override
    public final List h(final lfu lfu) {
        lfu.getClass();
        final List f = this.f();
        final ArrayList list = new ArrayList();
        for (final Object next : f) {
            if (kql.a(this.a.a(kqm.a((lfj)next))) == lfu) {
                list.add(next);
            }
        }
        return list;
    }
    
    @Override
    public final boolean i() {
        final int numberOfCameras = Camera.getNumberOfCameras();
        int i = 0;
        while (i < numberOfCameras) {
            try {
                final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
                Camera.getCameraInfo(i, camera$CameraInfo);
                if (!camera$CameraInfo.canDisableShutterSound) {
                    return false;
                }
                ++i;
                continue;
            }
            catch (final RuntimeException ex) {
                return false;
            }
            break;
        }
        return true;
    }
    
    @Override
    public final boolean j(final lfu lfu) {
        lfu.getClass();
        for (final Object next : this.f()) {
            if (kql.a(this.a.a(kqm.a((lfj)next))) == lfu) {
                final Object o = next;
                return o != null;
            }
        }
        final Object o = null;
        return o != null;
    }
    
    @Override
    public final boolean k() {
        final List f = this.f();
        f.getClass();
        for (final Object next : f) {
            final lfj lfj = (lfj)next;
            final xq a = this.a;
            final String a2 = lfj.a;
            a2.getClass();
            a2.getClass();
            final xi a3 = a.a(a2);
            final CameraCharacteristics$Key request_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            request_AVAILABLE_CAPABILITIES.getClass();
            int[] a4;
            if ((a4 = (int[])a3.a(request_AVAILABLE_CAPABILITIES)) == null) {
                a4 = kql.a;
            }
            final int length = a4.length;
            int i = 0;
            while (i < length) {
                if (a4[i] == 9) {
                    if (i >= 0) {
                        final Object o = next;
                        return o != null;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
        }
        final Object o = null;
        return o != null;
    }
}
