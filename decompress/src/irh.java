import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import android.app.Activity;
import j$.util.Objects;
import com.google.android.apps.camera.ui.notificationchip.NotificationChipView;
import java.util.Date;
import android.view.View$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irh implements irf
{
    private final int a;
    private final boolean b;
    private final Context c;
    private final boolean d;
    private final boolean e;
    private final View$OnClickListener f;
    private final ire g;
    private Date h;
    private NotificationChipView i;
    private Date j;
    private String k;
    private final int l;
    
    public irh(final Context c, final String k, final int a, final int l, final boolean b, final ire g, final boolean d, final boolean e) {
        this.c = c;
        this.k = k;
        this.a = a;
        this.l = l;
        this.b = b;
        this.f = null;
        this.g = g;
        this.d = d;
        if (!(this.e = e)) {
            c.getDrawable(2131231395).setTint(c.getColor(2131101025));
            c.getDrawable(2131231396).setTint(c.getColor(2131101025));
        }
    }
    
    @Override
    public final int a() {
        return this.a + 500;
    }
    
    @Override
    public final efo b() {
        return efo.a;
    }
    
    @Override
    public final Date e() {
        return this.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof irh)) {
            return false;
        }
        final irh irh = (irh)o;
        if (this.a == irh.a && this.b == irh.b && this.l == irh.l && Objects.equals((Object)this.k, (Object)irh.k)) {
            final View$OnClickListener f = irh.f;
            if (Objects.equals((Object)null, (Object)null) && Objects.equals((Object)this.g, (Object)irh.g) && this.h.getTime() == irh.h.getTime()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void f(final Runnable runnable) {
        final String value = String.valueOf(this.getClass().getName());
        String concat;
        if (value.length() != 0) {
            concat = "Unsupported Operation delayedHide(Runnable) in: ".concat(value);
        }
        else {
            concat = new String("Unsupported Operation delayedHide(Runnable) in: ");
        }
        throw new UnsupportedOperationException(concat);
    }
    
    @Override
    public final void g() {
        final NotificationChipView i = this.i;
        i.b.a.end();
        i.setVisibility(8);
        if (!i.d) {
            i.a();
        }
        final ire e = i.e;
        if (e != null) {
            e.a(new Date().getTime() - i.f);
        }
    }
    
    @Override
    public final void h() {
        this.i.a();
        final NotificationChipView i = this.i;
        if (i.b.b.isRunning()) {
            i.b.b.reverse();
        }
        this.i.c(this.a);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.l, this.b, this.k, null, this.g, this.h });
    }
    
    @Override
    public final void i(final Date j) {
        this.j = j;
    }
    
    @Override
    public final void j() {
        this.h = new Date();
        final NotificationChipView i = (NotificationChipView)((Activity)this.c).findViewById(2131427810);
        this.i = i;
        final String k = this.k;
        final int a = this.a;
        final boolean b = this.b;
        final ire g = this.g;
        i.c = a;
        i.d = b;
        i.e = g;
        i.setText((CharSequence)k);
        i.setOnClickListener((View$OnClickListener)null);
        i.g = new irj(i);
        ((ViewGroup)i.getParent()).addOnLayoutChangeListener((View$OnLayoutChangeListener)new iri(i));
        final jbp b2 = jbp.b(200, (Interpolator)new LinearInterpolator());
        b2.c(i, "alpha", 0.0f, 1.0f);
        b2.a = 200;
        b2.c(i, "scaleX", 0.5f, 1.0f);
        b2.c(i, "scaleY", 0.5f, 1.0f);
        i.b.a = b2.a();
        final jbp b3 = jbp.b(500, (Interpolator)new LinearInterpolator());
        b3.c(i, "alpha", 1.0f, 0.0f);
        i.b.b = b3.a();
        if (!this.e) {
            this.i.setTextColor(this.c.getColor(2131101026));
            this.i.setTypeface((Typeface)null);
        }
        final NotificationChipView j = this.i;
        Drawable background;
        if (j.getLineCount() > 1) {
            background = j.a.getDrawable(2131231396);
        }
        else {
            background = j.a.getDrawable(2131231395);
        }
        j.setBackground(background);
        j.setPaddingRelative(j.a.getResources().getDimensionPixelSize(2131166073), j.a.getResources().getDimensionPixelSize(2131166075), j.a.getResources().getDimensionPixelSize(2131166074), j.a.getResources().getDimensionPixelSize(2131166072));
        j.b();
        j.b.a.start();
        j.setVisibility(0);
        j.sendAccessibilityEvent(32768);
        if (!j.d) {
            j.c(j.c);
        }
        j.f = new Date().getTime();
    }
    
    @Override
    public final boolean l() {
        return this.d;
    }
    
    @Override
    public final boolean m() {
        return this.b;
    }
    
    @Override
    public final int p() {
        return this.l;
    }
    
    @Override
    public final Date r() {
        return this.h;
    }
    
    @Override
    public final void s(final String s) {
        this.k = s;
        final NotificationChipView i = this.i;
        if (i != null) {
            i.setText((CharSequence)s);
        }
    }
}
