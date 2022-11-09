// 
// Decompiled by Procyon v0.6.0
// 

public final class mjr implements mft
{
    private final int a;
    private final boolean b;
    private final niz c;
    private final int d;
    
    public mjr() {
    }
    
    public mjr(final int a, final boolean b, final niz c) {
        this.d = 2;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int b() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mjr)) {
            return false;
        }
        final mjr mjr = (mjr)o;
        final int d = this.d;
        final int d2 = mjr.d;
        if (d != 0) {
            return d == d2 && this.a == mjr.a && this.b == mjr.b && this.c.equals(mjr.c);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int d = this.d;
        mfu.b(d);
        final int a = this.a;
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((d ^ 0xF4243) * 1000003 ^ a) * -721379959 ^ n) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.d);
        final int a2 = this.a;
        final String value = String.valueOf((Object)null);
        final boolean b = this.b;
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(a.length() + 131 + String.valueOf(value).length() + String.valueOf(value2).length());
        sb.append("NetworkConfigurations{enablement=");
        sb.append(a);
        sb.append(", batchSize=");
        sb.append(a2);
        sb.append(", urlSanitizer=");
        sb.append(value);
        sb.append(", enableUrlAutoSanitization=");
        sb.append(b);
        sb.append(", metricExtensionProvider=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
