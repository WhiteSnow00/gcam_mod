// 
// Decompiled by Procyon v0.6.0
// 

public final class mln implements mft
{
    public final float a;
    private final int b;
    
    public mln() {
    }
    
    public mln(final int b, final float a) {
        this.b = b;
        this.a = a;
    }
    
    public static final mlm c() {
        final mlm mlm = new mlm();
        mlm.a = 0.5f;
        mlm.b = 1;
        return mlm;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mln)) {
            return false;
        }
        final mln mln = (mln)o;
        final int b = this.b;
        final int b2 = mln.b;
        if (b != 0) {
            return b == b2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(mln.a);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        mfu.b(b);
        return (b ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.b);
        final float a2 = this.a;
        final StringBuilder sb = new StringBuilder(a.length() + 69);
        sb.append("TraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", samplingProbability=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
