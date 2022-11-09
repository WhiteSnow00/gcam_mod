import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdc implements awi
{
    private final awi a;
    private final Resources b;
    
    public bdc(final Resources b, final awi a) {
        bit.a(b);
        this.b = b;
        bit.a(a);
        this.a = a;
    }
    
    @Override
    public final aza a(final Object o, final int n, final int n2, final awg awg) {
        return bei.f(this.b, this.a.a(o, n, n2, awg));
    }
    
    @Override
    public final boolean b(final Object o, final awg awg) {
        return this.a.b(o, awg);
    }
}
