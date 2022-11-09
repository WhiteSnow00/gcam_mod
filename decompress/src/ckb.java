// 
// Decompiled by Procyon v0.6.0
// 

public final class ckb
{
    private final pii a;
    private final cjy b;
    
    public ckb(final pii a, final cjy b) {
        this.a = a;
        this.b = b;
    }
    
    public final cjx a(final cjq c) {
        final Object value = this.a.get();
        final cjy b = this.b;
        final elv elv = (elv)value;
        elv.b = b;
        elv.c = c;
        pqf.j(elv.b, cjy.class);
        pqf.j(elv.c, cjq.class);
        return new elw(elv.a, elv.c, elv.b);
    }
}
