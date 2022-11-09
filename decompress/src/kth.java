import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class kth implements ktb
{
    private final ofn a;
    private final kse b;
    
    public kth(final kse b) {
        this.b = b;
        this.a = ofn.f();
    }
    
    @Override
    public final void a() {
        this.a.o(new ktg(2, kst.l, kst.l.b()));
    }
    
    @Override
    public final void b() {
        this.a.o(new ktg(2, kst.k, kst.k.b()));
    }
    
    @Override
    public final void c(final kst kst) {
        if (kst == kst.p) {
            this.a.o(new ktg(3, kst, kst.p.b()));
        }
        this.a.o(new ktg(2, kst, kst.b()));
    }
    
    @Override
    public final void d(final ljg ljg) {
        this.a.o(new ktg(1));
    }
    
    public final ktg e(final long n) {
        this.b.f("awaitResult");
        try {
            try {
                final Object o = this.a.get(n, TimeUnit.MILLISECONDS);
                final kse kse = this.b;
                kse.g();
                return (ktg)o;
            }
            finally {
                this.b.g();
                while (true) {}
                final Object o = new ktg(5);
                final kse kse = this.b;
            }
        }
        catch (final ExecutionException ex) {}
        catch (final TimeoutException ex2) {}
    }
}
