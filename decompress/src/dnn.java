import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnn
{
    public int a;
    public int b;
    public int c;
    private final dlb d;
    private int e;
    private dnh f;
    private long g;
    private TimeUnit h;
    
    public dnn(final dlb d) {
        this.e = 9000;
        this.a = 1;
        this.f = dnm.a;
        this.c = 4;
        this.b = 30;
        this.g = 0L;
        this.h = null;
        this.d = d;
    }
    
    public final dni a() {
        if (this.h != null) {
            this.e = (int)(this.b * TimeUnit.SECONDS.convert(this.g, this.h));
        }
        final dnj dnj = new dnj(this.a);
        final int a = this.a;
        dng dng;
        if (a == 1) {
            dng = new dnk();
        }
        else {
            dng = new dnl(a);
        }
        final int a2 = this.a;
        return new dni(this.d, this.e, a2, a2, this.c, this.f, dnj, dng);
    }
    
    public final void b() {
        this.f = dnm.b;
    }
    
    public final void c(final long g, final TimeUnit h) {
        this.g = g;
        this.h = h;
    }
}
