// 
// Decompiled by Procyon v0.6.0
// 

final class hlp
{
    public hoz a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private int f;
    
    public hlp() {
    }
    
    public final hlq a() {
        final hoz a = this.a;
        if (a != null) {
            final int f = this.f;
            if (f != 0) {
                final Boolean b = this.b;
                if (b != null && this.c != null && this.d != null) {
                    if (this.e != null) {
                        return new hlq(a, f, b, this.c, this.d, this.e);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" entry");
        }
        if (this.f == 0) {
            sb.append(" zoomUiMode");
        }
        if (this.b == null) {
            sb.append(" isLayoutUpdate");
        }
        if (this.c == null) {
            sb.append(" isZoomInViewfinder");
        }
        if (this.d == null) {
            sb.append(" isVideoControlUiVisible");
        }
        if (this.e == null) {
            sb.append(" isZoomToggleEnabled");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.b = b;
    }
    
    public final void c(final boolean b) {
        this.d = b;
    }
    
    public final void d(final boolean b) {
        this.c = b;
    }
    
    public final void e(final boolean b) {
        this.e = b;
    }
    
    public final void f(final int f) {
        if (f != 0) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null zoomUiMode");
    }
}
