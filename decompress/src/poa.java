// 
// Decompiled by Procyon v0.6.0
// 

public final class poa extends pjg
{
    public static final pnx b;
    public final String a;
    
    static {
        b = new pnx();
    }
    
    public poa() {
        super(poa.b);
        this.a = "CXCP-Pipe";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof poa && plr.b(this.a, ((poa)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineName(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
