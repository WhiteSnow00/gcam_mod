import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nex implements ney
{
    private final ney a;
    private final float b;
    
    public nex(float b, ney a) {
        while (a instanceof nex) {
            a = ((nex)a).a;
            b += ((nex)a).b;
        }
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final float a(final RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nex)) {
            return false;
        }
        final nex nex = (nex)o;
        return this.a.equals(nex.a) && this.b == nex.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
