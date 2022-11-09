import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inu
{
    public Size a;
    public Size b;
    private Boolean c;
    private Boolean d;
    private jcb e;
    private jbm f;
    
    public inu() {
    }
    
    public inu(final inv inv) {
        this.a = inv.b;
        this.b = inv.c;
        this.c = inv.d;
        this.d = inv.e;
        this.e = inv.f;
        this.f = inv.g;
    }
    
    public final inv a() {
        final Size b = this.b;
        if (b != null) {
            final jcb e = this.e;
            if (e == null) {
                throw new IllegalStateException("Property \"orientation\" has not been set");
            }
            if (e != jcb.a && e != jcb.d) {
                this.b = new Size(Math.max(b.getWidth(), b.getHeight()), Math.min(b.getWidth(), b.getHeight()));
            }
            else {
                this.b = new Size(Math.min(b.getWidth(), b.getHeight()), Math.max(b.getWidth(), b.getHeight()));
            }
        }
        final Boolean c = this.c;
        if (c != null && this.d != null && this.e != null && this.f != null) {
            return new inv(this.a, this.b, c, this.d, this.e, this.f);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" isPreviewMaximized");
        }
        if (this.d == null) {
            sb.append(" hasCutout");
        }
        if (this.e == null) {
            sb.append(" orientation");
        }
        if (this.f == null) {
            sb.append(" mode");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.d = b;
    }
    
    public final void c() {
        this.c = false;
    }
    
    public final void d(final jbm f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null mode");
    }
    
    public final void e(final jcb e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null orientation");
    }
}
