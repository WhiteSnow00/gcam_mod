import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxa
{
    public final krr a;
    public final Object b;
    public final LinkedList c;
    public boolean d;
    public boolean e;
    public ofn f;
    public int g;
    private final Runnable h;
    
    public gxa(final krq krq, final Runnable h) {
        this.c = new LinkedList();
        this.e = false;
        this.f = ofn.f();
        this.h = h;
        this.a = krq.a("ProcessingSvcMgr");
        this.b = new Object();
        this.g = 3;
    }
    
    public final void a(final gxc gxc) {
        synchronized (this.b) {
            if (!this.c.contains(gxc)) {
                this.c.add(gxc);
                final krr a = this.a;
                final String value = String.valueOf(gxc);
                final int size = this.c.size();
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 42);
                sb.append("Task added [");
                sb.append(value);
                sb.append("]. Queue size now: ");
                sb.append(size);
                a.b(sb.toString());
                if (!this.e) {
                    this.b();
                }
                return;
            }
            throw new IllegalArgumentException("Task already enqueued");
        }
    }
    
    public final void b() {
        synchronized (this.b) {
            final int g = this.g;
            if (g == 3) {
                this.a.f("Starting service (was DESTROYED)");
                this.h.run();
                this.g = 1;
            }
            else if (g == 2) {
                this.a.f("Scheduling service restart, is shutting down");
                this.d = true;
            }
        }
    }
}
