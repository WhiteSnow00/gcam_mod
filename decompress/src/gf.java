import java.util.Iterator;
import java.util.Collection;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class gf
{
    public final ViewGroup a;
    final ArrayList b;
    final ArrayList c;
    boolean d;
    
    public gf(final ViewGroup a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = false;
        this.a = a;
    }
    
    static gf b(final ViewGroup viewGroup, final fi fi) {
        fi.aa();
        return g(viewGroup);
    }
    
    public static void f(final ge ge) {
        a.i(ge.e, ge.a.O);
    }
    
    static gf g(final ViewGroup viewGroup) {
        final Object tag = viewGroup.getTag(2131427996);
        if (tag instanceof gf) {
            return (gf)tag;
        }
        final gf gf = new gf(viewGroup);
        viewGroup.setTag(2131427996, (Object)gf);
        return gf;
    }
    
    public final ge a(final ei ei) {
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final ge ge = (ge)b.get(i);
            if (ge.a.equals(ei) && !ge.c) {
                return ge;
            }
        }
        return null;
    }
    
    final void c() {
        final boolean t = ik.T((View)this.a);
        final ArrayList b = this.b;
        monitorenter(b);
        try {
            this.d();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((ge)iterator.next()).b();
            }
            for (final ge ge : new ArrayList(this.c)) {
                if (fi.R(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    String string;
                    if (t) {
                        string = "";
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append("Cancelling running operation ");
                    sb.append(ge);
                    sb.toString();
                }
                ge.d();
            }
            for (final ge ge2 : new ArrayList(this.b)) {
                if (fi.R(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    String string2;
                    if (t) {
                        string2 = "";
                    }
                    else {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.a);
                        sb4.append(" is not attached to window. ");
                        string2 = sb4.toString();
                    }
                    sb3.append(string2);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(ge2);
                    sb3.toString();
                }
                ge2.d();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void d() {
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final ge ge = (ge)b.get(i);
            if (ge.f == 2) {
                ge.f(a.g(ge.a.z().getVisibility()), 1);
            }
        }
    }
    
    public final void e(final int n, final int n2, final fo fo) {
        synchronized (this.b) {
            final aan aan = new aan();
            final ge a = this.a(fo.c);
            if (a != null) {
                a.f(n, n2);
                return;
            }
            final gc gc = new gc(n, n2, fo, aan);
            this.b.add(gc);
            gc.c(new gb(this, gc, 1));
            gc.c(new gb(this, gc));
        }
    }
}
