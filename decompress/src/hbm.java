import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbm
{
    public boolean a;
    public boolean b;
    public int c;
    public float d;
    public long e;
    public float f;
    public long g;
    public final ConcurrentLinkedQueue h;
    
    public hbm() {
        this.a = false;
        this.c = Integer.MIN_VALUE;
        this.d = Float.MIN_VALUE;
        this.e = 0L;
        this.f = Float.MIN_VALUE;
        this.g = 0L;
        this.h = new ConcurrentLinkedQueue();
    }
    
    public final void a(final boolean a) {
        this.a = a;
        for (itf itf : this.h) {}
    }
    
    public final boolean b() {
        return System.currentTimeMillis() <= this.e + 5000L;
    }
}
