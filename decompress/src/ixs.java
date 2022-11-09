// 
// Decompiled by Procyon v0.6.0
// 

public final class ixs
{
    public final kre a;
    public final kqp b;
    public final niz c;
    private final lfu d;
    
    public ixs() {
    }
    
    public ixs(final lfu d, final kre a, final kqp b, final niz c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static ixs a(final lfu lfu, final kre kre, final kqp kqp) {
        return b(lfu, kre, kqp, nii.a);
    }
    
    public static ixs b(final lfu a, final kre b, final kqp c, final niz d) {
        final ixr ixr = new ixr(null);
        if (a == null) {
            throw new NullPointerException("Null cameraFacing");
        }
        ixr.a = a;
        if (b != null) {
            ixr.b = b;
            ixr.c = c;
            ixr.d = d;
            final lfu a2 = ixr.a;
            if (a2 != null) {
                final kre b2 = ixr.b;
                if (b2 != null) {
                    final kqp c2 = ixr.c;
                    if (c2 != null) {
                        return new ixs(a2, b2, c2, ixr.d);
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            if (ixr.a == null) {
                sb.append(" cameraFacing");
            }
            if (ixr.b == null) {
                sb.append(" resolution");
            }
            if (ixr.c == null) {
                sb.append(" aspectRatio");
            }
            final String value = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
        throw new NullPointerException("Null resolution");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ixs) {
            final ixs ixs = (ixs)o;
            if (this.d.equals(ixs.d) && this.a.equals(ixs.a) && this.b.equals(ixs.b) && this.c.equals(ixs.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.d.hashCode() ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.a);
        final String value3 = String.valueOf(this.b);
        final String value4 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 67 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("ViewfinderConfig{cameraFacing=");
        sb.append(value);
        sb.append(", resolution=");
        sb.append(value2);
        sb.append(", aspectRatio=");
        sb.append(value3);
        sb.append(", format=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
