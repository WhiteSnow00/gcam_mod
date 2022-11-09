import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ah extends ba
{
    public ah(final aq aq) {
        super(aq);
    }
    
    public final int a(final Object o) {
        final afn e = this.e();
        try {
            this.c(e, o);
            return e.a();
        }
        finally {
            this.f(e);
        }
    }
    
    public final int b(final Iterable iterable) {
        final afn e = this.e();
        try {
            final Iterator iterator = iterable.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                this.c(e, iterator.next());
                n += e.a();
            }
            this.f(e);
            return n;
        }
        finally {
            this.f(e);
            while (true) {}
        }
    }
    
    protected abstract void c(final afn p0, final Object p1);
}
