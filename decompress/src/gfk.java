import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class gfk implements fxx
{
    final /* synthetic */ gfl a;
    private final gff b;
    private final gen c;
    private final blv d;
    
    public gfk(final gfl a, final gff b, final gen c, final blv d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        RuntimeException ex = new RuntimeException("Unknown exception in PictureTaker.");
        while (true) {
            try {
                Object o = this.a;
                try {
                    final gfg gfg = ((gfl)o).a.get(1000L, TimeUnit.MILLISECONDS);
                    if (!(boolean)gfg.a().aQ()) {
                        o = String.valueOf(gfg);
                        final StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 74);
                        sb.append("Take picture was invoked, but the picture taker is not available! Command ");
                        sb.append((String)o);
                        o = sb.toString();
                        this.a.b.d((String)o);
                        final kuw kuw = new kuw((String)o);
                        this.a.b.f("PictureTakerCommand.run: success=false");
                        this.b.close();
                        this.c.b.w(kuw);
                        this.c.c.f();
                        this.c.a.f.close();
                        return;
                    }
                    final krr b = this.a.b;
                    o = String.valueOf(gfg);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(o).length() + 44);
                    sb2.append("PictureTakerCommand.run: got captureCommand=");
                    sb2.append((String)o);
                    b.f(sb2.toString());
                    this.d.a(4);
                    gfg.c(this.b, this.c);
                    this.a.b.f("PictureTakerCommand.run: success=true");
                    this.b.close();
                    return;
                }
                catch (final ExecutionException o) {}
                catch (final InterruptedException ex2) {}
                throw new RuntimeException((Throwable)o);
            }
            catch (final Exception ex3) {
                final gfl a = this.a;
                final krr b2 = a.b;
                final String value = String.valueOf(a.a.toString());
                String concat;
                if (value.length() != 0) {
                    concat = "PictureTaker command failed: ".concat(value);
                }
                else {
                    concat = new String("PictureTaker command failed: ");
                }
                b2.e(concat, ex3);
                try {
                    throw ex3;
                }
                finally {
                    ex = (RuntimeException)ex3;
                }
            }
            catch (final TimeoutException o) {
                this.a.b.e("ImageCaptureCommand retrieval timed out", (Throwable)o);
                this.a.b.f("PictureTakerCommand.run: success=false");
                this.b.close();
                this.c.b.w((Throwable)o);
                continue;
            }
            break;
        }
        this.a.b.f("PictureTakerCommand.run: success=false");
        this.b.close();
        this.c.b.w(ex);
        this.c.c.f();
        this.c.a.f.close();
        throw;
    }
    
    @Override
    public final String toString() {
        return "PictureTakerCommand";
    }
}
