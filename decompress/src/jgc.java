// 
// Decompiled by Procyon v0.6.0
// 

public final class jgc
{
    public final jgb a;
    public final klj b;
    public final jfz c;
    
    public jgc() {
    }
    
    public jgc(final jgb a, final klj b, final jfz c) {
        if (a == null) {
            throw new NullPointerException("Null effectFactory");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null activation");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null order");
    }
    
    public static jgc a(final jgb jgb, final klj klj, final jfz jfz) {
        return new jgc(jgb, klj, jfz);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jgc) {
            final jgc jgc = (jgc)o;
            if (this.a.equals(jgc.a) && this.b.equals(jgc.b) && this.c.equals(jgc.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 60 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("ViewfinderEffectElement{effectFactory=");
        sb.append(value);
        sb.append(", activation=");
        sb.append(value2);
        sb.append(", order=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
