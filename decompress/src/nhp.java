// 
// Decompiled by Procyon v0.6.0
// 

final class nhp extends nhq
{
    static final nhq a;
    
    static {
        final nhp a2 = new nhp(new zb(0));
        if (!a2.b) {
            a2.b = true;
            a = a2;
            return;
        }
        throw new IllegalStateException("Already frozen");
    }
    
    private nhp(final zb zb) {
        super(zb);
    }
}
