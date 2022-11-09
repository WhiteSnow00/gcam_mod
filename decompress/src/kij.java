import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class kij extends kih
{
    public kij(final jrt jrt) {
        super(jrt);
    }
    
    @Override
    public final void c(final kgz kgz) {
        final ArrayList list = new ArrayList();
        final List b = kgz.b;
        if (b != null) {
            list.addAll(b);
        }
        this.f(new khv(mcn.p(kgz.a), list));
    }
}
