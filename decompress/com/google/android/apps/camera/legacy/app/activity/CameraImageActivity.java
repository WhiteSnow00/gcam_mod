// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import android.content.Context;
import com.google.android.apps.camera.legacy.app.activity.main.CameraVoiceActivity;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import android.os.Bundle;

public class CameraImageActivity extends ejm
{
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final ela d = ((CameraApp)this.getApplicationContext()).d();
        final ejn n = this.n();
        final efs m = this.m();
        n.getClass();
        m.getClass();
        final emf e = ((emf)d).e;
        final eft b = eft.b(m);
        final efu b2 = efu.b(m);
        final pii b3 = oum.b(bjp.c(e.bs, oum.b(bjp.d(oum.b(bji.b(e.x, e.n, ejp.a(n))), e.y))));
        final ejr a = ejr.a(n);
        final ejs a2 = ejs.a(n);
        final hlk b4 = hlk.b(e.cg, e.as);
        final pii b5 = oum.b(iih.a(b, b2, e.B, b3, e.o, e.j, oum.b(dxo.b(a, b, b2, oum.b(cef.a(a2, b, b4, e.ch, e.ci, e.cj, e.ck, e.cl, e.cm, e.j, e.N, e.B, e.J)), oum.b(gsl.g(b2, e.bw)), e.as))));
        final hlc b6 = hlc.b(e.l, e.Z, e.j);
        final cko b7 = cko.b(e.as, e.cn, e.j);
        final pii b8 = oum.b(bjp.b(efz.a(m), e.B));
        final pii b9 = oum.b(bnj.c(b, b8, b2, e.N, e.D, e.ap));
        final pii b10 = oum.b(cbp.a(e.B, ejo.a(n), b2));
        final isc b11 = isc.b(b2, a, e.Z, b6, e.as, b7, e.ca, b4, oum.b(bqj.a(e.Z, e.B, oum.b(bnj.d(e.B, e.bq, b9, e.ap, e.D, b10)), oum.b(bxh.a(oum.b(bnj.b(b, b8, b2, e.N, e.D, e.ap)), e.B, e.bq, e.ap, e.N, e.D, b10)), e.bq, e.ap, e.aH, efy.b(m))));
        final boolean t = e.t();
        final boolean r = e.r();
        final boolean s = e.s();
        final iov iov = (iov)b5.get();
        final isa a3 = hzw.a((cxl)e.j.get());
        final Activity a4 = m.a;
        final eyt eyt = (eyt)e.N.get();
        final egb egb = (egb)e.bX.get();
        final lae lae = (lae)e.bu.get();
        final hkd hkd = (hkd)e.as.get();
        final njp f = nov.F(new egs(t, r, s, a3, a4));
        final Intent intent = new Intent(this.getIntent());
        if (this.isVoiceInteractionRoot()) {
            intent.setClass((Context)this, (Class)CameraVoiceActivity.class);
        }
        else {
            intent.setClass((Context)this, (Class)CameraActivity.class);
        }
        intent.addFlags(268435456);
        this.getIntent().getAction();
        this.isVoiceInteractionRoot();
        final niz a5 = egt.a(egt.c(intent, a4, f, lae), intent, iov, b11, a3, a4, eyt, egb, f, hkd, lae);
        egt.b(intent, a5.g() ^ true, a4, hkd);
        a4.setIntent(intent);
        if (!a5.g() || !egt.d((jbm)a5.c(), iov, b11, a3, a4, eyt, egb)) {
            a4.startActivity(intent);
        }
        this.finish();
    }
}
