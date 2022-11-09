import java.util.Iterator;
import java.util.ArrayList;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class hrc implements hqt, exn
{
    public final Context h;
    public final PackageManager i;
    public final Resources j;
    public final hrh k;
    public final hpw l;
    public final bqv m;
    public final hqo n;
    public final Handler o;
    public final hqs p;
    public final Runnable q;
    public final hrk r;
    public final hsw s;
    public bqr t;
    public ResolveInfo u;
    
    public hrc(final Context h, final hrh k, final hpw l, final bqv m, final hqo n, final Handler o, final PackageManager i, final Resources j, final hrk r, final hqs p11, final hsw s) {
        this.h = h;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.r = r;
        this.p = p11;
        this.s = s;
        String.valueOf(Integer.toHexString(this.hashCode())).length();
        this.q = new hpn(this, 3);
        this.i = i;
        this.j = j;
    }
    
    public final void q(final boolean b, final boolean b2) {
        this.s.c(b);
        this.l.c(b);
        this.t = null;
        final hqs p2 = this.p;
        if (p2.c) {
            p2.c();
        }
        if (b2) {
            this.r.a();
        }
    }
    
    public final void r(final bqr t) {
        this.t = t;
        final hqo n = this.n;
        t.getClass();
        final ArrayList a = n.a(t);
        final List list = (List)Collection$_EL.stream((Collection)a).map((Function)cdd.n).collect(Collectors.toList());
        this.s.b(a);
        final hqs p = this.p;
        final Context h = this.h;
        njo.o(p.c);
        if (!(boolean)p.a.c(hjq.y)) {
            final ArrayList list2 = new ArrayList();
            list2.add(h.getPackageName());
            list2.addAll(hrn.c);
            final ArrayList list3 = new ArrayList();
            for (final ResolveInfo resolveInfo : list) {
                if (!list2.contains(resolveInfo.activityInfo.packageName)) {
                    list3.add(resolveInfo);
                }
            }
            if (!list3.isEmpty()) {
                p.b.d(hjq.y, true);
            }
        }
        this.p.d(hqr.b);
        this.p.f(3);
    }
}
