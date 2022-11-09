import java.util.Map;
import java.util.List;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class ojm implements omu
{
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    public ojm() {
    }
    
    public ojm(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.array();
        this.b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }
    
    private final byte V() {
        final int b = this.b;
        if (b != this.c) {
            final byte[] a = this.a;
            this.b = b + 1;
            return a[b];
        }
        throw olm.i();
    }
    
    private final int W() {
        this.af(4);
        return this.X();
    }
    
    private final int X() {
        final int b = this.b;
        final byte[] a = this.a;
        this.b = b + 4;
        return (a[b + 3] & 0xFF) << 24 | ((a[b] & 0xFF) | (a[b + 1] & 0xFF) << 8 | (a[b + 2] & 0xFF) << 16);
    }
    
    private final int Y() {
        final int b = this.b;
        final int c = this.c;
        if (c == b) {
            throw olm.i();
        }
        final byte[] a = this.a;
        final int b2 = b + 1;
        final byte b3 = a[b];
        if (b3 >= 0) {
            this.b = b2;
            return b3;
        }
        if (c - b2 < 9) {
            return (int)this.ab();
        }
        int b4 = b2 + 1;
        final int n = b3 ^ a[b2] << 7;
        int n2 = 0;
        Label_0276: {
            if (n < 0) {
                n2 = (n ^ 0xFFFFFF80);
            }
            else {
                final int n3 = b4 + 1;
                final int n4 = n ^ a[b4] << 14;
                if (n4 >= 0) {
                    final int n5 = n4 ^ 0x3F80;
                    b4 = n3;
                    n2 = n5;
                }
                else {
                    b4 = n3 + 1;
                    final int n6 = n4 ^ a[n3] << 21;
                    if (n6 < 0) {
                        n2 = (n6 ^ 0xFFE03F80);
                    }
                    else {
                        final int n7 = b4 + 1;
                        final byte b5 = a[b4];
                        final int n8 = n6 ^ b5 << 28 ^ 0xFE03F80;
                        if (b5 < 0) {
                            final int n9 = n7 + 1;
                            n2 = n8;
                            b4 = n9;
                            if (a[n7] < 0) {
                                final int n10 = b4 = n9 + 1;
                                if (a[n9] < 0) {
                                    final int n11 = n10 + 1;
                                    n2 = n8;
                                    b4 = n11;
                                    if (a[n10] >= 0) {
                                        break Label_0276;
                                    }
                                    final int n12 = b4 = n11 + 1;
                                    if (a[n11] < 0) {
                                        b4 = n12 + 1;
                                        if (a[n12] >= 0) {
                                            n2 = n8;
                                            break Label_0276;
                                        }
                                        throw olm.e();
                                    }
                                }
                                n2 = n8;
                            }
                        }
                        else {
                            b4 = n7;
                            n2 = n8;
                        }
                    }
                }
            }
        }
        this.b = b4;
        return n2;
    }
    
    private final long Z() {
        this.af(8);
        return this.aa();
    }
    
    private final long aa() {
        final int b = this.b;
        final byte[] a = this.a;
        this.b = b + 8;
        return ((long)a[b + 7] & 0xFFL) << 56 | (((long)a[b] & 0xFFL) | ((long)a[b + 1] & 0xFFL) << 8 | ((long)a[b + 2] & 0xFFL) << 16 | ((long)a[b + 3] & 0xFFL) << 24 | ((long)a[b + 4] & 0xFFL) << 32 | ((long)a[b + 5] & 0xFFL) << 40 | ((long)a[b + 6] & 0xFFL) << 48);
    }
    
    private final long ab() {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte v = this.V();
            n |= (long)(v & 0x7F) << i;
            if ((v & 0x80) == 0x0) {
                return n;
            }
        }
        throw olm.e();
    }
    
    private final Object ac(final onv onv, final Class clazz, final okm okm) {
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
    
    private final Object ad(final omy omy, final okm okm) {
        final int e = this.e;
        this.e = onx.c(onx.a(this.d), 4);
        try {
            final Object e2 = omy.e();
            omy.h(e2, this, okm);
            omy.f(e2);
            if (this.d == this.e) {
                return e2;
            }
            throw olm.g();
        }
        finally {
            this.e = e;
        }
    }
    
    private final Object ae(final omy omy, final okm okm) {
        final int y = this.Y();
        this.af(y);
        final int c = this.c;
        final int c2 = this.b + y;
        this.c = c2;
        try {
            final Object e = omy.e();
            omy.h(e, this, okm);
            omy.f(e);
            if (this.b == c2) {
                return e;
            }
            throw olm.g();
        }
        finally {
            this.c = c;
        }
    }
    
    private final void af(final int n) {
        if (n >= 0 && n <= this.c - this.b) {
            return;
        }
        throw olm.i();
    }
    
    private final void ag(final int n) {
        if (this.b == n) {
            return;
        }
        throw olm.i();
    }
    
    private final void ah(final int n) {
        if (onx.b(this.d) == n) {
            return;
        }
        throw olm.a();
    }
    
    private final void ai(final int n) {
        this.af(n);
        this.b += n;
    }
    
    private final void aj(final int n) {
        this.af(n);
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw olm.g();
    }
    
    private final void ak(final int n) {
        this.af(n);
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw olm.g();
    }
    
    private final boolean al() {
        return this.b == this.c;
    }
    
    @Override
    public final void A(final List list) {
        if (list instanceof oki) {
            final oki oki = (oki)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int y = this.Y();
                    this.ak(y);
                    while (this.b < this.b + y) {
                        oki.d(Double.longBitsToDouble(this.aa()));
                    }
                    break;
                }
                case 1: {
                    int b;
                    do {
                        oki.d(this.a());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int y2 = this.Y();
                    this.ak(y2);
                    while (this.b < this.b + y2) {
                        list.add(Double.longBitsToDouble(this.aa()));
                    }
                    break;
                }
                case 1: {
                    int b2;
                    do {
                        list.add(this.a());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void B(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        okz.g(this.Y());
                    }
                    break;
                }
                case 0: {
                    int b;
                    do {
                        okz.g(this.e());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        list.add(this.Y());
                    }
                    break;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.e());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void C(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int b;
                    do {
                        okz.g(this.f());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                    return;
                }
                case 2: {
                    final int y = this.Y();
                    this.aj(y);
                    while (this.b < this.b + y) {
                        okz.g(this.X());
                    }
                    break;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int b2;
                    do {
                        list.add(this.f());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                    return;
                }
                case 2: {
                    final int y2 = this.Y();
                    this.aj(y2);
                    while (this.b < this.b + y2) {
                        list.add(this.X());
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public final void D(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int y = this.Y();
                    this.ak(y);
                    while (this.b < this.b + y) {
                        oly.d(this.aa());
                    }
                    break;
                }
                case 1: {
                    int b;
                    do {
                        oly.d(this.k());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int y2 = this.Y();
                    this.ak(y2);
                    while (this.b < this.b + y2) {
                        list.add(this.aa());
                    }
                    break;
                }
                case 1: {
                    int b2;
                    do {
                        list.add(this.k());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void E(final List list) {
        if (list instanceof okr) {
            final okr okr = (okr)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int b;
                    do {
                        okr.g(this.b());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                    return;
                }
                case 2: {
                    final int y = this.Y();
                    this.aj(y);
                    while (this.b < this.b + y) {
                        okr.g(Float.intBitsToFloat(this.X()));
                    }
                    break;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int b2;
                    do {
                        list.add(this.b());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                    return;
                }
                case 2: {
                    final int y2 = this.Y();
                    this.aj(y2);
                    while (this.b < this.b + y2) {
                        list.add(Float.intBitsToFloat(this.X()));
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public final void F(final List list, final omy omy, final okm okm) {
        if (onx.b(this.d) == 3) {
            int b;
            do {
                list.add(this.ad(omy, okm));
                if (this.al()) {
                    return;
                }
                b = this.b;
            } while (this.Y() == this.d);
            this.b = b;
            return;
        }
        throw olm.a();
    }
    
    @Override
    public final void G(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.b + this.Y();
                    while (this.b < n) {
                        okz.g(this.Y());
                    }
                    this.ag(n);
                    return;
                }
                case 0: {
                    int b;
                    do {
                        okz.g(this.g());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.b + this.Y();
                    while (this.b < n2) {
                        list.add(this.Y());
                    }
                    this.ag(n2);
                    return;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.g());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void H(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.b + this.Y();
                    while (this.b < n) {
                        oly.d(this.p());
                    }
                    this.ag(n);
                    return;
                }
                case 0: {
                    int b;
                    do {
                        oly.d(this.l());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.b + this.Y();
                    while (this.b < n2) {
                        list.add(this.p());
                    }
                    this.ag(n2);
                    return;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.l());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void I(final Map map, final omc omc, final okm okm) {
        this.ah(2);
        final int y = this.Y();
        this.af(y);
        final int c = this.c;
        this.c = this.b + y;
        try {
            Object o = omc.b;
            Object o2 = omc.d;
            while (true) {
                final int c2 = this.c();
                if (c2 == Integer.MAX_VALUE) {
                    break;
                }
                Label_0113: {
                    switch (c2) {
                        default: {
                            break Label_0113;
                        }
                        case 2: {
                            break Label_0113;
                        }
                        case 1: {
                            Label_0138: {
                                break Label_0138;
                                Label_0167: {
                                    try {
                                        final boolean u = this.U();
                                        break Label_0167;
                                        o = this.ac(omc.a, null, null);
                                        break Label_0167;
                                        o2 = this.ac(omc.c, omc.d.getClass(), okm);
                                    }
                                    catch (final oll oll) {
                                        if (this.U()) {
                                            continue;
                                        }
                                        throw new olm("Unable to parse map entry.");
                                        continue;
                                        final boolean u;
                                        iftrue(Label_0170:)(!u);
                                        break Label_0167;
                                        Label_0170: {
                                            throw new olm("Unable to parse map entry.");
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
            }
            map.put(o, o2);
            this.c = c;
        }
        finally {
            this.c = c;
            while (true) {}
        }
    }
    
    @Override
    public final void J(final List list, final omy omy, final okm okm) {
        if (onx.b(this.d) == 2) {
            int b;
            do {
                list.add(this.ae(omy, okm));
                if (this.al()) {
                    return;
                }
                b = this.b;
            } while (this.Y() == this.d);
            this.b = b;
            return;
        }
        throw olm.a();
    }
    
    @Override
    public final void K(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int b;
                    do {
                        okz.g(this.h());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                    return;
                }
                case 2: {
                    final int y = this.Y();
                    this.aj(y);
                    while (this.b < this.b + y) {
                        okz.g(this.X());
                    }
                    break;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 5: {
                    int b2;
                    do {
                        list.add(this.h());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                    return;
                }
                case 2: {
                    final int y2 = this.Y();
                    this.aj(y2);
                    while (this.b < this.b + y2) {
                        list.add(this.X());
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public final void L(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int y = this.Y();
                    this.ak(y);
                    while (this.b < this.b + y) {
                        oly.d(this.aa());
                    }
                    break;
                }
                case 1: {
                    int b;
                    do {
                        oly.d(this.m());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int y2 = this.Y();
                    this.ak(y2);
                    while (this.b < this.b + y2) {
                        list.add(this.aa());
                    }
                    break;
                }
                case 1: {
                    int b2;
                    do {
                        list.add(this.m());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void M(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        okz.g(okb.F(this.Y()));
                    }
                    break;
                }
                case 0: {
                    int b;
                    do {
                        okz.g(this.i());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        list.add(okb.F(this.Y()));
                    }
                    break;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.i());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void N(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        oly.d(okb.G(this.p()));
                    }
                    break;
                }
                case 0: {
                    int b;
                    do {
                        oly.d(this.n());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        list.add(okb.G(this.p()));
                    }
                    break;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.n());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void O(final List list) {
        this.P(list, false);
    }
    
    public final void P(final List list, final boolean b) {
        if (onx.b(this.d) == 2) {
            if (list instanceof olu) {
                if (!b) {
                    final olu olu = (olu)list;
                    int b2;
                    do {
                        olu.i(this.q());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                    return;
                }
            }
            int b3;
            do {
                list.add(this.w(b));
                if (this.al()) {
                    return;
                }
                b3 = this.b;
            } while (this.Y() == this.d);
            this.b = b3;
            return;
        }
        throw olm.a();
    }
    
    @Override
    public final void Q(final List list) {
        this.P(list, true);
    }
    
    @Override
    public final void R(final List list) {
        if (list instanceof okz) {
            final okz okz = (okz)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        okz.g(this.Y());
                    }
                    break;
                }
                case 0: {
                    int b;
                    do {
                        okz.g(this.j());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    while (this.b < this.b + this.Y()) {
                        list.add(this.Y());
                    }
                    break;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.j());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void S(final List list) {
        if (list instanceof oly) {
            final oly oly = (oly)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.b + this.Y();
                    while (this.b < n) {
                        oly.d(this.p());
                    }
                    this.ag(n);
                    return;
                }
                case 0: {
                    int b;
                    do {
                        oly.d(this.o());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.b + this.Y();
                    while (this.b < n2) {
                        list.add(this.p());
                    }
                    this.ag(n2);
                    return;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.o());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final boolean T() {
        boolean b = false;
        this.ah(0);
        if (this.Y() != 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final boolean U() {
        final boolean al = this.al();
        final int n = 0;
        if (!al) {
            final int d = this.d;
            if (d != this.e) {
                switch (onx.b(d)) {
                    default: {
                        throw olm.a();
                    }
                    case 5: {
                        this.ai(4);
                        return true;
                    }
                    case 3: {
                        final int e = this.e;
                        this.e = onx.c(onx.a(this.d), 4);
                        while (this.c() != Integer.MAX_VALUE && this.U()) {}
                        if (this.d == this.e) {
                            this.e = e;
                            return true;
                        }
                        throw olm.g();
                    }
                    case 2: {
                        this.ai(this.Y());
                        return true;
                    }
                    case 1: {
                        this.ai(8);
                        return true;
                    }
                    case 0: {
                        final int c = this.c;
                        int b = this.b;
                        if (c - b >= 10) {
                            final byte[] a = this.a;
                            int b2;
                            for (int i = 0; i < 10; ++i, b = b2) {
                                b2 = b + 1;
                                if (a[b] >= 0) {
                                    this.b = b2;
                                    return true;
                                }
                            }
                        }
                        for (int j = n; j < 10; ++j) {
                            if (this.V() >= 0) {
                                return true;
                            }
                        }
                        throw olm.e();
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final double a() {
        this.ah(1);
        return Double.longBitsToDouble(this.Z());
    }
    
    @Override
    public final float b() {
        this.ah(5);
        return Float.intBitsToFloat(this.W());
    }
    
    @Override
    public final int c() {
        if (this.al()) {
            return Integer.MAX_VALUE;
        }
        final int y = this.Y();
        if ((this.d = y) == this.e) {
            return Integer.MAX_VALUE;
        }
        return onx.a(y);
    }
    
    @Override
    public final int d() {
        return this.d;
    }
    
    @Override
    public final int e() {
        this.ah(0);
        return this.Y();
    }
    
    @Override
    public final int f() {
        this.ah(5);
        return this.W();
    }
    
    @Override
    public final int g() {
        this.ah(0);
        return this.Y();
    }
    
    @Override
    public final int h() {
        this.ah(5);
        return this.W();
    }
    
    @Override
    public final int i() {
        this.ah(0);
        return okb.F(this.Y());
    }
    
    @Override
    public final int j() {
        this.ah(0);
        return this.Y();
    }
    
    @Override
    public final long k() {
        this.ah(1);
        return this.Z();
    }
    
    @Override
    public final long l() {
        this.ah(0);
        return this.p();
    }
    
    @Override
    public final long m() {
        this.ah(1);
        return this.Z();
    }
    
    @Override
    public final long n() {
        this.ah(0);
        return okb.G(this.p());
    }
    
    @Override
    public final long o() {
        this.ah(0);
        return this.p();
    }
    
    public final long p() {
        final int b = this.b;
        final int c = this.c;
        if (c == b) {
            throw olm.i();
        }
        final byte[] a = this.a;
        final int b2 = b + 1;
        final byte b3 = a[b];
        if (b3 >= 0) {
            this.b = b2;
            return b3;
        }
        if (c - b2 < 9) {
            return this.ab();
        }
        int b4 = b2 + 1;
        final int n = b3 ^ a[b2] << 7;
        long n2;
        if (n < 0) {
            n2 = (n ^ 0xFFFFFF80);
        }
        else {
            final int n3 = b4 + 1;
            final int n4 = n ^ a[b4] << 14;
            if (n4 >= 0) {
                n2 = (n4 ^ 0x3F80);
                b4 = n3;
            }
            else {
                b4 = n3 + 1;
                final int n5 = n4 ^ a[n3] << 21;
                if (n5 < 0) {
                    n2 = (n5 ^ 0xFFE03F80);
                }
                else {
                    final int n6 = b4 + 1;
                    final long n7 = (long)a[b4] << 28 ^ (long)n5;
                    if (n7 >= 0L) {
                        b4 = n6;
                        n2 = (n7 ^ 0xFE03F80L);
                    }
                    else {
                        b4 = n6 + 1;
                        final long n8 = n7 ^ (long)a[n6] << 35;
                        if (n8 < 0L) {
                            n2 = (0xFFFFFFF80FE03F80L ^ n8);
                        }
                        else {
                            final int n9 = b4 + 1;
                            final long n10 = n8 ^ (long)a[b4] << 42;
                            if (n10 >= 0L) {
                                b4 = n9;
                                n2 = (n10 ^ 0x3F80FE03F80L);
                            }
                            else {
                                b4 = n9 + 1;
                                final long n11 = n10 ^ (long)a[n9] << 49;
                                if (n11 < 0L) {
                                    n2 = (0xFFFE03F80FE03F80L ^ n11);
                                }
                                else {
                                    final int n12 = b4 + 1;
                                    n2 = (n11 ^ (long)a[b4] << 56 ^ 0xFE03F80FE03F80L);
                                    if (n2 < 0L) {
                                        if (a[n12] < 0L) {
                                            throw olm.e();
                                        }
                                        b4 = n12 + 1;
                                    }
                                    else {
                                        b4 = n12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.b = b4;
        return n2;
    }
    
    @Override
    public final ojw q() {
        this.ah(2);
        final int y = this.Y();
        if (y == 0) {
            return ojw.b;
        }
        this.af(y);
        final ojw y2 = ojw.y(this.a, this.b, y);
        this.b += y;
        return y2;
    }
    
    @Override
    public final Object r(final Class clazz, final okm okm) {
        this.ah(3);
        return this.ad(omr.a.a(clazz), okm);
    }
    
    @Override
    public final Object s(final omy omy, final okm okm) {
        this.ah(3);
        return this.ad(omy, okm);
    }
    
    @Override
    public final Object t(final Class clazz, final okm okm) {
        this.ah(2);
        return this.ae(omr.a.a(clazz), okm);
    }
    
    @Override
    public final Object u(final omy omy, final okm okm) {
        this.ah(2);
        return this.ae(omy, okm);
    }
    
    @Override
    public final String v() {
        return this.w(false);
    }
    
    public final String w(final boolean b) {
        this.ah(2);
        final int y = this.Y();
        if (y == 0) {
            return "";
        }
        this.af(y);
        if (b) {
            final byte[] a = this.a;
            final int b2 = this.b;
            if (!onu.h(a, b2, b2 + y)) {
                throw olm.d();
            }
        }
        final String s = new String(this.a, this.b, y, olk.a);
        this.b += y;
        return s;
    }
    
    @Override
    public final String x() {
        return this.w(true);
    }
    
    @Override
    public final void y(final List list) {
        if (list instanceof ojo) {
            final ojo ojo = (ojo)list;
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n = this.b + this.Y();
                    while (this.b < n) {
                        ojo.f(this.Y() != 0);
                    }
                    this.ag(n);
                    return;
                }
                case 0: {
                    int b;
                    do {
                        ojo.f(this.T());
                        if (this.al()) {
                            return;
                        }
                        b = this.b;
                    } while (this.Y() == this.d);
                    this.b = b;
                }
            }
        }
        else {
            switch (onx.b(this.d)) {
                default: {
                    throw olm.a();
                }
                case 2: {
                    final int n2 = this.b + this.Y();
                    while (this.b < n2) {
                        list.add(this.Y() != 0);
                    }
                    this.ag(n2);
                    return;
                }
                case 0: {
                    int b2;
                    do {
                        list.add(this.T());
                        if (this.al()) {
                            return;
                        }
                        b2 = this.b;
                    } while (this.Y() == this.d);
                    this.b = b2;
                }
            }
        }
    }
    
    @Override
    public final void z(final List list) {
        if (onx.b(this.d) == 2) {
            int b;
            do {
                list.add(this.q());
                if (this.al()) {
                    return;
                }
                b = this.b;
            } while (this.Y() == this.d);
            this.b = b;
            return;
        }
        throw olm.a();
    }
}
