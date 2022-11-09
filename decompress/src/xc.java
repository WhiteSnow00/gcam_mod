import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xc implements Entry
{
    public final Object a;
    public final Object b;
    xc c;
    public xc d;
    
    public xc(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof xc)) {
            return false;
        }
        final xc xc = (xc)o;
        return this.a.equals(xc.a) && this.b.equals(xc.b);
    }
    
    @Override
    public final Object getKey() {
        return this.a;
    }
    
    @Override
    public final Object getValue() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
    
    @Override
    public final Object setValue(final Object o) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("=");
        sb.append(this.b);
        return sb.toString();
    }
}
