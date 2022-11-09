import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mta
{
    public Boolean a;
    public Boolean b;
    public mte c;
    private Uri d;
    private omj e;
    private msu f;
    private nns g;
    private Boolean h;
    
    public final mtb a() {
        if (this.g == null) {
            this.g = nns.l();
        }
        final Uri d = this.d;
        if (d != null) {
            final omj e = this.e;
            if (e != null) {
                final msu f = this.f;
                if (f != null) {
                    final mte c = this.c;
                    if (c != null) {
                        final Boolean a = this.a;
                        if (a != null && this.b != null) {
                            if (this.h != null) {
                                return new mtb(d, e, f, this.g, c, a, this.b, this.h);
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" uri");
        }
        if (this.e == null) {
            sb.append(" schema");
        }
        if (this.f == null) {
            sb.append(" handler");
        }
        if (this.c == null) {
            sb.append(" variantConfig");
        }
        if (this.a == null) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if (this.b == null) {
            sb.append(" updateSequencingBugFix");
        }
        if (this.h == null) {
            sb.append(" enableTracing");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b() {
        this.h = false;
    }
    
    public final void c(final msu f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null handler");
    }
    
    public final void d(final omj e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null schema");
    }
    
    public final void e(final Uri d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
