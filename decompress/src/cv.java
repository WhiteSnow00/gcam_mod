import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cv
{
    public int a;
    public final cx b;
    public int[] c;
    public int[] d;
    public float[] e;
    public int f;
    public int g;
    public boolean h;
    private final cw i;
    private int j;
    
    public cv(final cw i, final cx b) {
        this.a = 0;
        this.j = 8;
        this.c = new int[8];
        this.d = new int[8];
        this.e = new float[8];
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = i;
        this.b = b;
    }
    
    public final float a(final db db) {
        for (int f = this.f, n = 0; f != -1 && n < this.a; f = this.d[f], ++n) {
            if (this.c[f] == db.a) {
                return this.e[f];
            }
        }
        return 0.0f;
    }
    
    final float b(final int n) {
        for (int f = this.f, n2 = 0; f != -1 && n2 < this.a; f = this.d[f], ++n2) {
            if (n2 == n) {
                return this.e[f];
            }
        }
        return 0.0f;
    }
    
    public final float c(final db db) {
        int f = this.f;
        if (f != -1) {
            int n = 0;
            int n2 = -1;
            while (f != -1 && n < this.a) {
                final int n3 = this.c[f];
                if (n3 == db.a) {
                    if (f == this.f) {
                        this.f = this.d[f];
                    }
                    else {
                        final int[] d = this.d;
                        d[n2] = d[f];
                    }
                    this.b.a[n3].a(this.i);
                    --this.a;
                    this.c[f] = -1;
                    if (this.h) {
                        this.g = f;
                    }
                    return this.e[f];
                }
                final int n4 = this.d[f];
                ++n;
                n2 = f;
                f = n4;
            }
        }
        return 0.0f;
    }
    
    final db d(final int n) {
        for (int f = this.f, n2 = 0; f != -1 && n2 < this.a; f = this.d[f], ++n2) {
            if (n2 == n) {
                return this.b.a[this.c[f]];
            }
        }
        return null;
    }
    
    public final void e(final db db, float n) {
        if (n == 0.0f) {
            return;
        }
        int f = this.f;
        if (f == -1) {
            this.f = 0;
            this.e[0] = n;
            this.c[0] = db.a;
            this.d[0] = -1;
            ++this.a;
            if (!this.h) {
                ++this.g;
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (f != -1 && n2 < this.a) {
            final int n4 = this.c[f];
            final int a = db.a;
            if (n4 == a) {
                final float[] e = this.e;
                n += e[f];
                e[f] = n;
                if (n == 0.0f) {
                    if (f == this.f) {
                        this.f = this.d[f];
                    }
                    else {
                        final int[] d = this.d;
                        d[n3] = d[f];
                    }
                    this.b.a[n4].a(this.i);
                    if (this.h) {
                        this.g = f;
                    }
                    --this.a;
                }
                return;
            }
            else {
                if (n4 < a) {
                    n3 = f;
                }
                f = this.d[f];
                ++n2;
            }
        }
        final int g = this.g;
        int length;
        if (this.h) {
            final int[] c = this.c;
            length = g;
            if (c[g] != -1) {
                length = c.length;
            }
        }
        else {
            length = g + 1;
        }
        final int length2 = this.c.length;
        int n5;
        if ((n5 = length) >= length2) {
            n5 = length;
            if (this.a < length2) {
                int n6 = 0;
                while (true) {
                    final int[] c2 = this.c;
                    n5 = length;
                    if (n6 >= c2.length) {
                        break;
                    }
                    if (c2[n6] == -1) {
                        n5 = n6;
                        break;
                    }
                    ++n6;
                }
            }
        }
        final int length3 = this.c.length;
        int f2;
        if ((f2 = n5) >= length3) {
            final int j = this.j;
            final int i = j + j;
            this.j = i;
            this.h = false;
            this.g = length3 - 1;
            this.e = Arrays.copyOf(this.e, i);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            f2 = length3;
        }
        final int[] c3 = this.c;
        c3[f2] = db.a;
        this.e[f2] = n;
        if (n3 != -1) {
            final int[] d2 = this.d;
            d2[f2] = d2[n3];
            d2[n3] = f2;
        }
        else {
            this.d[f2] = this.f;
            this.f = f2;
        }
        ++this.a;
        if (!this.h) {
            ++this.g;
        }
        final int g2 = this.g;
        final int length4 = c3.length;
        if (g2 >= length4) {
            this.h = true;
            this.g = length4 - 1;
        }
    }
    
    public final void f(final db db, final float n) {
        if (n == 0.0f) {
            this.c(db);
            return;
        }
        int f = this.f;
        if (f == -1) {
            this.f = 0;
            this.e[0] = n;
            this.c[0] = db.a;
            this.d[0] = -1;
            ++this.a;
            if (!this.h) {
                ++this.g;
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (f != -1 && n2 < this.a) {
            final int n4 = this.c[f];
            final int a = db.a;
            if (n4 == a) {
                this.e[f] = n;
                return;
            }
            if (n4 < a) {
                n3 = f;
            }
            f = this.d[f];
            ++n2;
        }
        final int g = this.g;
        int length;
        if (this.h) {
            final int[] c = this.c;
            length = g;
            if (c[g] != -1) {
                length = c.length;
            }
        }
        else {
            length = g + 1;
        }
        final int length2 = this.c.length;
        int n5;
        if ((n5 = length) >= length2) {
            n5 = length;
            if (this.a < length2) {
                int n6 = 0;
                while (true) {
                    final int[] c2 = this.c;
                    n5 = length;
                    if (n6 >= c2.length) {
                        break;
                    }
                    if (c2[n6] == -1) {
                        n5 = n6;
                        break;
                    }
                    ++n6;
                }
            }
        }
        final int length3 = this.c.length;
        int f2;
        if ((f2 = n5) >= length3) {
            final int j = this.j;
            final int i = j + j;
            this.j = i;
            this.h = false;
            this.g = length3 - 1;
            this.e = Arrays.copyOf(this.e, i);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
            f2 = length3;
        }
        final int[] c3 = this.c;
        c3[f2] = db.a;
        this.e[f2] = n;
        if (n3 != -1) {
            final int[] d = this.d;
            d[f2] = d[n3];
            d[n3] = f2;
        }
        else {
            this.d[f2] = this.f;
            this.f = f2;
        }
        final int a2 = this.a + 1;
        this.a = a2;
        if (!this.h) {
            ++this.g;
        }
        if (a2 >= c3.length) {
            this.h = true;
        }
    }
    
    final void g(final cw cw, final cw cw2) {
        int n = this.f;
        int n2 = 0;
        while (n != -1 && n2 < this.a) {
            final int n3 = this.c[n];
            final db a = cw2.a;
            if (n3 == a.a) {
                final float n4 = this.e[n];
                this.c(a);
                final cv d = cw2.d;
                for (int f = d.f, n5 = 0; f != -1 && n5 < d.a; f = d.d[f], ++n5) {
                    this.e(this.b.a[d.c[f]], d.e[f] * n4);
                }
                cw.b += cw2.b * n4;
                cw2.a.a(cw);
                n = this.f;
                n2 = 0;
            }
            else {
                n = this.d[n];
                ++n2;
            }
        }
    }
    
    @Override
    public final String toString() {
        int f = this.f;
        String string = "";
        for (int n = 0; f != -1 && n < this.a; f = this.d[f], ++n) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" -> ");
            final String string2 = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(this.e[f]);
            sb2.append(" : ");
            final String string3 = sb2.toString();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string3);
            sb3.append(this.b.a[this.c[f]]);
            string = sb3.toString();
        }
        return string;
    }
}
