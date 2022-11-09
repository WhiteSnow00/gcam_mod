import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class nsr
{
    public final TimeUnit a;
    public int b;
    private final int c;
    
    public nsr(final TimeUnit a) {
        this.b = -1;
        this.c = 10000;
        oce.g(a, "time unit");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nsr) {
            final nsr nsr = (nsr)o;
            final int c = nsr.c;
            if (this.a == nsr.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0x5A550;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("10000 ");
        sb.append(this.a);
        if (this.b > 0) {
            sb.append(" [skipped: ");
            sb.append(this.b);
            sb.append(']');
        }
        return sb.toString();
    }
}
