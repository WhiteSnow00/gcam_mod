import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class fxq
{
    public final fma a;
    public final fvp b;
    public final oey c;
    public final btf d;
    public final Future e;
    
    public fxq() {
    }
    
    public fxq(final fma a, final fvp b, final oey c, final btf d, final Future e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fxq) {
            final fxq fxq = (fxq)o;
            if (this.a.equals(fxq.a) && this.b.equals(fxq.b) && this.c.equals(fxq.c) && this.d.equals(fxq.d) && this.e.equals(fxq.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 76 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length());
        sb.append("StartupTransaction{cameraKey=");
        sb.append(value);
        sb.append(", camera=");
        sb.append(value2);
        sb.append(", starting=");
        sb.append(value3);
        sb.append(", closed=");
        sb.append(value4);
        sb.append(", previewSurface=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
