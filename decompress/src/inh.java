import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inh implements exn, exl, exm
{
    public final klv a;
    private final kjm b;
    private final aig c;
    private ho d;
    
    public inh(final Context context, final kjm b) {
        this.b = b;
        this.c = new aig(context);
        this.a = new kkz(jvu.x());
    }
    
    @Override
    public final void bk() {
        final ing d = new ing(this);
        this.d = d;
        final aig c = this.c;
        final kjm b = this.b;
        b.getClass();
        d.getClass();
        final aie a = c.a;
        final Activity b2 = c.b;
        b.getClass();
        d.getClass();
        final ReentrantLock b3 = ahu.b;
        b3.lock();
        try {
            final ahp c2 = ((ahu)a).c;
            if (c2 == null) {
                d.a(new aif(pja.a));
                b3.unlock();
                return;
            }
            final CopyOnWriteArrayList d2 = ((ahu)a).d;
            final boolean b4 = d2 instanceof Collection;
            boolean b5 = false;
            if (!b4 || !d2.isEmpty()) {
                final Iterator iterator = d2.iterator();
                while (iterator.hasNext()) {
                    if (plr.b(((aht)iterator.next()).a, b2)) {
                        b5 = true;
                        break;
                    }
                }
            }
            final aht aht = new aht(b2, b, d);
            ((ahu)a).d.add(aht);
            Label_0323: {
                if (b5) {
                    final Iterator iterator2 = ((ahu)a).d.iterator();
                    while (true) {
                        Object next;
                        do {
                            final boolean hasNext = iterator2.hasNext();
                            final aif aif = null;
                            if (hasNext) {
                                next = iterator2.next();
                            }
                            else {
                                next = null;
                                final aht aht2 = (aht)next;
                                aif c3;
                                if (aht2 == null) {
                                    c3 = aif;
                                }
                                else {
                                    c3 = aht2.c;
                                }
                                if (c3 != null) {
                                    aht.a(c3);
                                }
                                break Label_0323;
                            }
                        } while (!plr.b(b2, ((aht)next).a));
                        continue;
                    }
                }
                c2.a(b2);
            }
            b3.unlock();
        }
        finally {
            b3.unlock();
            while (true) {}
        }
    }
    
    @Override
    public final void e() {
        final ho d = this.d;
        if (d != null) {
            final aie a = this.c.a;
            synchronized (ahu.b) {
                if (((ahu)a).c == null) {
                    return;
                }
                final ArrayList list = new ArrayList();
                for (final aht aht : ((ahu)a).d) {
                    if (aht.b == d) {
                        aht.getClass();
                        list.add(aht);
                    }
                }
                ((ahu)a).d.removeAll(list);
                final Iterator iterator2 = list.iterator();
            Label_0134:
                while (iterator2.hasNext()) {
                    final Activity a2 = ((aht)iterator2.next()).a;
                    final CopyOnWriteArrayList d2 = ((ahu)a).d;
                    if (!(d2 instanceof Collection) || !d2.isEmpty()) {
                        final Iterator iterator3 = d2.iterator();
                        while (iterator3.hasNext()) {
                            if (plr.b(((aht)iterator3.next()).a, a2)) {
                                continue Label_0134;
                            }
                        }
                    }
                    final ahp c = ((ahu)a).c;
                    if (c != null) {
                        c.b(a2);
                    }
                }
            }
        }
    }
}
