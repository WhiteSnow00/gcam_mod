// 
// Decompiled by Procyon v0.6.0
// 

final class ask implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ asn b;
    
    public ask(final asn b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.b.a(this.a);
    }
}
