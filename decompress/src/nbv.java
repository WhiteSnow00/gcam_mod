// 
// Decompiled by Procyon v0.6.0
// 

public final class nbv extends nfw
{
    public final long a;
    
    public nbv(final long a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof nbv && this.a == ((nbv)o).a);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UploadProgress(bytesUploaded=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
