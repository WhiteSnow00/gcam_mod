import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class eid
{
    public final gtn a;
    public final dxh b;
    public final AtomicBoolean c;
    public final eij d;
    
    public eid() {
    }
    
    public eid(final gtn a, final dxh b, final AtomicBoolean c, final eij d) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null gcamShot");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof eid) {
            final eid eid = (eid)o;
            if (this.a.equals(eid.a) && this.b.equals(eid.b) && this.c.equals(eid.c) && this.d.equals(eid.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 105 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("AstrolapseInflightShot{hdrPlusParallelInflightShot=");
        sb.append(value);
        sb.append(", gcamShot=");
        sb.append(value2);
        sb.append(", processingInitiated=");
        sb.append(value3);
        sb.append(", astrolapseSession=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
