// 
// Decompiled by Procyon v0.6.0
// 

public final class mja implements mft
{
    public final boolean a;
    public final niz b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    
    public mja() {
    }
    
    public mja(final int g, final int f, final boolean a, final niz b, final boolean c, final boolean d, final boolean e) {
        this.g = g;
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static miz c() {
        final miz miz = new miz(null);
        miz.a = 3;
        final Boolean value = false;
        miz.b = value;
        miz.c = nii.a;
        miz.d = value;
        miz.f = true;
        miz.e = value;
        miz.g = 1;
        return miz;
    }
    
    @Override
    public final int a() {
        return this.f;
    }
    
    @Override
    public final int b() {
        return this.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mja)) {
            return false;
        }
        final mja mja = (mja)o;
        final int g = this.g;
        final int g2 = mja.g;
        if (g != 0) {
            return g == g2 && this.f == mja.f && this.a == mja.a && this.b.equals(mja.b) && this.c == mja.c && this.d == mja.d && this.e == mja.e;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int g = this.g;
        mfu.b(g);
        final int f = this.f;
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.c) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.d) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        if (this.e) {
            n = 1231;
        }
        return ((((((g ^ 0xF4243) * 1000003 ^ f) * 1000003 ^ n2) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.g);
        final int f = this.f;
        final boolean a2 = this.a;
        final String value = String.valueOf(this.b);
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder(a.length() + 206 + String.valueOf(value).length());
        sb.append("MemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(f);
        sb.append(", recordMetricPerProcess=");
        sb.append(a2);
        sb.append(", metricExtensionProvider=");
        sb.append(value);
        sb.append(", forceGcBeforeRecordMemory=");
        sb.append(c);
        sb.append(", captureDebugMetrics=");
        sb.append(d);
        sb.append(", captureMemoryInfo=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
