// 
// Decompiled by Procyon v0.6.0
// 

public final class ghb implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final /* synthetic */ int d;
    
    public ghb(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ghb(final pii c, final pii b, final pii a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final klj a() {
        switch (this.d) {
            default: {
                final klj j = klq.j(((hlx)this.c).a(), new dit((boolean)this.b.get(), (boolean)this.a.get()));
                pqf.k(j);
                return j;
            }
            case 0: {
                final fxu a = ((fzw)this.a).a();
                final klv klv = (klv)this.b.get();
                klv klv2 = (klv)this.c.get();
                if (a.l() != lfu.a) {
                    klv2 = klv;
                }
                final klj i = klq.j(klv2, fzt.f);
                pqf.k(i);
                return i;
            }
        }
    }
}
