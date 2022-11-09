// 
// Decompiled by Procyon v0.6.0
// 

final class omb
{
    private static final omh b;
    public final omh a;
    
    static {
        b = new olz();
    }
    
    public omb() {
        final olz a = olz.a;
        omh b;
        try {
            b = (omh)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final Exception ex) {
            b = omb.b;
        }
        final oma a2 = new oma(new omh[] { a, b });
        olk.i(a2, "messageInfoFactory");
        this.a = a2;
    }
    
    public static boolean a(final omg omg) {
        return omg.c() == 1;
    }
}
