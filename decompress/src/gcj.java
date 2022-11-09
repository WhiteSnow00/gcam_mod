import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcj implements AutoCloseable
{
    public final Set a;
    public final List b;
    public final gcf c;
    private final List d;
    
    public gcj(final Set a, final gcf c) {
        this.a = a;
        this.b = new ArrayList();
        this.d = new ArrayList();
        this.c = c;
    }
    
    @Override
    public final void close() {
        ofi.w(knf.c(ofi.j(this.b), ofi.j(this.d), new gch(this)), new gcg(this), odx.a);
    }
}
