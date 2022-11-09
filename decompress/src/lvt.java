// 
// Decompiled by Procyon v0.6.0
// 

final class lvt implements Runnable
{
    final /* synthetic */ Object a;
    final /* synthetic */ lvv b;
    
    public lvt(final lvv b, final Object a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            final lvv b = this.b;
            b.c.a(this.a, b.e, b.a);
        }
        finally {
            final Throwable t;
            this.b.a(t);
        }
    }
}
