// 
// Decompiled by Procyon v0.6.0
// 

public final class mud
{
    public final omj a;
    public final okm b;
    
    public mud() {
    }
    
    public mud(final omj a, final okm b) {
        if (a == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null extensionRegistryLite");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mud) {
            final mud mud = (mud)o;
            if (this.a.equals(mud.a) && this.b.equals(mud.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 54 + String.valueOf(value2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(value);
        sb.append(", extensionRegistryLite=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
