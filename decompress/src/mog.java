import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class mog
{
    public final Context a;
    public final njp b;
    
    public mog() {
    }
    
    public mog(final Context a, final njp b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null context");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mog) {
            final mog mog = (mog)o;
            if (this.a.equals(mog.a)) {
                final njp b = this.b;
                final njp b2 = mog.b;
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final njp b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 46 + String.valueOf(value2).length());
        sb.append("FlagsContext{context=");
        sb.append(value);
        sb.append(", hermeticFileOverrides=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
