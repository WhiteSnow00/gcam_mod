// 
// Decompiled by Procyon v0.6.0
// 

public final class mej
{
    public ofb a;
    public Integer b;
    public Integer c;
    public Boolean d;
    
    public final mek a() {
        final Integer b = this.b;
        if (b != null && this.c != null && this.d != null) {
            final mek mek = new mek(this.a, b, this.c, this.d);
            final int c = mek.c;
            boolean b2 = false;
            if (c > 0 && c <= 2) {
                b2 = true;
            }
            njo.q(b2, "Thread pool size must be less than or equal to %s", 2);
            return mek;
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" primesMetricExecutorPriority");
        }
        if (this.c == null) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if (this.d == null) {
            sb.append(" enableDeferredTasks");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
}
