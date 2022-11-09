import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwv implements lwl
{
    final /* synthetic */ lxh a;
    final /* synthetic */ mdg b;
    
    public lwv(final lxh a, final mdg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 12 + String.valueOf(value2).length());
        sb.append(value);
        sb.append("thenAlways[");
        sb.append(value2);
        sb.append("]");
        return sb.toString();
    }
}
