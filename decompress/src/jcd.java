import android.view.WindowManager$LayoutParams;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcd
{
    public int a;
    private final Window b;
    private final jbr c;
    
    public jcd(final Window b, final jbr c) {
        this.a = 0;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        nov.A(this.a > 0);
        final int a = this.a - 1;
        this.a = a;
        if (a == 0) {
            this.d(-1.0f);
        }
    }
    
    public final void b(final int n) {
        final float n2 = (Math.min(0.6693f / Math.max(0.667f, Math.min(n / this.c.a / 2.73949f, 1.0f)), 1.0f) - 0.6693f) * 3.0238888f;
        this.d((1.0f - n2) * 0.48f + n2 * 0.65f);
        ++this.a;
    }
    
    public final void c() {
        this.d(1.0f);
        ++this.a;
    }
    
    public final void d(final float screenBrightness) {
        final WindowManager$LayoutParams attributes = this.b.getAttributes();
        attributes.screenBrightness = screenBrightness;
        this.b.setAttributes(attributes);
    }
}
