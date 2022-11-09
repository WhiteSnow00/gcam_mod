import android.view.View$OnSystemUiVisibilityChangeListener;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyw implements hyt, exn, exj, exh, ewi
{
    public final Window a;
    public boolean b;
    public int c;
    public final View$OnSystemUiVisibilityChangeListener d;
    private int e;
    
    public hyw(final kjm kjm, final Window a) {
        this.b = false;
        this.c = 1797;
        this.e = 0;
        this.d = (View$OnSystemUiVisibilityChangeListener)new hyv(this);
        this.a = a;
        kjm.execute(new hyu(this, a));
    }
    
    @Override
    public final void C(final boolean b) {
        if (!this.b && b) {
            this.e();
        }
    }
    
    @Override
    public final void a(final int c) {
        this.c = c;
        this.e();
    }
    
    @Override
    public final void bi() {
        this.b = true;
    }
    
    @Override
    public final void bj() {
        this.b = false;
        this.e();
    }
    
    @Override
    public final void d(final int e) {
        this.e = e;
        this.e();
    }
    
    public final void e() {
        if (!this.b) {
            final int c = this.c;
            int e;
            if (c != 1797 && c != 1812) {
                e = 0;
            }
            else {
                e = this.e;
            }
            this.a.getDecorView().setSystemUiVisibility(e | this.c);
        }
    }
}
