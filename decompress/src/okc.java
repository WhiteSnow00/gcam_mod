import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okc implements omu
{
    private final okb a;
    private int b;
    private int c;
    private int d;
    
    private okc(final okb a) {
        this.d = 0;
        olk.i(a, "input");
        this.a = a;
        a.c = this;
    }
    
    private final Object P(final onv onv, final Class clazz, final okm okm) {
        final onv a = onv.a;
        switch (onv.ordinal()) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                return this.n();
            }
            case 16: {
                return this.i();
            }
            case 15: {
                return this.m();
            }
            case 14: {
                return this.h();
            }
            case 13: {
                return this.e();
            }
            case 12: {
                return this.j();
            }
            case 11: {
                return this.q();
            }
            case 10: {
                return this.t(clazz, okm);
            }
            case 8: {
                return this.x();
            }
            case 7: {
                return this.T();
            }
            case 6: {
                return this.f();
            }
            case 5: {
                return this.k();
            }
            case 4: {
                return this.g();
            }
            case 3: {
                return this.o();
            }
            case 2: {
                return this.l();
            }
            case 1: {
                return this.b();
            }
            case 0: {
                return this.a();
            }
        }
    }
    
    private final Object V(final omy omy, final okm okm) {
        final int c = this.c;
        this.c = onx.c(onx.a(this.b), 4);
        try {
            final Object e = omy.e();
            omy.h(e, this, okm);
            omy.f(e);
            if (this.b == this.c) {
                return e;
            }
            throw olm.g();
        }
        finally {
            this.c = c;
        }
    }
    
    private final Object W(final omy omy, final okm okm) {
        final int n = this.a.n();
        final okb a = this.a;
        if (a.a < a.b) {
            final int e = a.e(n);
            final Object e2 = omy.e();
            final okb a2 = this.a;
            ++a2.a;
            omy.h(e2, this, okm);
            omy.f(e2);
            this.a.z(0);
            final okb a3 = this.a;
            --a3.a;
            a3.A(e);
            return e2;
        }
        throw new olm("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    
    private final void X(final int n) {
        if (this.a.d() == n) {
            return;
        }
        throw olm.i();
    }
    
    private final void Y(final int n) {
        if (onx.b(this.b) == n) {
            return;
        }
        throw olm.a();
    }
    
    private static final void Z(final int n) {
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw olm.g();
    }
    
    private static final void aa(final int n) {
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw olm.g();
    }
    
    public static okc p(final okb okb) {
        final okc c = okb.c;
        if (c != null) {
            return c;
        }
        return new okc(okb);
    }
    
    @Override
    public final void A(final List list) {
        if (list instanceof oki) {
            final oki oki = (oki)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.n();
                    aa(n);
                    do {
                        oki.d(this.a.b());
                    } while (this.a.d() < this.a.d() + n);
                    break;
                }
                case 1: {
                    int i;
                    do {
                        oki.d(this.a.b());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.n();
                    aa(n2);
                    do {
                        list.add(this.a.b());
                    } while (this.a.d() < this.a.d() + n2);
                    break;
                }
                case 1: {
                    int j;
                    do {
                        list.add(this.a.b());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void B(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        okz.g(this.a.f());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        okz.g(this.a.f());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.f());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.f());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void C(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int i;
                    do {
                        okz.g(this.a.g());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                    return;
                }
                case 2: {
                    final int n = this.a.n();
                    Z(n);
                    do {
                        okz.g(this.a.g());
                    } while (this.a.d() < this.a.d() + n);
                    break;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int j;
                    do {
                        list.add(this.a.g());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                    return;
                }
                case 2: {
                    final int n2 = this.a.n();
                    Z(n2);
                    do {
                        list.add(this.a.g());
                    } while (this.a.d() < this.a.d() + n2);
                    break;
                }
            }
        }
    }
    
    @Override
    public final void D(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.n();
                    aa(n);
                    do {
                        oly.d(this.a.o());
                    } while (this.a.d() < this.a.d() + n);
                    break;
                }
                case 1: {
                    int i;
                    do {
                        oly.d(this.a.o());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.n();
                    aa(n2);
                    do {
                        list.add(this.a.o());
                    } while (this.a.d() < this.a.d() + n2);
                    break;
                }
                case 1: {
                    int j;
                    do {
                        list.add(this.a.o());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void E(final List list) {
        if (list instanceof okr) {
            final okr okr = (okr)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int i;
                    do {
                        okr.g(this.a.c());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                    return;
                }
                case 2: {
                    final int n = this.a.n();
                    Z(n);
                    do {
                        okr.g(this.a.c());
                    } while (this.a.d() < this.a.d() + n);
                    break;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int j;
                    do {
                        list.add(this.a.c());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                    return;
                }
                case 2: {
                    final int n2 = this.a.n();
                    Z(n2);
                    do {
                        list.add(this.a.c());
                    } while (this.a.d() < this.a.d() + n2);
                    break;
                }
            }
        }
    }
    
    @Override
    public final void F(final List list, final omy omy, final okm okm) {
        if (onx.b(this.b) == 3) {
            int i;
            do {
                list.add(this.V(omy, okm));
                if (this.a.C() || this.d != 0) {
                    return;
                }
                i = this.a.m();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw olm.a();
    }
    
    @Override
    public final void G(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        okz.g(this.a.h());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        okz.g(this.a.h());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.h());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.h());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void H(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        oly.d(this.a.p());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        oly.d(this.a.p());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.p());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.p());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void I(final Map map, final omc omc, final okm okm) {
        this.Y(2);
        final int e = this.a.e(this.a.n());
        Object o = omc.b;
        Object o2 = omc.d;
        try {
            int c;
            boolean u;
            Label_0181_Outer:Label_0155_Outer:
            while (true) {
                c = this.c();
                if (c == Integer.MAX_VALUE) {
                    break;
                }
                if (this.a.C()) {
                    break;
                }
                Label_0101: {
                    switch (c) {
                        default: {
                            break Label_0101;
                        }
                        case 2: {
                            break Label_0101;
                        }
                        case 1: {
                            Label_0126: {
                                break Label_0126;
                                Label_0150: {
                                    try {
                                        u = this.U();
                                        break Label_0150;
                                        o = this.P(omc.a, null, null);
                                        continue;
                                        o2 = this.P(omc.c, omc.d.getClass(), okm);
                                        continue;
                                    }
                                    catch (final oll oll) {
                                        if (this.U()) {
                                            continue Label_0181_Outer;
                                        }
                                        throw new olm("Unable to parse map entry.");
                                        while (true) {
                                            while (true) {
                                                continue Label_0181_Outer;
                                                Label_0158: {
                                                    throw new olm("Unable to parse map entry.");
                                                }
                                                continue Label_0155_Outer;
                                            }
                                            iftrue(Label_0158:)(!u);
                                            continue;
                                        }
                                    }
                                }
                            }
                            break Label_0181_Outer;
                        }
                    }
                }
            }
            map.put(o, o2);
            this.a.A(e);
        }
        finally {
            this.a.A(e);
            while (true) {}
        }
    }
    
    @Override
    public final void J(final List list, final omy omy, final okm okm) {
        if (onx.b(this.b) == 2) {
            int i;
            do {
                list.add(this.W(omy, okm));
                if (this.a.C() || this.d != 0) {
                    return;
                }
                i = this.a.m();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw olm.a();
    }
    
    @Override
    public final void K(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int i;
                    do {
                        okz.g(this.a.k());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                    return;
                }
                case 2: {
                    final int n = this.a.n();
                    Z(n);
                    do {
                        okz.g(this.a.k());
                    } while (this.a.d() < this.a.d() + n);
                    break;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int j;
                    do {
                        list.add(this.a.k());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                    return;
                }
                case 2: {
                    final int n2 = this.a.n();
                    Z(n2);
                    do {
                        list.add(this.a.k());
                    } while (this.a.d() < this.a.d() + n2);
                    break;
                }
            }
        }
    }
    
    @Override
    public final void L(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.n();
                    aa(n);
                    do {
                        oly.d(this.a.t());
                    } while (this.a.d() < this.a.d() + n);
                    break;
                }
                case 1: {
                    int i;
                    do {
                        oly.d(this.a.t());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.n();
                    aa(n2);
                    do {
                        list.add(this.a.t());
                    } while (this.a.d() < this.a.d() + n2);
                    break;
                }
                case 1: {
                    int j;
                    do {
                        list.add(this.a.t());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void M(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        okz.g(this.a.l());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        okz.g(this.a.l());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.l());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.l());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void N(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        oly.d(this.a.u());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        oly.d(this.a.u());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.u());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.u());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void O(final List list) {
        this.w(list, false);
    }
    
    @Override
    public final void Q(final List list) {
        this.w(list, true);
    }
    
    @Override
    public final void R(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        okz.g(this.a.n());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        okz.g(this.a.n());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.n());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.n());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void S(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        oly.d(this.a.v());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        oly.d(this.a.v());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.v());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.v());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final boolean T() {
        this.Y(0);
        return this.a.D();
    }
    
    @Override
    public final boolean U() {
        if (!this.a.C()) {
            final int b = this.b;
            if (b != this.c) {
                return this.a.E(b);
            }
        }
        return false;
    }
    
    @Override
    public final double a() {
        this.Y(1);
        return this.a.b();
    }
    
    @Override
    public final float b() {
        this.Y(5);
        return this.a.c();
    }
    
    @Override
    public final int c() {
        int n = this.d;
        if (n != 0) {
            this.b = n;
            this.d = 0;
        }
        else {
            n = this.a.m();
            this.b = n;
        }
        if (n != 0 && n != this.c) {
            return onx.a(n);
        }
        return Integer.MAX_VALUE;
    }
    
    @Override
    public final int d() {
        return this.b;
    }
    
    @Override
    public final int e() {
        this.Y(0);
        return this.a.f();
    }
    
    @Override
    public final int f() {
        this.Y(5);
        return this.a.g();
    }
    
    @Override
    public final int g() {
        this.Y(0);
        return this.a.h();
    }
    
    @Override
    public final int h() {
        this.Y(5);
        return this.a.k();
    }
    
    @Override
    public final int i() {
        this.Y(0);
        return this.a.l();
    }
    
    @Override
    public final int j() {
        this.Y(0);
        return this.a.n();
    }
    
    @Override
    public final long k() {
        this.Y(1);
        return this.a.o();
    }
    
    @Override
    public final long l() {
        this.Y(0);
        return this.a.p();
    }
    
    @Override
    public final long m() {
        this.Y(1);
        return this.a.t();
    }
    
    @Override
    public final long n() {
        this.Y(0);
        return this.a.u();
    }
    
    @Override
    public final long o() {
        this.Y(0);
        return this.a.v();
    }
    
    @Override
    public final ojw q() {
        this.Y(2);
        return this.a.w();
    }
    
    @Override
    public final Object r(final Class clazz, final okm okm) {
        this.Y(3);
        return this.V(omr.a.a(clazz), okm);
    }
    
    @Override
    public final Object s(final omy omy, final okm okm) {
        this.Y(3);
        return this.V(omy, okm);
    }
    
    @Override
    public final Object t(final Class clazz, final okm okm) {
        this.Y(2);
        return this.W(omr.a.a(clazz), okm);
    }
    
    @Override
    public final Object u(final omy omy, final okm okm) {
        this.Y(2);
        return this.W(omy, okm);
    }
    
    @Override
    public final String v() {
        this.Y(2);
        return this.a.x();
    }
    
    public final void w(final List list, final boolean b) {
        if (onx.b(this.b) == 2) {
            if (list instanceof olu) {
                if (!b) {
                    final olu olu = (olu)list;
                    int i;
                    do {
                        olu.i(this.q());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                    return;
                }
            }
            int j;
            do {
                String s;
                if (b) {
                    s = this.x();
                }
                else {
                    s = this.v();
                }
                list.add(s);
                if (this.a.C()) {
                    return;
                }
                j = this.a.m();
            } while (j == this.b);
            this.d = j;
            return;
        }
        throw olm.a();
    }
    
    @Override
    public final String x() {
        this.Y(2);
        return this.a.y();
    }
    
    @Override
    public final void y(final List list) {
        if (list instanceof ojo) {
            final ojo ojo = (ojo)list;
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.a.d() + this.a.n();
                    do {
                        ojo.f(this.a.D());
                    } while (this.a.d() < n);
                    this.X(n);
                    return;
                }
                case 0: {
                    int i;
                    do {
                        ojo.f(this.a.D());
                        if (this.a.C()) {
                            return;
                        }
                        i = this.a.m();
                    } while (i == this.b);
                    this.d = i;
                }
            }
        }
        else {
            switch (onx.b(this.b)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.a.d() + this.a.n();
                    do {
                        list.add(this.a.D());
                    } while (this.a.d() < n2);
                    this.X(n2);
                    return;
                }
                case 0: {
                    int j;
                    do {
                        list.add(this.a.D());
                        if (this.a.C()) {
                            return;
                        }
                        j = this.a.m();
                    } while (j == this.b);
                    this.d = j;
                }
            }
        }
    }
    
    @Override
    public final void z(final List list) {
        if (onx.b(this.b) == 2) {
            int i;
            do {
                list.add(this.q());
                if (this.a.C()) {
                    return;
                }
                i = this.a.m();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw olm.a();
    }
}
