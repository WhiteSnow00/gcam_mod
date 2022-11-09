import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nla extends nrv
{
    private Object a;
    
    protected nla(final Object a) {
        this.a = a;
    }
    
    protected abstract Object a(final Object p0);
    
    @Override
    public final boolean hasNext() {
        return this.a != null;
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            try {
                final Object a = this.a;
                this.a = this.a(a);
                return a;
            }
            finally {
                this.a = this.a(this.a);
            }
        }
        throw new NoSuchElementException();
    }
}
