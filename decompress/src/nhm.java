import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class nhm extends nhf implements nhh
{
    static final nhg a;
    private final nhg b;
    
    static {
        a = new nhg();
    }
    
    public nhm() {
        super("", nhi.a.b());
        this.b = nhm.a;
    }
    
    @Override
    public final nhr d(final String s, final nhq nhq, final boolean b) {
        if (b) {
            final WeakHashMap a = nhz.a;
        }
        return new nhn(s, this, nhq, b);
    }
    
    @Override
    public final nhr f(final String s, final nhq nhq) {
        final WeakHashMap a = nhz.a;
        return this.d(s, nhq, true);
    }
}
