// 
// Decompiled by Procyon v0.6.0
// 

public final class dqp implements dqo
{
    final /* synthetic */ dqo a;
    final /* synthetic */ long b;
    
    public dqp(final dqo a, final long b) {
        this.a = a;
        this.b = b;
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
