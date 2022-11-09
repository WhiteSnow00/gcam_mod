import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mal extends lyv
{
    private mal(final lyp lyp, final lwh lwh) {
        super(lyp, lwh);
    }
    
    public static mal b(final lyp lyp, final String s) {
        return c(lyp, 35632, s);
    }
    
    public static mal c(final lyp lyp, final int n, final String s) {
        return new mal(lyp, lyv.h(lyp, new mak(n, s)));
    }
    
    public static mal d(final lyp lyp, final String s) {
        return c(lyp, 35633, s);
    }
}
