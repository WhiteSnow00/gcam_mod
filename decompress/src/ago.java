import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ago extends aal
{
    private final List a;
    
    public ago() {
        this.a = new ArrayList(3);
    }
    
    private static final void h(final ConcurrentModificationException ex) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", ex);
    }
    
    @Override
    public final void d(final int n) {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((aal)iterator.next()).d(n);
            }
        }
        catch (final ConcurrentModificationException ex) {
            h(ex);
        }
    }
    
    @Override
    public final void e(final int n, final float n2, final int n3) {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((aal)iterator.next()).e(n, n2, n3);
            }
        }
        catch (final ConcurrentModificationException ex) {
            h(ex);
        }
    }
    
    @Override
    public final void f(final int n) {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((aal)iterator.next()).f(n);
            }
        }
        catch (final ConcurrentModificationException ex) {
            h(ex);
        }
    }
    
    public final void g(final aal aal) {
        this.a.add(aal);
    }
}
