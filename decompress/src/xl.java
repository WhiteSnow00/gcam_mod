// 
// Decompiled by Procyon v0.6.0
// 

public final class xl
{
    public final xw a;
    private final int b;
    
    public xl(final xj xj, final xk xk) {
        this.b = xm.a.b();
        final xy xy = new xy();
        xy.a = new xx(xj);
        xy.b = new yg(xk);
        pqf.j(xy.a, xx.class);
        pqf.j(xy.b, yg.class);
        this.a = new ya(xy.a, xy.b);
    }
    
    @Override
    public final String toString() {
        return plr.a("CameraPipe-", this.b);
    }
}
