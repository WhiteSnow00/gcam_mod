import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzj implements hze
{
    public int a;
    public final Runnable b;
    public final Runnable c;
    private final hzf d;
    private final Executor e;
    private final String f;
    
    public hzj() {
        this.a = 1;
    }
    
    public hzj(final hzf d, final Runnable b, final Runnable c, final Executor e, final String f) {
        this.a = 1;
        this.d = d;
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public static hzi a() {
        return new hzi();
    }
    
    @Override
    public final void c(final hzf hzf) {
        if (hzf == hzf.i) {
            return;
        }
        int n;
        if (!hzf.a(this.d)) {
            n = 3;
        }
        else {
            n = 2;
        }
        final int a = this.a;
        if (a == 0) {
            throw null;
        }
        if (a == n) {
            return;
        }
        if (n == 2) {
            this.e.execute(new hzh(this, 1));
            return;
        }
        this.e.execute(new hzh(this));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hzj) {
            final hzj hzj = (hzj)o;
            if (this.d.equals(hzj.d) && this.b.equals(hzj.b) && this.c.equals(hzj.c) && this.e.equals(hzj.e) && this.f.equals(hzj.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.d.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.e);
        final String f = this.f;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 87 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(f).length());
        sb.append("TwoStateTemperatureListener{threshold=");
        sb.append(value);
        sb.append(", onEnable=");
        sb.append(value2);
        sb.append(", onDisable=");
        sb.append(value3);
        sb.append(", executor=");
        sb.append(value4);
        sb.append(", featureName=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
