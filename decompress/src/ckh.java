import java.util.List;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckh implements ckg
{
    private final cid a;
    private final pii b;
    private cgt c;
    
    public ckh(final pii b, final cid a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        final cgt c = this.c;
        c.getClass();
        return c.a(bjz);
    }
    
    @Override
    public final oey b() {
        final cgt c = this.c;
        c.getClass();
        return c.c();
    }
    
    @Override
    public final oey c(final kra kra) {
        final cgt c = this.c;
        c.getClass();
        return c.b(kra);
    }
    
    @Override
    public final void close() {
        try (final cgt c = this.c) {}
    }
    
    @Override
    public final void d(final cfo cfo, final Surface surface, final Surface surface2) {
        (this.c = ((chk)this.b).a()).d(cfo, surface, surface2);
        this.a.a(cic.b).c(this);
    }
    
    @Override
    public final void e() {
        final cgt c = this.c;
        c.getClass();
        c.f();
    }
    
    @Override
    public final void f(final List list) {
        final cgt c = this.c;
        c.getClass();
        c.e(list);
        ofi.n(null);
    }
}
