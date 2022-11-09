import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkm
{
    private final Deque a;
    
    public dkm() {
        this.a = new ArrayDeque();
    }
    
    public final dkn a() {
        synchronized (this) {
            return this.a.peekLast();
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.a.removeFirst();
            this.a.size();
        }
    }
    
    public final void c(final dkn dkn) {
        synchronized (this) {
            this.a.addLast(dkn);
            this.a.size();
        }
    }
}
