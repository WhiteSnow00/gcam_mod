import java.util.LinkedList;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eel
{
    public static final nsd a;
    public final eeh b;
    public final eem c;
    public final Queue d;
    public final Object e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    private Thread m;
    private Thread n;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/video/EncoderDrainer");
    }
    
    public eel(final eeh b, final eem c) {
        this.d = new LinkedList();
        this.e = new Object();
        this.m = null;
        this.n = null;
        this.f = -1;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        synchronized (this) {
            if (this.n != null) {
                if (this.m != null) {
                    this.b.b();
                    this.g = true;
                    try {
                        this.m.join(1000L);
                    }
                    catch (final InterruptedException ex) {
                        a.m(eel.a.b(), "Failed to stop drainer", '\u0477', ex);
                    }
                    this.i = false;
                    if (this.m.isAlive()) {
                        a.l(eel.a.b(), "Stopping drainer timed out, forcing stop", '\u0475');
                        try {
                            this.m.join();
                        }
                        catch (final InterruptedException ex2) {
                            a.m(eel.a.b(), "Failed to stop drainer", '\u0476', ex2);
                        }
                    }
                    this.m = null;
                    this.h = true;
                    final Object e = this.e;
                    synchronized (e) {
                        this.e.notifyAll();
                        monitorexit(e);
                        try {
                            this.n.join(1000L);
                        }
                        catch (final InterruptedException e) {
                            a.m(eel.a.b(), "Failed to stop writer thread", '\u047a', (Throwable)e);
                        }
                        this.j = false;
                        if (this.n.isAlive()) {
                            a.l(eel.a.b(), "Stopping writer timed out, forcing stop", '\u0478');
                            try {
                                this.n.join();
                            }
                            catch (final InterruptedException e) {
                                a.m(eel.a.b(), "Failed to stop drainer", '\u0479', (Throwable)e);
                            }
                        }
                        this.n = null;
                        this.c.b();
                        this.b.c();
                        return;
                    }
                }
            }
            a.l(eel.a.b(), "stop called more than once!", '\u0474');
        }
    }
    
    public final boolean b() {
        synchronized (this) {
            if (this.n != null || this.m != null) {
                a.l(eel.a.b(), "start called more than once!", '\u047d');
                return true;
            }
            this.f = -1;
            this.g = false;
            this.h = false;
            this.i = true;
            this.j = true;
            this.k = 0;
            this.l = 0;
            if (!this.b.d()) {
                a.l(eel.a.b(), "Failed to start the encoder.", '\u047e');
                return false;
            }
            (this.n = new eei(this)).start();
            (this.m = new eej(this)).start();
            return true;
        }
    }
}
