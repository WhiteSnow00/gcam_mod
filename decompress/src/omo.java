// 
// Decompiled by Procyon v0.6.0
// 

final class omo
{
    public static final pip a;
    public static final pip b;
    
    static {
        pip a2;
        try {
            a2 = (pip)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            a2 = null;
        }
        a = a2;
        b = new pip();
    }
}
