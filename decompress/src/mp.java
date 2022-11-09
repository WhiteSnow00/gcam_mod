import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.view.KeyEvent;
import android.view.Gravity;
import java.util.Iterator;
import android.widget.ListView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import android.transition.Transition;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.view.LayoutInflater;
import android.content.res.Resources;
import java.util.ArrayList;
import android.view.View$OnAttachStateChangeListener;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.List;
import android.os.Handler;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mp extends nf implements View$OnKeyListener, PopupWindow$OnDismissListener, nj
{
    public final Handler a;
    public final List b;
    final ViewTreeObserver$OnGlobalLayoutListener c;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private final List l;
    private final View$OnAttachStateChangeListener m;
    private final rk n;
    private int o;
    private int p;
    private View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private ni y;
    private PopupWindow$OnDismissListener z;
    
    public mp(final Context h, final View q, final int j, final boolean k) {
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.c = (ViewTreeObserver$OnGlobalLayoutListener)new mk(this);
        this.m = (View$OnAttachStateChangeListener)new ml(this);
        this.n = new mn(this);
        this.o = 0;
        this.p = 0;
        this.h = h;
        this.q = q;
        this.j = j;
        this.k = k;
        this.w = false;
        this.r = this.y();
        final Resources resources = h.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165221));
        this.a = new Handler();
    }
    
    private final int y() {
        if (ik.f(this.q) == 1) {
            return 0;
        }
        return 1;
    }
    
    private final void z(final mv mv) {
        final LayoutInflater from = LayoutInflater.from(this.h);
        final ms ms = new ms(mv, from, this.k, 2131623947);
        if (!this.u() && this.w) {
            ms.b = true;
        }
        else if (this.u()) {
            ms.b = nf.w(mv);
        }
        final int x = nf.x((ListAdapter)ms, this.h, this.i);
        final rm rm = new rm(this.h, this.j);
        rm.a = this.n;
        rm.v((PopupWindow$OnDismissListener)(rm.m = (AdapterView$OnItemClickListener)this));
        rm.l = this.q;
        rm.j = this.p;
        rm.y();
        rm.x();
        rm.e((ListAdapter)ms);
        rm.r(x);
        rm.j = this.p;
        View child = null;
        Object o = null;
        Label_0439: {
            if (this.b.size() > 0) {
                final List b = this.b;
                final mo mo = b.get(b.size() - 1);
                final mv b2 = mo.b;
                while (true) {
                    for (int size = b2.size(), i = 0; i < size; ++i) {
                        final Object item = b2.getItem(i);
                        if (((MenuItem)item).hasSubMenu() && mv == ((MenuItem)item).getSubMenu()) {
                            Label_0426: {
                                if (item != null) {
                                    final ListView a = mo.a();
                                    final ListAdapter adapter = a.getAdapter();
                                    int headersCount;
                                    ms ms2;
                                    if (adapter instanceof HeaderViewListAdapter) {
                                        final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                                        headersCount = headerViewListAdapter.getHeadersCount();
                                        ms2 = (ms)headerViewListAdapter.getWrappedAdapter();
                                    }
                                    else {
                                        ms2 = (ms)adapter;
                                        headersCount = 0;
                                    }
                                    final int count = ms2.getCount();
                                    int j = 0;
                                    while (true) {
                                        while (j < count) {
                                            if (item == ms2.a(j)) {
                                                if (j == -1) {
                                                    child = null;
                                                    break Label_0426;
                                                }
                                                final int n = j + headersCount - a.getFirstVisiblePosition();
                                                if (n < 0) {
                                                    child = null;
                                                    break Label_0426;
                                                }
                                                if (n >= a.getChildCount()) {
                                                    child = null;
                                                    break Label_0426;
                                                }
                                                child = a.getChildAt(n);
                                                break Label_0426;
                                            }
                                            else {
                                                ++j;
                                            }
                                        }
                                        j = -1;
                                        continue;
                                    }
                                }
                                child = null;
                            }
                            o = mo;
                            break Label_0439;
                        }
                    }
                    final Object item = null;
                    continue;
                }
            }
            o = (child = null);
        }
        if (child != null) {
            rm.p.setTouchModal(false);
            rm.p.setEnterTransition((Transition)null);
            final List b3 = this.b;
            final ListView a2 = b3.get(b3.size() - 1).a();
            final int[] array = new int[2];
            a2.getLocationOnScreen(array);
            final Rect rect = new Rect();
            this.d.getWindowVisibleDisplayFrame(rect);
            int r = 0;
            Label_0575: {
                if (this.r == 1) {
                    if (array[0] + a2.getWidth() + x > rect.right) {
                        r = 0;
                        break Label_0575;
                    }
                }
                else if (array[0] - x >= 0) {
                    r = 0;
                    break Label_0575;
                }
                r = 1;
            }
            this.r = r;
            rm.l = child;
            int width;
            if ((this.p & 0x5) == 0x5) {
                if (r != 0) {
                    width = x;
                }
                else {
                    width = -child.getWidth();
                }
            }
            else if (r != 0) {
                width = child.getWidth();
            }
            else {
                width = -x;
            }
            rm.g = width;
            rm.i = true;
            rm.h = true;
            rm.j(0);
        }
        else {
            if (this.s) {
                rm.g = this.u;
            }
            if (this.t) {
                rm.j(this.v);
            }
            rm.t(super.g);
        }
        this.b.add(new mo(rm, mv, this.r));
        rm.s();
        final ql e = rm.e;
        e.setOnKeyListener((View$OnKeyListener)this);
        if (o == null && this.x && mv.e != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(2131623954, (ViewGroup)e, false);
            final TextView textView = (TextView)frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(mv.e);
            e.addHeaderView((View)frameLayout, (Object)null, false);
            rm.s();
        }
    }
    
    public final ListView aE() {
        if (this.b.isEmpty()) {
            return null;
        }
        final List b = this.b;
        return ((mo)b.get(b.size() - 1)).a();
    }
    
    public final void c(final mv mv, final boolean b) {
        final int size = this.b.size();
        int i = 0;
        while (true) {
            while (i < size) {
                final int n = i;
                if (mv != ((mo)this.b.get(i)).b) {
                    ++i;
                }
                else {
                    if (n < 0) {
                        return;
                    }
                    final int n2 = n + 1;
                    if (n2 < this.b.size()) {
                        ((mo)this.b.get(n2)).b.i(false);
                    }
                    final mo mo = this.b.remove(n);
                    mo.b.m(this);
                    if (this.f) {
                        mo.a.p.setExitTransition((Transition)null);
                        mo.a.p.setAnimationStyle(0);
                    }
                    mo.a.k();
                    final int size2 = this.b.size();
                    if (size2 > 0) {
                        this.r = ((mo)this.b.get(size2 - 1)).c;
                    }
                    else {
                        this.r = this.y();
                    }
                    if (size2 == 0) {
                        this.k();
                        final ni y = this.y;
                        if (y != null) {
                            y.a(mv, true);
                        }
                        final ViewTreeObserver e = this.e;
                        if (e != null) {
                            if (e.isAlive()) {
                                this.e.removeGlobalOnLayoutListener(this.c);
                            }
                            this.e = null;
                        }
                        this.d.removeOnAttachStateChangeListener(this.m);
                        this.z.onDismiss();
                        return;
                    }
                    if (b) {
                        this.b.get(0).b.i(false);
                    }
                    return;
                }
            }
            final int n = -1;
            continue;
        }
    }
    
    public final void d(final ni y) {
        this.y = y;
    }
    
    public final boolean e() {
        return false;
    }
    
    public final boolean f(final nr nr) {
        for (final mo mo : this.b) {
            if (nr == mo.b) {
                mo.a().requestFocus();
                return true;
            }
        }
        if (nr.hasVisibleItems()) {
            this.j(nr);
            final ni y = this.y;
            if (y != null) {
                y.b(nr);
            }
            return true;
        }
        return false;
    }
    
    public final void i() {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            nf.v(((mo)iterator.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }
    
    @Override
    public final void j(final mv mv) {
        mv.h(this, this.h);
        if (this.u()) {
            this.z(mv);
            return;
        }
        this.l.add(mv);
    }
    
    public final void k() {
        int i = this.b.size();
        if (i > 0) {
            final mo[] array = this.b.toArray(new mo[i]);
            --i;
            while (i >= 0) {
                final mo mo = array[i];
                if (mo.a.u()) {
                    mo.a.k();
                }
                --i;
            }
        }
    }
    
    @Override
    public final void l(final View q) {
        if (this.q != q) {
            this.q = q;
            this.p = Gravity.getAbsoluteGravity(this.o, ik.f(q));
        }
    }
    
    @Override
    public final void m(final boolean w) {
        this.w = w;
    }
    
    @Override
    public final void n(final int o) {
        if (this.o != o) {
            this.o = o;
            this.p = Gravity.getAbsoluteGravity(o, ik.f(this.q));
        }
    }
    
    @Override
    public final void o(final int u) {
        this.s = true;
        this.u = u;
    }
    
    public final void onDismiss() {
        while (true) {
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                final mo mo = this.b.get(i);
                if (!mo.a.u()) {
                    if (mo != null) {
                        mo.b.i(false);
                    }
                    return;
                }
            }
            final mo mo = null;
            continue;
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.k();
            return true;
        }
        return false;
    }
    
    @Override
    public final void p(final PopupWindow$OnDismissListener z) {
        this.z = z;
    }
    
    @Override
    public final void q(final boolean x) {
        this.x = x;
    }
    
    @Override
    public final void r(final int v) {
        this.t = true;
        this.v = v;
    }
    
    public final void s() {
        if (this.u()) {
            return;
        }
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            this.z((mv)iterator.next());
        }
        this.l.clear();
        final View q = this.q;
        if ((this.d = q) != null) {
            final ViewTreeObserver e = this.e;
            final ViewTreeObserver viewTreeObserver = q.getViewTreeObserver();
            this.e = viewTreeObserver;
            if (e == null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }
    
    @Override
    protected final boolean t() {
        return false;
    }
    
    public final boolean u() {
        return this.b.size() > 0 && this.b.get(0).a.u();
    }
}
