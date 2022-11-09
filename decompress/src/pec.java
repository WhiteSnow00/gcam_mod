// 
// Decompiled by Procyon v0.6.0
// 

final class pec extends ped
{
    private static final long serialVersionUID = 6312374661811000451L;
    
    public pec(final psr psr, final int n, final int n2) {
        super(psr, n, n2);
    }
    
    @Override
    public final void b() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        this.c();
    }
    
    final void c() {
        peb[] b = this.b;
        int length = b.length;
        final psr a = this.a;
        int n = 1;
        while (true) {
            final long value = this.d.get();
            long n2 = 0L;
        Label_0268:
            while (n2 != value) {
                if (this.e) {
                    this.i();
                    return;
                }
                final Throwable t = this.c.get();
                if (t != null) {
                    this.i();
                    a.cd(t);
                    return;
                }
                final int value2 = this.f.get();
                int i = 0;
                boolean b2 = true;
                while (i < b.length) {
                    final peb peb = b[i];
                    final ozc e = peb.e;
                    if (e != null) {
                        final Object bw = e.bW();
                        if (bw != null) {
                            a.ce(bw);
                            final long d = peb.d + 1L;
                            final int c = peb.c;
                            final peb[] array = b;
                            final int n3 = length;
                            if (d == c) {
                                peb.d = 0L;
                                peb.get().cb(d);
                            }
                            else {
                                peb.d = d;
                            }
                            ++n2;
                            if (n2 == value) {
                                b = array;
                                length = n3;
                                break Label_0268;
                            }
                            b2 = false;
                        }
                    }
                    ++i;
                }
                if (value2 == 0) {
                    if (!b2) {
                        continue;
                    }
                    a.cc();
                    return;
                }
                else {
                    if (b2) {
                        break;
                    }
                    continue;
                }
            }
            if (n2 == value) {
                if (this.e) {
                    this.i();
                    return;
                }
                final Throwable t2 = this.c.get();
                if (t2 != null) {
                    this.i();
                    a.cd(t2);
                    return;
                }
                final int value3 = this.f.get();
                int n4 = 0;
                int n5;
                boolean b3;
                while (true) {
                    n5 = length;
                    if (n4 >= n5) {
                        b3 = true;
                        break;
                    }
                    final ozc e2 = b[n4].e;
                    if (e2 != null && !e2.i()) {
                        b3 = false;
                        break;
                    }
                    ++n4;
                    length = n5;
                }
                length = n5;
                if (value3 == 0) {
                    if (b3) {
                        a.cc();
                        return;
                    }
                    length = n5;
                }
            }
            if (n2 != 0L && value != Long.MAX_VALUE) {
                this.d.addAndGet(-n2);
            }
            int n6 = this.get();
            if (n6 == n && (n6 = this.addAndGet(-n)) == 0) {
                return;
            }
            n = n6;
        }
    }
    
    @Override
    public final void e() {
        this.f.decrementAndGet();
        this.b();
    }
    
    @Override
    public final void f(final Throwable t) {
        if (this.c.compareAndSet(null, t)) {
            this.h();
            this.b();
            return;
        }
        if (t != this.c.get()) {
            pip.g(t);
        }
    }
    
    @Override
    public final void g(final peb peb, final Object o) {
        if (this.get() == 0 && this.compareAndSet(0, 1)) {
            if (this.d.get() != 0L) {
                this.a.ce(o);
                if (this.d.get() != Long.MAX_VALUE) {
                    this.d.decrementAndGet();
                }
                final long d = peb.d + 1L;
                if (d >= peb.c) {
                    peb.d = 0L;
                    peb.get().cb(d);
                }
                else {
                    peb.d = d;
                }
            }
            else if (!peb.d().j(o)) {
                this.h();
                final oxx oxx = new oxx("Queue full?!");
                if (this.c.compareAndSet(null, oxx)) {
                    this.a.cd(oxx);
                    return;
                }
                pip.g(oxx);
                return;
            }
            if (this.decrementAndGet() == 0) {
                return;
            }
        }
        else {
            if (!peb.d().j(o)) {
                this.h();
                this.f(new oxx("Queue full?!"));
                return;
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
        }
        this.c();
    }
}
