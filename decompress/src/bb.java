// 
// Decompiled by Procyon v0.6.0
// 

final class bb implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ bc b;
    
    public bb(final bc b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.run();
        }
        finally {
            this.b.a();
        }
    }
}
