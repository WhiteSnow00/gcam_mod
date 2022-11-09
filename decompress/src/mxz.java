import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxz implements mxt
{
    public final aq a;
    public final ah b;
    
    public mxz(final aq a) {
        this.a = a;
        new mxv(a);
        this.b = new mxw(a);
    }
    
    @Override
    public final oxk a(final myc myc) {
        return oxk.i(new mxx(this, myc));
    }
    
    @Override
    public final oxk b(final Iterable iterable) {
        return oxk.i(new mxy(this, iterable));
    }
}
