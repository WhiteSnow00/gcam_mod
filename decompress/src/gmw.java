import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gmw implements bkx
{
    final /* synthetic */ ofn a;
    final /* synthetic */ ofn b;
    final /* synthetic */ ofn c;
    final /* synthetic */ gmx d;
    
    public gmw(final gmx d, final ofn a, final ofn b, final ofn c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final oey a() {
        return this.c;
    }
    
    @Override
    public final oey b() {
        return this.a;
    }
    
    @Override
    public final oey c() {
        return this.b;
    }
    
    @Override
    public final void d() {
        ((Executor)this.d.f.c()).execute(new gmv(this, 1));
        final gmx d = this.d;
        d.e.a.aR(true);
        ((Executor)d.f.c()).execute(new gmr(d, 1));
    }
    
    @Override
    public final void e() {
        ((Executor)this.d.f.c()).execute(new gmv(this));
        final gmx d = this.d;
        d.n.g();
        d.c();
        d.e.a();
        d.e();
    }
}
