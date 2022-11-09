import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class azj
{
    private final Queue a;
    
    public azj() {
        this.a = biv.h(20);
    }
    
    public abstract azu a();
    
    final azu b() {
        azu a;
        if ((a = this.a.poll()) == null) {
            a = this.a();
        }
        return a;
    }
    
    public final void c(final azu azu) {
        if (this.a.size() < 20) {
            this.a.offer(azu);
        }
    }
}
