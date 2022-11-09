import android.widget.CompoundButton$OnCheckedChangeListener;
import android.animation.AnimatorInflater;
import android.view.View$OnClickListener;
import java.util.Iterator;
import java.util.ArrayList;
import android.view.View$OnTouchListener;
import android.view.View;
import android.widget.CheckBox;
import android.animation.ObjectAnimator;
import com.google.android.apps.camera.evcomp.EvCompView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgs implements dgn, krc
{
    public final Context a;
    public final cxl b;
    public final kjk c;
    public dhf d;
    public EvCompView e;
    public klv f;
    public klv g;
    public klv h;
    public efm i;
    public krc j;
    private final klv k;
    private final klv l;
    private final kse m;
    private dgy n;
    private ObjectAnimator o;
    private iru p;
    private CheckBox q;
    
    public dgs(final Context a, final kse m, final cxl b) {
        final Boolean value = false;
        this.k = new kkz(value);
        this.l = new kkz(value);
        this.a = a;
        this.m = m;
        this.c = new kjk();
        this.b = b;
    }
    
    @Override
    public final klj a() {
        final dhf d = this.d;
        if (d == null) {
            return new kkz(true);
        }
        return d.j;
    }
    
    @Override
    public final klj b() {
        return this.k;
    }
    
    @Override
    public final void c() {
        this.m.f("EvCompViewCtrl#disable");
        final dgy n = this.n;
        if (n != null) {
            n.a();
        }
        this.m.g();
    }
    
    @Override
    public final void close() {
        final dgy n = this.n;
        if (n != null) {
            n.g();
        }
        this.k.aR(false);
        this.c.close();
    }
    
    @Override
    public final void d() {
        final CheckBox q = this.q;
        nov.E(q, "EvCompViewController must be first initialized", new Object[0]);
        q.setEnabled(false);
    }
    
    @Override
    public final void e() {
        final CheckBox q = this.q;
        nov.E(q, "EvCompViewController must be first initialized", new Object[0]);
        q.setSoundEffectsEnabled(false);
    }
    
    @Override
    public final void f(final int n, final int n2, final float n3) {
        this.m.f("EvCompViewCtrl#enable");
        this.r().b(n, n2, n3);
        this.m.g();
    }
    
    @Override
    public final void g() {
        final CheckBox q = this.q;
        nov.E(q, "EvCompViewController must be first initialized", new Object[0]);
        q.setEnabled(true);
    }
    
    @Override
    public final void h() {
        final CheckBox q = this.q;
        nov.E(q, "EvCompViewController must be first initialized", new Object[0]);
        q.setSoundEffectsEnabled(true);
    }
    
    @Override
    public final void i(final boolean b) {
        this.s();
        this.r().c(b);
        this.p.a();
    }
    
    @Override
    public final void j() {
        this.i(false);
        final EvCompView e = this.e;
        if (((dgj)((kkz)e.b).d).equals(dgj.a)) {
            e.f(0.5f);
        }
        final dhf d = this.d;
        nov.z(d);
        d.k();
    }
    
    @Override
    public final void k(final boolean p) {
        this.p.p = p;
    }
    
    @Override
    public final void l(final boolean checked) {
        final CheckBox q = this.q;
        nov.E(q, "EvCompViewController must be first initialized", new Object[0]);
        q.setChecked(checked);
        final CheckBox q2 = this.q;
        nov.z(q2);
        q2.setContentDescription((CharSequence)this.a.getResources().getString(2131951722));
        this.l.aR(checked);
    }
    
    @Override
    public final void m(final dgj dgj) {
        this.f.aR(dgj);
        final EvCompView e = this.e;
        e.b.aR(dgj);
        e.i();
        e.h();
        final boolean empty = e.a.isEmpty();
        final int n = 0;
        if (!empty) {
            final ArrayList a = e.a;
            for (int size = a.size(), i = 0; i < size; ++i) {
                final dgk dgk = (dgk)a.get(i);
                if (e.e.indexOfChild((View)dgk) != -1) {
                    e.e.removeView((View)dgk);
                }
                else if (e.f.indexOfChild((View)dgk) != -1) {
                    e.f.removeView((View)dgk);
                }
            }
            e.a.clear();
        }
        final dgj a2 = dgj.a;
        switch (dgj.ordinal()) {
            case 2: {
                e.g = e.b(dgl.a, 0.0f, 1.0f, 2131231233, 2131100789, 2131231073, 2131951768);
                e.h = e.b(dgl.b, 0.0f, 1.0f, 2131231234, 2131100781, 2131231074, 2131952630);
                e.e.addView((View)e.g);
                e.f.addView((View)e.h);
                e.a.add(e.g);
                e.a.add(e.h);
                e.f.setVisibility(0);
                break;
            }
            case 1: {
                final float n2 = e.c / (float)e.a();
                e.g = e.b(dgl.a, 0.0f, 1.0f - n2, 2131231233, 2131100789, 2131231073, 2131951768);
                e.h = e.b(dgl.b, n2, 1.0f, 2131231234, 2131100781, 2131231074, 2131952630);
                e.e.addView((View)e.g);
                e.e.addView((View)e.h);
                e.a.add(e.g);
                e.a.add(e.h);
                e.f.setVisibility(8);
                break;
            }
            case 0: {
                e.g = e.b(dgl.a, 0.0f, 1.0f, 2131231448, 2131100789, 2131231073, 2131951969);
                e.e.addView((View)e.g);
                e.a.add(e.g);
                e.f.setVisibility(8);
                break;
            }
        }
        final ArrayList a3 = e.a;
        for (int size2 = a3.size(), j = n; j < size2; ++j) {
            final dgk dgk2 = (dgk)a3.get(j);
            e.e(dgk2, dgk2.c);
        }
        e.invalidate();
        e.requestLayout();
        final dhf d = this.d;
        nov.z(d);
        d.a();
        d.i();
        final Iterator iterator = this.e.a.iterator();
        while (iterator.hasNext()) {
            ((dgk)iterator.next()).setOnTouchListener((View$OnTouchListener)new dgo(this, d));
        }
    }
    
    @Override
    public final void n(final View$OnClickListener onClickListener) {
        final CheckBox q = this.q;
        nov.E(q, "EvCompViewController must be first initialized", new Object[0]);
        q.setOnClickListener(onClickListener);
    }
    
    @Override
    public final void o(final boolean b, final boolean b2) {
        this.p();
        this.r().d(b, b2);
        if (this.p()) {
            this.p.e();
        }
    }
    
    @Override
    public final boolean p() {
        return (boolean)((kkz)this.l).d;
    }
    
    @Override
    public final void q(final EvCompView evCompView, final klv f, final klv klv, final klv klv2, final klv klv3, final klv klv4, final klv g, final klv h, final dgm dgm, final niz niz, final efm i, final iru p12) {
        final ObjectAnimator o = (ObjectAnimator)AnimatorInflater.loadAnimator(this.a, 17498112);
        o.setTarget((Object)evCompView);
        this.o = o;
        this.f = f;
        this.e = evCompView;
        this.g = g;
        this.h = h;
        this.i = i;
        this.p = p12;
        (this.q = evCompView.d).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new dgp(this, klv4));
        this.d = new dhn(new dgr(this), evCompView, this.a.getResources().getInteger(2131492892), klv, klv2, klv3, f, dgm, niz);
        final CheckBox q = this.q;
        nov.z(q);
        final ObjectAnimator o2 = this.o;
        final dhf d = this.d;
        nov.z(d);
        final dhf d2 = this.d;
        nov.z(d2);
        (this.n = new dhj(evCompView, q, o2, d, dgm, d2)).f();
        this.l.aR(false);
        p12.p = false;
        this.k.aR(true);
    }
    
    public final dgy r() {
        final dgy n = this.n;
        nov.z(n);
        return n;
    }
    
    public final void s() {
        synchronized (this) {
            try (final krc j = this.j) {}
        }
    }
}
