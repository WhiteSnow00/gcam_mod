// 
// Decompiled by Procyon v0.6.0
// 

public class pqc extends pnh implements pjz
{
    public final pjl e;
    
    public pqc(final pjq pjq, final pjl e) {
        pjq.getClass();
        super(pjq);
        this.e = e;
    }
    
    @Override
    public final StackTraceElement cn() {
        return null;
    }
    
    @Override
    protected final boolean co() {
        return true;
    }
    
    @Override
    protected void f(final Object o) {
        ppr.a(pjv.b(this.e), plv.d(o, this.e));
    }
    
    @Override
    public final pjz g() {
        Object e;
        if (!((e = this.e) instanceof pjz)) {
            e = null;
        }
        return (pjz)e;
    }
    
    @Override
    protected void j(final Object o) {
        final pjl e = this.e;
        e.e(plv.d(o, e));
    }
}
