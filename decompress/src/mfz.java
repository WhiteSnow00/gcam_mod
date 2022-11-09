// 
// Decompiled by Procyon v0.6.0
// 

public final class mfz implements mft
{
    private final int a;
    private final mfx b;
    
    public mfz() {
    }
    
    public mfz(final int a, final mfx b) {
        this.a = a;
        this.b = b;
    }
    
    public static final mfy c() {
        final mfy mfy = new mfy();
        mfy.b = mfx.a;
        mfy.a = 1;
        return mfy;
    }
    
    @Override
    public final int b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mfz)) {
            return false;
        }
        final mfz mfz = (mfz)o;
        final int a = this.a;
        final int a2 = mfz.a;
        if (a != 0) {
            return a == a2 && this.b.equals(mfz.b);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        mfu.b(a);
        return (a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.a);
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(a.length() + 60 + String.valueOf(value).length());
        sb.append("BatteryConfigurations{enablement=");
        sb.append(a);
        sb.append(", metricExtensionProvider=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
