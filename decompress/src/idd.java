// 
// Decompiled by Procyon v0.6.0
// 

public final class idd
{
    public niz a;
    public cgr b;
    private kmt c;
    private kmv d;
    private niz e;
    private idc f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private kra k;
    private String l;
    private Boolean m;
    
    public idd() {
    }
    
    public idd(final byte[] array) {
        this.a = nii.a;
        this.e = nii.a;
    }
    
    public final ide a() {
        final kmt c = this.c;
        if (c != null) {
            final kmv d = this.d;
            if (d != null) {
                final cgr b = this.b;
                if (b != null) {
                    final idc f = this.f;
                    if (f != null) {
                        final Long g = this.g;
                        if (g != null && this.h != null && this.i != null && this.j != null && this.k != null && this.l != null) {
                            if (this.m != null) {
                                return new ide(c, d, this.a, b, this.e, f, g, this.h, this.i, this.j, this.k, this.l, this.m);
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" camcorderCaptureRate");
        }
        if (this.d == null) {
            sb.append(" camcorderVideoResolution");
        }
        if (this.b == null) {
            sb.append(" outputVideo");
        }
        if (this.f == null) {
            sb.append(" timelapseMode");
        }
        if (this.g == null) {
            sb.append(" recordingDurationMs");
        }
        if (this.h == null) {
            sb.append(" outputDurationMs");
        }
        if (this.i == null) {
            sb.append(" frameCount");
        }
        if (this.j == null) {
            sb.append(" frameDropped");
        }
        if (this.k == null) {
            sb.append(" orientation");
        }
        if (this.l == null) {
            sb.append(" title");
        }
        if (this.m == null) {
            sb.append(" isSecureVideo");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final kmt c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null camcorderCaptureRate");
    }
    
    public final void c(final kmv d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null camcorderVideoResolution");
    }
    
    public final void d(final long n) {
        this.i = n;
    }
    
    public final void e(final long n) {
        this.j = n;
    }
    
    public final void f(final boolean b) {
        this.m = b;
    }
    
    public final void g(final niz e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null location");
    }
    
    public final void h(final kra k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null orientation");
    }
    
    public final void i(final long n) {
        this.h = n;
    }
    
    public final void j(final long n) {
        this.g = n;
    }
    
    public final void k(final idc f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null timelapseMode");
    }
    
    public final void l() {
        this.l = "";
    }
}
