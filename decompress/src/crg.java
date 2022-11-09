import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.concurrent.Executor;
import j$.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import android.content.Intent;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crg implements cse, klj
{
    private static final nsd d;
    public lfu a;
    public final klv b;
    public final List c;
    private final kjm e;
    private final klj f;
    private boolean g;
    private fxu h;
    private boolean i;
    private fxu j;
    private final Intent k;
    private final ctr l;
    private final csg m;
    private final dfz n;
    private final List o;
    private final crw p;
    private final lfw q;
    private final crv r;
    
    static {
        d = nsd.g("com/google/android/apps/camera/camerafacing/CameraFacingController");
    }
    
    public crg(final lfw q, final kjm e, final crv r, final csg m, final ctr l, final crw p8, final dfz n, final Intent k) {
        this.a = lfu.b;
        this.c = new ArrayList();
        final ArrayList o = new ArrayList();
        this.o = o;
        this.q = q;
        this.e = e;
        this.g = false;
        this.i = false;
        this.k = k;
        this.r = r;
        this.m = m;
        this.l = l;
        this.p = p8;
        this.n = n;
        o.add(new crf(lfu.b, this.l() != null));
        o.add(new crf(lfu.a, this.m() != null));
        lfu a;
        if (this.l() != null) {
            a = lfu.b;
        }
        else {
            a = lfu.a;
        }
        this.a = a;
        final kkz b = new kkz(this.a);
        this.b = b;
        this.f = new bts(klq.j(kld.c(b), new crc(this)));
        if (this.o()) {
            l.e(lfu.a, lfu.b);
        }
        else if (!this.p(lfu.a)) {
            l.e(lfu.b);
        }
        else if (!this.p(lfu.b)) {
            l.e(lfu.a);
        }
        lfu lfu;
        if (bmx.m(k)) {
            lfu = lfu.a;
        }
        else {
            lfu = lfu.b;
        }
        this.n(lfu);
        if (!this.o() && lfu != b.d) {
            if (p8.h()) {
                this.n((lfu)b.d);
                l.f(lfu);
                r.a(lfu, 2, 2);
                return;
            }
            final String name = lfu.name();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18);
            sb.append("No ");
            sb.append(name);
            sb.append(" camera present");
            n.b(new dfx(sb.toString(), kst.b, new lfu[] { lfu }));
        }
    }
    
    private final fxu l() {
        synchronized (this) {
            if (!this.g) {
                this.h = q(this.q, lfu.b);
                this.g = true;
            }
            return this.h;
        }
    }
    
    private final fxu m() {
        synchronized (this) {
            if (!this.i) {
                this.j = q(this.q, lfu.a);
                this.i = true;
            }
            return this.j;
        }
    }
    
    private final void n(final lfu lfu) {
        final crf crf = (crf)Collection$_EL.stream((Collection)this.o).filter((Predicate)new cre(lfu, 4)).findFirst().orElse((Object)null);
        if (crf != null) {
            crf.d = true;
        }
    }
    
    private final boolean o() {
        return Collection$_EL.stream((Collection)this.o).filter((Predicate)bne.d).count() == 2L;
    }
    
    private final boolean p(final lfu lfu) {
        return Collection$_EL.stream((Collection)this.o).anyMatch((Predicate)new cre(lfu, 3));
    }
    
    private static fxu q(final lfw lfw, final lfu lfu) {
        final lfj e = lfw.e(lfu);
        if (e == null) {
            return null;
        }
        return lfw.f(e);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.f.a(kri, executor);
    }
    
    public final csd c() {
        return (csd)this.f.aQ();
    }
    
    public final fxu d(final lfu lfu) {
        if (lfu == lfu.b && this.l() != null) {
            return this.l();
        }
        if (lfu == lfu.a && this.m() != null) {
            return this.m();
        }
        a.k(crg.d.c(), "No OneCameraCharacteristics found for: %s", this.e(), '\u0259');
        return null;
    }
    
    @Override
    public final lfu e() {
        return (lfu)((kkz)this.b).d;
    }
    
    public final niz f() {
        return niz.h(this.d(this.e()));
    }
    
    public final void g(final lfu lfu) {
        final crf crf = (crf)Collection$_EL.stream((Collection)this.o).filter((Predicate)new cre(lfu, 1)).findFirst().orElse((Object)null);
        if (crf != null) {
            crf.c = false;
        }
    }
    
    public final void h(final lfu lfu) {
        if (!this.o()) {
            return;
        }
        this.b.aR(lfu);
    }
    
    public final void i(final Runnable runnable) {
        final lfu e = this.e();
        lfu lfu;
        if (e == lfu.b) {
            lfu = lfu.a;
        }
        else {
            lfu = lfu.b;
        }
        if (this.p(lfu)) {
            lfu lfu2;
            if (this.j()) {
                lfu2 = lfu.a;
            }
            else {
                lfu2 = lfu.b;
            }
            this.h(lfu2);
            this.e();
            knf.f(ofi.j((Iterable)Collection$_EL.stream((Collection)this.c).map((Function)new crd(this)).collect(Collectors.toList())), new crb(runnable), this.e);
        }
        else if (!this.p.h()) {
            final dfz n = this.n;
            final String name = lfu.name();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18);
            sb.append("No ");
            sb.append(name);
            sb.append(" camera present");
            n.b(new dfx(sb.toString(), kst.b, new lfu[] { lfu }));
        }
        if (this.p(e) && !this.p(lfu) && this.p.h()) {
            final Optional first = Collection$_EL.stream((Collection)this.o).filter((Predicate)new cre(lfu)).findFirst();
            int n2;
            if (first.isPresent() && ((crf)first.get()).b) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            if (n2 == 2) {
                final crf crf = (crf)Collection$_EL.stream((Collection)this.o).filter((Predicate)new cre(lfu, 2)).findFirst().orElse((Object)null);
                if (crf == null || !crf.d) {
                    this.l.f(lfu);
                }
            }
            this.r.a(lfu, 3, n2);
        }
        else if (!this.p(e) && !this.p(lfu) && this.p.h()) {
            this.m.c();
        }
        this.n(lfu);
    }
    
    public final boolean j() {
        return this.e() == lfu.b;
    }
    
    public final boolean k() {
        return this.e() == lfu.a;
    }
    
    @Override
    public final String toString() {
        if (!this.j()) {
            return "Front Camera";
        }
        return "Back Camera";
    }
}
