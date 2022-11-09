import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eol implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public eol(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public eol(final pii a, final pii b, final pii c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public eol(final pii b, final pii c, final pii a, final int d, final byte[] array) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static eol b(final pii pii, final pii pii2, final pii pii3) {
        return new eol(pii, pii2, pii3, 1);
    }
    
    public final niz a() {
        switch (this.d) {
            default: {
                final niz niz = (niz)((ouo)this.b).a;
                final niz niz2 = (niz)((ouo)this.c).a;
                final pii a = this.a;
                niz niz3;
                if (!niz.g() && !niz2.g()) {
                    niz3 = nii.a;
                }
                else {
                    a.getClass();
                    niz3 = niz.i(new mli(a));
                }
                return niz3;
            }
            case 1: {
                final Set a2 = ((ous)this.a).a();
                final jfw jfw = (jfw)this.b.get();
                final cxl cxl = (cxl)this.c.get();
                niz niz4;
                if (cxl.k(cxr.be)) {
                    niz4 = nii.a;
                }
                else if (a2.isEmpty()) {
                    cxl.e();
                    cxl.e();
                    niz4 = nii.a;
                }
                else {
                    niz4 = niz.i(jfw.a(a2));
                }
                return niz4;
            }
            case 0: {
                final Set a3 = ((ous)this.a).a();
                final jfw jfw2 = (jfw)this.b.get();
                final cxl cxl2 = (cxl)this.c.get();
                niz niz5;
                if (!a3.isEmpty() && !cxl2.k(cxr.bf)) {
                    niz5 = niz.i(jfw2.a(a3));
                }
                else {
                    niz5 = nii.a;
                }
                return niz5;
            }
        }
    }
}
