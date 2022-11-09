import java.util.Arrays;
import android.util.Size;
import android.graphics.Rect;
import android.graphics.Point;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kre implements Serializable
{
    public final int a;
    public final int b;
    private volatile kre c;
    
    public kre(final int a, final int b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    private kre(final int a, final int b, final kre c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static kre f(final Point point) {
        return new kre(point.x, point.y);
    }
    
    public static kre g(final Rect rect) {
        return new kre(rect.width(), rect.height());
    }
    
    public static kre h(final int n, final int n2) {
        return new kre(n, n2);
    }
    
    public final float a() {
        return this.a / (float)this.b;
    }
    
    public final long b() {
        return this.a * (long)this.b;
    }
    
    public final Size c() {
        return new Size(this.a, this.b);
    }
    
    public final kre d() {
        if (this.k()) {
            return this;
        }
        return this.j();
    }
    
    public final kre e() {
        if (this.b >= this.a) {
            return this;
        }
        return this.j();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final kre kre = (kre)o;
            return this.a == kre.a && this.b == kre.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final kre i(final kra kra) {
        final kra a = kra.a;
        switch (kra.ordinal()) {
            default: {
                return this;
            }
            case 1:
            case 3: {
                return this.j();
            }
        }
    }
    
    public final kre j() {
        kre c;
        if ((c = this.c) == null) {
            c = new kre(this.b, this.a, this);
            this.c = c;
        }
        return c;
    }
    
    public final boolean k() {
        return this.a >= this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(23);
        sb.append(a);
        sb.append("x");
        sb.append(b);
        return sb.toString();
    }
}
