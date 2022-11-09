import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class rr extends sg
{
    private rp c;
    private rp d;
    
    public static final int e(final View view, final rp rp) {
        return rp.d(view) + rp.b(view) / 2 - (rp.j() + rp.k() / 2);
    }
    
    private static final View g(final se se, final rp rp) {
        final int ah = se.ah();
        View view = null;
        if (ah == 0) {
            return null;
        }
        final int j = rp.j();
        final int n = rp.k() / 2;
        int n2 = Integer.MAX_VALUE;
        int n3;
        for (int i = 0; i < ah; ++i, n2 = n3) {
            final View at = se.at(i);
            final int abs = Math.abs(rp.d(at) + rp.b(at) / 2 - (j + n));
            if (abs < n2) {
                n3 = abs;
            }
            else {
                n3 = n2;
            }
            if (abs < n2) {
                view = at;
            }
        }
        return view;
    }
    
    public final rp a(final se se) {
        final rp d = this.d;
        if (d == null || d.a != se) {
            this.d = rp.p(se);
        }
        return this.d;
    }
    
    public final rp b(final se se) {
        final rp c = this.c;
        if (c == null || c.a != se) {
            this.c = rp.r(se);
        }
        return this.c;
    }
    
    @Override
    public View c(final se se) {
        if (se.U()) {
            return g(se, this.b(se));
        }
        if (se.T()) {
            return g(se, this.a(se));
        }
        return null;
    }
    
    @Override
    public final int[] d(final se se, final View view) {
        final int[] array = new int[2];
        if (se.T()) {
            array[0] = e(view, this.a(se));
        }
        else {
            array[0] = 0;
        }
        if (se.U()) {
            array[1] = e(view, this.b(se));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
}
