import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

final class loy
{
    private final Deque a;
    private double b;
    private double c;
    private double d;
    private double e;
    private lox f;
    private lox g;
    
    public loy() {
        this.a = new ArrayDeque();
    }
    
    final void a(final double n) {
        synchronized (this) {
            final lox f = this.f;
            if (f != null && n > this.d) {
                f.a(n);
            }
            final Double n2 = this.a.peekLast();
            if (n2 != null) {
                final double n3 = Math.abs(n - n2) / n2;
                final lox g = this.g;
                if (g != null && n3 > this.e) {
                    g.a(n3);
                }
            }
            if (this.a.size() > 120) {
                final double doubleValue = this.a.remove();
                this.b -= doubleValue;
                this.c -= doubleValue * doubleValue;
            }
            this.b += n;
            this.c += n * n;
            this.a.add(n);
        }
    }
    
    final void b(final double d, final lox f) {
        synchronized (this) {
            this.d = d;
            this.f = f;
        }
    }
    
    final void c(final lox g) {
        synchronized (this) {
            this.e = 0.25;
            this.g = g;
        }
    }
}
