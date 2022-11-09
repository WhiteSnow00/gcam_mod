import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nby
{
    public static final nby a;
    
    static {
        a = new nby();
    }
    
    private nby() {
    }
    
    public static final double a(double n) {
        final double n2 = 0.99;
        if (n < 0.0) {
            n = 0.0;
        }
        else {
            if (n <= 0.99) {
                return n;
            }
            n = n2;
        }
        return n;
    }
    
    public static final double b(final long n) {
        final double n2 = (double)n;
        if (n2 < 0.1) {
            return 0.1;
        }
        return n2;
    }
    
    public static final double c(final myc myc, final mxe mxe, final long n) {
        myc.getClass();
        mxe.getClass();
        return e(myc, n, new nbw(mxe));
    }
    
    public static final double d(final myc myc, final List list, final long n) {
        myc.getClass();
        list.getClass();
        return e(myc, n, new nbx(list));
    }
    
    private static final double e(final myc myc, final long n, final pky pky) {
        final double b = b(myc.f);
        final double n2 = myc.r.f * b;
        final double doubleValue = ((Number)pky.a(n2)).doubleValue();
        final double n3 = (double)n;
        Double.isNaN(n3);
        return a((n2 - doubleValue + n3) / b);
    }
}
