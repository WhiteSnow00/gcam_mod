import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public class lhf implements krc
{
    public final Object a;
    public final long b;
    public final LinkedList c;
    public long d;
    public boolean e;
    
    public lhf(final long b) {
        this.b = b;
        this.d = 0L;
        this.e = false;
        this.a = new Object();
        this.c = new LinkedList();
    }
    
    public final lhc a(final long n) {
        this.d += n;
        this.d();
        return new lhc(this, n);
    }
    
    public final lhc b(final long n) {
        njo.k(n > 0L && n <= this.b, "%s is an illegal block size (Must be > 0 and <= %s", n, this.b);
        synchronized (this.a) {
            final boolean e = this.e;
            lhc a = null;
            if (!e && this.c.isEmpty() && n > 0L && this.d + n <= this.b) {
                a = this.a(n);
            }
            return a;
        }
    }
    
    public final oey c(final long n) {
        njo.k(n > 0L && n <= this.b, "%s is an illegal block size (Must be > 0 and <= %s", n, this.b);
        synchronized (this.a) {
            if (this.e) {
                return ofi.m(new kuw());
            }
            if (this.c.isEmpty() && this.d + n <= this.b) {
                return ofi.n(this.a(n));
            }
            final lhe lhe = new lhe(this, n);
            this.c.add(lhe);
            this.d();
            monitorexit(this.a);
            this.e();
            return lhe.a;
        }
    }
    
    @Override
    public final void close() {
        final ArrayList list = new ArrayList();
        final Object a = this.a;
        monitorenter(a);
        try {
            if (this.e) {
                monitorexit(a);
                return;
            }
            this.e = true;
            list.addAll(this.c);
            this.c.clear();
            this.d();
            monitorexit(a);
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((lhe)list.get(i)).a(null);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    protected void d() {
    }
    
    public final void e() {
        while (true) {
            final Object a = this.a;
            monitorenter(a);
            try {
                lhe lhe = this.c.peekFirst();
                if (lhe == null) {
                    monitorexit(a);
                }
                else {
                    final boolean e = this.e;
                    lhc a2 = null;
                    if (e) {
                        this.c.removeFirst();
                    }
                    else {
                        final long d = this.d;
                        final long b = lhe.b;
                        if (d + b <= this.b) {
                            a2 = this.a(b);
                            this.c.removeFirst();
                        }
                        else {
                            lhe = null;
                        }
                    }
                    monitorexit(a);
                    if (lhe != null) {
                        lhe.a(a2);
                        continue;
                    }
                }
                synchronized (this.a) {
                    this.d();
                }
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
    }
}
