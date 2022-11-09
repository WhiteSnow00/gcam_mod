import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljq
{
    public final int a;
    public final List b;
    public final Executor c;
    public final lje d;
    public final ljh e;
    
    public ljq() {
    }
    
    public ljq(final int a, final List b, final Executor c, final lje d, final ljh e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ljq) {
            final ljq ljq = (ljq)o;
            if (this.a == ljq.a && this.b.equals(ljq.b) && this.c.equals(ljq.c) && this.d.equals(ljq.d) && this.e.equals(ljq.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 120 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("SessionConfigurationProxy{sessionType=");
        sb.append(a);
        sb.append(", outputConfigurations=");
        sb.append(value);
        sb.append(", executor=");
        sb.append(value2);
        sb.append(", stateCallback=");
        sb.append(value3);
        sb.append(", sessionParameters=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
