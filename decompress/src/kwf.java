import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwf
{
    public kwv a;
    public kwv b;
    public kwv c;
    public kwv d;
    public Long e;
    public Integer f;
    private lfj g;
    private kwr h;
    private kwv i;
    private nnn j;
    private nns k;
    private nog l;
    private noi m;
    private kuu n;
    private kvp o;
    private noi p;
    private kxc q;
    
    public final kwg a() {
        final kuu n = this.n;
        niz niz;
        if (n == null) {
            niz = nii.a;
        }
        else {
            niz = niz.i(n);
        }
        if (!niz.g()) {
            this.n = new kuv();
        }
        final nnn j = this.j;
        if (j != null) {
            this.k = j.f();
        }
        else if (this.k == null) {
            this.k = nns.l();
        }
        final nog l = this.l;
        if (l != null) {
            this.m = l.f();
        }
        else if (this.m == null) {
            this.m = nqr.a;
        }
        final lfj g = this.g;
        if (g != null) {
            final kwr h = this.h;
            if (h != null) {
                final kwv a = this.a;
                if (a != null) {
                    final kwv b = this.b;
                    if (b != null) {
                        final kwv c = this.c;
                        if (c != null) {
                            final kwv d = this.d;
                            if (d != null) {
                                final kwv i = this.i;
                                if (i != null) {
                                    final kxc q = this.q;
                                    if (q != null) {
                                        final kuu n2 = this.n;
                                        if (n2 != null) {
                                            final kvp o = this.o;
                                            if (o != null) {
                                                final Long e = this.e;
                                                if (e != null && this.f != null) {
                                                    if (this.p != null) {
                                                        final kwg kwg = new kwg(g, h, a, b, c, d, i, q, this.k, this.m, n2, o, e, this.f, this.p, null, null);
                                                        final int c2 = ((nql)kwg.g).c;
                                                        final kwr b2 = kwg.b;
                                                        final kwr b3 = kwr.b;
                                                        final boolean b4 = false;
                                                        if (b2 == b3) {
                                                            final kwr b5 = kwr.b;
                                                            if (c2 > 2) {
                                                                throw new IllegalStateException(njo.b("At most 2 surfaces are supported in %s, but we get %s", b5, c2));
                                                            }
                                                            final nns g2 = kwg.g;
                                                            for (int c3 = ((nql)g2).c, k = 0; k < c3; ++k) {
                                                                final kxb kxb = g2.get(k);
                                                                njo.p(kxb.a == kxd.d || kxb.a == kxd.e || kxb.a == kxd.c || kxb.a == kxd.b, "Streams in highspeed operating mode must be a viewfinder or MediaRecorder/MediaCodec surface.");
                                                            }
                                                        }
                                                        njo.p(c2 > 0 || b4, "At least one stream should be provided");
                                                        return kwg;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" cameraId");
        }
        if (this.h == null) {
            sb.append(" operatingMode");
        }
        if (this.a == null) {
            sb.append(" template");
        }
        if (this.b == null) {
            sb.append(" captureTemplate");
        }
        if (this.c == null) {
            sb.append(" reprocessingTemplate");
        }
        if (this.d == null) {
            sb.append(" repeatingTemplate");
        }
        if (this.i == null) {
            sb.append(" repeatingCaptureTemplate");
        }
        if (this.q == null) {
            sb.append(" frameListener");
        }
        if (this.n == null) {
            sb.append(" fatalErrorHandler");
        }
        if (this.o == null) {
            sb.append(" cameraDeviceErrorListener");
        }
        if (this.e == null) {
            sb.append(" result3ATimeoutNs");
        }
        if (this.f == null) {
            sb.append(" result3ATimeoutFrameCount");
        }
        if (this.p == null) {
            sb.append(" quirks");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final nog b() {
        if (this.l == null) {
            this.l = noi.D();
        }
        return this.l;
    }
    
    public final void c(final Set set) {
        this.b().i(set);
    }
    
    public final void d(final kxb kxb) {
        if (this.j == null) {
            this.j = nns.e();
        }
        this.j.g(kxb);
    }
    
    public final void e(final kvp o) {
        if (o != null) {
            this.o = o;
            return;
        }
        throw new NullPointerException("Null cameraDeviceErrorListener");
    }
    
    public final void f(final lfj g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null cameraId");
    }
    
    public final void g(final kwr h) {
        if (h != null) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null operatingMode");
    }
    
    public final void h(final noi p) {
        if (p != null) {
            this.p = p;
            return;
        }
        throw new NullPointerException("Null quirks");
    }
    
    public final void i(final kwv i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null repeatingCaptureTemplate");
    }
    
    public final void j(final kxc q) {
        if (q != null) {
            this.q = q;
            return;
        }
        throw new NullPointerException("Null frameListener");
    }
}
