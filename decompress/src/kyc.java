import java.util.concurrent.Executor;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyc extends kxc implements krc
{
    private final kxw a;
    private final kyb b;
    private final kzx c;
    private final Set d;
    private Set e;
    private Set f;
    private boolean g;
    
    public kyc(final kxw a, final kyb b, final kzx c, final Set d, final Set set) {
        this.f = null;
        this.g = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = noi.F(set);
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        monitorenter(this);
        try {
            final Set f = this.f;
            f.getClass();
            for (final kwz kwz2 : f) {
                if (kwz == kwz2 && kwz2 instanceof ldk) {
                    ((ldk)kwz2).a.c(kwz, n);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aN(kvx kvx) {
        monitorenter(this);
        try {
            final Set f = this.f;
            f.getClass();
            njo.p(this.g ^ true, "on started invoked after FrameDistributor was closed!");
            final kjk kjk = new kjk();
            try {
                kjk.c(this.a.a());
                for (final kwz kwz : f) {
                    if (kwz instanceof ldk) {
                        kjk.c(((ldk)kwz).b.a());
                    }
                }
                final Set e = this.e;
                this.e = null;
                Set c;
                if (e != null && !e.isEmpty()) {
                    final Set d = this.a.d(this.d, e);
                    final Iterator iterator2 = e.iterator();
                    while (true) {
                        c = d;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        njo.o(d.contains(iterator2.next()));
                    }
                }
                else {
                    c = this.a.c(this.d);
                }
                final HashMap hashMap = new HashMap();
                final HashSet set = new HashSet();
                for (final kzp kzp : c) {
                    for (final kwz kwz2 : kzp.c.c) {
                        if (kwz2 instanceof ldw && ((ldw)kwz2).h() == kxd.a) {
                            set.add(kzp.c(kwz2));
                        }
                    }
                    kzp.i(kvx);
                    hashMap.put(kzp.c, kzp);
                }
                this.c.k(c);
                final Iterator iterator5 = set.iterator();
                while (true) {
                    final boolean hasNext = iterator5.hasNext();
                    boolean b = false;
                    if (!hasNext) {
                        break;
                    }
                    final leb leb = (leb)iterator5.next();
                    final kwz d2 = leb.d();
                    if (!(d2 instanceof ldk)) {
                        continue;
                    }
                    if (f.contains(d2)) {
                        final ldt a = ((ldk)d2).a;
                        if (leb.d().a() == a.b) {
                            b = true;
                        }
                        njo.d(b);
                        njo.d(a.c.equals(leb.d().b()));
                        a.j.add(leb);
                        a.d.execute(a.e);
                    }
                    else {
                        leb.k(null);
                    }
                }
                kvx = (kvx)this.b;
                final Set keySet = hashMap.keySet();
                final nog nog = new nog();
                synchronized (kvx) {
                    for (final kxz kxz : ((kyb)kvx).a) {
                        if (keySet.contains(kxz.h)) {
                            nog.g(kxz);
                        }
                    }
                    monitorexit(kvx);
                    final Iterator<Object> iterator7 = nog.f().iterator();
                    while (iterator7.hasNext()) {
                        kvx = (kvx)iterator7.next();
                        Object o = hashMap.get(((kxz)kvx).h);
                        ((kzp)o).getClass();
                        final lbe lbe = new lbe(((kzp)o).c, (kzp)o, ((kzp)o).a(false));
                        njo.e(lbe.b == ((kxz)kvx).h, "Frame does not match source!");
                        synchronized (kvx) {
                            Label_0858: {
                                if (((kxz)kvx).g) {
                                    lbe.c();
                                    break Label_0858;
                                }
                                ((kxz)kvx).b.addLast(lbe);
                                if (lbe.d()) {
                                    ((kxz)kvx).d.addLast(lbe);
                                }
                                else {
                                    ((kxz)kvx).c.addLast(lbe);
                                }
                                ((kxz)kvx).s();
                                o = ((kxz)kvx).f;
                                synchronized (o) {
                                    final Iterator iterator8 = ((kxz)kvx).f.iterator();
                                    while (iterator8.hasNext()) {
                                        ((kvt)iterator8.next()).a(lbe);
                                    }
                                    monitorexit(o);
                                    o = ((kxz)kvx).a;
                                    ((Executor)o).execute(new kxy((kxz)kvx, lbe));
                                }
                            }
                        }
                        break;
                    }
                    kvx = (kvx)c.iterator();
                    while (((Iterator)kvx).hasNext()) {
                        ((Iterator<kzp>)kvx).next().g();
                    }
                    if (e != null && !e.isEmpty()) {
                        this.close();
                    }
                    kjk.close();
                }
            }
            finally {
                try {
                    kjk.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)kvx).addSuppressed(t);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void aO(final lem lem) {
        monitorenter(this);
        try {
            final Set e = this.e;
            if (e != null && (lem == null || !lem.c())) {
                for (final kzp kzp : e) {
                    kzp.g();
                    kzp.f();
                }
                this.e = null;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.g) {
                monitorexit(this);
                return;
            }
            this.g = true;
            final Set e = this.e;
            this.e = null;
            monitorexit(this);
            if (e != null && !e.isEmpty()) {
                final Iterator iterator = e.iterator();
                while (iterator.hasNext()) {
                    ((kzp)iterator.next()).g();
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void h(final long n, final Set f) {
        synchronized (this) {
            this.f = f;
        }
    }
}
