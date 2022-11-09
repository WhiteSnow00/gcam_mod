import java.util.concurrent.Executor;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcq implements jck
{
    public final oey b;
    private final Animator c;
    
    public jcq(final Animator c, final oey b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final oey a() {
        return this.b;
    }
    
    @Override
    public final void b(final jcj jcj) {
        ofi.w(this.b, new jcp(jcj), odx.a);
    }
    
    @Override
    public final void c() {
        this.c.cancel();
    }
}
