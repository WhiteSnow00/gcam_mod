import android.content.res.Configuration;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iff implements iez, exn, exl, exm, evx
{
    public final Activity a;
    public final bqm b;
    public final klv c;
    public final cxl d;
    public final gjj e;
    public final bnl f;
    public final hkc g;
    public final flf h;
    public kc i;
    public final gjq j;
    private final niz k;
    private final ifn l;
    private final ifr m;
    private final klv n;
    private final boolean o;
    private final kjm p;
    private final hkd q;
    
    public iff(final Activity a, final niz k, final bqm b, final ifn l, final ifr m, final klv c, final klv n, final ewy ewy, final boolean o, final cxl d, final kjm p16, final gjj e, final bnl f, final hkc g, final hkd q, final flf h) {
        this.j = new ife(this);
        this.a = a;
        this.k = k;
        this.b = b;
        this.l = l;
        this.m = m;
        this.c = c;
        this.n = n;
        this.o = o;
        this.d = d;
        this.p = p16;
        this.e = e;
        this.f = f;
        this.g = g;
        this.q = q;
        this.h = h;
        p16.b(new ifd(this, ewy));
    }
    
    @Override
    public final void a() {
        final boolean k = this.d.k(cxr.aH);
        final Boolean value = true;
        if (k || this.o) {
            this.c.aR(value);
            this.n.aR(value);
            return;
        }
        final jbm l = this.b.l();
        if (l == null || l.equals(jbm.h) || l.equals(jbm.i)) {
            return;
        }
        if (!(boolean)this.c.aQ()) {
            this.p.b(new ifc(this));
            return;
        }
        this.b();
        final ViewGroup b = (ViewGroup)this.a.findViewById(2131427411);
        this.a.getResources();
        final ifr m = this.m;
        if (m.b.aQ()) {
            if (!(boolean)m.d.aQ()) {
                if (!(boolean)m.c.aQ()) {
                    final efm e = m.e;
                    final ieu ieu = new ieu();
                    ieu.b = b;
                    ieu.a = ifr.a;
                    ieu.j = m.e;
                    ieu.l = 4;
                    ieu.h = true;
                    ieu.i = m.f;
                    ieu.k = m.g;
                    e.e(ieu.a());
                    m.c.aR(value);
                }
            }
        }
    }
    
    public final void b() {
        if (!this.k.g()) {
            return;
        }
        final det det = (det)this.k.c();
        final bqm b = this.b;
        b.getClass();
        new ifb(b);
        det.a();
    }
    
    @Override
    public final void bk() {
        if (this.i != null) {
            this.a();
        }
        if (!this.d.k(cxr.aK) || this.d.k(cxr.aH)) {
            return;
        }
        final Intent intent = this.a.getIntent();
        final int intValue = (int)this.g.c(hjq.v);
        final int intValue2 = (int)this.d.a(cxr.q).c();
        if (intValue < intValue2 && !bmx.l(intent)) {
            if (intValue == intValue2 - 1) {
                final ifn l = this.l;
                kjm.a();
                final ifm a = l.a;
                kjm.a();
                if (a.e == null) {
                    final FrameLayout e = new FrameLayout(a.b);
                    final Context b = a.b;
                    int n;
                    if (!a.d.k(cxr.at)) {
                        n = 2131624003;
                    }
                    else {
                        n = 2131624002;
                    }
                    View.inflate(b, n, (ViewGroup)e);
                    ((Button)e.findViewById(2131427627)).setOnClickListener((View$OnClickListener)new ifl(a));
                    final FrameLayout frameLayout = (FrameLayout)e.findViewById(2131427455);
                    final EduImageView eduImageView = (EduImageView)e.findViewById(2131427454);
                    final ViewGroup$LayoutParams layoutParams = eduImageView.getLayoutParams();
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)frameLayout.getLayoutParams();
                    final float n2 = (float)(a.c.widthPixels - viewGroup$MarginLayoutParams.leftMargin - viewGroup$MarginLayoutParams.rightMargin);
                    final float n3 = (float)(a.c.heightPixels - viewGroup$MarginLayoutParams.topMargin - viewGroup$MarginLayoutParams.bottomMargin);
                    if (layoutParams.width > n2) {
                        final int height = layoutParams.height;
                        final int width = layoutParams.width;
                        layoutParams.width = (int)n2;
                        layoutParams.height = (int)(n2 * (height / (float)width));
                        eduImageView.setLayoutParams(layoutParams);
                    }
                    else if (layoutParams.height > n3) {
                        viewGroup$MarginLayoutParams.width = (int)(layoutParams.width / (float)layoutParams.height * n3);
                        viewGroup$MarginLayoutParams.height = (int)n3;
                        eduImageView.setLayoutParams(layoutParams);
                    }
                    eduImageView.a(a.b.getString(2131951925), a.b.getString(2131951928));
                    a.e = (View)e;
                }
                a.a.e(8, 2131951929, a.e);
            }
            this.q.d(hjq.v, intValue + 1);
            return;
        }
        this.q.d(hjq.v, intValue2);
    }
    
    public final void c() {
        if (!this.a.isFinishing()) {
            final kc i = this.i;
            if (i != null) {
                i.show();
            }
        }
    }
    
    @Override
    public final void e() {
        final kc i = this.i;
        if (i != null) {
            i.dismiss();
            this.i = null;
        }
        final ifn l = this.l;
        kjm.a();
        l.a.a();
    }
    
    @Override
    public final void y(final Configuration configuration) {
        final kc i = this.i;
        if (i != null) {
            i.dismiss();
            this.i = null;
            this.a();
        }
    }
}
