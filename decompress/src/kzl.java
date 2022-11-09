import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzl
{
    public final noi a;
    public final noi b;
    public final noi c;
    public final noi d;
    public final int e;
    public final long f;
    private final int g;
    private final njp h;
    
    public kzl(final noi c, final noi a, final noi b, final noi d, int a2, final njp h) {
        final boolean empty = c.isEmpty();
        boolean b2 = true;
        njo.d(empty ^ true);
        if (a2 <= 0) {
            if (a2 == -1) {
                a2 = -1;
            }
            else {
                b2 = false;
            }
        }
        njo.g(b2, "Capacity %s must be greater than 0, or -1 to indicate that capacity is not tracked.", a2);
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = a2;
        this.h = h;
        this.f = leg.a(a);
        synchronized (lbi.class) {
            a2 = lbi.a;
            lbi.a = a2 + 1;
            monitorexit(lbi.class);
            this.g = a2;
        }
    }
    
    public final klj a() {
        return (klj)this.h.a();
    }
    
    @Override
    public final String toString() {
        final int g = this.g;
        final StringBuilder sb = new StringBuilder(23);
        sb.append("FrameStream-");
        sb.append(g);
        return sb.toString();
    }
}
