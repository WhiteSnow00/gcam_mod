import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class jfp extends kwp
{
    final /* synthetic */ jfr a;
    private final kvs b;
    private final boolean c;
    private final ksh d;
    
    public jfp(final jfr a, final kvs b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final kse d = a.d;
        String s;
        if (!c) {
            s = "VFE.FrameToImg";
        }
        else {
            s = "VFE.FrameToMd";
        }
        this.d = d.a(s);
    }
    
    @Override
    public final void b() {
        if (this.c) {
            this.d.a();
            this.a.e(this.b);
        }
    }
    
    @Override
    public final void c() {
        if (!this.c) {
            this.d.a();
            this.a.e(this.b);
        }
    }
    
    @Override
    public final Executor f() {
        return this.a.b;
    }
}
