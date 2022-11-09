import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class hjj implements hja, krc
{
    public final kri a;
    final /* synthetic */ hjk b;
    private final Executor c;
    
    public hjj(final hjk b, final kri a, final Executor c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a(final String s) {
        if (this.b.b.equals(s)) {
            final Object c = this.b.c();
            if (c == null) {
                return;
            }
            this.c.execute(new hji(this, c));
        }
    }
    
    @Override
    public final void close() {
        this.b.a.h(this);
    }
}
