import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gea
{
    public final Float a;
    private final Pair b;
    
    public gea() {
    }
    
    public gea(final Float a, final Pair b) {
        this.a = a;
        this.b = b;
    }
    
    public static gea a(final Float n, final Pair pair) {
        return new gea(n, pair);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gea) {
            final gea gea = (gea)o;
            final Float a = this.a;
            if (a == null) {
                if (gea.a != null) {
                    return false;
                }
            }
            else if (!a.equals(gea.a)) {
                return false;
            }
            final Pair b = this.b;
            final Pair b2 = gea.b;
            if (b == null) {
                if (b2 != null) {
                    return false;
                }
            }
            else if (!b.equals((Object)b2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Float a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Pair b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 48 + String.valueOf(value2).length());
        sb.append("FocusDistanceResult{focusDistance=");
        sb.append(value);
        sb.append(", focusRange=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
