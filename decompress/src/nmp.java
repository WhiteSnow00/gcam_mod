import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nmp extends nml implements npt
{
    protected nmp() {
    }
    
    @Override
    public final int bK(final Object o) {
        return this.o().bK(o);
    }
    
    @Override
    public int d(final Object o, final int n) {
        return this.o().d(o, Integer.MAX_VALUE);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || this.o().equals(o);
    }
    
    @Override
    public Set f() {
        throw null;
    }
    
    @Override
    public Set g() {
        throw null;
    }
    
    @Override
    public void h(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final int hashCode() {
        return this.o().hashCode();
    }
    
    @Override
    public boolean i(final Object o, final int n) {
        return this.o().i(o, n);
    }
    
    protected abstract npt o();
}
