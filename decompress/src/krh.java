import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krh
{
    private final krg a;
    private final ArrayList b;
    private int c;
    private int d;
    
    public krh(final krg a, final int n) {
        this.a = a;
        this.b = new ArrayList(n);
        this.c = n;
        for (int i = 0; i < n; ++i) {
            this.b.add(a.a());
        }
        this.d = n;
    }
    
    public final Object a() {
        int c = this.c;
        if (c > 0) {
            --c;
            final Object value = this.b.get(c);
            this.b.remove(c);
            --this.c;
            return value;
        }
        return this.a.a();
    }
    
    public final void b(final Object o) {
        final int c = this.c;
        final int d = this.d;
        if (c == d) {
            this.b.ensureCapacity(d + d);
            final int d2 = this.d;
            this.d = d2 + d2;
        }
        this.b.add(o);
        ++this.c;
    }
}
