import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzi
{
    public String a;
    private hzf b;
    private Runnable c;
    private Runnable d;
    private Executor e;
    
    public final hzj a() {
        njo.i(this.b().a(hzf.c), "Cannot disable feature at NORMAL or lower, threshold = %s", this.b());
        final String a = this.a;
        if (a != null) {
            njo.e(njb.d(a) ^ true, "featureName cannot be blank.");
            final hzf b = this.b;
            if (b != null) {
                final Runnable c = this.c;
                if (c != null) {
                    final Runnable d = this.d;
                    if (d != null) {
                        final Executor e = this.e;
                        if (e != null) {
                            final String a2 = this.a;
                            if (a2 != null) {
                                return new hzj(b, c, d, e, a2);
                            }
                        }
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" threshold");
            }
            if (this.c == null) {
                sb.append(" onEnable");
            }
            if (this.d == null) {
                sb.append(" onDisable");
            }
            if (this.e == null) {
                sb.append(" executor");
            }
            if (this.a == null) {
                sb.append(" featureName");
            }
            final String value = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
        throw new IllegalStateException("Property \"featureName\" has not been set");
    }
    
    public final hzf b() {
        final hzf b = this.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Property \"threshold\" has not been set");
    }
    
    public final void c(final Executor e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null executor");
    }
    
    public final void d(final Runnable d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null onDisable");
    }
    
    public final void e(final Runnable c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null onEnable");
    }
    
    public final void f(final hzf b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null threshold");
    }
}
