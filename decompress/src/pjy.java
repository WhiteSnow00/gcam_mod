// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pjy extends pjw
{
    private final pjq a;
    public transient pjl c;
    
    public pjy(final pjl pjl, final pjq a) {
        super(pjl);
        this.a = a;
    }
    
    @Override
    public final pjq d() {
        final pjq a = this.a;
        a.getClass();
        return a;
    }
    
    @Override
    protected final void h() {
        final pjl c = this.c;
        if (c != null && c != this) {
            final pjn b = this.d().b(pjm.a);
            b.getClass();
            ((pjm)b).g(c);
        }
        this.c = pjx.a;
    }
}
