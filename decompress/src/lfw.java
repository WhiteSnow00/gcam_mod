import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfw implements lfh
{
    private final lfh a;
    
    public lfw(final lfh a) {
        this.a = a;
    }
    
    @Override
    public final lfg a(final lfj lfj) {
        return this.a.a(lfj);
    }
    
    @Override
    public final lfj b() {
        return this.a.b();
    }
    
    @Override
    public final lfj c(final int n) {
        return this.a.c(n);
    }
    
    @Override
    public final lfj d(final String s) {
        return this.a.d(s);
    }
    
    @Override
    public final lfj e(final lfu lfu) {
        return this.a.e(lfu);
    }
    
    public final fxu f(final lfj lfj) {
        return new fxv(this.a(lfj));
    }
    
    @Override
    public final List g() {
        return this.a.g();
    }
    
    @Override
    public final List h(final lfu lfu) {
        return this.a.h(lfu);
    }
    
    @Override
    public final boolean i() {
        return this.a.i();
    }
    
    @Override
    public final boolean j(final lfu lfu) {
        return this.a.j(lfu);
    }
    
    @Override
    public final boolean k() {
        return this.a.k();
    }
}
