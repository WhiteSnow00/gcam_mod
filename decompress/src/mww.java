// 
// Decompiled by Procyon v0.6.0
// 

public final class mww implements mvl
{
    private final myc a;
    
    public mww(final myc a) {
        this.a = a;
    }
    
    @Override
    public final mxk a() {
        return this.a.r;
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ResourceImpl { entity: ");
        sb.append(this.a);
        sb.append(" }");
        return sb.toString();
    }
}
