import android.net.Uri;
import java.util.List;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mtc
{
    private final Map a;
    private final Map b;
    private final Executor c;
    private final mrs d;
    private final odp e;
    private final Map f;
    private final muc g;
    
    public mtc(final Executor c, final mrs d, final muc g, final Map f) {
        this.a = new HashMap();
        this.b = new HashMap();
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.g = g;
        this.f = f;
        njo.d(f.isEmpty() ^ true);
        this.e = emt.h;
    }
    
    public final mtv a(final mtb mtb) {
        synchronized (this) {
            final Uri a = mtb.a;
            final mtv mtv = this.a.get(a);
            mtv mtv3;
            if (mtv == null) {
                final Uri a2 = mtb.a;
                njo.i(a2.isHierarchical(), "Uri must be hierarchical: %s", a2);
                final String c = njb.c(a2.getLastPathSegment());
                final int lastIndex = c.lastIndexOf(46);
                final boolean b = true;
                String substring;
                if (lastIndex == -1) {
                    substring = "";
                }
                else {
                    substring = c.substring(lastIndex + 1);
                }
                njo.i(substring.equals("pb"), "Uri extension must be .pb: %s", a2);
                njo.e(mtb.b != null, "Proto schema cannot be null");
                njo.e(mtb.c != null, "Handler cannot be null");
                final mtx mtx = this.f.get("singleproc");
                njo.i(mtx != null && b, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                final String c2 = njb.c(mtb.a.getLastPathSegment());
                final int lastIndex2 = c2.lastIndexOf(46);
                String substring2 = c2;
                if (lastIndex2 != -1) {
                    substring2 = c2.substring(0, lastIndex2);
                }
                final mtv mtv2 = new mtv(mtx.a(mtb, substring2, this.c, this.d), odg.i(ofi.n(mtb.a), this.e, odx.a), mtb.f, mtb.g);
                final nns d = mtb.d;
                if (!d.isEmpty()) {
                    mtv2.c(new msz(d, this.c));
                }
                this.a.put(a, mtv2);
                this.b.put(a, mtb);
                mtv3 = mtv2;
            }
            else {
                njo.i(mtb.equals(this.b.get(a)), "Arguments must match previous call for Uri: %s", a);
                mtv3 = mtv;
            }
            return mtv3;
        }
    }
}
