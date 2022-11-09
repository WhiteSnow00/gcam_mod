// 
// Decompiled by Procyon v0.6.0
// 

final class gkp implements Runnable
{
    final /* synthetic */ kra a;
    final /* synthetic */ gkq b;
    
    public gkp(final gkq b, final kra a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.b.aR(this.a);
    }
}
