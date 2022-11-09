// 
// Decompiled by Procyon v0.6.0
// 

public final class fmf
{
    public final flq a;
    public final fma b;
    
    public fmf() {
    }
    
    public fmf(final flq a, final fma b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null config");
    }
    
    public final ixs a() {
        return this.a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fmf) {
            final fmf fmf = (fmf)o;
            if (this.a.equals(fmf.a) && this.b.equals(fmf.b)) {
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
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 38 + String.valueOf(value2).length());
        sb.append("CaptureOneCameraRequest{config=");
        sb.append(value);
        sb.append(", key=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
