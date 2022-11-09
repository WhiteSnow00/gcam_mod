import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.FrameRequest;
import java.util.ArrayList;
import java.util.List;
import com.google.googlex.gcam.FrameRequestVector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpl
{
    private static final Byte a;
    private static final Byte b;
    private final cxl c;
    private final ohv d;
    private final boolean e;
    
    static {
        final Byte b2 = a = 0;
        byte byteValue;
        if (jlk.q != null) {
            byteValue = 3;
        }
        else {
            byteValue = b2;
        }
        b = byteValue;
    }
    
    public gpl(final cxl c, final ohv d, final lfg lfg) {
        this.c = c;
        this.d = d;
        this.e = (lfg.l() == lfu.a);
    }
    
    final int a() {
        if (this.c.k(cxs.T)) {
            return 1;
        }
        if (this.c.k(cxr.ai) && !this.e) {
            return 2;
        }
        return 0;
    }
    
    public final List b(final kyh kyh, final FrameRequestVector frameRequestVector, final ljm ljm, final int n) {
        final long a = frameRequestVector.a();
        final long n2 = n;
        int i = 1;
        njo.o(a >= n2);
        njo.o(frameRequestVector.a() > 0L);
        final FrameRequest b = frameRequestVector.b(0);
        float c = b.c();
        float a2 = b.a();
        float b2 = b.b();
        final gpj gpj = new gpj(kyh);
        this.d.p(b, ljm, gpj);
        final kyh a3 = kyh.a(kyh);
        final ArrayList list = new ArrayList(n);
        list.add(a3.b());
        while (i < n) {
            final FrameRequest b3 = frameRequestVector.b(i);
            final float c2 = b3.c();
            final float a4 = b3.a();
            float b4 = b3.b();
            if (c2 == c && a4 == a2 && b4 == b2) {
                b4 = b2;
            }
            else {
                this.d.p(b3, ljm, gpj);
                final float n3 = c2;
                a2 = a4;
                c = n3;
            }
            list.add(kyh.a(kyh).b());
            ++i;
            b2 = b4;
        }
        return list;
    }
    
    public final void c(final kyh kyh, final gel gel, final kzl kzl, final int n, final int n2, final boolean b) {
        kyh.f(kzl);
        gel.c(n + n2);
        kyh.g(new gpk(gel));
        final CaptureRequest$Key control_CAPTURE_INTENT = CaptureRequest.CONTROL_CAPTURE_INTENT;
        final Integer value = 0;
        kyh.d(control_CAPTURE_INTENT, value);
        if (jlg.a != null) {
            kyh.d(jlg.a, this.a());
        }
        if (!b) {
            dzh.b(this.c, kyh);
        }
        if (jlj.p != null) {
            kyh.d(jlj.p, value);
        }
        if (b && jlk.q != null) {
            kyh.d(jlk.q, gpl.b);
        }
    }
}
