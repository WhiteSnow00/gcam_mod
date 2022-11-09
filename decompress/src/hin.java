import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hin
{
    public final him a;
    public final long b;
    public final String c;
    public final long d;
    
    public hin() {
    }
    
    public hin(final him a, final long b, final String c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static hin a(final him him, final long n, final String s) {
        return new hin(him, n, s, Process.myPid());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hin) {
            final hin hin = (hin)o;
            final him a = this.a;
            if (a == null) {
                if (hin.a != null) {
                    return false;
                }
            }
            else if (!a.equals(hin.a)) {
                return false;
            }
            if (this.b == hin.b && this.c.equals(hin.c) && this.d == hin.d) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final him a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final long b = this.b;
        final int hashCode2 = this.c.hashCode();
        final long d = this.d;
        return (((hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ hashCode2) * 1000003 ^ (int)(d >>> 32 ^ d);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final long b = this.b;
        final String c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 90 + c.length());
        sb.append("ShotInfo{shotId=");
        sb.append(value);
        sb.append(", shotIdForTracker=");
        sb.append(b);
        sb.append(", title=");
        sb.append(c);
        sb.append(", pid=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
