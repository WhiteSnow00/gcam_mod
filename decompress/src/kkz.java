import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class kkz implements klv, ckp
{
    private volatile boolean a;
    public final Set b;
    public final Executor c;
    public volatile Object d;
    
    public kkz(final Object o) {
        this(o, new klw());
    }
    
    public kkz(final Object d, final klw c) {
        this.b = new CopyOnWriteArraySet();
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        final kjc kjc = new kjc(kri, executor);
        this.b.add(kjc);
        this.c.execute(new kkx(this, kjc));
        return new kky(this, kjc);
    }
    
    @Override
    public final Object aQ() {
        return this.d;
    }
    
    @Override
    public void aR(final Object o) {
        this.c.execute(new kkw(this, o));
    }
    
    public void c(final Object d) {
        try {
            njo.p(this.a ^ true, "Re-entrance isn't supported.");
            this.a = true;
            this.d = d;
            for (final kri kri : this.b) {
                try {
                    kri.aR(d);
                }
                catch (final RejectedExecutionException ex) {}
            }
            this.a = false;
        }
        finally {
            this.a = false;
            while (true) {}
        }
    }
    
    @Override
    public final String toString() {
        return nfa.d("ConcurrentObs").toString();
    }
}
