import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxw implements gxv
{
    public final List a;
    public final HashMap b;
    
    public gxw() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
    
    private final List e(final long n) {
        final ArrayList list = new ArrayList();
        for (final gxv gxv : this.a) {
            if (this.b.get(gxv) == null || (long)this.b.get(gxv) == n) {
                list.add(gxv);
            }
        }
        return list;
    }
    
    @Override
    public final void a(final gyn gyn, final gyo gyo) {
        Object o = this.a;
        monitorenter(o);
        try {
            final List e = this.e(gyn.a);
            monitorexit(o);
            o = e.iterator();
            while (((Iterator)o).hasNext()) {
                ((gxv)((Iterator)o).next()).a(gyn, gyo);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final gyn gyn, final him him) {
        Object o = this.a;
        monitorenter(o);
        try {
            final List e = this.e(gyn.a);
            monitorexit(o);
            o = e.iterator();
            while (((Iterator)o).hasNext()) {
                ((gxv)((Iterator)o).next()).b(gyn, him);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final gyn gyn) {
        Object o = this.a;
        monitorenter(o);
        try {
            final List e = this.e(gyn.a);
            monitorexit(o);
            o = e.iterator();
            while (((Iterator)o).hasNext()) {
                ((gxv)((Iterator)o).next()).c(gyn);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final gyn gyn, final gzz gzz) {
        Object o = this.a;
        monitorenter(o);
        try {
            final List e = this.e(gyn.a);
            monitorexit(o);
            o = e.iterator();
            while (((Iterator)o).hasNext()) {
                ((gxv)((Iterator)o).next()).d(gyn, gzz);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
