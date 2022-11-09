// 
// Decompiled by Procyon v0.6.0
// 

public final class ckq
{
    public kmv a;
    private final ckl b;
    private final ckm c;
    private final ckj d;
    private final cki e;
    private final klv f;
    private final kkz g;
    
    public ckq(final ckl b, final ckm c, final kkz g, final ckj d, final cki e, final klv f) {
        this.a = kmv.h;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ckp a(final jbm jbm) {
        final jbm a = jbm.a;
        switch (jbm.ordinal()) {
            default: {
                return this.b;
            }
            case 8: {
                return this.d;
            }
            case 5: {
                return this.g;
            }
            case 2: {
                ckp ckp;
                if (this.f.aQ() == clp.c) {
                    ckp = this.e;
                }
                else if (this.a.e()) {
                    ckp = this.c;
                }
                else {
                    ckp = this.b;
                }
                return ckp;
            }
        }
    }
}
