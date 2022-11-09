import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lks
{
    public lkb a;
    public Set b;
    public Set c;
    public Set d;
    public lko e;
    private nns f;
    
    public final lkt a() {
        final Set b = this.b;
        if (b != null) {
            final Set c = this.c;
            if (c != null) {
                final Set d = this.d;
                if (d != null) {
                    final lko e = this.e;
                    if (e != null) {
                        final nns f = this.f;
                        if (f != null) {
                            return new lkt(this.a, b, c, d, e, f);
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" publicMediaFiles");
        }
        if (this.c == null) {
            sb.append(" privateMediaFiles");
        }
        if (this.d == null) {
            sb.append(" cachedMediaFiles");
        }
        if (this.e == null) {
            sb.append(" mediaGroupInfoBuilder");
        }
        if (this.f == null) {
            sb.append(" listeners");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final nns f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null listeners");
    }
}
