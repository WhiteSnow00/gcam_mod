// 
// Decompiled by Procyon v0.6.0
// 

public final class hlx implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final /* synthetic */ int e;
    
    public hlx(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public hlx(final pii c, final pii b, final pii a, final pii d, final int e) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public final klj a() {
        switch (this.e) {
            default: {
                final cxl cxl = (cxl)this.c.get();
                final klv klv = (klv)this.b.get();
                final boolean booleanValue = (boolean)this.a.get();
                final boolean booleanValue2 = (boolean)this.d.get();
                final cxo a = cxg.a;
                cxl.e();
                final klj j = klq.j(klv, new dit(booleanValue, booleanValue2, 2));
                pqf.k(j);
                return j;
            }
            case 0: {
                final klj i = klq.i((klj)this.a.get(), klq.j((klj)this.b.get(), new hls(((efx)this.c).a(), ((eft)this.d).a())));
                pqf.k(i);
                return i;
            }
        }
    }
}
