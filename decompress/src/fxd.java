import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

final class fxd implements oen
{
    final /* synthetic */ btf a;
    final /* synthetic */ flu b;
    final /* synthetic */ kjk c;
    final /* synthetic */ fxf d;
    
    public fxd(final fxf d, final btf a, final flu b, final kjk c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Throwable t) {
        if (!(t instanceof CancellationException)) {
            a.m(fxf.a.c(), "OneCamera failed to open, closing lifetime.", '\u0700', t);
        }
        this.c.close();
        this.b.a(new kuw("OneCamera failed to open"));
    }
}
