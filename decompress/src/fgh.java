import java.io.IOException;
import java.util.concurrent.Executor;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgh implements few
{
    @Override
    public final lum a(final FileOutputStream fileOutputStream, final int n, final oey oey, final Executor executor) {
        final oey h = odg.h(oey, btt.t, odx.a);
        try {
            final mcm a = mcn.a(executor);
            a.c(fileOutputStream.getFD());
            ((mcl)a).b(n);
            ((mck)a).b = odg.h(h, mcj.b, ((mck)a).a);
            ((mck)a).c = odg.h(h, mcj.a, ((mck)a).a);
            ((mck)a).d = false;
            final lun lun = new lun(((mcl)a).a());
            final ofn f = ofn.f();
            final oey b = lun.b();
            b.d(new fgf(fileOutputStream, f, b), odx.a);
            return new fgg(lun, f);
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
