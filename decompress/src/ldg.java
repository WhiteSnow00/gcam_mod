import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldg
{
    public final non a;
    public final Map b;
    public final /* synthetic */ ldh c;
    
    public ldg(final ldh c, final non a, final Map b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    final void a(final int n) {
        final nrv bn = this.a.s().bN();
        while (bn.hasNext()) {
            final Map.Entry<K, kxc> entry = bn.next();
            entry.getValue().i((long)entry.getKey(), n);
        }
    }
    
    public final void b(final ljh ljh, final lem lem) {
        final Long b = ldh.b(ljh);
        final kse a = this.c.a;
        final String value = String.valueOf(b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
        sb.append("onCaptureFailed_");
        sb.append(value);
        a.f(sb.toString());
        final kxc kxc = (kxc)this.a.get(b);
        kxc.getClass();
        kxc.aO(lem);
        synchronized (this.c) {
            final ldh c = this.c;
            if (!c.f) {
                c.h(b);
            }
            monitorexit(this.c);
            this.c.a.g();
        }
    }
}
