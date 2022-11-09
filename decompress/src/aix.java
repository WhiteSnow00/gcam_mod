// 
// Decompiled by Procyon v0.6.0
// 

public final class aix extends cwx
{
    public final aiq a;
    
    public aix() {
        this(aiq.a);
    }
    
    public aix(final aiq a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((aix)o).a));
    }
    
    @Override
    public final int hashCode() {
        return aix.class.getName().hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Success {mOutputData=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
