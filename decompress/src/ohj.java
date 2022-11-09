// 
// Decompiled by Procyon v0.6.0
// 

public final class ohj
{
    public final kra a;
    
    public ohj() {
    }
    
    public ohj(final kra a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ohj && this.a.equals(((ohj)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 33);
        sb.append("SeeDarkShotParams{imageRotation=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
