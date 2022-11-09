import androidx.cardview.widget.CardView;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yl
{
    public Drawable a;
    public final /* synthetic */ CardView b;
    
    public yl(final CardView b) {
        this.b = b;
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4) {
        this.b.d.set(n, n2, n3, n4);
        final CardView b = this.b;
        CardView.a(b, n + b.c.left, n2 + this.b.c.top, n3 + this.b.c.right, n4 + this.b.c.bottom);
    }
    
    public final boolean b() {
        return this.b.b;
    }
    
    public final boolean c() {
        return this.b.a;
    }
}
