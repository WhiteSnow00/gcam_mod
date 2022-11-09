import com.google.android.apps.camera.toast.EducationToastView;
import j$.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.apps.camera.toast.ToastView;
import java.util.Date;
import android.view.View;
import j$.time.Duration;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iev implements efl
{
    public final ViewGroup a;
    public final String b;
    public final String c;
    public final Runnable d;
    public final Runnable e;
    public Runnable f;
    private final Duration g;
    private final View h;
    private final int i;
    private final boolean j;
    private final gjj k;
    private final eyt l;
    private Date m;
    private ToastView n;
    private final int o;
    
    public iev(final Duration g, final ViewGroup a, final View h, final String b, final String c, final Runnable d, final Runnable e, final int o, final boolean j, final gjj k, final eyt l) {
        this.g = g;
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.i = 0;
        this.d = d;
        this.e = e;
        this.o = o;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    private static void r(final ToastView toastView, final View view) {
        final FrameLayout frameLayout = (FrameLayout)toastView.findViewById(2131428072);
        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)frameLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.removeAllViewsInLayout();
        frameLayout.addView(view);
    }
    
    @Override
    public final int a() {
        return (int)(this.g.toMillis() + ToastView.d.toMillis() + ToastView.e.toMillis());
    }
    
    @Override
    public final efo b() {
        efo efo;
        if (this.j) {
            efo = efo.e;
        }
        else {
            efo = efo.d;
        }
        return efo;
    }
    
    @Override
    public final Date e() {
        return this.m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof iev)) {
            return false;
        }
        final iev iev = (iev)o;
        final int i = iev.i;
        return this.j == iev.j && Objects.equals((Object)this.g, (Object)iev.g) && Objects.equals((Object)this.a, (Object)iev.a) && Objects.equals((Object)this.b, (Object)iev.b) && Objects.equals((Object)this.c, (Object)iev.c) && this.o == iev.o;
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
        final ToastView n = this.n;
        final Runnable i = n.i;
        if (i != null) {
            n.removeCallbacks(i);
        }
        n.setAlpha(0.0f);
        n.m.dismiss();
        final ViewGroup viewGroup = (ViewGroup)n.getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView((View)n);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.g, this.a, this.b, this.c, 0, this.o, this.j });
    }
    
    @Override
    public final void i(final Date m) {
        this.m = m;
    }
    
    @Override
    public final void j() {
        if (!this.j) {
            final ToastView e = ToastView.e(this);
            this.n = e;
            final View h = this.h;
            if (h != null) {
                r(e, h);
            }
            this.n.g();
            return;
        }
        final View h2 = this.h;
        if (h2 != null) {
            r(this.n = EducationToastView.a(this), h2);
            this.n.g();
            return;
        }
        if (this.k.A()) {
            this.f.run();
            return;
        }
        this.k.e(new ies(this));
        (this.n = EducationToastView.a(this)).g();
        this.l.ao();
    }
    
    @Override
    public final boolean m() {
        return false;
    }
    
    @Override
    public final int p() {
        return this.o;
    }
}
