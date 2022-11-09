import android.content.res.ColorStateList;
import android.graphics.Shader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gl
{
    public final Shader a;
    public int b;
    private final ColorStateList c;
    
    public gl(final Shader a, final ColorStateList c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public static gl a(final int n) {
        return new gl(null, null, n);
    }
    
    public final boolean b() {
        return this.a != null;
    }
    
    public final boolean c() {
        if (this.a == null) {
            final ColorStateList c = this.c;
            if (c != null && c.isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean d(final int[] array) {
        if (this.c()) {
            final ColorStateList c = this.c;
            final int colorForState = c.getColorForState(array, c.getDefaultColor());
            if (colorForState != this.b) {
                this.b = colorForState;
                return true;
            }
        }
        return false;
    }
    
    public final boolean e() {
        return this.b() || this.b != 0;
    }
}
