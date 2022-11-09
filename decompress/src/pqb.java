// 
// Decompiled by Procyon v0.6.0
// 

public final class pqb
{
    public final ppw a;
    
    public pqb(final ppw a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Removed[");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
