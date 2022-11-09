import java.io.FileDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mck implements mcm, mcl
{
    public final Executor a;
    public oey b;
    public oey c;
    public boolean d;
    private oey e;
    private oey f;
    
    public mck(final Executor a) {
        this.e = null;
        this.a = a;
        this.b = ofi.n(null);
        this.c = ofi.n(null);
        this.f = ofi.n(null);
        this.d = true;
    }
    
    @Override
    public final mbz a() {
        final oey e = this.e;
        if (e != null) {
            return new mcd(odg.h(oet.q(e), mcj.c, this.a), this.f, this.b, this.c, this.d, this.a);
        }
        throw new IllegalArgumentException("Output not properly specified");
    }
    
    @Override
    public final void b(final int n) {
        this.f = ofi.n(n);
    }
    
    @Override
    public final void c(final FileDescriptor fileDescriptor) {
        this.e = ofi.n(fileDescriptor);
    }
}
