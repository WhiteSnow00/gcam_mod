import java.util.Iterator;
import android.content.res.Resources;
import android.content.Context;
import java.util.Collection;
import java.util.ArrayList;
import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.widget.GridLayout;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import android.widget.GridLayout$LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

final class iqv implements oen
{
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ iqw d;
    
    public iqv(final iqw d, final boolean a, final boolean b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void c() {
        final iqw d = this.d;
        final MoreModesGrid e = d.e;
        kjm.a();
        if (e.f) {
            final ArrayList b = e.b;
            final Context context = e.getContext();
            final Resources resources = context.getResources();
            final LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService("layout_inflater");
            e.removeAllViews();
            int n;
            if ((n = e.b.size() % 3) == 0) {
                n = 3;
            }
            layoutInflater.getClass();
            final ArrayList b2 = e.b;
            final int size = b2.size();
            int i = 0;
            int n2 = 0;
            int n3 = 0;
            while (i < size) {
                final irb irb = (irb)b2.get(i);
                final jbm a = irb.a;
                final TextView b3 = (TextView)layoutInflater.inflate(2131624056, (ViewGroup)e, false);
                final GridLayout$LayoutParams gridLayout$LayoutParams = (GridLayout$LayoutParams)b3.getLayoutParams();
                if (n2 == 0) {
                    gridLayout$LayoutParams.rowSpec = GridLayout.spec(0, 1, MoreModesGrid.BOTTOM, 1.0f);
                }
                else {
                    gridLayout$LayoutParams.rowSpec = GridLayout.spec(n2, 1, MoreModesGrid.BOTTOM, 0.0f);
                }
                gridLayout$LayoutParams.columnSpec = GridLayout.spec(n3, 1, MoreModesGrid.FILL, 1.0f);
                final Drawable drawable = resources.getDrawable(2131231375, (Resources$Theme)null);
                Drawable a2 = null;
                Label_0277: {
                    if (a == jbm.j) {
                        final niz h = niz.h(new orl(e.getContext().getPackageManager()).d());
                        if (h.g()) {
                            a2 = (Drawable)h.c();
                            break Label_0277;
                        }
                    }
                    a2 = jbk.b(a).a(e.getContext().getResources());
                }
                final Drawable mutate = a2.getConstantState().newDrawable().mutate();
                mutate.setColorFilter(MoreModesGrid.a);
                Object drawable2 = e.getContext().getDrawable(2131231397);
                if (!e.g) {
                    drawable2 = e.getContext().getDrawable(2131231397);
                    ((LayerDrawable)drawable2).setDrawableByLayerId(2131427811, e.getContext().getDrawable(2131231399));
                }
                final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { drawable, mutate, (Drawable)drawable2 });
                layerDrawable.setLayerGravity(0, 17);
                layerDrawable.setLayerGravity(1, 17);
                layerDrawable.setLayerGravity(2, 17);
                final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165856);
                layerDrawable.setLayerInset(2, dimensionPixelOffset, 0, 0, dimensionPixelOffset);
                final Drawable drawable3 = layerDrawable.getDrawable(2);
                int alpha;
                if (!irb.c) {
                    alpha = 0;
                }
                else {
                    alpha = 255;
                }
                drawable3.setAlpha(alpha);
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131165859);
                layerDrawable.setLayerSize(0, dimensionPixelSize, dimensionPixelSize);
                b3.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)layerDrawable, (Drawable)null, (Drawable)null);
                String d2 = null;
                Label_0593: {
                    if (a == jbm.j) {
                        final niz h2 = niz.h(new orl(e.getContext().getPackageManager()).a("com.google.vr.apps.ornament", "app_name"));
                        if (h2.g()) {
                            d2 = (String)h2.c();
                            break Label_0593;
                        }
                    }
                    if (a == jbm.q) {
                        final orl orl = new orl(e.getContext().getPackageManager());
                        final niz h3 = niz.h(orl.a(orl.b(), "measure_app_name"));
                        if (h3.g()) {
                            d2 = (String)h3.c();
                            break Label_0593;
                        }
                    }
                    d2 = jbk.b(a).d(e.getContext().getResources());
                }
                b3.setText((CharSequence)d2);
                b3.setContentDescription((CharSequence)d2);
                b3.setOnClickListener((View$OnClickListener)new iqz(e, a));
                b3.setSoundEffectsEnabled(false);
                e.addView((View)b3);
                irb.b = (View)b3;
                final int n4 = n3 + 1;
                int n5 = n2;
                int n6 = 0;
                Label_0695: {
                    if (n4 != 3) {
                        n6 = n2;
                        if ((n3 = n4) != n) {
                            break Label_0695;
                        }
                        n6 = n2;
                        n3 = n4;
                        if (n2 != 0) {
                            break Label_0695;
                        }
                        n5 = 0;
                    }
                    n6 = n5 + 1;
                    n3 = 0;
                }
                ++i;
                n2 = n6;
            }
            e.f = false;
        }
        final ArrayList list = new ArrayList();
        for (final jbm jbm : d.b.keySet()) {
            if (d.v(jbm)) {
                final klj klj = d.b.get(jbm);
                if (klj == null) {
                    continue;
                }
                list.add(klj);
            }
        }
        if (!list.isEmpty()) {
            d.b.put(jbm.p, klq.c(list));
            d.h(jbm.p);
            d.r(jbm.p);
        }
        d.g = true;
    }
    
    private final void d() {
        this.d.j(jbm.d);
        this.d.j(jbm.e);
        if (!this.d.i.k(cwv.H)) {
            this.d.j(jbm.f);
            this.d.j(jbm.n);
        }
        if (this.a) {
            this.d.j(jbm.j);
        }
        if (this.b) {
            this.d.j(jbm.s);
        }
        if (this.c) {
            this.d.j(jbm.q);
        }
    }
    
    @Override
    public final void a(final Throwable t) {
        a.k(iqw.a.b(), "Failed to add Lens entry: %s", t, '\u0b3b');
        this.d.h.f("FinalizeMoreModes");
        this.d();
        this.c();
        this.d.h.g();
    }
}
