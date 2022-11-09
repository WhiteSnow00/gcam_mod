// 
// Decompiled by Procyon v0.6.0
// 

final class jme implements UncaughtExceptionHandler
{
    final /* synthetic */ jmf a;
    
    public jme(final jmf a) {
        this.a = a;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        final jnj d = this.a.d;
        if (d != null) {
            d.o("Job execution failed", t);
        }
    }
}
