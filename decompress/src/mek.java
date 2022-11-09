// 
// Decompiled by Procyon v0.6.0
// 

public final class mek
{
    public final ofb a;
    public final int b;
    public final int c;
    public final boolean d;
    
    public mek() {
    }
    
    public mek(final ofb a, final int b, final int c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static mej a() {
        final mej mej = new mej();
        mej.b = 11;
        mej.c = 2;
        mej.d = true;
        return mej;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mek) {
            final mek mek = (mek)o;
            final ofb a = this.a;
            if (a == null) {
                if (mek.a != null) {
                    return false;
                }
            }
            else if (!a.equals(mek.a)) {
                return false;
            }
            if (this.b == mek.b && this.c == mek.c && this.d == mek.d) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final ofb a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int b = this.b;
        final int c = this.c;
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final int c = this.c;
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 162);
        sb.append("PrimesThreadsConfigurations{primesExecutorService=");
        sb.append(value);
        sb.append(", primesMetricExecutorPriority=");
        sb.append(b);
        sb.append(", primesMetricExecutorPoolSize=");
        sb.append(c);
        sb.append(", enableDeferredTasks=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
