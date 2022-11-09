import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

final class enl implements oen
{
    final /* synthetic */ btf a;
    final /* synthetic */ kjk b;
    final /* synthetic */ enm c;
    
    public enl(final enm c, final btf a, final kjk b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        if (t instanceof CancellationException) {
            a.m(enm.b.c(), "OneCamera open sequence was canceled, shutting down lifetime.", '\u0517', t);
        }
        else {
            a.m(enm.b.c(), "OneCamera failed to open, closing lifetime.", '\u0516', t);
        }
        this.b.close();
        this.c.n.a();
    }
}
