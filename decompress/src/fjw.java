import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjw
{
    public final fev a;
    public final dxk b;
    public final Map c;
    public final fjr d;
    private final niz e;
    
    public fjw(final niz e, final fjr d, final fev a, final dxk b) {
        this.c = new HashMap();
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public final fjv a(final long n, final him him) {
        synchronized (this) {
            final Map c = this.c;
            final Long value = n;
            njo.p(c.containsKey(value) ^ true, "Current session exists; didn't clear last one?");
            njo.p(this.e.g(), "Trying to create a tone map session with no microvideo API");
            final dxi a = this.b.a(him);
            final fjv fjv = new fjv(this, new fju(this, n, him));
            a.a(fjv);
            a.c(fjv);
            a.e(fjv);
            this.c.put(value, fjv);
            return fjv;
        }
    }
}
