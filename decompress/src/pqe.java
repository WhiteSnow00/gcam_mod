// 
// Decompiled by Procyon v0.6.0
// 

public final class pqe
{
    private final String a;
    
    public pqe(final String a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(this.a);
        sb.append('>');
        return sb.toString();
    }
}
