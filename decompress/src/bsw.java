// 
// Decompiled by Procyon v0.6.0
// 

final class bsw implements Runnable
{
    final /* synthetic */ bsx a;
    
    public bsw(final bsx a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.a.close();
    }
}
