import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dc
{
    final dd a;
    dc b;
    public int c;
    int d;
    public int e;
    public db f;
    final int g;
    public int h;
    public int i;
    
    public dc(final dd a, final int g) {
        this.c = 0;
        this.d = -1;
        this.h = 1;
        this.i = 1;
        this.e = 0;
        this.a = a;
        this.g = g;
    }
    
    private final String f(final HashSet set) {
        if (set.add(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("null:");
            sb.append(bo.d(this.g));
            String string;
            if (this.b != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(" connected to ");
                sb2.append(this.b.f(set));
                string = sb2.toString();
            }
            else {
                string = "";
            }
            sb.append(string);
            return sb.toString();
        }
        return "<-";
    }
    
    public final int a() {
        if (this.a.K == 8) {
            return 0;
        }
        final int d = this.d;
        if (d >= 0) {
            final dc b = this.b;
            if (b != null && b.a.K == 8) {
                return d;
            }
        }
        return this.c;
    }
    
    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }
    
    public final boolean c() {
        return this.b != null;
    }
    
    public final void d(final dc b, final int c, final int d, final int h, final int e, final boolean b2) {
        final boolean b3 = true;
        if (b == null) {
            this.b = null;
            this.c = 0;
            this.d = -1;
            this.h = 1;
            this.e = 2;
            return;
        }
        Label_0338: {
            if (!b2) {
                final int g = b.g;
                final int g2 = this.g;
                if (g == g2) {
                    if (g2 != 7) {
                        if (g2 != 6) {
                            break Label_0338;
                        }
                        if (b.a.s() && this.a.s()) {
                            break Label_0338;
                        }
                    }
                }
                else {
                    int n2 = 0;
                    switch (g2 - 1) {
                        default: {
                            return;
                        }
                        case 6: {
                            if (g != 6 && g != 8 && g != 9) {
                                break Label_0338;
                            }
                            return;
                        }
                        case 2:
                        case 4: {
                            int n;
                            boolean b4;
                            if (g != 3) {
                                if (g == 5) {
                                    n = 5;
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                    n = g;
                                }
                            }
                            else {
                                b4 = true;
                                n = g;
                            }
                            if (!(b.a instanceof df)) {
                                n2 = (b4 ? 1 : 0);
                                break;
                            }
                            n2 = (b3 ? 1 : 0);
                            if (b4) {
                                break;
                            }
                            if (n == 9) {
                                n2 = (b3 ? 1 : 0);
                                break;
                            }
                            n2 = 0;
                            break;
                        }
                        case 1:
                        case 3: {
                            int n3;
                            int n4;
                            if (g != 2) {
                                if (g == 4) {
                                    n3 = 4;
                                    n4 = 1;
                                }
                                else {
                                    n4 = 0;
                                    n3 = g;
                                }
                            }
                            else {
                                n4 = 1;
                                n3 = g;
                            }
                            if (!(b.a instanceof df)) {
                                n2 = n4;
                                break;
                            }
                            n2 = (b3 ? 1 : 0);
                            if (n4 != 0) {
                                break;
                            }
                            if (n3 == 8) {
                                n2 = (b3 ? 1 : 0);
                                break;
                            }
                            n2 = 0;
                            break;
                        }
                    }
                    if (n2 != 0) {
                        break Label_0338;
                    }
                }
                return;
            }
        }
        this.b = b;
        if (c > 0) {
            this.c = c;
        }
        else {
            this.c = 0;
        }
        this.d = d;
        this.h = h;
        this.e = e;
    }
    
    public final void e() {
        final db f = this.f;
        if (f == null) {
            this.f = new db(1);
            return;
        }
        f.b();
    }
    
    @Override
    public final String toString() {
        final HashSet set = new HashSet();
        final StringBuilder sb = new StringBuilder();
        sb.append("null:");
        sb.append(bo.d(this.g));
        String string;
        if (this.b != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" connected to ");
            sb2.append(this.b.f(set));
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }
}
