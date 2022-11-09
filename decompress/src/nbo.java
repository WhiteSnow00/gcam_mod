// 
// Decompiled by Procyon v0.6.0
// 

final class nbo implements Runnable
{
    final /* synthetic */ oqw a;
    
    public nbo(final oqw a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.close();
    }
}
