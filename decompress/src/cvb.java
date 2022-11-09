import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvb
{
    private final Deque a;
    
    public cvb() {
        this.a = new ArrayDeque();
    }
    
    final niz a() {
        synchronized (this) {
            if (this.a.isEmpty()) {
                return nii.a;
            }
            return niz.i(this.a.getLast());
        }
    }
    
    final void b() {
        synchronized (this) {
            this.a.removeFirst();
            this.a.size();
        }
    }
    
    final void c(final cva cva) {
        synchronized (this) {
            this.a.addLast(cva);
            this.a.size();
        }
    }
}
