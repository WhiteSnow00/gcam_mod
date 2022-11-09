import android.text.TextUtils;
import android.graphics.drawable.GradientDrawable;
import com.google.android.material.tabs.TabLayout;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpy implements cqc
{
    public final ihg a;
    private final Context b;
    private final cxl c;
    
    public cpy(final Context b, final ihg a, final cxl c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a() {
        final Context b = this.b;
        int n;
        if (!this.c.k(cxr.at)) {
            n = 2131624159;
        }
        else {
            n = 2131624158;
        }
        final View inflate = View.inflate(b, n, (ViewGroup)null);
        final ViewPager2 viewPager2 = (ViewPager2)inflate.findViewById(2131428140);
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        list.add(new cpv(b.getString(2131952669), b.getString(2131952668), "https://www.gstatic.com/aiux/gca/stabilization/Standard_EDUPanel_376x320.gif", b.getString(2131952667)));
        list2.add(b.getString(2131952673));
        if (this.c.k(cwv.Q)) {
            list.add(new cpv(b.getString(2131952663), b.getString(2131952662), "https://www.gstatic.com/aiux/gca/stabilization/Locked_EDUPanel_376x320.gif", b.getString(2131952661)));
            list2.add(b.getString(2131952671));
        }
        if (this.c.k(cwv.R)) {
            list.add(new cpv(b.getString(2131952659), b.getString(2131952658), "https://www.gstatic.com/aiux/gca/stabilization/Active_EDUPanel_376x320.gif", b.getString(2131952657)));
            list2.add(b.getString(2131952670));
        }
        if (this.c.k(cwv.S)) {
            list.add(new cpv(b.getString(2131952666), b.getString(2131952665), "https://www.gstatic.com/aiux/gca/stabilization/Panning_EDUPanel_376x320.gif", b.getString(2131952664)));
            list2.add(b.getString(2131952672));
        }
        final cpw cpw = new cpw(list, this.c.k(cxr.at));
        viewPager2.getClass();
        final rw k = viewPager2.e.k;
        viewPager2.k.e(k);
        if (k != null) {
            k.f(viewPager2.l);
        }
        viewPager2.e.P(cpw);
        viewPager2.c = 0;
        viewPager2.c();
        viewPager2.k.d(cpw);
        cpw.e(viewPager2.l);
        for (int i = 0; i < viewPager2.getChildCount(); ++i) {
            final View child = viewPager2.getChildAt(i);
            if (child instanceof RecyclerView) {
                ((RecyclerView)child).setNestedScrollingEnabled(false);
                break;
            }
        }
        final TabLayout tabLayout = (TabLayout)inflate.findViewById(2131428030);
        tabLayout.getClass();
        if (this.c.k(cxr.at)) {
            ((GradientDrawable)tabLayout.getBackground()).setTint(lrx.b(2131165590, b));
        }
        final ngo ngo = new ngo(tabLayout, viewPager2, new cpx(list2));
        if (ngo.d) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ngo.c = ngo.b.b();
        if (ngo.c != null) {
            ngo.d = true;
            ngo.e = new ngm(ngo.a);
            ngo.b.b.g(ngo.e);
            ngo.f = new ngn(ngo.b);
            ngo.a.e(ngo.f);
            ngo.h = new aah();
            ngo.c.e(ngo.h);
            ngo.a.g();
            final rw c = ngo.c;
            if (c != null) {
                final int a = c.a();
                for (int j = 0; j < a; ++j) {
                    final ngh d = ngo.a.d();
                    final CharSequence charSequence = ngo.g.a.get(j);
                    if (TextUtils.isEmpty(d.b) && !TextUtils.isEmpty(charSequence)) {
                        d.g.setContentDescription(charSequence);
                    }
                    d.a = charSequence;
                    d.b();
                    ngo.a.f(d, false);
                }
                if (a > 0) {
                    final int min = Math.min(ngo.b.c, ngo.a.b() - 1);
                    if (min != ngo.a.a()) {
                        final TabLayout a2 = ngo.a;
                        a2.h(a2.c(min));
                    }
                }
            }
            ngo.a.l(ngo.b.c);
            this.a.e(3, -1, inflate);
            return;
        }
        throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
    }
}
