import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mku implements mft
{
    public final int a;
    public final nns b;
    public final boolean c;
    public final int d;
    
    public mku() {
    }
    
    public mku(final int d, final int a, final nns b, final boolean c) {
        this.d = d;
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
        if (!(o instanceof mku)) {
            return false;
        }
        final mku mku = (mku)o;
        final int d = this.d;
        final int d2 = mku.d;
        if (d != 0) {
            return d == d2 && this.a == mku.a && nqb.t(this.b, mku.b) && this.c == mku.c;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int d = this.d;
        mfu.b(d);
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((d ^ 0xF4243) * 1000003 ^ a) * 1000003 ^ hashCode) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.d);
        final int a2 = this.a;
        final String value = String.valueOf(this.b);
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder(a.length() + 119 + String.valueOf(value).length());
        sb.append("DirStatsConfigurations{enablement=");
        sb.append(a);
        sb.append(", maxFolderDepth=");
        sb.append(a2);
        sb.append(", listPathMatchers=");
        sb.append(value);
        sb.append(", includeDeviceEncryptedStorage=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
