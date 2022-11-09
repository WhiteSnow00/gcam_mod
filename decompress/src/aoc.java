import androidx.work.impl.WorkDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoc implements Runnable
{
    private final akh a;
    private final String b;
    private final boolean c;
    
    static {
        aiy.b("StopWorkRunnable");
    }
    
    public aoc(final akh a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final akh a = this.a;
        final WorkDatabase d = a.d;
        final ajp f = a.f;
        final anb s = d.s();
        d.h();
        try {
            final String b = this.b;
            Object o = f.g;
            synchronized (o) {
                boolean b2 = f.d.containsKey(b);
                monitorexit(o);
                Label_0253: {
                    if (this.c) {
                        final ajp f2 = this.a.f;
                        final String b3 = this.b;
                        synchronized (f2.g) {
                            final aiy a2 = aiy.a();
                            String.format("Processor stopping foreground work %s", b3);
                            a2.d(new Throwable[0]);
                            b2 = ajp.e(b3, (akl)f2.d.remove(b3));
                            break Label_0253;
                        }
                    }
                    if (!b2 && s.h(this.b) == 2) {
                        s.k(1, this.b);
                    }
                    final ajp f3 = this.a.f;
                    final String b4 = this.b;
                    o = f3.g;
                    synchronized (o) {
                        final aiy a3 = aiy.a();
                        String.format("Processor stopping background work %s", b4);
                        a3.d(new Throwable[0]);
                        b2 = ajp.e(b4, (akl)f3.e.remove(b4));
                        monitorexit(o);
                        o = aiy.a();
                        String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, b2);
                        ((aiy)o).d(new Throwable[0]);
                        d.j();
                    }
                }
            }
        }
        finally {
            d.i();
        }
    }
}
