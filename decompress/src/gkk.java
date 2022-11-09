import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.view.View;
import java.util.HashMap;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Map;
import java.util.ArrayList;
import android.support.constraint.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkk extends ConstraintLayout
{
    public final ArrayList d;
    public final Map e;
    public final Map f;
    public final TextView g;
    public final TextView h;
    public final LinearLayout i;
    public final ImageView j;
    public final gjm k;
    public final boolean l;
    public final cxl m;
    public final Context n;
    public gjp o;
    public final gjr p;
    public final gjs q;
    public final gjb r;
    
    public gkk(final Context n, final gjm k, final gjp o, final gjr p7, final gjs q, final gjb r, final cxl m) {
        super(n);
        this.k = k;
        this.o = o;
        this.n = n;
        this.p = p7;
        this.q = q;
        this.r = r;
        this.l = m.k(cxr.at);
        this.m = m;
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new HashMap();
        (this.g = new TextView(n)).setId(View.generateViewId());
        (this.h = new TextView(n)).setId(View.generateViewId());
        this.i = new LinearLayout(n);
        (this.j = new ImageView(n)).setId(View.generateViewId());
    }
    
    public final void d(final gjp o) {
        this.o = o;
        final ArrayList d = this.d;
        final int size = d.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final ImageButton imageButton = (ImageButton)((FrameLayout)d.get(i)).getChildAt(0);
            if (this.e.get(o) == imageButton) {
                this.e(imageButton);
            }
            else {
                this.f(imageButton);
            }
        }
        final nns d2 = this.k.d;
        final int size2 = d2.size();
        int j = n;
        while (j < size2) {
            final gjn gjn = d2.get(j);
            ++j;
            if (gjn.a == o) {
                String text;
                if (gjn.e.isEmpty()) {
                    text = this.getResources().getString(gjn.c);
                }
                else {
                    text = gjn.e;
                }
                this.h.setText((CharSequence)text);
                String contentDescription;
                if (gjn.f.isEmpty()) {
                    contentDescription = this.getResources().getString(gjn.d);
                }
                else {
                    contentDescription = gjn.f;
                }
                this.h.setContentDescription((CharSequence)contentDescription);
                this.h.announceForAccessibility((CharSequence)contentDescription);
                break;
            }
        }
    }
    
    public final void e(final ImageButton imageButton) {
        if (!this.l) {
            imageButton.setBackground(this.n.getDrawable(2131231414));
            return;
        }
        imageButton.setSelected(true);
    }
    
    public final void f(final ImageButton imageButton) {
        if (!this.l) {
            imageButton.setBackground(this.n.getDrawable(2131231416));
            return;
        }
        imageButton.setSelected(false);
    }
}
