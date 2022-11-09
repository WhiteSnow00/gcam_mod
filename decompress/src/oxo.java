import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxo implements oxp, oyi
{
    phm a;
    public volatile boolean b;
    
    @Override
    public final boolean b(final oxp oxp) {
        phn.g(oxp, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    phm a;
                    if ((a = this.a) == null) {
                        a = new phm();
                        this.a = a;
                    }
                    final Object[] d = a.d;
                    final int a2 = a.a;
                    int n = phm.a(oxp.hashCode()) & a2;
                    final Object o = d[n];
                    int n2 = n;
                    Label_0135: {
                        if (o != null) {
                            if (o.equals(oxp)) {
                                return true;
                            }
                            Object o2;
                            do {
                                n2 = (n + 1 & a2);
                                o2 = d[n2];
                                if (o2 == null) {
                                    break Label_0135;
                                }
                                n = n2;
                            } while (!o2.equals(oxp));
                            return true;
                        }
                    }
                    d[n2] = oxp;
                    int i = a.b + 1;
                    if ((a.b = i) >= a.c) {
                        final Object[] d2 = a.d;
                        int length = d2.length;
                        final int n3 = length + length;
                        final int a3 = n3 - 1;
                        final Object[] d3 = new Object[n3];
                        while (i != 0) {
                            Object o3;
                            do {
                                --length;
                                o3 = d2[length];
                            } while (o3 == null);
                            int n5;
                            int n4 = n5 = (phm.a(o3.hashCode()) & a3);
                            if (d3[n4] != null) {
                                do {
                                    n4 = (n5 = (n5 + 1 & a3));
                                } while (d3[n4] != null);
                            }
                            d3[n4] = d2[length];
                            --i;
                        }
                        a.a = a3;
                        a.c = (int)(n3 * 0.75f);
                        a.d = d3;
                    }
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
            final phm a = this.a;
            List list = null;
            this.a = null;
            monitorexit(this);
            if (a != null) {
                final Object[] d = a.d;
                List list2;
                for (int length = d.length, i = 0; i < length; ++i, list = list2) {
                    final Object o = d[i];
                    list2 = list;
                    if (o instanceof oxp) {
                        try {
                            ((oxp)o).bX();
                        }
                        finally {
                            final Throwable t;
                            psn.e(t);
                            list2 = list;
                            if (list == null) {
                                list2 = new ArrayList();
                            }
                            list2.add(t);
                        }
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
        phn.g(oxp, "disposables is null");
        if (this.b) {
            return false;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return false;
            }
            final phm a = this.a;
            Label_0145: {
                if (a != null) {
                    final Object[] d = a.d;
                    final int a2 = a.a;
                    final int n = phm.a(oxp.hashCode()) & a2;
                    final Object o = d[n];
                    if (o != null) {
                        int n2 = n;
                        if (o.equals(oxp)) {
                            a.b(n, d, a2);
                        }
                        else {
                            Object o2;
                            int n3;
                            do {
                                n3 = (n2 + 1 & a2);
                                o2 = d[n3];
                                if (o2 == null) {
                                    break Label_0145;
                                }
                                n2 = n3;
                            } while (!o2.equals(oxp));
                            a.b(n3, d, a2);
                        }
                        monitorexit(this);
                        return true;
                    }
                }
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
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
