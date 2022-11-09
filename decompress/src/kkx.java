// 
// Decompiled by Procyon v0.6.0
// 

final class kkx implements Runnable
{
    final /* synthetic */ kjc a;
    final /* synthetic */ kkz b;
    
    public kkx(final kkz b, final kjc a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.aR(this.b.d);
    }
}
