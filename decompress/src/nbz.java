// 
// Decompiled by Procyon v0.6.0
// 

public final class nbz extends nfw
{
    public final String a;
    
    public nbz(final String a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof nbz && plr.b(this.a, ((nbz)o).a));
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UploadResourceComplete(f250ResourceId=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
