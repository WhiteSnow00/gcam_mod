import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igq
{
    public int a;
    private igk b;
    private RectF c;
    private Float d;
    private Integer e;
    private Long f;
    
    public final igr a() {
        final int a = this.a;
        if (a != 0) {
            final igk b = this.b;
            if (b != null) {
                final RectF c = this.c;
                if (c != null) {
                    final Float d = this.d;
                    if (d != null && this.e != null) {
                        if (this.f != null) {
                            return new igr(a, b, c, d, this.e, this.f);
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" status");
        }
        if (this.b == null) {
            sb.append(" trackerType");
        }
        if (this.c == null) {
            sb.append(" roi");
        }
        if (this.d == null) {
            sb.append(" confidence");
        }
        if (this.e == null) {
            sb.append(" numberOfRefresherCalls");
        }
        if (this.f == null) {
            sb.append(" trackedLengthMs");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final float n) {
        this.d = n;
    }
    
    public final void c(final int n) {
        this.e = n;
    }
    
    public final void d(final RectF c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null roi");
    }
    
    public final void e(final long n) {
        this.f = n;
    }
    
    public final void f(final igk b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null trackerType");
    }
}
