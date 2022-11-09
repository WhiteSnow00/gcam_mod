import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mml
{
    static final mmm a;
    private final Random b;
    private final lmy c;
    private final mlw d;
    
    static {
        a = new mmj(pso.d, true);
    }
    
    public mml(final Random b, final mlw d, final lmy c) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    final mmm a(final pso pso) {
        final int c = psn.c(pso.c);
        final boolean b = true;
        boolean b2 = true;
        int n = c;
        if (c == 0) {
            n = 1;
        }
        switch (n - 1) {
            default: {
                return new mmj(pso, true);
            }
            case 4: {
                return new mmk(pso, this.b, this.d, this.c);
            }
            case 3: {
                if (this.b.nextFloat() * 1000.0f >= pso.b) {
                    b2 = false;
                }
                return new mmj(pso, b2);
            }
            case 1: {
                return new mmj(pso, pso.b == 1000L && b);
            }
        }
    }
}
