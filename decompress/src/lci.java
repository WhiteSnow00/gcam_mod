import java.util.concurrent.Future;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lci
{
    public final ldw b;
    protected final oey c;
    
    public lci(final ldw b, final oey c) {
        this.b = b;
        this.c = c;
    }
    
    public abstract ljo a();
    
    public final Surface c() {
        njo.o(this.c.isDone());
        return (Surface)ofi.v(this.c);
    }
}
