import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kxl extends kxc
{
    public final kxc a;
    private final Executor b;
    
    public kxl(final kxc a, final Executor b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void aM(final lji lji) {
        this.b.execute(new kxj(this, lji));
    }
    
    @Override
    public final void aN(final kvx kvx) {
        this.b.execute(new kxh(this, kvx));
    }
    
    @Override
    public final void aO(final lem lem) {
        this.b.execute(new kxi(this, lem));
    }
    
    @Override
    public final void aV(final long n, final int n2) {
        this.b.execute(new kxe(this, n, n2, 1));
    }
    
    @Override
    public final void aW(final long n, final int n2, final long n3) {
        this.b.execute(new kxf(this, n, n2, n3));
    }
    
    @Override
    public final void b(final ljm ljm) {
        this.b.execute(new kxk(this, ljm));
    }
    
    @Override
    public final void h(final long n, final Set set) {
        this.b.execute(new kxg(this, n, set));
    }
    
    @Override
    public final void i(final long n, final int n2) {
        this.b.execute(new kxe(this, n, n2));
    }
}
