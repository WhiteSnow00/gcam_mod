import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwb implements lwl
{
    final /* synthetic */ mdg a;
    private final /* synthetic */ int b;
    
    public lwb(final mdg a) {
        this.a = a;
    }
    
    public lwb(final mdg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final lwh a(final Object o, final Executor executor) {
        switch (this.b) {
            default: {
                return this.a.a().a(executor, lwt.k(o));
            }
            case 0: {
                return this.a.a().a(executor, lwt.k(o));
            }
        }
    }
}
