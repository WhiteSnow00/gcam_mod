import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlp extends nkv
{
    final /* synthetic */ nlr a;
    private final Object b;
    private int c;
    
    public nlp(final nlr a, final int c) {
        this.a = a;
        this.b = a.d[c];
        this.c = c;
    }
    
    private final void a() {
        final int c = this.c;
        if (c != -1 && c < this.a.size() && nqb.E(this.b, this.a.d[this.c])) {
            return;
        }
        this.c = this.a.d(this.b);
    }
    
    @Override
    public final Object getKey() {
        return this.b;
    }
    
    @Override
    public final Object getValue() {
        final Map h = this.a.h();
        if (h != null) {
            return h.get(this.b);
        }
        this.a();
        final int c = this.c;
        if (c == -1) {
            return null;
        }
        return this.a.e[c];
    }
    
    @Override
    public final Object setValue(final Object o) {
        final Map h = this.a.h();
        if (h != null) {
            return h.put(this.b, o);
        }
        this.a();
        final int c = this.c;
        if (c == -1) {
            this.a.put(this.b, o);
            return null;
        }
        final Object[] e = this.a.e;
        final Object o2 = e[c];
        e[c] = o;
        return o2;
    }
}
