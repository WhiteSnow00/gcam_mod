// 
// Decompiled by Procyon v0.6.0
// 

public final class pnz extends pjg implements pjn
{
    public static final pnx b;
    public final long a;
    
    static {
        b = new pnx();
    }
    
    public pnz(final long a) {
        super(pnz.b);
        this.a = a;
    }
    
    @Override
    public final Object a(final Object o, final plc plc) {
        return pjv.c(this, o, plc);
    }
    
    @Override
    public final pjn b(final pjo pjo) {
        return pjv.d(this, pjo);
    }
    
    @Override
    public final pjq cg(final pjo pjo) {
        return pjv.e(this, pjo);
    }
    
    @Override
    public final pjq ch(final pjq pjq) {
        pjq.getClass();
        pjq.getClass();
        return pjv.f(this, pjq);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pnz && this.a == ((pnz)o).a);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineId(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
