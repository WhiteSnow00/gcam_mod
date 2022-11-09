// 
// Decompiled by Procyon v0.6.0
// 

final class aqs implements Runnable
{
    final /* synthetic */ byte[] a;
    final /* synthetic */ arc b;
    
    public aqs(final arc b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.b.a(this.a);
    }
}
