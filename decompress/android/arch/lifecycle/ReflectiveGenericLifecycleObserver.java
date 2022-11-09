// 
// Decompiled by Procyon v0.6.0
// 

package android.arch.lifecycle;

import java.util.List;

public class ReflectiveGenericLifecycleObserver implements j
{
    private final Object a;
    private final b b;
    
    public ReflectiveGenericLifecycleObserver(final Object a) {
        this.a = a;
        this.b = d.a.b(a.getClass());
    }
    
    @Override
    public final void a(final k k, final g g) {
        final b b = this.b;
        final Object a = this.a;
        b.a(b.a.get(g), k, g, a);
        b.a(b.a.get(g.g), k, g, a);
    }
}
