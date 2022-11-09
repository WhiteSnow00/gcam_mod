import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class gop implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ Map b;
    final /* synthetic */ kwd c;
    final /* synthetic */ int d;
    final /* synthetic */ goq e;
    
    public gop(final goq e, final String a, final Map b, final kwd c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        try {
            this.hashCode();
            ReentrantLock reentrantLock;
            if (!this.a.equals(this.e.d)) {
                goq.a.c().E(1913).o("Out of date task, skipping.");
                reentrantLock = this.e.b;
            }
            else {
                final kzl kzl = this.b.get(this.a);
                final noi c = kzl.c;
                (this.e.e = this.c.r(kzl, this.d)).m(this.d);
                final goq e = this.e;
                e.e.k(e.h);
                final goq e2 = this.e;
                final kvu f = e2.f;
                if (f != null) {
                    e2.e.n(f);
                }
                reentrantLock = this.e.b;
            }
            reentrantLock.unlock();
        }
        finally {
            this.e.b.unlock();
            while (true) {}
        }
    }
}
