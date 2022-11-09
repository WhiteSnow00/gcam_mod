import java.io.OutputStream;
import java.io.IOException;
import java.io.File;
import android.content.Context;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyn implements eyu
{
    private final FileOutputStream a;
    
    public eyn(final Context context) {
        FileOutputStream a;
        try {
            final File file = new File(new File(context.getFilesDir(), "camera_events"), "session.pb");
            och.r(file);
            a = new FileOutputStream(file, true);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            a = null;
        }
        this.a = a;
    }
    
    @Override
    public final void a(nxt nxt) {
        try {
            if (this.a != null) {
                final okt okt = (okt)nxt.H(5);
                okt.o(nxt);
                final okt m = nyp.c.m();
                final long currentTimeMillis = System.currentTimeMillis();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nyp nyp = (nyp)m.b;
                nyp.a |= 0x1;
                nyp.b = currentTimeMillis;
                if (okt.c) {
                    okt.m();
                    okt.c = false;
                }
                nxt = (nxt)okt.b;
                final nyp x = (nyp)m.h();
                final nxt ak = nxt.ak;
                x.getClass();
                nxt.X = x;
                nxt.b |= 0x8000000;
                nxt = (nxt)okt.h();
                final FileOutputStream a = this.a;
                int ab;
                if ((ab = nxt.aB) == -1) {
                    ab = omr.a.b(nxt).a(nxt);
                    nxt.aB = ab;
                }
                final okg aj = okg.aj(a, okg.U(okg.ad(ab) + ab));
                aj.C(ab);
                nxt.aT(aj);
                aj.i();
                this.a.flush();
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
}
