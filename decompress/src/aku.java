import java.util.concurrent.TimeUnit;
import java.util.List;
import android.content.Intent;
import android.os.PowerManager$WakeLock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aku implements ale, ajm, aol
{
    public final Context a;
    public final int b;
    public final String c;
    public final akz d;
    public final alf e;
    public PowerManager$WakeLock f;
    public boolean g;
    private final Object h;
    private int i;
    
    static {
        aiy.b("DelayMetCommandHandler");
    }
    
    public aku(final Context a, final int b, final String c, final akz d) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = new alf(a, d.j, this);
        this.g = false;
        this.i = 0;
        this.h = new Object();
    }
    
    private final void d() {
        synchronized (this.h) {
            this.e.b();
            this.d.c.a(this.c);
            final PowerManager$WakeLock f = this.f;
            if (f != null && f.isHeld()) {
                final aiy a = aiy.a();
                String.format("Releasing wakelock %s for WorkSpec %s", this.f, this.c);
                a.d(new Throwable[0]);
                this.f.release();
            }
        }
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        final aiy a = aiy.a();
        String.format("onExecuted %s, %s", s, b);
        a.d(new Throwable[0]);
        this.d();
        if (b) {
            final Intent e = akq.e(this.a, this.c);
            final akz d = this.d;
            d.d(new akw(d, e, this.b));
        }
        if (this.g) {
            final Intent b2 = akq.b(this.a);
            final akz d2 = this.d;
            d2.d(new akw(d2, b2, this.b));
        }
    }
    
    @Override
    public final void b(final String s) {
        final aiy a = aiy.a();
        String.format("Exceeded time limits on execution for %s", s);
        a.d(new Throwable[0]);
        this.c();
    }
    
    public final void c() {
        synchronized (this.h) {
            if (this.i < 2) {
                this.i = 2;
                final aiy a = aiy.a();
                String.format("Stopping work for WorkSpec %s", this.c);
                a.d(new Throwable[0]);
                final Intent f = akq.f(this.a, this.c);
                final akz d = this.d;
                d.d(new akw(d, f, this.b));
                if (this.d.d.f(this.c)) {
                    final aiy a2 = aiy.a();
                    String.format("WorkSpec %s needs to be rescheduled", this.c);
                    a2.d(new Throwable[0]);
                    final Intent e = akq.e(this.a, this.c);
                    final akz d2 = this.d;
                    d2.d(new akw(d2, e, this.b));
                }
                else {
                    final aiy a3 = aiy.a();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c);
                    a3.d(new Throwable[0]);
                }
            }
            else {
                final aiy a4 = aiy.a();
                String.format("Already stopped work for %s", this.c);
                a4.d(new Throwable[0]);
            }
        }
    }
    
    @Override
    public final void e(final List list) {
        if (!list.contains(this.c)) {
            return;
        }
        synchronized (this.h) {
            if (this.i == 0) {
                this.i = 1;
                final aiy a = aiy.a();
                String.format("onAllConstraintsMet for %s", this.c);
                a.d(new Throwable[0]);
                if (this.d.d.g(this.c)) {
                    final aon c = this.d.c;
                    final String c2 = this.c;
                    synchronized (c.d) {
                        final aiy a2 = aiy.a();
                        String.format("Starting timer for %s", c2);
                        a2.d(new Throwable[0]);
                        c.a(c2);
                        final aom aom = new aom(c, c2);
                        c.b.put(c2, aom);
                        c.c.put(c2, this);
                        c.a.schedule(aom, 600000L, TimeUnit.MILLISECONDS);
                        return;
                    }
                }
                this.d();
            }
            else {
                final aiy a3 = aiy.a();
                String.format("Already started work for %s", this.c);
                a3.d(new Throwable[0]);
            }
        }
    }
    
    @Override
    public final void f(final List list) {
        this.c();
    }
}
