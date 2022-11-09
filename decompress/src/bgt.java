import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgt implements bgk
{
    public final Set a;
    
    public bgt() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    @Override
    public final void g() {
        final Iterator iterator = biv.g(this.a).iterator();
        while (iterator.hasNext()) {
            ((bhy)iterator.next()).g();
        }
    }
    
    @Override
    public final void h() {
        final Iterator iterator = biv.g(this.a).iterator();
        while (iterator.hasNext()) {
            ((bhy)iterator.next()).h();
        }
    }
    
    @Override
    public final void i() {
        final Iterator iterator = biv.g(this.a).iterator();
        while (iterator.hasNext()) {
            ((bhy)iterator.next()).i();
        }
    }
}
