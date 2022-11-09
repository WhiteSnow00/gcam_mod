// 
// Decompiled by Procyon v0.6.0
// 

public final class aph
{
    public static final aqa a;
    private static apg b;
    
    static {
        a = new aqa();
        aph.b = null;
    }
    
    public static apf a() {
        return new apu();
    }
    
    public static apf b(final byte[] array) {
        return apv.a(array);
    }
    
    public static apf c(final String s) {
        return apv.a(s);
    }
    
    public static void d(final apf apf) {
        if (apf instanceof apu) {
            return;
        }
        throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
    }
    
    public static void e() {
        synchronized (aph.class) {
            if (aph.b == null) {
                try {
                    aph.b = new apg();
                }
                finally {
                    final Throwable t;
                    System.out.println(t);
                }
            }
        }
    }
}
