import java.io.IOException;
import java.util.concurrent.Executor;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhk implements few
{
    @Override
    public final lum a(final FileOutputStream fileOutputStream, final int n, final oey oey, final Executor executor) {
        try {
            final ltn a = lto.a();
            a.c = 2;
            final ltk a2 = ltl.a(fileOutputStream, a.a());
            a2.c(n);
            final ltj ltj = new ltj(fileOutputStream, a2, executor);
            oey.d(new ltc(ltj, oey), ltj.e);
            return ltj;
        }
        catch (final IOException ex) {
            throw new ltr(ex);
        }
    }
}
