// 
// Decompiled by Procyon v0.6.0
// 

public final class mhm implements mft
{
    public final float a;
    private final int b;
    
    public mhm() {
    }
    
    public mhm(final int b, final float a) {
        this.b = b;
        this.a = a;
    }
    
    public static final mhl c() {
        final mhl mhl = new mhl();
        mhl.a = 100.0f;
        mhl.b = 1;
        return mhl;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    public final boolean d() {
        return this.b == 3;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mhm)) {
            return false;
        }
        final mhm mhm = (mhm)o;
        final int b = this.b;
        final int b2 = mhm.b;
        if (b != 0) {
            return b == b2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(mhm.a);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        mfu.b(b);
        return ((b ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.a)) * 1000003;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.b);
        final float a2 = this.a;
        final String value = String.valueOf((Object)null);
        final StringBuilder sb = new StringBuilder(a.length() + 99 + String.valueOf(value).length());
        sb.append("CrashConfigurations{enablement=");
        sb.append(a);
        sb.append(", startupSamplePercentage=");
        sb.append(a2);
        sb.append(", metricExtensionProvider=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
