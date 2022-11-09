import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbi implements krc
{
    public final kkz a;
    final Collection b;
    final gwq c;
    
    public fbi(final gwq c, final kkz a, final Collection b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void close() {
        final nrw t = ((nns)this.b).t();
        while (t.hasNext()) {
            ((krc)t.next()).close();
        }
    }
}
