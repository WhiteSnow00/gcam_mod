// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pkf extends pjy implements plq
{
    public pkf(final pjl pjl) {
        pjq d;
        if (pjl != null) {
            d = pjl.d();
        }
        else {
            d = null;
        }
        super(pjl, d);
    }
    
    @Override
    public final int i() {
        return 2;
    }
    
    @Override
    public final String toString() {
        String s;
        if (super.f == null) {
            s = plu.a(this);
            s.getClass();
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
