import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class poh extends pqq
{
    public int a;
    
    public poh() {
        super(0L, pqp.a);
        this.a = -1;
    }
    
    public Object a(final Object o) {
        return o;
    }
    
    public abstract Object b();
    
    public Throwable c(final Object o) {
        Object o2 = o;
        if (!(o instanceof pnq)) {
            o2 = null;
        }
        final pnq pnq = (pnq)o2;
        if (pnq != null) {
            return pnq.b;
        }
        return null;
    }
    
    public abstract pjl h();
    
    public void i(final Object o) {
        throw null;
    }
    
    public final void j(final Throwable t, final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            pip.e(t, t2);
        }
        Throwable t3;
        if ((t3 = t) == null) {
            t3 = t2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        poe.d(this.h().d(), new poc(sb.toString(), t3));
    }
    
    @Override
    public final void run() {
        final boolean a = pod.a;
        final pqr h = this.h;
        try {
            final pjl h2 = this.h();
            final pjl f = ((ppq)h2).f;
            final Object c = ((ppq)h2).c;
            final pjq d = f.d();
            final Object b = pqh.b(d, c);
            ppj b2;
            if (b != pqh.a) {
                b2 = pnv.b(f, d, b);
            }
            else {
                b2 = null;
            }
            try {
                final pjq d2 = f.d();
                final Object b3 = this.b();
                final Throwable c2 = this.c(b3);
                pou pou;
                if (c2 == null) {
                    if (this.a != 1) {
                        pou = null;
                    }
                    else {
                        pou = (pou)d2.b(pou.b);
                    }
                }
                else {
                    pou = null;
                }
                if (pou != null && !pou.r()) {
                    final CancellationException n = pou.n();
                    this.i(b3);
                    Throwable a2 = n;
                    if (pod.b) {
                        a2 = pqd.a(n, (pjz)f);
                    }
                    f.e(pip.a(a2));
                }
                else if (c2 != null) {
                    f.e(pip.a(c2));
                }
                else {
                    f.e(this.a(b3));
                }
                if (b2 == null || b2.G()) {
                    pqh.c(d, b);
                }
                Object a4;
                try {
                    h.k();
                    final piu a3 = piu.a;
                }
                finally {
                    final Throwable t;
                    a4 = pip.a(t);
                }
                this.j(null, pio.a(a4));
            }
            finally {
                if (b2 == null || b2.G()) {
                    pqh.c(d, b);
                }
            }
        }
        finally {
            Object a6;
            try {
                h.k();
                final piu a5 = piu.a;
            }
            finally {
                final Throwable t2;
                a6 = pip.a(t2);
            }
            final Throwable t3;
            this.j(t3, pio.a(a6));
        }
    }
}
