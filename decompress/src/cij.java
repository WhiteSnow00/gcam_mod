import java.util.concurrent.Executor;
import android.content.res.Resources;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cij implements hze
{
    public final cnc a;
    public final hzg b;
    public final cxl c;
    public final hzj d;
    public final hzj e;
    public final hzj f;
    public final hzj g;
    public cif h;
    public cnb i;
    public List j;
    public krc k;
    public hzf l;
    private final hkd m;
    
    public cij(final Resources resources, final iru iru, final cnc a, final crg crg, final hzg b, final hzf hzf, final kjm kjm, final hkc hkc, final hkd m, final cxl c) {
        this.a = a;
        this.b = b;
        this.m = m;
        this.c = c;
        this.g = this.f(kjm, "StopRecordingInCritial", hzf.f, iru);
        this.d = this.f(kjm, "VideoRecording", hzf.g, iru);
        final hzi a2 = hzj.a();
        a2.c(kjm);
        a2.a = "PoorVideoQualityWarning";
        a2.f(hzf.f);
        a2.d(new cii(this, iru));
        a2.e(aas.b);
        this.e = a2.a();
        final hzi a3 = hzj.a();
        a3.c(kjm);
        a3.a = "VideoTorch";
        a3.f(hzf);
        a3.d(new cih(this, hkc, resources, crg, iru));
        a3.e(new cig(this));
        this.f = a3.a();
    }
    
    private final hzj f(final Executor executor, final String a, final hzf hzf, final iru iru) {
        final hzi a2 = hzj.a();
        a2.c(executor);
        a2.a = a;
        a2.f(hzf);
        a2.d(new cii(this, iru, 1));
        a2.e(new cig(this, 1));
        return a2.a();
    }
    
    public final hzf a() {
        synchronized (this) {
            return this.b.c();
        }
    }
    
    public final void b(final boolean b) {
        this.m.d(hjq.o, b);
    }
    
    @Override
    public final void c(final hzf hzf) {
        monitorenter(this);
        try {
            final nrw t = ((nns)this.j).t();
            while (t.hasNext()) {
                ((hze)t.next()).c(hzf);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d() {
        synchronized (this) {
            final krc k = this.k;
            if (k != null) {
                k.close();
                this.k = null;
            }
        }
    }
    
    public final boolean e() {
        return this.i.aX();
    }
}
