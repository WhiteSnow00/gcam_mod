// 
// Decompiled by Procyon v0.6.0
// 

public enum olo
{
    a("VOID", 0, (Class)Void.class), 
    b("INT", 1, (Class)Integer.class), 
    c("LONG", 2, (Class)Long.class), 
    d("FLOAT", 3, (Class)Float.class), 
    e("DOUBLE", 4, (Class)Double.class), 
    f("BOOLEAN", 5, (Class)Boolean.class), 
    g("STRING", 6, (Class)String.class), 
    h("BYTE_STRING", 7, (Class)ojw.class), 
    i("ENUM", 8, (Class)Integer.class), 
    j("MESSAGE", 9, (Class)Object.class);
    
    public final Class k;
    
    static {
        final ojw b2 = ojw.b;
    }
    
    private olo(final String s, final int n, final Class k) {
        this.k = k;
    }
}
