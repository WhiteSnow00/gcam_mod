// 
// Decompiled by Procyon v0.6.0
// 

final class nso implements Runnable
{
    final /* synthetic */ nsn a;
    final /* synthetic */ nsp b;
    
    public nso(final nsp b, final nsn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a.remove((Object)this.a);
    }
}
