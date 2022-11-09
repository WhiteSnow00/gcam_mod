import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cw
{
    public db a;
    public float b;
    boolean c;
    public final cv d;
    boolean e;
    
    public cw(final cx cx) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.e = false;
        this.d = new cv(this, cx);
    }
    
    public final void a(final db a) {
        final db a2 = this.a;
        if (a2 != null) {
            this.d.f(a2, -1.0f);
            this.a = null;
        }
        final float n = -this.d.c(a);
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        final cv d = this.d;
        for (int f = d.f, n2 = 0; f != -1 && n2 < d.a; f = d.d[f], ++n2) {
            final float[] e = d.e;
            e[f] /= n;
        }
    }
    
    final void b() {
        final cv d = this.d;
        for (int f = d.f, n = 0; f != -1 && n < d.a; f = d.d[f], ++n) {
            final db db = d.b.a[d.c[f]];
            int n2 = 0;
            while (true) {
                final int g = db.g;
                if (n2 >= g) {
                    final cw[] f2 = db.f;
                    final int length = f2.length;
                    if (g >= length) {
                        db.f = Arrays.copyOf(f2, length + length);
                    }
                    final cw[] f3 = db.f;
                    final int g2 = db.g;
                    f3[g2] = this;
                    db.g = g2 + 1;
                    break;
                }
                if (db.f[n2] == this) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    public final void c(final db db, final db db2) {
        this.d.f(db, 1.0f);
        this.d.f(db2, -1.0f);
    }
    
    final void d(final db db, final db db2, final int n, final float n2, final db db3, final db db4, final int n3) {
        if (db2 == db3) {
            this.d.f(db, 1.0f);
            this.d.f(db4, 1.0f);
            this.d.f(db2, -2.0f);
            return;
        }
        if (n2 == 0.5f) {
            this.d.f(db, 1.0f);
            this.d.f(db2, -1.0f);
            this.d.f(db3, -1.0f);
            this.d.f(db4, 1.0f);
            if (n > 0 || n3 > 0) {
                this.b = (float)(-n + n3);
            }
        }
        else {
            if (n2 <= 0.0f) {
                this.d.f(db, -1.0f);
                this.d.f(db2, 1.0f);
                this.b = (float)n;
                return;
            }
            if (n2 >= 1.0f) {
                this.d.f(db3, -1.0f);
                this.d.f(db4, 1.0f);
                this.b = (float)n3;
                return;
            }
            final float n4 = 1.0f - n2;
            this.d.f(db, n4);
            this.d.f(db2, -n4);
            this.d.f(db3, -n2);
            this.d.f(db4, n2);
            if (n > 0 || n3 > 0) {
                this.b = -n * n4 + n3 * n2;
            }
        }
    }
    
    public final void e(final db db, final db db2, final db db3, final db db4, final float n) {
        this.d.f(db, -1.0f);
        this.d.f(db2, 1.0f);
        this.d.f(db3, n);
        this.d.f(db4, -n);
    }
    
    public final void f(float n, final float n2, final float n3, final db db, final int n4, final db db2, final int n5, final db db3, final int n6, final db db4, final int n7) {
        if (n2 != 0.0f && n != n3) {
            n = n / n2 / (n3 / n2);
            this.b = -n4 - n5 + n6 * n + n7 * n;
            this.d.f(db, 1.0f);
            this.d.f(db2, -1.0f);
            this.d.f(db4, n);
            this.d.f(db3, -n);
            return;
        }
        this.b = (float)(-n4 - n5 + n6 + n7);
        this.d.f(db, 1.0f);
        this.d.f(db2, -1.0f);
        this.d.f(db4, 1.0f);
        this.d.f(db3, -1.0f);
    }
    
    public final void g(final db db, final int n) {
        if (n < 0) {
            this.b = (float)(-n);
            this.d.f(db, 1.0f);
            return;
        }
        this.b = (float)n;
        this.d.f(db, -1.0f);
    }
    
    public final void h(final db db, final db db2, int n) {
        if (n != 0) {
            boolean b;
            if (n < 0) {
                n = -n;
                b = true;
            }
            else {
                b = false;
            }
            this.b = (float)n;
            if (b) {
                this.d.f(db, 1.0f);
                this.d.f(db2, -1.0f);
                return;
            }
        }
        this.d.f(db, -1.0f);
        this.d.f(db2, 1.0f);
    }
    
    public final void i(final db db, final db db2, final db db3, int n) {
        if (n != 0) {
            int n2;
            if (n < 0) {
                n2 = -n;
                n = 1;
            }
            else {
                final int n3 = 0;
                n2 = n;
                n = n3;
            }
            this.b = (float)n2;
            if (n != 0) {
                this.d.f(db, 1.0f);
                this.d.f(db2, -1.0f);
                this.d.f(db3, -1.0f);
                return;
            }
        }
        this.d.f(db, -1.0f);
        this.d.f(db2, 1.0f);
        this.d.f(db3, 1.0f);
    }
    
    public final void j(final db db, final db db2, final db db3, int n) {
        if (n != 0) {
            int n2;
            if (n < 0) {
                n2 = -n;
                n = 1;
            }
            else {
                final int n3 = 0;
                n2 = n;
                n = n3;
            }
            this.b = (float)n2;
            if (n != 0) {
                this.d.f(db, 1.0f);
                this.d.f(db2, -1.0f);
                this.d.f(db3, 1.0f);
                return;
            }
        }
        this.d.f(db, -1.0f);
        this.d.f(db2, 1.0f);
        this.d.f(db3, -1.0f);
    }
    
    public final void k(final cw cw) {
        this.d.g(this, cw);
    }
    
    @Override
    public final String toString() {
        String string;
        if (this.a == null) {
            string = "0";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.a);
            string = sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" = ");
        String s = sb2.toString();
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append(this.b);
            s = sb3.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.d.a) {
            if (this.d.d(i) != null) {
                final float b2 = this.d.b(i);
                String s2;
                float n2;
                if (n == 0) {
                    s2 = s;
                    n2 = b2;
                    if (b2 < 0.0f) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append(s);
                        sb4.append("- ");
                        s2 = sb4.toString();
                        n2 = -b2;
                    }
                }
                else if (b2 > 0.0f) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(s);
                    sb5.append(" + ");
                    s2 = sb5.toString();
                    n2 = b2;
                }
                else {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(s);
                    sb6.append(" - ");
                    s2 = sb6.toString();
                    n2 = -b2;
                }
                if (n2 == 1.0f) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append(s2);
                    sb7.append("null");
                    s = sb7.toString();
                }
                else {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(s2);
                    sb8.append(n2);
                    sb8.append(" null");
                    s = sb8.toString();
                }
                n = 1;
            }
            ++i;
        }
        String string2 = s;
        if (n == 0) {
            final StringBuilder sb9 = new StringBuilder();
            sb9.append(s);
            sb9.append("0.0");
            string2 = sb9.toString();
        }
        return string2;
    }
}
