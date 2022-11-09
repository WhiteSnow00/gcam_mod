import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxv extends lfv implements fxu
{
    public fxv(final lfg lfg) {
        super(lfg);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && nqb.E(this.j(), ((fxv)o).j()));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.j() });
    }
}
