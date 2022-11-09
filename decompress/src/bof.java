import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bof implements box
{
    private final boe a;
    private final irf b;
    private final efm c;
    private int d;
    
    public bof(final efm c, final Context e, final cxl cxl, final boe a) {
        this.c = c;
        this.a = a;
        this.d = 1;
        final irg irg = new irg();
        irg.d = a.a;
        irg.e = e;
        irg.a = a.b;
        irg.b = a.c;
        irg.h = a.d;
        irg.g = cxl.k(cxr.at);
        this.b = irg.a();
    }
    
    @Override
    public final void a() {
        this.c.h(this.b);
        this.d = 3;
        this.a.e.a();
    }
    
    @Override
    public final void b() {
        this.c.e(this.b);
        this.d = 2;
        this.a.e.b();
    }
    
    @Override
    public final int c() {
        return this.d;
    }
}
