import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nrz extends nsj implements nsu
{
    protected nrz(final Level level) {
        super(level);
    }
    
    @Override
    protected final nvt a() {
        return nvr.a;
    }
    
    @Override
    protected final boolean b(final nsn nsn) {
        final ntp j = this.j();
        final int b = j.b();
        boolean b2 = false;
        int i = 0;
        while (i < b) {
            if (j.c(i).a == "eye3tag") {
                if (j.d(nsh.a) == null && j.d(nsh.g) == null) {
                    this.n(nsh.g, nsz.a);
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
        final nsi c = super.c;
        if (c != null) {
            if (nsn != null) {
                final Integer n = (Integer)c.d(nsh.b);
                final nsr nsr = (nsr)super.c.d(nsh.c);
                final nsi c2 = super.c;
                final nsp a = nss.a;
                final Object value = a.a.get((Object)nsn);
                Object o;
                if (value != null) {
                    o = value;
                }
                else {
                    final nss nss = new nss();
                    final Object putIfAbsent = a.a.putIfAbsent((Object)nsn, (Object)nss);
                    if (putIfAbsent != null) {
                        o = putIfAbsent;
                    }
                    else {
                        final int b3 = c2.b;
                        Object o2 = null;
                        Object o3;
                        for (int k = 0; k < b3; ++k, o2 = o3) {
                            if (!nsh.d.equals(c2.c(k))) {
                                o3 = o2;
                            }
                            else {
                                final Object e = c2.e(k);
                                o3 = o2;
                                if (e instanceof nsv) {
                                    if ((o3 = o2) == null) {
                                        o3 = new nso(a, nsn);
                                    }
                                    ((nsv)e).a();
                                }
                            }
                        }
                        o = nss;
                    }
                }
                final nss nss2 = (nss)o;
                if (n != null && nss2.b.getAndIncrement() % n != 0L) {
                    return b2;
                }
                if (nsr != null) {
                    final long b4 = super.b;
                    final long value2 = nss2.c.get();
                    final long n2 = nsr.a.toNanos(10000L) + value2;
                    if (n2 < 0L || (b4 < n2 && value2 != 0L) || !nss2.c.compareAndSet(value2, b4)) {
                        nss2.d.incrementAndGet();
                        return b2;
                    }
                    nsr.b = nss2.d.getAndSet(0);
                }
            }
            final nsz nsz = (nsz)super.c.d(nsh.g);
            if (nsz != null) {
                final nsx g = nsh.g;
                final nsi c3 = super.c;
                if (c3 != null) {
                    final int a2 = c3.a(g);
                    if (a2 >= 0) {
                        int l = a2 + a2;
                        int n3 = l + 2;
                        int b5;
                        while (true) {
                            b5 = c3.b;
                            if (n3 >= b5 + b5) {
                                break;
                            }
                            final Object o4 = c3.a[n3];
                            int n4 = l;
                            if (!o4.equals(g)) {
                                final Object[] a3 = c3.a;
                                a3[l] = o4;
                                a3[l + 1] = a3[n3 + 1];
                                n4 = l + 2;
                            }
                            n3 += 2;
                            l = n4;
                        }
                        c3.b = b5 - (n3 - l >> 1);
                        while (l < n3) {
                            c3.a[l] = null;
                            ++l;
                        }
                    }
                }
                this.n(nsh.a, new nsq((Throwable)this.j().d(nsh.a), nsz, nvw.b(nsj.class, nsz.f)));
            }
            b2 = true;
        }
        else {
            b2 = true;
        }
        return b2;
    }
}
