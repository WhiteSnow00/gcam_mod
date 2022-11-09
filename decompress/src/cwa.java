// 
// Decompiled by Procyon v0.6.0
// 

public final class cwa
{
    public Integer a;
    public hpg b;
    
    public final cwb a() {
        final Integer a = this.a;
        if (a != null && this.b != null) {
            return new cwb(a, this.b);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" successiveSamplesRequired");
        }
        if (this.b == null) {
            sb.append(" suggestion");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
}
