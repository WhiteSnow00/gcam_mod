import android.util.ArraySet;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmf implements bjy
{
    private final kjk a;
    private final jgi b;
    private final jgg c;
    private final bjm d;
    private final /* synthetic */ int e;
    
    public bmf(final bjh bjh, final bjm d, final bkc bkc, final bke bke, final bku bku, final jgi b, final jgg c, final kjm kjm, final Set set, final jgo jgo, final jjb jjb, final imb imb, final niz niz, final bjj bjj, final lfg lfg, final klj klj, final klj klj2, final boolean b2, final int e) {
        this.e = e;
        final kjk a = new kjk();
        this.a = a;
        njo.d(lfg.C() || lfg.B());
        this.d = d;
        this.b = b;
        this.c = c;
        final bkb a2 = bkc.a(bjj);
        bkv a3;
        if (lfg.C()) {
            a3 = bku.a(klj, lfg);
            a.c(a3);
        }
        else {
            a3 = null;
        }
        final lfu l = lfg.l();
        if (b2) {
            b.d(new bmd(a, a2, bke, l, bjh, set, a3, jjb, imb, niz));
        }
        else {
            b.d(new bls(bjh, a2, bke, l, set, jjb, imb, niz));
        }
        c.f(jgo);
        d.b();
        a.c(d.a(klj));
        a.c(klj2.a(new bme(bke, 1), kjm));
    }
    
    public bmf(final bjh bjh, final bjm bjm, final bkc bkc, final bke bke, final bku bku, final jgi jgi, final jgg jgg, final kjm kjm, final Set set, final jgo jgo, final jjb jjb, final imb imb, final niz niz, final bjj bjj, final lfg lfg, final klj klj, final klj klj2, final boolean b, final byte[] array, final int e) {
        this.e = e;
        this(bjh, bjm, bkc, bke, bku, jgi, jgg, kjm, set, jgo, jjb, imb, niz, bjj, lfg, klj, klj2, b, 1);
        jgg.e();
    }
    
    public bmf(final bjh bjh, final bjm d, final bkc bkc, final bke bke, final jgi b, final jgg c, final kjm kjm, final jjb jjb, final imb imb, final niz niz, final bjj bjj, final lfg lfg, final klj klj, final klj klj2, final boolean b2) {
        final kjk a = new kjk();
        this.a = a;
        final boolean c2 = lfg.C();
        boolean b3 = true;
        if (!c2) {
            if (!lfg.B()) {
                b3 = false;
            }
        }
        njo.d(b3);
        this.d = d;
        this.b = b;
        this.c = c;
        final bkb a2 = bkc.a(bjj);
        final lfu l = lfg.l();
        if (b2) {
            b.d(new bmd(a, a2, bke, l, bjh, (Set)new ArraySet(), null, jjb, imb, niz));
        }
        else {
            b.d(new bls(bjh, a2, bke, l, nqr.a, jjb, imb, niz));
        }
        d.b();
        a.c(d.a(klj));
        a.c(klj2.a(new bme(bke), kjm));
    }
    
    @Override
    public final void close() {
        switch (this.e) {
            default: {
                this.a.close();
                this.d.b();
                this.b.c();
                this.c.e();
                return;
            }
            case 0: {
                this.a.close();
                this.d.b();
                this.b.c();
                this.c.e();
            }
        }
    }
}
