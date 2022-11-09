import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

// 
// Decompiled by Procyon v0.6.0
// 

public class ejm extends exr
{
    public kse k;
    public ewn l;
    public cxl m;
    public bqz n;
    private final Object o;
    private boolean p;
    private volatile efs q;
    private volatile ejn r;
    private bmz u;
    private final String v;
    
    public ejm() {
        this.o = new Object();
        this.p = false;
        final String simpleName = this.getClass().getSimpleName();
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 13);
        sb.append("GcaActivity(");
        sb.append(simpleName);
        sb.append(")");
        this.v = sb.toString();
    }
    
    private final void p() {
        if (!this.p) {
            synchronized (this.o) {
                if (!this.p) {
                    final ela d = ((CameraApp)this.getApplicationContext()).d();
                    this.k = (kse)((emf)d).o.get();
                    this.n = (bqz)((emf)d).t.get();
                    this.l = ewv.b(((emf)d).c);
                    this.m = (cxl)((emf)d).j.get();
                    final bqz n = this.n;
                    n.getClass();
                    njo.d(n instanceof bqz);
                    this.u = new bmz(n);
                    this.p = true;
                }
            }
        }
    }
    
    private final void q() {
        Integer.toHexString(this.hashCode());
    }
    
    protected final efs m() {
        if (this.q == null) {
            synchronized (this.o) {
                if (this.q == null) {
                    this.q = new efs(this);
                }
            }
        }
        return this.q;
    }
    
    protected final ejn n() {
        this.p();
        if (this.r == null) {
            synchronized (this.o) {
                if (this.r == null) {
                    super.s.c(this.l);
                    final ewy s = this.s;
                    this.p();
                    this.r = new ejn(this, s, this.u);
                }
            }
        }
        return this.r;
    }
    
    protected final kse o() {
        this.p();
        return this.k;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.p();
        if (this.m.k(cxr.at)) {
            lry.a(this);
        }
        else {
            this.setTheme(2132017874);
        }
        String.valueOf(this.v).concat("#onCreate");
        this.q();
        this.k.f("GcaActivity#onCreate");
        final bmz u = this.u;
        synchronized (u.a) {
            if (u.g.a()) {
                u.d = u.h.b();
                final kjk d = u.d;
                final btf g = new btf();
                d.c(g);
                u.g = g;
                u.c = u.h.c(u.d);
                final kjk c = u.c;
                final btf f = new btf();
                c.c(f);
                u.f = f;
                u.b = u.h.a(u.c);
                final kjk b = u.b;
                final btf e = new btf();
                b.c(e);
                u.e = e;
            }
            monitorexit(u.a);
            super.onCreate(bundle);
            this.k.g();
        }
    }
    
    @Override
    protected void onDestroy() {
        String.valueOf(this.v).concat("#onDestroy");
        this.q();
        this.k.f("GcaActivity#onDestroy");
        super.onDestroy();
        this.u.bh();
        this.k.g();
    }
    
    @Override
    protected final void onNewIntent(final Intent intent) {
        String.valueOf(this.v).concat("#onNewIntent");
        this.q();
        super.onNewIntent(intent);
    }
    
    @Override
    protected void onPause() {
        String.valueOf(this.v).concat("#onPause");
        this.q();
        this.k.f("GcaActivity#onPause");
        super.onPause();
        this.u.bi();
        this.k.g();
    }
    
    @Override
    protected void onResume() {
        String.valueOf(this.v).concat("#onResume");
        this.q();
        this.k.f("GcaActivity#onResume");
        this.u.bj();
        super.onResume();
        this.k.g();
    }
    
    @Override
    protected void onStart() {
        String.valueOf(this.v).concat("#onStart");
        this.q();
        this.k.f("GcaActivity#onStart");
        this.u.bk();
        super.onStart();
        this.k.g();
    }
    
    @Override
    protected void onStop() {
        String.valueOf(this.v).concat("#onStop");
        this.q();
        this.k.f("GcaActivity#onStop");
        super.onStop();
        this.u.e();
        this.k.g();
    }
}
