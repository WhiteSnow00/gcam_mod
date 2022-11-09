import android.graphics.Rect;
import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inr
{
    private Size a;
    private Rect b;
    private Rect c;
    private Rect d;
    private Rect e;
    private Rect f;
    private Rect g;
    private Rect h;
    private Rect i;
    private Rect j;
    private Rect k;
    private Rect l;
    private Rect m;
    private Boolean n;
    private Boolean o;
    
    public final ins a() {
        final Size a = this.a;
        if (a != null) {
            final Rect b = this.b;
            if (b != null) {
                final Rect c = this.c;
                if (c != null) {
                    final Rect d = this.d;
                    if (d != null) {
                        final Rect e = this.e;
                        if (e != null) {
                            final Rect f = this.f;
                            if (f != null) {
                                final Rect g = this.g;
                                if (g != null) {
                                    final Rect h = this.h;
                                    if (h != null) {
                                        final Rect i = this.i;
                                        if (i != null) {
                                            final Rect j = this.j;
                                            if (j != null) {
                                                final Rect k = this.k;
                                                if (k != null) {
                                                    final Rect l = this.l;
                                                    if (l != null) {
                                                        final Rect m = this.m;
                                                        if (m != null) {
                                                            final Boolean n = this.n;
                                                            if (n != null) {
                                                                if (this.o != null) {
                                                                    return new ins(a, b, c, d, e, f, g, h, i, j, k, l, m, n, this.o);
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
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" window");
        }
        if (this.b == null) {
            sb.append(" previewOverlay");
        }
        if (this.c == null) {
            sb.append(" optionsMenuContainer");
        }
        if (this.d == null) {
            sb.append(" preview");
        }
        if (this.e == null) {
            sb.append(" uncoveredPreview");
        }
        if (this.f == null) {
            sb.append(" viewfinderCoverIconArea");
        }
        if (this.g == null) {
            sb.append(" zoomUi");
        }
        if (this.h == null) {
            sb.append(" bottomBar");
        }
        if (this.i == null) {
            sb.append(" gradientBar");
        }
        if (this.j == null) {
            sb.append(" fullScreen");
        }
        if (this.k == null) {
            sb.append(" modeSwitchUi");
        }
        if (this.l == null) {
            sb.append(" cutoutArea");
        }
        if (this.m == null) {
            sb.append(" modeSlider");
        }
        if (this.n == null) {
            sb.append(" needsRetry");
        }
        if (this.o == null) {
            sb.append(" zoomInViewfinder");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final Rect h) {
        if (h != null) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null bottomBar");
    }
    
    public final void c(final Rect l) {
        if (l != null) {
            this.l = l;
            return;
        }
        throw new NullPointerException("Null cutoutArea");
    }
    
    public final void d(final Rect j) {
        if (j != null) {
            this.j = j;
            return;
        }
        throw new NullPointerException("Null fullScreen");
    }
    
    public final void e(final Rect i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null gradientBar");
    }
    
    public final void f(final Rect m) {
        if (m != null) {
            this.m = m;
            return;
        }
        throw new NullPointerException("Null modeSlider");
    }
    
    public final void g(final Rect k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null modeSwitchUi");
    }
    
    public final void h(final boolean b) {
        this.n = b;
    }
    
    public final void i(final Rect c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null optionsMenuContainer");
    }
    
    public final void j(final Rect d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null preview");
    }
    
    public final void k(final Rect b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null previewOverlay");
    }
    
    public final void l(final Rect e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null uncoveredPreview");
    }
    
    public final void m(final Rect f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null viewfinderCoverIconArea");
    }
    
    public final void n(final Size a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null window");
    }
    
    public final void o(final boolean b) {
        this.o = b;
    }
    
    public final void p(final Rect g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null zoomUi");
    }
}
