import java.util.Iterator;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class anr implements Runnable
{
    public final ajn d;
    
    public anr() {
        this.d = new ajn();
    }
    
    public static anr b(final String s, final akh akh, final boolean b) {
        return new anq(akh, s, b);
    }
    
    static final void c(final akh akh, final String s) {
        final WorkDatabase d = akh.d;
        final anb s2 = d.s();
        final ami u = d.u();
        final LinkedList list = new LinkedList();
        list.add(s);
        while (!list.isEmpty()) {
            final String s3 = list.remove();
            final int h = s2.h(s3);
            if (h != 3 && h != 4) {
                s2.k(6, s3);
            }
            list.addAll(u.a(s3));
        }
        final ajp f = akh.f;
        final Object g = f.g;
        monitorenter(g);
        try {
            final aiy a = aiy.a();
            String.format("Processor cancelling %s", s);
            a.d(new Throwable[0]);
            f.f.add(s);
            final akl akl = f.d.remove(s);
            akl akl2;
            if (akl == null) {
                akl2 = f.e.remove(s);
            }
            else {
                akl2 = akl;
            }
            ajp.e(s, akl2);
            if (akl != null) {
                f.d();
            }
            monitorexit(g);
            final Iterator iterator = akh.e.iterator();
            while (iterator.hasNext()) {
                ((ajq)iterator.next()).b(s);
            }
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
    
    static final void d(final akh akh) {
        ajr.b(akh.c, akh.d, akh.e);
    }
    
    public abstract void a();
    
    @Override
    public final void run() {
        try {
            this.a();
            this.d.a(ajc.a);
        }
        finally {
            final Throwable t;
            this.d.a(new aiz(t));
        }
    }
}
