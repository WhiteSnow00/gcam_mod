// 
// Decompiled by Procyon v0.6.0
// 

public final class miy implements mft
{
    private final long a;
    private final noi b;
    private final int c;
    
    public miy() {
    }
    
    public miy(final int c, final long a, final noi b) {
        this.c = c;
        this.a = a;
        this.b = b;
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
        if (!(o instanceof miy)) {
            return false;
        }
        final miy miy = (miy)o;
        final int c = this.c;
        final int c2 = miy.c;
        if (c != 0) {
            return c == c2 && this.a == miy.a && this.b.equals(miy.b);
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        mfu.b(c);
        final long a = this.a;
        return ((c ^ 0xF4243) * 1000003 ^ (int)(a ^ a >>> 32)) * 1000003 ^ ((nqr)this.b).c;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.c);
        final long a2 = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(a.length() + 117 + String.valueOf(value).length());
        sb.append("DebugMemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", debugMemoryServiceThrottleMs=");
        sb.append(a2);
        sb.append(", debugMemoryEventsToSample=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
