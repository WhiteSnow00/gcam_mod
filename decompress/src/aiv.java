// 
// Decompiled by Procyon v0.6.0
// 

public final class aiv extends cwx
{
    public final aiq a;
    
    public aiv() {
        final aiq a = aiq.a;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((aiv)o).a));
    }
    
    @Override
    public final int hashCode() {
        return aiv.class.getName().hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Failure {mOutputData=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
