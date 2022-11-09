import android.view.KeyEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.widget.ImageView;
import android.text.TextUtils;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.support.v4.widget.NestedScrollView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.os.Bundle;
import android.util.TypedValue;
import android.content.Context;
import android.content.DialogInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kc extends ky implements DialogInterface
{
    public final ka a;
    
    protected kc(final Context context, final int n) {
        super(context, a(context, n));
        this.a = new ka(this.getContext(), this, this.getWindow());
    }
    
    static int a(final Context context, final int n) {
        if (n >>> 24 > 0) {
            return n;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968622, typedValue, true);
        return typedValue.resourceId;
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final ka a = this.a;
        int contentView;
        if (a.A == 0) {
            contentView = a.z;
        }
        else {
            contentView = a.z;
        }
        a.b.setContentView(contentView);
        final View viewById = a.c.findViewById(2131427840);
        final View viewById2 = viewById.findViewById(2131428086);
        final View viewById3 = viewById.findViewById(2131427515);
        final View viewById4 = viewById.findViewById(2131427467);
        final ViewGroup viewGroup = (ViewGroup)viewById.findViewById(2131427527);
        final View g = a.g;
        final View view = null;
        View view2 = g;
        if (g == null) {
            view2 = null;
        }
        Label_0188: {
            if (view2 == null || !ka.b(view2)) {
                a.c.setFlags(131072, 131072);
                if (view2 == null) {
                    viewGroup.setVisibility(8);
                    break Label_0188;
                }
            }
            ((FrameLayout)a.c.findViewById(2131427526)).addView(view2, new ViewGroup$LayoutParams(-1, -1));
            final boolean h = a.h;
            if (a.f != null) {
                ((qz)viewGroup.getLayoutParams()).weight = 0.0f;
            }
        }
        final View viewById5 = viewGroup.findViewById(2131428086);
        final View viewById6 = viewGroup.findViewById(2131427515);
        final View viewById7 = viewGroup.findViewById(2131427467);
        final ViewGroup d = ka.d(viewById5, viewById2);
        final ViewGroup d2 = ka.d(viewById6, viewById3);
        final ViewGroup d3 = ka.d(viewById7, viewById4);
        a.q = (NestedScrollView)a.c.findViewById(2131427915);
        final NestedScrollView q = a.q;
        final int n = false ? 1 : 0;
        q.setFocusable(false);
        a.q.setNestedScrollingEnabled(false);
        a.v = (TextView)d2.findViewById(16908299);
        final TextView v = a.v;
        if (v != null) {
            final CharSequence e = a.e;
            if (e != null) {
                v.setText(e);
            }
            else {
                v.setVisibility(8);
                a.q.removeView((View)a.v);
                if (a.f != null) {
                    final ViewGroup viewGroup2 = (ViewGroup)a.q.getParent();
                    final int indexOfChild = viewGroup2.indexOfChild((View)a.q);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView((View)a.f, indexOfChild, new ViewGroup$LayoutParams(-1, -1));
                }
                else {
                    d2.setVisibility(8);
                }
            }
        }
        (a.i = (Button)d3.findViewById(16908313)).setOnClickListener(a.G);
        int n2;
        if (TextUtils.isEmpty(a.j)) {
            a.i.setVisibility(8);
            n2 = 0;
        }
        else {
            a.i.setText(a.j);
            a.i.setVisibility(0);
            n2 = 1;
        }
        (a.l = (Button)d3.findViewById(16908314)).setOnClickListener(a.G);
        if (TextUtils.isEmpty(a.m)) {
            a.l.setVisibility(8);
        }
        else {
            a.l.setText(a.m);
            a.l.setVisibility(0);
            n2 |= 0x2;
        }
        (a.o = (Button)d3.findViewById(16908315)).setOnClickListener(a.G);
        final CharSequence p = a.p;
        if (TextUtils.isEmpty((CharSequence)null)) {
            a.o.setVisibility(8);
        }
        else {
            final Button o = a.o;
            final CharSequence p2 = a.p;
            o.setText((CharSequence)null);
            a.o.setVisibility(0);
            n2 |= 0x4;
        }
        final Context a2 = a.a;
        final TypedValue typedValue = new TypedValue();
        a2.getTheme().resolveAttribute(2130968620, typedValue, true);
        Label_0707: {
            Label_0696: {
                if (typedValue.data != 0) {
                    Button button;
                    if (n2 == 1) {
                        button = a.i;
                    }
                    else if (n2 == 2) {
                        button = a.l;
                    }
                    else {
                        if (n2 != 4) {
                            break Label_0696;
                        }
                        button = a.o;
                    }
                    ka.c(button);
                    break Label_0707;
                }
            }
            if (n2 == 0) {
                d3.setVisibility(8);
            }
        }
        if (a.w != null) {
            d.addView(a.w, 0, new ViewGroup$LayoutParams(-1, -2));
            a.c.findViewById(2131428066).setVisibility(8);
        }
        else {
            a.t = (ImageView)a.c.findViewById(16908294);
            if (!TextUtils.isEmpty(a.d) && a.E) {
                (a.u = (TextView)a.c.findViewById(2131427416)).setText(a.d);
                final int r = a.r;
                final Drawable s = a.s;
                if (s != null) {
                    a.t.setImageDrawable(s);
                }
                else {
                    a.u.setPadding(a.t.getPaddingLeft(), a.t.getPaddingTop(), a.t.getPaddingRight(), a.t.getPaddingBottom());
                    a.t.setVisibility(8);
                }
            }
            else {
                a.c.findViewById(2131428066).setVisibility(8);
                a.t.setVisibility(8);
                d.setVisibility(8);
            }
        }
        final boolean b = viewGroup != null && viewGroup.getVisibility() != 8;
        final boolean b2 = d != null && d.getVisibility() != 8;
        final boolean b3 = d3 != null && d3.getVisibility() != 8;
        if (!b3 && d2 != null) {
            final View viewById8 = d2.findViewById(2131428047);
            if (viewById8 != null) {
                viewById8.setVisibility(0);
            }
        }
        if (b2) {
            final NestedScrollView q2 = a.q;
            if (q2 != null) {
                q2.setClipToPadding(true);
            }
            View viewById9;
            if (a.e == null && a.f == null) {
                viewById9 = view;
            }
            else {
                viewById9 = d.findViewById(2131428064);
            }
            if (viewById9 != null) {
                viewById9.setVisibility(0);
            }
        }
        else if (d2 != null) {
            final View viewById10 = d2.findViewById(2131428048);
            if (viewById10 != null) {
                viewById10.setVisibility(0);
            }
        }
        final ListView f = a.f;
        Label_1198: {
            if (f instanceof AlertController$RecycleListView) {
                boolean b4;
                if (b3) {
                    if (b2) {
                        break Label_1198;
                    }
                    b4 = false;
                }
                else {
                    b4 = b2;
                }
                final AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView)f;
                final int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                int n3;
                if (b4) {
                    n3 = alertController$RecycleListView.getPaddingTop();
                }
                else {
                    n3 = alertController$RecycleListView.a;
                }
                final int paddingRight = alertController$RecycleListView.getPaddingRight();
                int n4;
                if (b3) {
                    n4 = alertController$RecycleListView.getPaddingBottom();
                }
                else {
                    n4 = alertController$RecycleListView.b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, n3, paddingRight, n4);
            }
        }
        if (!b) {
            Object o2;
            if ((o2 = a.f) == null) {
                o2 = a.q;
            }
            if (o2 != null) {
                int n5;
                if (!b3) {
                    n5 = n;
                }
                else {
                    n5 = 2;
                }
                final View viewById11 = a.c.findViewById(2131427914);
                final View viewById12 = a.c.findViewById(2131427913);
                ik.ad((View)o2, (b2 ? 1 : 0) | n5);
                if (viewById11 != null) {
                    d2.removeView(viewById11);
                }
                if (viewById12 != null) {
                    d2.removeView(viewById12);
                }
            }
        }
        final ListView f2 = a.f;
        if (f2 != null) {
            final ListAdapter x = a.x;
            if (x != null) {
                f2.setAdapter(x);
                final int y = a.y;
                if (y >= 0) {
                    f2.setItemChecked(y, true);
                    f2.setSelection(y);
                }
            }
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final NestedScrollView q = this.a.q;
        return (q != null && q.m(keyEvent)) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final NestedScrollView q = this.a.q;
        return (q != null && q.m(keyEvent)) || super.onKeyUp(n, keyEvent);
    }
    
    @Override
    public final void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.a.a(title);
    }
}
