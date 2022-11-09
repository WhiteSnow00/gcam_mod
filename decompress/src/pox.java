// 
// Decompiled by Procyon v0.6.0
// 

public final class pox extends ppb implements pou
{
    private final boolean a;
    
    public pox() {
        this.A(null);
        pnl z = this.z();
        final boolean b = z instanceof pnm;
        boolean a = true;
        if (!b) {
            z = null;
        }
        final pnm pnm = (pnm)z;
        Label_0101: {
            Label_0099: {
                if (pnm != null) {
                    ppb ppb = pnm.e();
                    if (ppb != null) {
                        while (!ppb.ci()) {
                            pnl z2;
                            if (!((z2 = ppb.z()) instanceof pnm)) {
                                z2 = null;
                            }
                            final pnm pnm2 = (pnm)z2;
                            if (pnm2 == null || (ppb = pnm2.e()) == null) {
                                break Label_0099;
                            }
                        }
                        break Label_0101;
                    }
                }
            }
            a = false;
        }
        this.a = a;
    }
    
    @Override
    public final boolean ci() {
        return this.a;
    }
    
    @Override
    public final boolean t() {
        return true;
    }
}
