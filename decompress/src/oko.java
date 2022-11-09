// 
// Decompiled by Procyon v0.6.0
// 

final class oko
{
    public static final okn a;
    private static final okn b;
    
    static {
        a = new okn();
        okn b2;
        try {
            b2 = (okn)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            b2 = null;
        }
        b = b2;
    }
    
    static okn a() {
        final okn b = oko.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
