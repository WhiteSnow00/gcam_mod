import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.View$MeasureSpec;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class se
{
    public int A;
    public int B;
    public int C;
    public int D;
    private final ua L;
    private final ua M;
    px p;
    public RecyclerView q;
    public final ub r;
    public final ub s;
    public sp t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;
    
    public se() {
        final sc l = new sc(this, 1);
        this.L = l;
        final sc m = new sc(this);
        this.M = m;
        this.r = new ub(l);
        this.s = new ub(m);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }
    
    public static boolean aT(final int n, int size, final int n2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (n2 > 0 && n != n2) {
            return false;
        }
        switch (mode) {
            default: {
                return false;
            }
            case 1073741824: {
                return size == n;
            }
            case 0: {
                return true;
            }
            case Integer.MIN_VALUE: {
                return size >= n;
            }
        }
    }
    
    public static final int aZ(final View view) {
        return ((sf)view.getLayoutParams()).d.bottom;
    }
    
    public static int ag(int n, final int n2, final int n3) {
        final int mode = View$MeasureSpec.getMode(n);
        final int n4 = n = View$MeasureSpec.getSize(n);
        switch (mode) {
            default: {
                n = Math.max(n2, n3);
                return n;
            }
            case 1073741824: {
                return n;
            }
            case Integer.MIN_VALUE: {
                return Math.min(n4, Math.max(n2, n3));
            }
        }
    }
    
    public static int ai(int n, final int n2, int max, int n3, final boolean b) {
        max = Math.max(0, n - max);
        Label_0121: {
            if (b) {
                if (n3 >= 0) {
                    n = 1073741824;
                    return View$MeasureSpec.makeMeasureSpec(n3, n);
                }
                if (n3 != -1) {
                    break Label_0121;
                }
                n = n2;
                switch (n2) {
                    default: {
                        break Label_0121;
                    }
                    case Integer.MIN_VALUE:
                    case 1073741824: {
                        break;
                    }
                    case 0: {
                        break Label_0121;
                    }
                }
            }
            else {
                if (n3 >= 0) {
                    n = 1073741824;
                    return View$MeasureSpec.makeMeasureSpec(n3, n);
                }
                if (n3 == -1) {
                    n = n2;
                }
                else {
                    if (n3 != -2) {
                        break Label_0121;
                    }
                    if (n2 != Integer.MIN_VALUE && n2 != 1073741824) {
                        n = 0;
                    }
                    else {
                        n = Integer.MIN_VALUE;
                    }
                }
            }
            n3 = max;
            return View$MeasureSpec.makeMeasureSpec(n3, n);
        }
        n = 0;
        n3 = 0;
        return View$MeasureSpec.makeMeasureSpec(n3, n);
    }
    
    public static sd ar(final Context context, final AttributeSet set, final int n, final int n2) {
        final sd sd = new sd();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lr.a, n, n2);
        sd.a = obtainStyledAttributes.getInt(0, 1);
        sd.b = obtainStyledAttributes.getInt(10, 1);
        sd.c = obtainStyledAttributes.getBoolean(9, false);
        sd.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return sd;
    }
    
    private final void bG(final View g, final int n, final boolean b) {
        final st f = RecyclerView.f(g);
        if (!b && !f.t()) {
            this.q.g.g(f);
        }
        else {
            this.q.g.b(f);
        }
        final sf sf = (sf)g.getLayoutParams();
        if (!f.z() && !f.u()) {
            if (g.getParent() == this.q) {
                final int d = this.p.d(g);
                int a;
                if ((a = n) == -1) {
                    a = this.p.a();
                }
                if (d == -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.q.indexOfChild(g));
                    sb.append(this.q.i());
                    throw new IllegalStateException(sb.toString());
                }
                if (d != a) {
                    final se l = this.q.l;
                    final View at = l.at(d);
                    if (at == null) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cannot move a child from non-existing index:");
                        sb2.append(d);
                        sb2.append(l.q.toString());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    l.aB(d);
                    final sf sf2 = (sf)at.getLayoutParams();
                    final st f2 = RecyclerView.f(at);
                    if (f2.t()) {
                        l.q.g.b(f2);
                    }
                    else {
                        l.q.g.g(f2);
                    }
                    l.p.h(at, a, (ViewGroup$LayoutParams)sf2, f2.t());
                }
            }
            else {
                this.p.g(g, n, false);
                sf.e = true;
                final sp t = this.t;
                if (t != null && t.f && sp.i(g) == t.b) {
                    t.g = g;
                }
            }
        }
        else {
            if (f.u()) {
                f.n();
            }
            else {
                f.g();
            }
            this.p.h(g, n, g.getLayoutParams(), false);
        }
        if (sf.f) {
            f.a.invalidate();
            sf.f = false;
        }
    }
    
    public static final int ba(final View view) {
        final Rect d = ((sf)view.getLayoutParams()).d;
        return view.getMeasuredHeight() + d.top + d.bottom;
    }
    
    public static final int bb(final View view) {
        final Rect d = ((sf)view.getLayoutParams()).d;
        return view.getMeasuredWidth() + d.left + d.right;
    }
    
    public static final int bc(final View view) {
        return ((sf)view.getLayoutParams()).d.left;
    }
    
    public static final int bd(final View view) {
        return ((sf)view.getLayoutParams()).a();
    }
    
    public static final int be(final View view) {
        return ((sf)view.getLayoutParams()).d.right;
    }
    
    public static final int bf(final View view) {
        return ((sf)view.getLayoutParams()).d.top;
    }
    
    public static final void bh(final View view, final int n, final int n2, final int n3, final int n4) {
        final sf sf = (sf)view.getLayoutParams();
        final Rect d = sf.d;
        view.layout(n + d.left + sf.leftMargin, n2 + d.top + sf.topMargin, n3 - d.right - sf.rightMargin, n4 - d.bottom - sf.bottomMargin);
    }
    
    public static final int bm(final View view) {
        return view.getBottom() + aZ(view);
    }
    
    public static final int bn(final View view) {
        return view.getLeft() - bc(view);
    }
    
    public static final int bo(final View view) {
        return view.getRight() + be(view);
    }
    
    public static final int bp(final View view) {
        return view.getTop() - bf(view);
    }
    
    public int A(final sq sq) {
        throw null;
    }
    
    public int B(final sq sq) {
        throw null;
    }
    
    public int C(final sq sq) {
        throw null;
    }
    
    public Parcelable I() {
        throw null;
    }
    
    public View K(final int n) {
        for (int ah = this.ah(), i = 0; i < ah; ++i) {
            final View at = this.at(i);
            final st f = RecyclerView.f(at);
            if (f != null && f.b() == n && !f.y()) {
                if (this.q.I.g || !f.t()) {
                    return at;
                }
            }
        }
        return null;
    }
    
    public void L(final String s) {
        final RecyclerView q = this.q;
        if (q != null) {
            q.n(s);
        }
    }
    
    public void O(final AccessibilityEvent accessibilityEvent) {
        final RecyclerView q = this.q;
        final sk c = q.c;
        final sq i = q.I;
        if (q != null) {
            if (accessibilityEvent != null) {
                boolean scrollable = true;
                if (!q.canScrollVertically(1) && !this.q.canScrollVertically(-1) && !this.q.canScrollHorizontally(-1)) {
                    if (!this.q.canScrollHorizontally(1)) {
                        scrollable = false;
                    }
                }
                accessibilityEvent.setScrollable(scrollable);
                final rw k = this.q.k;
                if (k != null) {
                    accessibilityEvent.setItemCount(k.a());
                }
            }
        }
    }
    
    public void P(final Parcelable parcelable) {
    }
    
    public void Q(final int n) {
        throw null;
    }
    
    public boolean T() {
        throw null;
    }
    
    public boolean U() {
        throw null;
    }
    
    public boolean V() {
        throw null;
    }
    
    public boolean Y() {
        return false;
    }
    
    public void Z(final int n, final int n2, final sq sq, final qt qt) {
    }
    
    public int a(final sk sk, final sq sq) {
        return -1;
    }
    
    public final void aA(final sk sk) {
        for (int i = this.ah() - 1; i >= 0; --i) {
            final View at = this.at(i);
            final st f = RecyclerView.f(at);
            if (!f.y()) {
                if (f.r() && !f.t()) {
                    final rw k = this.q.k;
                    this.aL(i);
                    sk.i(f);
                }
                else {
                    this.aB(i);
                    sk.j(at);
                    this.q.g.g(f);
                }
            }
        }
    }
    
    public final void aB(final int n) {
        this.at(n);
        this.p.i(n);
    }
    
    public void aC(final int n) {
        final RecyclerView q = this.q;
        if (q != null) {
            for (int a = q.f.a(), i = 0; i < a; ++i) {
                q.f.e(i).offsetLeftAndRight(n);
            }
        }
    }
    
    public void aD(final int n) {
        final RecyclerView q = this.q;
        if (q != null) {
            for (int a = q.f.a(), i = 0; i < a; ++i) {
                q.f.e(i).offsetTopAndBottom(n);
            }
        }
    }
    
    public void aE(final sk sk, final sq sq, final jc jc) {
        if (this.q.canScrollVertically(-1) || this.q.canScrollHorizontally(-1)) {
            jc.b(8192);
            jc.i(true);
        }
        if (this.q.canScrollVertically(1) || this.q.canScrollHorizontally(1)) {
            jc.b(4096);
            jc.i(true);
        }
        jc.f(ja.a(this.b(sk, sq), this.a(sk, sq), 0));
    }
    
    public final void aF(final View view, final jc jc) {
        final st f = RecyclerView.f(view);
        if (f != null && !f.t() && !this.p.k(f.a)) {
            final RecyclerView q = this.q;
            this.m(q.c, q.I, view, jc);
        }
    }
    
    public void aG(final int n) {
    }
    
    public final void aH(final sk sk) {
        for (int i = this.ah() - 1; i >= 0; --i) {
            if (!RecyclerView.f(this.at(i)).y()) {
                this.aK(i, sk);
            }
        }
    }
    
    public final void aI(final sk sk) {
        final int size = sk.a.size();
        for (int i = size - 1; i >= 0; --i) {
            final View a = sk.a.get(i).a;
            final st f = RecyclerView.f(a);
            if (!f.y()) {
                f.l(false);
                if (f.v()) {
                    this.q.removeDetachedView(a, false);
                }
                final sa b = this.q.B;
                if (b != null) {
                    b.h(f);
                }
                f.l(true);
                final st f2 = RecyclerView.f(a);
                f2.k = null;
                f2.l = false;
                f2.g();
                sk.i(f2);
            }
        }
        sk.a.clear();
        final ArrayList b2 = sk.b;
        if (b2 != null) {
            b2.clear();
        }
        if (size > 0) {
            this.q.invalidate();
        }
    }
    
    public final void aJ(final View view, final sk sk) {
        final px p2 = this.p;
        final int b = p2.c.b(view);
        if (b >= 0) {
            if (p2.a.g(b)) {
                p2.l(view);
            }
            p2.c.e(b);
        }
        sk.h(view);
    }
    
    public final void aK(final int n, final sk sk) {
        final View at = this.at(n);
        this.aL(n);
        sk.h(at);
    }
    
    public final void aL(int b) {
        if (this.at(b) != null) {
            final px p = this.p;
            b = p.b(b);
            final View c = p.c.c(b);
            if (c != null) {
                if (p.a.g(b)) {
                    p.l(c);
                }
                p.c.e(b);
            }
        }
    }
    
    public final void aM() {
        final RecyclerView q = this.q;
        if (q != null) {
            q.requestLayout();
        }
    }
    
    public final void aN(final RecyclerView recyclerView) {
        this.aO(View$MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }
    
    public final void aO(int n, final int n2) {
        this.C = View$MeasureSpec.getSize(n);
        n = View$MeasureSpec.getMode(n);
        this.A = n;
        if (n == 0) {
            n = RecyclerView.P;
        }
        this.D = View$MeasureSpec.getSize(n2);
        n = View$MeasureSpec.getMode(n2);
        if ((this.B = n) == 0) {
            n = RecyclerView.P;
        }
    }
    
    public final void aP(final int n, final int n2) {
        RecyclerView.l(this.q, n, n2);
    }
    
    public final void aQ(final int n, final int n2) {
        final int ah = this.ah();
        if (ah != 0) {
            int i = 0;
            int n3 = Integer.MIN_VALUE;
            int n4 = Integer.MIN_VALUE;
            int n5 = Integer.MAX_VALUE;
            int n6 = Integer.MAX_VALUE;
            while (i < ah) {
                final View at = this.at(i);
                final Rect j = this.q.i;
                RecyclerView.C(at, j);
                int left;
                if (j.left < (left = n5)) {
                    left = j.left;
                }
                int right;
                if (j.right > (right = n3)) {
                    right = j.right;
                }
                int top;
                if (j.top < (top = n6)) {
                    top = j.top;
                }
                int bottom;
                if (j.bottom > (bottom = n4)) {
                    bottom = j.bottom;
                }
                ++i;
                n3 = right;
                n4 = bottom;
                n5 = left;
                n6 = top;
            }
            this.q.i.set(n5, n6, n3, n4);
            this.p(this.q.i, n, n2);
            return;
        }
        this.q.s(n, n2);
    }
    
    public final void aR(final RecyclerView q) {
        if (q == null) {
            this.q = null;
            this.p = null;
            this.C = 0;
            this.D = 0;
        }
        else {
            this.q = q;
            this.p = q.f;
            this.C = q.getWidth();
            this.D = q.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }
    
    public final void aS(final sp t) {
        final sp t2 = this.t;
        if (t2 != null && t != t2 && t2.f) {
            t2.f();
        }
        this.t = t;
        final RecyclerView q = this.q;
        q.F.c();
        if (t.h) {
            final StringBuilder sb = new StringBuilder();
            sb.append("An instance of ");
            sb.append(t.getClass().getSimpleName());
            sb.append(" was started more than once. Each instance of");
            sb.append(t.getClass().getSimpleName());
            sb.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w("RecyclerView", sb.toString());
        }
        t.c = q;
        t.d = this;
        final int b = t.b;
        if (b != -1) {
            final RecyclerView c = t.c;
            c.I.a = b;
            t.f = true;
            t.e = true;
            t.g = c.l.K(t.b);
            t.c.F.a();
            t.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }
    
    public final boolean aU() {
        final sp t = this.t;
        return t != null && t.f;
    }
    
    public boolean aV(final sk sk, final sq sq, int n, final Bundle bundle) {
        final RecyclerView q = this.q;
        final int n2 = 0;
        if (q == null) {
            return false;
        }
        int n3 = 0;
        switch (n) {
            default: {
                n3 = 0;
                n = 0;
                break;
            }
            case 8192: {
                if (q.canScrollVertically(-1)) {
                    n3 = -(this.D - this.aq() - this.an());
                }
                else {
                    n3 = 0;
                }
                if (this.q.canScrollHorizontally(-1)) {
                    n = -(this.C - this.ao() - this.ap());
                    break;
                }
                n = 0;
                break;
            }
            case 4096: {
                if (q.canScrollVertically(1)) {
                    n3 = this.D - this.aq() - this.an();
                }
                else {
                    n3 = 0;
                }
                if (this.q.canScrollHorizontally(1)) {
                    n = this.C - this.ao() - this.ap();
                    break;
                }
                n = 0;
                break;
            }
        }
        if (n3 == 0) {
            if (n == 0) {
                return false;
            }
            n3 = n2;
        }
        this.q.ag(n, n3, true);
        return true;
    }
    
    public boolean aW(final RecyclerView recyclerView, final View view, final Rect rect, final boolean b, final boolean b2) {
        final int[] array = new int[2];
        final int ao = this.ao();
        final int aq = this.aq();
        final int c = this.C;
        final int ap = this.ap();
        final int d = this.D;
        final int an = this.an();
        final int n = view.getLeft() + rect.left - view.getScrollX();
        final int n2 = view.getTop() + rect.top - view.getScrollY();
        final int width = rect.width();
        final int height = rect.height();
        final int n3 = n - ao;
        final int n4 = 0;
        int n5 = Math.min(0, n3);
        final int n6 = n2 - aq;
        int n7 = Math.min(0, n6);
        final int n8 = n + width - (c - ap);
        final int max = Math.max(0, n8);
        final int max2 = Math.max(0, n2 + height - (d - an));
        if (this.ak() == 1) {
            if (max != 0) {
                n5 = max;
            }
            else {
                n5 = Math.max(n5, n8);
            }
        }
        else if (n5 == 0) {
            n5 = Math.min(n3, max);
        }
        if (n7 == 0) {
            n7 = Math.min(n6, max2);
        }
        array[0] = n5;
        array[1] = n7;
        int n9 = array[0];
        final int n10 = array[1];
        if (b2) {
            final View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            final int ao2 = this.ao();
            final int aq2 = this.aq();
            final int c2 = this.C;
            final int ap2 = this.ap();
            final int d2 = this.D;
            final int an2 = this.an();
            final Rect i = this.q.i;
            RecyclerView.C(focusedChild, i);
            if (i.left - n9 >= c2 - ap2 || i.right - n9 <= ao2 || i.top - n10 >= d2 - an2 || i.bottom - n10 <= aq2) {
                return false;
            }
        }
        if (n9 == 0) {
            if (n10 == 0) {
                return false;
            }
            n9 = n4;
        }
        if (b) {
            recyclerView.scrollBy(n9, n10);
        }
        else {
            recyclerView.S(n9, n10);
        }
        return true;
    }
    
    public final boolean aX(final View view, final int n, final int n2, final sf sf) {
        return view.isLayoutRequested() || !this.w || !aT(view.getWidth(), n, sf.width) || !aT(view.getHeight(), n2, sf.height);
    }
    
    public final void aY() {
        this.v = true;
    }
    
    public void aa(final int n, final qt qt) {
    }
    
    public void ae(final RecyclerView recyclerView) {
    }
    
    public void af(final RecyclerView recyclerView, final int n) {
        throw null;
    }
    
    public final int ah() {
        final px p = this.p;
        if (p != null) {
            return p.a();
        }
        return 0;
    }
    
    public final int aj() {
        final RecyclerView q = this.q;
        rw k;
        if (q != null) {
            k = q.k;
        }
        else {
            k = null;
        }
        if (k != null) {
            return k.a();
        }
        return 0;
    }
    
    public final int ak() {
        return ik.f((View)this.q);
    }
    
    public final int al() {
        return ik.g((View)this.q);
    }
    
    public final int am() {
        return ik.h((View)this.q);
    }
    
    public final int an() {
        final RecyclerView q = this.q;
        if (q != null) {
            return q.getPaddingBottom();
        }
        return 0;
    }
    
    public final int ao() {
        final RecyclerView q = this.q;
        if (q != null) {
            return q.getPaddingLeft();
        }
        return 0;
    }
    
    public final int ap() {
        final RecyclerView q = this.q;
        if (q != null) {
            return q.getPaddingRight();
        }
        return 0;
    }
    
    public final int aq() {
        final RecyclerView q = this.q;
        if (q != null) {
            return q.getPaddingTop();
        }
        return 0;
    }
    
    public final View as(View h) {
        final RecyclerView q = this.q;
        if (q == null) {
            return null;
        }
        h = q.h(h);
        if (h == null) {
            return null;
        }
        if (this.p.k(h)) {
            return null;
        }
        return h;
    }
    
    public final View at(final int n) {
        final px p = this.p;
        if (p != null) {
            return p.e(n);
        }
        return null;
    }
    
    public final View au() {
        final RecyclerView q = this.q;
        if (q == null) {
            return null;
        }
        final View focusedChild = q.getFocusedChild();
        if (focusedChild != null && !this.p.k(focusedChild)) {
            return focusedChild;
        }
        return null;
    }
    
    public final void av(final View view) {
        this.aw(view, -1);
    }
    
    public final void aw(final View view, final int n) {
        this.bG(view, n, true);
    }
    
    public final void ax(final View view) {
        this.ay(view, -1);
    }
    
    public final void ay(final View view, final int n) {
        this.bG(view, n, false);
    }
    
    public final void az(final View view, final Rect rect) {
        final RecyclerView q = this.q;
        if (q == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        rect.set(q.c(view));
    }
    
    public int b(final sk sk, final sq sq) {
        return -1;
    }
    
    public final void bg(final View view, final Rect rect) {
        final Rect d = ((sf)view.getLayoutParams()).d;
        rect.set(-d.left, -d.top, view.getWidth() + d.right, view.getHeight() + d.bottom);
        if (this.q != null) {
            final Matrix matrix = view.getMatrix();
            if (matrix != null && !matrix.isIdentity()) {
                final RectF j = this.q.j;
                j.set(rect);
                matrix.mapRect(j);
                rect.set((int)Math.floor(j.left), (int)Math.floor(j.top), (int)Math.ceil(j.right), (int)Math.ceil(j.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }
    
    public void bi() {
    }
    
    public final void bj(final int n, final int n2) {
        this.q.s(n, n2);
    }
    
    public final void bk(final Runnable runnable) {
        final RecyclerView q = this.q;
        if (q != null) {
            q.removeCallbacks(runnable);
        }
    }
    
    public final void bl(final RecyclerView recyclerView) {
        this.v = false;
        this.ae(recyclerView);
    }
    
    public int d(final int n, final sk sk, final sq sq) {
        throw null;
    }
    
    public int e(final int n, final sk sk, final sq sq) {
        throw null;
    }
    
    public abstract sf f();
    
    public sf g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof sf) {
            return new sf((sf)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new sf((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new sf(viewGroup$LayoutParams);
    }
    
    public sf h(final Context context, final AttributeSet set) {
        return new sf(context, set);
    }
    
    public View j(final View view, final int n, final sk sk, final sq sq) {
        throw null;
    }
    
    public void m(final sk sk, final sq sq, final View view, final jc jc) {
    }
    
    public void n(final sk sk, final sq sq) {
        throw null;
    }
    
    public void o(final sq sq) {
    }
    
    public void p(final Rect rect, final int n, final int n2) {
        this.aP(ag(n, rect.width() + this.ao() + this.ap(), this.am()), ag(n2, rect.height() + this.aq() + this.an(), this.al()));
    }
    
    public boolean r(final sf sf) {
        return sf != null;
    }
    
    public boolean s() {
        throw null;
    }
    
    public void u(final int n, final int n2) {
    }
    
    public void v(final int n, final int n2) {
    }
    
    public void w(final int n, final int n2) {
    }
    
    public int x(final sq sq) {
        throw null;
    }
    
    public int y(final sq sq) {
        throw null;
    }
    
    public int z(final sq sq) {
        throw null;
    }
}
