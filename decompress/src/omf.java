// 
// Decompiled by Procyon v0.6.0
// 

final class omf
{
    public static final phn a;
    public static final phn b;
    
    static {
        phn a2;
        try {
            a2 = (phn)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            a2 = null;
        }
        a = a2;
        b = new phn();
    }
}
