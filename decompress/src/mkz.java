// 
// Decompiled by Procyon v0.6.0
// 

public final class mkz implements mft
{
    public final boolean a;
    public final niz b;
    private final int c;
    
    public mkz() {
    }
    
    public mkz(final int c, final boolean a, final niz b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static final mky c() {
        final mky mky = new mky(null);
        mky.a = false;
        mky.b = nii.a;
        mky.c = 1;
        return mky;
    }
    
    @Override
    public final int b() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mkz)) {
            return false;
        }
        final mkz mkz = (mkz)o;
        final int c = this.c;
        final int c2 = mkz.c;
        if (c != 0) {
            return c == c2 && this.a == mkz.a && this.b.equals(mkz.b);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        mfu.b(c);
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((c ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.c);
        final boolean a2 = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(a.length() + 80 + String.valueOf(value).length());
        sb.append("StorageConfigurations{enablement=");
        sb.append(a);
        sb.append(", manualCapture=");
        sb.append(a2);
        sb.append(", dirStatsConfigurations=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
