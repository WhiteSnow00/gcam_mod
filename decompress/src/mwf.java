import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwf implements muq
{
    public final mza a;
    public final mwx b;
    private final F250RoomDatabase c;
    private final lmy d;
    private final oxj e;
    
    public mwf(final F250RoomDatabase c, final mwu mwu, final mza a, final mwb mwb, final mwm mwm, final mwx b, final lmy d, final myy myy, final oxj e) {
        c.getClass();
        mwu.getClass();
        a.getClass();
        mwb.getClass();
        mwm.getClass();
        b.getClass();
        d.getClass();
        myy.getClass();
        e.getClass();
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final oxc a(final Set set, final List list) {
        final myz myz = new myz(this.d, new mvj(set, list), null);
        final mxt t = this.c.t();
        final StringBuilder sb = new StringBuilder("SELECT * FROM ResourceEntity");
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final nrv bn = ((nqy)set).bN();
        while (bn.hasNext()) {
            final mya mya = bn.next();
            if (mya instanceof mvg) {
                final mvg mvg = (mvg)mya;
                throw null;
            }
            if (mya instanceof mvi) {
                final mvi mvi = (mvi)mya;
                throw null;
            }
            if (mya instanceof mvd) {
                final mvd mvd = (mvd)mya;
                throw null;
            }
            if (mya instanceof mvq) {
                final mvq mvq = (mvq)mya;
                throw null;
            }
            if (mya instanceof mvf) {
                final mvf mvf = (mvf)mya;
                throw null;
            }
            if (mya instanceof mvk) {
                final mvk mvk = (mvk)mya;
                throw null;
            }
            if (mya instanceof mvr) {
                final mvr mvr = (mvr)mya;
                throw null;
            }
            if (mya instanceof mut) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("status_airlockFileState IN ");
                sb2.append(pjf.q(((mut)mya).a, ",", "(", ")", mwi.f, 24));
                list2.add(sb2.toString());
            }
            else {
                if (!(mya instanceof mvu)) {
                    continue;
                }
                final mvu mvu = (mvu)mya;
                throw null;
            }
        }
        if (!list3.isEmpty()) {
            sb.append(" JOIN ResourceFts ON ResourceEntity.onDeviceId == ResourceFts.docid");
            list2.add(pjf.q(list3, " AND ", "( ResourceFts MATCH ", ")", null, 56));
        }
        if (!list2.isEmpty()) {
            pjf.p(list2, sb, " AND ", " WHERE ", "", -1, "...", null);
        }
        final aey aey = new aey(sb.toString());
        final mxz mxz = (mxz)t;
        final aq a = mxz.a;
        final mxu mxu = new mxu(mxz, aey);
        final oxj a2 = pib.a(a.a);
        final owz a3 = owz.a(mxu);
        final pdw pdw = new pdw(oxc.a(new av(new String[] { "ResourceEntity" }, a)).cf(a2), a2);
        pip.k();
        final pcw pcw = new pcw(pdw.d(a2), new aw(a3));
        pip.k();
        final oxc cf = pcw.cf(this.e);
        final oyr a4 = oyr.a;
        phn.g(a4, "collectionSupplier is null");
        final pco pco = new pco(cf, a4);
        pip.k();
        final pcz pcz = new pcz(pco, new mwd(this));
        pip.k();
        final oxc i = pcz.i(oyw.d, new mwe(this, myz));
        final pdt pdt = new pdt(i);
        pip.k();
        final oxc j = pdt.i(new mwe(this, myz, 1), oyw.d);
        final pdo pdo = new pdo(i);
        pip.k();
        final pcx pcx = new pcx(new oxf[] { j, pdo });
        pip.k();
        final int a5 = owx.a;
        phn.h(2, "maxConcurrency");
        phn.h(a5, "bufferSize");
        final pct pct = new pct(pcx, a5);
        pip.k();
        return pct;
    }
}
