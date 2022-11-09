// 
// Decompiled by Procyon v0.6.0
// 

final class ase implements Runnable
{
    final /* synthetic */ atc a;
    final /* synthetic */ atd b;
    
    public ase(final atd b, final atc a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a().obtainMessage(2).sendToTarget();
        this.b.a().post(this.a.a);
    }
}
