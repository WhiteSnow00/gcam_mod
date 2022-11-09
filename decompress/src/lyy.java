import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lyy extends lys
{
    final /* synthetic */ lvy b;
    
    public lyy(final Executor executor, final lvy b) {
        this.b = b;
        super(executor);
    }
    
    public final lwk i() {
        this.b.shutdown();
        return lwk.i(lwk.i(this.b.a.a(odx.a, lwt.m())).a(odx.a, new lyx(this)));
    }
}
