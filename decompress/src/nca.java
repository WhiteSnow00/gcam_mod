// 
// Decompiled by Procyon v0.6.0
// 

public final class nca extends nfw
{
    public final String a;
    
    public nca(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof nca && plr.b(this.a, ((nca)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UploadTransferHandle(uploadTransferHandle=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
