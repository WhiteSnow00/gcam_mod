import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class om
{
    public final ArrayList a;
    public final ArrayList b;
    public final rv c;
    private final hp d;
    
    public om(final rv c) {
        this.d = new hq(30);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = c;
    }
    
    private final int m(int i, int a) {
        int j = this.b.size() - 1;
        int n = i;
        while (j >= 0) {
            final ol ol = this.b.get(j);
            final int a2 = ol.a;
            final int b = ol.b;
            Label_0128: {
                if (b <= n) {
                    if (a2 == 1) {
                        i = n - ol.d;
                    }
                    else {
                        i = n;
                        if (a2 == 2) {
                            i = n + ol.d;
                        }
                    }
                }
                else {
                    if (a == 1) {
                        i = b + 1;
                    }
                    else {
                        i = n;
                        if (a != 2) {
                            break Label_0128;
                        }
                        i = b - 1;
                    }
                    ol.b = i;
                    i = n;
                }
            }
            --j;
            n = i;
        }
        ol ol2;
        for (i = this.b.size() - 1; i >= 0; --i) {
            ol2 = this.b.get(i);
            a = ol2.a;
            if (ol2.d <= 0) {
                this.b.remove(i);
                this.g(ol2);
            }
        }
        return n;
    }
    
    final int a(final int n) {
        return this.b(n, 0);
    }
    
    final int b(int d, int i) {
        final int size = this.b.size();
        int n = d;
        while (i < size) {
            final ol ol = this.b.get(i);
            final int a = ol.a;
            final int b = ol.b;
            if (b <= (d = n)) {
                if (a == 2) {
                    d = ol.d;
                    if (n < b + d) {
                        return -1;
                    }
                    d = n - d;
                }
                else {
                    d = n;
                    if (a == 1) {
                        d = n + ol.d;
                    }
                }
            }
            ++i;
            n = d;
        }
        return n;
    }
    
    public final void c() {
        final int size = this.b.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            this.c.b((ol)this.b.get(i));
        }
        this.h(this.b);
        for (int size2 = this.a.size(), j = n; j < size2; ++j) {
            final ol ol = this.a.get(j);
            switch (ol.a) {
                case 4: {
                    this.c.b(ol);
                    final rv c = this.c;
                    final int b = ol.b;
                    final int d = ol.d;
                    final Object c2 = ol.c;
                    c.e(b, d);
                    break;
                }
                case 2: {
                    this.c.b(ol);
                    this.c.d(ol.b, ol.d);
                    break;
                }
                case 1: {
                    this.c.b(ol);
                    this.c.c(ol.b, ol.d);
                    break;
                }
            }
        }
        this.h(this.a);
    }
    
    public final void d(ol l) {
        final int a = l.a;
        if (a != 1) {
            int m = this.m(l.b, a);
            int b = l.b;
            int n = 0;
            switch (l.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("op should be remove or update.");
                    sb.append(l);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 4: {
                    n = 1;
                    break;
                }
                case 2: {
                    n = 0;
                    break;
                }
            }
            int i = 1;
            int n2 = 1;
            while (i < l.d) {
                final int j = this.m(l.b + n * i, l.a);
                final int a2 = l.a;
                Label_0269: {
                    Label_0212: {
                        boolean b2 = false;
                        Label_0201: {
                            Label_0198: {
                                switch (a2) {
                                    default: {
                                        break Label_0212;
                                    }
                                    case 4: {
                                        if (j == m + 1) {
                                            break;
                                        }
                                        break Label_0198;
                                    }
                                    case 2: {
                                        if (j == m) {
                                            break;
                                        }
                                        break Label_0198;
                                    }
                                }
                                b2 = true;
                                break Label_0201;
                            }
                            b2 = false;
                        }
                        if (b2) {
                            ++n2;
                            break Label_0269;
                        }
                    }
                    final Object c = l.c;
                    final ol k = this.l(a2, m, n2);
                    this.e(k, b);
                    this.g(k);
                    int n3 = b;
                    if (l.a == 4) {
                        n3 = b + n2;
                    }
                    final int n4 = j;
                    n2 = 1;
                    b = n3;
                    m = n4;
                }
                ++i;
            }
            final Object c2 = l.c;
            this.g(l);
            if (n2 > 0) {
                l = this.l(l.a, m, n2);
                this.e(l, b);
                this.g(l);
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    
    final void e(final ol ol, final int n) {
        this.c.b(ol);
        switch (ol.a) {
            default: {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            case 4: {
                this.c.e(n, ol.d);
                return;
            }
            case 2: {
                this.c.d(n, ol.d);
            }
        }
    }
    
    public final void f(final ol ol) {
        this.b.add(ol);
        switch (ol.a) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown update op type for ");
                sb.append(ol);
                throw new IllegalArgumentException(sb.toString());
            }
            case 4: {
                final rv c = this.c;
                final int b = ol.b;
                final int d = ol.d;
                final Object c2 = ol.c;
                c.e(b, d);
                return;
            }
            case 2: {
                final rv c3 = this.c;
                c3.a.G(ol.b, ol.d, false);
                c3.a.J = true;
                return;
            }
            case 1: {
                this.c.c(ol.b, ol.d);
            }
        }
    }
    
    public final void g(final ol ol) {
        ol.c = null;
        this.d.b(ol);
    }
    
    final void h(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.g((ol)list.get(i));
        }
        list.clear();
    }
    
    public final void i() {
        this.h(this.a);
        this.h(this.b);
    }
    
    public final boolean j(final int n) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final ol ol = this.b.get(i);
            if (ol.a == 1) {
                for (int b = ol.b, d = ol.d, j = b; j < d + b; ++j) {
                    if (this.b(j, i + 1) == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean k() {
        return this.a.size() > 0;
    }
    
    public final ol l(final int a, final int b, final int d) {
        ol ol = (ol)this.d.a();
        if (ol == null) {
            ol = new ol(a, b, d);
        }
        else {
            ol.a = a;
            ol.b = b;
            ol.d = d;
            ol.c = null;
        }
        return ol;
    }
}
