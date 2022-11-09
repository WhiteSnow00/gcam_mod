// 
// Decompiled by Procyon v0.6.0
// 

public final class kww
{
    private Boolean a;
    private int b;
    private int c;
    private int d;
    
    public final kwx a() {
        final int b = this.b;
        if (b != 0) {
            final int c = this.c;
            if (c != 0) {
                final int d = this.d;
                if (d != 0) {
                    final Boolean a = this.a;
                    if (a != null) {
                        return new kwx(b, c, d, a);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" exposure");
        }
        if (this.c == 0) {
            sb.append(" focus");
        }
        if (this.d == 0) {
            sb.append(" whiteBalance");
        }
        if (this.a == null) {
            sb.append(" forCapture");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final int b) {
        if (b != 0) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null exposure");
    }
    
    public final void c(final int c) {
        if (c != 0) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null focus");
    }
    
    public final void d(final boolean b) {
        this.a = b;
    }
    
    public final void e(final int d) {
        if (d != 0) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null whiteBalance");
    }
}
