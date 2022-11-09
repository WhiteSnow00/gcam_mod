import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class gxn implements Runnable
{
    private final gxp a;
    private final gxo b;
    private final gyp c;
    private final kse d;
    
    public gxn(final gxp a, final gxo b, final gyp c, final kse d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        this.d.f("TaskDoneWrapper#run");
        try {
            this.c.run();
            this.a.a(this.c);
            final gxy a = this.b.a;
            Object o = this.a.f;
            synchronized (o) {
                Label_0234: {
                    if (a.b.a(-1) == 0) {
                        a.b.d();
                        monitorexit(o);
                        final Set b = this.b.b;
                        final gxp a2 = this.a;
                        o = a2.e;
                        synchronized (o) {
                            for (final lju lju : b) {
                                if (a2.e.get(lju) != null && !a2.g.contains(lju)) {
                                    a2.g.add(lju);
                                }
                            }
                            monitorexit(o);
                            final Runnable c = a.c;
                            if (c != null) {
                                this.d.f("TaskDoneWrapper#done#run");
                                o = this.c.d;
                                if (o == null) {
                                    c.run();
                                }
                                else {
                                    ((Executor)o).execute(c);
                                }
                                this.d.g();
                            }
                            break Label_0234;
                        }
                    }
                    monitorexit(o);
                }
                this.d.g();
            }
        }
        finally {
            this.a.a(this.c);
            while (true) {}
        }
    }
}
