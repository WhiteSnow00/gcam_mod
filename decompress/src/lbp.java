import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbp implements lcc
{
    public final ldj a;
    public final krr b;
    public final kse c;
    private final ldy d;
    
    public lbp(final ldy d, final ldj a, final krr krr, final kse c) {
        this.d = d;
        this.a = a;
        this.b = krr.a("HfrCCSOpener");
        this.c = c;
    }
    
    @Override
    public final void d(final ljg ljg, final lcd lcd, final kjk kjk, final Handler handler) {
        njo.e(this.d.b.isEmpty(), "Cannot create a ConstrainedHighSpeedCaptureSession with buffered streams!");
        final boolean empty = this.d.c.isEmpty();
        final boolean b = true;
        njo.e(empty ^ true, "Cannot create a ConstrainedHighSpeedCaptureSession without streams!");
        njo.e(this.d.c.size() <= 2, "Cannot create a ConstrainedHighSpeedCaptureSession with more than two streams!");
        final ArrayList list = new ArrayList();
        final nns s = nns.s(lcl.a, this.d.c);
        for (int c = ((nql)s).c, i = 0; i < c; ++i) {
            final ldm ldm = s.get(i);
            final Surface g = ldm.g();
            if (g != null) {
                list.add(ofi.n(g));
            }
            else {
                final ofn f = ofn.f();
                f.d(new ifv(ldm.a.a(new lbn(f), odx.a), 2), odx.a);
                list.add(f);
            }
        }
        njo.e(list.isEmpty() ^ true, "Surface cannot be null");
        njo.e(list.size() <= 2 && b, "No more than two surfaces can be accepted");
        ofi.w(ofi.j(list), new lbo(this, lcd, ljg, handler, kjk), odx.a);
    }
}
