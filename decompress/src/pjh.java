// 
// Decompiled by Procyon v0.6.0
// 

public final class pjh implements pjo
{
    private final pjo a;
    private final pky b;
    
    public pjh() {
        throw null;
    }
    
    public pjh(final pjo pjo, final pky b) {
        this.b = b;
        pjo a = pjo;
        if (pjo instanceof pjh) {
            a = ((pjh)pjo).a;
        }
        this.a = a;
    }
    
    public final pjn a(final pjn pjn) {
        return (pjn)this.b.a(pjn);
    }
    
    public final boolean b(final pjo pjo) {
        return pjo == this || this.a == pjo;
    }
}
