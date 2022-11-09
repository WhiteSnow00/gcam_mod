import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.net.Uri$Builder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import android.content.DialogInterface$OnClickListener;
import android.os.Bundle;
import java.util.concurrent.CancellationException;
import android.view.View;
import android.app.ActivityOptions;
import android.os.Build;
import android.content.Intent;
import com.google.android.apps.camera.bottombar.R$id;
import com.google.android.apps.camera.bottombar.R$dimen;
import android.app.Activity;
import android.content.Context;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doj implements dny
{
    public static final nsd a;
    private static final int h;
    public final oui b;
    public final FilmstripTransitionLayout c;
    public final RoundedThumbnailView d;
    public final kjm e;
    public final hkc f;
    public oey g;
    private final Context i;
    private final boolean j;
    private final ijj k;
    private final cyo l;
    private final hhb m;
    private final eyt n;
    private final jdp o;
    private final ihp p;
    private final oui q;
    private final doa r;
    private final Activity s;
    private final bna t;
    private final boolean u;
    private hdn v;
    private final bmq w;
    
    static {
        a = nsd.g("com/google/android/apps/camera/filmstrip/photos/PhotosReviewLauncherImpl");
        h = R$dimen.rounded_thumbnail_diameter_normal;
    }
    
    public doj(final Context i, final boolean j, final oui b, final ijj k, final cyo l, final bmq w, final hhb m, final eyt n, final Activity s, final kjm e, final jdp o, final ixw ixw, final ihp p18, final oui q, final doa r, final bna t, final hkc f, final boolean u) {
        this.g = ofi.n(Boolean.FALSE);
        this.i = i;
        this.j = j;
        this.b = b;
        this.k = k;
        this.l = l;
        this.w = w;
        this.m = m;
        this.n = n;
        this.e = e;
        this.t = t;
        this.s = s;
        this.o = o;
        this.c = (FilmstripTransitionLayout)ixw.c.c(2131427603);
        this.d = (RoundedThumbnailView)ixw.c.c(R$id.thumbnail_button);
        this.p = p18;
        this.q = q;
        this.r = r;
        this.f = f;
        this.u = u;
    }
    
    private final oey i(final Intent intent) {
        if (intent.resolveActivity(this.i.getPackageManager()) != null) {
            this.k.c();
            this.t.g = 3;
            if (this.u) {
                final jdp o = this.o;
                String s;
                if (!Build.ID.startsWith("RD2")) {
                    s = "5.29";
                }
                else {
                    s = "5.38";
                }
                if (o.b(s)) {
                    intent.putExtra("shared_element_return_transition", true);
                    intent.putExtra("return_transition_thumbnail_diameter", this.s.getResources().getDimension(doj.h));
                    final ActivityOptions sceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(this.s, (View)this.d, "photos:filmstrip_transition_view");
                    final bmq w = this.w;
                    final Bundle bundle = sceneTransitionAnimation.toBundle();
                    bundle.getClass();
                    w.a.startActivityForResult(intent, 0, bundle);
                    return ofi.n(Boolean.TRUE);
                }
            }
            if (this.o.b("3.9")) {
                this.w.c(intent, 2130772032, 2130772032);
            }
            else {
                this.w.c(intent, 2130772026, 2130772025);
            }
            return ofi.n(Boolean.TRUE);
        }
        ((doc)this.q.get()).bj();
        this.d.setVisibility(0);
        return ofi.m(new CancellationException("Photos is disabled."));
    }
    
    @Override
    public final oey a() {
        final Intent a = bnx.a(this.j, true, this.s.isVoiceInteractionRoot(), new long[0]);
        a.setData(mqr.a);
        final hdn v = this.v;
        if (v != null) {
            v.B();
        }
        return this.i(a);
    }
    
    @Override
    public final void b() {
        kjm.a();
        if (this.e()) {
            return;
        }
        if (this.o.a() == null) {
            a.l(doj.a.c(), "Cannot find Photos package info. Canceling.", '\u034f');
            final doa r = this.r;
            final ndv ndv = new ndv(r.a);
            ndv.q(2131952409);
            ndv.j(2131952408);
            ndv.o(2131952425, (DialogInterface$OnClickListener)new dnz(r));
            ndv.l(17039360, null);
            ndv.c();
            return;
        }
        final jdp o = this.o;
        try {
            final int applicationEnabledSetting = o.b.getPackageManager().getApplicationEnabledSetting("com.google.android.apps.photos");
            if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
                this.s.getWindow().setSharedElementsUseOverlay(false);
                njo.o(this.e() ^ true);
                final bqr f = this.f((bqv)this.b.get());
                oey m;
                if (f == null && this.j) {
                    m = ofi.m(new CancellationException("FilmstripDataAdapter is empty in secure activity"));
                }
                else {
                    m = (oey)this.p.b().b(new dod(this, f)).d(new doe(this, f));
                }
                ofi.w(this.g = oco.h(m, CancellationException.class, btt.n, odx.a), new doh(), odx.a);
                return;
            }
        }
        catch (final IllegalArgumentException ex) {
            a.m(jdp.a.c(), "Photos app package not found.", '\u0bce', ex);
        }
        a.l(doj.a.c(), "Photos is disabled. Canceling.", '\u034e');
        final doa r2 = this.r;
        final ndv ndv2 = new ndv(r2.a);
        ndv2.q(2131952407);
        ndv2.j(2131952406);
        ndv2.o(2131952620, (DialogInterface$OnClickListener)new dnz(r2, 1));
        ndv2.l(17039360, null);
        ndv2.c();
    }
    
    @Override
    public final void c() {
        if (this.e()) {
            final doc doc = (doc)this.q.get();
            final eks c = doc.c;
            nov.z(c);
            final ekw a = c.a;
            if (!a.T) {
                a.P.i.l();
            }
            c.a.E();
            doc.b.setVisibility(4);
            this.g.cancel(false);
            this.g = ofi.n(Boolean.FALSE);
        }
    }
    
    @Override
    public final void d(final hdn v) {
        this.v = v;
    }
    
    @Override
    public final boolean e() {
        if (this.g.isDone()) {
            final Boolean b = (Boolean)knf.d(this.g);
            nov.z(b);
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    final bqr f(final bqv bqv) {
        for (final bqr bqr : bqv) {
            bqr.getClass();
            bqr.a();
            if (!bqr.a().j()) {
                return bqr;
            }
            final him d = bqr.a().d();
            String.format(Locale.ROOT, "Null ShotId encountered for item: %s", bqr.a());
            d.getClass();
            if (this.m.a.contains(d) ^ true) {
                bqr.a();
                return bqr;
            }
        }
        return null;
    }
    
    public final oey g(final bqr bqr) {
        njo.o(this.g.isDone() ^ true);
        final boolean j = this.j;
        final boolean booleanValue = (boolean)this.f.c(hjq.R);
        final boolean voiceInteractionRoot = this.s.isVoiceInteractionRoot();
        final bqq bqq = (bqq)this.b.get();
        bqq.a();
        final ArrayList list = new ArrayList();
        for (final bqr bqr2 : bqq) {
            final nns f = bqr2.a().f();
            if (!f.isEmpty()) {
                for (int size = f.size(), i = 0; i < size; ++i) {
                    final Long n = f.get(i);
                    if (n != -1L) {
                        list.add(n);
                    }
                }
            }
            else {
                list.add(bqr2.a().b());
            }
        }
        final Object[] array = list.toArray();
        final int length = array.length;
        final long[] array2 = new long[length];
        for (int k = 0; k < length; ++k) {
            final Object o = array[k];
            o.getClass();
            array2[k] = ((Number)o).longValue();
        }
        list.size();
        Arrays.toString(array2);
        final Intent a = bnx.a(j, booleanValue, voiceInteractionRoot, array2);
        final long a2 = this.n.a();
        njo.g(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        String string;
        if (a2 == 0L) {
            string = "0";
        }
        else if (a2 > 0L) {
            string = Long.toString(a2, 10);
        }
        else {
            final char[] array3 = new char[64];
            long n2 = (a2 >>> 1) / 5L;
            final char forDigit = Character.forDigit((int)(a2 - n2 * 10L), 10);
            int n3 = 63;
            array3[63] = forDigit;
            while (n2 > 0L) {
                --n3;
                array3[n3] = Character.forDigit((int)(n2 % 10L), 10);
                n2 /= 10L;
            }
            string = new String(array3, n3, 64 - n3);
        }
        a.putExtra("external_session_id", string);
        final fbl c = bqr.c();
        hio hio;
        if (c == null) {
            hio = hio.a;
        }
        else if (c.d()) {
            hio = hio.f;
        }
        else if (c.e()) {
            hio = hio.g;
        }
        else if (c.b() > 0 && c.b.d > 0 && c.a() > 0 && c.c().length() > 0) {
            hio = hio.j;
        }
        else {
            hio = hio.a;
        }
        final bqs a3 = bqr.a();
        if (!(boolean)this.f.c(hjq.R) && a3.j() && a3.d() != null) {
            final hhb m = this.m;
            final him d = a3.d();
            d.getClass();
            final hih hih = m.b.get(d);
            if (hih != null) {
                hio = hih.c;
            }
            Uri uri;
            if (hih != null) {
                uri = hih.b;
            }
            else {
                uri = bqr.a().c();
            }
            a.setDataAndType(uri, llk.c.i);
            a.putExtra("processing_uri_intent_extra", (Parcelable)new Uri$Builder().scheme("content").authority(this.l.e).appendPath("processing").appendPath(uri.getLastPathSegment()).build());
        }
        else {
            njo.p(true ^ a3.c().equals((Object)Uri.EMPTY), "Item is no longer in progress but data doesn't have a valid URI.");
            a.setData(a3.c());
        }
        final PackageInfo a4 = this.o.a();
        String versionName;
        int versionCode;
        if (a4 != null) {
            versionName = a4.versionName;
            versionCode = a4.versionCode;
        }
        else {
            versionName = null;
            versionCode = 0;
        }
        this.n.y(string, bqr.a().j(), hio, versionName, versionCode);
        return this.i(a);
    }
    
    public final oey h(final bqr bqr) {
        njo.o(this.g.isDone() ^ true);
        if (bqr == null) {
            final ofn f = ofn.f();
            ((bqv)this.b.get()).g().d(new dog(this, f), this.e);
            return f;
        }
        return this.g(bqr);
    }
}
