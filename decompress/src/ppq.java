// 
// Decompiled by Procyon v0.6.0
// 

public final class ppq extends poh implements pjz, pjl
{
    public Object b;
    public final Object c;
    public final pnf d;
    public final pnw e;
    public final pjl f;
    
    public ppq(final pnw e, final pjl f) {
        this.e = e;
        this.f = f;
        this.b = ppr.a;
        this.c = pqh.a(this.d());
        this.d = plv.g(null);
    }
    
    @Override
    public final Object b() {
        final Object b = this.b;
        final boolean a = pod.a;
        this.b = ppr.a;
        return b;
    }
    
    @Override
    public final StackTraceElement cn() {
        return null;
    }
    
    @Override
    public final pjq d() {
        return this.f.d();
    }
    
    @Override
    public final void e(final Object o) {
        final pjq d = this.f.d();
        Object o2 = plv.e(o);
        if (this.e.i(d)) {
            this.b = o2;
            this.a = 0;
            this.e.cj(d, this);
            return;
        }
        final boolean a = pod.a;
        final pol a2 = ppg.b.a();
        if (a2.o()) {
            this.b = o2;
            this.a = 0;
            a2.l(this);
            return;
        }
        a2.m(true);
        try {
            o2 = this.d();
            final Object b = pqh.b((pjq)o2, this.c);
            try {
                this.f.e(o);
                pqh.c((pjq)o2, b);
                while (a2.p()) {}
                a2.k(true);
            }
            finally {
                pqh.c((pjq)o2, b);
            }
        }
        finally {
            try {
                final Throwable t;
                this.j(t, null);
            }
            finally {
                a2.k(true);
                while (true) {}
            }
        }
    }
    
    @Override
    public final pjz g() {
        return (pjz)this.f;
    }
    
    @Override
    public final pjl h() {
        return this;
    }
    
    @Override
    public final void i(final Object o) {
        if (!(o instanceof pnr)) {
            return;
        }
        final pky a = ((pnr)o).a;
        throw null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.e);
        sb.append(", ");
        final pjl f = this.f;
        Object a = null;
        try {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(f);
            sb2.append('@');
            sb2.append(poe.b(f));
            sb2.toString();
        }
        finally {
            final Throwable t;
            a = pip.a(t);
        }
        Object string = a;
        if (pio.a(a) != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(f.getClass().getName());
            sb3.append('@');
            sb3.append(poe.b(f));
            string = sb3.toString();
        }
        sb.append((String)string);
        sb.append(']');
        return sb.toString();
    }
}
