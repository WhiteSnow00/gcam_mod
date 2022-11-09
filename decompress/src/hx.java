import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hx
{
    private final Object a;
    
    public hx(final Object a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.a, ((hx)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
