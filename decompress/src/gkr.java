// 
// Decompiled by Procyon v0.6.0
// 

final class gkr implements Runnable
{
    final /* synthetic */ kra a;
    final /* synthetic */ gks b;
    
    public gkr(final gks b, final kra a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.b.aR(this.a);
    }
}
