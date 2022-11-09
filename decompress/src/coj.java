import com.google.android.apps.camera.ui.views.ViewfinderCover;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedHashMap;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.camcorder.ui.modeslider.ModeSlider;
import java.util.concurrent.Executor;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.View;
import android.text.TextUtils$TruncateAt;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import java.util.Map;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewStub;
import java.util.Collection;
import java.util.HashSet;
import com.google.android.apps.camera.camcorder.ui.modeslider.ModeSliderUi;
import java.util.Set;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coj implements cor, krc
{
    private static final nsd m;
    public final klv a;
    public final BottomBarController b;
    public final Set c;
    public final eiq d;
    public final cos e;
    public final coq f;
    public final iqg g;
    public final ivj h;
    public final Object i;
    public final niz j;
    public jbm k;
    public ModeSliderUi l;
    private final klv n;
    private final crg o;
    private final kjk p;
    private final Set q;
    private final kjm r;
    private final eyt s;
    private final oui t;
    private final cxl u;
    
    static {
        m = nsd.g("com/google/android/apps/camera/camcorder/ui/modeslider/ModeSliderControllerImpl");
    }
    
    public coj(final klv a, final klv n, final BottomBarController b, final eiq d, final kjm r, final cos e, final coq f, final iqg g, final niz j, final ivj h, final Set set, final crg o, final oui t, final eyt s, final cxl u) {
        this.i = new Object();
        this.k = jbm.a;
        this.p = new kjk();
        this.a = a;
        this.n = n;
        this.b = b;
        this.o = o;
        this.d = d;
        this.r = r;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
        this.t = t;
        this.s = s;
        this.u = u;
        this.c = new HashSet();
        this.q = new HashSet(set);
    }
    
    private final void l(final boolean b, final boolean b2) {
        synchronized (this.i) {
            if (!this.i(this.k)) {
                coj.m.c().E(583).r("Ignore showing video mode slider. Current mode: %s", this.k);
                return;
            }
            monitorexit(this.i);
            this.h(this.o.e());
            if (b) {
                this.l.animate().setStartDelay(50L).setDuration(200L).alpha(1.0f).withStartAction((Runnable)new cof(this, b2));
                return;
            }
            this.l.setAlpha(1.0f);
            if (b2) {
                this.f.b();
                return;
            }
            this.f.c();
        }
    }
    
    public final void a() {
        this.b.setClickable(true);
        this.g.l(true);
        this.h.F(true);
        this.d.g(1);
    }
    
    @Override
    public final void b(final boolean b) {
        if (b) {
            this.l.animate().setDuration(200L).alpha(0.0f).withEndAction((Runnable)new cog(this.f));
            return;
        }
        this.l.setAlpha(0.0f);
        this.f.a();
    }
    
    @Override
    public final void c(final ViewStub viewStub) {
        if (this.l == null) {
            this.l = (ModeSliderUi)viewStub.inflate();
        }
        final coq f = this.f;
        final ModeSliderUi l = this.l;
        final ModeSlider a = l.a();
        final RecordSpeedSlider b = this.l.b();
        final Set q = this.q;
        f.f = (View)l;
        f.g = a;
        f.h = b;
        f.i = q;
        if (this.j.g()) {
            ((cpf)this.j.c()).j(new coh(this));
        }
        final ModeSlider a2 = this.l.a();
        final GradientDrawable gradientDrawable = (GradientDrawable)((InsetDrawable)a2.getBackground()).getDrawable();
        if (!this.u.k(cxr.at) && gradientDrawable != null) {
            gradientDrawable.setTintMode(PorterDuff$Mode.DST);
            gradientDrawable.setTint(a2.getContext().getColor(2131100959));
        }
        final cos e = this.e;
        final LinkedHashMap h = e.h;
        final nnx g = e.g;
        final nnx f2 = e.f;
        final cxl u = this.u;
        a2.b.putAll(h);
        a2.d = nnx.n(g);
        a2.e = nnx.n(f2);
        a2.g = u;
        a2.removeAllViews();
        a2.a.set(-1);
        final int size = a2.b.size();
        final int dimensionPixelSize = a2.getResources().getDimensionPixelSize(2131165844);
        final int dimensionPixelSize2 = a2.getResources().getDimensionPixelSize(2131165843);
        final float n = (float)a2.getResources().getDimensionPixelSize(2131165847);
        final float t = jvu.t(a2.getResources().getDimension(2131165846));
        for (int i = 0; i < size; ++i) {
            final String text = (String)a2.d.get(a2.a(i));
            text.getClass();
            final String contentDescription = (String)a2.e.get(a2.a(i));
            contentDescription.getClass();
            final TextView textView = new TextView(a2.getContext());
            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, dimensionPixelSize2);
            layoutParams.gravity = 8388627;
            textView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            textView.setSingleLine(true);
            textView.setBackgroundColor(0);
            textView.setEllipsize(TextUtils$TruncateAt.END);
            textView.setText((CharSequence)text);
            textView.setGravity(17);
            int n2;
            int n3;
            if (u.k(cxr.at)) {
                n2 = 2131296293;
                n3 = neu.c((View)textView, 2130968871);
            }
            else {
                n2 = 2131296290;
                n3 = a2.getContext().getColor(2131100963);
            }
            a2.f(textView, n2, n3);
            textView.setTextAlignment(4);
            textView.setTextSize(0, n);
            textView.setLetterSpacing(t);
            textView.setMaxWidth(dimensionPixelSize);
            final int c = a2.c;
            textView.setPadding(c, 0, c, 0);
            textView.setContentDescription((CharSequence)contentDescription);
            textView.setOnClickListener((View$OnClickListener)new coa(a2, i));
            a2.addView((View)textView, i);
        }
        final int dimensionPixelSize3 = a2.getResources().getDimensionPixelSize(2131165849);
        a2.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        a2.setOnTouchListener((View$OnTouchListener)new cob(a2));
        a2.f = new coi(this);
        this.f.f();
        this.p.c(this.a.a(new coe(this, 2), mcn.n()));
        this.p.c(this.n.a(new coe(this), this.r));
        this.p.c(this.o.a(new coe(this, 1), mcn.n()));
    }
    
    @Override
    public final void close() {
        this.f.a();
        this.c.clear();
        this.q.clear();
        this.p.close();
    }
    
    @Override
    public final void d(final boolean b) {
        if (b) {
            this.l.a().c();
            return;
        }
        this.l.a().b();
    }
    
    @Override
    public final void e(final jcb jcb) {
        this.l.c(jcb);
    }
    
    @Override
    public final void f(final boolean b) {
        this.l(b, true);
    }
    
    public final void g(final jbm jbm) {
        final ModeSlider a = this.l.a();
        final RecordSpeedSlider b = this.l.b();
        Label_0843: {
            if (!jbm.equals(jbm.c)) {
                final cos e = this.e;
                e.a(jbm);
                nle nle = nle.v();
                if (!jbm.equals(jbm.c)) {
                    if (jbm.equals(jbm.n)) {
                        final nqd b2 = nqd.b(Collections.reverseOrder());
                        final Object[] g = nov.g(e.b.c.j().v());
                        Arrays.sort(g, b2);
                        final ArrayList n = nqb.n(Arrays.asList(g));
                        final nns q = nns.q(2131952750, 2131952752, 2131952748, 2131952751, 2131952749);
                        final Iterator iterator = n.iterator();
                        int n2 = 0;
                        while (iterator.hasNext()) {
                            final double doubleValue = (double)iterator.next();
                            final Context a2 = e.a;
                            final double n3 = e.b.f;
                            Double.isNaN(n3);
                            final String string = a2.getString(2131952721, new Object[] { (int)(n3 / doubleValue) });
                            final Context a3 = e.a;
                            final double n4 = e.b.f;
                            Double.isNaN(n4);
                            final String string2 = a3.getString(2131951690, new Object[] { (int)(n4 / doubleValue) });
                            final Integer value = n2;
                            nle.p(value, string);
                            nle.p(value, string2);
                            nle.p(value, e.a.getResources().getString((int)q.get(n2)));
                            ++n2;
                        }
                        nle = nle.w(nle);
                    }
                    else if (jbm.equals(jbm.f)) {
                        final Context a4 = e.a;
                        final Integer value2 = 1;
                        final String string3 = a4.getString(2131951667, new Object[] { value2, 8 });
                        final Integer value3 = 0;
                        nle.p(value3, e.e);
                        nle.p(value3, string3);
                        nle.p(value3, e.a.getResources().getString(2131952742));
                        final String string4 = e.a.getString(2131951667, new Object[] { value2, 4 });
                        nle.p(value2, e.d);
                        nle.p(value2, string4);
                        nle.p(value2, e.a.getResources().getString(2131952741));
                        nle = nle.w(nle);
                    }
                    else {
                        nle = nle.w(nle);
                    }
                }
                int n5 = 2;
                final cos e2 = this.e;
                e2.a(jbm);
                String s = null;
                Label_0693: {
                    if (!jbm.equals(jbm.c)) {
                        if (jbm.equals(jbm.n)) {
                            s = e2.a.getString(2131952721, new Object[] { (int)e2.b.a((double)e2.c.aQ()) });
                            break Label_0693;
                        }
                        if (jbm.equals(jbm.f)) {
                            if (((kmt)e2.i.d).equals(kmt.g)) {
                                s = e2.d;
                                break Label_0693;
                            }
                            s = e2.e;
                            break Label_0693;
                        }
                    }
                    s = "";
                }
                int i = 0;
                while (true) {
                    while (i < nle.r().size()) {
                        if (nle.s(i, s)) {
                            if (i == -1) {
                                throw new IllegalArgumentException("No default speed id found");
                            }
                            final boolean equals = jbm.equals(jbm.n);
                            int n6;
                            if (!equals) {
                                n6 = 2131231534;
                            }
                            else {
                                n6 = 2131231470;
                            }
                            if (equals) {
                                n5 = 1;
                            }
                            if (this.j.g()) {
                                this.f.d();
                                a.measure(0, 0);
                                ((cpf)this.j.c()).l(nle, b, n5, i, n6, equals ^ true, a.getMeasuredWidth());
                            }
                            break Label_0843;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            this.l(false, false);
        }
        ((jgv)this.t.get()).b();
        ((jgv)this.t.get()).c(jbm.name());
    }
    
    public final void h(final lfu lfu) {
        final LinkedHashMap h = this.e.h;
        final ModeSlider a = this.l.a();
        final Iterator iterator = h.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Boolean b = (Boolean)iterator.next();
            b.getClass();
            if (!b) {
                if (lfu.equals(lfu.a)) {
                    a.getChildAt(n).setVisibility(8);
                }
                else {
                    a.getChildAt(n).setVisibility(0);
                }
            }
            ++n;
        }
    }
    
    public final boolean i(final jbm jbm) {
        return this.e.h.containsKey(jbm);
    }
    
    public final boolean j(final jbm k) {
        Object o = this.i;
        monitorenter(o);
        try {
            if (this.k.equals(k)) {
                monitorexit(o);
                return false;
            }
            if (!this.i(k)) {
                final String value = String.valueOf(k);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
                sb.append("Unsupported application mode: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            this.k = k;
            this.s.S(jbk.f(k), 2);
            monitorexit(o);
            this.d(false);
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                final fpi a = ((fpf)iterator.next()).a;
                synchronized (a.b) {
                    if (a.l == k) {
                        continue;
                    }
                    final ViewfinderCover e = ((iyc)a.i).a().e;
                    if (a.l != jbm.f && k == jbm.f) {
                        a.f.b(new fpg(a, e, k, 1));
                    }
                    else if (a.l != jbm.c && k == jbm.c) {
                        a.f.b(new fpg(a, e, k));
                    }
                    else {
                        if (a.l == jbm.n || k != jbm.n) {
                            continue;
                        }
                        a.f.b(new fpg(a, e, k, 2));
                    }
                    continue;
                }
                break;
            }
            o = this.l.a();
            if (((ModeSlider)o).b.containsKey(k)) {
                final Iterator iterator2 = ((ModeSlider)o).b.keySet().iterator();
                int n = 0;
                while (iterator2.hasNext() && !k.equals(iterator2.next())) {
                    ++n;
                }
                ((ModeSlider)o).e(n, false);
                return true;
            }
            o = String.valueOf(k);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(o).length() + 18);
            sb2.append("Unsupported mode: ");
            sb2.append((String)o);
            throw new IllegalArgumentException(sb2.toString());
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final krc k(final fpf fpf) {
        this.c.add(fpf);
        return new cod(this, fpf);
    }
}
