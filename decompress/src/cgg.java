import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgg
{
    public kva a;
    public File b;
    public hia c;
    public hie d;
    public niz e;
    public llk f;
    public kre g;
    public Integer h;
    public Long i;
    private Long j;
    private Integer k;
    
    public cgg() {
    }
    
    public cgg(final byte[] array) {
        this.e = nii.a;
    }
    
    public final cgh a() {
        final kva a = this.a;
        if (a != null) {
            final File b = this.b;
            if (b != null) {
                final hia c = this.c;
                if (c != null) {
                    final hie d = this.d;
                    if (d != null) {
                        final llk f = this.f;
                        if (f != null) {
                            final kre g = this.g;
                            if (g != null) {
                                final Integer h = this.h;
                                if (h != null && this.i != null && this.j != null) {
                                    if (this.k != null) {
                                        return new cgh(a, b, c, d, this.e, f, g, h, this.i, this.j, this.k);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" exifInfo");
        }
        if (this.b == null) {
            sb.append(" filePath");
        }
        if (this.c == null) {
            sb.append(" gcaMediaFile");
        }
        if (this.d == null) {
            sb.append(" gcaMediaGroup");
        }
        if (this.f == null) {
            sb.append(" mimeType");
        }
        if (this.g == null) {
            sb.append(" size");
        }
        if (this.h == null) {
            sb.append(" orientation");
        }
        if (this.i == null) {
            sb.append(" takenTime");
        }
        if (this.j == null) {
            sb.append(" requestProcessingTimeMilliseconds");
        }
        if (this.k == null) {
            sb.append(" retries");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final long n) {
        this.j = n;
    }
    
    public final void c(final int n) {
        this.k = n;
    }
}
