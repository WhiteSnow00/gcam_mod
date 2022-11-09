import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyl implements oxp, oyi
{
    List a;
    volatile boolean b;
    
    @Override
    public final boolean b(final oxp oxp) {
        phn.g(oxp, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List a;
                    if ((a = this.a) == null) {
                        a = new LinkedList();
                        this.a = a;
                    }
                    a.add(oxp);
                    return true;
                }
            }
        }
        oxp.bX();
        return false;
    }
    
    @Override
    public final void bX() {
        if (this.b) {
            return;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return;
            }
            this.b = true;
            final List a = this.a;
            List list = null;
            this.a = null;
            monitorexit(this);
            if (a != null) {
                for (final oxp oxp : a) {
                    try {
                        oxp.bX();
                    }
                    finally {
                        final Throwable t;
                        psn.e(t);
                        List list2 = list;
                        if (list == null) {
                            list2 = new ArrayList();
                        }
                        list2.add(t);
                        list = list2;
                    }
                }
                if (list != null) {
                    if (list.size() == 1) {
                        throw phi.a((Throwable)list.get(0));
                    }
                    throw new oxw(list);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final boolean c(final oxp oxp) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            final List a = this.a;
            return a != null && a.remove(oxp);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final oxp oxp) {
        if (this.c(oxp)) {
            oxp.bX();
        }
    }
}
