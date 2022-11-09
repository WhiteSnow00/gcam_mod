import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxd implements mwy
{
    public final aq a;
    public final ah b;
    
    public mxd(final aq a) {
        this.a = a;
        new mwz(a);
        this.b = new mxa(a);
    }
    
    @Override
    public final oxk a(final mxe mxe) {
        return oxk.i(new mxb(this, mxe));
    }
    
    @Override
    public final oxk b(final Iterable iterable) {
        return oxk.i(new mxc(this, iterable));
    }
}
