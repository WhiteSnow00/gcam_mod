// 
// Decompiled by Procyon v0.6.0
// 

public final class miz
{
    public Integer a;
    public Boolean b;
    public niz c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public int g;
    
    public miz() {
    }
    
    public miz(final byte[] array) {
        this.c = nii.a;
    }
    
    public final mja a() {
        final int g = this.g;
        if (g != 0) {
            final Integer a = this.a;
            if (a != null && this.b != null && this.d != null && this.e != null) {
                if (this.f != null) {
                    return new mja(g, a, this.b, this.c, this.d, this.e, this.f);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.g == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.b == null) {
            sb.append(" recordMetricPerProcess");
        }
        if (this.d == null) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if (this.e == null) {
            sb.append(" captureDebugMetrics");
        }
        if (this.f == null) {
            sb.append(" captureMemoryInfo");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        int g;
        if (!b) {
            g = 2;
        }
        else {
            g = 3;
        }
        this.g = g;
    }
}
