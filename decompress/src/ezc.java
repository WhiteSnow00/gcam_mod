import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezc
{
    public Boolean a;
    public int b;
    public int c;
    private String d;
    private Boolean e;
    private Float f;
    private String g;
    private Boolean h;
    private Boolean i;
    private Float j;
    private Rect k;
    private Boolean l;
    private Boolean m;
    private nyr n;
    private nzi o;
    private Boolean p;
    
    public final ezd a() {
        final int b = this.b;
        if (b != 0) {
            final String d = this.d;
            if (d != null) {
                final Boolean e = this.e;
                if (e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.a != null && this.k != null && this.l != null && this.m != null && this.c != 0 && this.n != null && this.o != null) {
                    if (this.p != null) {
                        return new ezd(b, d, e, this.f, this.g, this.h, this.i, this.j, this.a, this.k, this.l, this.m, this.c, this.n, this.o, this.p);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" mode");
        }
        if (this.d == null) {
            sb.append(" filename");
        }
        if (this.e == null) {
            sb.append(" frontFacing");
        }
        if (this.f == null) {
            sb.append(" zoom");
        }
        if (this.g == null) {
            sb.append(" flashSetting");
        }
        if (this.h == null) {
            sb.append(" gridLinesOn");
        }
        if (this.i == null) {
            sb.append(" selfieMirrorOn");
        }
        if (this.j == null) {
            sb.append(" timerSeconds");
        }
        if (this.a == null) {
            sb.append(" volumeButtonShutter");
        }
        if (this.k == null) {
            sb.append(" activeSensorSize");
        }
        if (this.l == null) {
            sb.append(" isSelfieFlashOn");
        }
        if (this.m == null) {
            sb.append(" rawMode");
        }
        if (this.c == 0) {
            sb.append(" afLockState");
        }
        if (this.n == null) {
            sb.append(" dualEvStats");
        }
        if (this.o == null) {
            sb.append(" frequentFaceMetadata");
        }
        if (this.p == null) {
            sb.append(" isPrivateStorage");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final Rect k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null activeSensorSize");
    }
    
    public final void c(final nyr n) {
        if (n != null) {
            this.n = n;
            return;
        }
        throw new NullPointerException("Null dualEvStats");
    }
    
    public final void d(final String d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null filename");
    }
    
    public final void e(final String g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null flashSetting");
    }
    
    public final void f(final nzi o) {
        if (o != null) {
            this.o = o;
            return;
        }
        throw new NullPointerException("Null frequentFaceMetadata");
    }
    
    public final void g(final boolean b) {
        this.e = b;
    }
    
    public final void h(final boolean b) {
        this.h = b;
    }
    
    public final void i(final boolean b) {
        this.p = b;
    }
    
    public final void j(final Boolean l) {
        if (l != null) {
            this.l = l;
            return;
        }
        throw new NullPointerException("Null isSelfieFlashOn");
    }
    
    public final void k(final Boolean m) {
        if (m != null) {
            this.m = m;
            return;
        }
        throw new NullPointerException("Null rawMode");
    }
    
    public final void l(final boolean b) {
        this.i = b;
    }
    
    public final void m(final float n) {
        this.j = n;
    }
    
    public final void n(final float n) {
        this.f = n;
    }
}
