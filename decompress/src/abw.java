import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abw
{
    public static final ThreadLocal a;
    public final zb b;
    final ArrayList c;
    public final abs d;
    public final Runnable e;
    long f;
    public boolean g;
    public final abv h;
    
    static {
        a = new ThreadLocal();
    }
    
    public abw(final abv h) {
        this.b = new zb();
        this.c = new ArrayList();
        this.d = new abs(this);
        this.e = new abr(this);
        this.f = 0L;
        this.g = false;
        this.h = h;
    }
    
    public final boolean a() {
        return Thread.currentThread() == this.h.a.getThread();
    }
}
