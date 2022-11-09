import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aif
{
    public final List a;
    
    public aif(final List a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && plr.b(this.getClass(), o.getClass()) && plr.b(this.a, ((aif)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return pjf.q(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
