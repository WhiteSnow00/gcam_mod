import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrq implements Iterator, j$.util.Iterator
{
    nrs a;
    nps b;
    final /* synthetic */ nru c;
    private final /* synthetic */ int d;
    
    public nrq(final nru c) {
        this.c = c;
        final Object a = c.c.a;
        nrs a2 = null;
        Label_0144: {
            if (a == null) {
                a2 = null;
            }
            else {
                final nmu d = c.d;
                nrs nrs;
                if (d.d) {
                    final Object e = d.e;
                    final nrs d2 = ((nrs)a).d(c.b, e);
                    if (d2 == null) {
                        a2 = null;
                        break Label_0144;
                    }
                    nrs = d2;
                    if (c.d.g == 1) {
                        nrs = d2;
                        if (c.b.compare(e, d2.a) == 0) {
                            nrs = d2.e();
                        }
                    }
                }
                else {
                    nrs = c.e.e();
                }
                if (nrs != c.e) {
                    a2 = nrs;
                    if (c.d.c(nrs.a)) {
                        break Label_0144;
                    }
                }
                a2 = null;
            }
        }
        this.a = a2;
        this.b = null;
    }
    
    public nrq(final nru c, final int d) {
        this.d = d;
        this.c = c;
        final Object a = c.c.a;
        final nrs nrs = null;
        nrs a2 = null;
        Label_0172: {
            if (a == null) {
                a2 = nrs;
            }
            else {
                final nmu d2 = c.d;
                nrs nrs2;
                if (d2.b) {
                    final Object c2 = d2.c;
                    final nrs c3 = ((nrs)a).c(c.b, c2);
                    if (c3 == null) {
                        a2 = nrs;
                        break Label_0172;
                    }
                    nrs2 = c3;
                    if (c.d.f == 1) {
                        nrs2 = c3;
                        if (c.b.compare(c2, c3.a) == 0) {
                            nrs2 = c3.g();
                        }
                    }
                }
                else {
                    nrs2 = c.e.g();
                }
                if (nrs2 != c.e && c.d.c(nrs2.a)) {
                    a2 = nrs2;
                }
                else {
                    a2 = nrs;
                }
            }
        }
        this.a = a2;
    }
    
    @Override
    public final boolean hasNext() {
        final int d = this.d;
        final boolean b = true;
        boolean b2 = true;
        switch (d) {
            default: {
                final nrs a = this.a;
                boolean b3;
                if (a == null) {
                    b3 = false;
                }
                else {
                    if (this.c.d.d(a.a)) {
                        this.a = null;
                        return false;
                    }
                    b3 = b;
                }
                return b3;
            }
            case 0: {
                final nrs a2 = this.a;
                if (a2 == null) {
                    b2 = false;
                }
                else if (this.c.d.e(a2.a)) {
                    this.a = null;
                    return false;
                }
                return b2;
            }
        }
    }
    
    @Override
    public final void remove() {
        final int d = this.d;
        final boolean b = true;
        boolean b2 = true;
        switch (d) {
            default: {
                njo.p(this.b != null && b, "no calls to next() since the last call to remove()");
                this.c.x(this.b.b());
                this.b = null;
                return;
            }
            case 0: {
                if (this.b == null) {
                    b2 = false;
                }
                njo.p(b2, "no calls to next() since the last call to remove()");
                this.c.x(this.b.b());
                this.b = null;
            }
        }
    }
}
