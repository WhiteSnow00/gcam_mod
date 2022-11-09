import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class nhn extends nhf implements nhh
{
    private final Exception a;
    private final boolean b;
    
    public nhn(final String s, final nhh nhh, final nhq nhq, final boolean b) {
        super(s, nhh);
        njo.d(nhq.b);
        this.a = nhh.e();
        this.b = b;
    }
    
    public nhn(final String s, final nhq nhq, final boolean b) {
        super(s, nhi.a.b());
        njo.d(nhq.b);
        this.a = nhm.a;
        this.b = b;
    }
    
    @Override
    public final nhr d(final String s, final nhq nhq, final boolean b) {
        if (b && !this.b) {
            final WeakHashMap a = nhz.a;
        }
        final boolean b2 = true;
        boolean b3;
        if (b && !this.b) {
            b3 = b2;
        }
        else {
            b3 = (this.b && b2);
        }
        return new nhn(s, this, nhq, b3);
    }
    
    @Override
    public final Exception e() {
        return this.a;
    }
    
    @Override
    public final nhr f(final String s, final nhq nhq) {
        return this.d(s, nhq, true);
    }
}
