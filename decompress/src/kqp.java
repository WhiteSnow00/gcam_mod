import java.util.Locale;
import java.util.Arrays;
import android.graphics.Rect;
import java.math.BigInteger;
import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqp
{
    public static final kqp a;
    public static final kqp b;
    public final int c;
    public final int d;
    
    static {
        a = h(4, 3);
        b = h(16, 9);
    }
    
    private kqp(final int c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    public static kqp e(final kre kre) {
        if (kre.k()) {
            return h(kre.a, kre.b);
        }
        return h(kre.b, kre.a);
    }
    
    public static kqp f(final Size size) {
        return h(size.getWidth(), size.getHeight());
    }
    
    public static kqp g(final kre kre) {
        return h(kre.a, kre.b);
    }
    
    public static kqp h(int n, final int n2) {
        final int intValue = BigInteger.valueOf(n).gcd(BigInteger.valueOf(n2)).intValue();
        int n3 = n;
        if (intValue != 0) {
            n3 = n / intValue;
        }
        n = n2;
        if (intValue != 0) {
            n = n2 / intValue;
        }
        return new kqp(n3, n);
    }
    
    private final boolean l() {
        return this.c <= this.d;
    }
    
    public final float a(final float n) {
        return n * this.d / this.c;
    }
    
    public final float b() {
        return this.c / (float)this.d;
    }
    
    public final Rect c(final Rect rect) {
        if (this.k(h(rect.width(), rect.height()))) {
            final int n = rect.width() * this.d / this.c;
            final int n2 = rect.top + (rect.height() - n) / 2;
            return new Rect(rect.left, n2, rect.left + rect.width(), n + n2);
        }
        final int n3 = rect.height() * this.c / this.d;
        final int n4 = rect.left + (rect.width() - n3) / 2;
        return new Rect(n4, rect.top, n3 + n4, rect.top + rect.height());
    }
    
    public final kqp d() {
        if (this.c >= this.d) {
            return this;
        }
        return this.i();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kqp)) {
            return false;
        }
        final kqp kqp = (kqp)o;
        return this.d == kqp.d && this.c == kqp.c;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.d });
    }
    
    public final kqp i() {
        return h(this.d, this.c);
    }
    
    public final boolean j(kqp kqp) {
        final float b = this.b();
        if (this.l()) {
            if (!kqp.l()) {
                kqp = kqp.i();
            }
        }
        else {
            kqp = kqp.d();
        }
        return Math.abs(b - kqp.b()) < 0.025;
    }
    
    public final boolean k(final kqp kqp) {
        return this.c * kqp.d > kqp.c * this.d;
    }
    
    @Override
    public final String toString() {
        return String.format(null, "AspectRatio[%d:%d]", this.c, this.d);
    }
}
