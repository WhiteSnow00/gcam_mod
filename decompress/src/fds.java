import java.io.InputStream;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class fds implements fes
{
    final /* synthetic */ ofn a;
    final /* synthetic */ fdx b;
    
    public fds(final fdx b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final ofn a = this.a;
        a.d(new fdr(this, a), odx.a);
    }
    
    @Override
    public final oey b(final hwr hwr, final hia hia, final niz niz, final huz huz) {
        return odg.i(this.a, new fdp(this, hwr, hia, niz, huz), odx.a);
    }
    
    @Override
    public final oey c(final hwr hwr, final InputStream inputStream, final hia hia, final niz niz, final huz huz) {
        return odg.i(this.a, new fdq(this, hwr, inputStream, hia, niz, huz), odx.a);
    }
}
