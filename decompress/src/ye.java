// 
// Decompiled by Procyon v0.6.0
// 

public final class ye extends Thread
{
    final /* synthetic */ pnd a;
    
    public ye(final pnd a, final Runnable runnable) {
        this.a = a;
        super(runnable);
        this.setName(plr.a("CXCP-IO-", plr.n(String.valueOf(a.b()))));
    }
}
