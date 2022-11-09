import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpf
{
    public Boolean a;
    public String b;
    public Drawable c;
    public Runnable d;
    public Runnable e;
    public String f;
    public Runnable g;
    public Runnable h;
    public Runnable i;
    public Runnable j;
    private Long k;
    private Boolean l;
    
    public hpf() {
    }
    
    public hpf(final hpg hpg) {
        this.k = hpg.a;
        this.a = hpg.b;
        this.b = hpg.c;
        this.c = hpg.d;
        this.d = hpg.e;
        this.e = hpg.f;
        this.f = hpg.g;
        this.g = hpg.h;
        this.h = hpg.i;
        this.i = hpg.j;
        this.j = hpg.k;
        this.l = hpg.l;
    }
    
    public final hpg a() {
        hpg hpg = this.b();
        final String c = hpg.c;
        final boolean b = false;
        final boolean b2 = c != null || hpg.d != null;
        final Runnable e = hpg.e;
        njo.o(b2);
        njo.o(e == null || b2 || b);
        njo.o(true);
        final String c2 = hpg.c;
        if (c2 != null && hpg.g == null) {
            final hpf b3 = hpg.b();
            b3.f = c2;
            hpg = b3.b();
        }
        hpg a = hpg;
        if (hpg.a == 0L) {
            final hpf b4 = hpg.b();
            b4.c(true);
            b4.d(1L);
            a = b4.a();
        }
        return a;
    }
    
    public final hpg b() {
        final Long k = this.k;
        if (k != null && this.a != null && this.l != null) {
            return new hpg(k, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.l);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.k == null) {
            sb.append(" timeoutMillis");
        }
        if (this.a == null) {
            sb.append(" autoHideOnClick");
        }
        if (this.l == null) {
            sb.append(" sticky");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void c(final boolean b) {
        this.l = b;
    }
    
    public final void d(final long n) {
        this.k = n;
    }
}
