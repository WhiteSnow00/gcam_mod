import android.view.View;
import android.view.ViewParent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ia
{
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;
    
    public ia(final View d) {
        this.d = d;
    }
    
    private final ViewParent j(final int n) {
        switch (n) {
            default: {
                return this.c;
            }
            case 0: {
                return this.b;
            }
        }
    }
    
    private final void k(final int n, final ViewParent viewParent) {
        switch (n) {
            default: {
                this.c = viewParent;
                return;
            }
            case 0: {
                this.b = viewParent;
            }
        }
    }
    
    private final int[] l() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }
    
    public final void a(final boolean a) {
        if (this.a) {
            ik.P(this.d);
        }
        this.a = a;
    }
    
    public final void b(final int n) {
        final ViewParent j = this.j(n);
        if (j != null) {
            hg.t(j, this.d, n);
            this.k(n, null);
        }
    }
    
    public final boolean c(final float n, final float n2, final boolean b) {
        if (this.a) {
            final ViewParent b2 = this.b;
            if (b2 != null) {
                return hg.u(b2, this.d, n, n2, b);
            }
        }
        return false;
    }
    
    public final boolean d(final float n, final float n2) {
        if (this.a) {
            final ViewParent b = this.b;
            if (b != null) {
                return hg.v(b, this.d, n, n2);
            }
        }
        return false;
    }
    
    public final boolean e(int n, final int n2, final int[] array, final int[] array2, final int n3) {
        if (this.a) {
            final ViewParent j = this.j(n3);
            if (j == null) {
                return false;
            }
            if (n == 0) {
                if (n2 != 0) {
                    n = 0;
                }
                else {
                    if (array2 != null) {
                        array2[1] = (array2[0] = 0);
                        return false;
                    }
                    return false;
                }
            }
            int n4;
            int n5;
            if (array2 != null) {
                this.d.getLocationInWindow(array2);
                n4 = array2[0];
                n5 = array2[1];
            }
            else {
                n4 = 0;
                n5 = 0;
            }
            int[] l = array;
            if (array == null) {
                l = this.l();
            }
            l[1] = (l[0] = 0);
            hg.q(j, this.d, n, n2, l, n3);
            if (array2 != null) {
                this.d.getLocationInWindow(array2);
                array2[0] -= n4;
                array2[1] -= n5;
            }
            return l[0] != 0 || l[1] != 0;
        }
        return false;
    }
    
    public final boolean f(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.g(n, n2, n3, n4, array, 0, null);
    }
    
    public final boolean g(int n, int n2, int n3, final int n4, final int[] array, final int n5, int[] l) {
        if (this.a) {
            final ViewParent j = this.j(n5);
            if (j == null) {
                return false;
            }
            if (n == 0) {
                if (n2 == 0) {
                    if (n3 == 0) {
                        if (n4 != 0) {
                            n = 0;
                            n2 = 0;
                            n3 = 0;
                        }
                        else {
                            if (array != null) {
                                array[1] = (array[0] = 0);
                                return false;
                            }
                            return false;
                        }
                    }
                    else {
                        n = 0;
                        n2 = 0;
                    }
                }
                else {
                    n = 0;
                }
            }
            int n6;
            int n7;
            if (array != null) {
                this.d.getLocationInWindow(array);
                n6 = array[0];
                n7 = array[1];
            }
            else {
                n6 = 0;
                n7 = 0;
            }
            if (l == null) {
                l = this.l();
                l[1] = (l[0] = 0);
            }
            hg.r(j, this.d, n, n2, n3, n4, n5, l);
            if (array != null) {
                this.d.getLocationInWindow(array);
                array[0] -= n6;
                array[1] -= n7;
            }
            return true;
        }
        return false;
    }
    
    public final boolean h(final int n) {
        return this.j(n) != null;
    }
    
    public final boolean i(final int n, final int n2) {
        if (!this.h(n2)) {
            if (this.a) {
                ViewParent viewParent = this.d.getParent();
                View d = this.d;
                while (viewParent != null) {
                    if (hg.w(viewParent, d, this.d, n, n2)) {
                        this.k(n2, viewParent);
                        hg.s(viewParent, d, this.d, n, n2);
                        return true;
                    }
                    if (viewParent instanceof View) {
                        d = (View)viewParent;
                    }
                    viewParent = viewParent.getParent();
                }
            }
            return false;
        }
        return true;
    }
}
