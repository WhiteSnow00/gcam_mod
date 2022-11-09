import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class laf implements kwt
{
    private final pii a;
    
    public laf(final pii a) {
        this.a = a;
    }
    
    @Override
    public final kwd a(final kwg kwg) {
        final elu a = ((eld)this.a).a();
        pqf.j(a.b = new kyo(kwg), kyo.class);
        final emf a2 = a.a;
        final kyo b = a.b;
        final kys kys = new kys(b);
        final pii b2 = oum.b(kyt.a);
        final pii b3 = oum.b(kyx.a);
        final pii b4 = oum.b(lef.a);
        final lbl lbl = new lbl(a2.aB);
        final kyq kyq = new kyq(a2.Y, kys);
        final pii b5 = oum.b(new ldu(a2.aA, a2.ao, a2.D, a2.o, b4, lbl, a2.g, kyq, a2.aD));
        final pii b6 = oum.b(new iki(b2, a2.ao, b3, a2.D, 9, (char[][])null));
        final pii b7 = oum.b(new kyu(new ldz(kys, b5, b6, a2.D, a2.o, lbl, a2.Y), kys));
        final pii b8 = oum.b(new iih(b3, kys, a2.Y, b7, a2.aC, b4, oum.b(new kyg(b4, kyq, 8, (boolean[])null)), 4, (short[])null));
        final pii b9 = oum.b(new kyg(kys, a2.D, 3));
        final pii b10 = oum.b(new gtd(b3, b7, a2.aD, b9, a2.D, a2.o, 16, (short[][][])null));
        final pii a3 = out.a(new iyb(oum.b(new kyg(b6, a2.ao, 2, (byte[])null)), 20));
        final pii b11 = oum.b(new ifk(a2.D, a3, a2.aE, lbl, a2.o, 7, (float[])null));
        final pii b12 = oum.b(new iyb(b9, 19));
        final kzr kzr = new kzr(oum.b(new kyg(a3, a2.o)));
        final pii b13 = oum.b(new ied(a2.aD, a2.aF, kzr, 17, (char[][][])null));
        final pii b14 = oum.b(new gtd(b13, b10, kzr, b2, a2.D, a2.o, 17, (int[][][])null));
        final pii b15 = oum.b(new kyg(b2, a2.ao, 6));
        final pii b16 = oum.b(new ifk(b7, b2, oum.b(new kzg(b15, 4)), a2.D, a2.o, 8, (byte[][])null));
        final pii b17 = oum.b(new iih(a2.g, kys, oum.b(new gtd(kyq, kys, b7, b16, a2.D, a2.o, 19, (float[][][])null)), oum.b(new gtd(kyq, kys, b7, b16, a2.D, a2.o, 20, null, null)), oum.b(new lbt(kyq, kys, b7, b16, a2.D, a2.o, 1)), oum.b(new lbt(kyq, kys, b7, b16, a2.D, a2.o)), oum.b(new iki(b7, b16, a2.D, a2.o, 13, (float[][])null)), 5, (int[])null));
        final pii b18 = oum.b(new kyg(b2, b15, 7, (int[])null));
        final pii b19 = oum.b(new lan(kys, a2.aJ, b17, b16, b15, b18, b2, a2.o, a2.D, lbl, new lbv(new lct(kys)), 2, (byte[])null));
        final pii b20 = oum.b(new kyg(b6, a2.D, 4, (char[])null));
        final ied ied = new ied(b13, b11, b20, 18, (short[][][])null);
        final kzg kzg = new kzg(oum.b(new kzg(b8, 5)), 6);
        final oun a4 = ous.a;
        final List j = pjv.j(1);
        final List i = pjv.j(0);
        pqf.i(kzg, j);
        final gtd gtd = new gtd(kys, b20, ied, b12, b11, oum.b(new kyr(b, pqf.g(j, i), a3, a2.o)), 18, (boolean[][][])null);
        final pii b21 = oum.b(new kyg(kyq, oum.b(new kzg(kys, 1)), 1));
        final lai lai = new lai(gtd, new iki(b21, kyq, a2.D, kys, 12, (boolean[][])null));
        final oul oul = new oul();
        final pii b22 = oum.b(new iki(b21, kyq, oul, a2.D, 10, (short[][])null));
        oul.a(oul, oum.b(new iki(b18, b2, lai, new las(b22), 11, (int[][])null)));
        final kwd kwd = (kwd)oum.b(new kyp(a2.D, a2.o, kys, b2, a2.ay, new kze(b3, a2.az, b8, b10, b11, b12, b14, oum.b(new lan(b11, b16, b12, b14, b19, oul, b3, a2.az, b2, a2.o, a2.D)), b2, a2.E, oul, new kzk(b13, a2.o), lbl, a2.aE, a2.D, b22))).get();
        kwd.e();
        return kwd;
    }
}
