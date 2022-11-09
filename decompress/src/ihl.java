import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihl
{
    public ValueAnimator a;
    public ihn b;
    public ihn c;
    public final Object d;
    
    public ihl() {
        this.b = ihn.a;
        this.c = ihn.a;
        this.d = new Object();
    }
    
    public final void a(final ihn c) {
        synchronized (this.d) {
            this.c = c;
            if (this.b.equals(c)) {
                return;
            }
            this.a.start();
        }
    }
}
