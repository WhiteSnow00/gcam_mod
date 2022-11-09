import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cy
{
    public final ArrayList a;
    
    public cy() {
        this.a = new ArrayList();
    }
    
    public final void a(final cz cz) {
        this.a.clear();
        for (int i = 1; i < cz.e; ++i) {
            final db db = cz.g.a[i];
            for (int j = 0; j < 6; ++j) {
                db.e[j] = 0.0f;
            }
            db.e[db.c] = 1.0f;
            if (db.h == 4) {
                this.a.add(db);
            }
        }
        for (int size = this.a.size(), k = 0; k < size; ++k) {
            final db db2 = this.a.get(k);
            final int b = db2.b;
            if (b != -1) {
                final cv d = cz.c[b].d;
                for (int a = d.a, l = 0; l < a; ++l) {
                    final db d2 = d.d(l);
                    if (d2 != null) {
                        final float b2 = d.b(l);
                        for (int n = 0; n < 6; ++n) {
                            final float[] e = d2.e;
                            e[n] += db2.e[n] * b2;
                        }
                        if (!this.a.contains(d2)) {
                            this.a.add(d2);
                        }
                    }
                }
                for (int n2 = 0; n2 < 6; ++n2) {
                    db2.e[n2] = 0.0f;
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        final int size = this.a.size();
        String string = "Goal: ";
        for (int i = 0; i < size; ++i) {
            final db db = this.a.get(i);
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(db);
            sb2.append("[");
            String s = sb2.toString();
            int n = 0;
            while (true) {
                final float[] e = db.e;
                if (n >= 6) {
                    break;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(s);
                sb3.append(db.e[n]);
                final String string2 = sb3.toString();
                final float[] e2 = db.e;
                if (n < 5) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(string2);
                    sb4.append(", ");
                    s = sb4.toString();
                }
                else {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(string2);
                    sb5.append("] ");
                    s = sb5.toString();
                }
                ++n;
            }
            sb.append(s);
            string = sb.toString();
        }
        return string;
    }
}
