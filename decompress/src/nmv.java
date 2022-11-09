// 
// Decompiled by Procyon v0.6.0
// 

final class nmv extends nkv
{
    final Object a;
    int b;
    final /* synthetic */ nnb c;
    
    public nmv(final nnb c, final int b) {
        this.c = c;
        this.a = c.a[b];
        this.b = b;
    }
    
    final void a() {
        final int b = this.b;
        if (b != -1) {
            final nnb c = this.c;
            if (b <= c.c) {
                if (nqb.E(c.a[b], this.a)) {
                    return;
                }
            }
        }
        this.b = this.c.b(this.a);
    }
    
    @Override
    public final Object getKey() {
        return this.a;
    }
    
    @Override
    public final Object getValue() {
        this.a();
        final int b = this.b;
        if (b == -1) {
            return null;
        }
        return this.c.b[b];
    }
    
    @Override
    public final Object setValue(final Object o) {
        this.a();
        final int b = this.b;
        if (b == -1) {
            return this.c.put(this.a, o);
        }
        final Object o2 = this.c.b[b];
        if (nqb.E(o2, o)) {
            return o;
        }
        this.c.j(this.b, o, false);
        return o2;
    }
}
