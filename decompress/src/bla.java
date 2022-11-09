// 
// Decompiled by Procyon v0.6.0
// 

public final class bla extends bld
{
    public bla(final fwk fwk, final fwv fwv, final bmm bmm, final boolean b) {
        super(fwk, fwv, bmm, b);
    }
    
    @Override
    protected final boolean a(final ljm ljm) {
        if (jlg.b != null) {
            final Integer n = (Integer)ljm.d(jlg.b);
            if (n != null && n == 1) {
                return true;
            }
        }
        return false;
    }
}
