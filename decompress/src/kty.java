import java.util.Collection;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public class kty implements ktb, krc
{
    public final Object a;
    public final CountDownLatch b;
    public final Set c;
    private ktx d;
    private ljg e;
    private boolean f;
    private final Queue g;
    private boolean h;
    private int i;
    
    public kty() {
        this.a = new Object();
        this.c = new HashSet();
        this.g = new LinkedList();
        this.b = new CountDownLatch(1);
        this.i = 1;
        this.f = false;
    }
    
    private final void f(final boolean b) {
        final Object a = this.a;
        monitorenter(a);
        try {
            this.h |= b;
            if (!this.f) {
                if (this.g.size() != 0) {
                    this.f = true;
                    monitorexit(a);
                    while (true) {
                        synchronized (this.a) {
                            final int size = this.g.size();
                            int i = 0;
                            if (size <= 0) {
                                if (this.h) {
                                    this.c.clear();
                                }
                                this.f = false;
                                return;
                            }
                            final ktx d = this.g.remove();
                            this.d = d;
                            final nns j = nns.j(this.c);
                            monitorexit(this.a);
                            while (i < j.size()) {
                                d.a((ktb)j.get(i));
                                ++i;
                            }
                            if (d == null) {
                                return;
                            }
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
    
    @Override
    public final void a() {
        synchronized (this.a) {
            final int i = this.i;
            boolean b;
            if (i != 1 && i != 2) {
                b = false;
            }
            else {
                this.i = 5;
                this.g.add(new ktu(1));
                b = true;
            }
            ljg e = this.e;
            if (e != null) {
                this.e = null;
            }
            else {
                e = null;
            }
            monitorexit(this.a);
            if (b) {
                this.f(true);
            }
            if (e != null) {
                e.close();
            }
            this.b.countDown();
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.a) {
            final int i = this.i;
            boolean b;
            if (i != 1 && i != 2) {
                b = false;
            }
            else {
                this.i = 3;
                this.g.add(new ktu());
                b = true;
            }
            monitorexit(this.a);
            if (b) {
                this.f(true);
            }
            this.a();
        }
    }
    
    @Override
    public final void c(final kst kst) {
        synchronized (this.a) {
            final int i = this.i;
            boolean b;
            if (i != 1 && i != 2) {
                b = false;
            }
            else {
                this.i = 4;
                this.g.add(new ktv(kst));
                b = true;
            }
            monitorexit(this.a);
            if (b) {
                this.f(true);
            }
            this.a();
        }
    }
    
    @Override
    public final void close() {
        this.a();
    }
    
    @Override
    public void d(final ljg ljg) {
        synchronized (this.a) {
            final int i = this.i;
            boolean b = true;
            boolean b2;
            if (i == 1) {
                this.i = 2;
                this.e = new ktt(ljg, this);
                this.g.add(new ktw(this.e));
                b2 = false;
            }
            else {
                b2 = true;
                b = false;
            }
            monitorexit(this.a);
            if (b) {
                this.f(false);
            }
            if (b2) {
                if (ljg != null) {
                    ljg.close();
                }
                this.a();
            }
        }
    }
    
    public final void e(final ktb ktb) {
        synchronized (this.a) {
            final int i = this.i;
            if (i != 3 && i != 4 && i != 5) {
                this.c.add(ktb);
            }
            final ktx d = this.d;
            monitorexit(this.a);
            if (d != null) {
                d.a(ktb);
            }
        }
    }
}
