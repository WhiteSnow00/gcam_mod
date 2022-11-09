import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class bgc implements bgj
{
    private final Set a;
    private boolean b;
    private boolean c;
    
    public bgc() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    @Override
    public final void a(final bgk bgk) {
        this.a.add(bgk);
        if (this.c) {
            bgk.g();
            return;
        }
        if (this.b) {
            bgk.h();
            return;
        }
        bgk.i();
    }
    
    final void b() {
        this.c = true;
        final Iterator iterator = biv.g(this.a).iterator();
        while (iterator.hasNext()) {
            ((bgk)iterator.next()).g();
        }
    }
    
    final void c() {
        this.b = true;
        final Iterator iterator = biv.g(this.a).iterator();
        while (iterator.hasNext()) {
            ((bgk)iterator.next()).h();
        }
    }
    
    final void d() {
        this.b = false;
        final Iterator iterator = biv.g(this.a).iterator();
        while (iterator.hasNext()) {
            ((bgk)iterator.next()).i();
        }
    }
    
    @Override
    public final void e(final bgk bgk) {
        this.a.remove(bgk);
    }
}
