import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqv implements lnl
{
    @Override
    public final boolean equals(final Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            final lnl lnl = (lnl)o;
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new int[] { this.getClass().hashCode(), -969197918, -2032180703, 2131886095 });
    }
    
    @Override
    public final String toString() {
        return "java_hash=-969197918,feature_hash=-2032180703,res=2131886095";
    }
}
