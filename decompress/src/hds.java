// 
// Decompiled by Procyon v0.6.0
// 

public final class hds implements Runnable
{
    final /* synthetic */ pii a;
    final /* synthetic */ kjm b;
    final /* synthetic */ ewy c;
    
    public hds(final pii a, final kjm b, final ewy c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        egz.d(this.b, this.c, (exn)this.a.get());
    }
}
