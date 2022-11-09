// 
// Decompiled by Procyon v0.6.0
// 

public final class mlt implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public mlt(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public mlt(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final niz a() {
        switch (this.c) {
            default: {
                final pii a = this.a;
                niz niz;
                if (!(boolean)this.b.get()) {
                    niz = nii.a;
                }
                else {
                    niz = ((emd)a).a();
                }
                return niz;
            }
            case 0: {
                final niz niz2 = (niz)((ouo)this.a).a;
                ((egg)this.b).a();
                niz niz3;
                if (niz2.g()) {
                    niz2.getClass();
                    niz3 = niz.i(new mls(niz2));
                }
                else {
                    niz3 = nii.a;
                }
                return niz3;
            }
        }
    }
}
