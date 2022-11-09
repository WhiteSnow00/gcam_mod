import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class fcc extends kwp
{
    final /* synthetic */ Executor a;
    final /* synthetic */ ho b;
    final /* synthetic */ kvs c;
    
    public fcc(final Executor a, final ho b, final kvs c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b() {
        this.a.execute(new fcb(this.b, this.c));
    }
}
