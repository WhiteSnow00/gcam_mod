import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.ListIterator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isg extends BaseAdapter
{
    public final List a;
    protected int b;
    protected boolean c;
    private ise d;
    private int e;
    private int f;
    private boolean g;
    
    public isg() {
        this.a = new ArrayList();
        this.b = -1;
        this.e = -1;
        this.f = -1;
        this.g = true;
    }
    
    public isg(final Context context, final cxl cxl) {
        this();
        this.c = cxl.k(cxr.at);
        final List a = this.a;
        final cql a2 = cql.a;
        final String string = context.getString(2131952675);
        final String string2 = context.getString(2131952654);
        a.add(new isd(a2, string, 2131231539, string2, string2));
        if (cxl.k(cwv.Q)) {
            final List a3 = this.a;
            final cql b = cql.b;
            final String string3 = context.getString(2131952676);
            final String string4 = context.getString(2131952655);
            a3.add(new isd(b, string3, 2131231536, string4, string4));
        }
        if (cxl.k(cwv.R)) {
            final List a4 = this.a;
            final cql c = cql.c;
            final String string5 = context.getString(2131952674);
            final String string6 = context.getString(2131952653);
            a4.add(new isd(c, string5, 2131231535, string6, string6));
        }
        if (cxl.k(cwv.S)) {
            final List a5 = this.a;
            final cql d = cql.d;
            final String string7 = context.getString(2131952677);
            final String string8 = context.getString(2131952656);
            a5.add(new isd(d, string7, 2131231538, string8, string8));
        }
    }
    
    public isg(final Context context, final cxl cxl, final byte[] array) {
        this();
        this.c = cxl.k(cxr.at);
        final List a = this.a;
        final hip a2 = hip.a;
        final String string = context.getString(2131951893);
        final String string2 = context.getString(2131951892);
        a.add(new isd(a2, string, 2131231387, string2, string2));
        this.a.add(new isd(hip.b, context.getString(2131952194), 2131231490, context.getString(2131952187), context.getString(2131952192)));
    }
    
    public final isd a(final int n) {
        return this.a.get(n);
    }
    
    public final isd b() {
        return this.a.get(this.b);
    }
    
    public final void c(final ise d, final boolean g) {
        this.d = d;
        this.g = g;
    }
    
    final void d(final int b) {
        if (!this.a(b).f && this.g) {
            return;
        }
        this.b = b;
        final ise d = this.d;
        if (d != null) {
            d.a(this.b());
        }
        kjm.a();
        this.notifyDataSetChanged();
    }
    
    public final void e(final Object o) {
        final ListIterator listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            final isd isd = (isd)listIterator.next();
            isd.getClass();
            if (o.equals(isd.a)) {
                this.d(listIterator.previousIndex());
                break;
            }
        }
    }
    
    public final int getCount() {
        return this.a.size();
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(int c, View inflate, final ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        isf tag;
        if (inflate == null) {
            inflate = LayoutInflater.from(context).inflate(2131624020, (ViewGroup)null);
            tag = new isf(inflate, this.c);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (isf)inflate.getTag();
        }
        final isd a = this.a(c);
        if (tag != null) {
            if (tag.a != null) {
                if (this.c) {
                    if (this.e == -1) {
                        this.e = tag.c.getCurrentTextColor();
                    }
                    if (this.f == -1) {
                        this.f = tag.d.getCurrentTextColor();
                    }
                }
                if (this.b == c) {
                    final GradientDrawable background = (GradientDrawable)aah.a(context, 2131231618);
                    background.getClass();
                    if (this.c) {
                        background.setCornerRadius((float)context.getResources().getDimensionPixelSize(2131165828));
                        background.setTint(neu.c((View)viewGroup, 2130968883));
                        c = neu.c((View)viewGroup, 2130968857);
                        tag.e.setColorFilter(c);
                        tag.c.setTextColor(c);
                        tag.d.setTextColor(c);
                    }
                    else {
                        background.setCornerRadius((float)context.getResources().getDimensionPixelSize(2131165829));
                        background.setTint(context.getColor(2131101429));
                    }
                    tag.a.setBackground((Drawable)background);
                }
                else {
                    tag.a.setBackgroundColor(0);
                    if (this.c) {
                        tag.e.setColorFilter(this.e);
                        tag.c.setTextColor(this.e);
                        tag.d.setTextColor(this.f);
                    }
                }
            }
            tag.e.setImageResource(a.c);
            final ImageView f = tag.f;
            if (f != null) {
                f.setImageResource(a.c);
            }
            tag.c.setText((CharSequence)a.b);
            final TextView d = tag.d;
            if (d != null) {
                String text;
                if (a.f) {
                    text = a.d;
                }
                else {
                    text = a.e;
                }
                d.setText((CharSequence)text);
            }
            if (a.f) {
                tag.c.setAlpha(1.0f);
                tag.d.setAlpha(0.8f);
                tag.e.setAlpha(1.0f);
            }
            else {
                tag.c.setAlpha(0.3f);
                tag.d.setAlpha(0.3f);
                tag.e.setAlpha(0.3f);
            }
        }
        return inflate;
    }
}
