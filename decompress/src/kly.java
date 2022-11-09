import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class kly implements klj
{
    public volatile Object a;
    private final klr b;
    
    public kly(final Object a) {
        this.a = a;
        this.b = new klr(new klx(this));
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.b.a(kri, executor);
    }
    
    @Override
    public final Object aQ() {
        return this.b.aQ();
    }
    
    public final void c() {
        this.b.c();
    }
}
