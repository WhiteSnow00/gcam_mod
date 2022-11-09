import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kei
{
    private final Object a;
    private Queue b;
    private boolean c;
    
    public kei() {
        this.a = new Object();
    }
    
    public final void a(final keh keh) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(keh);
        }
    }
    
    public final void b(final keg keg) {
        final Object a = this.a;
        monitorenter(a);
        try {
            if (this.b != null) {
                if (!this.c) {
                    this.c = true;
                    monitorexit(a);
                    while (true) {
                        synchronized (this.a) {
                            final keh keh = this.b.poll();
                            if (keh == null) {
                                this.c = false;
                                return;
                            }
                            monitorexit(this.a);
                            keh.a(keg);
                            continue;
                        }
                        break;
                    }
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
