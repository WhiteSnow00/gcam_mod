import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkt
{
    public static final nsd a;
    public final List b;
    public final niz c;
    public final kkn d;
    private final niz e;
    private final dkq f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/featurecentral/camera/FeatureCentralFrameConsumer");
    }
    
    public dkt(final Executor executor, final niz e, final niz c, final Set set, final dkq f) {
        this.d = kqm.c(executor);
        this.e = e;
        this.c = c;
        (this.b = dlz.a(set)).addAll(set);
        this.f = f;
    }
    
    final void a(final lfg a, final boa boa) {
        monitorenter(this);
        try {
            njo.o(this.c.g());
            njo.o(this.e.g());
            dlz.c("frame", this.b);
            this.f.a = a;
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((dly)iterator.next()).d(a, boa);
            }
            ((kvw)this.e.c()).k(new dkr(this));
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void b() {
        monitorenter(this);
        try {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((dly)iterator.next()).c();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
