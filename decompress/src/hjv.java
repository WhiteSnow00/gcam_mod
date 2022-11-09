// 
// Decompiled by Procyon v0.6.0
// 

final class hjv
{
    public final hjo a;
    public final klv b;
    
    public hjv() {
    }
    
    public hjv(final hjo a, final klv b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null settingsKey");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hjv) {
            final hjv hjv = (hjv)o;
            if (this.a.equals(hjv.a) && this.b.equals(hjv.b)) {
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
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 39 + String.valueOf(value2).length());
        sb.append("KeyAndProperty{settingsKey=");
        sb.append(value);
        sb.append(", property=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
