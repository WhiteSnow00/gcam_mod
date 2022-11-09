// 
// Decompiled by Procyon v0.6.0
// 

public final class mjz
{
    public final niz a;
    public final niz b;
    
    public mjz() {
    }
    
    public mjz(final niz a, final niz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mjz) {
            final mjz mjz = (mjz)o;
            if (this.a.equals(mjz.a) && this.b.equals(mjz.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return 78315041;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 73 + String.valueOf(value2).length());
        sb.append("StartupConfigurations{metricExtensionProvider=");
        sb.append(value);
        sb.append(", customTimestampProvider=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
