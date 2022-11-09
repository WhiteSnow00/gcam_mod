import java.util.concurrent.TimeUnit;
import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvn
{
    public static final Range a;
    public final cws b;
    public niz c;
    private final cwr d;
    private final cwr e;
    private final cvb f;
    private final boolean g;
    private final cvg h;
    
    static {
        a = Range.create((Comparable)(-10.0), (Comparable)20.0);
    }
    
    public cvn(final cvb f, final cxl cxl) {
        final cvl d = new cvl(this, 1);
        this.d = d;
        final cvl e = new cvl(this);
        this.e = e;
        this.b = new cws(d, e, TimeUnit.SECONDS.toMillis(1L));
        this.f = f;
        this.g = cxl.k(cww.d);
        this.h = new cvg(0.015f);
    }
    
    final void a(final float n, final float n2, final long n3) {
        synchronized (this) {
            final boolean g = this.g;
            boolean a = false;
            if (g) {
                final niz a2 = this.f.a();
                if (a2.g()) {
                    final gzn b = ((cva)a2.c()).a.b();
                    if (b != null) {
                        a = this.h.a(b.p, b.n);
                    }
                }
            }
            this.c = niz.i(new cvm(n, n2, a));
            this.b.b(n3);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.c = nii.a;
            this.b.a();
        }
    }
}
