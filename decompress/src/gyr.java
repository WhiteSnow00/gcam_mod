import java.util.Iterator;
import android.graphics.Rect;
import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyr extends gyl
{
    private final gyp i;
    private final kse j;
    
    public gyr(final gyb gyb, final Executor executor, final gxz gxz, final hhy hhy, final kre kre, final niz niz, final kse j) {
        super(gyb, executor, gxz, 4, hhy, kre, 5, j);
        this.j = j;
        if (niz.g()) {
            final gyp i = (gyp)niz.c();
            this.i = i;
            final gyb f = i.f;
            final gyb f2 = this.f;
            final boolean b = true;
            njo.d(f == f2);
            njo.d(i.c == this.c && b);
            return;
        }
        this.i = null;
    }
    
    @Override
    public final void run() {
        this.j.f("PreviewChained");
        final gyb f = this.f;
        final Rect i = gyp.i(f.a, f.e);
        gyl.f(f);
        final int a = gyi.a(new kre(i.width(), i.height()), this.a);
        final gym b = this.b(f, a);
        try {
            this.j(this.e, b, 2);
            f.a.c();
            f.a.b();
            this.e(b, this.c(f.a, i, a), 2);
            final gyp j = this.i;
            Label_0499: {
                if (j != null) {
                    final gxz c = this.c;
                    final HashSet set = new HashSet(1);
                    set.add(j);
                    final Iterator iterator = set.iterator();
                    int n;
                    while (true) {
                        final boolean hasNext = iterator.hasNext();
                        n = 0;
                        boolean b2 = false;
                        if (!hasNext) {
                            break;
                        }
                        if (((gyp)iterator.next()).f == super.f) {
                            b2 = true;
                        }
                        njo.o(b2);
                    }
                    Object o = super.f;
                    final Iterator iterator2 = set.iterator();
                    while (iterator2.hasNext()) {
                        if (((gyp)iterator2.next()).f != o) {
                            throw new RuntimeException("ERROR:  Spawned tasks cannot reference new images!");
                        }
                        ++n;
                    }
                    final gyb f2 = super.f;
                    Label_0396: {
                        if (n == 0) {
                            break Label_0396;
                        }
                        synchronized (((gxp)c).e) {
                            final gxm gxm = ((gxp)c).e.get(f2.a);
                            gxm.getClass();
                            if (((gxp)c).e.get(f2.a) != null) {
                                gxm.a(n);
                                ((gxp)c).e.put(f2.a, gxm);
                                ((gxp)c).h += n;
                                monitorexit(((gxp)c).e);
                                o = ((gxp)c).f;
                                synchronized (((gxp)c).e) {
                                    final gxo gxo = ((gxp)c).f.get(this);
                                    gxo.getClass();
                                    njo.p(true, "Task NOT previously registered. ImageShadowTask booking-keeping is incorrect.");
                                    gxo.a.b.a(set.size());
                                    monitorexit(((gxp)c).e);
                                    ((gxp)c).c(set, gxo);
                                    break Label_0499;
                                }
                            }
                            throw new RuntimeException("Image Reference has already been released or has never been held.");
                        }
                    }
                }
            }
            this.c.b(f.a, this.d);
            this.j.g();
        }
        finally {
            this.c.b(f.a, this.d);
            while (true) {}
        }
    }
}
