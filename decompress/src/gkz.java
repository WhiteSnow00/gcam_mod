import java.util.concurrent.Future;
import android.view.Display;
import android.graphics.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import android.view.WindowManager;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkz implements gkw, exn, exl, exm
{
    public final kse a;
    public final lit b;
    private final Activity c;
    private final WindowManager d;
    private final boolean e;
    private final krr f;
    private final Executor g;
    private final List h;
    private final kjk i;
    
    public gkz(final Activity c, final lit b, final WindowManager d, final krq krq, final bmz bmz, final Executor g, final kse a) {
        this.h = new ArrayList();
        this.c = c;
        this.i = bmz.i();
        b.getClass();
        this.b = b;
        this.d = d;
        this.g = g;
        this.a = a;
        final Display defaultDisplay = d.getDefaultDisplay();
        final Point point = new Point();
        defaultDisplay.getRealSize(point);
        final int rotation = defaultDisplay.getRotation();
        kre kre = kre.f(point);
        boolean e = true;
        if (rotation == 1 || rotation == 3) {
            kre = kre.j();
        }
        if (kre.a > kre.b) {
            e = false;
        }
        this.e = e;
        this.f = krq.a("OrientMgrImpl");
    }
    
    @Override
    public final void a(final Class clazz) {
        if (!this.h.contains(clazz)) {
            this.h.add(clazz);
        }
        final krr f = this.f;
        final int size = this.h.size();
        final StringBuilder sb = new StringBuilder(38);
        sb.append("Lock orientation requests: ");
        sb.append(size);
        f.b(sb.toString());
        this.c.setRequestedOrientation(14);
    }
    
    @Override
    public final void b(final Class clazz) {
        this.f.b("Try to unlock Orientation");
        this.h.remove(clazz);
        if (this.h.isEmpty()) {
            this.f.b("Orientation unlocked");
            this.c.setRequestedOrientation(2);
            return;
        }
        final krr f = this.f;
        final int size = this.h.size();
        final StringBuilder sb = new StringBuilder(67);
        sb.append("Can't unlock orientation now. Lock is held by ");
        sb.append(size);
        sb.append(" requests.");
        f.h(sb.toString());
    }
    
    @Override
    public final void bk() {
        btg.a(this.i, ofi.r(new gkx(this), this.g));
    }
    
    @Override
    public final kra c() {
        return this.b.a();
    }
    
    @Override
    public final void e() {
        this.a.e("orientation#disable", new gky(this.b, 1));
    }
    
    @Override
    public final kra f() {
        return kra.c(this.d.getDefaultDisplay());
    }
    
    @Override
    public final void g(final liq liq) {
        this.b.b(liq);
    }
    
    @Override
    public final void h(final liq liq) {
        this.b.c(liq);
    }
    
    @Override
    public final boolean i() {
        return this.e;
    }
    
    @Override
    public final void j(final cpl cpl) {
        final lit b = this.b;
        synchronized (b.c) {
            if (b.b.contains(cpl)) {
                return;
            }
            b.b.add(cpl);
        }
    }
    
    @Override
    public final void k(final cpl cpl) {
        final lit b = this.b;
        synchronized (b.c) {
            if (!b.b.remove(cpl)) {
                b.f.g("Removing non-existing raw listener.");
            }
        }
    }
    
    @Override
    public final int l() {
        return gko.a(this.c(), this.e);
    }
}
