// 
// Decompiled by Procyon v0.6.0
// 

final class akm implements Runnable
{
    final /* synthetic */ ana a;
    final /* synthetic */ akn b;
    
    public akm(final akn b, final ana a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final aiy a = aiy.a();
        final int d = akn.d;
        String.format("Scheduling work %s", this.a.a);
        a.d(new Throwable[0]);
        this.b.a.c(this.a);
    }
}
