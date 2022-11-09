import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyr
{
    final /* synthetic */ eys a;
    private final Future b;
    private long c;
    private long d;
    private String e;
    private final List f;
    
    public eyr(final eys a) {
        this.a = a;
        this.c = 0L;
        this.d = 0L;
        this.f = new ArrayList();
        this.b = a.d.schedule(new eyq(this), 60L, TimeUnit.SECONDS);
        this.c = SystemClock.elapsedRealtime();
    }
    
    public final void a() {
        synchronized (this) {
            this.b.cancel(true);
            synchronized (this) {
                final long n = SystemClock.elapsedRealtime() - this.c;
                monitorexit(this);
                if (n > eys.a) {
                    this.a.c.v(n, this.f);
                }
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.c(true);
        }
    }
    
    public final void c(final boolean d) {
        synchronized (this) {
            final List f = this.f;
            final okt m = oba.e.m();
            final String e = this.e;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oba oba = (oba)m.b;
            e.getClass();
            oba.a |= 0x2;
            oba.c = e;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long d2 = this.d;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oba oba2 = (oba)m.b;
            final int a = oba2.a | 0x1;
            oba2.a = a;
            oba2.b = elapsedRealtime - d2;
            oba2.a = (a | 0x4);
            oba2.d = d;
            f.add(m.h());
            if (d) {
                final krr b = this.a.b;
                final String value = String.valueOf(this.e);
                String concat;
                if (value.length() != 0) {
                    concat = "Task is complete:".concat(value);
                }
                else {
                    concat = new String("Task is complete:");
                }
                b.b(concat);
                return;
            }
            final krr b2 = this.a.b;
            final String value2 = String.valueOf(this.e);
            String concat2;
            if (value2.length() != 0) {
                concat2 = "Task seems stuck:".concat(value2);
            }
            else {
                concat2 = new String("Task seems stuck:");
            }
            b2.h(concat2);
        }
    }
    
    public final void d(final String e) {
        synchronized (this) {
            final krr b = this.a.b;
            final String value = String.valueOf(e);
            String concat;
            if (value.length() != 0) {
                concat = "Task started:".concat(value);
            }
            else {
                concat = new String("Task started:");
            }
            b.b(concat);
            this.d = SystemClock.elapsedRealtime();
            this.e = e;
        }
    }
}
