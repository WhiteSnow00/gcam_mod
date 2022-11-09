import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class ppb implements pou, pnn, ppf
{
    private final pnf a;
    public final pnf c;
    
    public ppb() {
        this.c = plv.g(ppc.f);
        this.a = plv.g(null);
    }
    
    public static final pnm F(ppw ppw) {
        ppw ppw2;
        while (true) {
            ppw2 = ppw;
            if (!ppw.cm()) {
                break;
            }
            ppw = ppw.h();
        }
        while (true) {
            ppw = ppw2.g();
            if (!ppw.cm()) {
                if (ppw instanceof pnm) {
                    return (pnm)ppw;
                }
                ppw2 = ppw;
                if (ppw instanceof ppd) {
                    return null;
                }
                continue;
            }
            else {
                ppw2 = ppw;
            }
        }
    }
    
    private final Object G(Object u, final Object o) {
        if (!(u instanceof por)) {
            return ppc.a;
        }
        if ((!(u instanceof pok) && !(u instanceof poy)) || u instanceof pnm || o instanceof pnq) {
            final por por = (por)u;
            final ppd i = this.I(por);
            if (i != null) {
                final boolean b = por instanceof ppa;
                final pnm pnm = null;
                por por2;
                if (!b) {
                    por2 = null;
                }
                else {
                    por2 = por;
                }
                ppa ppa;
                if ((ppa = (ppa)por2) == null) {
                    ppa = new ppa(i, null);
                }
                synchronized (ppa) {
                    final pqe c;
                    if (ppa.h()) {
                        final pqe a = ppc.a;
                        return c;
                    }
                    ppa.a.c();
                    if (ppa != por && !this.c.c(por, ppa)) {
                        final pqe c2 = ppc.c;
                        return c;
                    }
                    final boolean a2 = pod.a;
                    final boolean g = ppa.g();
                    Object o2;
                    if (!(o instanceof pnq)) {
                        o2 = null;
                    }
                    else {
                        o2 = o;
                    }
                    final pnq pnq = (pnq)o2;
                    if (pnq != null) {
                        ppa.e(pnq.b);
                    }
                    Throwable d = ppa.d();
                    if (g) {
                        d = null;
                    }
                    monitorexit(ppa);
                    if (d != null) {
                        this.K(i, d);
                    }
                    por por3;
                    if (!(por instanceof pnm)) {
                        por3 = null;
                    }
                    else {
                        por3 = por;
                    }
                    final pnm pnm2 = (pnm)por3;
                    pnm f;
                    if (pnm2 == null) {
                        final ppd ck = por.ck();
                        if (ck != null) {
                            f = F(ck);
                        }
                        else {
                            f = pnm;
                        }
                    }
                    else {
                        f = pnm2;
                    }
                    if (f != null && this.E(ppa, f, o)) {
                        final pqe b2 = ppc.b;
                        return c;
                    }
                    u = this.u(ppa, o);
                    return c;
                }
            }
            return ppc.c;
        }
        final por por4 = (por)u;
        final boolean a3 = pod.a;
        if (!this.c.c(por4, ppc.a(o))) {
            return ppc.c;
        }
        this.l(o);
        this.J(por4, o);
        return o;
    }
    
    private final Throwable H(final Object o) {
        Throwable x;
        if (o != null && !(o instanceof Throwable)) {
            x = ((ppf)o).x();
        }
        else if (o != null) {
            x = (Throwable)o;
        }
        else {
            x = new pov(this.h(), null, this);
        }
        return x;
    }
    
    private final ppd I(final por por) {
        final ppd ck = por.ck();
        ppd ppd;
        if (ck != null) {
            ppd = ck;
        }
        else if (por instanceof pok) {
            ppd = new ppd();
        }
        else {
            if (!(por instanceof poy)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("State should have list: ");
                sb.append(por);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.L((poy)por);
            ppd = null;
        }
        return ppd;
    }
    
    private final void J(por g, Object b) {
        final pnl z = this.z();
        if (z != null) {
            z.d();
            this.B(ppe.a);
        }
        final boolean b2 = b instanceof pnq;
        Throwable t = null;
        if (!b2) {
            b = null;
        }
        final pnq pnq = (pnq)b;
        if (pnq != null) {
            b = pnq.b;
        }
        else {
            b = null;
        }
        if (g instanceof poy) {
            try {
                ((poy)g).c((Throwable)b);
                return;
            }
            finally {
                final StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(g);
                sb.append(" for ");
                sb.append(this);
                final Throwable t2;
                this.k(new pnt(sb.toString(), t2));
                return;
            }
        }
        final ppd ck = ((por)g).ck();
        if (ck != null) {
            final Object f = ck.f();
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            Throwable t3;
            poy poy;
            final Throwable t4;
            StringBuilder sb2;
            for (g = f; plr.b(g, ck) ^ true; g = ((ppw)g).g(), t = t3) {
                t3 = t;
                if (g instanceof poy) {
                    poy = (poy)g;
                    try {
                        poy.c((Throwable)b);
                    }
                    finally {
                        if (t != null) {
                            pip.e(t, t4);
                            t3 = t;
                        }
                        else {
                            sb2 = new StringBuilder();
                            sb2.append("Exception in completion handler ");
                            sb2.append(poy);
                            sb2.append(" for ");
                            sb2.append(this);
                            t3 = new pnt(sb2.toString(), t4);
                        }
                    }
                }
            }
            if (t != null) {
                this.k(t);
            }
        }
    }
    
    private final void K(final ppd ppd, final Throwable t) {
        final Object f = ppd.f();
        if (f != null) {
            ppw g = (ppw)f;
            Throwable t2 = null;
            while (plr.b(g, ppd) ^ true) {
                Throwable t3 = t2;
                if (g instanceof pow) {
                    final poy poy = (poy)g;
                    try {
                        poy.c(t);
                    }
                    finally {
                        if (t2 != null) {
                            final Throwable t4;
                            pip.e(t2, t4);
                            t3 = t2;
                        }
                        else {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Exception in completion handler ");
                            sb.append(poy);
                            sb.append(" for ");
                            sb.append(this);
                            final Throwable t4;
                            t3 = new pnt(sb.toString(), t4);
                        }
                    }
                }
                g = g.g();
                t2 = t3;
            }
            if (t2 != null) {
                this.k(t2);
            }
            this.N(t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
    
    private final void L(final poy poy) {
        final ppd ppd = new ppd();
        ppd.d.b(poy);
        ppd.c.b(poy);
        while (true) {
            while (poy.f() == poy) {
                if (poy.c.c(poy, ppd)) {
                    ppd.i(poy);
                    this.c.c(poy, poy.g());
                    return;
                }
            }
            continue;
        }
    }
    
    private final boolean M(final Object o, final ppd a, final poy poy) {
        final pqa pqa = new pqa(poy, this, o);
        while (true) {
            final ppw h = a.h();
            poy.d.b(h);
            poy.c.b(a);
            pqa.a = a;
            int n;
            if (!h.c.c(a, pqa)) {
                n = 0;
            }
            else if (pqa.a(h) == null) {
                n = 1;
            }
            else {
                n = 2;
            }
            switch (n) {
                default: {
                    continue;
                }
                case 2: {
                    return false;
                }
                case 1: {
                    return true;
                }
            }
        }
    }
    
    private final boolean N(final Throwable t) {
        if (this.co()) {
            return true;
        }
        final boolean b = t instanceof CancellationException;
        final pnl z = this.z();
        if (z != null && z != ppe.a) {
            return z.b(t) || b;
        }
        return b;
    }
    
    private static final String O(final Object o) {
        final boolean b = o instanceof ppa;
        final String s = "Active";
        String s2;
        if (b) {
            final ppa ppa = (ppa)o;
            if (ppa.g()) {
                s2 = "Cancelling";
            }
            else {
                s2 = s;
                if (ppa.h()) {
                    s2 = "Completing";
                }
            }
        }
        else if (o instanceof por) {
            if (((por)o).cl()) {
                s2 = s;
            }
            else {
                s2 = "New";
            }
        }
        else if (o instanceof pnq) {
            s2 = "Cancelled";
        }
        else {
            s2 = "Completed";
        }
        return s2;
    }
    
    protected final void A(final pou pou) {
        final boolean a = pod.a;
        if (pou == null) {
            this.B(ppe.a);
            return;
        }
        pou.s();
        final pnl o = pou.o(this);
        this.B(o);
        if (this.D()) {
            o.d();
            this.B(ppe.a);
        }
    }
    
    public final void B(final pnl a) {
        final pnf a2 = this.a;
        final int a3 = png.a;
        a2.a = a;
    }
    
    public final boolean C(Object o) {
        Object o2 = ppc.a;
        final boolean t = this.t();
        boolean b = true;
        Label_0092: {
            if (t) {
                while (true) {
                    do {
                        final Object v = this.v();
                        if (v instanceof por && (!(v instanceof ppa) || !((ppa)v).h())) {
                            o2 = this.G(v, new pnq(this.H(o)));
                        }
                        else {
                            o2 = ppc.a;
                            if (o2 != ppc.b) {
                                break Label_0092;
                            }
                            return true;
                        }
                    } while (o2 == ppc.c);
                    continue;
                }
            }
        }
        if (o2 == ppc.a) {
            final Throwable t2 = null;
            Throwable t3 = null;
            while (true) {
                final Object v2 = this.v();
                if (v2 instanceof ppa) {
                    synchronized (v2) {
                        final ppa ppa = (ppa)v2;
                        if (ppa.c() == ppc.e) {
                            final pqe d = ppc.d;
                            break;
                        }
                        final boolean g = ppa.g();
                        if (o != null || !g) {
                            if (t3 == null) {
                                t3 = this.H(o);
                            }
                            ppa.e(t3);
                        }
                        Throwable d2 = ppa.d();
                        if (g) {
                            d2 = t2;
                        }
                        monitorexit(v2);
                        if (d2 != null) {
                            this.K(((ppa)v2).b, d2);
                        }
                        final pqe a = ppc.a;
                        break;
                    }
                }
                if (!(v2 instanceof por)) {
                    o = ppc.d;
                    break;
                }
                if (t3 == null) {
                    t3 = this.H(o);
                }
                final por por = (por)v2;
                if (por.cl()) {
                    final boolean a2 = pod.a;
                    final ppd i = this.I(por);
                    if (i == null) {
                        continue;
                    }
                    if (!this.c.c(por, new ppa(i, t3))) {
                        continue;
                    }
                    this.K(i, t3);
                    o = ppc.a;
                    break;
                }
                else {
                    final Object g2 = this.G(v2, new pnq(t3));
                    if (g2 == ppc.a) {
                        o = new StringBuilder();
                        ((StringBuilder)o).append("Cannot happen in ");
                        ((StringBuilder)o).append(v2);
                        throw new IllegalStateException(((StringBuilder)o).toString().toString());
                    }
                    if (g2 == ppc.c) {
                        continue;
                    }
                    o = g2;
                    break;
                }
            }
        }
        else {
            o = o2;
        }
        if (o != ppc.a && o != ppc.b) {
            if (o != ppc.d) {
                this.f(o);
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public final boolean D() {
        return !(this.v() instanceof por);
    }
    
    public final boolean E(final ppa ppa, pnm f, final Object o) {
        while (pqf.e(f.a, false, new poz(this, ppa, f, o), 1) == ppe.a) {
            if ((f = F(f)) == null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final Object a(final Object o, final plc plc) {
        return pjv.c(this, o, plc);
    }
    
    @Override
    public final pjn b(final pjo pjo) {
        return pjv.d(this, pjo);
    }
    
    @Override
    public final pjo c() {
        return pou.b;
    }
    
    @Override
    public final pjq cg(final pjo pjo) {
        return pjv.e(this, pjo);
    }
    
    @Override
    public final pjq ch(final pjq pjq) {
        pjq.getClass();
        pjq.getClass();
        return pjv.f(this, pjq);
    }
    
    public boolean ci() {
        return true;
    }
    
    protected boolean co() {
        return false;
    }
    
    protected void f(final Object o) {
    }
    
    protected String h() {
        return "Job was cancelled";
    }
    
    public String i() {
        return poe.a(this);
    }
    
    public void k(final Throwable t) {
        throw t;
    }
    
    protected void l(final Object o) {
    }
    
    @Override
    public final void m(final ppf ppf) {
        ppf.getClass();
        this.C(ppf);
    }
    
    @Override
    public final CancellationException n() {
        final Object v = this.v();
        CancellationException ex;
        if (v instanceof ppa) {
            final Throwable d = ((ppa)v).d();
            if (d == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Job is still new or active: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString().toString());
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(poe.a(this));
            sb2.append(" is cancelling");
            ex = this.y(d, sb2.toString());
        }
        else {
            if (v instanceof por) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Job is still new or active: ");
                sb3.append(this);
                throw new IllegalStateException(sb3.toString().toString());
            }
            if (v instanceof pnq) {
                ex = this.y(((pnq)v).b, null);
            }
            else {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(poe.a(this));
                sb4.append(" has completed normally");
                ex = new pov(sb4.toString(), null, this);
            }
        }
        return ex;
    }
    
    @Override
    public final pnl o(final pnn pnn) {
        return (pnl)pqf.e(this, true, new pnm(pnn), 2);
    }
    
    @Override
    public final poj p(final boolean b, final boolean b2, final pky pky) {
        final Throwable t = null;
        pky pky3;
        if (b) {
            pky pky2;
            if (!(pky instanceof pow)) {
                pky2 = null;
            }
            else {
                pky2 = pky;
            }
            if ((pky3 = pky2) == null) {
                pky3 = new pot(pky);
            }
        }
        else {
            final boolean a = pod.a;
            pky3 = pky;
        }
        final poy poy = (poy)pky3;
        poy.b = this;
        while (true) {
            final Object v = this.v();
            if (v instanceof pok) {
                final pok pok = (pok)v;
                if (pok.a) {
                    if (this.c.c(v, pky3)) {
                        return (poj)pky3;
                    }
                    continue;
                }
                else {
                    poq poq;
                    final Object d = poq = (poq)new ppd();
                    if (!pok.a) {
                        poq = new poq((ppd)d);
                    }
                    this.c.c(pok, poq);
                }
            }
            else {
                if (!(v instanceof por)) {
                    if (b2) {
                        Object o;
                        if (!(v instanceof pnq)) {
                            o = null;
                        }
                        else {
                            o = v;
                        }
                        final pnq pnq = (pnq)o;
                        Throwable b3;
                        if (pnq != null) {
                            b3 = pnq.b;
                        }
                        else {
                            b3 = t;
                        }
                        pky.a(b3);
                    }
                    return ppe.a;
                }
                final ppd ck = ((por)v).ck();
                if (ck == null) {
                    if (v == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    this.L((poy)v);
                }
                else {
                    poj a2 = ppe.a;
                    Object d = null;
                    Label_0336: {
                        if (b && v instanceof ppa) {
                            synchronized (v) {
                                final ppa ppa = (ppa)v;
                                d = ppa.d();
                                if (d == null || (pky instanceof pnm && !ppa.h())) {
                                    if (!this.M(v, ck, (poy)pky3)) {
                                        continue;
                                    }
                                    if (d == null) {
                                        return (poj)pky3;
                                    }
                                    a2 = (poj)pky3;
                                }
                                break Label_0336;
                            }
                        }
                        d = null;
                    }
                    if (d != null) {
                        if (b2) {
                            pky.a(d);
                        }
                        return a2;
                    }
                    if (this.M(v, ck, poy)) {
                        return (poj)pky3;
                    }
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void q(final CancellationException ex) {
        this.C(ex);
    }
    
    @Override
    public final boolean r() {
        final Object v = this.v();
        return v instanceof por && ((por)v).cl();
    }
    
    @Override
    public final void s() {
    Label_0115:
        while (true) {
            final Object v = this.v();
            final boolean b = v instanceof pok;
            int n = -1;
            if (b) {
                if (((pok)v).a) {
                    n = 0;
                }
                else if (this.c.c(v, ppc.f)) {
                    n = 1;
                }
            }
            else if (v instanceof poq) {
                if (this.c.c(v, ((poq)v).a)) {
                    n = 1;
                }
            }
            else {
                n = 0;
            }
            switch (n) {
                default: {
                    continue;
                }
                case 0:
                case 1: {
                    break Label_0115;
                }
            }
        }
    }
    
    public boolean t() {
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.i());
        sb2.append('{');
        sb2.append(O(this.v()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(poe.b(this));
        return sb.toString();
    }
    
    public final Object u(final ppa ppa, Object o) {
        final boolean a = pod.a;
        final boolean b = o instanceof pnq;
        final Throwable t = null;
        final Throwable t2 = null;
        Object o2;
        if (!b) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        final pnq pnq = (pnq)o2;
        Throwable b2;
        if (pnq != null) {
            b2 = pnq.b;
        }
        else {
            b2 = null;
        }
        monitorenter(ppa);
        try {
            ppa.g();
            final Object c = ppa.c();
            ArrayList list;
            if (c == null) {
                list = ppa.i();
            }
            else if (c instanceof Throwable) {
                list = ppa.i();
                list.add(c);
            }
            else {
                if (!(c instanceof ArrayList)) {
                    o = new StringBuilder();
                    ((StringBuilder)o).append("State is ");
                    ((StringBuilder)o).append(c);
                    o = new IllegalStateException(((StringBuilder)o).toString().toString());
                    throw o;
                }
                list = (ArrayList)c;
            }
            final Throwable d = ppa.d();
            if (d != null) {
                list.add(0, d);
            }
            if (b2 != null && (plr.b(b2, d) ^ true)) {
                list.add(b2);
            }
            ppa.f(ppc.e);
            Throwable t3 = null;
            Label_0373: {
                if (!list.isEmpty()) {
                    while (true) {
                        for (final Object next : list) {
                            if (((Throwable)next) instanceof CancellationException ^ true) {
                                t3 = (Throwable)next;
                                if (t3 == null) {
                                    final Throwable t4 = (Throwable)list.get(0);
                                    Label_0366: {
                                        if (t4 instanceof pph) {
                                            while (true) {
                                                for (final Object next2 : list) {
                                                    final Throwable t5 = (Throwable)next2;
                                                    if (t5 != t4 && t5 instanceof pph) {
                                                        if ((t3 = (Throwable)next2) == null) {
                                                            break Label_0366;
                                                        }
                                                        break Label_0373;
                                                    }
                                                }
                                                Object next2 = t2;
                                                continue;
                                            }
                                        }
                                    }
                                    t3 = t4;
                                }
                                break Label_0373;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
                if (ppa.g()) {
                    t3 = new pov(this.h(), null, this);
                }
                else {
                    t3 = t;
                }
            }
            if (t3 != null) {
                if (list.size() > 1) {
                    final Set<Throwable> setFromMap = Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>(list.size()));
                    Throwable b3;
                    if (!pod.b) {
                        b3 = t3;
                    }
                    else {
                        b3 = pqd.b(t3);
                    }
                    for (Throwable b4 : list) {
                        final Throwable t6 = b4;
                        if (pod.b) {
                            b4 = pqd.b(t6);
                        }
                        if (b4 != t3 && b4 != b3 && !(b4 instanceof CancellationException) && setFromMap.add(b4)) {
                            pip.e(t3, b4);
                        }
                    }
                }
            }
            monitorexit(ppa);
            if (t3 != null) {
                if (t3 != b2) {
                    o = new pnq(t3);
                }
            }
            if (t3 != null) {
                if (this.N(t3)) {
                    if (o == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                    ((pnq)o).a.b();
                }
            }
            this.l(o);
            this.c.c(ppa, ppc.a(o));
            this.J(ppa, o);
            return o;
        }
        finally {
            monitorexit(ppa);
            while (true) {}
        }
    }
    
    public final Object v() {
        final pnf c = this.c;
        Object a;
        while (true) {
            a = c.a;
            if (!(a instanceof pqa)) {
                break;
            }
            ((pqa)a).a(this);
        }
        return a;
    }
    
    public final Object w(Object o) {
        Object g;
        do {
            g = this.G(this.v(), o);
            if (g == ppc.a) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(o);
                final String string = sb.toString();
                final boolean b = o instanceof pnq;
                final Throwable t = null;
                if (!b) {
                    o = null;
                }
                final pnq pnq = (pnq)o;
                Throwable b2;
                if (pnq != null) {
                    b2 = pnq.b;
                }
                else {
                    b2 = t;
                }
                throw new IllegalStateException(string, b2);
            }
        } while (g == ppc.c);
        return g;
    }
    
    @Override
    public final CancellationException x() {
        final Object v = this.v();
        final boolean b = v instanceof ppa;
        CancellationException ex = null;
        Throwable t;
        if (b) {
            t = ((ppa)v).d();
        }
        else if (v instanceof pnq) {
            t = ((pnq)v).b;
        }
        else {
            if (v instanceof por) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot be cancelling child in this state: ");
                sb.append(v);
                throw new IllegalStateException(sb.toString().toString());
            }
            t = null;
        }
        if (t instanceof CancellationException) {
            ex = (CancellationException)t;
        }
        final CancellationException ex2 = ex;
        if (ex2 != null) {
            return ex2;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(O(v));
        return new pov(sb2.toString(), t, this);
    }
    
    protected final CancellationException y(final Throwable t, final String s) {
        Throwable t2;
        if (!(t instanceof CancellationException)) {
            t2 = null;
        }
        else {
            t2 = t;
        }
        final CancellationException ex = (CancellationException)t2;
        CancellationException ex2;
        if (ex != null) {
            ex2 = ex;
        }
        else {
            String h;
            if ((h = s) == null) {
                h = this.h();
            }
            ex2 = new pov(h, t, this);
        }
        return ex2;
    }
    
    public final pnl z() {
        return (pnl)this.a.a;
    }
}
