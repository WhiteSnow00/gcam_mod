// 
// Decompiled by Procyon v0.6.0
// 

public final class haf implements hae
{
    final /* synthetic */ hae a;
    final /* synthetic */ long b;
    
    public haf(final hae a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a() {
        return this.a.a();
    }
    
    @Override
    public final dli b() {
        return this.a.b();
    }
    
    @Override
    public final had c(final long n) {
        final had d = this.a.d(n);
        if (d != null && Math.abs(d.a - n) <= this.b) {
            return d;
        }
        return null;
    }
    
    @Override
    public final had d(final long n) {
        return this.a.d(n);
    }
    
    @Override
    public final void e() {
        this.a.e();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final long b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36);
        sb.append(value);
        sb.append("[maxTimeDiffNs=");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
