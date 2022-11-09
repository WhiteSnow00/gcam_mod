// 
// Decompiled by Procyon v0.6.0
// 

public final class fuw implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public fuw(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public fuw(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static fuw a(final pii pii, final pii pii2) {
        return new fuw(pii, pii2);
    }
    
    public final Integer b() {
        switch (this.c) {
            default: {
                final cxl cxl = (cxl)this.a.get();
                final hjx hjx = (hjx)this.b.get();
                int n;
                if (hjx.n("pref_mode_vesper_enabled")) {
                    if (hjx.m("pref_mode_vesper_enabled")) {
                        n = hjc.b.e;
                    }
                    else {
                        n = hjc.a.e;
                    }
                }
                else {
                    n = (int)cxl.a(cxg.a).c();
                }
                return n;
            }
            case 0: {
                final cxl cxl2 = (cxl)this.a.get();
                final fup a = ((fux)this.b).a();
                int a2;
                if (cxl2.k(cxx.O)) {
                    a2 = a.a;
                }
                else {
                    a2 = 0;
                }
                return a2;
            }
        }
    }
}
