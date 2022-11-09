// 
// Decompiled by Procyon v0.6.0
// 

final class mmj extends mmm
{
    private final boolean a;
    
    public mmj(final pso pso, final boolean a) {
        super(pso);
        this.a = a;
    }
    
    @Override
    public final long a(final String s) {
        if (this.a) {
            return this.e().b;
        }
        return -1L;
    }
    
    @Override
    public final boolean b() {
        return this.a;
    }
    
    @Override
    public final pso c() {
        pso pso;
        if (this.a) {
            pso = this.e();
        }
        else {
            pso = this.d();
        }
        return pso;
    }
}
