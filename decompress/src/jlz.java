// 
// Decompiled by Procyon v0.6.0
// 

final class jlz implements Runnable
{
    final /* synthetic */ jnb a;
    final /* synthetic */ jma b;
    
    public jlz(final jma b, final jnb a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a.c(this.a);
    }
}
